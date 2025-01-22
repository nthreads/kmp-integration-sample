package com.jetbrains.simplelogin.shared

import platform.Foundation.NSUUID

/**
 * SimpleLogin
 * Created by Nauman Zubair on 22 January, 2025
 */

actual fun randomUUID() = NSUUID().UUIDString()