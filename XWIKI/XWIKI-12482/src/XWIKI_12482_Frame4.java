

package com.xpn.xwiki.store.hibernate.query;





import org.junit.Test;

public class XWIKI_12482_Frame4 {

  public void test0()  {
    String string4 = "select now()";
    HqlQueryExecutor.isSafeSelect(string4);
  }
}
