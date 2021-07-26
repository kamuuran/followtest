package az.elixir.social.Controllers;


import az.elixir.social.DTO.ServiceSubGroupDTO;
import az.elixir.social.Domain.ServiceGroupModel;
import az.elixir.social.Domain.ServiceSubGroupModel;
import az.elixir.social.Services.ServiceGroupService;
import az.elixir.social.Services.ServiceSubGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceSubGroupController {

@Autowired
    private ServiceGroupService serviceGroupService;

@Autowired
    private ServiceSubGroupService serviceSubGroupService;



    @RequestMapping(value = "/services-sub-group",method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<ServiceSubGroupDTO>> getListOfServiceGroup(@RequestHeader(value = "groupId") int id,@RequestHeader(value = "lang") String lang) throws Exception {
        List<ServiceSubGroupDTO> serviceSubGroupModels;
        try{
            ServiceGroupModel serviceGroupModel = serviceGroupService.getServiceGroup(id);
            serviceSubGroupModels=serviceSubGroupService.getListOfSubGroup(serviceGroupModel,lang);


        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

        return new ResponseEntity<>(serviceSubGroupModels, HttpStatus.OK);


    }






}
