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

public class Xwiki_13546 {
    @Test
    public void frame10() throws Throwable {
        Logger logger0 = (Logger)SQLCustomQuery.log;
        NOPLogger nOPLogger0 = NOPLogger.NOP_LOGGER;
        DefaultMailSenderConfiguration defaultMailSenderConfiguration0 = new DefaultMailSenderConfiguration();
        SendMailConfigClassDocumentConfigurationSource sendMailConfigClassDocumentConfigurationSource0 = new SendMailConfigClassDocumentConfigurationSource();
        CacheManager cacheManager0 = mock(CacheManager.class, new ViolatedAssumptionAnswer());
        Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "cacheManager", (Object) cacheManager0);
        ConverterManager converterManager0 = mock(ConverterManager.class, new ViolatedAssumptionAnswer());
        Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "converter", (Object) converterManager0);
        Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "logger", (Object) nOPLogger0);
        DefaultObservationManager defaultObservationManager0 = new DefaultObservationManager();
        ComponentManager componentManager0 = mock(ComponentManager.class, new ViolatedAssumptionAnswer());
        Injector.inject(defaultObservationManager0, (Class<?>) DefaultObservationManager.class, "componentManager", (Object) componentManager0);
        Injector.inject(defaultObservationManager0, (Class<?>) DefaultObservationManager.class, "logger", (Object) nOPLogger0);
        Injector.validateBean(defaultObservationManager0, (Class<?>) DefaultObservationManager.class);
        Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "observation", (Object) defaultObservationManager0);
        EntityReferenceSerializer<Object> entityReferenceSerializer0 = (EntityReferenceSerializer<Object>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
        Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "referenceSerializer", (Object) entityReferenceSerializer0);
        WikiDescriptorManager wikiDescriptorManager0 = mock(WikiDescriptorManager.class, new ViolatedAssumptionAnswer());
        doReturn((String) null).when(wikiDescriptorManager0).getCurrentWikiId();
        Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "wikiManager", (Object) wikiDescriptorManager0);
        Provider<LocalDate> provider0 = (Provider<LocalDate>) mock(Provider.class, new ViolatedAssumptionAnswer());
        Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "xcontextProvider", (Object) provider0);
        Injector.validateBean(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) SendMailConfigClassDocumentConfigurationSource.class);
        Injector.inject(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class, "documentsSource", (Object) sendMailConfigClassDocumentConfigurationSource0);
        Injector.inject(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class, "logger", (Object) logger0);
        Injector.inject(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class, "mailConfigSource", (Object) sendMailConfigClassDocumentConfigurationSource0);
        Injector.inject(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class, "xwikiPropertiesSource", (Object) sendMailConfigClassDocumentConfigurationSource0);
        Injector.validateBean(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class);
        defaultMailSenderConfiguration0.getSendWaitTime();
    }
    @Test
    public void frame9() throws Throwable{
        SendMailConfigClassDocumentConfigurationSource sendMailConfigClassDocumentConfigurationSource0 = new SendMailConfigClassDocumentConfigurationSource();
        CacheManager cacheManager0 = mock(CacheManager.class, new ViolatedAssumptionAnswer());
        Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "cacheManager", (Object) cacheManager0);
        ConverterManager converterManager0 = mock(ConverterManager.class, new ViolatedAssumptionAnswer());
        Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "converter", (Object) converterManager0);
        Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
        Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "logger", (Object) logger0);
        ObservationManager observationManager0 = mock(ObservationManager.class, new ViolatedAssumptionAnswer());
        Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "observation", (Object) observationManager0);
        EntityReferenceSerializer<Event> entityReferenceSerializer0 = (EntityReferenceSerializer<Event>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
        Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "referenceSerializer", (Object) entityReferenceSerializer0);
        WikiDescriptorManager wikiDescriptorManager0 = mock(WikiDescriptorManager.class, new ViolatedAssumptionAnswer());
        doReturn((String) null).when(wikiDescriptorManager0).getCurrentWikiId();
        Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "wikiManager", (Object) wikiDescriptorManager0);
        Provider<XWikiContext> provider0 = (Provider<XWikiContext>) mock(Provider.class, new ViolatedAssumptionAnswer());
        Injector.inject(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) AbstractDocumentConfigurationSource.class, "xcontextProvider", (Object) provider0);
        Injector.validateBean(sendMailConfigClassDocumentConfigurationSource0, (Class<?>) SendMailConfigClassDocumentConfigurationSource.class);
        sendMailConfigClassDocumentConfigurationSource0.getProperty("N{by#dc;#7 )");

    }
}
