package org.example.exercice1spring.controller;

import org.example.exercice1spring.model.Todo;
import org.example.exercice1spring.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
}



//Exercice 1
//On souhaite cree une application Spring de Todos.
//
//Une Todo :
//
//name
//description
//etat (isDone) (boolean)
//On utilisera un service qui contient notre collection de TODOs.
//
//On souhaite 2 routes (minimum) :
//
//l'affichage d'une TODO en particulier
//l'affichage de la listes des TODOS