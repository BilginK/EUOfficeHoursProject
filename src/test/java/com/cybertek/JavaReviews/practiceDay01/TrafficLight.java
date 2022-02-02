package com.cybertek.JavaReviews.practiceDay01;

public class TrafficLight {

    private String color;

    public void showColor(){
        System.out.println("color = "+ color);
    }
    //local time of each light should shared by all traffic lights

    public static  String localTime;
    public void changeColor (String newColor){

        if(newColor.equalsIgnoreCase("red") ||newColor.equalsIgnoreCase("yellow") ||
                newColor.equalsIgnoreCase("green")){
            System.out.println("changing the color to = " + newColor);
            color = newColor;
        }else{
            System.out.println("Error : invalid color" + newColor);
        }
    }

}
