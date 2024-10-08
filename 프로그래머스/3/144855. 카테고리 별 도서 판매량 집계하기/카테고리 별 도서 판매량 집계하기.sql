-- 22년도 1월 카테고리 별 도서 판매량 합산
SELECT A.CATEGORY, SUM(B.SALES) AS TOTAL_SALES
FROM BOOK AS A
    JOIN BOOK_SALES AS B
    ON A.BOOK_ID = B.BOOK_ID
WHERE B.SALES_DATE LIKE '2022-01%'
GROUP BY A.CATEGORY
ORDER BY CATEGORY ASC;