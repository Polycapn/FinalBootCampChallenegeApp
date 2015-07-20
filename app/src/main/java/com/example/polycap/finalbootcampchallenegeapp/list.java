package com.example.polycap.finalbootcampchallenegeapp;

import java.util.Random;

/**
 * Created by Polycap on 7/20/2015.
 */
public class list {
    public static final Random RANDOM = new Random();
    String title;
    String desc;

    public list(String title, String desc){
        this.title = title;
        this.desc = desc;
    }

    public static int getRandomPic (){
        switch (RANDOM.nextInt(15)){
            default:
            case 0:
                return R.drawable.af;
            case 1:
                return R.drawable.night;
            case 2:
                return R.drawable.sunset;
            case 3:
                return R.drawable.tiger;
            case 4:
                return R.drawable.ua;
            case 5:
                return R.drawable.mansion;
            case 6:
                return R.drawable.galaxy;
            case 7:
                return R.drawable.butterfly;
            case 8:
                return R.drawable.flowers;
            case 9:
                return R.drawable.tiger;
            case 10:
                return R.drawable.desert;
            case 11:
                return R.drawable.water;
            case 12:
                return R.drawable.night;
            case 13:
                return R.drawable.city;
            case 14:
                return R.drawable.surf;
        }
    }

    public String getTitle(){
        return title;
    }
    public String getDesc(){
        return desc;
    }
}
