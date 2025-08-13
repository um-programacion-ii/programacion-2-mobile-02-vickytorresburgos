package com.example.tp1kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform