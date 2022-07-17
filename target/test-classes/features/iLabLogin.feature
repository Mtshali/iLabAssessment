Feature: Login to iLab Website
  Login to the ILab website

  Scenario Outline: iLab job Application

    Given user is on the iLab application landing page
    When user navigate to ILab
    Then user clicks on the career button
    And user clicks on the South African Link
    Then user clicks on the first available Job
    And user click apply button
    And user enters "Skhumbuzo" first name
    And I enter email address "automationAssessment@iLABQuality.com"
    And I enter phone number "083 568 7859"
    And I click send application button
    Then Verify that You need to upload at least one file. is displayed

  Examples:
    |Username|Email|PhoneNumber|
    |Skhumbuzo|automationAssessment@iLABQuality.com|083 568 7859|
