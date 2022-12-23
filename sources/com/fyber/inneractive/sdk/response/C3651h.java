package com.fyber.inneractive.sdk.response;

import android.util.Xml;
import com.fyber.inneractive.sdk.util.C3692g0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.p982v1.XmlPullParser;
import org.xmlpull.p982v1.XmlPullParserException;

/* renamed from: com.fyber.inneractive.sdk.response.h */
public class C3651h {

    /* renamed from: a */
    public boolean f12776a = false;

    /* renamed from: b */
    public String f12777b;

    public C3651h(String str) throws Exception {
        try {
            mo15299a(str);
            this.f12776a = true;
            IAlog.m9902a("parser: Parsing finished. parser is ready", new Object[0]);
        } catch (Exception e) {
            IAlog.m9903b("Error parsing Ad XML: %s", e.getMessage());
            throw e;
        }
    }

    /* renamed from: a */
    public final void mo15299a(String str) throws XmlPullParserException, IOException {
        String str2;
        String str3;
        IAlog.m9902a("Start reading Response", new Object[0]);
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
        newPullParser.setInput(new StringReader(str));
        newPullParser.nextTag();
        newPullParser.require(2, (String) null, "tns:Response");
        while (newPullParser.next() != 3) {
            if (newPullParser.getEventType() == 2) {
                int i = 1;
                if (newPullParser.getName().equals("tns:Ad")) {
                    newPullParser.require(2, (String) null, "tns:Ad");
                    IAlog.m9902a("Start reading Ad", new Object[0]);
                    if (newPullParser.next() == 4) {
                        str2 = newPullParser.getText();
                        newPullParser.nextTag();
                    } else {
                        IAlog.m9906e("No text: %s", newPullParser.getName());
                        str2 = "";
                    }
                    String trim = str2.trim();
                    IAlog.m9905d("Ad content: %s", trim);
                    if (trim == null) {
                        str3 = null;
                    } else {
                        str3 = C3692g0.f12867f.mo15355a(trim);
                    }
                    this.f12777b = str3;
                } else if (newPullParser.getEventType() == 2) {
                    while (i != 0) {
                        int next = newPullParser.next();
                        if (next == 2) {
                            i++;
                        } else if (next == 3) {
                            i--;
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }
}
