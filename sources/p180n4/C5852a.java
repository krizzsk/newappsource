package p180n4;

import com.appboy.configuration.AppboyConfigurationProvider;
import org.xml.sax.Locator;

/* renamed from: n4.a */
public final class C5852a extends C5855d {

    /* renamed from: d */
    public String f18840d;

    public C5852a(String str, Locator locator) {
        super((String) null, (String) null, (String) null, locator);
        this.f18840d = str;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("BodyEvent(");
        String str = this.f18840d;
        if (str != null) {
            str = str.trim();
        }
        k.append(str);
        k.append(")");
        k.append(this.f18843c.getLineNumber());
        k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        k.append(this.f18843c.getColumnNumber());
        return k.toString();
    }
}
