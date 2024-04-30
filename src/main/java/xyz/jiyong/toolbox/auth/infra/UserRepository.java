package xyz.jiyong.toolbox.auth.infra;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.jiyong.toolbox.auth.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
