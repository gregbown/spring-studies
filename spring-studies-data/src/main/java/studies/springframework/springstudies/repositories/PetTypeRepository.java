package studies.springframework.springstudies.repositories;

import org.springframework.data.repository.CrudRepository;
import studies.springframework.springstudies.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
