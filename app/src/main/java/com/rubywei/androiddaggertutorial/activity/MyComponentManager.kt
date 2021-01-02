package com.rubywei.androiddaggertutorial.activity

import dagger.hilt.internal.GeneratedComponentManager
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

@Singleton
class MyComponentManager @Inject constructor(
    private  val myComponentBuilder: MyComponent.MyComponentBuilder
) : GeneratedComponentManager<MyComponent>
{
    var myComponent : MyComponent? = null
        private set

     fun setString(str : String){
        myComponent = myComponentBuilder.seString("hello").build()

    }

    override fun generatedComponent(): MyComponent {
       return myComponent!!
    }

}