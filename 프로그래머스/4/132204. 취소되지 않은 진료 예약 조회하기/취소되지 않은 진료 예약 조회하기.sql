-- 22.04.13 취소되지 않은 CS 예약 내역 조회
-- APPOINTMENT - APNT_CNCL_YN 예약취소 여부

SELECT T1.APNT_NO, T1.PT_NAME, T1.PT_NO,
    T2.MCDP_CD, T2.DR_NAME, T2.APNT_YMD
FROM (
    SELECT B.APNT_NO, A.PT_NAME, A.PT_NO
    FROM PATIENT AS A
        JOIN APPOINTMENT AS B
        ON A.PT_NO = B.PT_NO
    WHERE B.APNT_CNCL_YN = 'N'
) AS T1
    JOIN (
        SELECT B.APNT_NO, B.MCDP_CD, A.DR_NAME, B.APNT_YMD
        FROM DOCTOR AS A
            JOIN APPOINTMENT AS B
            ON A.DR_ID = B.MDDR_ID
        WHERE B.APNT_CNCL_YN = 'N'
    ) AS T2
    ON T1.APNT_NO = T2.APNT_NO
WHERE T2.APNT_YMD LIKE '2022-04-13%'
ORDER BY T2.APNT_YMD ASC;