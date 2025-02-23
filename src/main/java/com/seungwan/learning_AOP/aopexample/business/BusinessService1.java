package com.seungwan.learning_AOP.aopexample.business;

import com.seungwan.learning_AOP.aopexample.data.DataService1;
import java.util.Arrays;
import org.springframework.stereotype.Service;

@Service
public class BusinessService1 {

    public BusinessService1(DataService1 dataService1) {
        this.dataService1 = dataService1;
    }

    private DataService1 dataService1;

    public int calculateMax() {
        int [] data = dataService1.retrieveData();

        return Arrays.stream(data).max().orElse(0);
    }

}
