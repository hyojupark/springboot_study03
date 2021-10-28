package com.example.todo.service;

import com.example.todo.model.TodoEntity;
import com.example.todo.persistence.TodoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public String testService() {
        TodoEntity todoEntity = TodoEntity.builder().title("My first todo item").build();
        todoRepository.save(todoEntity);
        TodoEntity savedEntity = todoRepository.findById(todoEntity.getId()).orElseThrow(() ->
                new IllegalArgumentException("해당 아이템이 없습니다. id=" + todoEntity.getId()));
//        Optional<TodoEntity> savedEntity = todoRepository.findById(todoEntity.getId());

        return savedEntity.getTitle();
    }
}
