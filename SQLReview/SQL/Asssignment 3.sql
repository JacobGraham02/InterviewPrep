/* Assignment 3
   Worth 7.5%
   
   Assignment is out of 100
   
   Complete all of the questions in this SQL file and submit the file for grading
                
                Open this file in SQL Workbench to complete all of the statements
                
                Make sure you run the CreateDB Script to create the sample database again so you have the correct data 
				
                You will need it to create the queries based on these tables
                
                There is a .jpg file which shows the tables in the database

*/

/*
Question 1 (15 marks)

Create a stored procedure (P_TOTAL_PRICES) that has one OUT parameter (n_total_price).  
Use a loop to iterate through the records in the PRODUCT table.   
Add each price to n_total_price, on each iteration, to output the total cost of the products in the PRODUCTS table.
*/


/*
Question 2 (25 marks)

Create a stored procedure (P_DEL_D11) that CREATES a GLOBAL TEMPORARY TABLE, that is based on the following query 
(SELECT distinct firstname as fname, lastname as lname,workdept as deptnum FROM employee e).  
Then issues a DELETE on the  TEMPORARY table deleting records with deptnum = ‘D11’.
*/



/*
Question 3 (25 marks) 

Create a stored procedure ( P_DYN_TABLE) that creates a table DYNAMICALLY by having 2 input parameters, 1 which is the SOURCE table for that new table, 
and the second input is the name of the new table.  You will need to define two statements, 1 for the structure of the table, 
AND 1 statement to populate it (Hint for the first statement you will need to build the CREATE statement by concatenating the NEW table name and the SOURCE table.  
For the second statement you will need to use the PREPARE and EXECUTE commands. ).
*/

 
/*  
Question 4 (40 marks) 
Write a statement to create a Table called  GREAT_SALES with the same columns as the SALES table.
Write a statement to create a Table called  POOR_SALES with the same columns as the SALES table.

Create a stored procedure ( P_SALES_TYPES) that creates a cursor that SELECTS  SALES_PERSON, REGION and sums up SALES.  
Open the cursor and iterate through the  rows and INSERT a record in the GREAT_SALES table if sales are >= 10 otherwise INSERT into the POOR_SALES table.

*/
