# FedExTrackingServer

Current use is to simply host an index page for a user to upload an excel file and receive back the tracking results of all the tracking numbers in said file. Excel file must contain a column with "tracking" as a substring in the header.

https://github.com/uixneg0/FedExTrackingChecker is a required library in order to run. Must be added manually to your project structure. This will eventually be added to Maven and handled in the pom. 

This is run on Java 17.

Your resources folder must also contain a json file named "oauth". Pojo for JSON objects linked below. Required types are grant_type, client_id, and client_secret. child_Key and child_Secret are optional. 

https://github.com/uixneg0/FedExTrackingChecker/blob/master/src/main/java/FedExTrackerChecker/oauth/OAuthJson.java

Requests are sent to FedEX's prod api server. This does not support sending to the test server.

Change your database user and pass in the application.properties file.
