package org.example.exercice1spring.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

    private int id;
    private String name;
    private String description;
    private boolean isDone;


}
