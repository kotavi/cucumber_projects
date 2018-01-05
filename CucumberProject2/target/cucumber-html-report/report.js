$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("shopping.feature");
formatter.feature({
  "line": 2,
  "name": "Check my amazon cart",
  "description": "",
  "id": "check-my-amazon-cart",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    },
    {
      "line": 1,
      "name": "@Sanity"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Amazon cart is empty",
  "description": "",
  "id": "check-my-amazon-cart;amazon-cart-is-empty",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I login to my amazon account",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I do not have items in my cart",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I perform procedure of checkout",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I get error \"404\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingStep.loginAmazonAccount()"
});
formatter.result({
  "duration": 78114239,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.noItemsInMyCart()"
});
formatter.result({
  "duration": 37831,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.checkoutProcedure()"
});
formatter.result({
  "duration": 34411,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "404",
      "offset": 13
    }
  ],
  "location": "ShoppingStep.getError(int)"
});
formatter.result({
  "duration": 1242809,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Amazon cart has one item",
  "description": "",
  "id": "check-my-amazon-cart;amazon-cart-has-one-item",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I login to my amazon account",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I add \"1\" item to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I perform procedure of checkout",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Checkout shows \"1\" item",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingStep.loginAmazonAccount()"
});
formatter.result({
  "duration": 39731,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 7
    }
  ],
  "location": "ShoppingStep.addItemToCart(int)"
});
formatter.result({
  "duration": 147081,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.checkoutProcedure()"
});
formatter.result({
  "duration": 26807,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 16
    }
  ],
  "location": "ShoppingStep.nItemsInCart(int)"
});
formatter.result({
  "duration": 173075,
  "status": "passed"
});
});