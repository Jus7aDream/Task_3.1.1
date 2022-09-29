package com.artour.repo;

import com.artour.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ In the name of Allah, most gracious and most merciful! 29.09.2022
 */
@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
