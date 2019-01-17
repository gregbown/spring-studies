package studies.springframework.springstudies.repositories;

import org.springframework.data.repository.CrudRepository;
import studies.springframework.springstudies.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
