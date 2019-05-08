package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
       // throw new NotImplementedException();
        List<Integer> res = new ArrayList<>();
        if(left<=right){
            for(int i = left;i<=right;i++){
                res.add(i);

            }
        }
        else{
            for(int i=left;i>=right;i--){
                res.add(i);
            }
        }
        return res;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {

        //throw new NotImplementedException();
        List<Integer>res = new ArrayList<>();
        if(left<=right){
            for(int i = left;i<=right;i++)
                if (i % 2 == 0) {
                    res.add(i);
                }
        } else {
            for (int i = left; i >= right; i--)
                if (i % 2 == 0) {
                    res.add(i);
                }
        }
        return res;
    }

    public List<Integer> popEvenElments(int[] array) {

        //throw new NotImplementedException();
        List<Integer> res = new ArrayList<>();
        for(int i:array){
            if(i%2==0)
                res.add(i);
        }
        return res;
    }

    public int popLastElment(int[] array) {

        //throw new NotImplementedException();
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {

        //throw new NotImplementedException();
        List<Integer>res = new ArrayList<>();
        List<Integer>arrayToLise = new ArrayList<>();
        for(int i:firstArray){
            arrayToLise.add(i);
        }
        for(int i:secondArray){
            if(arrayToLise.contains(i))
                res.add(i);
        }
        return res;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        //throw new NotImplementedException();
        List<Integer>res = new ArrayList<>();
        for (int i : firstArray) {
            res.add(i);
        }
        for (int i:secondArray) {
            if (!res.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }
}
