package p180n4;

import com.appboy.configuration.AppboyConfigurationProvider;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.helpers.AttributesImpl;

/* renamed from: n4.f */
public final class C5857f extends C5855d {

    /* renamed from: d */
    public final AttributesImpl f18848d;

    public C5857f(String str, String str2, String str3, Attributes attributes, Locator locator) {
        super(str, str2, str3, locator);
        this.f18848d = new AttributesImpl(attributes);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartEvent(");
        sb.append(this.f18842b);
        if (this.f18848d != null) {
            for (int i = 0; i < this.f18848d.getLength(); i++) {
                if (i > 0) {
                    sb.append(' ');
                }
                sb.append(this.f18848d.getLocalName(i));
                sb.append("=\"");
                sb.append(this.f18848d.getValue(i));
                sb.append("\"");
            }
        }
        sb.append(")  [");
        sb.append(this.f18843c.getLineNumber());
        sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        sb.append(this.f18843c.getColumnNumber());
        sb.append("]");
        return sb.toString();
    }
}
