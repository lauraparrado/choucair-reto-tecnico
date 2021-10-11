# Author: laura

  @stories
  Feature: Diligence utest form
    As a user I want to fill out the registration form on the Utest platform
    @scenario1
    Scenario Outline: Fill out the form automatically
      Given that laura wants to start the registration in Utest
      When she completes the data required to fill out the form
        | strFirstName   | strLastName   | strEmail   | strMonth   | strDay   | strYear   | strLanguages   | str City   | strPostal   | strPais     |  strComputer   | strVersion   | strLanguage   | strMobile   | strModel   | strSystem   | strPassword   | strConfirmPass   |
        | <strFirstName> | <strLastName> | <strEmail> | <strMonth> | <strDay> | <strYear> | <strLanguages> | <str City> | <strPostal> | <strPais>   | <strComputer> | <strVersion> | <strLanguage> | <strMobile> | <strModel> | <strSystem> | <strPassword> | <strConfirmPass> |
      Then she filled out the registration form

      Examples:
        | strFirstName   | strLastName   | strEmail         | strMonth   | strDay   | strYear   | strLanguages   | str City      | strPostal | strPais  | strComputer   | strVersion   | strLanguage   | strMobile   | strModel   | strSystem   | strPassword   | strConfirmPass   |
        | laura          | parrado       | laura@gamail.com | November   | 20       | 1998      |  spanish       | Villavicencio | 500001    | Colombia |Windows       | 8.1          | spanish       | motorola    | g20        | Android 11  | Choucair2021* | Choucair2021*    |


