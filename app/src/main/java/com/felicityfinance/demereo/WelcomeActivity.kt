package com.felicityfinance.demereo

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager

class WelcomeActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private var layouts: IntArray = intArrayOf(R.layout.slider1, R.layout.slider2, R.layout.slider3, R.layout.activity_main)
    private var onPageChangeListener = object: ViewPager.OnPageChangeListener {

        override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        @RequiresApi(Build.VERSION_CODES.M)
        override fun onPageSelected(position: Int) {
           /* var color = ColorDrawable(1)
            when(position){
                1 -> color.color = getColor(R.color.sliderPage1)
                2 -> color.color = getColor(R.color.sliderPage2)
                3 -> color.color = getColor(R.color.sliderPage3)
                else -> color.color = getColor(R.color.defaultColor)
            }
            window.statusBarColor = color.color*/
            //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onPageScrollStateChanged(state: Int) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_welcome)

        this.viewPager = findViewById(R.id.viewPager)
        this.viewPagerAdapter = ViewPagerAdapter(layouts, this)
        this.viewPager.adapter = this.viewPagerAdapter
       // this.viewPager.addOnPageChangeListener(onPageChangeListener)
    }


}
