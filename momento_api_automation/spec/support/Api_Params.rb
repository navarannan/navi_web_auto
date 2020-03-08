require 'yaml'
require 'cucumber'


@@api_params_yml = YAML::load_file(File.join(__dir__, 'data/Api_Params.yml'))


class ApiParams

  def self.get_url
    return @@api_params_yml['ApiParams']['url']
  end

  def self.get_api_token
    return @@api_params_yml['ApiParams']['api_key']
  end

  def self.get_country
    return @@api_params_yml['ApiParams']['country']
  end

  def self.get_latitude
    return @@api_params_yml['ApiParams']['latitude']
  end

  def self.get_longitude
    return @@api_params_yml['ApiParams']['longitude']
  end
end