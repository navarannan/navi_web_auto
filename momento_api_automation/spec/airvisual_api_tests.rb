require 'rest-client'
require 'json'
require 'jsonpath'
require 'rspec'
require 'date'
require_relative '../spec/support/airvisual_api'


describe "api tests for AirVisual" do

  it 'should return 403 if no auth token, 200 if correct provided' do
    resp_code = AirVisual.verify_api_authorization
    puts resp_code
    expect resp_code.to eq("200")
  end

end

