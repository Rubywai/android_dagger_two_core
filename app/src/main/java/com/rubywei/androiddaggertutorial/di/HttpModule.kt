package com.rubywei.androiddaggertutorial.di

import com.rubywei.androiddaggertutorial.appdepend.HttpClient
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class HttpModule(var str : String) {
    @Singleton
    @Provides
    fun httpClient() = HttpClient(str)
}