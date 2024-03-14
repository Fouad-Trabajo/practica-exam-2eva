package com.iesam.carnejoven.features.demo.data;

import com.iesam.carnejoven.features.demo.data.local.DemoFileDataSource;
import com.iesam.carnejoven.features.demo.domain.Demo;

public class DemoDataRepository {

    private DemoFileDataSource demoFileDataSource;


    public void saveDemo(Demo demo){
        demoFileDataSource.save(demo);
    }



    public Demo getDemo(String id){
        return demoFileDataSource.findById(id);
    }
}
