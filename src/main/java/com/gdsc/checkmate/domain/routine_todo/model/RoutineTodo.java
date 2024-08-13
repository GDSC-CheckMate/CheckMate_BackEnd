package com.gdsc.checkmate.domain.routine_todo.model;

import com.gdsc.checkmate.domain.user.model.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "routine_todo")
public class RoutineTodo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint")
    private Long routineId;

    @Column(nullable = false, columnDefinition = "varchar(500)")
    private String routineContent;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DayofWeek routineDay;

    @Column(nullable = false)
    private LocalDateTime routineDate;

    @Column(nullable = false)
    private boolean check;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, columnDefinition = "bigint")
    private User user;

}
