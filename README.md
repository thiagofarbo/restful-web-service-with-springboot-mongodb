**About this application**
On this application was used Spring Boot framework. The application does not need any server to do deploy. Why? This application application is deployed in an embedded Tomcat from Springboot.

**Data and Entities**
The Flight entity was mapped with annotations from MongoDB to create our database on h2(database in memory) and tables.

**How to run the application**
For default the SpringBoot run on port 8080, make sure you do not have any server running on port 8080. To run, go to root folder from your application and type on your terminal the command mvn spring-boot:run

**How to access my database**
For this projects was used a mongoDB database running on docker.
To build your own mongoDB running on docker, you can access the link below. https://medium.com/@pablo_ezequiel/creating-a-docker-image-with-mongodb-4c8aa3f828f2

**How to execute requests from REST API**
You can use your own browser to do it or you can use an application to simulate it; for example: Postman: link for download > https://www.getpostman.com/

** @GET Get all flights: http://localhost:8080/flights/all

** @GET Get a flights by id: http://localhost:8080/flights/5a8b262d4cebd8219ca2ab73

** @POST To save a flight into database: http://localhost:8080/flights/save

** @PUT To update a flight: http://localhost:8080/flight/update/5a8b262d4cebd8219ca2ab73

** @DELETE To delete a product: http://localhost:8080/flight/delete/5a8b262d4cebd8219ca2ab73