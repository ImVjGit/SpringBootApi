package com.AirSystem.Repository;

import com.AirSystem.Entity.Source;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SourceRepository extends JpaRepository<Source,Long> {
     public static Source findBySourceName(String nm){

         return  SourceRepository.findBySourceName(nm);
     }
}
