package eu.sirotin.gradleexamples.java1;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author vsirotin
 */
public class WelcomerTest {

    @Test
    public void testWelcomer() {
        String result = new Welcomer().getText();
        Assert.assertEquals("Welcome!", result);
    }
}
