//package com.xworkz.integration.repository;
//
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class PersonAndDepartmentRepo {
//
//
//}
package com.xworkz.integration.repository;

import com.xworkz.integration.entity.DepartmentEntity;
import com.xworkz.integration.entity.PersonEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface
DepartmentRepository extends CrudRepository<DepartmentEntity, Integer> {
    // Custom query for joining
    @Query("SELECT d FROM DepartmentEntity d WHERE d.id = :departmentId")
    DepartmentEntity findDepartmentById(Integer departmentId);
}

