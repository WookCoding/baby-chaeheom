package com.app.babybaby.repository.user.crew;


import com.app.babybaby.entity.user.Crew;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrewRepository extends JpaRepository<Crew, Long>, CrewQueryDsl{
}
