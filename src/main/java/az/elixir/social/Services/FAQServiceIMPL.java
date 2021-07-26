package az.elixir.social.Services;


import az.elixir.social.DTO.FAQDTO;
import az.elixir.social.Domain.FAQModel;
import az.elixir.social.Repositories.FAQRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FAQServiceIMPL implements FAQService {

    @Autowired
    private FAQRepository faqRepository;



    @Override
    public List<FAQDTO> getAllData(String lang) {
        List<FAQDTO> faqdtos = new ArrayList<>();


        try{
            List<FAQModel> faqModels = faqRepository.findAllByLang(lang);
            for(int i=0;i<faqModels.size();i++){
                FAQDTO faqdto = new FAQDTO();

                faqdto.setQuestion(faqModels.get(i).getQuestion());

                faqdto.setAnswer(faqModels.get(i).getAnswer());
                faqdtos.add(faqdto);





            }







        }catch (Exception e){

        }


        return faqdtos;
    }
}
