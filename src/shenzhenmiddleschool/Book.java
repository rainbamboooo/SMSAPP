/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shenzhenmiddleschool;

/**
 *
 * @author ted
 */
class Book {
    String type;
    String name;
    int price;
    int degree;
    
    Book(String new_type, String new_name, int new_price, int new_degree){
        this.type = new_type;
        this.name = new_name;
        this.price = new_price;
        this.degree = new_degree;
    }
    
    int GetP(){
        return this.price;
    }
    
    int GetD(){
        return this.degree;
    }
    
    String GetT(){
        return this.type;
    }
    
    String GetN(){
        return this.name;
    }
}
