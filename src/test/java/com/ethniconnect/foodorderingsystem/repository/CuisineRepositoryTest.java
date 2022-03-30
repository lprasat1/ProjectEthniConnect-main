package com.ethniconnect.foodorderingsystem.repository;

import com.ethniconnect.foodorderingsystem.entity.Cuisines;
import com.ethniconnect.foodorderingsystem.entity.ZipMaster;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CuisineRepositoryTest {
@Autowired
    CuisineRepository cuisineRepository;
    @Autowired
    ZipRepository zipRepository;

/*    @Test
    public void saveZip(){
        ZipMaster zipMaster=new ZipMaster("10020");
        zipRepository.save(zipMaster);
    }*/
/*@Test
    public void saveCuisines(){
        List<Cuisines> cuisines= Arrays.asList(
                new Cuisines("Italian",new ZipMaster("10020")),
                        new Cuisines("Mexican",new ZipMaster("10020")));
        cuisineRepository.saveAll(cuisines);
    }*/


}