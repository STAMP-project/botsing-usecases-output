


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import com.xpn.xwiki.objects.classes.BaseClass;


public class XWIKI_13916_Frame3 {

    @Test(timeout = 4000)
    public void test0()  throws Throwable {
        BaseClass baseClass0 = new BaseClass();
        baseClass0.addEmailField("ZTuu;2N@6Z", "ZTuu;2N@6Z", 231);
        TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.VELOCITY_CODE;
        baseClass0.addTextAreaField("ZTuu;2N@6Z", "9Es6$!=a;JC1z]", 0, 0, textAreaClass_ContentType0);
    }
}
