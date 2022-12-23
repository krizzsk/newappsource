package p295w3;

import java.util.Set;
import org.xml.sax.helpers.AttributesImpl;
import p043ch.qos.logback.core.joran.spi.ActionException;
import p070e4.C4549d;
import p090g1.C4745d;
import p168m4.C5684b;
import p193o4.C5982h;
import p296w4.C6992h;
import p308x3.C7153a;

/* renamed from: w3.h */
public final class C6980h extends C5684b {

    /* renamed from: e */
    public C7153a f21743e;

    /* renamed from: f */
    public boolean f21744f;

    /* renamed from: m */
    public final void mo170m(C5982h hVar, String str, AttributesImpl attributesImpl) throws ActionException {
        String value = attributesImpl.getValue("class");
        if (C6992h.m16474c(value)) {
            StringBuilder l = C13555b.m33973l("Missing class name for receiver. Near [", str, "] line ");
            l.append(C5684b.m13976p(hVar));
            mo21722a(l.toString());
            this.f21744f = true;
            return;
        }
        try {
            mo22865i("About to instantiate receiver of type [" + value + "]");
            C7153a aVar = (C7153a) C6992h.m16473b(value, C7153a.class, this.f20771c);
            this.f21743e = aVar;
            aVar.mo20064b(this.f20771c);
            hVar.mo21976p(this.f21743e);
        } catch (Exception e) {
            this.f21744f = true;
            mo21727f("Could not create a receiver of type [" + value + "].", e);
            throw new ActionException(e);
        }
    }

    /* renamed from: o */
    public final void mo171o(C5982h hVar, String str) throws ActionException {
        C4745d dVar;
        if (!this.f21744f) {
            C4549d dVar2 = hVar.f20771c;
            C7153a aVar = this.f21743e;
            synchronized (dVar2) {
                if (dVar2.f15682j == null) {
                    dVar2.f15682j = new C4745d(3);
                }
                dVar = dVar2.f15682j;
            }
            ((Set) dVar.f16031a).add(aVar);
            this.f21743e.start();
            if (hVar.mo21974n() != this.f21743e) {
                mo22867k("The object at the of the stack is not the remote pushed earlier.");
            } else {
                hVar.mo21975o();
            }
        }
    }
}
