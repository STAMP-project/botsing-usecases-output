
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.store.migration.AbstractDataMigrationManager;
import com.xpn.xwiki.store.migration.hibernate.HibernateDataMigrationManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.xwiki.component.manager.ComponentManager;
import org.xwiki.context.Execution;
import org.xwiki.context.ExecutionContext;
import org.xwiki.job.event.status.JobProgressManager;
import org.xwiki.observation.ObservationManager;


public class XWIKI_13616_Frame3 {

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        HibernateDataMigrationManager hibernateDataMigrationManager0 = new HibernateDataMigrationManager();
        ComponentManager componentManager0 = mock(ComponentManager.class, new ViolatedAssumptionAnswer());
        Injector.inject(hibernateDataMigrationManager0, (Class<?>) AbstractDataMigrationManager.class, "componentManager", (Object) componentManager0);
        Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
        doReturn((ExecutionContext) null).when(execution0).getContext();
        Injector.inject(hibernateDataMigrationManager0, (Class<?>) AbstractDataMigrationManager.class, "execution", (Object) execution0);
        Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
        Injector.inject(hibernateDataMigrationManager0, (Class<?>) AbstractDataMigrationManager.class, "logger", (Object) logger0);
        ObservationManager observationManager0 = mock(ObservationManager.class, new ViolatedAssumptionAnswer());
        Injector.inject(hibernateDataMigrationManager0, (Class<?>) AbstractDataMigrationManager.class, "observationManager", (Object) observationManager0);
        JobProgressManager jobProgressManager0 = mock(JobProgressManager.class, new ViolatedAssumptionAnswer());
        Injector.inject(hibernateDataMigrationManager0, (Class<?>) AbstractDataMigrationManager.class, "progress", (Object) jobProgressManager0);
        Injector.validateBean(hibernateDataMigrationManager0, (Class<?>) HibernateDataMigrationManager.class);
        hibernateDataMigrationManager0.getDBVersionFromDatabase();
    }


}
