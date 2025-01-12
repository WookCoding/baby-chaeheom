package com.app.babybaby.repository.user.user;

import com.app.babybaby.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>, UserQueryDsl {
}
