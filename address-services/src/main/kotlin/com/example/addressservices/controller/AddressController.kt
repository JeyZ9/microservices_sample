package com.example.addressservices.controller

import com.example.addressservices.models.Address
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/address")
class AddressController {
    @GetMapping("/test")
    fun getTest(): String {
        return "Hello World from Spring Boot with Kotlin"
    }

    @GetMapping
    fun getAddresses(): List<Address> {
        return listOf(
            Address(1, "Bangkok", "Bangkok"),
            Address(2, "Nonthaburi", "Nonthaburi"),
            Address(3, "Pathumthani", "Pathumthani")
        )
    }

    @GetMapping("/{id}")
    fun getAddress(@PathVariable id: Int): Address {
        return Address(id, "Bangkok", "Bangkok")
    }

    @PostMapping
    fun createAddress(@RequestBody address: Address): Address {
        return address
    }

    @PutMapping("/{id}")
    fun updateAddress(@PathVariable id: Int, @RequestBody address: Address): Address {
        return address
    }

    @DeleteMapping("/{id}")
    fun deleteAddress(@PathVariable id: Int): String {
        return "Address id $id has been deleted"
    }
}