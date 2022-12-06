# FedExTrackingServer

https://github.com/uixneg0/FedExTrackingChecker is a required library in order to run. Must be added manually to your project structure. This will eventually be added to Maven and handled in the pom. 

Your resources folder must also contain a json file named "oauth". Pojo for JSON objects linked below. Required types are grant_type, client_id, and client_secret. child_Key and child_Secret are optional. 

https://github.com/uixneg0/FedExTrackingChecker/blob/master/src/main/java/FedExTrackerChecker/oauth/OAuthJson.java

Requests are sent to FedEX's prod api server. This does not support sending to the test server.
