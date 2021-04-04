package com.nukkitx.protocol.bedrock.data;

public enum LevelEventType {
    UNDEFINED,

    // Sounds
    SOUND_CLICK,
    SOUND_CLICK_FAIL,
    SOUND_LAUNCH,
    SOUND_DOOR_OPEN,
    SOUND_FIZZ,
    SOUND_FUSE,
    SOUND_PLAY_RECORDING,
    SOUND_GHAST_WARNING,
    SOUND_GHAST_FIREBALL,
    SOUND_BLAZE_FIREBALL,
    SOUND_ZOMBIE_DOOR_BUMP,
    SOUND_ZOMBIE_DOOR_CRASH,
    SOUND_ZOMBIE_INFECTED,
    SOUND_ZOMBIE_CONVERTED,
    SOUND_ENDERMAN_TELEPORT,
    SOUND_ANVIL_BROKEN,
    SOUND_ANVIL_USED,
    SOUND_ANVIL_LAND,
    SOUND_INFINITY_ARROW_PICKUP,
    SOUND_TELEPORT_ENDERPEARL,
    SOUND_ITEMFRAME_ITEM_ADD,
    SOUND_ITEMFRAME_BREAK,
    SOUND_ITEMFRAME_PLACE,
    SOUND_ITEMFRAME_ITEM_REMOVE,
    SOUND_ITEMFRAME_ITEM_ROTATE,
    SOUND_CAMERA,
    SOUND_EXPERIENCE_ORB_PICKUP,
    SOUND_TOTEM_USED,
    SOUND_ARMOR_STAND_BREAK,
    SOUND_ARMOR_STAND_HIT,
    SOUND_ARMOR_STAND_LAND,
    SOUND_ARMOR_STAND_PLACE,
    SOUND_POINTED_DRIPSTONE_LAND,
    SOUND_DYE_USED,
    SOUND_INK_SACE_USED,

    // particles
    PARTICLE_SHOOT,
    PARTICLE_DESTROY_BLOCK,
    PARTICLE_POTION_SPLASH,
    PARTICLE_EYE_OF_ENDER_DEATH,
    PARTICLE_MOB_BLOCK_SPAWN,
    PARTICLE_CROP_GROWTH,
    PARTICLE_SOUND_GUARDIAN_GHOST,
    PARTICLE_DEATH_SMOKE,
    PARTICLE_DENY_BLOCK,
    PARTICLE_GENERIC_SPAWN,
    PARTICLE_DRAGON_EGG,
    PARTICLE_CROP_EATEN,
    PARTICLE_CRIT,
    PARTICLE_TELEPORT,
    PARTICLE_CRACK_BLOCK,
    PARTICLE_BUBBLES,
    PARTICLE_EVAPORATE,
    PARTICLE_DESTROY_ARMOR_STAND,
    PARTICLE_BREAKING_EGG,
    PARTICLE_DESTROY_EGG,
    PARTICLE_EVAPORATE_WATER,
    PARTICLE_DESTROY_BLOCK_NO_SOUND,
    PARTICLE_KNOCKBACK_ROAR,
    PARTICLE_TELEPORT_TRAIL,
    PARTICLE_POINT_CLOUD,
    PARTICLE_EXPLOSION,
    PARTICLE_BLOCK_EXPLOSION,
    PARTICLE_VIBRATION_SIGNAL,
    PARTICLE_DRIPSTONE_DRIP,
    PARTICLE_FIZZ_EFFECT,
    PARTICLE_WAX_ON,
    PARTICLE_WAX_OFF,
    PARTICLE_SCRAPE,
    PARTICLE_ELECTRIC_SPARK,

    // world
    START_RAINING,
    START_THUNDERSTORM,
    STOP_RAINING,
    STOP_THUNDERSTORM,
    GLOBAL_PAUSE, //data: 1 to pause, 0 to resume
    SIM_TIME_STEP,
    SIM_TIME_SCALE,

    // blocks
    ACTIVATE_BLOCK,
    CAULDRON_EXPLODE,
    CAULDRON_DYE_ARMOR,
    CAULDRON_CLEAN_ARMOR,
    CAULDRON_FILL_POTION,
    CAULDRON_TAKE_POTION,
    CAULDRON_FILL_WATER,
    CAULDRON_TAKE_WATER,
    CAULDRON_ADD_DYE,
    CAULDRON_CLEAN_BANNER,
    CAULDRON_FLUSH,
    AGENT_SPAWN_EFFECT,
    CAULDRON_FILL_LAVA,
    CAULDRON_TAKE_LAVA,
    CAULDRON_FILL_POWDER_SNOW,
    CAULDRON_TAKE_POWDER_SNOW,

    // breaking
    BLOCK_START_BREAK,
    BLOCK_STOP_BREAK,
    BLOCK_UPDATE_BREAK,

    SET_DATA,

    ALL_PLAYERS_SLEEPING,
    JUMP_PREVENTED,

    // Legacy particles
    PARTICLE_BUBBLE,
    PARTICLE_BUBBLE_MANUAL,
    PARTICLE_CRITICAL,
    PARTICLE_BLOCK_FORCE_FIELD,
    PARTICLE_SMOKE,
    PARTICLE_EXPLODE,
    PARTICLE_EVAPORATION,
    PARTICLE_FLAME,
    PARTICLE_LAVA,
    PARTICLE_LARGE_SMOKE,
    PARTICLE_REDSTONE,
    PARTICLE_RISING_RED_DUST,
    PARTICLE_ITEM_BREAK,
    PARTICLE_SNOWBALL_POOF,
    PARTICLE_HUGE_EXPLODE,
    PARTICLE_HUGE_EXPLODE_SEED,
    PARTICLE_MOB_FLAME,
    PARTICLE_HEART,
    PARTICLE_TERRAIN,
    PARTICLE_TOWN_AURA,
    PARTICLE_PORTAL,
    PARTICLE_MOB_PORTAL,
    PARTICLE_SPLASH,
    PARTICLE_SPLASH_MANUAL,
    PARTICLE_WATER_WAKE,
    PARTICLE_DRIP_WATER,
    PARTICLE_DRIP_LAVA,
    PARTICLE_DRIP_HONEY,
    PARTICLE_FALLING_DUST,
    PARTICLE_MOB_SPELL,
    PARTICLE_MOB_SPELL_AMBIENT,
    PARTICLE_MOB_SPELL_INSTANTANEOUS,
    PARTICLE_INK,
    PARTICLE_SLIME,
    PARTICLE_RAIN_SPLASH,
    PARTICLE_VILLAGER_ANGRY,
    PARTICLE_VILLAGER_HAPPY,
    PARTICLE_ENCHANTMENT_TABLE,
    PARTICLE_TRACKING_EMITTER,
    PARTICLE_NOTE,
    PARTICLE_WITCH_SPELL,
    PARTICLE_CARROT,
    PARTICLE_MOB_APPEARANCE,
    PARTICLE_END_ROD,
    PARTICLE_RISING_DRAGONS_BREATH,
    PARTICLE_SPIT,
    PARTICLE_TOTEM,
    PARTICLE_FOOD,
    PARTICLE_FIREWORKS_STARTER,
    PARTICLE_FIREWORKS_SPARK,
    PARTICLE_FIREWORKS_OVERLAY,
    PARTICLE_BALLOON_GAS,
    PARTICLE_COLORED_FLAME,
    PARTICLE_SPARKLER,
    PARTICLE_CONDUIT,
    PARTICLE_BUBBLE_COLUMN_UP,
    PARTICLE_BUBBLE_COLUMN_DOWN,
    PARTICLE_SNEEZE,
    PARTICLE_SHULKER_BULLET,
    PARTICLE_BLEACH,
    PARTICLE_DRAGON_DESTROY_BLOCK,
    PARTICLE_MYCELIUM_DUST,
    PARTICLE_FALLING_RED_DUST,
    PARTICLE_CAMPFIRE_SMOKE,
    PARTICLE_TALL_CAMPFIRE_SMOKE,
    PARTICLE_FALLING_DRAGONS_BREATH,
    PARTICLE_DRAGONS_BREATH,
    PARTICLE_BLUE_FLAME,
    PARTICLE_SOUL,
    PARTICLE_OBSIDIAN_TEAR
}
