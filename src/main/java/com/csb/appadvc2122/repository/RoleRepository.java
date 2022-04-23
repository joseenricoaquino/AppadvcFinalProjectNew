package com.csb.appadvc2122.repository;

import com.csb.appadvc2122.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long>  {


    Role findByName(String name);

}
