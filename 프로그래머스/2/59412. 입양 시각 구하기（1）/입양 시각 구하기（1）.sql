-- 코드를 입력하세요
SELECT  hour , count(hour)
FROM
    (
        SELECT to_number(to_char(datetime , 'FMhh24')) as hour
        FROM animal_outs
    )
GROUP BY hour
HAVING hour between 9 AND 19
ORDER BY hour;