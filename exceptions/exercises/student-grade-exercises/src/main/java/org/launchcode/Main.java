package org.launchcode;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        System.out.println(CheckFileExtension(studentFiles.get("Carl")));
        System.out.println(CheckFileExtension(studentFiles.get("Brad")));
        System.out.println(CheckFileExtension(studentFiles.get("Elizabeth")));
        System.out.println(CheckFileExtension(studentFiles.get("Stefanie")));
    }

    public static void Divide(int x, int y)
    {
        if(y == 0){
            try{
                throw new ArithmeticException("Can't divide by 0");
            }catch (ArithmeticException e){
                e.printStackTrace();
            }
        }
        int result = x/y;
        System.out.println(result);
    }

    public static int CheckFileExtension(String fileName) {
        int score = 0;
        if (fileName.contains(".java")){
            score = 1;
        }
        if (!fileName.contains(".java")){
            score = 0;
        }
        if (fileName.isBlank()){
            try {
                throw new CheckFileExtension("No file was uploaded for ");
            } catch (CheckFileExtension e){
                e.printStackTrace();
                score = -1;
            }
        }
        return score;
    }
}