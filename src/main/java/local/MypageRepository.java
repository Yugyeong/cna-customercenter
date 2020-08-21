package local;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MypageRepository extends CrudRepository<Mypage, Long> {

    //List<Mypage> findByOrderId(Long orderId);
    List<Mypage> findByOrderId(Long orderId);

}