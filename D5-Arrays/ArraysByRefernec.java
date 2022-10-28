package Arrays;

public class ArraysByRefrence {
    public static void main(String[] args) {
        int[] marks = {67,87,9};
        Update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
    public  static  void Update(int[] marks){
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i]+1;
        }
    }
}
