@AddMoney
Feature: Add Money

  @Add1 @Success
  Scenario: Add1 - Kullanıcının Hesaba Para Yüklemesi ve Hesaptaki Paranın Doğru Yansıması
    * Login, Check Text, Enter User Name Textbox: "Enter username*"
    * Login, SendKeys, User Name Textbox: "burak.ercayan@testinium.com"
    * Login, SendKeys, Password Textbox: "Burak1905."
    * Login, Click, Log In Button
    * Transfer, Check Text, Open Money Transfer Textbox: "OPEN MONEY TRANSFER"
    * Transfer, Click, Open Money Transfer Button
    * My Account, Check Text, Page Title: "My Account"
    * My Account, Save Text, Price
    * My Account, Click, Add Money Button
    * Add Money, Check Text, Popup Title: "Add money"
    * Add Money, SendKeys, Expriy Date Textbox: "12/26"
    * Add Money, SendKeys, Cvv Textbox: "111"
    * Add Money, SendKeys, Amount Textbox: "100"
    * Add Money, SendKeys, Card Number Textbox: "1234 1234 1234 1234"
    * Add Money, SendKeys, Card Holder Textbox: "Burak"
    * Add Money, Click, Add Button
    * My Account, Check Saved , Price

  @Add2 @Fail
  Scenario: Add2 - Hesaba eklenen bakiyenin eksi girilmesi
    * Login, Check Text, Enter User Name Textbox: "Enter username*"
    * Login, SendKeys, User Name Textbox: "burak.ercayan@testinium.com"
    * Login, SendKeys, Password Textbox: "Burak1905."
    * Login, Click, Log In Button
    * Transfer, Check Text, Open Money Transfer Textbox: "OPEN MONEY TRANSFER"
    * Transfer, Click, Open Money Transfer Button
    * My Account, Check Text, Page Title: "My Account"
    * My Account, Save Text, Price
    * My Account, Click, Add Money Button
    * Add Money, Check Text, Popup Title: "Add money"
    * Add Money, SendKeys, Amount Textbox: "-100"
    * Add Money, Click, Add Button
    * Add Money, Check Text, Amount Required: "amount must be a `number` type, but the final value was"
