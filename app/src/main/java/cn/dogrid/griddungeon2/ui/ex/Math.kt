package cn.dogrid.griddungeon2.ui.ex

fun Float.minusLeast(minus: Float, least: Float = 0f) = (this - minus).coerceAtLeast(least)
fun Int.minusLeast(minus: Int, least: Int = 0) = (this - minus).coerceAtLeast(least)
fun Float.plusMost(adder: Float, most: Float = 0f) = (this + adder).coerceAtMost(most)
fun Int.plusMost(adder: Int, most: Int = 0) = (this + adder).coerceAtMost(most)