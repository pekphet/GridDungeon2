package cn.dogrid.griddungeon2.ui.enums


//Take the extensions of direct properties by equip, buf, and skill, etc.
enum class FinalPropertiesEnum(val desc: String = "") {

    MAX_HP,         //MAX HP direct prop.
    MAX_MP,         //MAX MP direct prop.
    HP,             //CURRENT HP (FOR SKILL/BUF)
    MP,             //CURRENT MP (FOR SKILL/BUF)
    ATK,            //attack prop.
    DEF,            //defence prop.
    MATK,           //magical attack prop.
    MDEF,           //magical defence prop.

    HIT,            //Hit value, beginner is 800, no limit, HIT chance is (hit * (1 - miss_chance)) in 1000
    MISS,         //Dodge chance by float, beginner is 50, top is 800, chance in 1000
    CRI,          //Critical chance by float, beginner is 50, top is 800, chance in 1000
    CRIDMG,       //Critical Damage, beginner is 150

    ELEMENT,        //Current DMG ELEMENT, Effect by Weapon/Skill, skill prior to weapon, beginner is NA

    ELE_DEC_FIRE,   //DECEASE ELEMENT DAMAGE VALUE - FIRE
    ELE_DEC_WATER,  //DECEASE ELEMENT DAMAGE VALUE - WATER
    ELE_DEC_HOLY,   //DECEASE ELEMENT DAMAGE VALUE - HOLY
    ELE_DEC_DARK,   //DECEASE ELEMENT DAMAGE VALUE - DARK

}