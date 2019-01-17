package studies.springframework.springstudies.repositories;

import org.springframework.data.repository.CrudRepository;
import studies.springframework.springstudies.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
