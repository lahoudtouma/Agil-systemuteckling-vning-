package com.example.asvtestdel2.PersonDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;


@Repository
public class PersonDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertPerson(int id, String namn, String födelsedag, String adress) {

        String query = "INSERT INTO person (Person_id, Person_namn, Person_födelsedag, Person,adress) VALUES(?,?,?,?)";

        int result = jdbcTemplate.update(query, id, namn, födelsedag, adress);

        if (result > 0) {
            System.out.println(result + "Personen du sökt upp: ");

        }
    }

    public Person getPersonById(int id){

        String query = "SELECT * FROM Person WHERE person_id =?";

        Person person = jdbcTemplate.queryForObject(query, new RowMapper<Person>() {
            @Override
            public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
                Person per = new Person(rs.getInt("person_id"),
                        rs.getString("person_namn"),
                        rs.getString("person_födelsedag"),
                        rs.getString("person_adress"));


                return per;

            }
        }, id);

        return person;



    }








}


