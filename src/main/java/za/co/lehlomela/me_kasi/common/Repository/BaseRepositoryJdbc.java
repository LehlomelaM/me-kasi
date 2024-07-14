package za.co.lehlomela.me_kasi.common.Repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface BaseRepositoryJdbc<T, ID> extends Repository<T, ID> {

    <S extends T> S save(S entity);
    Optional<T> findById(ID id);
    List<T> findAll();
}
