package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1,"학생1",16,80);


        Student student2 = new Student();
        initStudent(student2,"학생2",17,70);

        printStudent(student1);
        printStudent(student2);

    }

    static void printStudent(Student student) {
        System.out.printf("이름 : %s  나이 : %d 성적 : %d\n",student.name,student.age,student.grade);
    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
}
