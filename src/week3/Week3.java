package week3;

public class Week3 {

    public static int max(int m, int n) {
        if(m < n) return n;

        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất

        return m;
    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int number[] = new int[100] ;
        int min = number[0];
        for(int i=0;i<number.length;i++){
            if(number[i] <min){
                min = number[i];
            }
        }
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        double BMI = weight/(height * height);
        if(BMI < 18.5) {
            return "Thieu can";
        }
        else if( BMI >=18.5 && BMI <23) {
            return "Binh thuong";
        }
        else if(BMI>= 23 && BMI<=24.99 ) {
            return "Thua can";
        }
        else return "Beo phi";

    }
    public static void main (String[] args) {
        System.out.println(calculateBMI(40, 1.75));
    }
}
