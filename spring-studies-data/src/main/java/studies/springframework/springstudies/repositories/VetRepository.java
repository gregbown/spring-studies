package studies.springframework.springstudies.repositories;

import org.springframework.data.repository.CrudRepository;
import studies.springframework.springstudies.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
