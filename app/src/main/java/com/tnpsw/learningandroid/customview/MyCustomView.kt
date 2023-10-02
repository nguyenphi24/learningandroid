package com.tnpsw.learningandroid.customview

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

/**
 * Created by tnphi on 10/3/2023.
 */
class MyCustomView: FrameLayout {
    constructor(context: Context) : this(context, null)

    constructor(context: Context, attr: AttributeSet?) : this(context, attr, 0)

    constructor(context: Context, attr: AttributeSet?, defStyle: Int) : super(
        context,
        attr,
        defStyle
    ) {

    }
}