@create
Feature:  User Account Creation for Incubyte Application

  Scenario:  create an account and sign in with the new account
    Given I am on the home page of the luma application through chrome browser
    When  I Enter Valid datas in Register form 
    		|firstName|SakthiVel|
        |lastName|Murugan|
        |emailId|natarajan.sakthivel13@gmail.com|
        |passValue|Natraj@13@|
        |ConfirmPass|Natraj@13@|
    And   I Click the Create on Account button 
    Then  I should see a confirmation message Account created
    And  I redirect to  the login page
    And  I enter username and password click to login 
     
    
    
    
    
    

