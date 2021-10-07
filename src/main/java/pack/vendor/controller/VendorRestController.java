package pack.vendor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pack.vendor.entities.Vendor;
import pack.vendor.services.VendorService;

@RestController
public class VendorRestController {
	
	@Autowired
	VendorService service;
	
	//@GetMapping("/vendors")
	@RequestMapping(value = "/vendors", method = RequestMethod.GET)
	public List<Vendor> getAllVendors(){
		
		return service.getAllVendors();
	}
	
	@GetMapping("/vendors/{id}")
	public Vendor getAllVendorById(@PathVariable("id")	Long id){
		
		return service.getVendorById(id);
	}
	
	@RequestMapping(value = "/vendors", method = RequestMethod.POST)
	//@PostMapping("/vendors")
	public Vendor createVendor(@RequestBody Vendor vendor){
		
		return service.saveVendor(vendor);
	}
	
	@PutMapping("/vendors")
	public Vendor updateVendor(@RequestBody Vendor vendor){
		
		return service.saveVendor(vendor);
	}
	
	@DeleteMapping("/vendors/{id}")
	public void deleteVendor(@PathVariable("id") Long id){
		
		service.deleteVondor(id);
	}





}
