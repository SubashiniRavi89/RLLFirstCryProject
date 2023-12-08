Feature: Testing FirstCry StoreLocator  page

Scenario Outline: Testing StoreLocator Feature of FirstCry

Given I open the browser and enter URL of firstcry Page
Then I Click on login link and enter the Email id '<EmailId>'

Then I click on Stores Section and click on Find Stores from DropDown Menu
Then I Search For the  Store Locator
Then I click on Search Icon



Examples: 
      | EmailId                     |   
      | subashini08092000@gmail.com |   


