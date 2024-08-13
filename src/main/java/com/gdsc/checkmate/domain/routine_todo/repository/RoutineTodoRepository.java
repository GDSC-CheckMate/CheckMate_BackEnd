package com.gdsc.checkmate.domain.routine_todo.repository;

import com.gdsc.checkmate.domain.routine_todo.model.RoutineTodo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoutineTodoRepository extends JpaRepository<RoutineTodo, Long> {

}
