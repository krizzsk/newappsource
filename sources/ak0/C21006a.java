package ak0;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.xmlpull.p982v1.XmlPullParser;
import org.xmlpull.p982v1.XmlPullParserException;
import p001a0.C0016g;

/* renamed from: ak0.a */
public class C21006a {

    /* renamed from: d */
    public static final Class f52756d = C21006a.class;

    /* renamed from: a */
    public Vector f52757a;

    /* renamed from: b */
    public String f52758b;

    /* renamed from: c */
    public Hashtable f52759c = new Hashtable();

    static {
        new C21006a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a3 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ak0.C21006a m49161a() throws org.xmlpull.p982v1.XmlPullParserException {
        /*
            java.lang.Class r0 = f52756d
            r1 = 0
            java.lang.String r2 = "/META-INF/services/org.xmlpull.v1.XmlPullParserFactory"
            java.io.InputStream r0 = r0.getResourceAsStream(r2)     // Catch:{ Exception -> 0x00b8 }
            if (r0 == 0) goto L_0x00b0
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x00b8 }
            r2.<init>()     // Catch:{ Exception -> 0x00b8 }
        L_0x0010:
            int r3 = r0.read()     // Catch:{ Exception -> 0x00b8 }
            if (r3 >= 0) goto L_0x00a6
            r0.close()     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x00b8 }
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = "resource /META-INF/services/org.xmlpull.v1.XmlPullParserFactory that contained '"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = "'"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.util.Vector r3 = new java.util.Vector
            r3.<init>()
            java.util.Vector r4 = new java.util.Vector
            r4.<init>()
            r4 = 0
            r6 = r1
            r5 = 0
        L_0x0040:
            int r7 = r0.length()
            if (r5 < r7) goto L_0x0052
            if (r6 != 0) goto L_0x004d
            ak0.a r6 = new ak0.a
            r6.<init>()
        L_0x004d:
            r6.f52757a = r3
            r6.f52758b = r2
            return r6
        L_0x0052:
            r7 = 44
            int r7 = r0.indexOf(r7, r5)
            r8 = -1
            if (r7 != r8) goto L_0x005f
            int r7 = r0.length()
        L_0x005f:
            java.lang.String r5 = r0.substring(r5, r7)
            java.lang.Class r8 = java.lang.Class.forName(r5)     // Catch:{ Exception -> 0x006e }
            java.lang.Object r9 = r8.newInstance()     // Catch:{ Exception -> 0x006c }
            goto L_0x0071
        L_0x006c:
            goto L_0x0070
        L_0x006e:
            r8 = r1
        L_0x0070:
            r9 = r1
        L_0x0071:
            if (r8 == 0) goto L_0x00a3
            boolean r10 = r9 instanceof org.xmlpull.p982v1.XmlPullParser
            r11 = 1
            if (r10 == 0) goto L_0x007d
            r3.addElement(r8)
            r8 = 1
            goto L_0x007e
        L_0x007d:
            r8 = 0
        L_0x007e:
            boolean r10 = r9 instanceof ak0.C21006a
            if (r10 == 0) goto L_0x0088
            if (r6 != 0) goto L_0x0089
            r6 = r9
            ak0.a r6 = (ak0.C21006a) r6
            goto L_0x0089
        L_0x0088:
            r11 = r8
        L_0x0089:
            if (r11 == 0) goto L_0x008c
            goto L_0x00a3
        L_0x008c:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "incompatible class: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00a3:
            int r5 = r7 + 1
            goto L_0x0040
        L_0x00a6:
            r4 = 32
            if (r3 <= r4) goto L_0x0010
            char r3 = (char) r3
            r2.append(r3)     // Catch:{ Exception -> 0x00b8 }
            goto L_0x0010
        L_0x00b0:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r2 = "resource not found: /META-INF/services/org.xmlpull.v1.XmlPullParserFactory make sure that parser implementing XmlPull API is available"
            r0.<init>(r2)     // Catch:{ Exception -> 0x00b8 }
            throw r0     // Catch:{ Exception -> 0x00b8 }
        L_0x00b8:
            r0 = move-exception
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            r2.<init>(r1, r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ak0.C21006a.m49161a():ak0.a");
    }

    /* renamed from: b */
    public XmlPullParser mo53086b() throws XmlPullParserException {
        Vector vector = this.f52757a;
        if (vector == null) {
            StringBuffer q = C0016g.m33q("Factory initialization was incomplete - has not tried ");
            q.append(this.f52758b);
            throw new XmlPullParserException(q.toString());
        } else if (vector.size() != 0) {
            StringBuffer stringBuffer = new StringBuffer();
            int i = 0;
            while (i < this.f52757a.size()) {
                Class cls = (Class) this.f52757a.elementAt(i);
                try {
                    XmlPullParser xmlPullParser = (XmlPullParser) cls.newInstance();
                    Enumeration keys = this.f52759c.keys();
                    while (keys.hasMoreElements()) {
                        String str = (String) keys.nextElement();
                        Boolean bool = (Boolean) this.f52759c.get(str);
                        if (bool != null && bool.booleanValue()) {
                            xmlPullParser.setFeature(str, true);
                        }
                    }
                    return xmlPullParser;
                } catch (Exception e) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(cls.getName());
                    stringBuffer2.append(": ");
                    stringBuffer2.append(e.toString());
                    stringBuffer2.append("; ");
                    stringBuffer.append(stringBuffer2.toString());
                    i++;
                }
            }
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("could not create parser: ");
            stringBuffer3.append(stringBuffer);
            throw new XmlPullParserException(stringBuffer3.toString());
        } else {
            StringBuffer q2 = C0016g.m33q("No valid parser classes found in ");
            q2.append(this.f52758b);
            throw new XmlPullParserException(q2.toString());
        }
    }
}
