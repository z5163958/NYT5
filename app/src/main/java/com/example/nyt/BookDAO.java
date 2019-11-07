package com.example.nyt;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.nyt.model.Book;

import java.util.List;

@Dao
public interface BookDAO {

    @Query("SELECT * FROM book")
    List<Book> getAllBooks();

    @Query("SELECT * FROM book WHERE isbn = :isbn")
    Book getBookByIsbn(long isbn);

    @Insert
    void insert(Book book);
}
