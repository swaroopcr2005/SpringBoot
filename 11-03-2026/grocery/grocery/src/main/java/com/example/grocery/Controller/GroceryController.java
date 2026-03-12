package com.example.grocery.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.grocery.dto.request1.GroceryRequest;
import com.example.grocery.dto.response.ApiResponse;
import com.example.grocery.dto.response.Groceryresponse;
import com.example.grocery.service.GroceryService;


@RestController
@RequestMapping("/Customer")
public class GroceryController {
    private final GroceryService groceryService;

    public GroceryController(GroceryService groceryService){
        this.groceryService=groceryService;
    }
    @PostMapping("/detail")
    public ApiResponse<Groceryresponse> calDetail(@RequestBody GroceryRequest req){
        Groceryresponse netTotal=groceryService.calcCustomerDetail(req);

        return new ApiResponse<Groceryresponse>("success", netTotal);
        
    }
    @GetMapping("/all")
    public ApiResponse<List<Groceryresponse>>getMultipleCustomerDetail(){
        List<Groceryresponse>netTotal=groceryService.getMultipleCustomerDetail();
        return new ApiResponse<List<Groceryresponse>>("success", netTotal);
    }
    
}
