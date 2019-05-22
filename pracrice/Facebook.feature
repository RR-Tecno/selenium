Feature: Use can be able to login with valid user name and password

Scenario Outline: user open chrome browser and login user name and password

Given user enter url facebook.com
When user enter<username>  
And user enter<password> 
And user click login button
Then user able to login successfully


Examples:
|username||password|
|"rknayon@gmail.com"||"1234"|
|"abdbrbr"||"122334"|


