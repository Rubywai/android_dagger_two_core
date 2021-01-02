package com.rubywei.androiddaggertutorial.di

import com.rubywei.androiddaggertutorial.appdepend.HttpClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object HttpModule {
    @Singleton
    @Provides
    fun httpClient() = HttpClient("hello")
}