package org.sample.railwayapplication.domain.repository;

import org.sample.railwayapplication.domain.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
