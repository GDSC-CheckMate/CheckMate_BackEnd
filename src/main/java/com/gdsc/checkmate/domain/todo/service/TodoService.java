package com.gdsc.checkmate.domain.todo.service;


import com.gdsc.checkmate.domain.todo.model.Todo;
import com.gdsc.checkmate.domain.todo.repository.TodoRepository;
import com.gdsc.checkmate.domain.user.model.User;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public List<Todo> getRoutinesForPast(Long userId, LocalDate date) {
        return todoRepository.findByUser_UserIdAndTodoDay(userId, date);
    }
    public Todo addRoutine(Long userId, String content, LocalDate todoDay, LocalDateTime todoAt){
        Todo todo = new Todo();
        todo.setUser(new User(userId));
        todo.setContent(content);
        todo.setTodoDay(todoDay);
        todo.setTodoAt(todoAt);
        return todoRepository.save(todo);
    }

}
