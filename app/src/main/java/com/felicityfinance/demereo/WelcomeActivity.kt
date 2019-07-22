package com.felicityfinance.demereo

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.media.Image
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager

class WelcomeActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private lateinit var dotsLayout: LinearLayout
    private lateinit var dots: Array<ImageView?>
    private var layouts: IntArray = intArrayOf(R.layout.slider1, R.layout.slider2, R.layout.slider3, R.layout.activity_main)
    private var onPageChangeListener = object: ViewPager.OnPageChangeListener {

        override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            //TODO("not implemented") To change body of created functions use File | Settings | File Templates.
        }

        //@RequiresApi(Build.VERSION_CODES.M)
        override fun onPageSelected(position: Int) {
            createDots(position)
           /*var color = ColorDrawable(1)
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
            //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_welcome)

        this.viewPager = findViewById(R.id.viewPager)
        this.viewPagerAdapter = ViewPagerAdapter(layouts, this)
        this.viewPager.adapter = this.viewPagerAdapter
        this.dotsLayout = findViewById(R.id.dotsLayout)
        this.viewPager.addOnPageChangeListener(onPageChangeListener)
        createDots(0)
    }

    private fun createDots(currentPosition: Int){
        //Toast.makeText(this, currentPosition.toString(), Toast.LENGTH_LONG).show()
        this.dots = Array(layouts.size, init = {ImageView(this)})
        if(dotsLayout!=null){
            this.dotsLayout.removeAllViews()
        }
        for (i in 0 until layouts.size){
            dots[i] = ImageView(this)
            if (i == currentPosition){
                dots[i]!!.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.active_dots))
            }else{
                dots[i]!!.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.inactive_dots))
            }

            val params: LinearLayout.LayoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            params.setMargins(4,0,4,0)
            dotsLayout.addView(dots[i], params)
        }



    }


}
