package com.bitiot.volga3_login.app.repositories;

import com.bitiot.volga3_login.app.models.ERole;
import com.bitiot.volga3_login.app.models.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    Optional<RoleEntity> findByName(ERole name);
}
