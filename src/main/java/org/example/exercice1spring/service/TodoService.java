package org.example.exercice1spring.service;

import org.example.exercice1spring.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private List<Todo> todos = new ArrayList<>();

    public TodoService(List<Todo> todos) {
        this.todos = todos;
    }

    public List<Todo> getAllTodos() {

        todos.add(new Todo(1,"toto","description", true));
        todos.add(new Todo(2, "tata", "description", false));

        return todos;
    }

    public Todo getTodoById(int id) {
        return todos.stream()
                .filter(todo -> todo.getId() == id)
                .findFirst()
                .orElse(null);
    }

}
