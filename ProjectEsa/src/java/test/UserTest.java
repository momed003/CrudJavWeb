/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import dao.UserDao;
import model.UserModel;

/**
 *
 * @author user
 */
public class UserTest {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        UserModel userModel=new UserModel();
        
        userModel.setUsername("Albano Joao");
        userModel.setEmail("dajuas@gmail.com");
     boolean result= userDao.createUser(userModel);
     
        if (result) {
            System.out.println("resultado: "+result);
        }else{
            System.out.println("Erro: nao foi possivel add user");
        }
        for (UserModel user : userDao.getAllUsers()) {
            System.out.println(user.toString());
        }
    }

}
