# Write your MySQL query statement below
Select Distinct author_id As id from Views 
where author_id = viewer_id
order by author_id;