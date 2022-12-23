package p168m4;

import org.xml.sax.helpers.AttributesImpl;
import p043ch.qos.logback.core.joran.spi.ActionException;
import p193o4.C5982h;
import p271u4.C6692c;
import p271u4.C6695f;
import p283v4.C6861f;
import p296w4.C6992h;

/* renamed from: m4.p */
public final class C5700p extends C5684b {

    /* renamed from: e */
    public boolean f18489e = false;

    /* renamed from: f */
    public Boolean f18490f = null;

    /* renamed from: g */
    public C6861f f18491g = null;

    /* renamed from: m */
    public final void mo170m(C5982h hVar, String str, AttributesImpl attributesImpl) throws ActionException {
        this.f18489e = false;
        this.f18490f = null;
        String value = attributesImpl.getValue("class");
        if (C6992h.m16474c(value)) {
            StringBuilder l = C13555b.m33973l("Missing class name for statusListener. Near [", str, "] line ");
            l.append(C5684b.m13976p(hVar));
            mo21722a(l.toString());
            this.f18489e = true;
            return;
        }
        try {
            C6861f fVar = (C6861f) C6992h.m16473b(value, C6861f.class, this.f20771c);
            this.f18491g = fVar;
            this.f18490f = Boolean.valueOf(hVar.f20771c.f15676d.mo20057b(fVar));
            C6861f fVar2 = this.f18491g;
            if (fVar2 instanceof C6692c) {
                ((C6692c) fVar2).mo20064b(this.f20771c);
            }
            mo22865i("Added status listener of type [" + value + "]");
            hVar.mo21976p(this.f18491g);
        } catch (Exception e) {
            this.f18489e = true;
            mo21727f("Could not create an StatusListener of type [" + value + "].", e);
            throw new ActionException(e);
        }
    }

    /* renamed from: o */
    public final void mo171o(C5982h hVar, String str) {
        boolean z;
        if (!this.f18489e) {
            Boolean bool = this.f18490f;
            if (bool == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            if (z) {
                C6861f fVar = this.f18491g;
                if (fVar instanceof C6695f) {
                    ((C6695f) fVar).start();
                }
            }
            if (hVar.mo21974n() != this.f18491g) {
                mo22867k("The object at the of the stack is not the statusListener pushed earlier.");
            } else {
                hVar.mo21975o();
            }
        }
    }
}
