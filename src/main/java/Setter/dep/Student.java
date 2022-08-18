package Setter.dep;

public class Student {

    private int studentid;

         //reference type

    private address address;
    private String studentName;
//setting the setter and getter

    public Setter.dep.address getAddress() {
        return address;
    }

    public void setAddress(Setter.dep.address address) {
        this.address = address;
    }


    public int getStudentid() {

        return studentid;
    }

    public void setStudentid(int studentid) {

        this.studentid = studentid;
    }


    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {

        this.studentName = studentName;
    }





    public Student() {

        super();
    }


   public String toString(){
        return  "Student{" +
                    "studentId=" + studentid +"student name="+studentName+"address"+address ;

   }
}
