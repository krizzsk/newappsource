package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.xmlpull.p982v1.XmlPullParser;
import p116i1.C5256j;
import p129j1.C5353d;
import p330z2.C7438n;

public class PatternPathMotion extends PathMotion {

    /* renamed from: a */
    public final Path f4928a;

    /* renamed from: b */
    public final Matrix f4929b;

    public PatternPathMotion() {
        Path path = new Path();
        this.f4928a = path;
        this.f4929b = new Matrix();
        path.lineTo(1.0f, BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: a */
    public final Path mo5353a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float sqrt = (float) Math.sqrt((double) ((f6 * f6) + (f5 * f5)));
        double atan2 = Math.atan2((double) f6, (double) f5);
        this.f4929b.setScale(sqrt, sqrt);
        this.f4929b.postRotate((float) Math.toDegrees(atan2));
        this.f4929b.postTranslate(f, f2);
        Path path = new Path();
        this.f4928a.transform(this.f4929b, path);
        return path;
    }

    /* renamed from: b */
    public final void mo5399b(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, (float[]) null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(BitmapDescriptorFactory.HUE_RED, fArr, (float[]) null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f4929b.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float sqrt = 1.0f / ((float) Math.sqrt((double) ((f6 * f6) + (f5 * f5))));
        this.f4929b.postScale(sqrt, sqrt);
        this.f4929b.postRotate((float) Math.toDegrees(-Math.atan2((double) f6, (double) f5)));
        path.transform(this.f4929b, this.f4928a);
    }

    @SuppressLint({"RestrictedApi"})
    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        this.f4928a = new Path();
        this.f4929b = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7438n.f22850i);
        try {
            String d = C5256j.m13276d(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (d != null) {
                mo5399b(C5353d.m13426d(d));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
