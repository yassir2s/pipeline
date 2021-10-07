package pack.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import pack.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Long> {

}
