package com.gdsc.checkmate.domain.user.repository;

import com.gdsc.checkmate.domain.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
