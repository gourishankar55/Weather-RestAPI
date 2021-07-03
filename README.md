  ******Weather RestAPI******
  
                              

If you are using this RestAPI then you can follow these following steps:


Step1 : Install Xampp in your system if you don't have one then make sure you start apache server and mysql server from Xampp control panel which you will get after Successfull installation of Xampp in your system.


Step2 : Now create a database in Xampp into phpmyadmin page name of which should be same as your database file name which you are going to import for example if you are going to use weather.sql file then your database name should be weather.


Step3 : Till this point you would have successfully imported the sql file and make sure you know your mysql userid and password which you have provided at the time of installation.

NOTE : If you don't know your userid and password of mysql then goto phpmyadmin page of Xampp->Select your database->Go to option Privileges->Add new user->Create new userid and password->Don't forget to select Hostname as Localhost (This make a links in our RestAPI where in the application.properties for mysql connection it requires host to be localhost).


Step4 : Now for RestAPI you can make use of any IDE which are available but i would recommend to use Spring Tool Suite(STS) IDE which really provides some cool features like embedded spring starter and so many such features.


Step5 : Import the weather directory project and then run it as spring boot application finally go to any browser chrome/explorer or you can also make use of postman app to test the RestAPI.


Note : If you get server failed error after running it then in application.properties file add this ------server.port="port address" (port address could be 8085,8081 or anything similar but not same as your mysql and apache server port) -------.


                                                                     
                                                                     
                                                                     
                                                                     
