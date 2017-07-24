package network.zephyr.core;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.annotation.Nullable;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;
import java.util.UUID;

@Entity(name = "Coin")
@Table(name = "COIN")
public class Coin extends BaseEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Access(value = AccessType.PROPERTY)
    @Column(name = "UUID", columnDefinition = "BINARY(16)")
    private UUID uuid;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    private Set<Transaction> transactions;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Nullable
    public Set<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(@Nullable Set<Transaction> transactions) {
        this.transactions = transactions;
    }
}
