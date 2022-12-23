package p043ch.qos.logback.core.joran.action;

import org.xml.sax.helpers.AttributesImpl;
import p043ch.qos.logback.core.joran.action.ActionUtil;
import p043ch.qos.logback.core.joran.spi.ActionException;
import p168m4.C5684b;
import p193o4.C5982h;
import p271u4.C6695f;
import p271u4.C6697h;
import p296w4.C6992h;

/* renamed from: ch.qos.logback.core.joran.action.a */
public final class C1847a extends C5684b {

    /* renamed from: e */
    public ActionUtil.Scope f6385e;

    /* renamed from: f */
    public String f6386f;

    /* renamed from: g */
    public C6697h f6387g;

    /* renamed from: h */
    public boolean f6388h;

    /* renamed from: m */
    public final void mo170m(C5982h hVar, String str, AttributesImpl attributesImpl) throws ActionException {
        StringBuilder sb;
        String str2;
        this.f6385e = null;
        this.f6386f = null;
        this.f6387g = null;
        this.f6388h = false;
        this.f6386f = attributesImpl.getValue("name");
        this.f6385e = ActionUtil.m5217b(attributesImpl.getValue("scope"));
        if (C6992h.m16474c(this.f6386f)) {
            sb = new StringBuilder();
            str2 = "Missing property name for property definer. Near [";
        } else {
            String value = attributesImpl.getValue("class");
            if (C6992h.m16474c(value)) {
                sb = new StringBuilder();
                str2 = "Missing class name for property definer. Near [";
            } else {
                try {
                    mo22865i("About to instantiate property definer of type [" + value + "]");
                    C6697h hVar2 = (C6697h) C6992h.m16473b(value, C6697h.class, this.f20771c);
                    this.f6387g = hVar2;
                    hVar2.mo20064b(this.f20771c);
                    C6697h hVar3 = this.f6387g;
                    if (hVar3 instanceof C6695f) {
                        ((C6695f) hVar3).start();
                    }
                    hVar.mo21976p(this.f6387g);
                    return;
                } catch (Exception e) {
                    this.f6388h = true;
                    mo21727f("Could not create an PropertyDefiner of type [" + value + "].", e);
                    throw new ActionException(e);
                }
            }
        }
        sb.append(str2);
        sb.append(str);
        sb.append("] line ");
        sb.append(C5684b.m13976p(hVar));
        mo21722a(sb.toString());
        this.f6388h = true;
    }

    /* renamed from: o */
    public final void mo171o(C5982h hVar, String str) {
        if (!this.f6388h) {
            if (hVar.mo21974n() != this.f6387g) {
                StringBuilder k = C13555b.m33972k("The object at the of the stack is not the property definer for property named [");
                k.append(this.f6386f);
                k.append("] pushed earlier.");
                mo22867k(k.toString());
                return;
            }
            StringBuilder k2 = C13555b.m33972k("Popping property definer for property named [");
            k2.append(this.f6386f);
            k2.append("] from the object stack");
            mo22865i(k2.toString());
            hVar.mo21975o();
            String g = this.f6387g.mo22870g();
            if (g != null) {
                ActionUtil.m5216a(hVar, this.f6386f, g, this.f6385e);
            }
        }
    }
}
