package com.csb.appadvc2122.repository;

import com.csb.appadvc2122.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface UserAddressRepository extends CrudRepository<Address, Long> {
}
