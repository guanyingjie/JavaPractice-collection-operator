package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        //throw new NotImplementedException();
        int sum = 0;
        if (leftBorder > rightBorder) {
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        for (int i = leftBorder; i <= rightBorder; i++) {
            if (i%2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {

        //throw new NotImplementedException();
        int sum = 0;
        if (leftBorder > rightBorder) {
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        for (int i = leftBorder; i <= rightBorder; i++) {
            if (i%2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {

        //throw new NotImplementedException();
        int sum = 0;
        for(Integer i:arrayList){
            sum += i*3+2;
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {

        //throw new NotImplementedException();
        List<Integer>res = new ArrayList<Integer>(arrayList.size());
        for(Integer i:arrayList){
            if(i%2==0)
                res.add(i);
            else {
                res.add(i*3+2);
            }
        }
    return res;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {

        //throw new NotImplementedException();
        int sum=0;
        for(Integer i:arrayList){
            if(i%2!=0)
                sum+=(i*3+5);
        }
        return sum;
    }

    public double getMedianOfEven(List<Integer> arrayList) {

        //throw new NotImplementedException();
        List<Integer>res = new ArrayList<>();
        for(Integer i:arrayList){
            if(i%2==0){
                res.add(i);
            }
        }
        Collections.sort(res);
        int size = res.size();
        if(size%2==0){
            return (double)(res.get(size/2 -1)+res.get(size/2))/2;
        }
        else
            return res.get(size/2);
    }

    public double getAverageOfEven(List<Integer> arrayList) {

        //throw new NotImplementedException();
        int count=0;
        int sum=0;
        for(Integer i:arrayList){
            if(i%2==0){
                sum+=i;
                count++;
            }
        }
        return (double)sum/count;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        //throw new NotImplementedException();
        for(Integer i:arrayList){
            if(i%2==0&&i==specialElment){
                return true;
            }
        }
        return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {

        //throw new NotImplementedException();
        List<Integer>res = new ArrayList<>();
        for(Integer i:arrayList){
            if((i%2==0)&&(!res.contains(i))){
                res.add(i);
            }
        }
        return res;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {

        //throw new NotImplementedException();
        List<Integer>res = new ArrayList<>();
        List<Integer>even = new ArrayList<>();
        List<Integer>odd = new ArrayList<>();
        for(Integer i:arrayList){
            if(i%2==0)
                even.add(i);
            else
                odd.add(i);
        }
        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);
        res.addAll(even);
        res.addAll(odd);
        return res;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {

        //throw new NotImplementedException();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            result.add((arrayList.get(i) + arrayList.get(i+1)) * 3);
        }
        return result;
    }
}
