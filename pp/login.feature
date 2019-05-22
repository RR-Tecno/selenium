Feature: Validate login credantial for gmail

Scenario: login with valid userId and Password

Given User nevigate to gmail login page
When user type userid and password
And user click in login button
Then user should see profile page 