package com.asamet.firstlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.asamet.simplealertdialog.SimpleAlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.btn_show_dialog)
        val dialog = SimpleAlertDialog(
            this,
            title = "Warning",
            message = "This is a simple warning",
            positiveButtonText = "Confirm"
        )
        button.setOnClickListener {
            dialog.show()
        }
    }
}