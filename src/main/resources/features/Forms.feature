Feature: MIS Portal API Login Authentication

  Scenario Outline: API VALIDATION: Login
    Given Set endpoint "<endpoint>" and method "<method>"
    Then Verify status code <expectedStatus>
    Examples:
      | endpoint | method | expectedStatus |
      | postApi  | post   | 200             |

    Scenario Outline: API VALIDATION: Department
      Given Set the endpoint "<endpoint>" and method "<method>"
      Then Verify status code <expectedStatus>
      Examples:
        | endpoint | method | expectedStatus |
        | departmentsApi | post   | 200       |

      Scenario Outline: API VALIDATION: Department Data
        Given Set the endpoint "<endpoint>" and method "<method>"
        Then Verify status code <expectedStatus>
        Examples:
          | endpoint | method | expectedStatus |
          | dataForEmployeeApi | get   | 200       |

  Scenario Outline: API VALIDATION: Active Forms
    Given Set the endpoint "<endpoint>" , method "<method>" and "<sampleName>"
    Then Verify status code <expectedStatus>
    Examples:
      | endpoint | method | expectedStatus | sampleName |
      | activeFormsApi | post  | 200       | department |

  Scenario Outline: API VALIDATION: My Forms
    Given Set the endpoint "<endpoint>" and method "<method>"
    Then Verify status code <expectedStatus>
    Examples:
      | endpoint | method | expectedStatus |
      | allMyFormsApi | get   | 200       |

  Scenario Outline: API VALIDATION: Employee Directory
    Given Set the endpoint "<endpoint>" and method "<method>"
    Then Verify status code <expectedStatus>
    Examples:
      | endpoint | method | expectedStatus |
      |employeeDirectoryApi | get   | 200       |