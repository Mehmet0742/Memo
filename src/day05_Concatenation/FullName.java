package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Mehmet";
        String lastName = "Uzun";
        int age = 32;
        String jobTitle = "electrik-elektronik engineer";
        String companyName = "YasarKardesler";
        double salary = 5000.58;

        String fullName = firstName + " "  + lastName;

        // Full name of the person is _______
        System.out.println("Full name of the person is " + fullName );

        //___ is __ years old
        System.out.println(fullName + " is " + age +" years old"  );

        //FullName is JobTitle, works at CompanyName, and FullName's salary is Salary
        System.out.println(fullName + " is " + jobTitle +", works at " + companyName
                +", and "+fullName +"'s salary is $"+salary );


    }
}
