package co.edu.sena.project2687351.model.repository;

import co.edu.sena.project2687351.model.User;

import java.sql.SQLException;

public class TestUserRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        Repository<User> repository= new UserRepositoryImpl();

        System.out.println("========== SaveObj Insert =========");
        User userInsert = new User();
        userInsert.setUser_firstname("carlos");
        userInsert.setUser_lastname("rojas");
        userInsert.setUser_email("carlos@example.com");
        userInsert.setUser_password("qsdp5879");
        repository.saveObj(userInsert);
        userInsert.setUser_firstname("roman");
        userInsert.setUser_lastname("riquelme");
        userInsert.setUser_email("romario@example.com");
        userInsert.setUser_password("cabjr1998");
        repository.saveObj(userInsert);

        System.out.println("========= listAllObj ==========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ==========");
        System.out.println(repository.byIdOBj(1));
        System.out.println();

        System.out.println("========== saveObj ==========");
        User userUpdate = new User();
        userUpdate.setUser_id(2);
        userUpdate.setUser_firstname("diego");
        userUpdate.setUser_lastname("forlan");
        userUpdate.setUser_email("vllrl@example.com");
        userUpdate.setUser_password("lchnt2005");
        repository.saveObj(userInsert);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== deleteObj ==========");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
    }
}