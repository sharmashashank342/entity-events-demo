package work.shashank.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.shashank.demo.entities.Dummy;

@Repository
public interface DummyRepository extends JpaRepository<Dummy, Long> {

}
