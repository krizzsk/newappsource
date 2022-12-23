package p295w3;

import org.xml.sax.helpers.AttributesImpl;
import p043ch.qos.logback.classic.Level;
import p043ch.qos.logback.classic.Logger;
import p168m4.C5684b;
import p193o4.C5982h;
import p257t3.C6557a;
import p296w4.C6992h;

/* renamed from: w3.i */
public final class C6981i extends C5684b {

    /* renamed from: e */
    public Logger f21745e;

    /* renamed from: m */
    public final void mo170m(C5982h hVar, String str, AttributesImpl attributesImpl) {
        this.f21745e = ((C6557a) this.f20771c).mo22168a("ROOT");
        String q = hVar.mo21977q(attributesImpl.getValue("level"));
        if (!C6992h.m16474c(q)) {
            Level b = Level.m5204b(q);
            mo22865i("Setting level of ROOT logger to " + b);
            this.f21745e.mo6674k(b);
        }
        hVar.mo21976p(this.f21745e);
    }

    /* renamed from: o */
    public final void mo171o(C5982h hVar, String str) {
        Object n = hVar.mo21974n();
        if (n != this.f21745e) {
            mo22867k("The object on the top the of the stack is not the root logger");
            mo22867k("It is: " + n);
            return;
        }
        hVar.mo21975o();
    }
}
