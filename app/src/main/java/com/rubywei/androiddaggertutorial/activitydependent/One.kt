package com.rubywei.androiddaggertutorial.activitydependent

import javax.inject.Inject
import javax.inject.Named


@PerActivity
//progaurd will look
class One @Inject constructor(private var value : Int) : MyNumber {
    override fun value(): Int = value
}