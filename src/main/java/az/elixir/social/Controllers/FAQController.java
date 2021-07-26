package az.elixir.social.Controllers;

import az.elixir.social.DTO.FAQDTO;
import az.elixir.social.Services.FAQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class FAQController {

    @Autowired
    private FAQService faqService;

    @RequestMapping(value = "/faq",method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<FAQDTO>> getListOfFAQ(@RequestHeader(value = "lang") String lang) throws Exception {
        List<FAQDTO> faqdtos;
        try{

            faqdtos=faqService.getAllData(lang);


        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

        return new ResponseEntity<>(faqdtos, HttpStatus.OK);


    }
}
