package com.techelevator.petdao;

import com.techelevator.petmodel.Pet;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcPetDao implements PetDAO {

    private JdbcTemplate jdbcTemplate;

    public JdbcPetDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Pet> getAllPets() {
        List<Pet> pets = new ArrayList<>();
        String sql = "SELECT * FROM pets;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            Pet pet = mapRowToPet(results);
            pets.add(pet);
        }
        return pets;
    }

    private Pet mapRowToPet(SqlRowSet results) {
        Pet pet = new Pet();
        pet.setPetID(results.getInt("pet_id"));
        pet.setName(results.getString("name"));
        pet.setDescription(results.getString("description"));
        pet.setAdoptable(results.getBoolean("is_adoptable"));
        pet.setPic(results.getString("pic"));
        pet.setBreed(results.getString("breed"));
        pet.setType(results.getString("pet_type"));
        return pet;
    }

}