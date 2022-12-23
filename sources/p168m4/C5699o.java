package p168m4;

import org.xml.sax.helpers.AttributesImpl;
import p001a0.C0016g;
import p043ch.qos.logback.core.joran.spi.ActionException;
import p144k4.C5475a;
import p144k4.C5476b;
import p193o4.C5982h;
import p296w4.C6992h;

/* renamed from: m4.o */
public final class C5699o extends C5684b {

    /* renamed from: e */
    public C5476b f18487e;

    /* renamed from: f */
    public boolean f18488f;

    /* renamed from: m */
    public final void mo170m(C5982h hVar, String str, AttributesImpl attributesImpl) throws ActionException {
        this.f18487e = null;
        this.f18488f = false;
        String value = attributesImpl.getValue("class");
        if (C6992h.m16474c(value)) {
            value = C5475a.class.getName();
            mo22865i("Assuming className [" + value + "]");
        }
        try {
            mo22865i("About to instantiate shutdown hook of type [" + value + "]");
            C5476b bVar = (C5476b) C6992h.m16473b(value, C5476b.class, this.f20771c);
            this.f18487e = bVar;
            bVar.mo20064b(this.f20771c);
            hVar.mo21976p(this.f18487e);
        } catch (Exception e) {
            this.f18488f = true;
            mo21727f("Could not create a shutdown hook of type [" + value + "].", e);
            throw new ActionException(e);
        }
    }

    /* renamed from: o */
    public final void mo171o(C5982h hVar, String str) throws ActionException {
        if (!this.f18488f) {
            if (hVar.mo21974n() != this.f18487e) {
                mo22867k("The object at the of the stack is not the hook pushed earlier.");
                return;
            }
            hVar.mo21975o();
            Thread thread = new Thread(this.f18487e, C0016g.m31o(C13555b.m33972k("Logback shutdown hook ["), this.f20771c.f15675c, "]"));
            mo22865i("Registering shutdown hook with JVM runtime");
            this.f20771c.mo20060c(thread, "SHUTDOWN_HOOK");
            Runtime.getRuntime().addShutdownHook(thread);
        }
    }
}
