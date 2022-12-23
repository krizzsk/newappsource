package p116i1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.p982v1.XmlPullParser;

/* renamed from: i1.j */
public final class C5256j {
    /* renamed from: a */
    public static C5239c m13273a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        C5239c cVar;
        if (m13277e(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new C5239c((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                cVar = C5239c.m13256a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception unused) {
                cVar = null;
            }
            if (cVar != null) {
                return cVar;
            }
        }
        return new C5239c((Shader) null, (ColorStateList) null, 0);
    }

    /* renamed from: b */
    public static float m13274b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!m13277e(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    /* renamed from: c */
    public static int m13275c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m13277e(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    /* renamed from: d */
    public static String m13276d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m13277e(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: e */
    public static boolean m13277e(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: f */
    public static TypedArray m13278f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
