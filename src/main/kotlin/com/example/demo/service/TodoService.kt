package com.example.demo.service

import com.example.demo.model.entity.TodoEntity
import com.example.demo.model.response.TodoResponse
import com.example.demo.repository.TodoRepository
import org.springframework.stereotype.Service

@Service
class TodoService(
        var todoRepository: TodoRepository
) {
    fun create(response: TodoResponse): TodoEntity {
        var entity = TodoEntity.of(response)

        return todoRepository.save(entity)
    }
}