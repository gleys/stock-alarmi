package com.gleys.stockalarmi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StockAlarmiApplication

fun main(args: Array<String>) {
	runApplication<StockAlarmiApplication>(*args)
}
