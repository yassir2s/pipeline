package pack.vendor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pack.vendor.entities.Vendor;
import pack.vendor.repos.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	VendorRepository repo;
	
	@Override
	public Vendor saveVendor(Vendor vendor) {
		return repo.save(vendor);
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		return repo.save(vendor);
	}

	@Override
	public void deleteVondor(Long id) {
		repo.deleteById(id);

	}

	@Override
	public Vendor getVendorById(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Vendor> getAllVendors() {
		return repo.findAll();
	}

}
