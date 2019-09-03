package cn.dogrid.griddungeon2.ui.view

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.widget.TextView
import androidx.cardview.widget.CardView
import cn.dogrid.griddungeon2.ex.minusLeast

class TapCard(ctx: Context, attrs: AttributeSet) : CardView(ctx, attrs) {

    val _cardElevationVal by lazy { cardElevation }

    init {
        setOnClickListener { }
        setOnTouchListener { _, ev ->
            Log.e("tap touch event", "${ev.action}")
            when (ev.action) {
                MotionEvent.ACTION_DOWN -> {
                    _tapDown()
                }
                MotionEvent.ACTION_UP -> {
                    _tapUp()
                }
            }
            super.onTouchEvent(ev)
        }
    }

    private fun _tapUp() {
        cardElevation = _cardElevationVal
    }

    private fun _tapDown() {
        cardElevation = _cardElevationVal.minusLeast(12f)
    }

    fun setText(content: String) {
        getChildAt(0).let { if (it is TextView) it.text = content }
    }
}