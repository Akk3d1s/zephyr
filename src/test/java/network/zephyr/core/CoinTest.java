package network.zephyr.core;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class CoinTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void initTest() throws Exception {
        Coin coin = new Coin();
        assertThat(coin).hasFieldOrProperty("transactions");
    }
}