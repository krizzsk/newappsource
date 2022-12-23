package p180n4;

import com.appboy.configuration.AppboyConfigurationProvider;
import org.xml.sax.Locator;

/* renamed from: n4.b */
public final class C5853b extends C5855d {
    public C5853b(String str, String str2, String str3, Locator locator) {
        super(str, str2, str3, locator);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("  EndEvent(");
        k.append(this.f18842b);
        k.append(")  [");
        k.append(this.f18843c.getLineNumber());
        k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        k.append(this.f18843c.getColumnNumber());
        k.append("]");
        return k.toString();
    }
}
