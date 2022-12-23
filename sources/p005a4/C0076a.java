package p005a4;

import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.helpers.AttributesImpl;
import p043ch.qos.logback.core.joran.spi.ActionException;
import p168m4.C5684b;
import p180n4.C5854c;
import p180n4.C5855d;
import p193o4.C5982h;

/* renamed from: a4.a */
public final class C0076a extends C5684b implements C5854c {

    /* renamed from: e */
    public ArrayList f194e;

    /* renamed from: e */
    public final void mo169e(C5855d dVar) {
        this.f194e.add(dVar);
    }

    /* renamed from: m */
    public final void mo170m(C5982h hVar, String str, AttributesImpl attributesImpl) throws ActionException {
        this.f194e = new ArrayList();
        if (hVar.f19134i.contains(this)) {
            hVar.mo22867k("InPlayListener " + this + " has been already registered");
            return;
        }
        hVar.f19134i.add(this);
    }

    /* renamed from: o */
    public final void mo171o(C5982h hVar, String str) throws ActionException {
        hVar.f19134i.remove(this);
        Object n = hVar.mo21974n();
        if (n instanceof C0077b) {
            new HashMap(hVar.f19132g);
            ArrayList arrayList = this.f194e;
            ((C0077b) n).getClass();
            arrayList.subList(1, arrayList.size() - 1);
        }
    }
}
