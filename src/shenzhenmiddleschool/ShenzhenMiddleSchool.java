/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shenzhenmiddleschool;
import java.util.Scanner;

/**
 *
 * @author rainb
 */
public class ShenzhenMiddleSchool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HelperFunction hf = new HelperFunction();

//  Manually enter input
//        System.out.println("Please enter the number of students: ");
//        int n_student = sc.nextInt();
//        NormalStudent[] students = new NormalStudent[n_student];
//        for (int i = 0; i < n_student; i++){
//            System.out.println("Please enter your name:");
//            String name = sc.next();
//            System.out.println("Please enter your gender: ");
//            String gender = sc.next();
//            System.out.println("Please enter your school number: ");
//            int num = sc.nextInt();
//            NormalStudent a = new NormalStudent(name, gender, num);
//            students[i] = a;
//        }
//        for (int j = 0; j < students.length; j++){
//            System.out.println(students[j].toString());
//        }

        NormalStudent[] students = new NormalStudent[7];
        students[0] = new NormalStudent("liyuzhu", "male", 2015530235);
        students[1] = new NormalStudent("chenjundong", "male", 2015530515);
        students[2] = new NormalStudent("changbowen", "male", 2016530374);
        students[3] = new NormalStudent("tangbinhao", "male", 2016530220);
        students[4] = new NormalStudent("zhenghaolan", "male", 2015530235);
        students[5] = new NormalStudent("xiaocaiwei", "female", 2016530325);
        students[6] = new NormalStudent("tangpengjin", "female", 2016530172);
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i].toString());
        }
        
        NormalClub club = new NormalClub("cs club", students, "liyuzhu", "1444487777@qq.com", "18588493805");
        System.out.println("Search result: ");
        club.addMember(students, 2016530172, 0, -1);
        club.addMember(students, "xiaocaiwei");
        System.out.println(club.toString());
                
        Mail mail = new Mail();
        System.out.println("Please enter the mail content: ");
        String content = sc.nextLine();
        System.out.println("Please enter the subject: ");
        String subject = sc.next();
        mail.sendEmail(subject, content);
        
        System.out.println("Please enter your current grade(0-100): ");
        double grade = sc.nextInt();
        System.out.println("Please enter the percentage of final(1-100): ");
        double percentage = sc.nextInt();
        hf.computeFinal(grade, percentage);
        
        System.out.println("Please enter the number of books: ");
        int n = sc.nextInt();
        Book data[] = new Book[n];
        System.out.println("Please enter book information (type, name, price, how much new): ");
        for(int i = 0; i < n; i++){
            data[i] = new Book(sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
        }
        hf.sorting(data,n);
        System.out.println("Price from highest to lowest: ");
        System.out.println("type" + "\t" + "name" + "\t" + "price" + "\t" + "how much new");
        for(int i=0;i<n;i++){
            System.out.println(data[i].GetT() + "\t" + data[i].GetN()+ "\t" + data[i].GetP() + "\t"  + data[i].GetD());
        }
        
        System.out.println("Please enter the book's name you want to search");
        String b_name = sc.next();
        System.out.println("Search result: ");
        hf.searchBookName(data, b_name);
    }
    
}
