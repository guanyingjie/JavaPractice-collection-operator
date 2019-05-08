package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {

        //throw new NotImplementedException();
        int max = arrayList.get(0);
        for(Integer i:arrayList){
            if(i>max){
                max=i;
            }
        }
        return max;
    }

    public double getMinimum() {

        //throw new NotImplementedException();
        int min = arrayList.get(0);
        for(Integer i:arrayList){
            if(i<min)
                min=i;
        }
        return min;
    }

    public double getAverage() {

        //throw new NotImplementedException();
        int sum=0;
        for(Integer i:arrayList){
            sum+=i;
        }
        return (double)sum/arrayList.size();
    }

    public double getOrderedMedian() {

        //throw new NotImplementedException();
        List<Integer> result = arrayList;
        int size = result.size();
        if(size % 2 == 0){
            return (double)(result.get(size/2 - 1) + result.get(size/2))/2;
        }else {
            return result.get(size/2);
        }
    }

    public int getFirstEven() {

        //throw new NotImplementedException();
        for(Integer i:arrayList){
            if(i%2==0){
                return i;
            }
        }
        return -1;
    }

    public int getIndexOfFirstEven() {

        //throw new NotImplementedException();
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)%2==0)
                return i;
        }
        return -1;
    }

    public boolean isEqual(List<Integer> arrayList) {

        //throw new NotImplementedException();
        if (this.arrayList.size() != arrayList.size()) {
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if(this.arrayList.get(i) != arrayList.get(i)){
                return false;
            }
        }
        return true;
    }

    public Double getMedianInLinkList(SingleLink singleLink) {

        int listLength = this.arrayList.size();
        double result = 0.0;
        for (Integer ele : this.arrayList) {
            singleLink.addTailPointer(ele);
        }
        if (listLength % 2 == 0) {
            Integer num1 = (Integer) singleLink.getNode(listLength / 2);
            Integer num2 = (Integer) singleLink.getNode(listLength / 2 + 1);
            result = (num1 + num2) / (double) 2;
            return result;
        }
        result = (Integer) singleLink.getNode((listLength + 1) / 2);
        return result;
    }

    public int getLastOdd() {

        //throw new NotImplementedException();
        for(int i=arrayList.size()-1;i>=0;i--){
            if(arrayList.get(i)%2==1)
                return arrayList.get(i);
        }
        return -1;
    }

    public int getIndexOfLastOdd() {

        //throw new NotImplementedException();
        for(int i=arrayList.size()-1;i>=0;i--){
            if(arrayList.get(i)%2==1)
                return i;
        }
        return -1;
    }
}
