package com.asamet.simplealertdialog

import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AlertDialog

class SimpleAlertDialog(context: Context,title:String?=null,message:String?=null,
                        positiveButtonText :String = "OK",negativeButtonText :String = "CANCEL",
                        positiveButtonListener :DialogInterface.OnClickListener?=null,
                        negativeButtonListener :DialogInterface.OnClickListener?=null,

) {

    private val dialog :AlertDialog = AlertDialog.Builder(context).create()

    init {
        dialog.apply {
            setTitle(title)
            setMessage(message)
            setButton(AlertDialog.BUTTON_POSITIVE,positiveButtonText,positiveButtonListener)
            setButton(AlertDialog.BUTTON_NEGATIVE,negativeButtonText,negativeButtonListener)
        }
    }

    fun show() {
        dialog.show()
    }

    fun dismiss() {
        dialog.dismiss()
    }
}