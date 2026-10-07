package com.example.method_overload_practice;

import javafx.scene.control.Alert;

public class Alerts {

    public void ShowAlert(String s, int t) {
        Alert a = new Alert(Alert.AlertType.ERROR);

        a.setTitle("Error Detected.");
        a.setContentText("The previous action caused an error.");
        a.showAndWait();

    }

    //Both parameters type and number of parameters can be different for method overload.

    public void ShowAlert(String s) {
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);

        a.setTitle("Error Detected.");
        a.setContentText(s);
        a.showAndWait();

    }

    public static void main(String[] args){
        Student s1 = new Student();
        s1.setName("Shahryiar").setMajor("CSE").setCgpa(3.5).setEmail("nife@gmail.com");

        s1.display();





    }

    //This is without method chaining

    //public static void main(String[] args){
    //    Student s1 = new Student();
    //    s1.setName("Shahriyar");
    //    s1.setMajor("CSE");
    //    s1.setEmail("nife@gmail.com");
    //    s1.setCgpa(3.5);

    //    s1.display();

    //}



}
