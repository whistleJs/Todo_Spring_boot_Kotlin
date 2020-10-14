package com.example.demo.model.entity

import java.time.LocalDateTime
import javax.persistence.Entity

@Entity(name = "todo")
class TodoEntity(
        var title: String,
        var content: String,

        var deletedAt: LocalDateTime? = null
): BaseEntity()