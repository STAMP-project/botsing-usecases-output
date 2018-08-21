import com.xpn.xwiki.XWikiContext;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;

import java.time.LocalDate;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.loader.custom.sql.SQLCustomQuery;
import org.junit.runner.RunWith;
import org.slf4j.helpers.NOPLogger;
import org.xwiki.cache.CacheManager;
import org.xwiki.component.manager.ComponentManager;
import org.xwiki.configuration.internal.AbstractDocumentConfigurationSource;
import org.xwiki.mail.internal.configuration.DefaultMailSenderConfiguration;
import org.xwiki.mail.internal.configuration.SendMailConfigClassDocumentConfigurationSource;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.observation.ObservationManager;
import org.xwiki.observation.internal.DefaultObservationManager;
import org.xwiki.properties.ConverterManager;
import org.xwiki.wiki.descriptor.WikiDescriptorManager;
import org.xwiki.observation.event.Event;


// Stack trace is:
// java.lang.IllegalArgumentException: An Entity Reference name cannot be null or empty
// 	at org.xwiki.model.reference.EntityReference.setName(EntityReference.java:186)
// 	at org.xwiki.model.reference.EntityReference.<init>(EntityReference.java:171)
// 	at org.xwiki.model.reference.EntityReference.<init>(EntityReference.java:142)
// 	at org.xwiki.model.reference.WikiReference.<init>(WikiReference.java:61)
// 	at org.xwiki.configuration.internal.AbstractDocumentConfigurationSource.getCurrentWikiReference(AbstractDocumentConfigurationSource.java:185)
// 	at org.xwiki.mail.internal.configuration.SendMailConfigClassDocumentConfigurationSource.getDocumentReference(SendMailConfigClassDocumentConfigurationSource.java:68)
// 	at org.xwiki.configuration.internal.AbstractDocumentConfigurationSource.getCacheKeyPrefix(AbstractDocumentConfigurationSource.java:122)
// 	at org.xwiki.configuration.internal.AbstractDocumentConfigurationSource.getPropertyValue(AbstractDocumentConfigurationSource.java:306)
// 	at org.xwiki.configuration.internal.AbstractDocumentConfigurationSource.getProperty(AbstractDocumentConfigurationSource.java:301)
// 	at org.xwiki.mail.internal.configuration.DefaultMailSenderConfiguration.getSendWaitTime(DefaultMailSenderConfiguration.java:313)

public class Xwiki_13546 {
    @Test
    public void frame10() throws Throwable {
        DefaultMailSenderConfiguration defaultMailSenderConfiguration0 = new DefaultMailSenderConfiguration();
        SendMailConfigClassDocumentConfigurationSource sendMailConfigClassDocumentConfigurationSource0 = new SendMailConfigClassDocumentConfigurationSource();
        WikiDescriptorManager wikiDescriptorManager0 = mock(WikiDescriptorManager.class, new ViolatedAssumptionAnswer());
        doReturn((String) null).when(wikiDescriptorManager0).getCurrentWikiId();
        Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "wikiManager", (Object) wikiDescriptorManager0);
        Injector.inject(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class, "mailConfigSource", (Object) sendMailConfigClassDocumentConfigurationSource0);
        defaultMailSenderConfiguration0.getSendWaitTime();
    }
}
