/**
 * 
 */
package org.nexus;

import org.junit.Test;

/**
 * Sample Integration test.
 * 
 * @author saurabh
 */
public class ITSampleCode {

    /**
     * invoke method
     */
    @Test
    public void testHelloTo() {
        SampleCode inst = new SampleCode();
        inst.helloTo("saurabh");
    }
}
