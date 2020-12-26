package com.rubywei.androiddaggertutorial.di

import com.rubywei.androiddaggertutorial.activitydependent.MyNumber
import com.rubywei.androiddaggertutorial.activitydependent.One
import dagger.Binds
import dagger.Module
import javax.inject.Named


@Module
abstract class NumberModule {

    @Binds
    abstract fun getNumber(one : One)  : MyNumber
}