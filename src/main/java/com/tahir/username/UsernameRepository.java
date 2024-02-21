package com.tahir.username;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UsernameRepository extends JpaRepository<Username, Integer>{

    Username findByUsername(String username);
 
}