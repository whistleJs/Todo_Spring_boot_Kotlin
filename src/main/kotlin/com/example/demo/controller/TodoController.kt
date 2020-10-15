package com.example.demo.controller

import com.example.demo.model.entity.TodoEntity
import com.example.demo.model.response.TodoResponse
import com.example.demo.service.TodoService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/todo")
class TodoController(
        var todoService: TodoService
) {
    @PostMapping
    fun create(todoResponse: TodoResponse): TodoEntity {
        return todoService.create(todoResponse)
    }
}