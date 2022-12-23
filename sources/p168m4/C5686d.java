package p168m4;

import java.util.HashMap;
import org.xml.sax.helpers.AttributesImpl;
import p070e4.C4546a;
import p193o4.C5982h;
import p271u4.C6690a;
import p296w4.C6992h;

/* renamed from: m4.d */
public final class C5686d<E> extends C5684b {
    /* renamed from: m */
    public final void mo170m(C5982h hVar, String str, AttributesImpl attributesImpl) {
        Object n = hVar.mo21974n();
        if (!(n instanceof C6690a)) {
            StringBuilder l = C13555b.m33973l("Could not find an AppenderAttachable at the top of execution stack. Near [", str, "] line ");
            l.append(C5684b.m13976p(hVar));
            mo21722a(l.toString());
            return;
        }
        C6690a aVar = (C6690a) n;
        String q = hVar.mo21977q(attributesImpl.getValue("ref"));
        if (C6992h.m16474c(q)) {
            mo21722a("Missing appender ref attribute in <appender-ref> tag.");
            return;
        }
        C4546a aVar2 = (C4546a) ((HashMap) hVar.f19131f.get("APPENDER_BAG")).get(q);
        if (aVar2 == null) {
            mo21722a("Could not find an appender named [" + q + "]. Did you define it below instead of above in the configuration file?");
            mo21722a("See http://logback.qos.ch/codes.html#appender_order for more details.");
            return;
        }
        mo22865i("Attaching appender named [" + q + "] to " + aVar);
        aVar.mo6664a(aVar2);
    }

    /* renamed from: o */
    public final void mo171o(C5982h hVar, String str) {
    }
}
