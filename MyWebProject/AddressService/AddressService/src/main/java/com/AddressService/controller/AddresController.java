package com.AddressService.controller;

import com.AddressService.beans.Address;
import com.AddressService.service.AddressService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddresController {

    AddressService addressService;

    public AddresController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping
    public Address saveAddrss(Address address)
    {
        return this.addressService.addAddress(address);
    }
}
