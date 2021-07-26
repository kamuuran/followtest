package az.elixir.social.Repositories;

import az.elixir.social.Domain.ServiceGroupModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceGroupRepository extends CrudRepository<ServiceGroupModel,Integer> {

    List<ServiceGroupModel> findAll();
}
