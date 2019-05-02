





import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.XWikiException;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.BaseObject;
import com.xpn.xwiki.objects.IntegerProperty;
import com.xpn.xwiki.objects.classes.BaseClass;
import org.apache.struts.chain.contexts.MockActionContext;
import org.junit.Test;

import java.util.Map;


public class XWIKI_13377_Frame3 {

  @Test
    public void test0()  throws XWikiException {
      BaseClass baseClass0 = new BaseClass();
     MockActionContext mockActionContext0 = new MockActionContext();
     baseClass0.setFields(mockActionContext0);
     String string0 = "r";
     IntegerProperty integerProperty0 = new IntegerProperty();
     baseClass0.addPropertyForRemoval(integerProperty0);
     String string1 = null;
     int int0 = (-3333);
     baseClass0.addTextAreaField(string0, string1, int0, int0);
     XWikiContext xWikiContext0 = new XWikiContext();
     BaseObject baseObject0 = baseClass0.newCustomClassInstance(xWikiContext0);
     baseClass0.fromMap((Map<String, ?>) mockActionContext0, (BaseCollection) baseObject0);
    }


}
