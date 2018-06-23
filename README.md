# Grazious Dating App

## Team Members

|Gerhard Lambrecht| Verena Leifert | Marvin Tandler |
| --- | --- | --- |
| Database Structure | HTML Layout | Spring Security |
| Presentation| Bootstrap| Documentation|
|Java Code (Models/Controller) | Design(HTML/Thymeleaf) | Messaging
||| Test Data




## Setup Instructions
- Make sure you have latest version of either Firefox or Chrome installed
- Make sure you have the JDK Version 8 at a for you suitable directory installed and the environment variable set to your path
- Make sure you have Eclipse Oxygen for Java EE Developers Version 4.7.2 at a for you suitable directory installed 
- Make sure you have Tomcat Version 8.5 at a for you suitable directory installed  and the environment variable set to your path
-  Make sure you have your MySQL set up correctly
- **Add Git Repository** : Open the Eclipse IDE -> Select an empty folder as workspace-> In the menu bar of the program select Window -> Show View -> Other... -> Git -> Git Repositories and then select "Clone a Git Repository" -> Paste the URL https://github.com/swagbrecht/fhj.swenga2018.grazious.git -> Press Next -> Select only the master branch -> Press Next -> Check "Import all existing Eclipse projects after clone finishes" -> Press Finish
- **Add server**: In the menu bar select File -> New -> Other... -> Server -> Server -> Apache -> Tomcat v8.5 Server -> Press Next -> Press Browse -> Select the root folder of the Tomcat (the directory you set while installing) -> Press Next -> Select the project "grazious" -> Click Add -> Click Finish 
- **Configure Project**: Modify the project properties so that the correct JRE, Tomcat, and Tomcat instance are configured.
- **Start the project**: Right-Click the Project, Choose Run As -> Run on Server

## Additional Notes
- use the /fill url to fill the Database with data -> There will be an error page, just re-enter original url after that and use the app

