Feature: My feature file

  Scenario: Verify that GET request return status code 200
    Given I have server by url "https://reqres.in"
    When I send GET request on endpoint "/api/users" and parameters "page=2"
    Then I get response status code 200

  Scenario: Verify that GET response code not null
    Given I have server by url "https://reqres.in"
    When I send GET request on endpoint "/api/users" and parameters "page=2"
    Then I get response body not null


  Scenario: Check Post Response Status Code
    Given I have server by url "https://reqres.in"
    When I send POST request on endpoint "/api/users" and body "{\"name\": \"morpheus\",\"job\": \"leader\"}"
    Then I get response status code 201

  Scenario: Verify that Post response code not null
    Given I have server by url "https://reqres.in"
    When I send POST request on endpoint "/api/users" and body "{\"name\": \"morpheus\",\"job\": \"leader\"}"
    Then I get response body not null



