package com.post.commentmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.post.commentmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}