package com.ethniconnect.foodorderingsystem.controller;

import com.ethniconnect.foodorderingsystem.api.*;
import com.ethniconnect.foodorderingsystem.entity.Chefs;
import com.ethniconnect.foodorderingsystem.entity.Cuisines;
import com.ethniconnect.foodorderingsystem.entity.Menu;
import com.ethniconnect.foodorderingsystem.entity.ZipMaster;
import com.ethniconnect.foodorderingsystem.service.FoodOrderingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@RestController
public class FoodOrderingController {
   @Autowired
   Response response;
   @Autowired
    FoodOrderingService foodOrderingService;
   @GetMapping("/getCuisines/{zipCode}")
   public Response getCuisines(@PathVariable String zipCode) {
     /*response.setCuisines(Arrays.asList(new Cuisines(1, "Italian"),
             new Cuisines(2, "Mexican")));*/
       // ZipMaster zipMaster = foodOrderingService.getCuisinesByZip(zipCode);
       Set<Cuisines> cuisines = foodOrderingService.getCuisinesByZipMaster(zipCode);
     response.setZipCode(zipCode);
     response.setCuisines(cuisines);
      return response;
   }
    @GetMapping("/getChefs/{zipCode}/{cuisineId}")
    public Response getChefsByCuisineId(@PathVariable String zipCode, @PathVariable long cuisineId) {
       /* response.setChefs(Arrays.asList(new Chefs(1,"Enrique Olvera","3133357573",
                        "10 years","Since Feb 2020",
                         new ChefAddress("3039 Debra Ct","",48326,"Auburn Hills",
                                 "MI"))));*/
       Set<Chefs> chefs = foodOrderingService.getChefsByChefZipAndCuisines_CuisineName(zipCode,cuisineId);
        response.setChefs(chefs);
        response.setZipCode(zipCode);
        return response;
    }
  @PostMapping("/getMenu/{chefId}")
    public Response getMenuByChefId(@PathVariable long chefId) {
       /* response.setMenu(Arrays.asList(new Menu("Monday","Breakfast",Arrays.asList(new Dish("Cheese Omlette",5.99),
                new Dish("Tortillas",3.99)))));*/
      List<Menu> menu = foodOrderingService.getMenuByChef_ChefId(chefId);
      response.setMenu(menu);
        return response;
    }
}
