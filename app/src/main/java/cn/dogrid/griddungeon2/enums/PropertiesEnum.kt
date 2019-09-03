package cn.dogrid.griddungeon2.enums

enum class PropertiesEnum(val desc: String) {
	MAX_HP("最大生命值"),
	MAX_MP("最大魔法值"),
	STR("力量"),
	INT("魔力"),
	VIT("体力"),
	MEN("精力"),
	AGI("敏捷"),
	LUK("运气"),

	ELE_INC_FIRE("火属性强化"),
	ELE_INC_WATER("水属性强化"),
	ELE_INC_HOLY("光属性强化"),
	ELE_INC_DARK("暗属性强化"),

	ELE_DEC_FIRE("火属性抗性"),
	ELE_DEC_WATER("冰属性抗性"),
	ELE_DEC_HOLY("光属性抗性"),
	ELE_DEC_DARK("暗属性抗性"),
}