package com.rubywei.androiddaggertutorial.activity

import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn

@InstallIn(MyComponent::class)
@EntryPoint
interface MyComponentEntryPoint{
    fun one() : One
}