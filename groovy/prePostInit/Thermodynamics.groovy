package prePostInit;

import classes.*;
import globals.Globals;

import java.lang.Math;

//REMOVALS

mods.gregtech.steam_turbine.removeByInput(32, null, [fluid('steam') * 640])


 recipemap('steam_turbine').recipeBuilder()
            .fluidInputs(fluid('steam') * 480)
            .duration(10)
            .EUt(32)
            .buildAndRegister()
