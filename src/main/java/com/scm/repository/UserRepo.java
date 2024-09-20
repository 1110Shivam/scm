// package com.scm.repository;

// import java.util.Optional;

// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

// import com.scm.entity.User;

// @Repository
// public interface UserRepo extends JpaRepository<User,String>{

//     Optional<User> findByEmail(String email);

//     Optional<User> findByEmailAndPassword(String email, String password);

//     Optional<User> findByEmailToken(String id);
// }
package com.scm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scm.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {
    // extra methods db relatedoperations
    // custom query methods
    // custom finder methods

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);

}