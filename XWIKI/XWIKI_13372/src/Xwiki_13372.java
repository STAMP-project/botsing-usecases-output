import com.xpn.xwiki.objects.BaseObject;
import org.junit.Test;
// The generated stack trace is:
// java.lang.NullPointerException
// 	at com.xpn.xwiki.objects.BaseProperty.equals(BaseProperty.java:96)
// 	at com.xpn.xwiki.objects.BaseStringProperty.equals(BaseStringProperty.java:57)
// 	at com.xpn.xwiki.objects.BaseCollection.equals(BaseCollection.java:614)
// 	at com.xpn.xwiki.objects.BaseObject.equals(BaseObject.java:235)
public class Xwiki_13372 {
    @Test
    public void frame4() throws Throwable {
        BaseObject baseObject0 = new BaseObject();
        baseObject0.setLargeStringValue("", "");
        BaseObject baseObject1 = new BaseObject();
        baseObject1.setIntValue("}XG^cs] /4l", (-1));
        baseObject0.equals(baseObject1);
    }
}
