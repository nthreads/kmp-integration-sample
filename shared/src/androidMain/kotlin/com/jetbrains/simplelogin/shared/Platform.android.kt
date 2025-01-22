package com.jetbrains.simplelogin.shared

/**
* SimpleLogin
* Created by Nauman Zubair on 22 January, 2025
*/

import android.os.Build

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()