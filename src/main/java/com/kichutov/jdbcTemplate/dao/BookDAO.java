package com.kichutov.jdbcTemplate.dao;

import com.kichutov.jdbcTemplate.models.Book;
import com.kichutov.jdbcTemplate.models.Person;

import java.util.List;
import java.util.Optional;

public interface BookDAO {

    /**
     *  Return list of all books
     */
    List<Book> index();

    /**
     *  Add new book in a database
     */
    void save(Book book);

    /**
     *  Find book in a database by id
     */
    Book show(int id);

    /**
     *  Update information of book
     */
    void update(int id, Book book);

    /**
     *  Remove book from database
     */
    void delete(int id);

    /**
     *  Return book owner by id
     */
    Optional<Person> getBookOwner(int id);

    /**
     *  Remove owner from book by id
     */
    void release(int id);

    /**
     *  Add owner for a book by id and person information
     */
    void assign(int id, Person selectedPerson);
}
