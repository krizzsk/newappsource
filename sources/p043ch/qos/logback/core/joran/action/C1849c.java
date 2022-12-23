package p043ch.qos.logback.core.joran.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.xml.sax.helpers.AttributesImpl;
import p043ch.qos.logback.core.joran.action.ActionUtil;
import p043ch.qos.logback.core.joran.spi.ActionException;
import p168m4.C5684b;
import p193o4.C5982h;
import p296w4.C6992h;

/* renamed from: ch.qos.logback.core.joran.action.c */
public final class C1849c extends C5684b {

    /* renamed from: e */
    public boolean f6389e = false;

    /* renamed from: m */
    public final void mo170m(C5982h hVar, String str, AttributesImpl attributesImpl) throws ActionException {
        long j;
        String value = attributesImpl.getValue(LinksConfiguration.KEY_KEY);
        if (C6992h.m16474c(value)) {
            mo21722a("Attribute named [key] cannot be empty");
            this.f6389e = true;
        }
        String value2 = attributesImpl.getValue("datePattern");
        if (C6992h.m16474c(value2)) {
            mo21722a("Attribute named [datePattern] cannot be empty");
            this.f6389e = true;
        }
        if ("contextBirth".equalsIgnoreCase(attributesImpl.getValue("timeReference"))) {
            mo22865i("Using context birth as time reference.");
            j = this.f20771c.f15674b;
        } else {
            j = System.currentTimeMillis();
            mo22865i("Using current interpretation time, i.e. now, as time reference.");
        }
        if (!this.f6389e) {
            ActionUtil.Scope b = ActionUtil.m5217b(attributesImpl.getValue("scope"));
            String str2 = null;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(value2, Locale.US);
            if (j != -1) {
                str2 = simpleDateFormat.format(new Date(j));
            }
            StringBuilder h = C16759e.m42352h("Adding property to the context with key=\"", value, "\" and value=\"", str2, "\" to the ");
            h.append(b);
            h.append(" scope");
            mo22865i(h.toString());
            ActionUtil.m5216a(hVar, value, str2, b);
        }
    }

    /* renamed from: o */
    public final void mo171o(C5982h hVar, String str) throws ActionException {
    }
}
