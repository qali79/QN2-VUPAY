/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package qali.vucourses;

/**
 *
 * @author QARAN TRAVEL
 */
import java.util.Scanner;

public class VUCourses {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String moduleCode;
        String moduleName = "";
        int tuition = 0;
        
        System.out.println("Enter Module Code (BSF, BIT, BCS, BCE): ");
        moduleCode = input.nextLine();
        
        if (moduleCode.equalsIgnoreCase("BSF")) {
            moduleName = "BSc. Software Engineering";
            tuition = 900000;
        } 
        else if (moduleCode.equalsIgnoreCase("BIT")) {
            moduleName = "BSc. Information Technology";
            tuition = 750000;
        } 
        else if (moduleCode.equalsIgnoreCase("BCS")) {
            moduleName = "BSc. Computer Science";
            tuition = 800000;
        } 
        else if (moduleCode.equalsIgnoreCase("BCE")) {
            moduleName = "BSc. Computer Engineering";
            tuition = 950000;
        } 
        else {
            System.out.println("Wrong Module Code details");
            return;
        }
        
        System.out.println("Course Name: " + moduleName);
        System.out.println("Module Code: " + moduleCode.toUpperCase());
        System.out.println("Tuition Fee: UGX " + tuition);
    }
}
