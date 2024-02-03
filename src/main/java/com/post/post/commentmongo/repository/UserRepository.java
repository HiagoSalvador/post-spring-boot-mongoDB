package com.post.post.commentmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.post.post.commentmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
