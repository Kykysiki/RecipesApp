package me.bulkanovga.recipesapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/")
    public String helloWorld() {
        return "Приложение запущено";
    }
    @GetMapping("/info")
    public String info() {
        return "Имя ученика - Глеб, Название проекта - Рецепты, Дата создания - 04.01.2023, Описание проекта - в отдельном файле description.md.";
    }
}
