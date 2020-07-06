package com.rajendra.jetpackviewmodeljava;

import androidx.lifecycle.ViewModel;

public class GetData extends ViewModel {

    private int count = 0;

    public int getTotalCount(){
        return count;
    }

    public int getCount(){
        count +=1;
        return count;
    }

}
