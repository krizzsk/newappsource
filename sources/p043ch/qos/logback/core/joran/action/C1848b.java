package p043ch.qos.logback.core.joran.action;

import com.appboy.support.AppboyFileUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import org.xml.sax.helpers.AttributesImpl;
import p043ch.qos.logback.core.joran.action.ActionUtil;
import p168m4.C5684b;
import p193o4.C5982h;
import p296w4.C6985c;
import p296w4.C6990g;
import p296w4.C6992h;

/* renamed from: ch.qos.logback.core.joran.action.b */
public final class C1848b extends C5684b {
    /* renamed from: q */
    public static void m5220q(C5982h hVar, InputStream inputStream, ActionUtil.Scope scope) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        inputStream.close();
        int i = ActionUtil.C1846a.f6384a[scope.ordinal()];
        if (i == 1) {
            hVar.getClass();
            for (String str : properties.keySet()) {
                String property = properties.getProperty(str);
                if (!(str == null || property == null)) {
                    hVar.f19132g.put(str, property.trim());
                }
            }
        } else if (i == 2) {
            C6985c cVar = new C6985c(hVar.f20771c);
            for (String str2 : properties.keySet()) {
                cVar.f20771c.mo20061e(str2, properties.getProperty(str2));
            }
        } else if (i == 3) {
            for (String str3 : properties.keySet()) {
                C6992h.m16475d(hVar, str3, properties.getProperty(str3));
            }
        }
    }

    /* renamed from: m */
    public final void mo170m(C5982h hVar, String str, AttributesImpl attributesImpl) {
        boolean z;
        String str2;
        String str3;
        StringBuilder sb;
        String str4;
        String str5;
        StringBuilder sb2;
        boolean z2;
        URL url;
        C5982h hVar2 = hVar;
        AttributesImpl attributesImpl2 = attributesImpl;
        if ("substitutionProperty".equals(str)) {
            mo22867k("[substitutionProperty] element has been deprecated. Please use the [property] element instead.");
        }
        String value = attributesImpl2.getValue("name");
        String value2 = attributesImpl2.getValue("value");
        ActionUtil.Scope b = ActionUtil.m5217b(attributesImpl2.getValue("scope"));
        String value3 = attributesImpl2.getValue(AppboyFileUtils.FILE_SCHEME);
        String value4 = attributesImpl2.getValue("name");
        String value5 = attributesImpl2.getValue("value");
        String value6 = attributesImpl2.getValue("resource");
        int i = 0;
        boolean z3 = true;
        if (C6992h.m16474c(value3) || !C6992h.m16474c(value4) || !C6992h.m16474c(value5) || !C6992h.m16474c(value6)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            str4 = hVar2.mo21977q(attributesImpl2.getValue(AppboyFileUtils.FILE_SCHEME));
            try {
                m5220q(hVar2, new FileInputStream(str4), b);
            } catch (FileNotFoundException unused) {
                sb2 = new StringBuilder();
                str5 = "Could not find properties file [";
            } catch (IOException e) {
                e = e;
                sb = new StringBuilder();
                str3 = "Could not read properties file [";
                mo21727f(C13715c.m34245k(sb, str3, str4, "]."), e);
            }
        } else {
            String value7 = attributesImpl2.getValue(AppboyFileUtils.FILE_SCHEME);
            String value8 = attributesImpl2.getValue("name");
            String value9 = attributesImpl2.getValue("value");
            if (C6992h.m16474c(attributesImpl2.getValue("resource")) || !C6992h.m16474c(value8) || !C6992h.m16474c(value9) || !C6992h.m16474c(value7)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                str4 = hVar2.mo21977q(attributesImpl2.getValue("resource"));
                boolean z4 = C6990g.f21761a;
                ClassLoader classLoader = C6990g.class.getClassLoader();
                if (classLoader == null) {
                    classLoader = ClassLoader.getSystemClassLoader();
                }
                try {
                    url = classLoader.getResource(str4);
                } catch (Throwable unused2) {
                    url = null;
                }
                if (url == null) {
                    sb2 = new StringBuilder();
                    str5 = "Could not find resource [";
                    str2 = C13715c.m34245k(sb2, str5, str4, "].");
                    mo21722a(str2);
                }
                try {
                    m5220q(hVar2, FirebasePerfUrlConnection.openStream(url), b);
                } catch (IOException e2) {
                    e = e2;
                    sb = new StringBuilder();
                    str3 = "Could not read resource file [";
                }
            } else {
                String value10 = attributesImpl2.getValue(AppboyFileUtils.FILE_SCHEME);
                String value11 = attributesImpl2.getValue("name");
                String value12 = attributesImpl2.getValue("value");
                String value13 = attributesImpl2.getValue("resource");
                if (C6992h.m16474c(value11) || C6992h.m16474c(value12) || !C6992h.m16474c(value10) || !C6992h.m16474c(value13)) {
                    z3 = false;
                }
                if (z3) {
                    int length = value2.length();
                    StringBuilder sb3 = new StringBuilder(length);
                    while (i < length) {
                        int i2 = i + 1;
                        char charAt = value2.charAt(i);
                        if (charAt == '\\') {
                            int i3 = i2 + 1;
                            char charAt2 = value2.charAt(i2);
                            if (charAt2 == 'n') {
                                i = i3;
                                charAt = 10;
                            } else if (charAt2 == 'r') {
                                i = i3;
                                charAt = 13;
                            } else if (charAt2 == 't') {
                                i = i3;
                                charAt = 9;
                            } else if (charAt2 == 'f') {
                                i = i3;
                                charAt = 12;
                            } else {
                                i = i3;
                                charAt = charAt2;
                            }
                        } else {
                            i = i2;
                        }
                        sb3.append(charAt);
                    }
                    ActionUtil.m5216a(hVar2, value, hVar2.mo21977q(sb3.toString().trim()), b);
                    return;
                }
                str2 = "In <property> element, either the \"file\" attribute alone, or the \"resource\" element alone, or both the \"name\" and \"value\" attributes must be set.";
                mo21722a(str2);
            }
        }
    }

    /* renamed from: o */
    public final void mo171o(C5982h hVar, String str) {
    }
}
