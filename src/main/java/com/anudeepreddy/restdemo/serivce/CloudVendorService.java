package com.anudeepreddy.restdemo.serivce;

import com.anudeepreddy.restdemo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);

    public String updateCloudVendor(CloudVendor cloudVendor);

    public String deleteCloudVendor(String cloudvendorId);

    public CloudVendor getCloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();
   public List<CloudVendor> getByVendorName(String vendorName);
}