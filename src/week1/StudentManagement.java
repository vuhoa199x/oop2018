package week1;



public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    private Student[] groupstudent= new Student[100];
    int index = 0;
    public static void main (String[] args) {
        Student student1 = new Student();
        StudentManagement list1 = new StudentManagement();
        student1.setStudent_email("vuhoa199x@gmail.com");
        student1.setStudent_group("INT2204");
        student1.setStudent_id("17021137");
        student1.setStudent_name("nguyen trong vu");
        String abc = student1.getStudent_name();
        System.out.println(abc);
        student1.getInfo();



        Student student2 = new Student("nguyen van truong", "17023343", "vantruong@gmail.com");
        Student student3 = new Student("truong thanh tu", "17022233",  "thanhtu@gmail.com");

        Student student4 = new Student();
        student4.setStudent_email("quangthuong@gmail.com");
        student4.setStudent_group("INT22042");
        student4.setStudent_id("17025555");
        student4.setStudent_name("ta quang thuong");

        student2.getInfo();
        student3.getInfo();
        student4.getInfo();

        System.out.println(list1.sameGroup(student2, student3));
        System.out.println(list1.sameGroup(student2, student4));

        list1.listSv(student2);
        list1.listSv(student3);
        list1.listSv(student4);
        list1.listSv(student1);

        System.out.print("Danh sach sinh vien hien tai: ");
        list1. Showlist();
        list1. removeStudent("17021137");
        System.out.print("\nDanh sach sinh vien sau khi xoa: ");
        list1. Showlist();

        list1.studentsByGroup();
    }

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        String group1 = s1.getStudent_group();
        String group2 = s2.getStudent_group();
        return group1.equals(group2); // xóa dòng này sau khi cài đặt
    }
    public void listSv(Student st) {
        groupstudent[index] = st;
        index++;
    }

    public void Showlist() {
        for(int i=0;i<index;i++) {
            System.out.print(groupstudent[i].getStudent_name() + " ");
        }
    }

    void studentsByGroup() {
        // TODO:
        String namegroup1="INT22041";
        String namegroup2="INT22042";

        System.out.print("\nSinh vien nhom INT22041: ");
        for(int i=0;i<index;i++) {
            if(groupstudent[i].getStudent_group().equals(namegroup1)) {
                System.out.print(groupstudent[i].getStudent_name() + " ");
            }
        }
        System.out.print("\nSinh vien nhom INT22042: ");
        for(int i=0;i<index;i++) {
            if(groupstudent[i].getStudent_group().equals(namegroup2)) {
                System.out.println( groupstudent[i].getStudent_name() + " ");
            }
        }
    }

    void removeStudent(String id) {
        // TODO:

        for (int i = 0; i < index; i++) {
            if (groupstudent[i].getStudent_id() == id) {
                if(i == index-1) groupstudent[i] = null;
                while(i<index-1) {
                    groupstudent[i] = groupstudent[i + 1];
                    i++;
                }
                groupstudent[i+1] = null;
                index--;
                break;
            }
        }
    }


}
