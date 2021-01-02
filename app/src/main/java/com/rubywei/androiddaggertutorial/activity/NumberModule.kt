package com.rubywei.androiddaggertutorial.activity

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn


@Module
@InstallIn(MyComponent::class)
object NumberModule {
    @Provides
    @PerActivity
    fun getNumber(str : String) : One= One(str)
}