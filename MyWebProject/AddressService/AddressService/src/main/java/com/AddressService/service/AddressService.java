package com.AddressService.service;

import com.AddressService.beans.Address;

import java.util.List;

public interface AddressService {

    Address addAddress(Address address);
    List<Address> getAll();
}
