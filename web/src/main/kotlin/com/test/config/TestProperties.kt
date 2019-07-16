package com.test.config

import org.springframework.boot.context.properties.ConfigurationProperties

// TODO Use "val" instead of "lateinit var" when spring-boot#8762 will be fixed

// Carga las properties que están anidadas dentro de "test" del archivo application.yml
@ConfigurationProperties("test")
class TestProperties {

	lateinit var title: String

}