package com.epam.elastic_kafka_rnd.uaa.repository;

import com.epam.elastic_kafka_rnd.uaa.domain.Authority;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {
}
