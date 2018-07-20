import com.xpn.xwiki.objects.BaseObject;
import org.junit.Test;

public class Xwiki_13372 {
    @Test
    public void frame3() throws Throwable {
        BaseObject baseObject0 = new BaseObject();
        baseObject0.setLargeStringValue("", "");
        BaseObject baseObject1 = new BaseObject();
        baseObject1.setIntValue("}XG^cs] /4l", (-1));
        baseObject0.equals(baseObject1);
    }
}
