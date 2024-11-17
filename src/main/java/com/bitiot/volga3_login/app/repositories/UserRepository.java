package com.bitiot.volga3_login.app.repositories;

import com.bitiot.volga3_login.app.models.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    Optional<UserEntity> findByUsername(String username);

    Optional<UserEntity> findByEmail(String email);

//    @Query("select u from UserEntity u where u.username = ?1")
//    Optional<UserEntity> getName(String username);
}
