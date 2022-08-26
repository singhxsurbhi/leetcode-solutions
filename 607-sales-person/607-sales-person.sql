# Write your MySQL query statement below
select S.name from Salesperson as S where S.sales_id not in (select distinct O.sales_id from orders O left join company c on
                                                             o.com_id=c.com_id where c.name = 'RED');