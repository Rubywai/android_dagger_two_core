package com.rubywei.androiddaggertutorial.di

import com.rubywei.androiddaggertutorial.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [HttpModule::class])
interface AppComponent {
    fun activityComponent() : ActivityComponent.Builder
    @Component.Factory
    interface Factory{
        fun start(httpModule: HttpModule) : AppComponent
    }
}