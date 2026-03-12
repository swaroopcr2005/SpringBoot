package com.example.grocery.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.grocery.dto.request1.GroceryRequest;
import com.example.grocery.dto.response.Groceryresponse;
import com.example.grocery.entity.Grocery;
import com.example.grocery.repository.GroceryRepository;

@Service

public class GroceryService {
    private final GroceryRepository groceryRepository;

    public GroceryService(GroceryRepository groceryRepository){
        this.groceryRepository=groceryRepository;
    }
    public Groceryresponse calcCustomerDetail(GroceryRequest req){
        int total=req.getProduct().stream().mapToInt(Integer::intValue).sum();
        double gst=18;
        double addgst=(gst/100)*total;
        double netTotal=total+addgst;
        Grocery grocery=new Grocery();
        grocery.setCustomername(req.getCustomername());
        grocery.setTotal(total);
        grocery.setGst(addgst);
        grocery.setNetTotal(netTotal);
        groceryRepository.save(grocery);

        return new Groceryresponse(req.getCustomername(),total, addgst,netTotal);
        
    }
    public List<Groceryresponse>getMultipleCustomerDetail(){
       return groceryRepository.findAll()
       .stream()
       .map(grocery->new Groceryresponse(
        grocery.getCustomername(),
        grocery.getTotal(),
        grocery.getGst(),
        grocery.getNetTotal()))
        .toList();
        
    }

    
    
}
