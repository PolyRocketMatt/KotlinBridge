package com.github.polyrocketmatt.kbridge

import org.bukkit.plugin.java.JavaPlugin

class KotlinBridge : JavaPlugin() {

    override fun onEnable() {
        println("KotlinBridge has been enabled!")
    }

    override fun onDisable() {
        println("KotlinBridge has been disabled!")
    }

}