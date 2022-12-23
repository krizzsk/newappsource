package p168m4;

import com.appboy.configuration.AppboyConfigurationProvider;
import org.xml.sax.helpers.AttributesImpl;
import p001a0.C0017h;
import p193o4.C5979e;
import p193o4.C5982h;
import p193o4.C5986l;
import p296w4.C6992h;

/* renamed from: m4.m */
public final class C5697m extends C5684b {
    /* renamed from: m */
    public final void mo170m(C5982h hVar, String str, AttributesImpl attributesImpl) {
        String str2;
        String value = attributesImpl.getValue("pattern");
        String value2 = attributesImpl.getValue("actionClass");
        if (C6992h.m16474c(value)) {
            str2 = "No 'pattern' attribute in <newRule>";
        } else if (C6992h.m16474c(value2)) {
            str2 = "No 'actionClass' attribute in <newRule>";
        } else {
            try {
                mo22865i("About to add new Joran parsing rule [" + value + AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR + value2 + "].");
                ((C5986l) hVar.f19133h.f19137a).mo21978m(new C5979e(value), value2);
                return;
            } catch (Exception unused) {
                mo21722a(C0017h.m56M("Could not add new Joran parsing rule [", value, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, value2, "]"));
                return;
            }
        }
        mo21722a(str2);
    }

    /* renamed from: o */
    public final void mo171o(C5982h hVar, String str) {
    }
}
