# 아직 입양을 못 간 동물 중, 가장 오래 보호소에 있었던 동물 3마리의 이름과 보호 시작일을 조회
# 보호 시작일 순으로 조회
select i.name, i.datetime
from animal_ins as i left join animal_outs as o
on i.animal_id = o.animal_id
where o.datetime is null
order by i.datetime
limit 3;