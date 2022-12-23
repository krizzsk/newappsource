package p295w3;

import org.xml.sax.helpers.AttributesImpl;
import p023b4.C1470a;
import p043ch.qos.logback.core.joran.spi.ActionException;
import p168m4.C5684b;
import p193o4.C5982h;
import p257t3.C6557a;
import p271u4.C6692c;
import p271u4.C6695f;
import p296w4.C6992h;

/* renamed from: w3.g */
public final class C6979g extends C5684b {

    /* renamed from: e */
    public boolean f21741e = false;

    /* renamed from: f */
    public C1470a f21742f;

    /* renamed from: m */
    public final void mo170m(C5982h hVar, String str, AttributesImpl attributesImpl) throws ActionException {
        this.f21741e = false;
        String value = attributesImpl.getValue("class");
        if (C6992h.m16474c(value)) {
            mo21722a("Mandatory \"class\" attribute not set for <loggerContextListener> element");
            this.f21741e = true;
            return;
        }
        try {
            C1470a aVar = (C1470a) C6992h.m16473b(value, C1470a.class, this.f20771c);
            this.f21742f = aVar;
            if (aVar instanceof C6692c) {
                ((C6692c) aVar).mo20064b(this.f20771c);
            }
            hVar.mo21976p(this.f21742f);
            mo22865i("Adding LoggerContextListener of type [" + value + "] to the object stack");
        } catch (Exception e) {
            this.f21741e = true;
            mo21727f("Could not create LoggerContextListener of type " + value + "].", e);
        }
    }

    /* renamed from: o */
    public final void mo171o(C5982h hVar, String str) throws ActionException {
        if (!this.f21741e) {
            Object n = hVar.mo21974n();
            C1470a aVar = this.f21742f;
            if (n != aVar) {
                mo22867k("The object on the top the of the stack is not the LoggerContextListener pushed earlier.");
                return;
            }
            if (aVar instanceof C6695f) {
                ((C6695f) aVar).start();
                mo22865i("Starting LoggerContextListener");
            }
            ((C6557a) this.f20771c).f20368n.add(this.f21742f);
            hVar.mo21975o();
        }
    }
}
