package com.gdsc.checkmate.domain.todo.controller;

import com.gdsc.checkmate.domain.todo.model.Todo;
import com.gdsc.checkmate.domain.todo.service.TodoService;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("/api/routines")
public class TodoController {

    private final TodoService routineService;

    @GetMapping("/{userId}/{date}")
    public ResponseEntity<List<Todo>> getPastRoutines(@PathVariable Long userId,
            @PathVariable LocalDate date) {
        return ResponseEntity.ok(routineService.getRoutinesForPast(userId, date));
    }

    @PostMapping("/add")
    public ResponseEntity<Todo> addRoutine(@RequestParam Long userId, @RequestParam String content,
            @RequestParam LocalDate todoDay, @RequestParam LocalDateTime todoAt) {
        return ResponseEntity.ok(routineService.addRoutine(userId, content, todoDay, todoAt));
    }

}
