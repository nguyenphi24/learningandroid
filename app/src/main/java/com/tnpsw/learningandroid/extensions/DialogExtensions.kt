package com.tnpsw.learningandroid.extensions

import android.content.Context
import androidx.appcompat.app.AlertDialog

/**
 * Created by tnphi on 10/3/2023.
 */

fun Context.showMessage(message: String) {
    val alertDialog = AlertDialog.Builder(this)
        .setPositiveButton("OK") { dialog, _ ->
            dialog.dismiss()
        }
        .setMessage(message)
    alertDialog.create().show()
}