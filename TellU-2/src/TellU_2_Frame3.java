

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import no.tellu.cloud.mediator.api.ServiceRegistry;
import no.tellu.cloud.mediator.test.TestService;
import no.tellu.lib.data.DataHandleImpl;
import no.tellu.lib.data.DataNotFoundException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

/**
 * Tests for frame 3.
 */

public class TellU_2_Frame3 {

    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        TestService testService0 = new TestService("", false);
        DataHandleImpl dataHandleImpl0 = new DataHandleImpl();
        ServiceRegistry serviceRegistry0 = mock(ServiceRegistry.class, new ViolatedAssumptionAnswer());
        testService0.init(dataHandleImpl0, serviceRegistry0);
    }
}
