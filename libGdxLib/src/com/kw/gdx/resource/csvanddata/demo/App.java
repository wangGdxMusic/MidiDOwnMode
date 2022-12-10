package com.kw.gdx.resource.csvanddata.demo;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Array;
import com.kw.gdx.resource.annotation.ExecuteMathod;
import com.kw.gdx.resource.csvanddata.ReadCvs;

import java.io.BufferedReader;

public class App {
    ReadCvs readCvs = new ReadCvs();
    public static void main(String[] args) {

    }
    @ExecuteMathod
    public void readChapter(){
        Array riderChapters = common("csv/rider_chap.csv", RiderChapter.class);
    }

    private <T> Array<T> common(String path, Class<T> tClass) {
        Array<T> array = new Array<>();
        readCvs.readMethodMethod(array, new BufferedReader(Gdx.files.internal(path).reader()) , tClass);
        return array;
    }

}
