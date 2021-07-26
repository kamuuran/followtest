package az.elixir.social.Services;

import az.elixir.social.DTO.FAQDTO;

import java.util.List;

public interface FAQService {


    List<FAQDTO> getAllData(String lang);

}
