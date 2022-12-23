package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.C14071j;
import com.google.android.material.internal.C14083r;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p141k1.C5450a;
import p141k1.C5456d;
import p380bc.C13583g;
import p742qc.C19100d;
import p763rc.C19252b;
import p811tc.C19648g;
import p811tc.C19656l;

/* renamed from: com.google.android.material.chip.a */
public final class C13945a extends C19648g implements Drawable.Callback, C14071j.C14073b {

    /* renamed from: V0 */
    public static final int[] f34540V0 = {16842910};

    /* renamed from: W0 */
    public static final ShapeDrawable f34541W0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A */
    public ColorStateList f34542A;

    /* renamed from: A0 */
    public int f34543A0;

    /* renamed from: B */
    public float f34544B;

    /* renamed from: B0 */
    public int f34545B0;

    /* renamed from: C */
    public float f34546C = -1.0f;

    /* renamed from: C0 */
    public int f34547C0;

    /* renamed from: D */
    public ColorStateList f34548D;

    /* renamed from: D0 */
    public int f34549D0;

    /* renamed from: E */
    public float f34550E;

    /* renamed from: E0 */
    public int f34551E0;

    /* renamed from: F */
    public ColorStateList f34552F;

    /* renamed from: F0 */
    public int f34553F0;

    /* renamed from: G */
    public CharSequence f34554G;

    /* renamed from: G0 */
    public boolean f34555G0;

    /* renamed from: H */
    public boolean f34556H;

    /* renamed from: H0 */
    public int f34557H0;

    /* renamed from: I */
    public Drawable f34558I;

    /* renamed from: I0 */
    public int f34559I0 = ValidationUtils.APPBOY_STRING_MAX_LENGTH;

    /* renamed from: J */
    public ColorStateList f34560J;

    /* renamed from: J0 */
    public ColorFilter f34561J0;

    /* renamed from: K */
    public float f34562K;

    /* renamed from: K0 */
    public PorterDuffColorFilter f34563K0;

    /* renamed from: L */
    public boolean f34564L;

    /* renamed from: L0 */
    public ColorStateList f34565L0;

    /* renamed from: M */
    public boolean f34566M;

    /* renamed from: M0 */
    public PorterDuff.Mode f34567M0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: N */
    public Drawable f34568N;

    /* renamed from: N0 */
    public int[] f34569N0;

    /* renamed from: O */
    public RippleDrawable f34570O;

    /* renamed from: O0 */
    public boolean f34571O0;

    /* renamed from: P */
    public ColorStateList f34572P;

    /* renamed from: P0 */
    public ColorStateList f34573P0;

    /* renamed from: Q */
    public float f34574Q;

    /* renamed from: Q0 */
    public WeakReference<C13946a> f34575Q0 = new WeakReference<>((Object) null);

    /* renamed from: R */
    public SpannableStringBuilder f34576R;

    /* renamed from: R0 */
    public TextUtils.TruncateAt f34577R0;

    /* renamed from: S */
    public boolean f34578S;

    /* renamed from: S0 */
    public boolean f34579S0;

    /* renamed from: T */
    public boolean f34580T;

    /* renamed from: T0 */
    public int f34581T0;

    /* renamed from: U */
    public Drawable f34582U;

    /* renamed from: U0 */
    public boolean f34583U0;

    /* renamed from: X */
    public ColorStateList f34584X;

    /* renamed from: Y */
    public C13583g f34585Y;

    /* renamed from: Z */
    public C13583g f34586Z;

    /* renamed from: l0 */
    public float f34587l0;

    /* renamed from: m0 */
    public float f34588m0;

    /* renamed from: n0 */
    public float f34589n0;

    /* renamed from: o0 */
    public float f34590o0;

    /* renamed from: p0 */
    public float f34591p0;

    /* renamed from: q0 */
    public float f34592q0;

    /* renamed from: r0 */
    public float f34593r0;

    /* renamed from: s0 */
    public float f34594s0;

    /* renamed from: t0 */
    public final Context f34595t0;

    /* renamed from: u0 */
    public final Paint f34596u0 = new Paint(1);

    /* renamed from: v0 */
    public final Paint.FontMetrics f34597v0 = new Paint.FontMetrics();

    /* renamed from: w0 */
    public final RectF f34598w0 = new RectF();

    /* renamed from: x0 */
    public final PointF f34599x0 = new PointF();

    /* renamed from: y0 */
    public final Path f34600y0 = new Path();

    /* renamed from: z */
    public ColorStateList f34601z;

    /* renamed from: z0 */
    public final C14071j f34602z0;

    /* renamed from: com.google.android.material.chip.a$a */
    public interface C13946a {
        /* renamed from: a */
        void mo41218a();
    }

    public C13945a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, Chip.f34505y);
        mo52001k(context);
        this.f34595t0 = context;
        C14071j jVar = new C14071j(this);
        this.f34602z0 = jVar;
        this.f34554G = "";
        jVar.f35097a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f34540V0;
        setState(iArr);
        if (!Arrays.equals(this.f34569N0, iArr)) {
            this.f34569N0 = iArr;
            if (mo41422b0()) {
                mo41399E(getState(), iArr);
            }
        }
        this.f34579S0 = true;
        f34541W0.setTint(-1);
    }

    /* renamed from: B */
    public static boolean m34773B(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: C */
    public static boolean m34774C(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: c0 */
    public static void m34775c0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    /* renamed from: A */
    public final float mo41397A() {
        return this.f34583U0 ? mo52000j() : this.f34546C;
    }

    /* renamed from: D */
    public final void mo41398D() {
        C13946a aVar = this.f34575Q0.get();
        if (aVar != null) {
            aVar.mo41218a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x014d  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo41399E(int[] r9, int[] r10) {
        /*
            r8 = this;
            boolean r0 = super.onStateChange(r9)
            android.content.res.ColorStateList r1 = r8.f34601z
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r8.f34543A0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r1 = r8.mo51991d(r1)
            int r3 = r8.f34543A0
            r4 = 1
            if (r3 == r1) goto L_0x001d
            r8.f34543A0 = r1
            r0 = 1
        L_0x001d:
            android.content.res.ColorStateList r3 = r8.f34542A
            if (r3 == 0) goto L_0x0028
            int r5 = r8.f34545B0
            int r3 = r3.getColorForState(r9, r5)
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            int r3 = r8.mo51991d(r3)
            int r5 = r8.f34545B0
            if (r5 == r3) goto L_0x0034
            r8.f34545B0 = r3
            r0 = 1
        L_0x0034:
            int r1 = p129j1.C5348a.m13413i(r3, r1)
            int r3 = r8.f34547C0
            if (r3 == r1) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            tc.g$b r5 = r8.f49837b
            android.content.res.ColorStateList r5 = r5.f49863c
            if (r5 != 0) goto L_0x0047
            r5 = 1
            goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x0055
            r8.f34547C0 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r8.mo52005n(r0)
            r0 = 1
        L_0x0055:
            android.content.res.ColorStateList r1 = r8.f34548D
            if (r1 == 0) goto L_0x0060
            int r3 = r8.f34549D0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            int r3 = r8.f34549D0
            if (r3 == r1) goto L_0x0068
            r8.f34549D0 = r1
            r0 = 1
        L_0x0068:
            android.content.res.ColorStateList r1 = r8.f34573P0
            if (r1 == 0) goto L_0x007b
            boolean r1 = p763rc.C19252b.m46507d(r9)
            if (r1 == 0) goto L_0x007b
            android.content.res.ColorStateList r1 = r8.f34573P0
            int r3 = r8.f34551E0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            int r3 = r8.f34551E0
            if (r3 == r1) goto L_0x0087
            r8.f34551E0 = r1
            boolean r1 = r8.f34571O0
            if (r1 == 0) goto L_0x0087
            r0 = 1
        L_0x0087:
            com.google.android.material.internal.j r1 = r8.f34602z0
            qc.d r1 = r1.f35102f
            if (r1 == 0) goto L_0x0098
            android.content.res.ColorStateList r1 = r1.f48551j
            if (r1 == 0) goto L_0x0098
            int r3 = r8.f34553F0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            int r3 = r8.f34553F0
            if (r3 == r1) goto L_0x00a0
            r8.f34553F0 = r1
            r0 = 1
        L_0x00a0:
            int[] r1 = r8.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r1 != 0) goto L_0x00aa
            goto L_0x00b7
        L_0x00aa:
            int r5 = r1.length
            r6 = 0
        L_0x00ac:
            if (r6 >= r5) goto L_0x00b7
            r7 = r1[r6]
            if (r7 != r3) goto L_0x00b4
            r1 = 1
            goto L_0x00b8
        L_0x00b4:
            int r6 = r6 + 1
            goto L_0x00ac
        L_0x00b7:
            r1 = 0
        L_0x00b8:
            if (r1 == 0) goto L_0x00c0
            boolean r1 = r8.f34578S
            if (r1 == 0) goto L_0x00c0
            r1 = 1
            goto L_0x00c1
        L_0x00c0:
            r1 = 0
        L_0x00c1:
            boolean r3 = r8.f34555G0
            if (r3 == r1) goto L_0x00db
            android.graphics.drawable.Drawable r3 = r8.f34582U
            if (r3 == 0) goto L_0x00db
            float r0 = r8.mo41443y()
            r8.f34555G0 = r1
            float r1 = r8.mo41443y()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00da
            r0 = 1
            r1 = 1
            goto L_0x00dc
        L_0x00da:
            r0 = 1
        L_0x00db:
            r1 = 0
        L_0x00dc:
            android.content.res.ColorStateList r3 = r8.f34565L0
            if (r3 == 0) goto L_0x00e7
            int r5 = r8.f34557H0
            int r3 = r3.getColorForState(r9, r5)
            goto L_0x00e8
        L_0x00e7:
            r3 = 0
        L_0x00e8:
            int r5 = r8.f34557H0
            if (r5 == r3) goto L_0x0109
            r8.f34557H0 = r3
            android.content.res.ColorStateList r0 = r8.f34565L0
            android.graphics.PorterDuff$Mode r3 = r8.f34567M0
            if (r0 == 0) goto L_0x0105
            if (r3 != 0) goto L_0x00f7
            goto L_0x0105
        L_0x00f7:
            int[] r5 = r8.getState()
            int r0 = r0.getColorForState(r5, r2)
            android.graphics.PorterDuffColorFilter r5 = new android.graphics.PorterDuffColorFilter
            r5.<init>(r0, r3)
            goto L_0x0106
        L_0x0105:
            r5 = 0
        L_0x0106:
            r8.f34563K0 = r5
            goto L_0x010a
        L_0x0109:
            r4 = r0
        L_0x010a:
            android.graphics.drawable.Drawable r0 = r8.f34558I
            boolean r0 = m34774C(r0)
            if (r0 == 0) goto L_0x0119
            android.graphics.drawable.Drawable r0 = r8.f34558I
            boolean r0 = r0.setState(r9)
            r4 = r4 | r0
        L_0x0119:
            android.graphics.drawable.Drawable r0 = r8.f34582U
            boolean r0 = m34774C(r0)
            if (r0 == 0) goto L_0x0128
            android.graphics.drawable.Drawable r0 = r8.f34582U
            boolean r0 = r0.setState(r9)
            r4 = r4 | r0
        L_0x0128:
            android.graphics.drawable.Drawable r0 = r8.f34568N
            boolean r0 = m34774C(r0)
            if (r0 == 0) goto L_0x0145
            int r0 = r9.length
            int r3 = r10.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r9.length
            java.lang.System.arraycopy(r9, r2, r0, r2, r3)
            int r9 = r9.length
            int r3 = r10.length
            java.lang.System.arraycopy(r10, r2, r0, r9, r3)
            android.graphics.drawable.Drawable r9 = r8.f34568N
            boolean r9 = r9.setState(r0)
            r4 = r4 | r9
        L_0x0145:
            android.graphics.drawable.RippleDrawable r9 = r8.f34570O
            boolean r9 = m34774C(r9)
            if (r9 == 0) goto L_0x0154
            android.graphics.drawable.RippleDrawable r9 = r8.f34570O
            boolean r9 = r9.setState(r10)
            r4 = r4 | r9
        L_0x0154:
            if (r4 == 0) goto L_0x0159
            r8.invalidateSelf()
        L_0x0159:
            if (r1 == 0) goto L_0x015e
            r8.mo41398D()
        L_0x015e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C13945a.mo41399E(int[], int[]):boolean");
    }

    /* renamed from: F */
    public final void mo41400F(boolean z) {
        if (this.f34578S != z) {
            this.f34578S = z;
            float y = mo41443y();
            if (!z && this.f34555G0) {
                this.f34555G0 = false;
            }
            float y2 = mo41443y();
            invalidateSelf();
            if (y != y2) {
                mo41398D();
            }
        }
    }

    /* renamed from: G */
    public final void mo41401G(Drawable drawable) {
        if (this.f34582U != drawable) {
            float y = mo41443y();
            this.f34582U = drawable;
            float y2 = mo41443y();
            m34775c0(this.f34582U);
            mo41441w(this.f34582U);
            invalidateSelf();
            if (y != y2) {
                mo41398D();
            }
        }
    }

    /* renamed from: H */
    public final void mo41402H(ColorStateList colorStateList) {
        boolean z;
        if (this.f34584X != colorStateList) {
            this.f34584X = colorStateList;
            if (!this.f34580T || this.f34582U == null || !this.f34578S) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C5450a.C5452b.m13617h(this.f34582U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: I */
    public final void mo41403I(boolean z) {
        boolean z2;
        if (this.f34580T != z) {
            boolean Z = mo41420Z();
            this.f34580T = z;
            boolean Z2 = mo41420Z();
            if (Z != Z2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (Z2) {
                    mo41441w(this.f34582U);
                } else {
                    m34775c0(this.f34582U);
                }
                invalidateSelf();
                mo41398D();
            }
        }
    }

    @Deprecated
    /* renamed from: J */
    public final void mo41404J(float f) {
        if (this.f34546C != f) {
            this.f34546C = f;
            setShapeAppearanceModel(this.f49837b.f49861a.mo52021g(f));
        }
    }

    /* renamed from: K */
    public final void mo41405K(Drawable drawable) {
        Drawable drawable2 = this.f34558I;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof C5456d) {
            drawable2 = ((C5456d) drawable2).mo21301a();
        }
        if (drawable2 != drawable) {
            float y = mo41443y();
            if (drawable != null) {
                drawable3 = C5450a.m13604g(drawable).mutate();
            }
            this.f34558I = drawable3;
            float y2 = mo41443y();
            m34775c0(drawable2);
            if (mo41421a0()) {
                mo41441w(this.f34558I);
            }
            invalidateSelf();
            if (y != y2) {
                mo41398D();
            }
        }
    }

    /* renamed from: L */
    public final void mo41406L(float f) {
        if (this.f34562K != f) {
            float y = mo41443y();
            this.f34562K = f;
            float y2 = mo41443y();
            invalidateSelf();
            if (y != y2) {
                mo41398D();
            }
        }
    }

    /* renamed from: M */
    public final void mo41407M(ColorStateList colorStateList) {
        this.f34564L = true;
        if (this.f34560J != colorStateList) {
            this.f34560J = colorStateList;
            if (mo41421a0()) {
                C5450a.C5452b.m13617h(this.f34558I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: N */
    public final void mo41408N(boolean z) {
        boolean z2;
        if (this.f34556H != z) {
            boolean a0 = mo41421a0();
            this.f34556H = z;
            boolean a02 = mo41421a0();
            if (a0 != a02) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (a02) {
                    mo41441w(this.f34558I);
                } else {
                    m34775c0(this.f34558I);
                }
                invalidateSelf();
                mo41398D();
            }
        }
    }

    /* renamed from: O */
    public final void mo41409O(ColorStateList colorStateList) {
        if (this.f34548D != colorStateList) {
            this.f34548D = colorStateList;
            if (this.f34583U0) {
                mo52011s(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: P */
    public final void mo41410P(float f) {
        if (this.f34550E != f) {
            this.f34550E = f;
            this.f34596u0.setStrokeWidth(f);
            if (this.f34583U0) {
                this.f49837b.f49871k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* renamed from: Q */
    public final void mo41411Q(Drawable drawable) {
        Drawable drawable2 = this.f34568N;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof C5456d) {
            drawable2 = ((C5456d) drawable2).mo21301a();
        }
        if (drawable2 != drawable) {
            float z = mo41444z();
            if (drawable != null) {
                drawable3 = C5450a.m13604g(drawable).mutate();
            }
            this.f34568N = drawable3;
            this.f34570O = new RippleDrawable(C19252b.m46506c(this.f34552F), this.f34568N, f34541W0);
            float z2 = mo41444z();
            m34775c0(drawable2);
            if (mo41422b0()) {
                mo41441w(this.f34568N);
            }
            invalidateSelf();
            if (z != z2) {
                mo41398D();
            }
        }
    }

    /* renamed from: R */
    public final void mo41412R(float f) {
        if (this.f34593r0 != f) {
            this.f34593r0 = f;
            invalidateSelf();
            if (mo41422b0()) {
                mo41398D();
            }
        }
    }

    /* renamed from: S */
    public final void mo41413S(float f) {
        if (this.f34574Q != f) {
            this.f34574Q = f;
            invalidateSelf();
            if (mo41422b0()) {
                mo41398D();
            }
        }
    }

    /* renamed from: T */
    public final void mo41414T(float f) {
        if (this.f34592q0 != f) {
            this.f34592q0 = f;
            invalidateSelf();
            if (mo41422b0()) {
                mo41398D();
            }
        }
    }

    /* renamed from: U */
    public final void mo41415U(ColorStateList colorStateList) {
        if (this.f34572P != colorStateList) {
            this.f34572P = colorStateList;
            if (mo41422b0()) {
                C5450a.C5452b.m13617h(this.f34568N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: V */
    public final void mo41416V(boolean z) {
        boolean z2;
        if (this.f34566M != z) {
            boolean b0 = mo41422b0();
            this.f34566M = z;
            boolean b02 = mo41422b0();
            if (b0 != b02) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (b02) {
                    mo41441w(this.f34568N);
                } else {
                    m34775c0(this.f34568N);
                }
                invalidateSelf();
                mo41398D();
            }
        }
    }

    /* renamed from: W */
    public final void mo41417W(float f) {
        if (this.f34589n0 != f) {
            float y = mo41443y();
            this.f34589n0 = f;
            float y2 = mo41443y();
            invalidateSelf();
            if (y != y2) {
                mo41398D();
            }
        }
    }

    /* renamed from: X */
    public final void mo41418X(float f) {
        if (this.f34588m0 != f) {
            float y = mo41443y();
            this.f34588m0 = f;
            float y2 = mo41443y();
            invalidateSelf();
            if (y != y2) {
                mo41398D();
            }
        }
    }

    /* renamed from: Y */
    public final void mo41419Y(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.f34552F != colorStateList) {
            this.f34552F = colorStateList;
            if (this.f34571O0) {
                colorStateList2 = C19252b.m46506c(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.f34573P0 = colorStateList2;
            onStateChange(getState());
        }
    }

    /* renamed from: Z */
    public final boolean mo41420Z() {
        return this.f34580T && this.f34582U != null && this.f34555G0;
    }

    /* renamed from: a */
    public final void mo40982a() {
        mo41398D();
        invalidateSelf();
    }

    /* renamed from: a0 */
    public final boolean mo41421a0() {
        return this.f34556H && this.f34558I != null;
    }

    /* renamed from: b0 */
    public final boolean mo41422b0() {
        return this.f34566M && this.f34568N != null;
    }

    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.f34559I0) != 0) {
            if (i < 255) {
                float f = (float) bounds.left;
                float f2 = (float) bounds.top;
                float f3 = (float) bounds.right;
                float f4 = (float) bounds.bottom;
                if (Build.VERSION.SDK_INT > 21) {
                    i8 = canvas.saveLayerAlpha(f, f2, f3, f4, i);
                } else {
                    i8 = canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
                }
                i2 = i8;
            } else {
                i2 = 0;
            }
            if (!this.f34583U0) {
                this.f34596u0.setColor(this.f34543A0);
                this.f34596u0.setStyle(Paint.Style.FILL);
                this.f34598w0.set(bounds);
                canvas2.drawRoundRect(this.f34598w0, mo41397A(), mo41397A(), this.f34596u0);
            }
            if (!this.f34583U0) {
                this.f34596u0.setColor(this.f34545B0);
                this.f34596u0.setStyle(Paint.Style.FILL);
                Paint paint = this.f34596u0;
                ColorFilter colorFilter = this.f34561J0;
                if (colorFilter == null) {
                    colorFilter = this.f34563K0;
                }
                paint.setColorFilter(colorFilter);
                this.f34598w0.set(bounds);
                canvas2.drawRoundRect(this.f34598w0, mo41397A(), mo41397A(), this.f34596u0);
            }
            if (this.f34583U0) {
                super.draw(canvas);
            }
            if (this.f34550E > BitmapDescriptorFactory.HUE_RED && !this.f34583U0) {
                this.f34596u0.setColor(this.f34549D0);
                this.f34596u0.setStyle(Paint.Style.STROKE);
                if (!this.f34583U0) {
                    Paint paint2 = this.f34596u0;
                    ColorFilter colorFilter2 = this.f34561J0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.f34563K0;
                    }
                    paint2.setColorFilter(colorFilter2);
                }
                RectF rectF = this.f34598w0;
                float f5 = this.f34550E / 2.0f;
                rectF.set(((float) bounds.left) + f5, ((float) bounds.top) + f5, ((float) bounds.right) - f5, ((float) bounds.bottom) - f5);
                float f6 = this.f34546C - (this.f34550E / 2.0f);
                canvas2.drawRoundRect(this.f34598w0, f6, f6, this.f34596u0);
            }
            this.f34596u0.setColor(this.f34551E0);
            this.f34596u0.setStyle(Paint.Style.FILL);
            this.f34598w0.set(bounds);
            if (!this.f34583U0) {
                canvas2.drawRoundRect(this.f34598w0, mo41397A(), mo41397A(), this.f34596u0);
                i3 = 0;
            } else {
                RectF rectF2 = new RectF(bounds);
                Path path = this.f34600y0;
                C19656l lVar = this.f49854s;
                C19648g.C19650b bVar = this.f49837b;
                lVar.mo52028a(bVar.f49861a, bVar.f49870j, rectF2, this.f49853r, path);
                Paint paint3 = this.f34596u0;
                Path path2 = this.f34600y0;
                RectF h = mo51997h();
                i3 = 0;
                mo51993f(canvas, paint3, path2, this.f49837b.f49861a, h);
            }
            if (mo41421a0()) {
                mo41442x(bounds, this.f34598w0);
                RectF rectF3 = this.f34598w0;
                float f7 = rectF3.left;
                float f8 = rectF3.top;
                canvas2.translate(f7, f8);
                this.f34558I.setBounds(i3, i3, (int) this.f34598w0.width(), (int) this.f34598w0.height());
                this.f34558I.draw(canvas2);
                canvas2.translate(-f7, -f8);
            }
            if (mo41420Z()) {
                mo41442x(bounds, this.f34598w0);
                RectF rectF4 = this.f34598w0;
                float f9 = rectF4.left;
                float f11 = rectF4.top;
                canvas2.translate(f9, f11);
                this.f34582U.setBounds(i3, i3, (int) this.f34598w0.width(), (int) this.f34598w0.height());
                this.f34582U.draw(canvas2);
                canvas2.translate(-f9, -f11);
            }
            if (!this.f34579S0 || this.f34554G == null) {
                i6 = i2;
                i5 = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                i4 = 0;
            } else {
                PointF pointF = this.f34599x0;
                pointF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                Paint.Align align = Paint.Align.LEFT;
                if (this.f34554G != null) {
                    float y = mo41443y() + this.f34587l0 + this.f34590o0;
                    if (C5450a.m13599b(this) == 0) {
                        pointF.x = ((float) bounds.left) + y;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - y;
                        align = Paint.Align.RIGHT;
                    }
                    this.f34602z0.f35097a.getFontMetrics(this.f34597v0);
                    Paint.FontMetrics fontMetrics = this.f34597v0;
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                RectF rectF5 = this.f34598w0;
                rectF5.setEmpty();
                if (this.f34554G != null) {
                    float y2 = mo41443y() + this.f34587l0 + this.f34590o0;
                    float z2 = mo41444z() + this.f34594s0 + this.f34591p0;
                    if (C5450a.m13599b(this) == 0) {
                        rectF5.left = ((float) bounds.left) + y2;
                        rectF5.right = ((float) bounds.right) - z2;
                    } else {
                        rectF5.left = ((float) bounds.left) + z2;
                        rectF5.right = ((float) bounds.right) - y2;
                    }
                    rectF5.top = (float) bounds.top;
                    rectF5.bottom = (float) bounds.bottom;
                }
                C14071j jVar = this.f34602z0;
                if (jVar.f35102f != null) {
                    jVar.f35097a.drawableState = getState();
                    C14071j jVar2 = this.f34602z0;
                    jVar2.f35102f.mo51531e(this.f34595t0, jVar2.f35097a, jVar2.f35098b);
                }
                this.f34602z0.f35097a.setTextAlign(align);
                if (Math.round(this.f34602z0.mo41882a(this.f34554G.toString())) > Math.round(this.f34598w0.width())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i7 = canvas.save();
                    canvas2.clipRect(this.f34598w0);
                } else {
                    i7 = 0;
                }
                CharSequence charSequence = this.f34554G;
                if (z && this.f34577R0 != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.f34602z0.f35097a, this.f34598w0.width(), this.f34577R0);
                }
                CharSequence charSequence2 = charSequence;
                int length = charSequence2.length();
                PointF pointF2 = this.f34599x0;
                float f12 = pointF2.x;
                float f13 = pointF2.y;
                TextPaint textPaint = this.f34602z0.f35097a;
                i4 = 0;
                float f14 = f12;
                i5 = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                float f15 = f13;
                i6 = i2;
                canvas.drawText(charSequence2, 0, length, f14, f15, textPaint);
                if (z) {
                    canvas2.restoreToCount(i7);
                }
            }
            if (mo41422b0()) {
                RectF rectF6 = this.f34598w0;
                rectF6.setEmpty();
                if (mo41422b0()) {
                    float f16 = this.f34594s0 + this.f34593r0;
                    if (C5450a.m13599b(this) == 0) {
                        float f17 = ((float) bounds.right) - f16;
                        rectF6.right = f17;
                        rectF6.left = f17 - this.f34574Q;
                    } else {
                        float f18 = ((float) bounds.left) + f16;
                        rectF6.left = f18;
                        rectF6.right = f18 + this.f34574Q;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f19 = this.f34574Q;
                    float f21 = exactCenterY - (f19 / 2.0f);
                    rectF6.top = f21;
                    rectF6.bottom = f21 + f19;
                }
                RectF rectF7 = this.f34598w0;
                float f22 = rectF7.left;
                float f23 = rectF7.top;
                canvas2.translate(f22, f23);
                this.f34568N.setBounds(i4, i4, (int) this.f34598w0.width(), (int) this.f34598w0.height());
                this.f34570O.setBounds(this.f34568N.getBounds());
                this.f34570O.jumpToCurrentState();
                this.f34570O.draw(canvas2);
                canvas2.translate(-f22, -f23);
            }
            if (this.f34559I0 < i5) {
                canvas2.restoreToCount(i6);
            }
        }
    }

    public final int getAlpha() {
        return this.f34559I0;
    }

    public final ColorFilter getColorFilter() {
        return this.f34561J0;
    }

    public final int getIntrinsicHeight() {
        return (int) this.f34544B;
    }

    public final int getIntrinsicWidth() {
        return Math.min(Math.round(mo41444z() + this.f34602z0.mo41882a(this.f34554G.toString()) + mo41443y() + this.f34587l0 + this.f34590o0 + this.f34591p0 + this.f34594s0), this.f34581T0);
    }

    public final int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.f34583U0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f34546C);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f34544B, this.f34546C);
        }
        outline.setAlpha(((float) this.f34559I0) / 255.0f);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final boolean isStateful() {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        if (m34773B(this.f34601z) || m34773B(this.f34542A) || m34773B(this.f34548D)) {
            return true;
        }
        if (this.f34571O0 && m34773B(this.f34573P0)) {
            return true;
        }
        C19100d dVar = this.f34602z0.f35102f;
        if (dVar == null || (colorStateList = dVar.f48551j) == null || !colorStateList.isStateful()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        if (!this.f34580T || this.f34582U == null || !this.f34578S) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 || m34774C(this.f34558I) || m34774C(this.f34582U) || m34773B(this.f34565L0)) {
            return true;
        }
        return false;
    }

    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (mo41421a0()) {
            onLayoutDirectionChanged |= C5450a.m13600c(this.f34558I, i);
        }
        if (mo41420Z()) {
            onLayoutDirectionChanged |= C5450a.m13600c(this.f34582U, i);
        }
        if (mo41422b0()) {
            onLayoutDirectionChanged |= C5450a.m13600c(this.f34568N, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (mo41421a0()) {
            onLevelChange |= this.f34558I.setLevel(i);
        }
        if (mo41420Z()) {
            onLevelChange |= this.f34582U.setLevel(i);
        }
        if (mo41422b0()) {
            onLevelChange |= this.f34568N.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public final boolean onStateChange(int[] iArr) {
        if (this.f34583U0) {
            super.onStateChange(iArr);
        }
        return mo41399E(iArr, this.f34569N0);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (this.f34559I0 != i) {
            this.f34559I0 = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f34561J0 != colorFilter) {
            this.f34561J0 = colorFilter;
            invalidateSelf();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.f34565L0 != colorStateList) {
            this.f34565L0 = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.f34567M0 != mode) {
            this.f34567M0 = mode;
            ColorStateList colorStateList = this.f34565L0;
            if (colorStateList == null || mode == null) {
                porterDuffColorFilter = null;
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            }
            this.f34563K0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (mo41421a0()) {
            visible |= this.f34558I.setVisible(z, z2);
        }
        if (mo41420Z()) {
            visible |= this.f34582U.setVisible(z, z2);
        }
        if (mo41422b0()) {
            visible |= this.f34568N.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: w */
    public final void mo41441w(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C5450a.m13600c(drawable, C5450a.m13599b(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f34568N) {
                if (drawable.isStateful()) {
                    drawable.setState(this.f34569N0);
                }
                C5450a.C5452b.m13617h(drawable, this.f34572P);
                return;
            }
            Drawable drawable2 = this.f34558I;
            if (drawable == drawable2 && this.f34564L) {
                C5450a.C5452b.m13617h(drawable2, this.f34560J);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    /* renamed from: x */
    public final void mo41442x(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        float f;
        rectF.setEmpty();
        if (mo41421a0() || mo41420Z()) {
            float f2 = this.f34587l0 + this.f34588m0;
            if (this.f34555G0) {
                drawable = this.f34582U;
            } else {
                drawable = this.f34558I;
            }
            float f3 = this.f34562K;
            if (f3 <= BitmapDescriptorFactory.HUE_RED && drawable != null) {
                f3 = (float) drawable.getIntrinsicWidth();
            }
            if (C5450a.m13599b(this) == 0) {
                float f4 = ((float) rect.left) + f2;
                rectF.left = f4;
                rectF.right = f4 + f3;
            } else {
                float f5 = ((float) rect.right) - f2;
                rectF.right = f5;
                rectF.left = f5 - f3;
            }
            if (this.f34555G0) {
                drawable2 = this.f34582U;
            } else {
                drawable2 = this.f34558I;
            }
            float f6 = this.f34562K;
            if (f6 <= BitmapDescriptorFactory.HUE_RED && drawable2 != null) {
                f6 = (float) Math.ceil((double) C14083r.m35066b(24, this.f34595t0));
                if (((float) drawable2.getIntrinsicHeight()) <= f6) {
                    f = (float) drawable2.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f;
                }
            }
            f = f6;
            float exactCenterY2 = rect.exactCenterY() - (f / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f;
        }
    }

    /* renamed from: y */
    public final float mo41443y() {
        Drawable drawable;
        if (!mo41421a0() && !mo41420Z()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f = this.f34588m0;
        if (this.f34555G0) {
            drawable = this.f34582U;
        } else {
            drawable = this.f34558I;
        }
        float f2 = this.f34562K;
        if (f2 <= BitmapDescriptorFactory.HUE_RED && drawable != null) {
            f2 = (float) drawable.getIntrinsicWidth();
        }
        return f2 + f + this.f34589n0;
    }

    /* renamed from: z */
    public final float mo41444z() {
        if (mo41422b0()) {
            return this.f34592q0 + this.f34574Q + this.f34593r0;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }
}
