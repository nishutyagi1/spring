package com.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graphql.entity.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {

}
