package org.example.exercice1spring.controller;

import org.example.exercice1spring.model.Todo;
import org.example.exercice1spring.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {
    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("/todos")
    public String getAllTodos(Model model) {
        List<Todo> todos = todoService.getAllTodos();
        model.addAttribute("todos", todos);
        return "todo";
    }

    @RequestMapping("/todos/{id}")
    public String getTodoById(Model model, @PathVariable int id) {
        Todo todo = todoService.getTodoById(id);
        model.addAttribute("todo", todo);
        return "detail";
    }
}
