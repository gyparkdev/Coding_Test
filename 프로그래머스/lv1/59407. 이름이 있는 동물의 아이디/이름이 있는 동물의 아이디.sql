-- 코드를 입력하세요
SELECT ANIMAL_ID FROM (SELECT * FROM ANIMAL_INS ORDER BY ANIMAL_ID) 
WHERE NAME IS NOT NULL;