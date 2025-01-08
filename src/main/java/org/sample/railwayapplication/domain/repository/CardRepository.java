package org.sample.railwayapplication.domain.repository;

import org.sample.railwayapplication.domain.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
