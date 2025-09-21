
execute as @e at @s if dimension final_frontier:moon run attribute @s gravity base set 0.013
execute as @e at @s if dimension final_frontier:moon run attribute @s safe_fall_distance base set 18
execute as @e at @s if dimension minecraft:overworld run attribute @s gravity base set 0.08
execute as @e at @s if dimension minecraft:overworld run attribute @s safe_fall_distance base set 3
execute as @e at @s if dimension minecraft:the_nether run attribute @s gravity base set 0.08
execute as @e at @s if dimension minecraft:the_nether run attribute @s safe_fall_distance base set 3
execute as @e at @s if dimension minecraft:the_end run attribute @s gravity base set 0.08
execute as @e at @s if dimension minecraft:the_end run attribute @s safe_fall_distance base set 3