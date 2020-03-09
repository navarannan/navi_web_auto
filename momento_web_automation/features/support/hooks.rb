require 'watir'

Before do |scenario|
  DataMagic.load_for_scenario(scenario)
  @browser = Watir::Browser.new :chrome
  @browser.cookies.clear
  @browser.driver.manage.window.maximize
  PageObject.default_element_wait=(30)
  PageObject.javascript_framework = :jquery

end


# After do
#   @browser.close
# end

After do |scenario|
  # @browser.execute_script("javascript:localStorage.clear();")
  @browser.cookies.clear
  if (scenario.passed?)
    puts 'Scenario Passed !'
  else
    puts 'Scenario Failed !'
    # take_screenshot(scenario)
  end
end

at_exit do
  @browser.close
end

