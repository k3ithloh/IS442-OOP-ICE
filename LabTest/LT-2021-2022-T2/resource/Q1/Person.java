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

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public List<String> getMedicalCondition(){
        return medicalCondition;
    }

    public String vaccineCentre(){
        return vaccineCentre;
    }

    public String getVaccine(){
        return vaccine;
    }

    public char getShotType(){
        return shotType;
    }

    @Override
    public String toString() {

        return "name=" + name + ", age=" + age + ", medicalCondition=" + medicalCondition + ", shotType="
                + shotType;
    }

    public int compareTo(Person anotherPerson) {
        char shotType1 = shotType;
        char shotType2 = anotherPerson.shotType;

        // IF they share the same shotType then we compare the number of medical conditions they have
        if (shotType1 == shotType2){
            if (medicalCondition != null ){
                if (anotherPerson.medicalCondition != null){
                    // ! Return another person first, because its in decending order?
                    return Integer.compare(anotherPerson.medicalCondition.size(), medicalCondition.size());
                }
            }
        }
        
        if (shotType1 == 'S'){
            shotType1 = 'F' + 1;
        }
        else if (shotType1 == 'B'){
            shotType = 'S' + 1;
        }
        if (shotType2 == 'S'){
            shotType2 = 'F' + 1;
        }
        else if (shotType2 == 'B'){
            shotType2 = 'S' + 1;
        }
        return Integer.compare(shotType1,shotType2);
    }
}