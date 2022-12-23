package p168m4;

import java.util.HashMap;
import java.util.Map;
import org.xml.sax.helpers.AttributesImpl;
import p193o4.C5982h;
import p296w4.C6992h;

/* renamed from: m4.e */
public final class C5687e extends C5684b {
    /* renamed from: m */
    public final void mo170m(C5982h hVar, String str, AttributesImpl attributesImpl) {
        String value = attributesImpl.getValue("conversionWord");
        String value2 = attributesImpl.getValue("converterClass");
        if (C6992h.m16474c(value)) {
            mo21722a("No 'conversionWord' attribute in <conversionRule>");
        } else if (C6992h.m16474c(value2)) {
            hVar.mo21722a("No 'converterClass' attribute in <conversionRule>");
        } else {
            try {
                Map map = (Map) this.f20771c.mo20059b("PATTERN_RULE_REGISTRY");
                if (map == null) {
                    map = new HashMap();
                    this.f20771c.mo20060c(map, "PATTERN_RULE_REGISTRY");
                }
                mo22865i("registering conversion word " + value + " with class [" + value2 + "]");
                map.put(value, value2);
            } catch (Exception unused) {
                mo21722a("Could not add conversion rule to PatternLayout.");
            }
        }
    }

    /* renamed from: o */
    public final void mo171o(C5982h hVar, String str) {
    }
}
