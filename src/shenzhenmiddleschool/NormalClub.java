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
public class NormalClub extends Club implements ClubOperation {
    NormalClub(String name, NormalStudent[] members, String leader_name, String leader_email, String leader_phone){
        super(name, members, leader_name, leader_email, leader_phone);
    }
    
    HelperFunction hf = new HelperFunction();
    
    public void sendMessage(String content){
        // to be implemented
        return;
    }
    
    public void addMember(NormalStudent[] data, int number, int start, int end){
        hf.sortSchoolNumber(data);
        int index = hf.searchSchoolNumber(data, number, 0, -1);
        System.out.println(data[index].toString());
    }
    
    public void addMember(NormalStudent[] data, String name){
        hf.searchStudentName(data, name);
    }
    
}
