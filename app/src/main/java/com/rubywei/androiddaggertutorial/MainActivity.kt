package com.rubywei.androiddaggertutorial

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.rubywei.MyApplication
import com.rubywei.androiddaggertutorial.appdepend.HttpClient
import com.rubywei.androiddaggertutorial.activitydependent.MyNumber

import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    private  val TAG = "MainActivity"
    @Inject lateinit var httpClient: HttpClient
    @Inject lateinit var number : MyNumber

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.text).setOnClickListener {
            val activityComponent =  (application as MyApplication)
                    .getComponent()
                    .activityComponent()
                    .create(20)
            activityComponent.inject(this)
            Log.d(TAG, "$httpClient")
            Log.d(TAG, "{${number.value()}}")
        }
        findViewById<TextView>(R.id.text3).setOnClickListener {
            Log.d(TAG, "{${number}}")
            Log.d(TAG, "{${httpClient.str}}")
        }

    }
}