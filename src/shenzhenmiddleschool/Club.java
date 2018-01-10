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
abstract class Club {
    public String name;
    public NormalStudent[] members;
    public String leader_name;
    public String leader_email;
    public String leader_phone;
    
    Club(String name, NormalStudent[] members, String leader_name, String leader_email, String leader_phone){
        this.name = name;
        this.members = members;
        this.leader_name = leader_name;
        this.leader_email = leader_email;
        this.leader_phone = leader_phone;
    }
    
    public String toString(){
        return "Club name: " + name + "\nLeader's name: " + leader_name
                + "\nLeader's email: " + leader_email + "\nLeader's phone: " + leader_phone;
    }
}
