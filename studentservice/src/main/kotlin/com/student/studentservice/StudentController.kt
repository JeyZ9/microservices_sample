package com.student.studentservice

import com.student.studentservice.models.Student
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/students")
class StudentController {
    @GetMapping("/test")
    fun getTest(): String {
        return "Hello World from Spring Boot with Kotlin"
    }

    @GetMapping
    fun getStudents(): List<Student> {
        return listOf(
            Student(1, "John McAthee", 20),
            Student(2, "Mary Crismas", 21),
            Student(3, "Peter Parker", 22),
            Student(4, "David Siemon", 23),
            Student(5, "Bob Malea", 24)
        )
    }

    @GetMapping("/{id}")
    fun getStudent(@PathVariable id: Int): Student {
        return Student(id, "John", 20)
    }

    @PostMapping
    fun createStudent(@RequestBody student: Student): Student {
        return student
    }

    @PutMapping("/{id}")
    fun updateStudent(@PathVariable id: Int, @RequestBody student: Student): Student {
        return student
    }

    @DeleteMapping("/{id}")
    fun deleteStudent(@PathVariable id: Int): String {
        return "Student id $id has been deleted"
    }

}