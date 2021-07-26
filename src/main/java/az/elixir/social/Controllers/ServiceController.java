package az.elixir.social.Controllers;


import az.elixir.social.DTO.ServiceDTO;
import az.elixir.social.Domain.ServiceSubGroupModel;
import az.elixir.social.Services.ServiceSubGroupService;
import az.elixir.social.Services.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServiceController {

    @Autowired
    private ServicesService servicesService;

    @Autowired
    private ServiceSubGroupService serviceSubGroupService;


    @RequestMapping(value = "/services",method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<ServiceDTO>> getlistOfService(@RequestHeader(value = "subGroupId") int id,@RequestHeader(value = "lang") String lang) throws Exception {
        List<ServiceDTO> serviceDTOS;
        try{
            ServiceSubGroupModel serviceSubGroupModel =serviceSubGroupService.getServiceSubgGroup(id);

            serviceDTOS=servicesService.listOfService(serviceSubGroupModel,lang);


        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

        return new ResponseEntity<>(serviceDTOS, HttpStatus.OK);


    }




}
