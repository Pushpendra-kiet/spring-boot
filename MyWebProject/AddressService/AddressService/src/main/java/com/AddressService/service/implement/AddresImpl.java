package com.AddressService.service.implement;

import com.AddressService.beans.Address;
import com.AddressService.repo.AddressRepo;
import com.AddressService.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddresImpl implements AddressService {
    AddressRepo addressRepo;

    public AddresImpl(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }

    @Override
    public Address addAddress(Address address) {
        return this.addressRepo.save(address);
    }

    @Override
    public List<Address> getAll() {
        return this.addressRepo.findAll();
    }
}
