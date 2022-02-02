package com.cybertek.JavaReviews.practiceDay01;

public class TrafficLightObjects {

    public static void main(String[] args) {

        TrafficLight trafficLight; //object variable / reference to object

        trafficLight = new TrafficLight(); //this statement holds the object

        //new TrafficLight().changeColor("yellow");
        trafficLight.changeColor("red");

        trafficLight.showColor();
        trafficLight.changeColor("black");


    }
}
