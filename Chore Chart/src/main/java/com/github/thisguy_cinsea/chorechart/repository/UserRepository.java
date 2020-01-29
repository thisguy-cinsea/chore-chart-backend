package com.github.thisguy_cinsea.chorechart.repository;

import com.github.thisguy_cinsea.chorechart.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
