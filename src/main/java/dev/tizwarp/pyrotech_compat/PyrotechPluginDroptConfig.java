package dev.tizwarp.pyrotech_compat;

import net.minecraftforge.common.config.Config;

import java.util.Map;
import java.util.TreeMap;

@Config(modid = PyrotechCompat.MODID, name = "pyrotech/plugin.Dropt.pyrotechCompat")
public class PyrotechPluginDroptConfig {
    public static final Map<String, Boolean> ENABLED_RULES = new TreeMap();

    static {
        String[] rules = new String[]{"netherrack", "igneous_cobblestone", "igneous_stone", "igneous_gravel", "igneous_sand", "igneous_sandstone",
                "metamorphic_cobblestone", "metamorphic_stone", "metamorphic_gravel", "metamorphic_sand", "metamorphic_sandstone",
                "sedimentary_stone", "sedimentary_gravel", "sedimentary_sand", "sedimentary_sandstone", "ubc_clay"};
        for (String rule : rules){
            ENABLED_RULES.put(rule, true);
        }
    }
}
