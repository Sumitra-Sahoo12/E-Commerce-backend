package com.accolite.ecommercebackend.Service;

import com.accolite.ecommercebackend.dto.Request.AddressRequest;
import com.accolite.ecommercebackend.dto.Response.AllAddressesResponse;

import java.util.UUID;

public interface AddressService {
    AllAddressesResponse getAddressesForUser();

    void saveAddress(AddressRequest addressRequest);

    void updateAddress(UUID addressId, AddressRequest addressRequest);

    void deleteAddress(UUID addressId);
}
