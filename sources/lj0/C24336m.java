package lj0;

import ak0.C21006a;
import java.io.StringReader;
import org.simpleframework.xml.stream.PullReader;
import org.xmlpull.p982v1.XmlPullParser;

/* renamed from: lj0.m */
public final class C24336m implements C24335l {

    /* renamed from: a */
    public final C21006a f61635a;

    public C24336m() throws Exception {
        C21006a a = C21006a.m49161a();
        this.f61635a = a;
        a.f52759c.put(XmlPullParser.FEATURE_PROCESS_NAMESPACES, new Boolean(true));
    }

    /* renamed from: a */
    public final C24328e mo60474a(StringReader stringReader) throws Exception {
        XmlPullParser b = this.f61635a.mo53086b();
        b.setInput(stringReader);
        return new PullReader(b);
    }
}
