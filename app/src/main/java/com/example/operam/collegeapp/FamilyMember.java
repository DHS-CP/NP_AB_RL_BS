package org.pltw.examples.collegeapp;

/**
 * Created by Rishabh on 12/10/2017.
 */

public abstract class FamilyMember {
    public String firstName; // 2.1.5 # 5
    public String lastName; // 2.1.5 # 5

    public FamilyMember() { // 2.1.5 Used for creating object.
        firstName = "Big";
        lastName = "Boy";
    }

    public String getFirstName() { // 2.1.5 Retrieves first name.
        return firstName;
    }

    public void setFirstName(String firstName) { // Sets first name
        this.firstName = firstName;
    }

    public String getLastName() { //Retrieves last name.
        return lastName;
    }

    public void setLastName(String lastName) { //Sets last name.
        this.lastName = lastName;
    }
}
