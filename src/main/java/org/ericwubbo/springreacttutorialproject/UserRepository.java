package org.ericwubbo.springreacttutorialproject;

import org.springframework.data.jpa.repository.JpaRepository;

// step_4
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
