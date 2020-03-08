require 'rest-client'
require 'json'
require 'jsonpath'
require 'rspec'
require 'date'
require_relative '../spec/support/spec_helper'


describe "api tests for AirVisual" do

  it 'should return 200 auth token is provided' do
    resp_code = AirVisual.verify_successful_api_authorization
    puts resp_code
    expect(resp_code.to_i).to eql(200)
  end

  it 'should return 403 if no auth token is provided' do
    resp_code = AirVisual.verify_unsuccessful_api_authorization
    puts resp_code
    expect(resp_code.to_i).to eql(403)
  end

end

