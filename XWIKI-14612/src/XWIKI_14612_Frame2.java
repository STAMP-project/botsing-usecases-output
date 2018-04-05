

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.chrono.MinguoDate;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.infinispan.stream.impl.DistributedIntCacheStream;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.syntax.Syntax;

public class XWIKI_14612_Frame2 {

    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        DefaultContentParser defaultContentParser0 = new DefaultContentParser();
        Provider<MinguoDate> provider0 = (Provider<MinguoDate>) mock(Provider.class, new ViolatedAssumptionAnswer());
        doReturn((Object) null).when(provider0).get();
        Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "componentManagerProvider", (Object) provider0);
        EntityReferenceSerializer<DistributedIntCacheStream> entityReferenceSerializer0 = (EntityReferenceSerializer<DistributedIntCacheStream>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
        Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "serializer", (Object) entityReferenceSerializer0);
        Injector.validateBean(defaultContentParser0, (Class<?>) DefaultContentParser.class);
        Syntax syntax0 = mock(Syntax.class, new ViolatedAssumptionAnswer());
        doReturn((String) null).when(syntax0).toIdString();
        defaultContentParser0.parse("", syntax0, (EntityReference) null);

    }
}
