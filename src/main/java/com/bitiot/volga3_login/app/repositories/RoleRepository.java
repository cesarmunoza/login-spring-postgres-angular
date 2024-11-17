package com.bitiot.volga3_login.app.repositories;

import com.bitiot.volga3_login.app.models.RoleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<RoleEntity, Long> {
}
