package com.felicityfinance.demereo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter

class ViewPagerAdapter(layouts: IntArray, context: Context) : PagerAdapter() {

    private var layouts: IntArray = layouts
    private var context: Context = context
    private var layoutInflater: LayoutInflater = LayoutInflater.from(context)

    override fun getCount(): Int{
        return layouts.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view==`object`
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view: View = layoutInflater.inflate(layouts[position], container, false)
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val view: View = `object` as View
        container.removeView(view)
    }
}