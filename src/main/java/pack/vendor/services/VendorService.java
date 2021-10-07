package pack.vendor.services;

import java.util.List;

import pack.vendor.entities.Vendor;

public interface VendorService {
	
	public Vendor saveVendor(Vendor vendor);
	public Vendor updateVendor(Vendor vendor);
	public void   deleteVondor(Long id);
	public Vendor getVendorById(Long id);
	public List<Vendor> getAllVendors();
	

}
