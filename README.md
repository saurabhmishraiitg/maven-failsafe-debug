# maven-failsafe-debug
Debug issue with using maven failsafe plugin

Am facing problem whereby when i try to run Integration test cases using maven failsafe plugin, the test cases are executed twice.
Also, the resouces for the integration tests get mixed with resources for the regular units tests. 

## Update
Issue with duplicate integration test run got resolved. Was due to the fact that i wasn't clear on the differences between plugins and pluginManagement components of the Maven project.
