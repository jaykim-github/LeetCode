# Write your MySQL query statement below
SELECT a.name, SUM(b.amount) as balance
FROM Users a
Join Transactions b on a.account = b.account
GROUP BY a.account
Having SUM(b.amount) > 10000