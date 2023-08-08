# taskmanager
a project I began to help me learn about REST, MAVEN, DROPWIZARD, JAVA

#what is this?
This is a program suggested to me via chatGPT on how I could become familiar with frameworks and RESTful APIs.  I use Maven and Dropwizard on a java-simple archetype.

#what is going well?
I can succesfully run it as a maven build.  Outside of this, I succesfully setup an Amazon RDS account and can connect to it with MySQL.  
This confirms I have proper login information.

#what could go better?
I lost my ability to run it as a Java configuration when I attempted to connect to the Amazon RDS database.  
I added JDBI elements to the pom.xml and to the related TaskManagerApplication, Configuration, and Resource files.  
I can't get them to connect.  

#current error codes when trying to build
WARN  [2023-08-08 15:29:54,563] org.apache.tomcat.jdbc.pool.PooledConnection: Not loading a JDBC driver as driverClassName property is null.
ERROR [2023-08-08 15:29:54,574] org.apache.tomcat.jdbc.pool.ConnectionPool: Unable to create initial connections of pool.
! java.sql.SQLException: No suitable driver found for 
! at java.sql/java.sql.DriverManager.getConnection(DriverManager.java:706)

...and a dozen more similar until these red errors occur...
java.sql.SQLException: No suitable driver found for 
	at java.sql/java.sql.DriverManager.getConnection(DriverManager.java:706)
	at java.sql/java.sql.DriverManager.getConnection(DriverManager.java:190)

 ...and several more.

