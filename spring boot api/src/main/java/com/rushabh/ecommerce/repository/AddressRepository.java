package com.rushabh.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rushabh.ecommerce.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
