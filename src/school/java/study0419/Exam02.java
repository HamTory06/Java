package school.java.study0419;

public class Exam02 {
    public static void main(String[] args) {
        Student s = new Student("황주완",2,3,100,60,76);
        System.out.println(s.info());
    }
}


class Student{
    int kor;
    int eng;
    int math;
    int ban;
    int no;

    String name;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    String info(){
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAcerage();
    }

    float getAcerage(){
        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
    }
    int getTotal(){
        return kor+eng+math;
    }
}
