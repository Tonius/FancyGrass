package tonius.fancygrass;

import net.minecraft.client.renderer.RenderBlocks;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import cpw.mods.fml.common.gameevent.TickEvent.RenderTickEvent;

@Mod(modid = "fancygrass", name = "FancyGrass")
public class FancyGrass {

    @Instance("fancygrass")
    public static FancyGrass instance;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent evt) {
        FMLCommonHandler.instance().bus().register(instance);
    }

    @SubscribeEvent
    public void onTick(RenderTickEvent evt) {
        if (evt.phase == Phase.START)
            RenderBlocks.fancyGrass = true;
    }

}
