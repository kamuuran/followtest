package az.elixir.social.Controllers;

import az.elixir.social.DTO.OrderDTO;
import az.elixir.social.DTO.OrderDetailsDTO;

import az.elixir.social.Domain.ServicesModel;
import az.elixir.social.Services.ServicesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class CalculateController {
    @Autowired
    private ServicesService servicesService;

    @RequestMapping(value = "/calculate",method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
    public ResponseEntity<OrderDetailsDTO> checkServiceID(@RequestBody(required=false) OrderDTO orderDTO) throws Exception {

        OrderDetailsDTO orderDetailsDTO = new OrderDetailsDTO();

        System.out.println(orderDTO.toString());

        try{

            ServicesModel servicesModel = servicesService.getById(orderDTO.getServiceId());
            orderDetailsDTO.setDescription(servicesModel.getDescription());
            orderDetailsDTO.setStatus("Active");
            orderDetailsDTO.setPrice(orderDTO.getQuantity()*servicesModel.getRate());




        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

        return new ResponseEntity<>(orderDetailsDTO, HttpStatus.OK);


    }


}
