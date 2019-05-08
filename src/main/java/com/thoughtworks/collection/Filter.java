package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        //throw new NotImplementedException();
        List<Integer>res = new ArrayList<>();
        for(int i:array){
            if(i%2==0)
                res.add(i);
        }
        return res;
    }

    public List<Integer> filterMultipleOfThree() {

        //throw new NotImplementedException();
        List<Integer>res = new ArrayList<>();
        for(int i:array){
            if(i%3==0)
                res.add(i);
        }
        return res;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        //throw new NotImplementedException();
        List<Integer> result = new ArrayList<>();
        result.addAll(firstList);
        result.retainAll(secondList);
        return result;
    }

    public List<Integer> getDifferentElements() {

        //throw new NotImplementedException();
        List<Integer>res = new ArrayList<>();
        for(int i:array){
            if(!res.contains(i))
                res.add(i);
        }
        return  res;
    }
}