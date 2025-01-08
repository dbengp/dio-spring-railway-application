package org.sample.railwayapplication.domain.repository;

import org.sample.railwayapplication.domain.model.Feature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeatureRepository extends JpaRepository<Feature, Long> {
}
