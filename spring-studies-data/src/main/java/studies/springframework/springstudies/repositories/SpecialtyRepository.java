package studies.springframework.springstudies.repositories;

import org.springframework.data.repository.CrudRepository;
import studies.springframework.springstudies.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
