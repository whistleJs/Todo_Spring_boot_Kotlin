package com.example.demo.service

import com.example.demo.repository.TodoRepository
import org.springframework.stereotype.Service

@Service
class TodoService(
        var todoRepository: TodoRepository
) {
}