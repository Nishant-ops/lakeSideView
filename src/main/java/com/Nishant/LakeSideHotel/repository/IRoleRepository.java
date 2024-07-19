package com.Nishant.LakeSideHotel.repository;

import com.Nishant.LakeSideHotel.model.Role;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(String role);


    boolean existsByName(String role);
}
