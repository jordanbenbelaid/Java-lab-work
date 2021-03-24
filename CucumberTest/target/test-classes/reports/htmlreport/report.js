$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cuke/shopping.feature");
formatter.feature({
  "line": 1,
  "name": "Buy something",
  "description": "",
  "id": "buy-something",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3527151300,
  "status": "passed"
});
formatter.before({
  "duration": 1434527100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Shopping",
  "description": "",
  "id": "buy-something;shopping",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I can access a site",
  "rows": [
    {
      "cells": [
        "site"
      ],
      "line": 5
    },
    {
      "cells": [
        "https://www.amazon.co.uk"
      ],
      "line": 6
    },
    {
      "cells": [
        "https://www.ebay.co.uk"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I search for clothes",
  "rows": [
    {
      "cells": [
        "clothes"
      ],
      "line": 9
    },
    {
      "cells": [
        "Jumpers"
      ],
      "line": 10
    },
    {
      "cells": [
        "Jeans"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I will buy something",
  "keyword": "Then "
});
formatter.match({
  "location": "Shopping.i_can_access_a_site(DataTable)"
});
formatter.result({
  "duration": 2036550400,
  "status": "passed"
});
formatter.match({
  "location": "Shopping.i_search_for_clothes(DataTable)"
});
formatter.result({
  "duration": 4825036200,
  "status": "passed"
});
formatter.match({
  "location": "Shopping.i_will_buy_something()"
});
formatter.result({
  "duration": 60391700,
  "status": "passed"
});
formatter.after({
  "duration": 818549500,
  "status": "passed"
});
formatter.after({
  "duration": 949303100,
  "status": "passed"
});
});