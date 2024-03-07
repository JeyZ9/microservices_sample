package com.example.addressservices

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient // บอกให้ spring boot รู้จัก Eureka server
class AddressServicesApplication

fun main(args: Array<String>) {
	runApplication<AddressServicesApplication>(*args)
}
