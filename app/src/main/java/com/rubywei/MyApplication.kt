package com.rubywei

import android.app.Application
import com.rubywei.androiddaggertutorial.di.AppComponent
import com.rubywei.androiddaggertutorial.di.DaggerAppComponent
import com.rubywei.androiddaggertutorial.di.HttpModule


class MyApplication : Application() {
  private  val myComponent : AppComponent by lazy {
      DaggerAppComponent.factory()
              .start(HttpModule("Volley Library"))
  }
    fun getComponent() = myComponent

}