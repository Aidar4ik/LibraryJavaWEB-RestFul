package com.example.libraryjavaweb.dao;

import com.example.libraryjavaweb.models.BookModel;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class BookDAO {

    private static final String URL = "jdbc:postgresql://localhost:5432/books_db";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "564231Aidar";

    private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<BookModel> show(){
        List<BookModel> books = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String SQL="SELECT * FROM books";
            ResultSet resultSet = statement.executeQuery(SQL);

            while (resultSet.next()){
                BookModel book = new BookModel();

                book.setId(resultSet.getInt("id"));
                book.setNameOfBook(resultSet.getString("nameOfBook"));
                book.setDescriptionOfBook(resultSet.getString("descriptionOfBook"));
                books.add(book);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }
}
