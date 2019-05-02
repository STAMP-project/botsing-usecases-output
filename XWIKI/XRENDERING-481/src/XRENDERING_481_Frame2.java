

import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.evosuite.shaded.org.mockito.Mockito;
import org.junit.Test;
import org.xwiki.component.descriptor.ComponentDescriptor;
import org.xwiki.properties.BeanManager;
import org.xwiki.rendering.block.ImageBlock;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.internal.macro.toc.TocMacro;
import org.xwiki.rendering.listener.Listener;
import org.xwiki.rendering.macro.AbstractMacro;
import org.xwiki.rendering.macro.MacroExecutionException;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.parser.Parser;
import org.xwiki.rendering.renderer.reference.link.LinkLabelGenerator;
import org.xwiki.rendering.transformation.MacroTransformationContext;

import javax.inject.Provider;


import java.util.Map;

public class XRENDERING_481_Frame2 {
    public void test0() throws MacroExecutionException {
          TocMacroParameters tocMacroParameters0 = new TocMacroParameters();
          boolean boolean0 = true;
          TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
          tocMacroParameters0.setScope(tocMacroParameters_Scope0);
          tocMacroParameters0.setNumbered(boolean0);
          String string0 = "5/x),Q1'`O*.ZswY";
          int int0 = (-4309);
          tocMacroParameters0.setDepth(int0);
          MacroTransformationContext macroTransformationContext0 = new MacroTransformationContext();
          TocMacro tocMacro0 = new TocMacro();
          LinkLabelGenerator linkLabelGenerator1 = Mockito.mock(LinkLabelGenerator.class, new ViolatedAssumptionAnswer());
          Injector.inject(tocMacro0, (Class<?>) TocMacro.class, "linkLabelGenerator", (Object) linkLabelGenerator1);
          Parser parser0 = Mockito.mock(Parser.class, new ViolatedAssumptionAnswer());
          Injector.inject(tocMacro0, (Class<?>) TocMacro.class, "plainTextParser", (Object) parser0);
          Provider<TocMacroParameters> provider1 = (Provider<TocMacroParameters>) Mockito.mock(Provider.class, new ViolatedAssumptionAnswer());
          Mockito.doReturn((Object) null).when(provider1).get();
          Injector.inject(tocMacro0, (Class<?>) TocMacro.class, "wikiModelProvider", (Object) provider1);
          BeanManager beanManager1 = Mockito.mock(BeanManager.class, new ViolatedAssumptionAnswer());
          Injector.inject(tocMacro0, (Class<?>) AbstractMacro.class, "beanManager", (Object) beanManager1);
          ComponentDescriptor<ImageBlock> componentDescriptor1 = (ComponentDescriptor<ImageBlock>) Mockito.mock(ComponentDescriptor.class, new ViolatedAssumptionAnswer());
          Injector.inject(tocMacro0, (Class<?>) AbstractMacro.class, "componentDescriptor", (Object) componentDescriptor1);
          Injector.validateBean(tocMacro0, (Class<?>) TocMacro.class);
          Map<String, String> map0 = Listener.EMPTY_PARAMETERS;
          boolean boolean1 = true;
          MacroBlock macroBlock0 = new MacroBlock(string0, map0, boolean1);
          macroTransformationContext0.setCurrentMacroBlock(macroBlock0);
          String string2 = "attribute";
          tocMacro0.execute(tocMacroParameters0, string2, macroTransformationContext0);
      }
}
