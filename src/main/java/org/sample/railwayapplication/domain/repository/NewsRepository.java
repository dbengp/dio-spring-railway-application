package org.sample.railwayapplication.domain.repository;

import org.sample.railwayapplication.domain.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}
