package co.org.rickymorty.core.application.repository.messenger;


import co.org.rickymorty.core.application.entity.messenger.characterDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<characterDomain, Long> {
}
