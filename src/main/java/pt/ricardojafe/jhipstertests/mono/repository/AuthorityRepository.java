package pt.ricardojafe.jhipstertests.mono.repository;

import pt.ricardojafe.jhipstertests.mono.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
