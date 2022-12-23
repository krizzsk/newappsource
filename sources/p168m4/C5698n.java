package p168m4;

import org.xml.sax.helpers.AttributesImpl;
import p193o4.C5982h;
import p206p4.C6064c;

/* renamed from: m4.n */
public final class C5698n extends C5684b {
    /* renamed from: m */
    public final void mo170m(C5982h hVar, String str, AttributesImpl attributesImpl) {
        String value = attributesImpl.getValue("name");
        String value2 = attributesImpl.getValue("value");
        if (value == null) {
            mo21722a("No name attribute in <param> element");
        } else if (value2 == null) {
            mo21722a("No value attribute in <param> element");
        } else {
            String trim = value2.trim();
            C6064c cVar = new C6064c(hVar.mo21974n());
            cVar.mo20064b(this.f20771c);
            cVar.mo22054w(hVar.mo21977q(value), hVar.mo21977q(trim));
        }
    }

    /* renamed from: o */
    public final void mo171o(C5982h hVar, String str) {
    }
}
