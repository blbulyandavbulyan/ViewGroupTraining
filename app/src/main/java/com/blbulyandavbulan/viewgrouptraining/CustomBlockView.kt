package com.blbulyandavbulan.viewgrouptraining

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout

class CustomBlockView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) :
    LinearLayout(context, attrs) {
    init {
        inflate(context, R.layout.custom_block_layout, this)
    }
}