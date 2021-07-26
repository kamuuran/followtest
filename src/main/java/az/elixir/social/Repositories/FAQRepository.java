package az.elixir.social.Repositories;

import az.elixir.social.Domain.FAQModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
public interface FAQRepository extends CrudRepository<FAQModel,Integer> {

    List<FAQModel> findAllByLang(String lang);

}
