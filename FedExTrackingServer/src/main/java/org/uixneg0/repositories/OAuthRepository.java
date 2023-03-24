package org.uixneg0.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.uixneg0.entities.OAuth;

@Repository
public interface OAuthRepository extends CrudRepository<OAuth, Long> {
	OAuth findTopByOrderByIdDesc();
}
