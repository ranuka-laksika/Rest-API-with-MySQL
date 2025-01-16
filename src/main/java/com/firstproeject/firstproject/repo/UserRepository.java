package com.firstproeject.firstproject.repo;

import com.firstproeject.firstproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Integer> {

    @Query(value= "SELECT * FROM USER WHERE ID = ?1",nativeQuery = true)
    User getUserById(String id);

    @Query(value="SELECT * FROM USER WHERE ID=?1 AND EMAIL=?2",nativeQuery = true)
    User getUserByIdAndEmail(String id,String email);



}
