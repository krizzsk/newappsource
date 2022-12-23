package p295w3;

import org.xml.sax.helpers.AttributesImpl;
import p043ch.qos.logback.classic.Level;
import p043ch.qos.logback.classic.Logger;
import p168m4.C5684b;
import p193o4.C5982h;

@Deprecated
/* renamed from: w3.e */
public final class C6977e extends C5684b {
    /* renamed from: m */
    public final void mo170m(C5982h hVar, String str, AttributesImpl attributesImpl) {
        Level level;
        Object n = hVar.mo21974n();
        if (!(n instanceof Logger)) {
            mo21722a("For element <level>, could not find a logger at the top of execution stack.");
            return;
        }
        Logger logger = (Logger) n;
        String g = logger.mo6670g();
        String q = hVar.mo21977q(attributesImpl.getValue("value"));
        if ("INHERITED".equalsIgnoreCase(q) || "NULL".equalsIgnoreCase(q)) {
            level = null;
        } else {
            level = Level.m5204b(q);
        }
        logger.mo6674k(level);
        mo22865i(g + " level set to " + logger.f6377b);
    }

    /* renamed from: o */
    public final void mo171o(C5982h hVar, String str) {
    }
}
