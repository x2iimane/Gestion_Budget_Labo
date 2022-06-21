package com.fssm.web.repositories;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.budget.interfaces.CustomUser;
import com.budget.models.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByEmail(String email);
	Optional<User> findByUsername(String username);
	
	Boolean existsByEmail(String email);
	Boolean existsByUsername(String username);
	
	
	@Query(value = "SELECT u.id as id,u.username as username, u.nom as nom, u.email as email, r as role,l as laboratoire   FROM User u JOIN u.roles r JOIN u.laboratoire l ORDER BY u.id DESC")
    Page<CustomUser> getAll(Pageable pageable);
}

