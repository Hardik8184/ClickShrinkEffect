package com.hardik.clickshrinkeffectdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hardik.clickshrinkeffect.applyClickShrink
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    fab.applyClickShrink()
    card_view.applyClickShrink()
    textView.applyClickShrink()
    imageView.applyClickShrink()
  }
}
