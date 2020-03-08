class ProductsDescriptionPage
  include PageObject

  link(:size, :class => "swatchanchor", :title => "Select Size: 6")
  button(:add_to_bag, :css => '#add-to-cart')
  buttons(:checkout_now, :class => 'checkout-now-button')
end