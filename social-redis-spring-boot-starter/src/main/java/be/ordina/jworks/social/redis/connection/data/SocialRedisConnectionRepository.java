package be.ordina.jworks.social.redis.connection.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialRedisConnectionRepository extends CrudRepository<SocialRedisConnection, String> {

    Iterable<SocialRedisConnection> findByProviderId(final String providerId);

    Iterable<SocialRedisConnection> findByUserIdAndProviderId(final String userId, final String providerId);

    SocialRedisConnection findOneByUserIdAndProviderIdAndProviderUserId(String userId, String providerId, String providerUserId);

    // TODO: will be available once DATAKV-135 is finished
    void deleteByUserIdAndProviderIdAndProviderUserId(final String userId, final String providerId, final String providerUserId);

    Iterable<SocialRedisConnection> findByUserId(final String userId);

    Iterable<SocialRedisConnection> findByProviderIdAndProviderUserId(final String providerId, final String providerUserId);
}
