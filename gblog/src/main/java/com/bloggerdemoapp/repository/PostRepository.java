package com.bloggerdemoapp.repository;

import com.bloggerdemoapp.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}