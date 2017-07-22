package network.zephyr.core;

import org.apache.log4j.Logger;

import javax.annotation.Nullable;
import java.io.Serializable;
import java.util.List;

public class Coin implements Serializable {

    private static Logger log = Logger.getLogger(Coin.class.getName());

    @Nullable
    List<Transaction> transactions;
}
