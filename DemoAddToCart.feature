Feature: Testing Demo FirstCry page

Scenario Outline: Testing Add To Cart Feature of FirstCry

Given I open the browser and enter URL
Then I click on Login link and enter the email id '<EmailId>'
Then I capture the title of the FirstCryPage
Then I click on Footwear and click on Casualshoes
Then I click on Product on the page
Then I click on Add to cart page
Then I click on Go to Cart page


Examples: 
      | EmailId                     |   password    |
      | subashiniravi385@gmail.com |   Suba2000    |
