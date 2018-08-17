package com.github.pwittchen.rxbattery.library

data class BatteryState(
  val status: Int,
  val plugged: Int,
  val health: Int,
  val level: Int,
  val temperature: Int,
  val voltage: Int
)