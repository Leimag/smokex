// 
// Decompiled by Procyon v0.6.0
// 

package net.optifine;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.util.BlockPos;

public interface IRandomEntity
{
    int getId();
    
    BlockPos getSpawnPosition();
    
    BiomeGenBase getSpawnBiome();
    
    String getName();
    
    int getHealth();
    
    int getMaxHealth();
}
