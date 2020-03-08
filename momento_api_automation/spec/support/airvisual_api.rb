require 'rest-client'
require 'json'
require 'date'

module AirVisual

  @url = "api.airvisual.com/v2/"
  @api_key = "89ebc6f3-a877-4207-9528-51b1bf33bb5e"

  # @header_full_auth = {:authorization=> "Basic YXBwOjExMTE=", :accept => "application/json",:content_type => "application/json"}
  # @header_basic_auth = {:authorization=> "Basic YXBwOjExMTE="}
  # @random_no = Time.now.nsec.to_s
  # @loyalty_email = "cottononqa" + "#{@random_no}" + "@gmail.com"
  # @different_email = "cottonon" + "#{@random_no}" + "@gmail.com"
  # @dob = 20.years.ago(Date.today).strftime("%m-%d-%Y")


  def verify_successful_api_authorization
    get_rest_url = "#{@url}" + "countries?key=" + "#{@api_key}"
    resp = RestClient.get(get_rest_url)
    return resp.code
  end

  def verify_unsuccessful_api_authorization
    get_rest_url = "#{@url}" + "countries"
    begin
      RestClient.get(get_rest_url)
    rescue => e
      return e.response.code
    end
  end

end