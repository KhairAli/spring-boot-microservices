package com.assignment.evamp.user.service;

import com.assignment.evamp.user.client.ProductClient;
import com.assignment.evamp.user.client.dto.PurchaseDTO;
import com.assignment.evamp.user.client.response.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    @Autowired
    ProductClient fileClient;


     public String getUserProduct() {
         return fileClient.getUserProduct();
     }

     public PurchaseDTO purchaseProduct(String name) {
         if(name!=null){
             name = name.trim();
         }
         PurchaseDTO purchaseDTO = new PurchaseDTO();
         ProductResponse response =  fileClient.getProductByName(name);
         if( response!=null && response.getId() != null && response.getAvailable()){
             purchaseDTO.setProduct(response);
             purchaseDTO.setMessage("You have successfully purchase this item, Please pay "+ response.getPrice()+" to cashier");
         }else if(response!=null && !response.getAvailable()) {
             purchaseDTO.setProduct(response);
             purchaseDTO.setMessage("This product is out of Stock !!!!");
         } else{
             purchaseDTO.setMessage("Product is not available in stock");
         }
         return purchaseDTO;
     }

}
