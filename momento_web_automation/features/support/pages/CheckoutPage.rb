class CheckoutPage
  include PageObject


  text_field(:email_add, :id => 'dwfrm_login_username')
  text_field(:first_name, :id => 'dwfrm_checkout_deliveryAndPayment_contactDetailFields_contactDetailsFirstName')
  text_field(:last_name, :id => 'dwfrm_checkout_deliveryAndPayment_contactDetailFields_contactDetailsLastName')
  text_field(:phone, :id => 'dwfrm_checkout_deliveryAndPayment_contactDetailFields_contactDetailsPhone')
  text_field(:hd_phone, :id => 'dwfrm_checkout_deliveryAndPayment_delivery_addressFields_phone')

  text_field(:hd_first_name, :id => 'dwfrm_checkout_deliveryAndPayment_delivery_addressFields_firstName')
  text_field(:hd_last_name, :id => 'dwfrm_checkout_deliveryAndPayment_delivery_addressFields_lastName')
  select_list(:hd_country, :id => 'dwfrm_checkout_deliveryAndPayment_delivery_addressFields_country')
  text_field(:homdel_address1, :id => 'dwfrm_checkout_deliveryAndPayment_delivery_addressFields_address1')
  text_field(:homedel_city, :id => 'dwfrm_checkout_deliveryAndPayment_delivery_addressFields_city')
  select_list(:homedel_state_abb, :id => 'dwfrm_checkout_deliveryAndPayment_delivery_addressFields_states_state')
  text_field(:homedel_state, :id => 'dwfrm_checkout_deliveryAndPayment_delivery_addressFields_states_state')
  text_field(:homedel_postcode, :id => 'dwfrm_checkout_deliveryAndPayment_delivery_addressFields_postalCode')

  link(:full_form_hd, :css => 'a.try-full-form')


  text_field(:find_store, :id => 'dwfrm_storelocator_textfield')
  button(:store_search_btn, :class => 'store-search-button')

  label(:select_store, :class => 'label-store', :index => 1)
  label(:clickncollect, :for => 'is-CLICK_AND_COLLECT')

  text_field(:billing_address1, :id => 'dwfrm_checkout_deliveryAndPayment_payment_addressFields_address1')
  text_field(:billing_city, :id => 'dwfrm_checkout_deliveryAndPayment_payment_addressFields_city')
  text_field(:billing_postcode, :id => 'dwfrm_checkout_deliveryAndPayment_payment_addressFields_postalCode')

  text_field(:fname_payment, :id => 'dwfrm_checkout_deliveryAndPayment_payment_addressFields_firstName')
  text_field(:lname_payment, :id => 'dwfrm_checkout_deliveryAndPayment_payment_addressFields_lastName')
  select_list(:payment_country, :id => 'dwfrm_checkout_deliveryAndPayment_payment_addressFields_country')
  # text_field(:payment_phone, :id => 'dwfrm_checkout_deliveryAndPayment_payment_addressFields_phone')
  button(:place_order_btn, :css => '.button.create-order')
  select_list(:cc_state_abb, :id => 'dwfrm_checkout_deliveryAndPayment_payment_addressFields_states_state')
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

end