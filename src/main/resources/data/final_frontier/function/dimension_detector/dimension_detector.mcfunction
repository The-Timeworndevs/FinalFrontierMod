#advancement revoke @s only final_frontier:dimension_detector
#advancement revoke @s only final_frontier:dimension_detector_death

#execute store result score @s dim run data get entity @s Dimension

execute if dimension final_frontier:moon run attribute @s gravity base set 0.013
execute if dimension final_frontier:moon run attribute @s safe_fall_distance base set 18
execute if dimension final_frontier:mars run attribute @s gravity base set 0.03
execute if dimension final_frontier:mars run attribute @s safe_fall_distance base set 8
execute if dimension minecraft:overworld run attribute @s gravity base set 0.08
execute if dimension minecraft:overworld run attribute @s safe_fall_distance base set 3
execute if dimension minecraft:the_nether run attribute @s gravity base set 0.08
execute if dimension minecraft:the_nether run attribute @s safe_fall_distance base set 3
execute if dimension minecraft:the_end run attribute @s gravity base set 0.08
execute if dimension minecraft:the_end run attribute @s safe_fall_distance base set 3

