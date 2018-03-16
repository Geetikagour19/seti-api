# seti-api

1. Steps on how to start your application

Run below command to run the Application :

java -jar target/seti-api-0.0.1-SNAPSHOT.jar

 2. After application is started sample curl request to Endpoint 1
	To Create a resource : HTTP POST
	Endpoint : http://localhost:9000/userDetails
	Curl cmd 1: curl -i -X POST -H "Content-Type:application/json" http://localhost:9000/userDetails -d '{"id": 3,"name": "abc","email": "abc123@climate.com","phoneNo": 1234597898,"loc": "US","dob": "07/19/1986"}'

	Curl cmd 2: curl -i -X POST -H "Content-Type:application/json" http://localhost:9000/userDetails -d '{"id": 4,"name": "xyz","email": "xyz123@climate.com","phoneNo": 1234577898,"loc": "US","dob": "08/19/1986"}'


 3. After application is started sample curl request to Endpoint 2
	To Create a resource : HTTP GET
	Endpoint : http://localhost:9000/userDetails
        Curl cmd : curl -H "Accept:application/json" http://localhost:9000/userDetails/1
	Response Body :
	{
		"id": 1,
		"name": "Geetika",
		"email": "geetika123@climate.com",
		"phoneNo": 1234567898,
		"loc": "US",
		"dob": "06/19/1986"
	}