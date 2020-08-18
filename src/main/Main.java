/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author PC
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws IOException {
       File file = new File("Test1.txt");
       if(file.isFile()){
           //file.delete();
           System.out.println("Flie:" + file.getAbsolutePath());
           
       }else{
           System.out.println("Not found");
           //file.createNewFile();
       }
       Scanner input = new Scanner(System.in);
       System.out.println("Nhập n ");
       int N = input.nextInt();
       
            }
        }
  

