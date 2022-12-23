package com.moovit.commons.utils;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Locale;
import p129j1.C5348a;
import p810sz.C19612n;
import p810sz.C19613o;
import p977zz.C20937f;
import p977zz.C20939g;
import p977zz.C20941h;
import p977zz.C20964s0;

public class Color implements Parcelable {
    public static final Parcelable.Creator<Color> CREATOR = new C15759d();

    /* renamed from: c */
    public static final C15756a f40999c = new C15756a();

    /* renamed from: d */
    public static final C15757b f41000d = new C15757b();

    /* renamed from: e */
    public static final C15758c f41001e = new C15758c();

    /* renamed from: f */
    public static final Color f41002f = new Color(-16777216);

    /* renamed from: g */
    public static final Color f41003g = new Color(-1);

    /* renamed from: h */
    public static final Color f41004h = new Color(0);

    /* renamed from: i */
    public static final C20937f f41005i = new C20937f();

    /* renamed from: j */
    public static final C20939g f41006j = new C20939g();

    /* renamed from: b */
    public final int f41007b;

    /* renamed from: com.moovit.commons.utils.Color$a */
    public class C15756a extends ThreadLocal<float[]> {
        public final Object initialValue() {
            return new float[3];
        }
    }

    /* renamed from: com.moovit.commons.utils.Color$b */
    public class C15757b extends ThreadLocal<double[]> {
        public final Object initialValue() {
            return new double[3];
        }
    }

    /* renamed from: com.moovit.commons.utils.Color$c */
    public class C15758c extends ThreadLocal<double[]> {
        public final Object initialValue() {
            return new double[3];
        }
    }

    /* renamed from: com.moovit.commons.utils.Color$d */
    public class C15759d implements Parcelable.Creator<Color> {
        public final Object createFromParcel(Parcel parcel) {
            return (Color) C19612n.m46981v(parcel, Color.f41006j);
        }

        public final Object[] newArray(int i) {
            return new Color[i];
        }
    }

    public Color(int i) {
        this.f41007b = i;
    }

    /* renamed from: b */
    public static double m40218b(int i) {
        double d = ((double) i) / 255.0d;
        return d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }

    /* renamed from: c */
    public static double m40219c(int i, int i2) {
        double j = m40223j(i);
        if (android.graphics.Color.alpha(i2) < 255) {
            i2 = C5348a.m13413i(i2, i);
        }
        double j2 = m40223j(i2);
        return (Math.max(j, j2) + 0.05d) / (Math.min(j, j2) + 0.05d);
    }

    /* renamed from: d */
    public static Color m40220d(int i, Context context) {
        if (i == 0) {
            return null;
        }
        return new Color(C20941h.m49043f(i, context));
    }

    /* renamed from: f */
    public static int m40221f(int i) {
        float[] fArr = (float[]) f40999c.get();
        android.graphics.Color.colorToHSV(i, fArr);
        fArr[2] = Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(1.0f, fArr[2] + 0.2f));
        return android.graphics.Color.HSVToColor(android.graphics.Color.alpha(i), fArr);
    }

    /* renamed from: g */
    public static boolean m40222g(int i, int i2, int i3) {
        double[] dArr = (double[]) f41000d.get();
        double[] dArr2 = (double[]) f41001e.get();
        C5348a.m13412h(dArr, i);
        C5348a.m13412h(dArr2, i2);
        double pow = Math.pow(dArr[0] - dArr2[0], 2.0d);
        if (Math.sqrt(Math.pow(dArr[2] - dArr2[2], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + pow) > ((double) i3)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static double m40223j(int i) {
        double b = m40218b(android.graphics.Color.red(i));
        double b2 = m40218b(android.graphics.Color.green(i)) * 0.7152d;
        return (m40218b(android.graphics.Color.blue(i)) * 0.0722d) + b2 + (b * 0.2126d);
    }

    /* renamed from: k */
    public static Color m40224k(String str) {
        return new Color(android.graphics.Color.parseColor(C25541a.m63881k("#", str)));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Color) && this.f41007b == ((Color) obj).f41007b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f41007b;
    }

    /* renamed from: l */
    public final String mo46956l() {
        Object[] objArr = {Integer.valueOf(this.f41007b)};
        String str = C20964s0.f52718a;
        return String.format((Locale) null, "%08x", objArr);
    }

    public final String toString() {
        int i = this.f41007b;
        if ((i & -16777216) == -16777216) {
            Object[] objArr = {Integer.valueOf(i & 16777215)};
            String str = C20964s0.f52718a;
            return String.format((Locale) null, "#%06x", objArr);
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        String str2 = C20964s0.f52718a;
        return String.format((Locale) null, "#%08x", objArr2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41005i);
    }
}
