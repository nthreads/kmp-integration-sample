package com.jetbrains.simplelogin.shared

/**
 * SimpleLogin
 * Created by Nauman Zubair on 22 January, 2025
 */
class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}