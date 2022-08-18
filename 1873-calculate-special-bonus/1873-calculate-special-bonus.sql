# Write your MySQL query statement below
SELECT employee_id, IF(employee_id%2 <> 0 AND name NOT LIKE "M%", SALARY,0) AS bonus FROM Employees ORDER BY employee_id;