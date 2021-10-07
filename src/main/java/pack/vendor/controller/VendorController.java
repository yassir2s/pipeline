package pack.vendor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pack.vendor.entities.Vendor;
import pack.vendor.services.VendorService;

@Controller
public class VendorController {
	
	@Autowired
	VendorService service;
	
	@RequestMapping("/createVendor")
	public String showCreate() {
		return "createVendor";
	}
	
	@RequestMapping("/saveVendor")
	public String saveVondor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
		Vendor savedVondor = service.saveVendor(vendor);
		String msg = "Vendor with id : "+savedVondor.getId()+ " saved successflly";
		modelMap.addAttribute("msg", msg);
		return "createVendor";
	}
	
	@RequestMapping("viewAllVendors")
	public String saveVondor(ModelMap modelMap) {
		List<Vendor> vendors = service.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendors";
	}
	
	@RequestMapping("editVendor")
	public String editVondor(@RequestParam(name = "id") Long id, ModelMap modelMap) {
		Vendor vendor = service.getVendorById(id);
		vendor = service.saveVendor(vendor);
		modelMap.addAttribute("vendor", vendor);
		return "editVendor";
	}
	
	@RequestMapping("deleteVendor")
	public String deleteVondor(@RequestParam(name = "id") Long id, ModelMap modelMap) {
		service.deleteVondor(id);
		List<Vendor> vendors = service.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendors";
	}

	@RequestMapping("/showEditVendor")
	public String showEditVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
		Vendor savedVondor = service.saveVendor(vendor);
		List<Vendor> vendors = service.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendors";
	}



}
