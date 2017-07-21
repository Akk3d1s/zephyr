package network.zephyr.core;

import com.sun.istack.internal.Nullable;
import org.apache.log4j.Logger;

import java.io.Serializable;
import java.util.List;

public class Coin implements Serializable {

    private static Logger log = Logger.getLogger(Coin.class.getName());

    @Nullable
    List<Transaction> transactions;
}
