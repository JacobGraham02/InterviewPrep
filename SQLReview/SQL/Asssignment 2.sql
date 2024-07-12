/* Assignment 2 
   Worth 7.5%
   
   Assignment is out of 100
   
   Complete all of the questions in this SQL file and submit the file for grading
                
                Open this file in SQL Workbench to complete all of the statements
                
                Make sure you run the CreateDB Script to create the sample database again so you have the correct data 
				
                You will need it to create the queries based on these tables
                
                There is a .jpg file which shows the tables in the database

*/



/*Create Table, Index and View Questions:

Question 1 (15 marks)

Create a View (V_EMP_DEPT_PROJ) statement that joins the EMPLOYEE and EMPPROJACT (join on EMPNO)  and PROJECT table (join on PROJNO).  Limit the view to contain :
o	Empno
o	Name (FirstName and Lastname)
o	WorkDept
o	Salary
o	ACTNO
o	PROJNO
o	PROJNAME
o	Where Salary < 100000
*/



/*
Question 2 (10 marks)
Create an INDEX statement that would speed up the following query on the EMPLOYEE table.
    select * from employee where hiredate > '2001-01-01';

*/

/*
Create an INDEX statement that would speed up the following query on the STAFF table.
    select * from staff where YEARS > 3 AND SALARY BETWEEN 45000 AND 100000 ;
 
*/





/*Question 3 (25 marks )

	    Write the 3 CREATE TABLE statements for the tables in the Question3.jpg file with Primary Keys  and Foreign Keys 
	    ( Make sure columns are defined with appropriate data types  (Dt column would be a Date), and configure the PK to 
	    create an ID number automatically on insert).  Create 5 INSERT statements for each of the tables and  
	    Create a SELECT statement that gets the following columns  CaseManagerID, SupervisorID, AuditedDt, UpdatedBy, FName, LName.
*/

 
 
/*Question 4 (25 marks)
Create a stored procedure (P_SYS_TABLE) that lists TABLE_NAME, TABLE_ROWS, COLUMN_NAME and DATA_TYPE for the TABLES in the SAMPLE database 
that have VARCHAR columns with a CHARACTER_MAXIMUM_LENGTH > 5.  You will find this information by using a SELECT on the INFORMATION_SCHEMA.  
*/




/*
Question 5 (25 marks)
Create a stored procedure (P_FACT_RESULT)  that accepts one IN parameter (n_factor), and has one OUT parameter (n_result).  Use a CASE structure to control the output:

o	Input is >=  3 , Output is n_factor *1.1
o	Input is >=6 , Output is n_factor*1.3
o	Input is >=12 , Output is n_factor*1.5
o	Input is >=17 , Output is n_factor*1.7
o	Input is >=24 , Output is n_factor*1.9
o	Else Ouput n_factor * 0.5
*/
