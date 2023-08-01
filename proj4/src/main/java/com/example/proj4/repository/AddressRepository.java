package com.example.proj4.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proj4.model.Address;

public interface AddressRepository extends JpaRepository< Address, Long> {
    
}
