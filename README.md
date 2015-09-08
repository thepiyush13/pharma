# Mercy Pharma Implementation in JAVA

## Project Overview
Mercy Pharmacy case, implementation of a data access layer for the new  pharmacy system using Java data access API.
## Project Features
* Facility for getting and/or modifying the data used on every part of the screen. 
* Completely done in java object model.
* Used Repository pattern in the solution with concrete implementations.

## Project Setup
* Extract the zip folder to a new folder inside your eclipse workspace.
* Import the  Maven project into your workspace .
* Run the Maven test goal to execute your schema creation scripts and set up your database for development (mercy-pharm-create.sql, mercy-west-ehr.sql).
* All screenshots and other documentation are included in the site folder of the project.

##Notes
* Mercy East patient appears on the screenshots provided. As a result, we must provide some facility for loading Mercy East EHR data . Mercy East data comes in JSON format and not from an
RDBMS like Mercy West. A JsonUtil class has been created to load that data into Record objects. However, there is repository pattern to hide the details of this process from the users of  data access API.
* Created a DBHelper class to open and close database connections in a central location to avoid having to rewrite the
same code in all of our repositories.
* Using the provided java code files, implemented the test cases. All methods with the exception of constructors, getters and setters  have one or more corresponding test cases.
