package com.app.babybaby.repository.board.review;

import com.app.babybaby.repository.board.review.ReviewRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(false)
public class ReviewRepositoryTests {
    @Autowired
    ReviewRepository reviewRepository;
}
