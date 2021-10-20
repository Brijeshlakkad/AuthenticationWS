# AuthenticationWS
Developed to present JAX-WS usage for Distributes Systems (SOEN 423) course.

## The below files are generated:
- AuthClientApplication/client/**
- AuthServerApplication/com/**
- AuthServerApplication/auth.wsdl (The content of this file is generated from STEP#3)

## Steps to follow:
1. Run AuthPublisher.java

2. Create auth.wsdl file at AuthServerApplication/

3. Go to http://127.0.0.1:8080/auth?wsdl and paste the content into auth.wsdl file.
(You can also visit and look at http://127.0.0.1:8080/auth)

4. Compile the wsdl file using the below command:
> wsimport -keep auth.wsdl
This will generate the binding files at AuthServerApplication/com location.

5. In IDE, Drag and drop two files: Authentication.java and AuthenticationImplService.java to AuthClientApplication/src/client location.
If you are copying and pasting the files, please don't forget to change the package names.

6. Run the AuthClient.java

##Setting the IDE:
This project uses
Add lib/ folder to your Project Libraries path.

##Reference
[1] https://docs.oracle.com/cd/E17802_01/webservices/webservices/docs/2.0/tutorial/doc/JAXWS3.html


