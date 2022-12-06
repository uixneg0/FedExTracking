package com.uixneg0.fedextrackingserver.repositories;

import com.uixneg0.fedextrackingserver.entities.OAuth;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OAuthRepository extends CrudRepository<OAuth, Long> {
    OAuth findTopByOrderByIdDesc();
}
