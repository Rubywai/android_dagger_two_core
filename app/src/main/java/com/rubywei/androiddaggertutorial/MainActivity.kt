package com.rubywei.androiddaggertutorial

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.rubywei.MyApplication
import com.rubywei.androiddaggertutorial.activity.MyComponentEntryPoint
import com.rubywei.androiddaggertutorial.activity.MyComponentManager
import com.rubywei.androiddaggertutorial.activity.One
import com.rubywei.androiddaggertutorial.appdepend.HttpClient
import dagger.hilt.EntryPoints
import dagger.hilt.android.AndroidEntryPoint

import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private  val TAG = "MainActivity"
    @Inject lateinit var httpClient: HttpClient
    @Inject lateinit var myComponentManager: MyComponentManager
    private lateinit var one : One


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.text).setOnClickListener {

            Log.d(TAG, "$httpClient")
            myComponentManager.setString("hello")
            one = EntryPoints.get(myComponentManager.myComponent,MyComponentEntryPoint::class.java).one()
            Log.d(TAG, "$one")






        }
        findViewById<TextView>(R.id.text3).setOnClickListener {

            Log.d(TAG, "{${httpClient.str}}")
            Log.d(TAG, "$one")

        }

    }
}