# Write your MySQL query statement below
SELECT stock_name, SUM(IF(operation='Buy', -1*Stocks.price, Stocks.price)) AS capital_gain_loss
FROM Stocks 
GROUP BY stock_name;