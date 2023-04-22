package com.example.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.PassengerInfo;


public interface PassRepository extends JpaRepository<PassengerInfo,Long > {


}
