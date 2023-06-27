Feature: Facebook Menu
Background: Common steps for all scenarioes
		Given User Launch Chrome browser
    When User open URL "https://www.facebook.com/?stype=lo&jlou=Afd58zGitWDGd-IZXmZaC7zp1SXmbGk2Yjw2LtXJFd5rixXacNOuVgdeshslT_gz48NCjXE5Cm2bSCUS1IQyLZSHoefCyjSIus8Bt1OLmHlUdw&smuh=29271&lh=Ac83wD-cKxk73wNZ1qE"
    And User Enter Valid Username as "1kadam" and valid password as "kadam@2211"
    And User click on Login button
 @regression
  Scenario: Title of your scenario
    Then validate Title of home page should be "Facebook" 
    When User click on menu icon
    And user click on Events
    Then validate title of page should be "(13) Events | Facebook"
    When User navigate on previeous page
    And User click on menu icon
    And User click on Friends
    Then validate title of page should be "(13) Friends | Facebook"
    When User navigate on previeous page
    And User click on menu icon
    And User click on Groups
    Then validate title of page should be "(13) Groups | Facebook"
    When User navigate on previeous page
    And User click on menu icon
    And User click on News Feeds
    Then validate Title of home page should be "(13) Facebook"
    When User navigate on previeous page
    And User click on menu icon
    And User click on Favorites
    Then validate the WebElement favorite is displayed
    When User navigate on previeous page
    And user refresh the page
    And User click on menu icon
    And user click on Pages
    Then validate title of page should be "(13) Facebook"
