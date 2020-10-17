package com.example.demo.controller

import com.example.demo.model.entity.TodoEntity
import com.example.demo.model.response.TodoResponse
import com.example.demo.service.TodoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/todo")
class TodoController(
        var todoService: TodoService
) {
    @GetMapping
    fun findAll(): List<TodoEntity> {
        return todoService.findAll()
    }

    @GetMapping("{id}")
    fun findById(@PathVariable id: Long): TodoEntity {
        return todoService.findById(id)
    }

    @GetMapping("/search/{keyword}")
    fun findByKeyword(@PathVariable keyword: String): List<TodoEntity> {
        return todoService.findByKeyword(keyword)
    }

    @PostMapping
    fun create(@RequestBody todoResponse: TodoResponse): TodoEntity {
        return todoService.create(todoResponse)
    }
}