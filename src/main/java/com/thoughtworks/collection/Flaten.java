package com.thoughtworks.collection;

import org.w3c.dom.ls.LSException;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {

        //throw new NotImplementedException();
        List<Integer>res = new ArrayList<>();
        for(Integer [] i:array){
            for(Integer j:i){
                res.add(j);
            }
        }
        return res;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        //throw new NotImplementedException();
        List<Integer>res = new ArrayList<>();
        for(Integer [] i:array){
            for(Integer j:i){
                if(!res.contains(j))
                    res.add(j);
            }
        }
        return res;
    }
}
