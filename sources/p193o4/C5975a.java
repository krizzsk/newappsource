package p193o4;

import org.xml.sax.Locator;
import p070e4.C4549d;
import p271u4.C6694e;

/* renamed from: o4.a */
public final class C5975a extends C6694e {
    public C5975a(C4549d dVar, C5983i iVar) {
        super(dVar, iVar);
    }

    /* renamed from: e */
    public final Object mo21960e() {
        Class<C5983i> cls = C5983i.class;
        Locator locator = ((C5983i) this.f20775d).f19142f;
        if (locator == null) {
            return C13555b.m33969h(cls, new StringBuilder(), "@NA:NA");
        }
        return cls.getName() + "@" + locator.getLineNumber() + ":" + locator.getColumnNumber();
    }
}
