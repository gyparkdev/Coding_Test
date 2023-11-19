-- 코드를 입력하세요
SELECT CAR_ID, 
      (CASE 
       WHEN COUNT(
                    CASE WHEN START_DATE <= TO_DATE('2022-10-16', 'YYYY-MM-DD') AND 
                              TO_DATE('2022-10-16', 'YYYY-MM-DD') <= END_DATE
                         THEN 1
                     END
                 ) = 1
       THEN '대여중'
       ELSE '대여 가능'
        END
      ) AS AVAILABILITY
  FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
 GROUP BY CAR_ID
 ORDER BY CAR_ID DESC;