package Troskin.SocialDiplom.repo;

import Troskin.SocialDiplom.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}