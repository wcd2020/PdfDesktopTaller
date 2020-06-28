#Autor: willian concepcion
  @stories
  Feature:Windows calculator automation
  The user, I want to perform the multiplication operation
  on the windows calculator and compare the result.
  @scenario1
  Scenario: perform the operation
    Given That Willian wants to enter the calculator desktop application
    When he enters the data to calculator the operation
      |dato1|dato2|
      |2    | 2   |
    Then He verifies the result by comparing number Se muestra 4 with the response of the operation