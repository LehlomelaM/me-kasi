package za.co.lehlomela.me_kasi.business;

import org.springframework.stereotype.Repository;
import za.co.lehlomela.me_kasi.common.Repository.BaseRepositoryJdbc;

@Repository
public interface BusinessRepository extends BaseRepositoryJdbc<Business, Long> {

}
