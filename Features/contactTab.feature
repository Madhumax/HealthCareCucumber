Feature: Application Validation

Scenario Outline: Contact Tab Validation
Given user chooses the browsedr
And navigated to url
Then Clicked on contact tab
And entered the details <name> <email> <message> and then submit
And validating the text "Thanks for contacting us"

Examples:
|name			|email					|message		|
|madhu		|mad@gmail.com	|hi					|
|virat		|vi@gmail.com		|hii				|
