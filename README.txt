# seti-api

1. Steps on how to start your application

Run below command to run the Application :

java -jar target/seti-api-0.0.1-SNAPSHOT.jar

 2. After application is started sample curl request to Endpoint 1
	To Create a resource : HTTP POST
	Endpoint : http://localhost:9007/userDetails
	Request body : 
	{
		"id": 1,
		"name": "Geetika",
		"email": "geetika123@climate.com",
		"phoneNo": 1234567898,
		"loc": "US",
		"dob": "06/19/1986"
	}
 3. After application is started sample curl request to Endpoint 2
	To Create a resource : HTTP GET
	Endpoint : http://localhost:9007/userDetails
	Response Body :
	{
		"id": 1,
		"name": "Geetika",
		"email": "geetika123@climate.com",
		"phoneNo": 1234567898,
		"loc": "US",
		"dob": "06/19/1986"
	}