package com.rubywei.androiddaggertutorial.di

import com.rubywei.androiddaggertutorial.MainActivity
import com.rubywei.androiddaggertutorial.activitydependent.PerActivity
import dagger.BindsInstance
import dagger.Subcomponent

@PerActivity
@Subcomponent(modules = [NumberModule::class])
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)
    @Subcomponent.Factory
    interface Builder{
        fun create(@BindsInstance value : Int) : ActivityComponent
    }
}