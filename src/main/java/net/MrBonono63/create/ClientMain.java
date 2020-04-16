package net.MrBonono63.create;

import net.MrBonono63.create.registry.CreateBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ClientMain implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                CreateBlocks.TILED_GLASS_PANE,
                CreateBlocks.TILED_GLASS,

                CreateBlocks.VERTICAL_FRAMED_GLASS,
                CreateBlocks.VERTICAL_FRAMED_GLASS_PANE,

                CreateBlocks.HORIZONTAL_FRAMED_GLASS,
                CreateBlocks.HORIZONTAL_FRAMED_GLASS_PANE,

                CreateBlocks.ACACIA_GLASS_PANE,
                CreateBlocks.ACACIA_GLASS,

                CreateBlocks.OAK_GLASS,
                CreateBlocks.OAK_GLASS_PANE,

                CreateBlocks.DARK_OAK_GLASS,
                CreateBlocks.DARK_OAK_GLASS_PANE,

                CreateBlocks.FRAMED_GLASS_PANE,
                CreateBlocks.FRAMED_GLASS,

                CreateBlocks.SPRUCE_GLASS_PANE,
                CreateBlocks.SPRUCE_GLASS,

                CreateBlocks.BIRCH_GLASS_PANE,
                CreateBlocks.BIRCH_GLASS,

                CreateBlocks.IRON_GLASS_PANE,
                CreateBlocks.IRON_GLASS,

                CreateBlocks.JUNGLE_GLASS_PANE,
                CreateBlocks.JUNGLE_GLASS,

                CreateBlocks.ROPE,
                CreateBlocks.PULLEY_MAGNET,

                CreateBlocks.TURNTABLE
        );
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                CreateBlocks.CREATIVE_CRATE
        );
    }
}
