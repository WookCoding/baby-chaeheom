package com.app.babybaby.repository.like.event;

import com.app.babybaby.entity.like.eventLike.EventLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventLikeRepository extends JpaRepository<EventLike, Long>, EventLikeQueryDsl {
}
