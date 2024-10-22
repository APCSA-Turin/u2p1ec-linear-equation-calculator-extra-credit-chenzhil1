package com.example.project;

public class Test {
    public static void main(String[] args) {
        LinearCalculator c = new LinearCalculator("(1,2)","(-1,-2)");
        String expectedOutput = "Symmetric about the origin";
        String studentOutput = c.findSymmetry();
        System.out.println(studentOutput);
    }
}
