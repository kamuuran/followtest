package az.elixir.social.Controllers;

import az.elixir.social.DTO.ServiceDTO;
import az.elixir.social.DTO.ServiceGroupDTO;
import az.elixir.social.Domain.ServiceGroupModel;
import az.elixir.social.Services.ServiceGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceGroupContoller {
    @Autowired
    private ServiceGroupService serviceGroupService;


    @RequestMapping(value = "/services-group",method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<ServiceGroupDTO>> getListOfServiceGroup() throws Exception {
        List<ServiceGroupDTO> serviceGroupModels;
        try{
            serviceGroupModels=serviceGroupService.getListofServiceGroup();


        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

        return new ResponseEntity<>(serviceGroupModels, HttpStatus.OK);


    }



}
