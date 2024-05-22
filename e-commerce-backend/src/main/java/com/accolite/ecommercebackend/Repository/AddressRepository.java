package com.accolite.ecommercebackend.Repository;

import com.accolite.ecommercebackend.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
