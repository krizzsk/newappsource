package p295w3;

import org.xml.sax.helpers.AttributesImpl;
import p168m4.C5684b;
import p193o4.C5982h;

/* renamed from: w3.c */
public final class C6975c extends C5684b {
    /* renamed from: m */
    public final void mo170m(C5982h hVar, String str, AttributesImpl attributesImpl) {
    }

    /* renamed from: n */
    public final void mo21538n(C5982h hVar, String str) {
        String q = hVar.mo21977q(str);
        mo22865i("Setting logger context name as [" + q + "]");
        try {
            this.f20771c.mo20063h(q);
        } catch (IllegalStateException e) {
            mo21727f(C13715c.m34246l(C13555b.m33972k("Failed to rename context ["), this.f20771c.f15675c, "] as [", q, "]"), e);
        }
    }

    /* renamed from: o */
    public final void mo171o(C5982h hVar, String str) {
    }
}
