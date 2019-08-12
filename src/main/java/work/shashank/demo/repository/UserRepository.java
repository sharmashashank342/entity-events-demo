package work.shashank.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.shashank.demo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
