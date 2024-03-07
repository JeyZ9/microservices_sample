package com.example.discovery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer //ประกาศให้เป็น Eureka server
class DiscoveryApplication

fun main(args: Array<String>) {
	runApplication<DiscoveryApplication>(*args)
}
