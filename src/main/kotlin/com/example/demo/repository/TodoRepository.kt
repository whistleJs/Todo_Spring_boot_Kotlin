package com.example.demo.repository

import com.example.demo.model.entity.TodoEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository: JpaRepository<TodoEntity, Long>