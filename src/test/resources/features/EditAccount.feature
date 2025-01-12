@Edit
Feature: Edit Account

  @Edit1 @Username
  Scenario: Edit1 - Başarılı Hesap adı Güncelleme
    * Login, Check Text, Enter User Name Textbox: "Enter username*"
    * Login, SendKeys, User Name Textbox: "burak.ercayan@testinium.com"
    * Login, SendKeys, Password Textbox: "Burak1905."
    * Login, Click, Log In Button
    * Transfer, Check Text, Open Money Transfer Textbox: "OPEN MONEY TRANSFER"
    * Transfer, Click, Open Money Transfer Button
    * My Account, Click, Edit Account Button
    * Edit Account, Check Text, Page Title: "Edit account"
    * Edit Account, Clear, Account Name
    * Edit Account, SendKeys, Random Account Name Textbox
    * Edit Account, Click, Update Button
    * My Account, Check Text, Random Account Name


