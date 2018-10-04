package Fri;

import java.awt.*;

public class Dog {

    // 1. Memmber variables, class variable, klassevariabler
    private int antalBen = 4;
    private String navn = "";
    private String breed = "";
    private double sizeKilos = "";
    private Color color = new Color(1,2,3);
    private int age = 0;

    // 2. Constructor

    // 3. Metoder, methods, functions
    public void eat() {}
    public void sleep() {}
    public void sit() {}
    public void run() {}

    public int getAntalBen() {
        return antalBen;
    }

    // Højreklik > Generate > Getter and Setter for at hente private

    public void setAntalBen(int antalBen) {
        this.antalBen = antalBen;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getSizeKilos() {
        return sizeKilos;
    }

    public void setSizeKilos(double sizeKilos) {
        this.sizeKilos = sizeKilos;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
