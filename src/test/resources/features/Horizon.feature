Feature: Horizon

  @login
  Scenario Outline: As Clientele use I want to be able to login on platform
    Given the user  has navigated to the login page
    When the user enters username "<username>"
    And the user enters password "<password>"
    And clicks on the login button
    And user should see error message "<errormessage>"

Examples:
    |username  |  password|errormessage|
    | mnyinyi@clientele.co.za|10Coections123$ |Invalid username or password.|
    | mnyinyi@clientele.co.za|Adjustment123$|                            |

@Quote
Scenario Outline: As User I want to be able to capture Quote
  Given  In home Page user clicks on capture Quote'<username>','<password>'
  When Clicks on  new capture Quote
  And Capture product details and  click continue button '<Product>','<Plan>'
  And Capture client details and Plan detail '<SaleChannel>','<PolicyType>','<LegalRefeenceType>','<LegalReferenceNumber>','<Title>','<FirstName>','<LastName>','<Citzenship>','<Gender>','<Smoker>','<CellNo>','<Address1>','<Suburb>','<CityTown>'
  And Clicks on review benefits button and Click continue button
  And Clicks on save button
  And user Navigate to Payer
  And Capture payer information and Account information '<Relationshiptomember>','<Paymentmethod>','<AccountHolder>','<Debitday>','<BankName>','<BranchCode>','<AccountNumber>','<AccountType>'
  And Click save button
  And user Navigate to Summary and Click on submit button

  Examples:
    |username|password|Product|Plan|SaleChannel|PolicyType|LegalRefeenceType|LegalReferenceNumber|Title|FirstName|LastName|Citzenship|Gender|Smoker|CellNo|Address1|Suburb|CityTown|Relationshiptomember|Paymentmethod|AccountHolder|Debitday|BankName|BranchCode|AccountNumber|AccountType|
    | mnyinyi@clientele.co.za|[Onelife123$]|Clientele Funeral Dignity Plan|Clientele Funeral Dignity Plan|Broker|Member Only|ID Number|9708165605873|Mr|Nande|Wawa|South African|Male|Non-Smoker|07258698745|123 Main Street|Suburbia|City ville|Member|Debit Order|Minal Longwe|31|First National Bank|Branch 560|1234|Savings Account|






