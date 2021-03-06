package marekbodziony.peopleofmit.model;

import java.util.GregorianCalendar;


public class Student extends Person {

    private int yearOfStudy;

    // constructor
    public Student(int id, String name, String gender, String phone, String mail, GregorianCalendar dateOfBirth, String imageURL){
        super(id, name, gender, phone, mail, dateOfBirth, imageURL);
        yearOfStudy = setRandomYearOfStudy();
    }

    // getters
    public int getYearOfStudy() {return yearOfStudy;}



    // randomly set student year of study
    // data not available in DB, for presentation purpose
    private int setRandomYearOfStudy(){
        int i = 0;
        while(i <= 0 || i > 5){
            i = (int)(Math.random()*10);
        }
        return i;
    }
}
