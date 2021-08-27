Feature:To test the PHP Travels Application
@Smoke
Scenario:To register the application
Given Open Chrome browser and enter the url of the application
When Enter the details for registration
Then Login successfully

@Functional
Scenario: To add the product ro cart
Given Login Page
When Select the product
Then Add to Cart


