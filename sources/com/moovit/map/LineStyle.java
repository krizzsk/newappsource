package com.moovit.map;

import android.graphics.Bitmap;
import ce0.C21100e;
import com.moovit.commons.utils.Color;
import com.moovit.map.C16273d;
import java.util.Arrays;
import p583jk.C17884p;
import p977zz.C20975x0;

public final class LineStyle extends C16273d {

    /* renamed from: b */
    public final Color f42326b;

    /* renamed from: c */
    public final float f42327c;

    /* renamed from: d */
    public final LineJoin f42328d;

    /* renamed from: e */
    public final Bitmap f42329e;

    /* renamed from: f */
    public final int[] f42330f = null;

    /* renamed from: g */
    public final Bitmap f42331g;

    /* renamed from: h */
    public final float f42332h;

    public enum LineJoin {
        NONE,
        BEVEL,
        ROUND,
        MITER
    }

    public LineStyle(Color color, float f, LineJoin lineJoin, Bitmap bitmap, Bitmap bitmap2, float f2) {
        int i;
        C21100e.m49373x(color, "color");
        this.f42326b = color;
        C21100e.m49357p(f, "strokeWidth");
        this.f42327c = f;
        C21100e.m49373x(lineJoin, "lineJoin");
        this.f42328d = lineJoin;
        this.f42329e = bitmap;
        this.f42331g = bitmap2;
        C21100e.m49357p(f2, "repeatSpacing");
        this.f42332h = f2;
        int i2 = 0;
        if (bitmap != null) {
            i = 1;
        } else {
            i = 0;
        }
        if (i + 0 + 0 + (bitmap2 != null ? 1 : i2) > 1) {
            throw new IllegalArgumentException("Only one of bitmapPattern, dashedPattern and repeatBitmap may be non-null");
        }
    }

    /* renamed from: b */
    public final Object mo48602b(C16273d.C16274a aVar, Boolean bool) {
        return aVar.mo48759b(this, bool);
    }

    public final boolean equals(Object obj) {
        char c;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineStyle)) {
            return false;
        }
        LineStyle lineStyle = (LineStyle) obj;
        if (this.f42326b.equals(lineStyle.f42326b)) {
            float f = this.f42327c;
            float f2 = lineStyle.f42327c;
            char c2 = 65535;
            if (f == f2) {
                c = 0;
            } else if (f < f2) {
                c = 65535;
            } else {
                c = 1;
            }
            if (c == 0 && this.f42328d == lineStyle.f42328d && Arrays.equals(this.f42330f, lineStyle.f42330f) && C20975x0.m49118e(this.f42329e, lineStyle.f42329e) && C20975x0.m49118e(this.f42331g, lineStyle.f42331g)) {
                float f3 = this.f42332h;
                float f4 = lineStyle.f42332h;
                if (f3 == f4) {
                    c2 = 0;
                } else if (f3 >= f4) {
                    c2 = 1;
                }
                if (c2 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f42326b), Float.floatToIntBits(this.f42327c), C17884p.m44335F(this.f42328d), Arrays.hashCode(this.f42330f), C17884p.m44335F(this.f42329e), C17884p.m44335F(this.f42331g), Float.floatToIntBits(this.f42332h));
    }
}
