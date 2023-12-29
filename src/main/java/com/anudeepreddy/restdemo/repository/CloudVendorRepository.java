package com.anudeepreddy.restdemo.repository;

import com.anudeepreddy.restdemo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,String > {

    List<CloudVendor> findByVendorName(String vendorName);
}
