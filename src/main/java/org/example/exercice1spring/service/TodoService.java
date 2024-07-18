package org.example.exercice1spring.service;

import org.example.exercice1spring.model.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private final List<Todo> todos;

    public TodoService(List<Todo> todos) {
        this.todos = todos;
    }

    public List<Todo> getAllTodos() {
        return todos;
    }

    public Todo getTodoById(int id) {
        return todos.stream()
                .filter(todo -> todo.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
