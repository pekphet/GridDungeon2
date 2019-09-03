package cn.dogrid.griddungeon2.ui.pages

import android.app.Dialog
import android.content.Context
import android.widget.EditText
import android.widget.TextView
import cn.dogrid.griddungeon2.R
import cn.dogrid.griddungeon2.ex.toast
import cn.dogrid.griddungeon2.ui.view.TapCard


class EditDialog {
    private var mDialog: Dialog? = null
    private lateinit var mEt: EditText
    private lateinit var mCardAgree: TapCard
    private lateinit var mCardIgnore: TapCard

    fun create(ctx: Context, title: String, hint: String, agreeBtn: String = "好 啦", ignoreBtn: String = "取 消") {
        if (mDialog != null) {
            return
        }
        mDialog = Dialog(ctx, R.style.BaseDialog).apply {
            setContentView(R.layout.d_edit)
            findViewById<TextView>(R.id.tvEditDTitle).text = title
            mEt = findViewById(R.id.etEditDInput)
            setCanceledOnTouchOutside(false)
            setCancelable(false)
            mCardAgree = findViewById(R.id.tapEditDAgree)
            mCardIgnore = findViewById(R.id.tapEditDCancel)
        }
        mEt.hint = hint
        mCardAgree.setText(agreeBtn)
        mCardIgnore.setText(ignoreBtn)
    }

    fun show(agree: (String, EditDialog) -> Unit, ignore: () -> Unit = {}) {
        mCardAgree.setOnClickListener {
            val result = mEt.text.toString()
            if (result.isBlank()) {
                mDialog?.context?.toast("请输入内容")
            } else {
                agree(result, this@EditDialog)
            }
        }
        mCardIgnore.setOnClickListener {
            ignore()
            dismiss()
        }
        mDialog?.show()
    }

    fun dismiss() {
        mDialog?.dismiss()
        mDialog = null
    }
}