# Write your MySQL query statement below
select U.name as name, if(sum(distance),sum(distance),0) as travelled_distance 
from users as U
left join rides as r
on r.user_id=u.id
group by user_id
order by travelled_distance desc, name asc;

