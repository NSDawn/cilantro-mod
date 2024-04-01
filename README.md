# cilantro-mod
A Minecraft mod that adds Cilantro to the game, using the Fabric API.
## Specs
- Requires Fabric API
- For Minecraft 1.20.x
## Features
This mod implements the rare crop Cilantro, and Coriander Seeds to grow it.
<img align='center' style="width:25%" alt="Cilantro" src="/public-assets/cilantro.png">

Cilantro has assorted uses, similar to other crops in the game.

### Farming
Coriander Seeds can be planted on tilled soil as any other crop. However, the Cilantro crop, mimicking its growth in real life, can only yield Cilantro at young growth stages, and only yield seeds when fully grown. In this implementation, Cilantro Crops have seven growth stages (0-6).

| Growth Stage:   | 0 | 1 | 2 | 3 | 4 | 5 | 6 |
|-----------------|---|---|---|---|---|---|---|
| Cilantro        | - | 0-1 | 1-2 | 1-4 | 1- 5 | 0-1 | - |
| Coriander Seeds | - | - | - | - | - | - | 1-4 |
| Stick           | - | - | - | - | - | 1 | 1 |



### Animals
A large variety of animal mobs have an affinity for Cilantro, and thus it can be used to lure and breed the following mobs:
- Cows/Mooshrooms
- Goats
- Sheep
- Pigs
- Rabbits

Most mobs have a larger affinity for Cilantro than vanilla crops (especially pigs), and will run faster towards the player if they are holding Cilantro.

Additionally, Coriander Seeds can be used to lure and breed:
- Chickens
- Sniffers (do not follow the player)


