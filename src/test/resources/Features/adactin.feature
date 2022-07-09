Feature: verifying Adactinhotel Login Details

  Scenario Outline: Verifying Adactinhotel Login details with Valid Credentials
    Given User is on the Adactinhotel Page
    When User should Login with "<username>","<password>"
    And User should Search the Hotel with "<Location>","<Hotel>","<Roomtype>","<Numberofrooms>","<Checkindate>","<Checkoutdate>","<Adult>","<Children>"
    And User should Select the hotel using Continue
    And User Should Book the Hotel using "<firstname>","<lastname>","<address>","<crdeditcardnumber>","<cctype>","<expiremonth>","<expireyear>" , "<cvv>"
    Then user should Confirm the booking using order id

    Examples: 
      | username            | password     | Location  | Hotel         | Roomtype | Numberofrooms | Checkindate | Checkoutdate | Adult   | Children  | firstname | lastname | address       | crdeditcardnumber | cctype | expiremonth | expireyear | cvv |
      | NirmalKumarNatesan  | Nirmalhari@1 | Melbourne | Hotel Cornice | Double   | 2 - Two       | 21-06-2022  | 22-06-2022   | 2 - Two | 3 - Three | kandasamy | bala     | 1/16,sivakasi |  1234123412341234 | VISA   | June        |       2022 | 122 |
      #| NirmalKumarNatesan  | Nirmalhari@1 | London    | Hotel Cornice | Double   | 2 - Two       | 21-06-2022  | 22-06-2022   | 2 - Two | 3 - Three | kandasamy | bala     | 1/16,sivakasi |  1234123412341234 | VISA   | June        |       2022 | 122 |
      #| NirmalKumarNatesan  | Nirmalhari@1 | Brisbane  | Hotel Cornice | Double   | 2 - Two       | 21-06-2022  | 22-06-2022   | 2 - Two | 3 - Three | kandasamy | bala     | 1/16,sivakasi |  1234123412341234 | VISA   | June        |       2022 | 122 |
      #| NirmalKumarNatesan  | Nirmalhari@1 | Melbourne | Hotel Cornice | Double   | 2 - Two       | 21-06-2022  | 22-06-2022   | 2 - Two | 3 - Three | kandasamy | bala     | 1/16,sivakasi |  1234123412341234 | VISA   | June        |       2022 | 122 |
      #| NirmalKumarNatesan  | Nirmalhari@1 | New York  | Hotel Cornice | Double   | 2 - Two       | 21-06-2022  | 22-06-2022   | 2 - Two | 3 - Three | kandasamy | bala     | 1/16,sivakasi |  1234123412341234 | VISA   | June        |       2022 | 122 |
      #| NirmalKumarNatesan  | Nirmalhari@1 | Melbourne | Hotel Cornice | Double   | 2 - Two       | 21-06-2022  | 22-06-2022   | 2 - Two | 3 - Three | kandasamy | bala     | 1/16,sivakasi |  1234123412341234 | VISA   | June        |       2022 | 122 |
      #| Ni rmalKumarNatesan | Nirmalhari@1 | Adelaide  | Hotel Cornice | Double   | 2 - Two       | 21-06-2022  | 22-06-2022   | 2 - Two | 3 - Three | kandasamy | bala     | 1/16,sivakasi |  1234123412341234 | VISA   | June        |       2022 | 122 |
      #| NirmalKumarNatesan  | Nirmalhari@1 | Melbourne | Hotel Cornice | Double   | 2 - Two       | 21-06-2022  | 22-06-2022   | 2 - Two | 3 - Three | kandasamy | bala     | 1/16,sivakasi |  1234123412341234 | VISA   | June        |       2022 | 122 |
      #| NirmalKumarNatesan  | Nirmalhari@1 | Melbourne | Hotel Cornice | Double   | 2 - Two       | 21-06-2022  | 22-06-2022   | 2 - Two | 3 - Three | kandasamy | bala     | 1/16,sivakasi |  1234123412341234 | VISA   | June        |       2022 | 122 |
      #| NirmalKumarNatesan  | Nirmalhari@1 | Melbourne | Hotel Cornice | Double   | 2 - Two       | 21-06-2022  | 22-06-2022   | 2 - Two | 3 - Three | kandasamy | bala     | 1/16,sivakasi |  1234123412341234 | VISA   | June        |       2022 | 122 |
