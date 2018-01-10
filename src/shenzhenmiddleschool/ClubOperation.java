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
public interface ClubOperation {
    void sendMessage(String content);
    void addMember(NormalStudent[] data, int n, int start, int end);
    void addMember(NormalStudent[] data, String name);
}
