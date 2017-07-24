package network.zephyr.core;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "coins", path = "coins")
@Transactional(readOnly = true)
@Repository("CoinRepository")
public interface CoinRepository extends PagingAndSortingRepository<Coin, UUID> {

}
