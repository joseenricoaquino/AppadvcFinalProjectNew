package com.csb.appadvc2122.services.impl;

import com.csb.appadvc2122.dto.AddressDTO;
import com.csb.appadvc2122.model.Address;
import com.csb.appadvc2122.repository.UserAddressRepository;
import com.csb.appadvc2122.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    UserAddressRepository userAddressRepository;

    @Override
    public void add(AddressDTO address) {
        userAddressRepository.save(new Address(address));
    }

}
