-- 코드를 입력하세요
SELECT DISTINCT A.CAR_ID 
  FROM CAR_RENTAL_COMPANY_CAR A INNER JOIN
       CAR_RENTAL_COMPANY_RENTAL_HISTORY B
    ON A.CAR_ID = B.CAR_ID
 WHERE A.CAR_TYPE = '세단'
   AND TO_CHAR(B.START_DATE, 'YYYY-MM') = '2022-10'
 ORDER BY A.CAR_ID DESC;