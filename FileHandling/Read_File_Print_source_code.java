/*
output : 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadSourceCode {
    public static void main(String[] args) throws IOException {

        String file = "/home/mindexpert7546/New Java Project/src/ReadSourceCode.java";
        Scanner scan = new Scanner(new File(file));
        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());

        }

    }
}
*/



import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadSourceCode {
    public static void main(String[] args) throws IOException {

        String file = "/home/mindexpert7546/New Java Project/src/ReadSourceCode.java";
        Scanner scan = new Scanner(new File(file));
        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());

        }

    }
}
