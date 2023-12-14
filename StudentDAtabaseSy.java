import java.util.*;

class Student {
     String name;
     int rollNo;
     int age;
     int marks;

    
   

    public Student(String name, int rollNo, int age, int marks) {

        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.marks = marks;
    }

   

    public void viewStudent() {
        System.out.println("name=" + name);
        System.out.println("Roll= " + rollNo);
        System.out.println("age= " + age);
        System.out.println("marks= " + marks);
    }
}
public class StudentDAtabaseSy {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Student> database = new HashMap<>();

        while (true) {
            System.out.println("1. push Student ");
            System.out.println("2. show Student ");
            System.out.println("3. Search Students ");
            System.out.println("4. Calculate Average ");
            System.out.println("5.Exit ");
            System.out.print("Enter Your Input: ");
            int Input = sc.nextInt();
            sc.nextLine();

            switch (Input) {
                case 1:
                    System.out.println("Enter Your Name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter Your RollNo.: ");
                    int rollNo = sc.nextInt();

                    System.out.println("Enter Your Age: ");
                    int age = sc.nextInt();

                    System.out.println("Enter Your Marks: ");
                    int marks = sc.nextInt();

                    Student std = new Student(name, rollNo, age, marks);
                    database.put(rollNo, std);

                    System.out.println("Student Added");
                    break;

                case 2:
                    System.out.println("List of Students: ");
                    for (Student i : database.values()) {
                        i.viewStudent();
                    }
                    break;

                case 3:

                    System.out.println("Enter Your rollNo.: ");
                    int roll = sc.nextInt();
                    Student data=database.get(roll);

                    if(data!=null){
                        data.viewStudent();
                    }else{
                        System.out.println("Student not found");
                    }
                    System.out.println("--------*----------*---------*----------*------");
                    break;


                case 4:
                    int totalStudent = database.size();
                    int totalMarks = 0;
                    for (Student j : database.values()) {
                        totalMarks = totalMarks + j.marks;
                    }
                    double average = (double) totalMarks / totalStudent;
                    System.out.println("avg marks" + average);

                    break;

                case 5:
                    System.exit(0);

                    default: System.out.println("Invalid Input");

            
        }
    }
   
    }
}



            
