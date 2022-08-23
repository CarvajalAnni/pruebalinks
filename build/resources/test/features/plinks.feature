Feature: DemoQA
  i want to interactive
  to the DemoQA page
  to put my skills into practice
  Scenario Outline: Scenario: Interact with the website
    Given that 'Anni' opens the browser and enter the page 'https://demoqa.com/'
    When she selects the element option and the category Links with the links
      | Link              | <Link>              |
      | Number            | <Number>            |
      | Message           | <Message>           |
    Then she should see the new tab or text in the screen
      | Link              | <Link>              |
      | Number            | <Number>            |
      | Message           | <Message>           |
    Examples:
      | Link              | Number   |  Message           |
      | Created           | 201      |  Created           |
      | No content        | 204      |  No Content        |
      | Moved             | 301      |  Moved Permanently |
      | Bad request       | 400      |  Bad Request       |
      | Unauthorized      | 401      |  Unauthorized      |
      | Forbidden         | 403      |  Forbidden         |
      | Not found         | 404      |  Not Found         |