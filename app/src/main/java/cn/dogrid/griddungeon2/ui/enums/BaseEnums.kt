package cn.dogrid.griddungeon2.ui.enums

enum class Elements(val desc: String, val id: Int) {
	NA("无", 0),
	FIRE("火", 1),
	WATER("冰", 2),
	HOLY("光", 3),
	DARK("暗", 4);

	fun toEnum(cid: Int) = when (cid) {
		NA.id -> NA
		FIRE.id -> FIRE
		WATER.id -> WATER
		HOLY.id -> HOLY
		DARK.id -> DARK
		else -> NA
	}
}