package com.rubywei.androiddaggertutorial.activity

import dagger.BindsInstance
import dagger.hilt.DefineComponent
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.components.SingletonComponent

@PerActivity
@DefineComponent(parent = ApplicationComponent::class)

interface MyComponent {

    @DefineComponent.Builder
    interface MyComponentBuilder{
        fun seString(@BindsInstance str : String) : MyComponentBuilder
        fun build() : MyComponent
    }
}