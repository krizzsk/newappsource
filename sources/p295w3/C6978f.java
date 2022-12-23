package p295w3;

import org.xml.sax.Locator;
import org.xml.sax.helpers.AttributesImpl;
import p043ch.qos.logback.classic.Level;
import p043ch.qos.logback.classic.Logger;
import p168m4.C5684b;
import p193o4.C5982h;
import p257t3.C6557a;
import p296w4.C6992h;

/* renamed from: w3.f */
public final class C6978f extends C5684b {

    /* renamed from: e */
    public boolean f21739e = false;

    /* renamed from: f */
    public Logger f21740f;

    /* renamed from: m */
    public final void mo170m(C5982h hVar, String str, AttributesImpl attributesImpl) {
        int i;
        this.f21739e = false;
        this.f21740f = null;
        C6557a aVar = (C6557a) this.f20771c;
        String q = hVar.mo21977q(attributesImpl.getValue("name"));
        if (C6992h.m16474c(q)) {
            this.f21739e = true;
            StringBuilder k = C13555b.m33972k("line: ");
            k.append(C5684b.m13976p(hVar));
            k.append(", column: ");
            Locator locator = hVar.f19133h.f19142f;
            if (locator != null) {
                i = locator.getColumnNumber();
            } else {
                i = -1;
            }
            k.append(i);
            String sb = k.toString();
            mo21722a("No 'name' attribute in element " + str + ", around " + sb);
            return;
        }
        this.f21740f = aVar.mo22168a(q);
        String q2 = hVar.mo21977q(attributesImpl.getValue("level"));
        if (!C6992h.m16474c(q2)) {
            if ("INHERITED".equalsIgnoreCase(q2) || "NULL".equalsIgnoreCase(q2)) {
                mo22865i("Setting level of logger [" + q + "] to null, i.e. INHERITED");
                this.f21740f.mo6674k((Level) null);
            } else {
                Level b = Level.m5204b(q2);
                mo22865i("Setting level of logger [" + q + "] to " + b);
                this.f21740f.mo6674k(b);
            }
        }
        String q3 = hVar.mo21977q(attributesImpl.getValue("additivity"));
        if (!C6992h.m16474c(q3)) {
            boolean booleanValue = Boolean.valueOf(q3).booleanValue();
            mo22865i("Setting additivity of logger [" + q + "] to " + booleanValue);
            this.f21740f.f6382g = booleanValue;
        }
        hVar.mo21976p(this.f21740f);
    }

    /* renamed from: o */
    public final void mo171o(C5982h hVar, String str) {
        if (!this.f21739e) {
            Object n = hVar.mo21974n();
            if (n != this.f21740f) {
                StringBuilder k = C13555b.m33972k("The object on the top the of the stack is not ");
                k.append(this.f21740f);
                k.append(" pushed earlier");
                mo22867k(k.toString());
                mo22867k("It is: " + n);
                return;
            }
            hVar.mo21975o();
        }
    }
}
