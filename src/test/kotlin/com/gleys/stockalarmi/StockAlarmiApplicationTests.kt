package com.gleys.stockalarmi

import org.junit.jupiter.api.Test
import org.springframework.modulith.core.ApplicationModules
import org.springframework.modulith.docs.Documenter
import org.springframework.modulith.test.ApplicationModuleTest

@ApplicationModuleTest
class StockAlarmiApplicationTests {
	private	val modules = ApplicationModules.of(StockAlarmiApplication::class.java)

	@Test
	fun createApplicationModuleModel() {
		modules.forEach{ println(it) }
	}

	@Test
	fun verify() {
		modules.verify()
	}

	@Test
	fun contextLoads() {
		Documenter(modules)
			.writeDocumentation()
			.writeIndividualModulesAsPlantUml()
	}

}