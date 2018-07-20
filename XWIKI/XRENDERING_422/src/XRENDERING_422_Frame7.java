import org.evosuite.shaded.org.mockito.Matchers;
import org.evosuite.shaded.org.mockito.Mockito;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;
import java.util.NoSuchElementException;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.xwiki.rendering.listener.Format;
import org.xwiki.rendering.listener.Listener;
import org.xwiki.rendering.listener.chaining.BlockStateChainingListener;
import org.xwiki.rendering.listener.chaining.ConsecutiveNewLineStateChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;


public class XRENDERING_422_Frame7 {
    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        ListenerChain listenerChain0 = new ListenerChain();
        EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
        ListenerChain listenerChain1 = Mockito.mock(ListenerChain.class, new ViolatedAssumptionAnswer());
        Mockito.doReturn(emptyBlockChainingListener0).when(listenerChain1).getNextListener(Matchers.any(java.lang.Class.class));
        BlockStateChainingListener blockStateChainingListener0 = new BlockStateChainingListener(listenerChain1);
        ListenerChain listenerChain2 = Mockito.mock(ListenerChain.class, new ViolatedAssumptionAnswer());
        Mockito.doReturn(blockStateChainingListener0).when(listenerChain2).getNextListener(Matchers.any(java.lang.Class.class));
        ConsecutiveNewLineStateChainingListener consecutiveNewLineStateChainingListener0 =
                new ConsecutiveNewLineStateChainingListener(listenerChain2);
        ListenerChain listenerChain3 = Mockito.mock(ListenerChain.class, new ViolatedAssumptionAnswer());
        Mockito.doReturn(consecutiveNewLineStateChainingListener0).when(listenerChain3).getNextListener(Matchers.any(java.lang.Class.class));
        EmptyBlockChainingListener emptyBlockChainingListener1 = new EmptyBlockChainingListener(listenerChain3);
        Map<String, String> map0 = Listener.EMPTY_PARAMETERS;
        Format format0 = Format.NONE;
        emptyBlockChainingListener1.endFormat(format0, map0);

}
}
