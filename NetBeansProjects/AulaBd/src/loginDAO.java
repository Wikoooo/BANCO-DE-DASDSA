/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Withorya_3862
 */
import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;

public class  LoginDAO {
    public class LoginDAO {
 private Connection connection;
 Long id;
 String email;
 String senha;
 public  LoginDAO(){
 this.connection = new ConnectionFactory().getConnection();
 }
 public void adiciona(Senha senha){
    
String sql = "SELECT usuario(nome,cpf,email,telefone) VALUES(?,?,?,?)";
 try {
 PreparedStatement stmt = connection.prepareStatement(sql);
 stmt.setString(1, usuario.getEmail());
 stmt.setString(2, usuario.getSenha());
 stmt.execute();
 stmt.close();
 } catch (SQLException u) {
 throw new RuntimeException(u);
 }
 }
}
