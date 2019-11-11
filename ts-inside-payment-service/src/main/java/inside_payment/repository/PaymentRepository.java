package inside_payment.repository;

import inside_payment.entity.Payment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface PaymentRepository extends CrudRepository<Payment,String> {
    Optional<Payment> findById(String id);
    List<Payment> findByOrderId(String orderId);
    List<Payment> findAll();
    List<Payment> findByUserId(String userId);
}
