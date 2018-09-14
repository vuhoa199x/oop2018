package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String student_id;
    private String student_name;
    private String student_group;
    private String student_email;
    static public int soluong;



    // TODO: khai báo các phương thức getter, setter cho Student
    public String getStudent_id(){
        return student_id;
    }
    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }
    public String getStudent_name() {
        return student_name;
    }
    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }
    public String getStudent_group() {
        return student_group;
    }
    public void setStudent_group(String student_group) {
        this.student_group = student_group;
    }
    public String getStudent_email() {
        return student_email;
    }
    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        String id,name,group,email;
        name = "student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        this.student_name = n;
        this.student_id = sid;
        this.student_email = em;
        this.student_group= "INT22041";

    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        this.student_name = s.student_name;
        this.student_id = s.student_id;
        this.student_group = s.student_group;
        this.student_email = s.student_email;

    }

    public String getInfo() {
        // TODO:

        System.out.println("Ten sinh vien: " + student_name + " Masv: " + student_id + " Nhom: " + student_group + " email: "+ student_email);
        return null;
        // xóa dòng này sau khi cài đặt
    }
}
