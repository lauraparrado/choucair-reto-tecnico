# Author: laura

  @stories
  Feature: Diligence utest form
    As a user I want to fill out the registration form on the Utest platform
    @scenario1
    Scenario Outline: Fill out the form automatically
      Given that laura wants to start the registration in Utest
      When she completes the data required to fill out the form
        | strFirstName   | strLastName   | strEmail   | strMonth   | strDay   | strYear   | strLanguages   | str City   | strPostal   | strPais     |  strComputer   | strVersion   | strLanguage   |  strPassword   | strConfirmPass   |
        | <strFirstName> | <strLastName> | <strEmail> | <strMonth> | <strDay> | <strYear> | <strLanguages> | <str City> | <strPostal> | <strPais>   | <strComputer>  | <strVersion> | <strLanguage> |  <strPassword> | <strConfirmPass> |
      Then she filled out the registration form
        | strButtonComplete   |
        | <strButtonComplete> |
      Examples:
        | strFirstName   | strLastName   | strEmail         | strMonth   | strDay   | strYear   | strLanguages   | str City      | strPostal | strPais  | strComputer   | strVersion   | strLanguage   | strPassword    | strConfirmPass   | strButtonComplete |
        | laura          | parrado       | laura@gamail.com | November   | 20       | 1998      |  spanish       | Villavicencio | 500001    | Colombia |Windows        | 8.1          | spanish       |  Choucair2021* | Choucair2021*    | Complete Setup    |


