$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WebUI_Tests.feature");
formatter.feature({
  "line": 1,
  "name": "Web UI Tests for PwC Website",
  "description": "",
  "id": "web-ui-tests-for-pwc-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10690122800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefenition.i_navigate_to_the_PwC_Digital_Pulse_website()"
});
formatter.result({
  "duration": 1419655100,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Verify Carousels are displayed",
  "description": "",
  "id": "web-ui-tests-for-pwc-website;verify-carousels-are-displayed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am viewing the \u0027Home\u0027 page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I am presented with a carousel displaying \"3\" featured articles",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Clicking the \u0027Next\u0027 button on the carousel will load the next \"3\" featured articles",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Clicking the \u0027Previous\u0027 button on the carousel will load the previous \"3\" featured articles",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefenition.i_am_viewing_the_page()"
});
formatter.result({
  "duration": 32584900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 43
    }
  ],
  "location": "stepDefenition.i_am_presented_with_a_carousel_displaying_featured_articles(String)"
});
formatter.result({
  "duration": 36358700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 63
    }
  ],
  "location": "stepDefenition.clicking_the_Next_button_on_the_carousel_will_load_the_next_featured_articles(String)"
});
formatter.result({
  "duration": 3136744100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 71
    }
  ],
  "location": "stepDefenition.clicking_the_Previous_button_on_the_carousel_will_load_the_previous_featured_articles(String)"
});
formatter.result({
  "duration": 3134099400,
  "status": "passed"
});
formatter.after({
  "duration": 4329446800,
  "status": "passed"
});
formatter.before({
  "duration": 9305609800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefenition.i_navigate_to_the_PwC_Digital_Pulse_website()"
});
formatter.result({
  "duration": 1258798700,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify User can perform Search",
  "description": "",
  "id": "web-ui-tests-for-pwc-website;verify-user-can-perform-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I click on the \u0027Magnifying glass\u0027 icon to perform a search",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I enter the text \"Single page applications\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I submit the search",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I am taken to the search results page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I am presented with at least \"1\" search result",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefenition.i_click_on_the_Magnifying_glass_icon_to_perform_a_search()"
});
formatter.result({
  "duration": 105143500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Single page applications",
      "offset": 18
    }
  ],
  "location": "stepDefenition.i_enter_the_text_Single_page_applications(String)"
});
formatter.result({
  "duration": 218437600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefenition.i_submit_the_search()"
});
formatter.result({
  "duration": 1124866400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefenition.i_am_taken_to_the_search_results_page()"
});
formatter.result({
  "duration": 12060300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 30
    }
  ],
  "location": "stepDefenition.i_am_presented_with_at_least_search_result(int)"
});
formatter.result({
  "duration": 31275700,
  "status": "passed"
});
formatter.after({
  "duration": 4329700400,
  "status": "passed"
});
formatter.before({
  "duration": 9302456500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefenition.i_navigate_to_the_PwC_Digital_Pulse_website()"
});
formatter.result({
  "duration": 3860181300,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Verify the links on Contact US page",
  "description": "",
  "id": "web-ui-tests-for-pwc-website;verify-the-links-on-contact-us-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "I select \u0027Contact us\u0027 from the hamburger menu",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I am taken to the \"Contact us\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I am presented with the below options for contacts",
  "rows": [
    {
      "cells": [
        "Heading",
        "Contact Link"
      ],
      "line": 27
    },
    {
      "cells": [
        "PwC Digital Services",
        "https://digital.pwc.com/en/contact-us.html"
      ],
      "line": 28
    },
    {
      "cells": [
        "Digital Pulse editorial team",
        ""
      ],
      "line": 29
    },
    {
      "cells": [
        "Careers at PwC",
        "https://www.pwc.com/gx/en/careers.html"
      ],
      "line": 30
    },
    {
      "cells": [
        "General enquiries",
        "https://www.pwc.com/gx/en.html"
      ],
      "line": 31
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "stepDefenition.i_select_from_the_hamburger_menu()"
});
formatter.result({
  "duration": 843607700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Contact us",
      "offset": 19
    }
  ],
  "location": "stepDefenition.i_am_taken_to_the_page(String)"
});
formatter.result({
  "duration": 12365500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefenition.i_am_presented_with_the_below_options_for_contacts(DataTable)"
});
formatter.result({
  "duration": 234575700,
  "status": "passed"
});
formatter.after({
  "duration": 63798700,
  "status": "passed"
});
});