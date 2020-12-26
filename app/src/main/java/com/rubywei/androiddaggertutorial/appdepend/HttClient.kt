package com.rubywei.androiddaggertutorial.appdepend

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton


class HttpClient(var str : String){

    fun retrofitStart(){
        Log.d("MainActivity", "retrofitStart: ")
    }
}