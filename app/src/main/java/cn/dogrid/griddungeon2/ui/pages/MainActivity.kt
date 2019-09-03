package cn.dogrid.griddungeon2.ui.pages

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.dogrid.griddungeon2.R
import cn.dogrid.griddungeon2.manager.SelfManager
import kotlinx.android.synthetic.main.activity_main.*

//Login Activity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initLocationData()
    }

    private fun initLocationData() {

        initSlotData()
    }

    private fun initSlotData() {
        cardMainSlot1.setOnClickListener {
            createSlot(SelfManager.SLOT1)
        }
        cardMainSlot2.setOnClickListener {
            createSlot(SelfManager.SLOT2)
        }
        cardMainSlot3.setOnClickListener {
            createSlot(SelfManager.SLOT3)
        }
    }

    private fun createSlot(slot: String) {
        EditDialog().run {
            create(this@MainActivity, "新角色的名字", "名字")
            show({ name, dialog ->
                SelfManager.createSlot(slot, name)
                dialog.dismiss()
            })
        }
    }
}
