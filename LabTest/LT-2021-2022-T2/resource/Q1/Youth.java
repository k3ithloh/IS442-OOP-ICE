/*
 *
 * Name: Keith Loh
 */

import java.util.List;

public class Youth extends Person{
  private String school;
  
  public Youth (String name, int age, List<String> medicalCondition, String school, String vaccineCentre, String vaccine, char shotType){
    super(name, age, medicalCondition, vaccineCentre, vaccine, shotType);
    this.school = school;
  }

  @Override
  public String toString(){
    return "[name=" + getName() + ", age=" +  getAge() + ", medicialCondition=" + List.toString(getMedicalCondition()) + ", shotType=" + Character.toString(getShotType()) + ", school=" + school; 
  }
}