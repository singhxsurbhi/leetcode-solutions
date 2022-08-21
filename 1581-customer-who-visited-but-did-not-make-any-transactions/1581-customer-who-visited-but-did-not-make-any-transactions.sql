# Write your MySQL query statement below
select v.customer_id, count(v.visit_id) as count_no_trans 
from Visits as v
left join Transactions as t
on v.visit_id = t.visit_id
where v.visit_id not in (select distinct visit_id from Transactions)
group by customer_id;