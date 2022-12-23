package p168m4;

import java.util.HashMap;
import org.xml.sax.helpers.AttributesImpl;
import p043ch.qos.logback.core.joran.spi.ActionException;
import p070e4.C4546a;
import p193o4.C5982h;
import p271u4.C6695f;
import p296w4.C6992h;

/* renamed from: m4.c */
public final class C5685c<E> extends C5684b {

    /* renamed from: e */
    public C4546a<E> f18472e;

    /* renamed from: f */
    public boolean f18473f = false;

    /* renamed from: m */
    public final void mo170m(C5982h hVar, String str, AttributesImpl attributesImpl) throws ActionException {
        this.f18472e = null;
        this.f18473f = false;
        String value = attributesImpl.getValue("class");
        if (C6992h.m16474c(value)) {
            StringBuilder l = C13555b.m33973l("Missing class name for appender. Near [", str, "] line ");
            l.append(C5684b.m13976p(hVar));
            mo21722a(l.toString());
            this.f18473f = true;
            return;
        }
        try {
            mo22865i("About to instantiate appender of type [" + value + "]");
            if (value.equals("ch.qos.logback.core.ConsoleAppender")) {
                mo22867k("ConsoleAppender is deprecated for LogcatAppender");
            }
            C4546a<E> aVar = (C4546a) C6992h.m16473b(value, C4546a.class, this.f20771c);
            this.f18472e = aVar;
            aVar.mo20064b(this.f20771c);
            String q = hVar.mo21977q(attributesImpl.getValue("name"));
            if (C6992h.m16474c(q)) {
                mo22867k("No appender name given for appender of type " + value + "].");
            } else {
                this.f18472e.mo20054h(q);
                mo22865i("Naming appender as [" + q + "]");
            }
            ((HashMap) hVar.f19131f.get("APPENDER_BAG")).put(q, this.f18472e);
            hVar.mo21976p(this.f18472e);
        } catch (Exception e) {
            this.f18473f = true;
            mo21727f("Could not create an Appender of type [" + value + "].", e);
            throw new ActionException(e);
        }
    }

    /* renamed from: o */
    public final void mo171o(C5982h hVar, String str) {
        if (!this.f18473f) {
            C4546a<E> aVar = this.f18472e;
            if (aVar instanceof C6695f) {
                aVar.start();
            }
            if (hVar.mo21974n() != this.f18472e) {
                StringBuilder k = C13555b.m33972k("The object at the of the stack is not the appender named [");
                k.append(this.f18472e.getName());
                k.append("] pushed earlier.");
                mo22867k(k.toString());
                return;
            }
            hVar.mo21975o();
        }
    }
}
