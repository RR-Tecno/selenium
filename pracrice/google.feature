Feature: User will be able to search anything in google Search box

Scenario Outline: open firefox browser and open google.com for searching anything

Given user put the url google.com 
When user enter<Item>sraech box And click Search button
Then user can see the search Result And user can select any ressult


Examples:

| Item|
| "chicken"|
| "beef"|
