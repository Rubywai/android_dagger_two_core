package com.rubywei.androiddaggertutorial.di

import com.rubywei.androiddaggertutorial.activitydependent.MyNumber
import com.rubywei.androiddaggertutorial.activitydependent.One
import com.rubywei.androiddaggertutorial.activitydependent.Two
import dagger.Binds
import dagger.Module
import javax.inject.Named


@Module
abstract class NumberModule {

    @Binds
    @Named("one")
    abstract fun getNumberOne(one : One)  : MyNumber

    @Binds
    @Named("two")
    abstract fun getNumberTwo(two : Two) : MyNumber
}