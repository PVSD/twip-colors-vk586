package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, user." +
                "\n(1) to enter and convert a RGB triplet." +
                "\n(2) to enter and convert a hexadecimal.");
        Converter rgb = new Converter(80, 6, 143);
        Converter hex = new Converter("FFFFFF");

    }
}
