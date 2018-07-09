package com.alpere.habrreactivemongo.repository;

import com.alpere.habrreactivemongo.domain.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
}
