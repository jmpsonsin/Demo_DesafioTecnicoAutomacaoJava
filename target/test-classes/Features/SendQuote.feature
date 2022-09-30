Feature: Feature to test the send quotation insurance application

  Scenario Outline: Enter Vehicle Data
    Given browser is opened
    And user is on Enter Vehicle Data page
    When user enters make,model,<cylinder_capacity>,<engine_performance>,date_manufacture,number_seats_a,right_hand,number_seats_b,fuel_type,<payload>,<total_weight>,<list_price>,<license_plate>,<annual_mileage>
    And user clicks on NEXT button to enter in the new window
    Then user is navigated to the Enter Insurant Data window

    Examples: 
      | cylinder_capacity | engine_performance | payload | total_weight | list_price | license_plate | annual_mileage |
      |              1500 |               1500 |     850 |         1000 |      30000 | EIR2J84       |          12500 |

  Scenario Outline: Enter Insurant Data
    Given that all the previous data of Enter Vehicle window was filled
    And user is on the Enter Insurant Data window
    When user enters <first_name>,<last_name>,<date_birth>,gender,<address>,country,<zip_code>,<city>,occupation,hobbies,<website>,picture
    And user clicks on NEXT button to proceed to the new window
    Then user is navigated to the Enter Product Data window

    Examples: 
      | first_name | last_name | date_birth | address         | zip_code | city      | website                   |
      | Jean       | Sonsin    | 03/15/1990 | av Paulista,123 | 06454055 | Sao Paulo | https://www.google.com.br |

  Scenario Outline: Enter Product Data
    Given that all the previous data of Enter Insurant window was filled
    And user is on the Enter Product Data window
    When user enters <start_date>,insurance_sum,merit_rating,damage_insurance,optional_products,courtesy_car
    And user clicks on the NEXT button to go to the new window
    Then user is navigated to the Select Price Option window

    Examples: 
      | start_date |
      | 12/01/2022 |

  Scenario: Select Price Option
    Given that all the previous data of Enter Vehicle window, Enter Insurant window and Enter Product window were filled
    And user is on the Select Price option window
    When user clicks to select the insurance option
    And user clicks on the NEXT button to advance to the new window
    Then user is navigated to the Send Quote window

  Scenario Outline: Send the quotation to the registered email
    Given that the insurance price option was selected
    And user is on the Send Quote window
    When user provides <email>,<phone>,<username>,<password>,<confirm_password>,<comments>
    And user clicks on the SEND button
    Then the window Sending e-mail success is displayed
    And user clicks on the Ok button
    Then the message is closed
    And the navigator is closed

    Examples: 
      | email               | phone       | username  | password | confirm_password | comments        |
      | jmpsonsin@gmail.com | 11971326703 | jmpsonsin | Test123  | Test123          | This is a test! |
