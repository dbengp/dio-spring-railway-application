package org.sample.railwayapplication.domain.repository;

import org.sample.railwayapplication.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
