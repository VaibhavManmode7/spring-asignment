// CustomerRepository.java (JPA Repository)

public class costomerRepo {
	public interface CustomerRepository extends JpaRepository<Customer, Long> {
	    Optional<Customer> findByUuid(String uuid);
	}
	package Models;

}
