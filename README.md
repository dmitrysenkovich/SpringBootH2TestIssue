# SpringBootH2TestIssue

All the copy paste is intentional as I wanted to use `jdbcTemplate` directly from the test class.

Run it with the following command:

`mvn clean test-compile failsafe:integration-test -Dspring.profiles.active=some-profile`

Mysql database "test" should be created before running the app.