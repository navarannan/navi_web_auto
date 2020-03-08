Given(/^I navigate to home page of Cotton On Website$/) do
  visit(HomePage)
end

And(/^I search for "([^"]*)" on the home page search box$/) do |arg|

  on(HomePage) do |page|
    # page.wait_for_ajax
    page.search_fld = arg
    @browser.send_keys :enter
    # page.wait_for_ajax
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

And(/^I place a home delivery order as user "([^"]*)"$/) do |arg|
  @person = Personas.get_persona arg
  on(CheckoutPage) do |page|
    # page.enter_email @person['email_info']['email_address']
    # page.enter_first_name @person['fullname']['fname']
    # page.enter_last_name @person['fullname']['lname']
    # page.enter_phone_number @person['phone']
    # page.enter_hd_first_name @person['fullname']['fname']
    # page.enter_hd_last_name @person['fullname']['lname']
    # page.enter_hd_country @person['country_value']
    # page.click_full_form_hd
    # page.enter_hd_delivery_address @person["#{@data['address']}"]['address1'], @person["#{@data['address']}"]['city'], @person["#{@data['address']}"]['state_abb'],  @person["#{@data['address']}"]['postcode']
    # page.select_auth_to_leave 'Leave out of the weather'


    page.email_add = @person['email_info']['email_address']
    page.first_name = @person['fullname']['fname']
    page.last_name = @person['fullname']['lname']
    page.phone = @person['phone']
    # page.hd_first_name = @person['fullname']['fname']
    # page.hd_last_name = @person['fullname']['lname']
    # page.hd_country = @person['country_value']
    # page.full_form_hd
    # sleep 2
    # page.homdel_address1 = @person["#{@data['address']}"]['address1']
    # page.homedel_city = @person["#{@data['address']}"]['city']
    # page.homedel_state = @person["#{@data['address']}"]['postcode']
    # page.homedel_state = @person["#{@data['address']}"]['state_abb']
    # page.homedel_postcode = @person["#{@data['address']}"]['postcode']

    page.clickncollect_element.click
    page.clickncollect_element.click
    # page.enter_first_name @person['fullname']['fname']
    # page.enter_last_name @person['fullname']['lname']
    # page.enter_phone_number @person['phone']
    page.find_store = 3030
    page.store_search_btn
    page.select_store_element.click
    @browser.execute_script("document.querySelectorAll('a.try-full-form')[1].click();")
    Watir::Wait.until(timeout: 30) {@browser.execute_script('return jQuery.active == 0')}

    sleep 5

    page.fname_payment = @person['fullname']['fname']
    page.lname_payment = @person['fullname']['lname']
    page.payment_country = @person['country_value']

    sleep 10


    # text_field(:fname_payment, :id => 'dwfrm_checkout_deliveryAndPayment_payment_addressFields_firstName')
    # text_field(:lname_payment, :id => 'dwfrm_checkout_deliveryAndPayment_payment_addressFields_lastName')
    # select_list(:payment_country, :id => 'dwfrm_checkout_deliveryAndPayment_payment_addressFields_country')

    # page.enter_billing_info_guest @person['fullname']['fname'], @person['fullname']['lname'], @person['country_value']

    page.billing_address1_element.set(@person['house']['address1'])
    page.billing_city_element.set(@person['house']['city'])
    page.billing_postcode_element.set(@person['house']['postcode'])
    # page.cc_state_abb_element.set(@person['house']['state_abb'])
    page.cc_state_abb = @person['house']['state_abb']
    page.place_order_btn
    sleep 20

    # wait_and_set_text billing_address1_element, bill_add1
    # wait_and_set_text billing_city_element, bill_city
    # wait_and_set_text billing_postcode_element, bill_pc
    # wait_and_select_option cc_state_abb_element, cc_state
    #
    #
    # text_field(:billing_address1, :id => 'dwfrm_checkout_deliveryAndPayment_payment_addressFields_address1')
    # text_field(:billing_city, :id => 'dwfrm_checkout_deliveryAndPayment_payment_addressFields_city')
    # text_field(:billing_postcode, :id => 'dwfrm_checkout_deliveryAndPayment_payment_addressFields_postalCode')
    #
      #
    # page.find_my_store @person['store_postcode']
    # page.store_search_button
    # page.click_store @person['store_id']



      # text_field(:email_add, :id => 'dwfrm_login_username')
    # text_field(:first_name, :id => 'dwfrm_checkout_deliveryAndPayment_contactDetailFields_contactDetailsFirstName')
    # text_field(:last_name, :id => 'dwfrm_checkout_deliveryAndPayment_contactDetailFields_contactDetailsLastName')
    # text_field(:phone, :id => 'dwfrm_checkout_deliveryAndPayment_contactDetailFields_contactDetailsPhone')
    # text_field(:hd_phone, :id => 'dwfrm_checkout_deliveryAndPayment_delivery_addressFields_phone')
    #
    # text_field(:fname_payment, :id => 'dwfrm_checkout_deliveryAndPayment_payment_addressFields_firstName')
    # text_field(:lname_payment, :id => 'dwfrm_checkout_deliveryAndPayment_payment_addressFields_lastName')
    # select_list(:payment_country, :id => 'dwfrm_checkout_deliveryAndPayment_payment_addressFields_country')
    # text_field(:payment_phone, :id => 'dwfrm_checkout_deliveryAndPayment_payment_addressFields_phone')
    # text_field(:billing_address1, :id => 'dwfrm_checkout_deliveryAndPayment_payment_addressFields_address1')
    # text_field(:billing_city, :id => 'dwfrm_checkout_deliveryAndPayment_payment_addressFields_city')
    # text_field(:billing_postcode, :id => 'dwfrm_checkout_deliveryAndPayment_payment_addressFields_postalCode')

  end
end