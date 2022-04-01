
Feature: Application Login

Scenario: Login with valid credentials
Given Open any Browser
And Navigate to Login page
When User enters itsid as "12341234" and password as "test" into the fields
And User clicks on Login button
And User clicks on Super Admin button
Then Verify user is able to successfully login
