class HomePage
  include PageObject

  page_url "https://cottonon.com/AU/"

  text_field(:search_fld, :css => "[name='q']", :index => 1)
  link(:product_link, :class => "name-link", :index=>1)
end