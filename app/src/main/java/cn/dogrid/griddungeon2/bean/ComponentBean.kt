package cn.dogrid.griddungeon2.bean

import cn.dogrid.griddungeon2.ui.BasePropertyValue
import cn.dogrid.griddungeon2.ui.FinalPropertyValue
import cn.dogrid.griddungeon2.enums.Elements
import cn.dogrid.griddungeon2.enums.EquipRarity
import cn.dogrid.griddungeon2.enums.EquipType

//Interfaces


//VO For View
sealed class IItemVO {
    data class EquipVO(
        val id: Int,
        val name: String,
        val rarity: EquipRarity,
        val level: Int,
        val need: BasePropertyValue,
        val type: EquipType,
        val baseProperty: BasePropertyValue,
        val properties: MutableList<BasePropertyValue>,
        val exProperties: FinalPropertyValue?,
        val effect: EquipEffectVO?
    ) : IItemVO()

    data class UsableVO(
        val id: Int,
        val name: String,
        val price: Int
    )
}


data class SkillVO(val id: Int, val name: String)

data class EquipEffectVO(val id: Int, val name: String, val suitCount: Int, val desc: String)

data class BuffVO(val id: Int, val name: String)


//DO for scene
data class MonsterDO(val id: Int)

data class SelfInfoDO(
    var maxHp: Int, var maxMp: Int, var hp: Int, var mp: Int,
    var atk: Int, var matk: Int, var atkElement: Elements,
    var def: Int, var mdef: Int,
    var hit: Int, var miss: Float, var cri: Float, var criDmg: Float,
    var decFire: Int, var decWater: Int, var decHoly: Int, var decDark: Int
)

data class SkillDO(val atk: Int, val isPhysical: Boolean, val element: Elements)


//PO for Static Data/ Storage

data class SkillPO(val id: Int)
data class EquipEffectPO(val id: Int)
data class BuffPO(val id: Int)
