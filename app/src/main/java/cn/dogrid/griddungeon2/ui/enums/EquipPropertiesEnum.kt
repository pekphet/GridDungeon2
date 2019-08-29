package cn.dogrid.griddungeon2.ui.enums

import android.graphics.Color

enum class EquipType(val desc: String) {
    Header("头部"),
    Armer("护甲"),
    Arm("手臂"),
    Leg("护腿"),
    Foot("鞋"),
    Ring("指环"),
    Necklace("项链"),
    Amulet("护符"),
    Weapon("武器"),
    SecWeapon("副手"),
}

enum class EquipRarity(val desc: String, val colour: Int, val suit: Boolean = false) {
    LOW("破旧", Color.LTGRAY),
    NORMAL("普通", Color.WHITE),
    SLIGHT("精良", Color.BLUE),
    RARE("稀有", 0xff9933fa.toInt()),
    LEGEND("传说", 0xffff6100.toInt()),
    //EPIC < LEGEND LOWER HAS SUIT PROPS.
    EPIC("史诗", 0xff32cd32.toInt(), true),
    TOP("极品", 0xffb22222.toInt(), true),
    MYSTERY("神秘", 0xff33a1c9.toInt(), true),
}