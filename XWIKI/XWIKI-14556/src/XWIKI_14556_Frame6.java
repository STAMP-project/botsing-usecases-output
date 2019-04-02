

import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.Query;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.query.OrdinalParameterDescriptor;
import org.hibernate.engine.query.ParameterMetadata;
import org.hibernate.impl.CollectionFilterImpl;
import org.infinispan.atomic.impl.AtomicHashMap;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;
import org.xwiki.component.internal.UserComponentManager;
import org.xwiki.configuration.ConfigurationSource;
import org.xwiki.query.internal.*;



import java.util.Vector;
import java.util.concurrent.LinkedBlockingDeque;

import static org.evosuite.shaded.org.mockito.ArgumentMatchers.any;
import static org.evosuite.shaded.org.mockito.ArgumentMatchers.anyString;
import static org.evosuite.shaded.org.mockito.ArgumentMatchers.nullable;
import static org.evosuite.shaded.org.mockito.Mockito.doReturn;
import static org.evosuite.shaded.org.mockito.Mockito.mock;


public class xwiki_14556_frame6 {

  @Test
    public void xwiki_14556_frame6() throws InterruptedException {
        HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
        String string0 = ",";
        DefaultQuery defaultQuery0 = new DefaultQuery(string0, hqlQueryExecutor0);
        String string1 = "iw";
        DefaultQuery defaultQuery1 = (DefaultQuery)defaultQuery0.bindValue(string1, (Object) hqlQueryExecutor0);
        HiddenSpaceFilter hiddenSpaceFilter0 = new HiddenSpaceFilter();
        ConfigurationSource configurationSource0 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
        doReturn((Object) null).when(configurationSource0).getProperty(anyString() , nullable(Class.class));
        Injector.inject(hiddenSpaceFilter0, (Class<?>) AbstractHiddenFilter.class, "userPreferencesSource", (Object) configurationSource0);
        LinkedBlockingDeque<SubstituteLoggingEvent> linkedBlockingDeque0 = new LinkedBlockingDeque<SubstituteLoggingEvent>();
        boolean boolean0 = false;
        SubstituteLoggingEvent substituteLoggingEvent0 = new SubstituteLoggingEvent();
        linkedBlockingDeque0.put(substituteLoggingEvent0);
        linkedBlockingDeque0.getLast();
        SubstituteLogger substituteLogger0 = new SubstituteLogger(string0, linkedBlockingDeque0, boolean0);
        Injector.inject(hiddenSpaceFilter0, (Class<?>) AbstractWhereQueryFilter.class, "logger", (Object) substituteLogger0);
        Injector.validateBean(hiddenSpaceFilter0, (Class<?>) HiddenSpaceFilter.class);
        hiddenSpaceFilter0.initialize();
        Vector<EscapeLikeParametersFilter> vector0 = new Vector<EscapeLikeParametersFilter>();
        String string2 = "cg2J]/*h4ILwH.`JL";
        Query query0 = mock(Query.class, new ViolatedAssumptionAnswer());
        doReturn((Query) null).when(query0).setParameter(anyString() , any());
        SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
        OrdinalParameterDescriptor[] ordinalParameterDescriptorArray0 = null;
        AtomicHashMap<UserComponentManager, ScriptQueryParameter> atomicHashMap0 = new AtomicHashMap<UserComponentManager, ScriptQueryParameter>();
        ParameterMetadata parameterMetadata0 = new ParameterMetadata(ordinalParameterDescriptorArray0, atomicHashMap0);
        CollectionFilterImpl collectionFilterImpl0 = new CollectionFilterImpl(string2, defaultQuery1, sessionImplementor0, parameterMetadata0);
        hqlQueryExecutor0.populateParameters(collectionFilterImpl0, defaultQuery1);
    }


}
