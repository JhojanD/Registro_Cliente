
package com.jdt.introduction.domain;

public class UserManagement {
    private static int id;
    private static int identificationCard;
    private static String name;
    private static String email;
    private static int phone;

    public UserManagement() {
    }
    
    public UserManagement(int id) {
        this.id = id; 
    }
        
    public UserManagement(int id, int identificationCard, String name,String email, int phone) {
        this.id = id; 
        this.identificationCard = identificationCard;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public UserManagement(int identificationCard, String name,String email, int phone) {
        
        this.identificationCard = identificationCard;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        UserManagement.id = id;
    }

    public static int getIdentificationCard() {
        return identificationCard;
    }

    public static void setIdentificationCard(int identificationCard) {
        UserManagement.identificationCard = identificationCard;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        UserManagement.name = name;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        UserManagement.email = email;
    }

    public static int getPhone() {
        return phone;
    }

    public static void setPhone(int phone) {
        UserManagement.phone = phone;
    }

    @Override
    public String toString() {
        return "UserManagement{ id:" +id+", Cedula:"+identificationCard
                +", Nombre:"+name+", Correo Electronico:"+ email
                +", Telefono"+phone+ '}';
    }




    
    
}
