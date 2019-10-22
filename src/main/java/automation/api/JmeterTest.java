package automation.api;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

public class JmeterTest implements JavaSamplerClient {
    private String interfaceName;
    private String methodName;

    public void setupTest(JavaSamplerContext javaSamplerContext) {
        System.out.println("Setup Test");
    }

    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        SampleResult result = new SampleResult();
        interfaceName = javaSamplerContext.getParameter("interfaceName");
        methodName = javaSamplerContext.getParameter("methodName");
        result.sampleStart();
        result.setResponseData(interfaceName + ":" + methodName, "UTF-8");
        result.sampleEnd();
        result.setSuccessful(true);
        result.setDataEncoding("UTF-8");
        return result;
    }

    public void teardownTest(JavaSamplerContext javaSamplerContext) {
        System.out.println("Teardown Test");
    }

    public Arguments getDefaultParameters() {
        Arguments arguments = new Arguments();
        arguments.addArgument("interfaceName","interface");
        arguments.addArgument("methodName","method");
        return arguments;
    }

    public static void main(String[] args) {
        JmeterTest jmeterTest = new JmeterTest();
        JavaSamplerContext arg0 = new JavaSamplerContext(jmeterTest.getDefaultParameters());
        jmeterTest.setupTest(arg0);
        jmeterTest.runTest(arg0);
        jmeterTest.teardownTest(arg0);
    }
}
