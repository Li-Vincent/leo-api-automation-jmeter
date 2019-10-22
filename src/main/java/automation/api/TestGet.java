package automation.api;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

public class TestGet implements JavaSamplerClient {
    public void setupTest(JavaSamplerContext javaSamplerContext) {

    }

    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        return null;
    }

    public void teardownTest(JavaSamplerContext javaSamplerContext) {

    }

    public Arguments getDefaultParameters() {
        return null;
    }
}
