Given(/^I navigate to home page of Cotton On Website$/) do
  visit(HomePage)
end

And(/^I search for "([^"]*)" on the home page search box$/) do |arg|
  on(HomePage) do |page|
    page.search_fld = arg
    @browser.send_keys :enter
  end
end


And(/^I add any Jeans to the cart$/) do
  on(SearchResultsPage) do |page|
    page.product_link
  end
  on(ProductsDescriptionPage) do |page|
    page.size
    page.add_to_bag
    sleep 5
    @browser.execute_script("document.getElementsByClassName('mini-cart-link')[1].click();")
    sleep 5
  end
  on(MyBagPage) do |page|
    page.checkout_now_elements[2].click
    sleep 5
  end
end

And(/^I place a click and collect order as user "([^"]*)"$/) do |arg|
  @person = Personas.get_persona arg
  on(CheckoutPage) do |page|
    page.email_add = @person['email_info']['email_address']
    page.first_name = @person['fullname']['fname']
    page.last_name = @person['fullname']['lname']
    page.phone = @person['phone']
    page.clickncollect_element.click
    page.clickncollect_element.click
    page.find_store = 3030
    page.store_search_btn
    page.select_store_element.click
    @browser.execute_script("document.querySelectorAll('a.try-full-form')[1].click();")
    Watir::Wait.until(timeout: 30) {@browser.execute_script('return jQuery.active == 0')}
    sleep 5
    page.fname_payment = @person['fullname']['fname']
    page.lname_payment = @person['fullname']['lname']
    page.payment_country = @person['country_value']
    page.billing_address1_element.set(@person['house']['address1'])
    page.billing_city_element.set(@person['house']['city'])
    page.billing_postcode_element.set(@person['house']['postcode'])
    page.cc_state_abb = @person['house']['state_abb']
    page.place_order_btn
    sleep 10
  end
end