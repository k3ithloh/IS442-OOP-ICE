/*
 *
 * Name: Keith Loh
 */

import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<String> medicalCondition;
    private String vaccineCentre;
    private String vaccine;
    private char shotType;

    public Person(String name, int age, List<String> medicalCondition, String vaccineCentre, String vaccine,
            char shotType) {
        this.name = name;
        this.age = age;
        this.medicalCondition = medicalCondition;
        this.vaccineCentre = vaccineCentre;
        this.vaccine = vaccine;
        this.shotType = shotType;
    }

    @Override
    public String toString() {

        return "name=" + name + ", age=" + age + ", medicalCondition=" + medicalCondition + ", shotType="
                + shotType;
    }

    public int compareTo(Person anotherPerson) {
        char shotType1 = shotType;
        char shotType2 = shotType;
        

        return 0;
    }
}