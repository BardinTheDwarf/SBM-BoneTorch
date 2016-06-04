package com.builtbroken.bonetorch.torch;

import net.minecraft.block.BlockTorch;
import net.minecraft.block.SoundType;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 12/9/2015.
 */
public class BlockBoneTorch extends BlockTorch
{
    public BlockBoneTorch()
    {
        super();
        this.setRegistryName("boneTorch");
        setCreativeTab(CreativeTabs.DECORATIONS);
        this.setHardness(0.0F);
        this.setLightLevel(0.9375F);
        this.setSoundType(SoundType.WOOD);
    }

    @SideOnly(Side.CLIENT)
    public void registerModel() {
        ModelLoader.setCustomModelResourceLocation(new ItemStack(this).getItem(), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
