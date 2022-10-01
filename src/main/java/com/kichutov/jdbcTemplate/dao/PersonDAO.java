package com.kichutov.jdbcTemplate.dao;

import com.kichutov.jdbcTemplate.models.Book;
import com.kichutov.jdbcTemplate.models.Person;

import java.util.List;
import java.util.Optional;

public interface PersonDAO {

    /**
     *  Return list of all people
     */
    List<Person> index();

    /**
     *  Add new person in a database
     */
    void save(Person person);

    /**
     *  Find person in a database by id
     */
    Person show(int id);

    /**
     *  Update information of person
     */
    void update(int id, Person person);

    /**
     *  Remove person from database
     */
    void delete(int id);

    /**
     *  Return Optional of person from database by fullName
     */
    Optional<Person> getPersonByFullName(String fullName);

    /**
     *  Return list of books from database by personId
     */
    List<Book> getBooksByPersonId(int id);
}
