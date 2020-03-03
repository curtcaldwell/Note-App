package com.curtcaldwell.top10downloader.util

import android.graphics.Rect
import androidx.recyclerview.widget.RecyclerView


class VerticalSpacingItemDecorator( val verticalSpaceHeight : Int) : RecyclerView.ItemDecoration(){
    override fun getItemOffsets(outRect: Rect, itemPosition: Int, parent: RecyclerView) {
        outRect.bottom = verticalSpaceHeight

    }
}