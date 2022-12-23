package p115i0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.UseCase;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.Map;
import mf0.C24361g;

/* renamed from: i0.j */
public final class C5234j {
    /* renamed from: a */
    public static HashMap m13246a(Rect rect, boolean z, Rational rational, int i, int i2, int i3, HashMap hashMap) {
        boolean z2;
        Rational rational2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        RectF rectF;
        boolean z8;
        boolean z9;
        boolean z11;
        Rect rect2 = rect;
        int i4 = i;
        int i5 = i2;
        boolean z12 = false;
        if (rect.width() <= 0 || rect.height() <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        C24361g.m61177o(z2, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF2 = new RectF(rect);
        HashMap hashMap2 = new HashMap();
        RectF rectF3 = new RectF(rect);
        for (Map.Entry entry : hashMap.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF4 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) ((Size) entry.getValue()).getWidth(), (float) ((Size) entry.getValue()).getHeight());
            matrix.setRectToRect(rectF4, rectF2, Matrix.ScaleToFit.CENTER);
            hashMap2.put((UseCase) entry.getKey(), matrix);
            RectF rectF5 = new RectF();
            matrix.mapRect(rectF5, rectF4);
            rectF3.intersect(rectF5);
        }
        if (i4 != 90 && i4 != 270) {
            rational2 = new Rational(rational.getNumerator(), rational.getDenominator());
        } else if (rational == null) {
            rational2 = rational;
        } else {
            rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        }
        if (i5 != 3) {
            Matrix matrix2 = new Matrix();
            RectF rectF6 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) rational2.getNumerator(), (float) rational2.getDenominator());
            if (i5 == 0) {
                matrix2.setRectToRect(rectF6, rectF3, Matrix.ScaleToFit.START);
            } else if (i5 == 1) {
                matrix2.setRectToRect(rectF6, rectF3, Matrix.ScaleToFit.CENTER);
            } else if (i5 == 2) {
                matrix2.setRectToRect(rectF6, rectF3, Matrix.ScaleToFit.END);
            } else {
                throw new IllegalStateException(C16759e.m42349e("Unexpected scale type: ", i5));
            }
            RectF rectF7 = new RectF();
            matrix2.mapRect(rectF7, rectF6);
            if (i3 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z13 = z3 ^ z;
            if (i4 != 0 || z13) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (i4 != 90 || !z13) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z4 && !z5) {
                if (i4 != 0 || !z13) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (i4 != 270 || z13) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (z6 || z7) {
                    float centerX = rectF3.centerX();
                    float f = centerX + centerX;
                    rectF = new RectF(f - rectF7.right, rectF7.top, f - rectF7.left, rectF7.bottom);
                } else {
                    if (i4 != 90 || z13) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if (i4 != 180 || !z13) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (z8 || z9) {
                        float centerY = rectF3.centerY();
                        float f2 = centerY + centerY;
                        rectF = new RectF(rectF7.left, f2 - rectF7.bottom, rectF7.right, f2 - rectF7.top);
                    } else {
                        if (i4 != 180 || z13) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (i4 == 270 && z13) {
                            z12 = true;
                        }
                        if (z11 || z12) {
                            float centerY2 = rectF3.centerY();
                            float f3 = centerY2 + centerY2;
                            RectF rectF8 = new RectF(rectF7.left, f3 - rectF7.bottom, rectF7.right, f3 - rectF7.top);
                            float centerX2 = rectF3.centerX();
                            float f4 = centerX2 + centerX2;
                            rectF7 = new RectF(f4 - rectF8.right, rectF8.top, f4 - rectF8.left, rectF8.bottom);
                        } else {
                            throw new IllegalArgumentException("Invalid argument: mirrored " + z13 + " rotation " + i4);
                        }
                    }
                }
                rectF3 = rectF;
            }
            rectF3 = rectF7;
        }
        HashMap hashMap3 = new HashMap();
        RectF rectF9 = new RectF();
        Matrix matrix3 = new Matrix();
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix3);
            matrix3.mapRect(rectF9, rectF3);
            Rect rect3 = new Rect();
            rectF9.round(rect3);
            hashMap3.put((UseCase) entry2.getKey(), rect3);
        }
        return hashMap3;
    }
}
