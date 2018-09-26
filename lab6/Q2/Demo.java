

class Student{

    int rollNumber;
    String name;
    double percentage;

    static int count;

    
/* default constructor */

    Student() {

        rollNumber = 0;
        name = "No Name";
        percentage = 0;
    }

/* parameterized constructor */

    Student(int roll, String namee, double per) {
        count++;
        System.out.println("Object Count : " + count);
        rollNumber = roll;
        name = namee;
        percentage = per;
    }

    public String toString() {
        String string = "Name : " + name + "Rollno : " + rollNumber +" "+"Percentage : " + percentage;
    return(string);
    }

}


class Demo {
    public static void main(String args[]){

       Student studentObj = new Student(2,"Shivam",80);

        studentObj.toString();


    }
}