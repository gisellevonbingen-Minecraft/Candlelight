package satisfyu.candlelight.client.render.block;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import de.cristelknight.doapi.block.entity.StorageBlockEntity;
import de.cristelknight.doapi.client.render.block.storage.StorageTypeRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;
import satisfyu.vinery.client.ClientUtil;


public class TableSetRenderer implements StorageTypeRenderer {
    @Override
    public void render(StorageBlockEntity entity, PoseStack matrices, MultiBufferSource vertexConsumers, NonNullList<ItemStack> itemStacks) {
        ItemStack stack = itemStacks.get(0);
        if(stack.isEmpty()) return;
        float oP = (float) 1 / 16;
        matrices.translate(oP, oP, -oP);
        matrices.scale(0.5f, 0.5f, 0.5f);
        matrices.mulPose(Vector3f.XP.rotationDegrees(90f));
        ClientUtil.renderItem(stack, matrices, vertexConsumers, entity);
    }
}
