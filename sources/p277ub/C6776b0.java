package p277ub;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.xmlpull.p982v1.XmlPullParser;
import org.xmlpull.p982v1.XmlPullParserException;
import p001a0.C0016g;

/* renamed from: ub.b0 */
public final class C6776b0 {
    /* renamed from: a */
    public static void m15968a(String str, Throwable th) {
        String str2;
        boolean z;
        if (th == null) {
            str2 = null;
        } else {
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    z = false;
                    break;
                } else if (th2 instanceof UnknownHostException) {
                    z = true;
                    break;
                } else {
                    th2 = th2.getCause();
                }
            }
            if (z) {
                str2 = "UnknownHostException (no network)";
            } else {
                str2 = Log.getStackTraceString(th).trim().replace("\t", "    ");
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            new StringBuilder(C0016g.m25h(str2.replace("\n", "\n  "), String.valueOf(str).length() + 4));
        }
    }

    /* renamed from: b */
    public static String m15969b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m15970c(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        boolean z;
        if (xmlPullParser.getEventType() == 3) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m15971d(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        boolean z;
        if (xmlPullParser.getEventType() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }
}
