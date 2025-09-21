
execute as @a[scores={dim_trigger=1}] at @s in minecraft:overworld run tp ~ 490 ~
execute as @a[scores={dim_trigger=2}] at @s in final_frontier:moon run tp ~ 490 ~

scoreboard players set @s dim_trigger 0

execute as @a[predicate=final_frontier:altitude_above_limit] run dialog show @s final_frontier:planet_selector