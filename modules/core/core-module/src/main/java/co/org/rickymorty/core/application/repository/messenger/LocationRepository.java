package co.org.rickymorty.core.application.repository.messenger;


import co.org.rickymorty.core.application.entity.messenger.locationDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<locationDomain, Long> {
}
