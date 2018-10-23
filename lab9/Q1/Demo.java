import java.io.*;


class Student {

    int rollNo;
    String name;
    int age;
    String course;


    Student(int r, String n, int a, String c) {
        rollNo = r;
        name = n;
        course = c;

        try {
            if(a>=15 && a<=21) {
                age = a;
            }

            else 
                throw new AgeNotWithInRangeException();
            }

            catch(AgeNotWithInRangeException e1) {
                System.out.println(e1);
            }
        }
    }
    



class AgeNotWithInRangeException extends Exception
{
    public String toString()
    {
        return("Please Re Enter the age. Age Should be between 15 & 21 ");
    }
}
    


class Demo {

    public static void main(String args[]){

        Student s1 = new Student(2,"Shivam",12,"CSE");


    }
}