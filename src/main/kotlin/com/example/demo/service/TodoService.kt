package com.example.demo.service

import com.example.demo.model.entity.TodoEntity
import com.example.demo.model.response.TodoResponse
import com.example.demo.repository.TodoRepository
import org.springframework.stereotype.Service
import javax.persistence.NoResultException

@Service
class TodoService(
        var todoRepository: TodoRepository
) {
    fun findAll(): List<TodoEntity> {
        return todoRepository.findAll()
                .filter { t: TodoEntity -> t.deletedAt == null }
    }

    fun findById(id: Long): TodoEntity {
        return todoRepository.findById(id)
                .filter { t: TodoEntity -> t.deletedAt == null }
                .orElseThrow { NoResultException("No result id : " + id) }
    }

    fun findByKeyword(keyword: String): List<TodoEntity> {
        return todoRepository.findByTitleLike(keyword)
                .filter { t: TodoEntity -> t.deletedAt == null }
    }

    fun create(response: TodoResponse): TodoEntity {
        var entity = TodoEntity.of(response)

        return todoRepository.save(entity)
    }
}