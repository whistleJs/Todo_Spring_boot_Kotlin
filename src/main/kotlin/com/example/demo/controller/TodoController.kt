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

    @PostMapping
    fun create(@RequestBody todoResponse: TodoResponse): TodoEntity {
        return todoService.create(todoResponse)
    }
}