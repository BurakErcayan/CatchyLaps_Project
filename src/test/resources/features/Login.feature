@Login
Feature: Login

  @Login1 @Success
  Scenario: Login1 - Kullanıcının Başarılı Login Olabilmesi
    * Login, Check Text, Enter User Name Textbox: "Enter username*"
    * Login, SendKeys, User Name Textbox: "burak.ercayan@testinium.com"
    * Login, SendKeys, Password Textbox: "Burak1905."
    * Login, Click, Log In Button
    * Transfer, Check Text, Open Money Transfer Textbox: "OPEN MONEY TRANSFER"

  @Login2 @Fail
  Scenario: Login2 - Kullanıcının Hatalı Mail Bilgileri ile Login Olamaması
    * Login, Check Text, Enter User Name Textbox: "Enter username*"
    * Login, SendKeys, User Name Textbox: "burak@testinium.com"
    * Login, SendKeys, Password Textbox: "Burak1905."
    * Login, Click, Log In Button
    * Login, Check Text, Alert Text: "Username or Password Invalid!"

  @Login3 @Fail
  Scenario: Login3 - Kullanıcının Hatalı Şifre Bilgileri ile Login Olabilmesi
    * Login, Check Text, Enter User Name Textbox: "Enter username*"
    * Login, SendKeys, User Name Textbox: "burak.ercayan@testinium.com"
    * Login, SendKeys, Password Textbox: "Burak12"
    * Login, Click, Log In Button
    * Login, Check Text, Alert Text: "Username or Password Invalid!"



