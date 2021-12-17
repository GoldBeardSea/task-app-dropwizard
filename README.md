# User Story 

This is my first attempt at using both Maven and Dropwizard. The design for this application is a simple server that takes standard restful calls to the server's paths annotated in the TaskController class. 

Originally, I had planned to containerize the front end of the application and the server and upload to the oracle cloud infrastructure OKE cluster. While the docker image runs locally, there have been repeated issues in setting up the containing on Oracle and so for now, until I get more time to figure out the issue, the server and front end still are only local. The Docker image of this backend can be run locally or on docker and can be found under my repositories. 

Another issue I am currently having is understanding the implementation and working of Maven's unit testing and debugging. Currently Maven only runs a single test class. There are also issues where DropWizard Testing which should provide testing tools, helpers and classes, not existing during compile. Likely this could be due to incompatible versions of packages in the pom.xml. 

In order to improve the server there are a number of options that can move the application forward. Fully fleshing out a Database integration in SQL, DynamoDB, S3, buckets, or other forms of database explicit persistence would be next in regards to expanding the service.

The Application is compiled with Java 8. 

### Refactoring at the immediate level 
Implement a robust DAO and DB
Attempt to host the server using another platform other than OKE in order to test to ensure there is nothing wrong with the configuration
Fix the Maven Test suite 
Fix the Testing Import

### Implementation over time 
Oath, user profiles, implementing multiple users. 
Host multiple react app objects and apis.


# reactDrop

How to start the reactDrop application
---

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/task-app-1.0.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`

Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`
