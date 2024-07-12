
DELIMITER //
CREATE PROCEDURE P_LESSON_5 (  inout PARAM1 INT,  IN PARAM2 VARCHAR(10), OUT  PARAM3 DATE  )
BEGIN
DECLARE VAR1 INT;
	BEGIN
		BEGIN
        SET PARAM3 = '2021-09-04';
        insert into param_table( PARAM1, PARAM2, PARAM3);
        set PARAM2 = 'Goodbye';
        END
    
    END
insert into param_table( PARAM1, PARAM2, PARAM3);
END
//




SET @DATE_IN = '2021-02-09';
SET @INPUTVAL = 'Hello';


CALL P_LESSON_5 ( 22,  @INPUTVAL , @DATE_IN)

SELECT @SAYING, @DATE_IN ,  @INPUTVAL

















DELIMITER //
CREATE PROCEDURE TEST  (OUT NUMBER1 INTEGER)
BEGIN

   DECLARE NUMBER2 INTEGER DEFAULT 100;

   SET NUMBER1 = NUMBER2;

END
//

CALL TEST (@NUMBER);
SELECT @NUMBER;


DELIMITER //
CREATE PROCEDURE DIFFERENCE
   (IN P1 INTEGER,
    IN P2 INTEGER,
    OUT P3 INTEGER)
BEGIN
   IF P1 > P2 THEN
     BEGIN
			SET P3 = 1;
      END 
   ELSEIF P1 = P2 THEN
      SET P3 = 2;
   ELSE
      SET P3 = 3;
   END IF;
END
//




DELIMITER //
CREATE PROCEDURE FIBONNACI
   (INOUT NUMBER1 INTEGER,
    INOUT NUMBER2 INTEGER,
    INOUT NUMBER3 INTEGER)
BEGIN
   SET NUMBER3 = NUMBER1 + NUMBER2;
   IF NUMBER3 > 10000 THEN
      SET NUMBER3 = NUMBER3 - 10000;
   END IF;
   SET NUMBER1 = NUMBER2;
   SET NUMBER2 = NUMBER3;
END
//
#

SET @A=16, @B=27;

CALL FIBONNACI(@A,@B,@C);

SELECT @C;

CALL FIBONNACI(@A,@B,@C);

SELECT @C;

CALL FIBONNACI(@A,@B,@C);
SELECT @C;

DELIMITER //
CREATE PROCEDURE LARGEST
   (OUT T CHAR(10))
BEGIN
   IF (SELECT COUNT(*) FROM PLAYERS) >
      (SELECT COUNT(*) FROM PENALTIES) THEN
      SET T = 'PLAYERS';
   ELSEIF (SELECT COUNT(*) FROM PLAYERS) =
          (SELECT COUNT(*) FROM PENALTIES) THEN
      SET T = 'EQUAL';
   ELSE
      SET T = 'PENALTIES';
   END IF;
END
//

DELIMITER //
CREATE PROCEDURE AGE
   (IN  START_DATE  DATE,
    IN  END_DATE    DATE,
    OUT YEARS       INTEGER,
    OUT MONTHS      INTEGER,
    OUT DAYS        INTEGER)
BEGIN
   DECLARE NEXT_DATE, PREVIOUS_DATE DATE;
   SET YEARS = 0;
   SET PREVIOUS_DATE = START_DATE;
   SET NEXT_DATE = START_DATE + INTERVAL 1 YEAR;
   WHILE NEXT_DATE < END_DATE DO
      SET YEARS = YEARS + 1;
      SET PREVIOUS_DATE = NEXT_DATE;
      SET NEXT_DATE = NEXT_DATE + INTERVAL 1 YEAR;
   END WHILE;

   SET MONTHS = 0;
   SET NEXT_DATE = PREVIOUS_DATE + INTERVAL 1 MONTH;
   WHILE NEXT_DATE < END_DATE DO
      SET MONTHS = MONTHS + 1;
      SET PREVIOUS_DATE = NEXT_DATE;
      SET NEXT_DATE = NEXT_DATE + INTERVAL 1 MONTH;
   END WHILE;

   SET DAYS = 0;
   SET NEXT_DATE = PREVIOUS_DATE + INTERVAL 1 DAY;
   WHILE NEXT_DATE <= END_DATE DO
      SET DAYS = DAYS + 1;
      SET PREVIOUS_DATE = NEXT_DATE;
      SET NEXT_DATE = NEXT_DATE + INTERVAL 1 DAY;
   END WHILE;
END
 // 


SET @START = '1991-01-12';

SET @END = '1999-07-09';

CALL AGE (@START, @END, @YEAR, @MONTH, @DAY);

SELECT @START, @END, @YEAR, @MONTH, @DAY;

DELIMITER //
CREATE PROCEDURE SMALL_EXIT
   (OUT P1 INTEGER, OUT P2 INTEGER)
BEGIN
   SET P1 = 1;
   SET P2 = 1;
   BLOCK1 : BEGIN
      LEAVE BLOCK1;
      SET P2 = 3;
   END;
   SET P1 = 4;
END
//

DELIMITER //
CREATE PROCEDURE WAIT
   (IN WAIT_SECONDS INTEGER)
BEGIN
   DECLARE END_TIME INTEGER
      DEFAULT NOW() + INTERVAL WAIT_SECONDS SECOND;
   WAIT_LOOP: LOOP
      IF NOW() > END_TIME THEN
         LEAVE WAIT_LOOP;
      END IF;
   END LOOP WAIT_LOOP;
END
//

DELIMITER //
CREATE PROCEDURE AGAIN
   (OUT RESULT INTEGER)
BEGIN
   DECLARE COUNTER INTEGER DEFAULT 1;
   SET RESULT = 0;
   LOOP1: WHILE COUNTER <= 1000 DO
      SET COUNTER = COUNTER + 1;
      IF COUNTER > 100 THEN
         LEAVE LOOP1;
      ELSE
         ITERATE LOOP1;
      END IF;
      SET RESULT = COUNTER * 10;
   END WHILE LOOP1;
END
//



