package com.example.demo.model.entity

import com.example.demo.model.response.TodoResponse
import java.time.LocalDateTime
import javax.persistence.Entity

@Entity(name = "todo")
class TodoEntity(
        var title: String,
        var content: String,

        var deletedAt: LocalDateTime? = null
): BaseEntity() {
    companion object {
        fun of(data: TodoResponse): TodoEntity {
            return TodoEntity(data.title, data.content)
        }
    }
}