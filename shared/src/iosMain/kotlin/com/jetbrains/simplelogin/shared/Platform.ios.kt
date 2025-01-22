package com.jetbrains.simplelogin.shared

/**
 * SimpleLogin
 * Created by Nauman Zubair on 22 January, 2025
 */
import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()
