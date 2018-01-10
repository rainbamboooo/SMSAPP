/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shenzhenmiddleschool;

/**
 *
 * @author rainb
 */
public class HelperFunction {
    public void computeFinal(double grade, double percentage){
        double requireAScore = (90 - grade * (1 - percentage/100)) / (percentage/100);
        double requireBScore = (80 - grade * (1 - percentage/100)) / (percentage/100);
        
        System.out.println("You need " + requireAScore + " to get an A");
        System.out.println("You need " + requireBScore + " to get an B");
    }

    public void sorting(Book[] data,int n){
        for(int i=0; i<n; i++){
            int min_ptr = i;
            for(int j=i; j<n; j++){
                if(data[j].GetP() > data[min_ptr].GetP()){
                    min_ptr = j;
                }
            }
            Book temp = data[i];
            data[i] = data[min_ptr];
            data[min_ptr] = temp;
        }
    }

    public void sortSchoolNumber(NormalStudent[] data){
        for(int i=0; i<data.length; i++){
            int min_ptr = i;
            for(int j=i; j<data.length; j++){
                if(data[j].getSchoolNumber() > data[min_ptr].getSchoolNumber()){
                    min_ptr = j;
                }
            }
            NormalStudent temp = data[i];
            data[i] = data[min_ptr];
            data[min_ptr] = temp;
        }
    }
    
    public void searchBookName(Book[] data, String x){
        for (int i = 0; i < data.length; i++){
            int index = data[i].GetN().indexOf(x);
            if (index != -1){
                System.out.println(data[i].GetN());
            }
        }
    }
    
    public void searchStudentName(NormalStudent[] data, String x){
        for (int i = 0; i < data.length; i++){
            int index = data[i].getName().indexOf(x);
            if (index != -1){
                System.out.println(data[i].toString());
            }
        }
    }
 
    public int searchSchoolNumber(NormalStudent[] data, int x, int start, int end){
        if (end == -1){
            end = data.length;
        }
        if(start > end){  
            return -1;  
        }
        int mid = start + (end - start) / 2;  
        if(x < data[mid].getSchoolNumber()){  
            return searchSchoolNumber(data , x, start, mid-1);  
        }else if(x > data[mid].getSchoolNumber()){  
            return searchSchoolNumber(data, x, mid + 1, end);  
        }else{  
            return mid;  
        }  
    }
}
