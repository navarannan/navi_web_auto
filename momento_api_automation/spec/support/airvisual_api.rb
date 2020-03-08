require 'rest-client'
require 'json'
require 'date'
require_relative '../../spec/support/Api_Params'

module AirVisual

  # @url = "api.airvisual.com/v2/"
  # @api_key = "89ebc6f3-a877-4207-9528-51b1bf33bb5e"

  @url = ApiParams.get_url
  @api_key = ApiParams.get_api_token
  @country = ApiParams.get_country
  @latitude = ApiParams.get_latitude
  @longitude = ApiParams.get_longitude


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

  def get_supported_states
    get_rest_url = "#{@url}" + "states?country=" + "#{@country}" + "&key=" + "#{@api_key}"
    resp = RestClient.get(get_rest_url)
    return JSON.parse(resp)
  end

  def get_nearest_city_data
    get_rest_url = "#{@url}" + "nearest_city?key=" + "#{@api_key}"
    resp = RestClient.get(get_rest_url)
    return JSON.parse(resp)

  end

  def get_nearest_city_data_by_coordinates
    get_rest_url = "#{@url}" + "nearest_city?lat=" + "#{@latitude}" + "&lon=" + "#{@longitude}" + "&key=" + "#{@api_key}"
    resp = RestClient.get(get_rest_url)
    return JSON.parse(resp)

  end

end