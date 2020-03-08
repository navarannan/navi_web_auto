require 'rest-client'
require 'json'
require 'jsonpath'
require 'rspec'
require 'date'
require_relative '../spec/support/spec_helper'


describe "api tests for AirVisual" do

  it 'should return 200 auth token is provided' do
    resp_code = AirVisual.verify_successful_api_authorization
    expect(resp_code.to_i).to eql(200)
  end

  it 'should return 403 if no auth token is provided' do
    resp_code = AirVisual.verify_unsuccessful_api_authorization
    expect(resp_code.to_i).to eql(403)
  end

  it 'should return all supported states for Australia' do
    expected_states = ["New South Wales", "Queensland", "South Australia", "Tasmania", "Victoria", "Western Australia"]
    json_obj = AirVisual.get_supported_states
    path = JsonPath.new('$.data..state')
    expect(path.on(json_obj).sort).to eq expected_states.sort
  end

  it 'print nearest city data' do
    json_obj = AirVisual.get_nearest_city_data
    actual_path = JsonPath.new('$')
    actual_path.on(json_obj)
    puts actual_path.on(json_obj).inspect
  end

  it 'should validate temperature from nearest city using latitude and longitude' do

    expected_city_data = <<-HERE_DOC
{
    "status": "success",
    "data": {
        "city": "McKinnon",
        "state": "Victoria",
        "country": "Australia",
        "location": {
            "type": "Point",
            "coordinates": [
                145.053772,
                -37.906097
            ]
        },
        "current": {
            "weather": {
                "ts": "2020-03-08T16:00:00.000Z",
                "tp": 12,
                "pr": 1021,
                "hu": 81,
                "ws": 3.1,
                "wd": 180,
                "ic": "03n"
            },
            "pollution": {
                "ts": "2020-03-08T16:00:00.000Z",
                "aqius": 0,
                "mainus": "p2",
                "aqicn": 0,
                "maincn": "p2"
            }
        }
    }
}
    HERE_DOC

    expected_path = JsonPath.new('$')
    expected_path.on(expected_city_data)

    json_obj = AirVisual.get_nearest_city_data_by_coordinates
    path = JsonPath.new('$')
    path.on(json_obj)

    expect(expected_path.on(expected_city_data).inspect).to match(path.on(json_obj).inspect)

  end
end

