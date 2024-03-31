package dev.nsdawn.cilantromod.item.items;

import dev.nsdawn.cilantromod.CilantroMod;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

import java.util.Random;
import java.util.UUID;

public class CilantroItem extends Item {
    public CilantroItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {

        UUID playerUUID = user.getUuid();
        long seed = playerUUID.getMostSignificantBits() ^ playerUUID.getLeastSignificantBits();
        Random random = new Random(seed);

        if (random.nextInt(10) + 1 == 7) {
            final int NAUSEA_DURATION = (random.nextInt(7) + 7) * 20;
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, NAUSEA_DURATION, 0));

        }

        return super.finishUsing(stack, world, user);
    }
}

