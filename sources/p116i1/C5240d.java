package p116i1;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.p982v1.XmlPullParserException;
import p055d1.C4333i;
import p190o1.C5912f;

/* renamed from: i1.d */
public final class C5240d {

    /* renamed from: i1.d$a */
    public static class C5241a {
        /* renamed from: a */
        public static int m13261a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* renamed from: i1.d$b */
    public interface C5242b {
    }

    /* renamed from: i1.d$c */
    public static final class C5243c implements C5242b {

        /* renamed from: a */
        public final C5244d[] f17352a;

        public C5243c(C5244d[] dVarArr) {
            this.f17352a = dVarArr;
        }
    }

    /* renamed from: i1.d$d */
    public static final class C5244d {

        /* renamed from: a */
        public final String f17353a;

        /* renamed from: b */
        public final int f17354b;

        /* renamed from: c */
        public final boolean f17355c;

        /* renamed from: d */
        public final String f17356d;

        /* renamed from: e */
        public final int f17357e;

        /* renamed from: f */
        public final int f17358f;

        public C5244d(int i, int i2, int i3, String str, String str2, boolean z) {
            this.f17353a = str;
            this.f17354b = i;
            this.f17355c = z;
            this.f17356d = str2;
            this.f17357e = i2;
            this.f17358f = i3;
        }
    }

    /* renamed from: i1.d$e */
    public static final class C5245e implements C5242b {

        /* renamed from: a */
        public final C5912f f17359a;

        /* renamed from: b */
        public final int f17360b;

        /* renamed from: c */
        public final int f17361c;

        /* renamed from: d */
        public final String f17362d;

        public C5245e(C5912f fVar, int i, int i2, String str) {
            this.f17359a = fVar;
            this.f17361c = i;
            this.f17360b = i2;
            this.f17362d = str;
        }
    }

    /* renamed from: a */
    public static C5242b m13258a(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        boolean z;
        Resources resources2 = resources;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, (String) null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C4333i.FontFamily);
                String string = obtainAttributes.getString(C4333i.FontFamily_fontProviderAuthority);
                String string2 = obtainAttributes.getString(C4333i.FontFamily_fontProviderPackage);
                String string3 = obtainAttributes.getString(C4333i.FontFamily_fontProviderQuery);
                int resourceId = obtainAttributes.getResourceId(C4333i.FontFamily_fontProviderCerts, 0);
                int integer = obtainAttributes.getInteger(C4333i.FontFamily_fontProviderFetchStrategy, 1);
                int integer2 = obtainAttributes.getInteger(C4333i.FontFamily_fontProviderFetchTimeout, 500);
                String string4 = obtainAttributes.getString(C4333i.FontFamily_fontProviderSystemFontFamily);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != 3) {
                        if (xmlResourceParser.getEventType() == 2) {
                            if (xmlResourceParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C4333i.FontFamilyFont);
                                int i = C4333i.FontFamilyFont_fontWeight;
                                if (!obtainAttributes2.hasValue(i)) {
                                    i = C4333i.FontFamilyFont_android_fontWeight;
                                }
                                int i2 = obtainAttributes2.getInt(i, 400);
                                int i3 = C4333i.FontFamilyFont_fontStyle;
                                if (!obtainAttributes2.hasValue(i3)) {
                                    i3 = C4333i.FontFamilyFont_android_fontStyle;
                                }
                                if (1 == obtainAttributes2.getInt(i3, 0)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                int i4 = C4333i.FontFamilyFont_ttcIndex;
                                if (!obtainAttributes2.hasValue(i4)) {
                                    i4 = C4333i.FontFamilyFont_android_ttcIndex;
                                }
                                int i5 = C4333i.FontFamilyFont_fontVariationSettings;
                                if (!obtainAttributes2.hasValue(i5)) {
                                    i5 = C4333i.FontFamilyFont_android_fontVariationSettings;
                                }
                                String string5 = obtainAttributes2.getString(i5);
                                int i6 = obtainAttributes2.getInt(i4, 0);
                                int i7 = C4333i.FontFamilyFont_font;
                                if (!obtainAttributes2.hasValue(i7)) {
                                    i7 = C4333i.FontFamilyFont_android_font;
                                }
                                int resourceId2 = obtainAttributes2.getResourceId(i7, 0);
                                String string6 = obtainAttributes2.getString(i7);
                                obtainAttributes2.recycle();
                                while (xmlResourceParser.next() != 3) {
                                    m13260c(xmlResourceParser);
                                }
                                arrayList.add(new C5244d(i2, i6, resourceId2, string6, string5, z));
                            } else {
                                m13260c(xmlResourceParser);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return new C5243c((C5244d[]) arrayList.toArray(new C5244d[0]));
                }
                while (xmlResourceParser.next() != 3) {
                    m13260c(xmlResourceParser);
                }
                return new C5245e(new C5912f(string, string2, string3, m13259b(resources2, resourceId)), integer, integer2, string4);
            }
            m13260c(xmlResourceParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public static List<List<byte[]>> m13259b(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (C5241a.m13261a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String decode : stringArray) {
                            arrayList2.add(Base64.decode(decode, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String decode2 : stringArray2) {
                    arrayList3.add(Base64.decode(decode2, 0));
                }
                arrayList.add(arrayList3);
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: c */
    public static void m13260c(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
