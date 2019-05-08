package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {

        //throw new NotImplementedException();
        List<Integer>res = new ArrayList<>();
        for(Integer i:array){
            res.add(i*3);
        }
        return res;
    }

    public List<String> mapLetter() {

        //throw new NotImplementedException();
        List<String> result = new ArrayList<>();
        for (Integer integer : array) {
            result.add(letters[integer - 1]);
        }
        return result;
    }

    public List<String> mapLetters() {

        //throw new NotImplementedException();
        List<String> result = new ArrayList<>();
        for (Integer integer : array) {
            if ( (integer - 1 )/ letters.length < 1) {
                result.add(letters[integer - 1]);
            } else {
                result.add(letters[(integer - 1) / letters.length - 1] + letters[(integer - 1) % letters.length]);
            }
        }
        return result;
    }

    public List<Integer> sortFromBig() {

        //throw new NotImplementedException();
        List<Integer>res = new ArrayList<>(array);
        Collections.sort(res,(a,b)->b.compareTo(a));
        return res;

    }

    public List<Integer> sortFromSmall() {

        //throw new NotImplementedException();
        List<Integer>res = new ArrayList<>(array);
        Collections.sort(res,(a,b)->a.compareTo(b));
        return res;
    }
}
