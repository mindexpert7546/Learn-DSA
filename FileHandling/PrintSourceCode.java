//*
How to print source code as output >>>>>
*/

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PrintSourceCode {
    public static void main(String[] args) throws IOException {
        String file = "/home/mindexpert7546/New Java Project/src/PrintSourceCode.java";
        Scanner scanner = new Scanner(new File(file));
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
}
