package com.ethniconnect.foodorderingsystem.repository;

import com.ethniconnect.foodorderingsystem.entity.Cuisines;
import com.ethniconnect.foodorderingsystem.entity.ZipMaster;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ZipRepositoryTest {
    @Autowired
    ZipRepository zipRepository;
   /* @Test
    public void saveZip(){
     ZipMaster zipMaster=new ZipMaster("10015");
        zipRepository.save(zipMaster);
    }*/



}