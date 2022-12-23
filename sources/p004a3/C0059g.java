package p004a3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.p982v1.XmlPullParser;
import org.xmlpull.p982v1.XmlPullParserException;
import p116i1.C5239c;
import p129j1.C5353d;
import p141k1.C5450a;
import p241s0.C6302b;

/* renamed from: a3.g */
public final class C0059g extends C0058f {

    /* renamed from: k */
    public static final PorterDuff.Mode f77k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public C0066g f78c;

    /* renamed from: d */
    public PorterDuffColorFilter f79d;

    /* renamed from: e */
    public ColorFilter f80e;

    /* renamed from: f */
    public boolean f81f;

    /* renamed from: g */
    public boolean f82g;

    /* renamed from: h */
    public final float[] f83h;

    /* renamed from: i */
    public final Matrix f84i;

    /* renamed from: j */
    public final Rect f85j;

    /* renamed from: a3.g$a */
    public static class C0060a extends C0064e {
        public C0060a() {
        }

        public C0060a(C0060a aVar) {
            super(aVar);
        }
    }

    /* renamed from: a3.g$d */
    public static abstract class C0063d {
        /* renamed from: a */
        public boolean mo109a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo110b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: a3.g$g */
    public static class C0066g extends Drawable.ConstantState {

        /* renamed from: a */
        public int f129a;

        /* renamed from: b */
        public C0065f f130b;

        /* renamed from: c */
        public ColorStateList f131c;

        /* renamed from: d */
        public PorterDuff.Mode f132d;

        /* renamed from: e */
        public boolean f133e;

        /* renamed from: f */
        public Bitmap f134f;

        /* renamed from: g */
        public ColorStateList f135g;

        /* renamed from: h */
        public PorterDuff.Mode f136h;

        /* renamed from: i */
        public int f137i;

        /* renamed from: j */
        public boolean f138j;

        /* renamed from: k */
        public boolean f139k;

        /* renamed from: l */
        public Paint f140l;

        public C0066g(C0066g gVar) {
            this.f131c = null;
            this.f132d = C0059g.f77k;
            if (gVar != null) {
                this.f129a = gVar.f129a;
                C0065f fVar = new C0065f(gVar.f130b);
                this.f130b = fVar;
                if (gVar.f130b.f118e != null) {
                    fVar.f118e = new Paint(gVar.f130b.f118e);
                }
                if (gVar.f130b.f117d != null) {
                    this.f130b.f117d = new Paint(gVar.f130b.f117d);
                }
                this.f131c = gVar.f131c;
                this.f132d = gVar.f132d;
                this.f133e = gVar.f133e;
            }
        }

        public int getChangingConfigurations() {
            return this.f129a;
        }

        public final Drawable newDrawable() {
            return new C0059g(this);
        }

        public final Drawable newDrawable(Resources resources) {
            return new C0059g(this);
        }

        public C0066g() {
            this.f131c = null;
            this.f132d = C0059g.f77k;
            this.f130b = new C0065f();
        }
    }

    public C0059g() {
        this.f82g = true;
        this.f83h = new float[9];
        this.f84i = new Matrix();
        this.f85j = new Rect();
        this.f78c = new C0066g();
    }

    /* renamed from: a */
    public final PorterDuffColorFilter mo82a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f76b;
        if (drawable == null) {
            return false;
        }
        C5450a.C5452b.m13611b(drawable);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d7, code lost:
        if (r8 == false) goto L_0x00d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            android.graphics.drawable.Drawable r2 = r0.f76b
            if (r2 == 0) goto L_0x000c
            r2.draw(r1)
            return
        L_0x000c:
            android.graphics.Rect r2 = r0.f85j
            r0.copyBounds(r2)
            android.graphics.Rect r2 = r0.f85j
            int r2 = r2.width()
            if (r2 <= 0) goto L_0x0197
            android.graphics.Rect r2 = r0.f85j
            int r2 = r2.height()
            if (r2 > 0) goto L_0x0023
            goto L_0x0197
        L_0x0023:
            android.graphics.ColorFilter r2 = r0.f80e
            if (r2 != 0) goto L_0x0029
            android.graphics.PorterDuffColorFilter r2 = r0.f79d
        L_0x0029:
            android.graphics.Matrix r3 = r0.f84i
            r1.getMatrix(r3)
            android.graphics.Matrix r3 = r0.f84i
            float[] r4 = r0.f83h
            r3.getValues(r4)
            float[] r3 = r0.f83h
            r4 = 0
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r5 = r0.f83h
            r6 = 4
            r5 = r5[r6]
            float r5 = java.lang.Math.abs(r5)
            float[] r6 = r0.f83h
            r7 = 1
            r6 = r6[r7]
            float r6 = java.lang.Math.abs(r6)
            float[] r8 = r0.f83h
            r9 = 3
            r8 = r8[r9]
            float r8 = java.lang.Math.abs(r8)
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x0064
            int r6 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0068
        L_0x0064:
            r3 = 1065353216(0x3f800000, float:1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x0068:
            android.graphics.Rect r6 = r0.f85j
            int r6 = r6.width()
            float r6 = (float) r6
            float r6 = r6 * r3
            int r3 = (int) r6
            android.graphics.Rect r6 = r0.f85j
            int r6 = r6.height()
            float r6 = (float) r6
            float r6 = r6 * r5
            int r5 = (int) r6
            r6 = 2048(0x800, float:2.87E-42)
            int r15 = java.lang.Math.min(r6, r3)
            int r3 = java.lang.Math.min(r6, r5)
            if (r15 <= 0) goto L_0x0197
            if (r3 > 0) goto L_0x008c
            goto L_0x0197
        L_0x008c:
            int r5 = r18.save()
            android.graphics.Rect r6 = r0.f85j
            int r8 = r6.left
            float r8 = (float) r8
            int r6 = r6.top
            float r6 = (float) r6
            r1.translate(r8, r6)
            boolean r6 = r17.isAutoMirrored()
            if (r6 == 0) goto L_0x00a9
            int r6 = p141k1.C5450a.m13599b(r17)
            if (r6 != r7) goto L_0x00a9
            r6 = 1
            goto L_0x00aa
        L_0x00a9:
            r6 = 0
        L_0x00aa:
            if (r6 == 0) goto L_0x00bb
            android.graphics.Rect r6 = r0.f85j
            int r6 = r6.width()
            float r6 = (float) r6
            r1.translate(r6, r9)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.scale(r6, r10)
        L_0x00bb:
            android.graphics.Rect r6 = r0.f85j
            r6.offsetTo(r4, r4)
            a3.g$g r6 = r0.f78c
            android.graphics.Bitmap r8 = r6.f134f
            if (r8 == 0) goto L_0x00d9
            int r8 = r8.getWidth()
            if (r15 != r8) goto L_0x00d6
            android.graphics.Bitmap r8 = r6.f134f
            int r8 = r8.getHeight()
            if (r3 != r8) goto L_0x00d6
            r8 = 1
            goto L_0x00d7
        L_0x00d6:
            r8 = 0
        L_0x00d7:
            if (r8 != 0) goto L_0x00e3
        L_0x00d9:
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r15, r3, r8)
            r6.f134f = r8
            r6.f139k = r7
        L_0x00e3:
            boolean r6 = r0.f82g
            if (r6 != 0) goto L_0x0101
            a3.g$g r6 = r0.f78c
            android.graphics.Bitmap r8 = r6.f134f
            r8.eraseColor(r4)
            android.graphics.Canvas r14 = new android.graphics.Canvas
            android.graphics.Bitmap r8 = r6.f134f
            r14.<init>(r8)
            a3.g$f r11 = r6.f130b
            a3.g$c r12 = r11.f120g
            android.graphics.Matrix r13 = p004a3.C0059g.C0065f.f113p
            r16 = r3
            r11.mo147a(r12, r13, r14, r15, r16)
            goto L_0x0159
        L_0x0101:
            a3.g$g r6 = r0.f78c
            boolean r8 = r6.f139k
            if (r8 != 0) goto L_0x0125
            android.content.res.ColorStateList r8 = r6.f135g
            android.content.res.ColorStateList r9 = r6.f131c
            if (r8 != r9) goto L_0x0125
            android.graphics.PorterDuff$Mode r8 = r6.f136h
            android.graphics.PorterDuff$Mode r9 = r6.f132d
            if (r8 != r9) goto L_0x0125
            boolean r8 = r6.f138j
            boolean r9 = r6.f133e
            if (r8 != r9) goto L_0x0125
            int r8 = r6.f137i
            a3.g$f r6 = r6.f130b
            int r6 = r6.getRootAlpha()
            if (r8 != r6) goto L_0x0125
            r6 = 1
            goto L_0x0126
        L_0x0125:
            r6 = 0
        L_0x0126:
            if (r6 != 0) goto L_0x0159
            a3.g$g r6 = r0.f78c
            android.graphics.Bitmap r8 = r6.f134f
            r8.eraseColor(r4)
            android.graphics.Canvas r14 = new android.graphics.Canvas
            android.graphics.Bitmap r8 = r6.f134f
            r14.<init>(r8)
            a3.g$f r11 = r6.f130b
            a3.g$c r12 = r11.f120g
            android.graphics.Matrix r13 = p004a3.C0059g.C0065f.f113p
            r16 = r3
            r11.mo147a(r12, r13, r14, r15, r16)
            a3.g$g r3 = r0.f78c
            android.content.res.ColorStateList r6 = r3.f131c
            r3.f135g = r6
            android.graphics.PorterDuff$Mode r6 = r3.f132d
            r3.f136h = r6
            a3.g$f r6 = r3.f130b
            int r6 = r6.getRootAlpha()
            r3.f137i = r6
            boolean r6 = r3.f133e
            r3.f138j = r6
            r3.f139k = r4
        L_0x0159:
            a3.g$g r3 = r0.f78c
            android.graphics.Rect r6 = r0.f85j
            a3.g$f r8 = r3.f130b
            int r8 = r8.getRootAlpha()
            r9 = 255(0xff, float:3.57E-43)
            if (r8 >= r9) goto L_0x0168
            r4 = 1
        L_0x0168:
            r8 = 0
            if (r4 != 0) goto L_0x016f
            if (r2 != 0) goto L_0x016f
            r2 = r8
            goto L_0x018f
        L_0x016f:
            android.graphics.Paint r4 = r3.f140l
            if (r4 != 0) goto L_0x017d
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r3.f140l = r4
            r4.setFilterBitmap(r7)
        L_0x017d:
            android.graphics.Paint r4 = r3.f140l
            a3.g$f r7 = r3.f130b
            int r7 = r7.getRootAlpha()
            r4.setAlpha(r7)
            android.graphics.Paint r4 = r3.f140l
            r4.setColorFilter(r2)
            android.graphics.Paint r2 = r3.f140l
        L_0x018f:
            android.graphics.Bitmap r3 = r3.f134f
            r1.drawBitmap(r3, r8, r6, r2)
            r1.restoreToCount(r5)
        L_0x0197:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004a3.C0059g.draw(android.graphics.Canvas):void");
    }

    public final int getAlpha() {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return C5450a.C5451a.m13605a(drawable);
        }
        return this.f78c.f130b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f78c.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return C5450a.C5452b.m13612c(drawable);
        }
        return this.f80e;
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f76b != null && Build.VERSION.SDK_INT >= 24) {
            return new C0067h(this.f76b.getConstantState());
        }
        this.f78c.f129a = getChangingConfigurations();
        return this.f78c;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f78c.f130b.f122i;
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f78c.f130b.f121h;
    }

    public final int getOpacity() {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public final void invalidateSelf() {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return C5450a.C5451a.m13608d(drawable);
        }
        return this.f78c.f133e;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C0066g gVar = this.f78c;
            if (gVar != null) {
                C0065f fVar = gVar.f130b;
                if (fVar.f127n == null) {
                    fVar.f127n = Boolean.valueOf(fVar.f120g.mo109a());
                }
                if (fVar.f127n.booleanValue() || ((colorStateList = this.f78c.f131c) != null && colorStateList.isStateful())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final Drawable mutate() {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f81f && super.mutate() == this) {
            this.f78c = new C0066g(this.f78c);
            this.f81f = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C0066g gVar = this.f78c;
        ColorStateList colorStateList = gVar.f131c;
        if (!(colorStateList == null || (mode = gVar.f132d) == null)) {
            this.f79d = mo82a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C0065f fVar = gVar.f130b;
        if (fVar.f127n == null) {
            fVar.f127n = Boolean.valueOf(fVar.f120g.mo109a());
        }
        if (fVar.f127n.booleanValue()) {
            boolean b = gVar.f130b.f120g.mo110b(iArr);
            gVar.f139k |= b;
            if (b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f78c.f130b.getRootAlpha() != i) {
            this.f78c.f130b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            C5450a.C5451a.m13609e(drawable, z);
        } else {
            this.f78c.f133e = z;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f80e = colorFilter;
        invalidateSelf();
    }

    public final void setTint(int i) {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            C5450a.m13601d(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            C5450a.C5452b.m13617h(drawable, colorStateList);
            return;
        }
        C0066g gVar = this.f78c;
        if (gVar.f131c != colorStateList) {
            gVar.f131c = colorStateList;
            this.f79d = mo82a(colorStateList, gVar.f132d);
            invalidateSelf();
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            C5450a.C5452b.m13618i(drawable, mode);
            return;
        }
        C0066g gVar = this.f78c;
        if (gVar.f132d != mode) {
            gVar.f132d = mode;
            this.f79d = mo82a(gVar.f131c, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f76b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: a3.g$h */
    public static class C0067h extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f141a;

        public C0067h(Drawable.ConstantState constantState) {
            this.f141a = constantState;
        }

        public final boolean canApplyTheme() {
            return this.f141a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f141a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            C0059g gVar = new C0059g();
            gVar.f76b = (VectorDrawable) this.f141a.newDrawable();
            return gVar;
        }

        public final Drawable newDrawable(Resources resources) {
            C0059g gVar = new C0059g();
            gVar.f76b = (VectorDrawable) this.f141a.newDrawable(resources);
            return gVar;
        }

        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0059g gVar = new C0059g();
            gVar.f76b = (VectorDrawable) this.f141a.newDrawable(resources, theme);
            return gVar;
        }
    }

    /* renamed from: a3.g$e */
    public static abstract class C0064e extends C0063d {

        /* renamed from: a */
        public C5353d.C5354a[] f109a = null;

        /* renamed from: b */
        public String f110b;

        /* renamed from: c */
        public int f111c = 0;

        /* renamed from: d */
        public int f112d;

        public C0064e() {
        }

        public C5353d.C5354a[] getPathData() {
            return this.f109a;
        }

        public String getPathName() {
            return this.f110b;
        }

        public void setPathData(C5353d.C5354a[] aVarArr) {
            if (!C5353d.m13423a(this.f109a, aVarArr)) {
                this.f109a = C5353d.m13427e(aVarArr);
                return;
            }
            C5353d.C5354a[] aVarArr2 = this.f109a;
            for (int i = 0; i < aVarArr.length; i++) {
                aVarArr2[i].f17651a = aVarArr[i].f17651a;
                int i2 = 0;
                while (true) {
                    float[] fArr = aVarArr[i].f17652b;
                    if (i2 >= fArr.length) {
                        break;
                    }
                    aVarArr2[i].f17652b[i2] = fArr[i2];
                    i2++;
                }
            }
        }

        public C0064e(C0064e eVar) {
            this.f110b = eVar.f110b;
            this.f112d = eVar.f112d;
            this.f109a = C5353d.m13427e(eVar.f109a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.p982v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) throws org.xmlpull.p982v1.XmlPullParserException, java.io.IOException {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            android.graphics.drawable.Drawable r5 = r0.f76b
            if (r5 == 0) goto L_0x0012
            p141k1.C5450a.C5452b.m13613d(r5, r1, r2, r3, r4)
            return
        L_0x0012:
            a3.g$g r5 = r0.f78c
            a3.g$f r6 = new a3.g$f
            r6.<init>()
            r5.f130b = r6
            int[] r6 = p004a3.C0049a.f54a
            android.content.res.TypedArray r6 = p116i1.C5256j.m13278f(r1, r4, r3, r6)
            a3.g$g r7 = r0.f78c
            a3.g$f r8 = r7.f130b
            java.lang.String r9 = "tintMode"
            r10 = 6
            r11 = -1
            int r9 = p116i1.C5256j.m13275c(r6, r2, r9, r10, r11)
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_IN
            r13 = 9
            r14 = 5
            r15 = 3
            if (r9 == r15) goto L_0x004a
            if (r9 == r14) goto L_0x004c
            if (r9 == r13) goto L_0x0047
            switch(r9) {
                case 14: goto L_0x0044;
                case 15: goto L_0x0041;
                case 16: goto L_0x003e;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x004c
        L_0x003e:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.ADD
            goto L_0x004c
        L_0x0041:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SCREEN
            goto L_0x004c
        L_0x0044:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x004c
        L_0x0047:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L_0x004c
        L_0x004a:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_OVER
        L_0x004c:
            r7.f132d = r12
            java.lang.String r9 = "tint"
            boolean r9 = p116i1.C5256j.m13277e(r2, r9)
            r12 = 0
            r10 = 2
            r13 = 1
            if (r9 == 0) goto L_0x00a7
            android.util.TypedValue r9 = new android.util.TypedValue
            r9.<init>()
            r6.getValue(r13, r9)
            int r11 = r9.type
            if (r11 == r10) goto L_0x0088
            r10 = 28
            if (r11 < r10) goto L_0x0075
            r10 = 31
            if (r11 > r10) goto L_0x0075
            int r9 = r9.data
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r9)
            goto L_0x00a8
        L_0x0075:
            android.content.res.Resources r9 = r6.getResources()
            int r10 = r6.getResourceId(r13, r12)
            java.lang.ThreadLocal<android.util.TypedValue> r11 = p116i1.C5238b.f17348a
            android.content.res.XmlResourceParser r10 = r9.getXml(r10)     // Catch:{ Exception -> 0x00a7 }
            android.content.res.ColorStateList r9 = p116i1.C5238b.m13254a(r9, r10, r4)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x00a8
        L_0x0088:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to resolve attribute at index "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r3 = ": "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00a7:
            r9 = 0
        L_0x00a8:
            if (r9 == 0) goto L_0x00ac
            r7.f131c = r9
        L_0x00ac:
            boolean r9 = r7.f133e
            java.lang.String r10 = "autoMirrored"
            boolean r10 = p116i1.C5256j.m13277e(r2, r10)
            if (r10 != 0) goto L_0x00b7
            goto L_0x00bb
        L_0x00b7:
            boolean r9 = r6.getBoolean(r14, r9)
        L_0x00bb:
            r7.f133e = r9
            float r7 = r8.f123j
            java.lang.String r9 = "viewportWidth"
            r10 = 7
            float r7 = p116i1.C5256j.m13274b(r6, r2, r9, r10, r7)
            r8.f123j = r7
            float r7 = r8.f124k
            java.lang.String r9 = "viewportHeight"
            r11 = 8
            float r7 = p116i1.C5256j.m13274b(r6, r2, r9, r11, r7)
            r8.f124k = r7
            float r9 = r8.f123j
            r18 = 0
            int r9 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r9 <= 0) goto L_0x03da
            int r7 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r7 <= 0) goto L_0x03bf
            float r7 = r8.f121h
            float r7 = r6.getDimension(r15, r7)
            r8.f121h = r7
            float r7 = r8.f122i
            r9 = 2
            float r7 = r6.getDimension(r9, r7)
            r8.f122i = r7
            float r9 = r8.f121h
            int r9 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r9 <= 0) goto L_0x03a4
            int r7 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r7 <= 0) goto L_0x0389
            float r7 = r8.getAlpha()
            java.lang.String r9 = "alpha"
            r14 = 4
            float r7 = p116i1.C5256j.m13274b(r6, r2, r9, r14, r7)
            r8.setAlpha(r7)
            java.lang.String r7 = r6.getString(r12)
            if (r7 == 0) goto L_0x0118
            r8.f126m = r7
            s0.b<java.lang.String, java.lang.Object> r9 = r8.f128o
            r9.put(r7, r8)
        L_0x0118:
            r6.recycle()
            int r6 = r21.getChangingConfigurations()
            r5.f129a = r6
            r5.f139k = r13
            a3.g$g r6 = r0.f78c
            a3.g$f r7 = r6.f130b
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            r8.<init>()
            a3.g$c r9 = r7.f120g
            r8.push(r9)
            int r9 = r23.getEventType()
            int r19 = r23.getDepth()
            int r10 = r19 + 1
            r19 = 1
        L_0x013d:
            if (r9 == r13) goto L_0x0374
            int r14 = r23.getDepth()
            if (r14 >= r10) goto L_0x0147
            if (r9 == r15) goto L_0x0374
        L_0x0147:
            java.lang.String r14 = "group"
            r15 = 2
            if (r9 != r15) goto L_0x034f
            java.lang.String r9 = r23.getName()
            java.lang.Object r15 = r8.peek()
            a3.g$c r15 = (p004a3.C0059g.C0062c) r15
            java.lang.String r11 = "path"
            boolean r11 = r11.equals(r9)
            java.lang.String r13 = "fillType"
            java.lang.String r12 = "pathData"
            if (r11 == 0) goto L_0x0262
            a3.g$b r9 = new a3.g$b
            r9.<init>()
            int[] r11 = p004a3.C0049a.f56c
            android.content.res.TypedArray r11 = p116i1.C5256j.m13278f(r1, r4, r3, r11)
            boolean r12 = p116i1.C5256j.m13277e(r2, r12)
            if (r12 != 0) goto L_0x0177
            r20 = r10
            goto L_0x023a
        L_0x0177:
            r12 = 0
            java.lang.String r14 = r11.getString(r12)
            if (r14 == 0) goto L_0x0180
            r9.f110b = r14
        L_0x0180:
            r12 = 2
            java.lang.String r14 = r11.getString(r12)
            if (r14 == 0) goto L_0x018d
            j1.d$a[] r12 = p129j1.C5353d.m13425c(r14)
            r9.f109a = r12
        L_0x018d:
            java.lang.String r12 = "fillColor"
            r14 = 1
            i1.c r12 = p116i1.C5256j.m13273a(r11, r2, r4, r12, r14)
            r9.f88g = r12
            r12 = 12
            float r14 = r9.f90i
            r20 = r10
            java.lang.String r10 = "fillAlpha"
            float r10 = p116i1.C5256j.m13274b(r11, r2, r10, r12, r14)
            r9.f90i = r10
            java.lang.String r10 = "strokeLineCap"
            r12 = 8
            r14 = -1
            int r10 = p116i1.C5256j.m13275c(r11, r2, r10, r12, r14)
            android.graphics.Paint$Cap r14 = r9.f94m
            if (r10 == 0) goto L_0x01be
            r12 = 1
            if (r10 == r12) goto L_0x01bb
            r12 = 2
            if (r10 == r12) goto L_0x01b8
            goto L_0x01c0
        L_0x01b8:
            android.graphics.Paint$Cap r14 = android.graphics.Paint.Cap.SQUARE
            goto L_0x01c0
        L_0x01bb:
            android.graphics.Paint$Cap r14 = android.graphics.Paint.Cap.ROUND
            goto L_0x01c0
        L_0x01be:
            android.graphics.Paint$Cap r14 = android.graphics.Paint.Cap.BUTT
        L_0x01c0:
            r9.f94m = r14
            java.lang.String r10 = "strokeLineJoin"
            r12 = 9
            r14 = -1
            int r10 = p116i1.C5256j.m13275c(r11, r2, r10, r12, r14)
            android.graphics.Paint$Join r12 = r9.f95n
            if (r10 == 0) goto L_0x01dc
            r14 = 1
            if (r10 == r14) goto L_0x01d9
            r14 = 2
            if (r10 == r14) goto L_0x01d6
            goto L_0x01de
        L_0x01d6:
            android.graphics.Paint$Join r12 = android.graphics.Paint.Join.BEVEL
            goto L_0x01de
        L_0x01d9:
            android.graphics.Paint$Join r12 = android.graphics.Paint.Join.ROUND
            goto L_0x01de
        L_0x01dc:
            android.graphics.Paint$Join r12 = android.graphics.Paint.Join.MITER
        L_0x01de:
            r9.f95n = r12
            r10 = 10
            float r12 = r9.f96o
            java.lang.String r14 = "strokeMiterLimit"
            float r10 = p116i1.C5256j.m13274b(r11, r2, r14, r10, r12)
            r9.f96o = r10
            java.lang.String r10 = "strokeColor"
            r12 = 3
            i1.c r10 = p116i1.C5256j.m13273a(r11, r2, r4, r10, r12)
            r9.f86e = r10
            r10 = 11
            float r12 = r9.f89h
            java.lang.String r14 = "strokeAlpha"
            float r10 = p116i1.C5256j.m13274b(r11, r2, r14, r10, r12)
            r9.f89h = r10
            float r10 = r9.f87f
            java.lang.String r12 = "strokeWidth"
            r14 = 4
            float r10 = p116i1.C5256j.m13274b(r11, r2, r12, r14, r10)
            r9.f87f = r10
            float r10 = r9.f92k
            java.lang.String r12 = "trimPathEnd"
            r14 = 6
            float r10 = p116i1.C5256j.m13274b(r11, r2, r12, r14, r10)
            r9.f92k = r10
            float r10 = r9.f93l
            java.lang.String r12 = "trimPathOffset"
            r14 = 7
            float r10 = p116i1.C5256j.m13274b(r11, r2, r12, r14, r10)
            r9.f93l = r10
            float r10 = r9.f91j
            java.lang.String r12 = "trimPathStart"
            r14 = 5
            float r10 = p116i1.C5256j.m13274b(r11, r2, r12, r14, r10)
            r9.f91j = r10
            r10 = 13
            int r12 = r9.f111c
            int r10 = p116i1.C5256j.m13275c(r11, r2, r13, r10, r12)
            r9.f111c = r10
        L_0x023a:
            r11.recycle()
            java.util.ArrayList<a3.g$d> r10 = r15.f98b
            r10.add(r9)
            java.lang.String r10 = r9.getPathName()
            if (r10 == 0) goto L_0x0251
            s0.b<java.lang.String, java.lang.Object> r10 = r7.f128o
            java.lang.String r11 = r9.getPathName()
            r10.put(r11, r9)
        L_0x0251:
            int r10 = r6.f129a
            int r9 = r9.f112d
            r9 = r9 | r10
            r6.f129a = r9
            r10 = 5
            r11 = 0
            r12 = 3
            r13 = 7
            r16 = -1
            r19 = 0
            goto L_0x0366
        L_0x0262:
            r20 = r10
            r11 = 9
            r16 = -1
            java.lang.String r10 = "clip-path"
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L_0x02bf
            a3.g$a r9 = new a3.g$a
            r9.<init>()
            boolean r10 = p116i1.C5256j.m13277e(r2, r12)
            if (r10 != 0) goto L_0x027c
            goto L_0x02a2
        L_0x027c:
            int[] r10 = p004a3.C0049a.f57d
            android.content.res.TypedArray r10 = p116i1.C5256j.m13278f(r1, r4, r3, r10)
            r12 = 0
            java.lang.String r14 = r10.getString(r12)
            if (r14 == 0) goto L_0x028b
            r9.f110b = r14
        L_0x028b:
            r14 = 1
            java.lang.String r17 = r10.getString(r14)
            if (r17 == 0) goto L_0x0298
            j1.d$a[] r14 = p129j1.C5353d.m13425c(r17)
            r9.f109a = r14
        L_0x0298:
            r14 = 2
            int r13 = p116i1.C5256j.m13275c(r10, r2, r13, r14, r12)
            r9.f111c = r13
            r10.recycle()
        L_0x02a2:
            java.util.ArrayList<a3.g$d> r10 = r15.f98b
            r10.add(r9)
            java.lang.String r10 = r9.getPathName()
            if (r10 == 0) goto L_0x02b6
            s0.b<java.lang.String, java.lang.Object> r10 = r7.f128o
            java.lang.String r12 = r9.getPathName()
            r10.put(r12, r9)
        L_0x02b6:
            int r10 = r6.f129a
            int r9 = r9.f112d
            r9 = r9 | r10
            r6.f129a = r9
            goto L_0x0349
        L_0x02bf:
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L_0x0349
            a3.g$c r9 = new a3.g$c
            r9.<init>()
            int[] r10 = p004a3.C0049a.f55b
            android.content.res.TypedArray r10 = p116i1.C5256j.m13278f(r1, r4, r3, r10)
            float r12 = r9.f99c
            java.lang.String r13 = "rotation"
            r14 = 5
            float r12 = p116i1.C5256j.m13274b(r10, r2, r13, r14, r12)
            r9.f99c = r12
            float r12 = r9.f100d
            r13 = 1
            float r12 = r10.getFloat(r13, r12)
            r9.f100d = r12
            float r12 = r9.f101e
            r11 = 2
            float r12 = r10.getFloat(r11, r12)
            r9.f101e = r12
            float r12 = r9.f102f
            java.lang.String r11 = "scaleX"
            r13 = 3
            float r11 = p116i1.C5256j.m13274b(r10, r2, r11, r13, r12)
            r9.f102f = r11
            float r11 = r9.f103g
            java.lang.String r12 = "scaleY"
            r13 = 4
            float r11 = p116i1.C5256j.m13274b(r10, r2, r12, r13, r11)
            r9.f103g = r11
            float r11 = r9.f104h
            java.lang.String r12 = "translateX"
            r13 = 6
            float r11 = p116i1.C5256j.m13274b(r10, r2, r12, r13, r11)
            r9.f104h = r11
            float r11 = r9.f105i
            java.lang.String r12 = "translateY"
            r13 = 7
            float r11 = p116i1.C5256j.m13274b(r10, r2, r12, r13, r11)
            r9.f105i = r11
            r11 = 0
            java.lang.String r12 = r10.getString(r11)
            if (r12 == 0) goto L_0x0324
            r9.f108l = r12
        L_0x0324:
            r9.mo127c()
            r10.recycle()
            java.util.ArrayList<a3.g$d> r10 = r15.f98b
            r10.add(r9)
            r8.push(r9)
            java.lang.String r10 = r9.getGroupName()
            if (r10 == 0) goto L_0x0341
            s0.b<java.lang.String, java.lang.Object> r10 = r7.f128o
            java.lang.String r12 = r9.getGroupName()
            r10.put(r12, r9)
        L_0x0341:
            int r10 = r6.f129a
            int r9 = r9.f107k
            r9 = r9 | r10
            r6.f129a = r9
            goto L_0x034c
        L_0x0349:
            r11 = 0
            r13 = 7
            r14 = 5
        L_0x034c:
            r10 = 5
            r12 = 3
            goto L_0x0366
        L_0x034f:
            r20 = r10
            r10 = 5
            r11 = 0
            r12 = 3
            r13 = 7
            r16 = -1
            if (r9 != r12) goto L_0x0366
            java.lang.String r9 = r23.getName()
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L_0x0366
            r8.pop()
        L_0x0366:
            int r9 = r23.next()
            r10 = r20
            r11 = 8
            r12 = 0
            r13 = 1
            r14 = 4
            r15 = 3
            goto L_0x013d
        L_0x0374:
            if (r19 != 0) goto L_0x0381
            android.content.res.ColorStateList r1 = r5.f131c
            android.graphics.PorterDuff$Mode r2 = r5.f132d
            android.graphics.PorterDuffColorFilter r1 = r0.mo82a(r1, r2)
            r0.f79d = r1
            return
        L_0x0381:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "no path defined"
            r1.<init>(r2)
            throw r1
        L_0x0389:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires height > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x03a4:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires width > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x03bf:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportHeight > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x03da:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportWidth > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p004a3.C0059g.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public C0059g(C0066g gVar) {
        this.f82g = true;
        this.f83h = new float[9];
        this.f84i = new Matrix();
        this.f85j = new Rect();
        this.f78c = gVar;
        this.f79d = mo82a(gVar.f131c, gVar.f132d);
    }

    /* renamed from: a3.g$b */
    public static class C0061b extends C0064e {

        /* renamed from: e */
        public C5239c f86e;

        /* renamed from: f */
        public float f87f = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: g */
        public C5239c f88g;

        /* renamed from: h */
        public float f89h = 1.0f;

        /* renamed from: i */
        public float f90i = 1.0f;

        /* renamed from: j */
        public float f91j = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: k */
        public float f92k = 1.0f;

        /* renamed from: l */
        public float f93l = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: m */
        public Paint.Cap f94m = Paint.Cap.BUTT;

        /* renamed from: n */
        public Paint.Join f95n = Paint.Join.MITER;

        /* renamed from: o */
        public float f96o = 4.0f;

        public C0061b() {
        }

        /* renamed from: a */
        public final boolean mo109a() {
            return this.f88g.mo21009b() || this.f86e.mo21009b();
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo110b(int[] r7) {
            /*
                r6 = this;
                i1.c r0 = r6.f88g
                boolean r1 = r0.mo21009b()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x001c
                android.content.res.ColorStateList r1 = r0.f17350b
                int r4 = r1.getDefaultColor()
                int r1 = r1.getColorForState(r7, r4)
                int r4 = r0.f17351c
                if (r1 == r4) goto L_0x001c
                r0.f17351c = r1
                r0 = 1
                goto L_0x001d
            L_0x001c:
                r0 = 0
            L_0x001d:
                i1.c r1 = r6.f86e
                boolean r4 = r1.mo21009b()
                if (r4 == 0) goto L_0x0036
                android.content.res.ColorStateList r4 = r1.f17350b
                int r5 = r4.getDefaultColor()
                int r7 = r4.getColorForState(r7, r5)
                int r4 = r1.f17351c
                if (r7 == r4) goto L_0x0036
                r1.f17351c = r7
                goto L_0x0037
            L_0x0036:
                r2 = 0
            L_0x0037:
                r7 = r2 | r0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p004a3.C0059g.C0061b.mo110b(int[]):boolean");
        }

        public float getFillAlpha() {
            return this.f90i;
        }

        public int getFillColor() {
            return this.f88g.f17351c;
        }

        public float getStrokeAlpha() {
            return this.f89h;
        }

        public int getStrokeColor() {
            return this.f86e.f17351c;
        }

        public float getStrokeWidth() {
            return this.f87f;
        }

        public float getTrimPathEnd() {
            return this.f92k;
        }

        public float getTrimPathOffset() {
            return this.f93l;
        }

        public float getTrimPathStart() {
            return this.f91j;
        }

        public void setFillAlpha(float f) {
            this.f90i = f;
        }

        public void setFillColor(int i) {
            this.f88g.f17351c = i;
        }

        public void setStrokeAlpha(float f) {
            this.f89h = f;
        }

        public void setStrokeColor(int i) {
            this.f86e.f17351c = i;
        }

        public void setStrokeWidth(float f) {
            this.f87f = f;
        }

        public void setTrimPathEnd(float f) {
            this.f92k = f;
        }

        public void setTrimPathOffset(float f) {
            this.f93l = f;
        }

        public void setTrimPathStart(float f) {
            this.f91j = f;
        }

        public C0061b(C0061b bVar) {
            super(bVar);
            this.f86e = bVar.f86e;
            this.f87f = bVar.f87f;
            this.f89h = bVar.f89h;
            this.f88g = bVar.f88g;
            this.f111c = bVar.f111c;
            this.f90i = bVar.f90i;
            this.f91j = bVar.f91j;
            this.f92k = bVar.f92k;
            this.f93l = bVar.f93l;
            this.f94m = bVar.f94m;
            this.f95n = bVar.f95n;
            this.f96o = bVar.f96o;
        }
    }

    /* renamed from: a3.g$c */
    public static class C0062c extends C0063d {

        /* renamed from: a */
        public final Matrix f97a;

        /* renamed from: b */
        public final ArrayList<C0063d> f98b;

        /* renamed from: c */
        public float f99c;

        /* renamed from: d */
        public float f100d;

        /* renamed from: e */
        public float f101e;

        /* renamed from: f */
        public float f102f;

        /* renamed from: g */
        public float f103g;

        /* renamed from: h */
        public float f104h;

        /* renamed from: i */
        public float f105i;

        /* renamed from: j */
        public final Matrix f106j;

        /* renamed from: k */
        public int f107k;

        /* renamed from: l */
        public String f108l;

        public C0062c() {
            this.f97a = new Matrix();
            this.f98b = new ArrayList<>();
            this.f99c = BitmapDescriptorFactory.HUE_RED;
            this.f100d = BitmapDescriptorFactory.HUE_RED;
            this.f101e = BitmapDescriptorFactory.HUE_RED;
            this.f102f = 1.0f;
            this.f103g = 1.0f;
            this.f104h = BitmapDescriptorFactory.HUE_RED;
            this.f105i = BitmapDescriptorFactory.HUE_RED;
            this.f106j = new Matrix();
            this.f108l = null;
        }

        /* renamed from: a */
        public final boolean mo109a() {
            for (int i = 0; i < this.f98b.size(); i++) {
                if (this.f98b.get(i).mo109a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo110b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f98b.size(); i++) {
                z |= this.f98b.get(i).mo110b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public final void mo127c() {
            this.f106j.reset();
            this.f106j.postTranslate(-this.f100d, -this.f101e);
            this.f106j.postScale(this.f102f, this.f103g);
            this.f106j.postRotate(this.f99c, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.f106j.postTranslate(this.f104h + this.f100d, this.f105i + this.f101e);
        }

        public String getGroupName() {
            return this.f108l;
        }

        public Matrix getLocalMatrix() {
            return this.f106j;
        }

        public float getPivotX() {
            return this.f100d;
        }

        public float getPivotY() {
            return this.f101e;
        }

        public float getRotation() {
            return this.f99c;
        }

        public float getScaleX() {
            return this.f102f;
        }

        public float getScaleY() {
            return this.f103g;
        }

        public float getTranslateX() {
            return this.f104h;
        }

        public float getTranslateY() {
            return this.f105i;
        }

        public void setPivotX(float f) {
            if (f != this.f100d) {
                this.f100d = f;
                mo127c();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f101e) {
                this.f101e = f;
                mo127c();
            }
        }

        public void setRotation(float f) {
            if (f != this.f99c) {
                this.f99c = f;
                mo127c();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f102f) {
                this.f102f = f;
                mo127c();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f103g) {
                this.f103g = f;
                mo127c();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f104h) {
                this.f104h = f;
                mo127c();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f105i) {
                this.f105i = f;
                mo127c();
            }
        }

        public C0062c(C0062c cVar, C6302b<String, Object> bVar) {
            C0064e eVar;
            this.f97a = new Matrix();
            this.f98b = new ArrayList<>();
            this.f99c = BitmapDescriptorFactory.HUE_RED;
            this.f100d = BitmapDescriptorFactory.HUE_RED;
            this.f101e = BitmapDescriptorFactory.HUE_RED;
            this.f102f = 1.0f;
            this.f103g = 1.0f;
            this.f104h = BitmapDescriptorFactory.HUE_RED;
            this.f105i = BitmapDescriptorFactory.HUE_RED;
            Matrix matrix = new Matrix();
            this.f106j = matrix;
            this.f108l = null;
            this.f99c = cVar.f99c;
            this.f100d = cVar.f100d;
            this.f101e = cVar.f101e;
            this.f102f = cVar.f102f;
            this.f103g = cVar.f103g;
            this.f104h = cVar.f104h;
            this.f105i = cVar.f105i;
            String str = cVar.f108l;
            this.f108l = str;
            this.f107k = cVar.f107k;
            if (str != null) {
                bVar.put(str, this);
            }
            matrix.set(cVar.f106j);
            ArrayList<C0063d> arrayList = cVar.f98b;
            for (int i = 0; i < arrayList.size(); i++) {
                C0063d dVar = arrayList.get(i);
                if (dVar instanceof C0062c) {
                    this.f98b.add(new C0062c((C0062c) dVar, bVar));
                } else {
                    if (dVar instanceof C0061b) {
                        eVar = new C0061b((C0061b) dVar);
                    } else if (dVar instanceof C0060a) {
                        eVar = new C0060a((C0060a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f98b.add(eVar);
                    String str2 = eVar.f110b;
                    if (str2 != null) {
                        bVar.put(str2, eVar);
                    }
                }
            }
        }
    }

    /* renamed from: a3.g$f */
    public static class C0065f {

        /* renamed from: p */
        public static final Matrix f113p = new Matrix();

        /* renamed from: a */
        public final Path f114a;

        /* renamed from: b */
        public final Path f115b;

        /* renamed from: c */
        public final Matrix f116c;

        /* renamed from: d */
        public Paint f117d;

        /* renamed from: e */
        public Paint f118e;

        /* renamed from: f */
        public PathMeasure f119f;

        /* renamed from: g */
        public final C0062c f120g;

        /* renamed from: h */
        public float f121h;

        /* renamed from: i */
        public float f122i;

        /* renamed from: j */
        public float f123j;

        /* renamed from: k */
        public float f124k;

        /* renamed from: l */
        public int f125l;

        /* renamed from: m */
        public String f126m;

        /* renamed from: n */
        public Boolean f127n;

        /* renamed from: o */
        public final C6302b<String, Object> f128o;

        public C0065f() {
            this.f116c = new Matrix();
            this.f121h = BitmapDescriptorFactory.HUE_RED;
            this.f122i = BitmapDescriptorFactory.HUE_RED;
            this.f123j = BitmapDescriptorFactory.HUE_RED;
            this.f124k = BitmapDescriptorFactory.HUE_RED;
            this.f125l = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
            this.f126m = null;
            this.f127n = null;
            this.f128o = new C6302b<>();
            this.f120g = new C0062c();
            this.f114a = new Path();
            this.f115b = new Path();
        }

        /* JADX WARNING: type inference failed for: r9v0 */
        /* JADX WARNING: type inference failed for: r9v1, types: [boolean] */
        /* JADX WARNING: type inference failed for: r9v2 */
        /* renamed from: a */
        public final void mo147a(C0062c cVar, Matrix matrix, Canvas canvas, int i, int i2) {
            float f;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            Path.FillType fillType;
            Path.FillType fillType2;
            C0062c cVar2 = cVar;
            Canvas canvas2 = canvas;
            cVar2.f97a.set(matrix);
            cVar2.f97a.preConcat(cVar2.f106j);
            canvas.save();
            ? r9 = 0;
            C0065f fVar = this;
            int i3 = 0;
            while (i3 < cVar2.f98b.size()) {
                C0063d dVar = cVar2.f98b.get(i3);
                if (dVar instanceof C0062c) {
                    mo147a((C0062c) dVar, cVar2.f97a, canvas, i, i2);
                } else if (dVar instanceof C0064e) {
                    C0064e eVar = (C0064e) dVar;
                    float f2 = ((float) i) / fVar.f123j;
                    float f3 = ((float) i2) / fVar.f124k;
                    float min = Math.min(f2, f3);
                    Matrix matrix2 = cVar2.f97a;
                    fVar.f116c.set(matrix2);
                    fVar.f116c.postScale(f2, f3);
                    float[] fArr = {BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED};
                    matrix2.mapVectors(fArr);
                    float f4 = min;
                    float f5 = (fArr[r9] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot((double) fArr[r9], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
                    if (max > BitmapDescriptorFactory.HUE_RED) {
                        f = Math.abs(f5) / max;
                    } else {
                        f = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (f != BitmapDescriptorFactory.HUE_RED) {
                        Path path = this.f114a;
                        eVar.getClass();
                        path.reset();
                        C5353d.C5354a[] aVarArr = eVar.f109a;
                        if (aVarArr != null) {
                            C5353d.C5354a.m13429b(aVarArr, path);
                        }
                        Path path2 = this.f114a;
                        this.f115b.reset();
                        if (eVar instanceof C0060a) {
                            Path path3 = this.f115b;
                            if (eVar.f111c == 0) {
                                fillType2 = Path.FillType.WINDING;
                            } else {
                                fillType2 = Path.FillType.EVEN_ODD;
                            }
                            path3.setFillType(fillType2);
                            this.f115b.addPath(path2, this.f116c);
                            canvas2.clipPath(this.f115b);
                        } else {
                            C0061b bVar = (C0061b) eVar;
                            float f6 = bVar.f91j;
                            if (!(f6 == BitmapDescriptorFactory.HUE_RED && bVar.f92k == 1.0f)) {
                                float f7 = bVar.f93l;
                                float f8 = (f6 + f7) % 1.0f;
                                float f9 = (bVar.f92k + f7) % 1.0f;
                                if (this.f119f == null) {
                                    this.f119f = new PathMeasure();
                                }
                                this.f119f.setPath(this.f114a, r9);
                                float length = this.f119f.getLength();
                                float f11 = f8 * length;
                                float f12 = f9 * length;
                                path2.reset();
                                if (f11 > f12) {
                                    this.f119f.getSegment(f11, length, path2, true);
                                    this.f119f.getSegment(BitmapDescriptorFactory.HUE_RED, f12, path2, true);
                                } else {
                                    this.f119f.getSegment(f11, f12, path2, true);
                                }
                                path2.rLineTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                            }
                            this.f115b.addPath(path2, this.f116c);
                            C5239c cVar3 = bVar.f88g;
                            if (cVar3.f17349a != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z || cVar3.f17351c != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                if (this.f118e == null) {
                                    Paint paint = new Paint(1);
                                    this.f118e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.f118e;
                                Shader shader = cVar3.f17349a;
                                if (shader != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    shader.setLocalMatrix(this.f116c);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(bVar.f90i * 255.0f));
                                } else {
                                    paint2.setShader((Shader) null);
                                    paint2.setAlpha(ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                                    int i4 = cVar3.f17351c;
                                    float f13 = bVar.f90i;
                                    PorterDuff.Mode mode = C0059g.f77k;
                                    paint2.setColor((i4 & 16777215) | (((int) (((float) Color.alpha(i4)) * f13)) << 24));
                                }
                                paint2.setColorFilter((ColorFilter) null);
                                Path path4 = this.f115b;
                                if (bVar.f111c == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path4.setFillType(fillType);
                                canvas2.drawPath(this.f115b, paint2);
                            }
                            C5239c cVar4 = bVar.f86e;
                            if (cVar4.f17349a != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3 || cVar4.f17351c != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                if (this.f117d == null) {
                                    z5 = true;
                                    Paint paint3 = new Paint(1);
                                    this.f117d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                } else {
                                    z5 = true;
                                }
                                Paint paint4 = this.f117d;
                                Paint.Join join = bVar.f95n;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = bVar.f94m;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(bVar.f96o);
                                Shader shader2 = cVar4.f17349a;
                                if (shader2 == null) {
                                    z5 = false;
                                }
                                if (z5) {
                                    shader2.setLocalMatrix(this.f116c);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(bVar.f89h * 255.0f));
                                } else {
                                    paint4.setShader((Shader) null);
                                    paint4.setAlpha(ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                                    int i5 = cVar4.f17351c;
                                    float f14 = bVar.f89h;
                                    PorterDuff.Mode mode2 = C0059g.f77k;
                                    paint4.setColor((i5 & 16777215) | (((int) (((float) Color.alpha(i5)) * f14)) << 24));
                                }
                                paint4.setColorFilter((ColorFilter) null);
                                paint4.setStrokeWidth(bVar.f87f * f * f4);
                                canvas2.drawPath(this.f115b, paint4);
                            }
                        }
                    }
                    fVar = this;
                    i3++;
                    r9 = 0;
                }
                int i6 = i;
                int i7 = i2;
                i3++;
                r9 = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f125l;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f125l = i;
        }

        public C0065f(C0065f fVar) {
            this.f116c = new Matrix();
            this.f121h = BitmapDescriptorFactory.HUE_RED;
            this.f122i = BitmapDescriptorFactory.HUE_RED;
            this.f123j = BitmapDescriptorFactory.HUE_RED;
            this.f124k = BitmapDescriptorFactory.HUE_RED;
            this.f125l = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
            this.f126m = null;
            this.f127n = null;
            C6302b<String, Object> bVar = new C6302b<>();
            this.f128o = bVar;
            this.f120g = new C0062c(fVar.f120g, bVar);
            this.f114a = new Path(fVar.f114a);
            this.f115b = new Path(fVar.f115b);
            this.f121h = fVar.f121h;
            this.f122i = fVar.f122i;
            this.f123j = fVar.f123j;
            this.f124k = fVar.f124k;
            this.f125l = fVar.f125l;
            this.f126m = fVar.f126m;
            String str = fVar.f126m;
            if (str != null) {
                bVar.put(str, this);
            }
            this.f127n = fVar.f127n;
        }
    }
}
