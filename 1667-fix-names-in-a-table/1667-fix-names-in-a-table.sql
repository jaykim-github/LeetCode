/* Write your PL/SQL query statement below */
SELECT user_id, initcap(name) as name
From Users
order by user_id