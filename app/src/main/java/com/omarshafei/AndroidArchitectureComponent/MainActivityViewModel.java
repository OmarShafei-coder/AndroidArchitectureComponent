package com.omarshafei.AndroidArchitectureComponent;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainActivityViewModel extends ViewModel {

    private String TAG = this.getClass().getSimpleName();
    private MutableLiveData<Integer> result;
    int num = 0;

    public MutableLiveData<Integer> getNumber(){
        if(result == null){
            result = new MutableLiveData<>();
            reset();
        }
        return result;
    }

    public void increment(){
        if(result.getValue() != null){
            result.setValue(result.getValue() + 1);
        }
    }
    public void reset(){
        result.setValue(0);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i(TAG, "ViewModel Destroyed");
    }
}
