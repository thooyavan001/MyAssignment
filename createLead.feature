Feature: CreateLead Functinality of leaftap Application


Background: 
Given Open the browser
And Load the url


Scenario: Login for Positive credential
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click login button
Then Homepage sould be displayed
When Click on crmsfa link
And Click Leads link
And Click createLeads Link
Given Enter company Name as 'ThooyaITSolutions'
And Enter firstName as 'Chandru'
And Enter LastName as 'B'
When Click CreatLread Button
Then ViewPage Should Be Displayed