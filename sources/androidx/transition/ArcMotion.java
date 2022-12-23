package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.xmlpull.p982v1.XmlPullParser;
import p116i1.C5256j;
import p330z2.C7438n;

public class ArcMotion extends PathMotion {

    /* renamed from: d */
    public static final float f4865d = ((float) Math.tan(Math.toRadians(35.0d)));

    /* renamed from: a */
    public float f4866a = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: b */
    public float f4867b = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: c */
    public float f4868c = f4865d;

    public ArcMotion() {
    }

    /* renamed from: b */
    public static float m3458b(float f) {
        if (f >= BitmapDescriptorFactory.HUE_RED && f <= 90.0f) {
            return (float) Math.tan(Math.toRadians((double) (f / 2.0f)));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    /* renamed from: a */
    public final Path mo5353a(float f, float f2, float f3, float f4) {
        boolean z;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        Path path = new Path();
        path.moveTo(f, f2);
        float f11 = f3 - f;
        float f12 = f4 - f2;
        float f13 = (f12 * f12) + (f11 * f11);
        float f14 = (f + f3) / 2.0f;
        float f15 = (f2 + f4) / 2.0f;
        float f16 = 0.25f * f13;
        if (f2 > f4) {
            z = true;
        } else {
            z = false;
        }
        if (Math.abs(f11) < Math.abs(f12)) {
            float abs = Math.abs(f13 / (f12 * 2.0f));
            if (z) {
                f7 = abs + f4;
                f6 = f3;
            } else {
                f7 = abs + f2;
                f6 = f;
            }
            f5 = this.f4867b;
        } else {
            float f17 = f13 / (f11 * 2.0f);
            if (z) {
                f9 = f2;
                f8 = f17 + f;
            } else {
                f8 = f3 - f17;
                f9 = f4;
            }
            f5 = this.f4866a;
        }
        float f18 = f16 * f5 * f5;
        float f19 = f14 - f6;
        float f21 = f15 - f7;
        float f22 = (f21 * f21) + (f19 * f19);
        float f23 = this.f4868c;
        float f24 = f16 * f23 * f23;
        if (f22 >= f18) {
            if (f22 > f24) {
                f18 = f24;
            } else {
                f18 = BitmapDescriptorFactory.HUE_RED;
            }
        }
        if (f18 != BitmapDescriptorFactory.HUE_RED) {
            float sqrt = (float) Math.sqrt((double) (f18 / f22));
            f6 = C16759e.m42347c(f6, f14, sqrt, f14);
            f7 = C16759e.m42347c(f7, f15, sqrt, f15);
        }
        float f25 = (f6 + f3) / 2.0f;
        float f26 = (f7 + f4) / 2.0f;
        path.cubicTo((f + f6) / 2.0f, (f2 + f7) / 2.0f, f25, f26, f3, f4);
        return path;
    }

    @SuppressLint({"RestrictedApi"})
    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7438n.f22849h);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f4867b = m3458b(C5256j.m13274b(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, BitmapDescriptorFactory.HUE_RED));
        this.f4866a = m3458b(C5256j.m13274b(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, BitmapDescriptorFactory.HUE_RED));
        this.f4868c = m3458b(C5256j.m13274b(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }
}
