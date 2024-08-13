package com.gdsc.checkmate.domain.todo.repository;

import com.gdsc.checkmate.domain.todo.model.Todo;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findByUser_UserIdAndTodoDay(Long userId, LocalDate todoDay);
}
