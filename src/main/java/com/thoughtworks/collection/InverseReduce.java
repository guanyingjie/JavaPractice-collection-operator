package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {

        //throw new NotImplementedException();
        int step = random.nextInt(3);
        if(step==0){
            step=2;
        }
        List<Integer>res = new ArrayList<>();
        while ((number-step)>0){
            number-=step;
            res.add(number);
        }
        return res;
    }
}
