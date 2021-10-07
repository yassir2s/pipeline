package pack.vendor;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pack.vendor.entities.Vendor;
import pack.vendor.services.VendorService;

@SpringBootTest
class VendorApplicationTests {
	@Autowired
	VendorService service;
	
	@Test
	void testSaveVendor() {
//		Vendor vendor = new Vendor();
//		vendor.setId(1l);
//		vendor.setName("Yassir");
//		vendor.setCode("YAS");
//		vendor.setType("Regular");
//		vendor.setEmail("benyahia.yasgmail.com");
//		vendor.setPhone("+33769434245");
//		vendor.setAddress("38 rue Rosenwald 75015 Paris");
//		
//		Vendor saveVendor = service.saveVendor(vendor);
//		System.out.println(saveVendor);
	}

}
