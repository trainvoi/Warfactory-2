

import gregtech.api.unification.material.Material;
import gregtech.api.GregTechAPI;
import gregtech.api.fluids.attribute.FluidAttributes;
import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.properties.*

import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.Materials.*;
import gregtech.api.unification.material.properties.BlastProperty.GasTier;
import static gregtech.api.fluids.FluidConstants.*;

import net.minecraft.util.ResourceLocation

event_manager.listen { MaterialEvent event ->
    new Material.Builder(32000, resource('gcp', 'fluix'))
            .gem()
            .color(0x674FAF).iconSet('CERTUS')
            .flags('generate_plate', 'disable_decomposition', 'no_smelting', 'crystallizable')
            .components(material('certus_quartz'), material('nether_quartz'), material('redstone'))
            .build()

    new Material.Builder(32001, resource('gcp', 'desh'))
            .ingot()
            .color(0xC40000).iconSet('METALLIC')
            .build()


    material('certus_quartz').addFlags('generate_rod', 'generate_bolt_screw')
    material('nether_quartz').addFlags('generate_rod', 'generate_bolt_screw')
    material('iron').addFlags('generate_dense')
    material('brass').addFlags('generate_spring')
}
