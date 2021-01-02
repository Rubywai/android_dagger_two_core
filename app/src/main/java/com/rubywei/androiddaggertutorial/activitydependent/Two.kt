package com.rubywei.androiddaggertutorial.activitydependent

import javax.inject.Inject
import javax.inject.Named

@PerActivity
 //Progaurd will look
class Two @Inject constructor() : MyNumber {
    override fun value(): Int = 2
}