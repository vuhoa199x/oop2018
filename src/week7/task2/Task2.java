package week7.task2;
import java.io.*;
import java.lang.NullPointerException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.ArithmeticException;
import java.lang.ClassCastException;

public class Task2 {

    public void NULL() throws NullPointerException{
        String obj = null;
        System.out.println(obj.length());
    }
    public void Array() throws ArrayIndexOutOfBoundsException{
        int arr[] = new int[5];
        arr[5] = 50;
    }
    public void Arithmetic() throws ArithmeticException{
        int a = 10 / 0;
    }
    public void ClassCast() throws ClassCastException{
        class dad {
        }
        class kid extends dad {
        }
        ;
        dad d = new dad();
        kid k = (kid) d;
    }
    public  void FileNotFound() throws FileNotFoundException{
        InputStream inputStream = new FileInputStream("vsbg.txt");
    }
    public void IO() throws IOException{
        InputStream inputStream = new FileInputStream("src/week7/task2/ahihi.txt");
        inputStream.close();
        inputStream.read();
    }



    public static void main(String[] args) {
        Task2 task2 = new Task2();
        // null pointerException
        try {
            task2.NULL();
        } catch (NullPointerException e) {
            System.out.println("error: NullPointerException");
        }

        //.ArrayIndexOfBoundException

        try {
            task2.Array();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error: ArrayIndexOutOfBoundsException");
        }

        //ArithmeticException\

        try {
            task2.Arithmetic();
        } catch (ArithmeticException e) {
            System.out.println("error: ArithmeticException");
        }

        //ClassCastException
        try {
            task2.ClassCast();
        } catch (ClassCastException e) {
            System.out.println("error: ClassCastException");
        }
        //FileNotFoundException
        try {
            task2.FileNotFound();
        } catch (FileNotFoundException e) {
            System.out.println("Error: FileNotFoundException.");
        }

        //IOException
        try {
            task2.IO();
        } catch (FileNotFoundException e) {
            System.out.println("Error: FileNotFoundException.");
        } catch (IOException e) {
            System.out.println("Error: IOException.");
        }

    }
}


