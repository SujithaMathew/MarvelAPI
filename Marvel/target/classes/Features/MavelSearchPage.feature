Feature: To validate marvel functionality
Background:
When Launch browser

@Search_Page
Scenario Outline: Navigate to the search page
When User search for charactar"<Charactars>" in comics section 
And to check and verify results"<Results>"
And to check and verify pages"<Pages>"

Examples:
|Charactars|Results|Pages|
|Avengers|20|154|


@Shop_Page
Scenario Outline: Navigate to the shop page
When User navigate to the shop section
And select complete your selection option
And Filter by Age Kids
And sort by price
And add items "<Items>"
Then Check and verify the basket total "<Total>"

Examples:
|Items|Total|
|Marvel Logo Pin – Rainbow Marvel Collection|$19.98|