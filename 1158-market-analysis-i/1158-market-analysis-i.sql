# Write your MySQL query statement below
select U.user_id as buyer_id , U.join_date, if(count(O.buyer_id)!=0,count(O.buyer_id),0) as orders_in_2019 from Users as U
left join Orders as O
on U.user_id = O.buyer_id AND O.order_date like "2019%"
group by u.user_id;
