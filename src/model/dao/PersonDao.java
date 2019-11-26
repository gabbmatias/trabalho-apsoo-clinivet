package model.dao;

import model.entity.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonDao implements Dao<Person> {

    Connection connection;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Person get(long id) {

        String sql = "SELECT * FROM people WHERE cpf=?";
        Person person = new Person();

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, Long.toString(id));
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                person.setCpf(result.getString("cpf"));
                person.setName(result.getString("nome"));
                person.setEmail(result.getString("email"));
                return person;
            }
        } catch (SQLException e) {
            Logger.getLogger(PersonDao.class.getName()).log(Level.SEVERE, null, e);
        }

        return null;
    }

    @Override
    public List<Person> getAll() {
        return null;
    }

    @Override
    public void save(Person person) {

    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Person person) {

    }
}
