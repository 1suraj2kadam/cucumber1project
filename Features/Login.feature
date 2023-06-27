Feature: Login FB
	Background: Common steps for all scenarioes
		Given User Launch Chrome browser
    When User open URL "https://www.facebook.com/?stype=lo&jlou=Afd58zGitWDGd-IZXmZaC7zp1SXmbGk2Yjw2LtXJFd5rixXacNOuVgdeshslT_gz48NCjXE5Cm2bSCUS1IQyLZSHoefCyjSIus8Bt1OLmHlUdw&smuh=29271&lh=Ac83wD-cKxk73wNZ1qE"
    And User Enter Valid Username as "1kadam" and valid password as "kadam@2211"
    And User click on Login button

		@sanity
  	Scenario: Successfully login with valid credentials
   
    Then validate Title of home page should be "Facebook"
    When Click on logOut link
    Then validate Title should be "Facebook – log in or sign up"
    And close the browser
    
    @regression
    Scenario Outline: Successfully login with valid credentials (DDT)
    Given User Launch Chrome browser
    When User open URL "https://www.facebook.com/?stype=lo&jlou=Afd58zGitWDGd-IZXmZaC7zp1SXmbGk2Yjw2LtXJFd5rixXacNOuVgdeshslT_gz48NCjXE5Cm2bSCUS1IQyLZSHoefCyjSIus8Bt1OLmHlUdw&smuh=29271&lh=Ac83wD-cKxk73wNZ1qE"
    And User Enter Valid Username as "<Email>" and valid password as "<Password>"
    And User click on Login button
    Then validate Title of home page should be "Facebook"
    When Click on logOut link
    Then validate Title should be "Facebook – log in or sign up"
    And close the browser
    
    
    Example:
    |Email|Password|
    |1kadam|kadam@2211|
   
    