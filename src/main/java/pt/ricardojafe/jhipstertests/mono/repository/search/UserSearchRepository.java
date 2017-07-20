package pt.ricardojafe.jhipstertests.mono.repository.search;

import pt.ricardojafe.jhipstertests.mono.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {
}
