package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.play.core.assetpacks.C14256d1;
import java.util.WeakHashMap;
import p068e2.C4525b;
import p216q1.C6138e;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p380bc.C13577a;
import p742qc.C19096a;
import p742qc.C19100d;
import p742qc.C19103f;

/* renamed from: com.google.android.material.internal.c */
public final class C14047c {

    /* renamed from: A */
    public Typeface f34983A;

    /* renamed from: B */
    public Typeface f34984B;

    /* renamed from: C */
    public Typeface f34985C;

    /* renamed from: D */
    public Typeface f34986D;

    /* renamed from: E */
    public C19096a f34987E;

    /* renamed from: F */
    public C19096a f34988F;

    /* renamed from: G */
    public CharSequence f34989G;

    /* renamed from: H */
    public CharSequence f34990H;

    /* renamed from: I */
    public boolean f34991I;

    /* renamed from: J */
    public boolean f34992J = true;

    /* renamed from: K */
    public Bitmap f34993K;

    /* renamed from: L */
    public float f34994L;

    /* renamed from: M */
    public float f34995M;

    /* renamed from: N */
    public float f34996N;

    /* renamed from: O */
    public float f34997O;

    /* renamed from: P */
    public float f34998P;

    /* renamed from: Q */
    public int f34999Q;

    /* renamed from: R */
    public int[] f35000R;

    /* renamed from: S */
    public boolean f35001S;

    /* renamed from: T */
    public final TextPaint f35002T;

    /* renamed from: U */
    public final TextPaint f35003U;

    /* renamed from: V */
    public TimeInterpolator f35004V;

    /* renamed from: W */
    public TimeInterpolator f35005W;

    /* renamed from: X */
    public float f35006X;

    /* renamed from: Y */
    public float f35007Y;

    /* renamed from: Z */
    public float f35008Z;

    /* renamed from: a */
    public final View f35009a;

    /* renamed from: a0 */
    public ColorStateList f35010a0;

    /* renamed from: b */
    public boolean f35011b;

    /* renamed from: b0 */
    public float f35012b0;

    /* renamed from: c */
    public float f35013c;

    /* renamed from: c0 */
    public float f35014c0;

    /* renamed from: d */
    public boolean f35015d;

    /* renamed from: d0 */
    public float f35016d0;

    /* renamed from: e */
    public float f35017e;

    /* renamed from: e0 */
    public ColorStateList f35018e0;

    /* renamed from: f */
    public float f35019f;

    /* renamed from: f0 */
    public float f35020f0;

    /* renamed from: g */
    public int f35021g;

    /* renamed from: g0 */
    public float f35022g0;

    /* renamed from: h */
    public final Rect f35023h;

    /* renamed from: h0 */
    public float f35024h0;

    /* renamed from: i */
    public final Rect f35025i;

    /* renamed from: i0 */
    public StaticLayout f35026i0;

    /* renamed from: j */
    public final RectF f35027j;

    /* renamed from: j0 */
    public float f35028j0;

    /* renamed from: k */
    public int f35029k = 16;

    /* renamed from: k0 */
    public float f35030k0;

    /* renamed from: l */
    public int f35031l = 16;

    /* renamed from: l0 */
    public float f35032l0;

    /* renamed from: m */
    public float f35033m = 15.0f;

    /* renamed from: m0 */
    public CharSequence f35034m0;

    /* renamed from: n */
    public float f35035n = 15.0f;

    /* renamed from: n0 */
    public int f35036n0 = 1;

    /* renamed from: o */
    public ColorStateList f35037o;

    /* renamed from: o0 */
    public float f35038o0 = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: p */
    public ColorStateList f35039p;

    /* renamed from: p0 */
    public float f35040p0 = 1.0f;

    /* renamed from: q */
    public int f35041q;

    /* renamed from: q0 */
    public int f35042q0 = StaticLayoutBuilderCompat.f34960m;

    /* renamed from: r */
    public float f35043r;

    /* renamed from: s */
    public float f35044s;

    /* renamed from: t */
    public float f35045t;

    /* renamed from: u */
    public float f35046u;

    /* renamed from: v */
    public float f35047v;

    /* renamed from: w */
    public float f35048w;

    /* renamed from: x */
    public Typeface f35049x;

    /* renamed from: y */
    public Typeface f35050y;

    /* renamed from: z */
    public Typeface f35051z;

    /* renamed from: com.google.android.material.internal.c$a */
    public class C14048a implements C19096a.C19097a {
        public C14048a() {
        }

        /* renamed from: a */
        public final void mo41875a(Typeface typeface) {
            C14047c cVar = C14047c.this;
            if (cVar.mo41869n(typeface)) {
                cVar.mo41865j(false);
            }
        }
    }

    /* renamed from: com.google.android.material.internal.c$b */
    public class C14049b implements C19096a.C19097a {
        public C14049b() {
        }

        /* renamed from: a */
        public final void mo41875a(Typeface typeface) {
            C14047c cVar = C14047c.this;
            if (cVar.mo41871p(typeface)) {
                cVar.mo41865j(false);
            }
        }
    }

    public C14047c(View view) {
        this.f35009a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f35002T = textPaint;
        this.f35003U = new TextPaint(textPaint);
        this.f35025i = new Rect();
        this.f35023h = new Rect();
        this.f35027j = new RectF();
        float f = this.f35017e;
        this.f35019f = C16759e.m42347c(1.0f, f, 0.5f, f);
        mo41863h(view.getContext().getResources().getConfiguration());
    }

    /* renamed from: a */
    public static int m35012a(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((((float) Color.alpha(i2)) * f) + (((float) Color.alpha(i)) * f2)), Math.round((((float) Color.red(i2)) * f) + (((float) Color.red(i)) * f2)), Math.round((((float) Color.green(i2)) * f) + (((float) Color.green(i)) * f2)), Math.round((((float) Color.blue(i2)) * f) + (((float) Color.blue(i)) * f2)));
    }

    /* renamed from: g */
    public static float m35013g(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        LinearInterpolator linearInterpolator = C13577a.f33537a;
        return C16759e.m42347c(f2, f, f3, f);
    }

    /* renamed from: b */
    public final boolean mo41858b(CharSequence charSequence) {
        C6138e.C6142d dVar;
        View view = this.f35009a;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        boolean z = true;
        if (C6333d0.C6338e.m15063d(view) != 1) {
            z = false;
        }
        if (!this.f34992J) {
            return z;
        }
        if (z) {
            dVar = C6138e.f19504d;
        } else {
            dVar = C6138e.f19503c;
        }
        return dVar.mo22118b(charSequence, charSequence.length());
    }

    /* renamed from: c */
    public final void mo41859c(float f, boolean z) {
        boolean z2;
        float f2;
        float f3;
        boolean z3;
        boolean z4;
        boolean z5;
        StaticLayout staticLayout;
        Layout.Alignment alignment;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        if (this.f34989G != null) {
            float width = (float) this.f35025i.width();
            float width2 = (float) this.f35023h.width();
            if (Math.abs(f - 1.0f) < 1.0E-5f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                f3 = this.f35035n;
                f2 = this.f35020f0;
                this.f34994L = 1.0f;
                Typeface typeface = this.f34986D;
                Typeface typeface2 = this.f35049x;
                if (typeface != typeface2) {
                    this.f34986D = typeface2;
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                float f4 = this.f35033m;
                float f5 = this.f35022g0;
                Typeface typeface3 = this.f34986D;
                Typeface typeface4 = this.f34983A;
                if (typeface3 != typeface4) {
                    this.f34986D = typeface4;
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (Math.abs(f - BitmapDescriptorFactory.HUE_RED) < 1.0E-5f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    this.f34994L = 1.0f;
                } else {
                    this.f34994L = m35013g(this.f35033m, this.f35035n, f, this.f35005W) / this.f35033m;
                }
                float f6 = this.f35035n / this.f35033m;
                float f7 = width2 * f6;
                if (!z && f7 > width) {
                    width = Math.min(width / f6, width2);
                } else {
                    width = width2;
                }
                f3 = f4;
                f2 = f5;
            }
            if (width > BitmapDescriptorFactory.HUE_RED) {
                if (this.f34995M != f3) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (this.f35024h0 != f2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z6 || z7 || this.f35001S || z3) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.f34995M = f3;
                this.f35024h0 = f2;
                this.f35001S = false;
            }
            if (this.f34990H == null || z3) {
                this.f35002T.setTextSize(this.f34995M);
                this.f35002T.setTypeface(this.f34986D);
                this.f35002T.setLetterSpacing(this.f35024h0);
                TextPaint textPaint = this.f35002T;
                if (this.f34994L != 1.0f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                textPaint.setLinearText(z4);
                boolean b = mo41858b(this.f34989G);
                this.f34991I = b;
                int i = this.f35036n0;
                if (i <= 1 || (b && !this.f35015d)) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (!z5) {
                    i = 1;
                }
                if (i == 1) {
                    try {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e) {
                        e.getCause().getMessage();
                        staticLayout = null;
                    }
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f35029k, b ? 1 : 0) & 7;
                    if (absoluteGravity == 1) {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    } else if (absoluteGravity != 5) {
                        if (this.f34991I) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        }
                    } else if (this.f34991I) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                }
                StaticLayoutBuilderCompat staticLayoutBuilderCompat = new StaticLayoutBuilderCompat(this.f34989G, this.f35002T, (int) width);
                staticLayoutBuilderCompat.f34975l = TextUtils.TruncateAt.END;
                staticLayoutBuilderCompat.f34974k = b;
                staticLayoutBuilderCompat.f34968e = alignment;
                staticLayoutBuilderCompat.f34973j = false;
                staticLayoutBuilderCompat.f34969f = i;
                float f8 = this.f35038o0;
                float f9 = this.f35040p0;
                staticLayoutBuilderCompat.f34970g = f8;
                staticLayoutBuilderCompat.f34971h = f9;
                staticLayoutBuilderCompat.f34972i = this.f35042q0;
                staticLayout = staticLayoutBuilderCompat.mo41850a();
                staticLayout.getClass();
                this.f35026i0 = staticLayout;
                this.f34990H = staticLayout.getText();
            }
        }
    }

    /* renamed from: d */
    public final void mo41860d(Canvas canvas) {
        Canvas canvas2 = canvas;
        int save = canvas.save();
        if (this.f34990H != null && this.f35011b) {
            this.f35002T.setTextSize(this.f34995M);
            float f = this.f35047v;
            float f2 = this.f35048w;
            float f3 = this.f34994L;
            if (f3 != 1.0f && !this.f35015d) {
                canvas2.scale(f3, f3, f, f2);
            }
            boolean z = true;
            if (this.f35036n0 <= 1 || (this.f34991I && !this.f35015d)) {
                z = false;
            }
            if (!z || (this.f35015d && this.f35013c <= this.f35019f)) {
                canvas2.translate(f, f2);
                this.f35026i0.draw(canvas2);
            } else {
                float lineStart = this.f35047v - ((float) this.f35026i0.getLineStart(0));
                int alpha = this.f35002T.getAlpha();
                canvas2.translate(lineStart, f2);
                float f4 = (float) alpha;
                this.f35002T.setAlpha((int) (this.f35032l0 * f4));
                int i = Build.VERSION.SDK_INT;
                if (i >= 31) {
                    TextPaint textPaint = this.f35002T;
                    textPaint.setShadowLayer(this.f34996N, this.f34997O, this.f34998P, C14256d1.m35483a(this.f34999Q, textPaint.getAlpha()));
                }
                this.f35026i0.draw(canvas2);
                this.f35002T.setAlpha((int) (this.f35030k0 * f4));
                if (i >= 31) {
                    TextPaint textPaint2 = this.f35002T;
                    textPaint2.setShadowLayer(this.f34996N, this.f34997O, this.f34998P, C14256d1.m35483a(this.f34999Q, textPaint2.getAlpha()));
                }
                int lineBaseline = this.f35026i0.getLineBaseline(0);
                CharSequence charSequence = this.f35034m0;
                float f5 = (float) lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), BitmapDescriptorFactory.HUE_RED, f5, this.f35002T);
                if (i >= 31) {
                    this.f35002T.setShadowLayer(this.f34996N, this.f34997O, this.f34998P, this.f34999Q);
                }
                if (!this.f35015d) {
                    String trim = this.f35034m0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    this.f35002T.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.f35026i0.getLineEnd(0), str.length()), BitmapDescriptorFactory.HUE_RED, f5, this.f35002T);
                }
            }
            canvas2.restoreToCount(save);
        }
    }

    /* renamed from: e */
    public final float mo41861e() {
        TextPaint textPaint = this.f35003U;
        textPaint.setTextSize(this.f35035n);
        textPaint.setTypeface(this.f35049x);
        textPaint.setLetterSpacing(this.f35020f0);
        return -this.f35003U.ascent();
    }

    /* renamed from: f */
    public final int mo41862f(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f35000R;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: h */
    public final void mo41863h(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f35051z;
            if (typeface != null) {
                this.f35050y = C19103f.m46263a(configuration, typeface);
            }
            Typeface typeface2 = this.f34985C;
            if (typeface2 != null) {
                this.f34984B = C19103f.m46263a(configuration, typeface2);
            }
            Typeface typeface3 = this.f35050y;
            if (typeface3 == null) {
                typeface3 = this.f35051z;
            }
            this.f35049x = typeface3;
            Typeface typeface4 = this.f34984B;
            if (typeface4 == null) {
                typeface4 = this.f34985C;
            }
            this.f34983A = typeface4;
            mo41865j(true);
        }
    }

    /* renamed from: i */
    public final void mo41864i() {
        boolean z;
        if (this.f35025i.width() <= 0 || this.f35025i.height() <= 0 || this.f35023h.width() <= 0 || this.f35023h.height() <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f35011b = z;
    }

    /* renamed from: j */
    public final void mo41865j(boolean z) {
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        Rect rect;
        StaticLayout staticLayout;
        if ((this.f35009a.getHeight() > 0 && this.f35009a.getWidth() > 0) || z) {
            mo41859c(1.0f, z);
            CharSequence charSequence = this.f34990H;
            if (!(charSequence == null || (staticLayout = this.f35026i0) == null)) {
                this.f35034m0 = TextUtils.ellipsize(charSequence, this.f35002T, (float) staticLayout.getWidth(), TextUtils.TruncateAt.END);
            }
            CharSequence charSequence2 = this.f35034m0;
            if (charSequence2 != null) {
                this.f35028j0 = this.f35002T.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.f35028j0 = BitmapDescriptorFactory.HUE_RED;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f35031l, this.f34991I ? 1 : 0);
            int i2 = absoluteGravity & 112;
            if (i2 == 48) {
                this.f35044s = (float) this.f35025i.top;
            } else if (i2 != 80) {
                this.f35044s = ((float) this.f35025i.centerY()) - ((this.f35002T.descent() - this.f35002T.ascent()) / 2.0f);
            } else {
                this.f35044s = this.f35002T.ascent() + ((float) this.f35025i.bottom);
            }
            int i3 = absoluteGravity & 8388615;
            if (i3 == 1) {
                this.f35046u = ((float) this.f35025i.centerX()) - (this.f35028j0 / 2.0f);
            } else if (i3 != 5) {
                this.f35046u = (float) this.f35025i.left;
            } else {
                this.f35046u = ((float) this.f35025i.right) - this.f35028j0;
            }
            mo41859c(BitmapDescriptorFactory.HUE_RED, z);
            StaticLayout staticLayout2 = this.f35026i0;
            if (staticLayout2 != null) {
                f = (float) staticLayout2.getHeight();
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            StaticLayout staticLayout3 = this.f35026i0;
            if (staticLayout3 == null || this.f35036n0 <= 1) {
                CharSequence charSequence3 = this.f34990H;
                if (charSequence3 != null) {
                    f2 = this.f35002T.measureText(charSequence3, 0, charSequence3.length());
                } else {
                    f2 = BitmapDescriptorFactory.HUE_RED;
                }
            } else {
                f2 = (float) staticLayout3.getWidth();
            }
            StaticLayout staticLayout4 = this.f35026i0;
            if (staticLayout4 != null) {
                i = staticLayout4.getLineCount();
            } else {
                i = 0;
            }
            this.f35041q = i;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f35029k, this.f34991I ? 1 : 0);
            int i4 = absoluteGravity2 & 112;
            if (i4 == 48) {
                this.f35043r = (float) this.f35023h.top;
            } else if (i4 != 80) {
                this.f35043r = ((float) this.f35023h.centerY()) - (f / 2.0f);
            } else {
                this.f35043r = this.f35002T.descent() + (((float) this.f35023h.bottom) - f);
            }
            int i5 = absoluteGravity2 & 8388615;
            if (i5 == 1) {
                this.f35045t = ((float) this.f35023h.centerX()) - (f2 / 2.0f);
            } else if (i5 != 5) {
                this.f35045t = (float) this.f35023h.left;
            } else {
                this.f35045t = ((float) this.f35023h.right) - f2;
            }
            Bitmap bitmap = this.f34993K;
            if (bitmap != null) {
                bitmap.recycle();
                this.f34993K = null;
            }
            mo41873r(this.f35013c);
            float f5 = this.f35013c;
            if (this.f35015d) {
                RectF rectF = this.f35027j;
                if (f5 < this.f35019f) {
                    rect = this.f35023h;
                } else {
                    rect = this.f35025i;
                }
                rectF.set(rect);
            } else {
                this.f35027j.left = m35013g((float) this.f35023h.left, (float) this.f35025i.left, f5, this.f35004V);
                this.f35027j.top = m35013g(this.f35043r, this.f35044s, f5, this.f35004V);
                this.f35027j.right = m35013g((float) this.f35023h.right, (float) this.f35025i.right, f5, this.f35004V);
                this.f35027j.bottom = m35013g((float) this.f35023h.bottom, (float) this.f35025i.bottom, f5, this.f35004V);
            }
            if (!this.f35015d) {
                this.f35047v = m35013g(this.f35045t, this.f35046u, f5, this.f35004V);
                this.f35048w = m35013g(this.f35043r, this.f35044s, f5, this.f35004V);
                mo41873r(f5);
                f3 = f5;
            } else if (f5 < this.f35019f) {
                this.f35047v = this.f35045t;
                this.f35048w = this.f35043r;
                mo41873r(BitmapDescriptorFactory.HUE_RED);
                f3 = BitmapDescriptorFactory.HUE_RED;
            } else {
                this.f35047v = this.f35046u;
                this.f35048w = this.f35044s - ((float) Math.max(0, this.f35021g));
                mo41873r(1.0f);
                f3 = 1.0f;
            }
            C4525b bVar = C13577a.f33538b;
            this.f35030k0 = 1.0f - m35013g(BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f - f5, bVar);
            View view = this.f35009a;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15051k(view);
            this.f35032l0 = m35013g(1.0f, BitmapDescriptorFactory.HUE_RED, f5, bVar);
            C6333d0.C6337d.m15051k(this.f35009a);
            ColorStateList colorStateList = this.f35039p;
            ColorStateList colorStateList2 = this.f35037o;
            if (colorStateList != colorStateList2) {
                this.f35002T.setColor(m35012a(f3, mo41862f(colorStateList2), mo41862f(this.f35039p)));
            } else {
                this.f35002T.setColor(mo41862f(colorStateList));
            }
            float f6 = this.f35020f0;
            float f7 = this.f35022g0;
            if (f6 != f7) {
                this.f35002T.setLetterSpacing(m35013g(f7, f6, f5, bVar));
            } else {
                this.f35002T.setLetterSpacing(f6);
            }
            this.f34996N = m35013g(this.f35012b0, this.f35006X, f5, (TimeInterpolator) null);
            this.f34997O = m35013g(this.f35014c0, this.f35007Y, f5, (TimeInterpolator) null);
            this.f34998P = m35013g(this.f35016d0, this.f35008Z, f5, (TimeInterpolator) null);
            int a = m35012a(f5, mo41862f(this.f35018e0), mo41862f(this.f35010a0));
            this.f34999Q = a;
            this.f35002T.setShadowLayer(this.f34996N, this.f34997O, this.f34998P, a);
            if (this.f35015d) {
                int alpha = this.f35002T.getAlpha();
                float f8 = this.f35019f;
                if (f5 <= f8) {
                    f4 = C13577a.m33993a(1.0f, BitmapDescriptorFactory.HUE_RED, this.f35017e, f8, f5);
                } else {
                    f4 = C13577a.m33993a(BitmapDescriptorFactory.HUE_RED, 1.0f, f8, 1.0f, f5);
                }
                this.f35002T.setAlpha((int) (f4 * ((float) alpha)));
            }
            C6333d0.C6337d.m15051k(this.f35009a);
        }
    }

    /* renamed from: k */
    public final void mo41866k(int i) {
        C19100d dVar = new C19100d(this.f35009a.getContext(), i);
        ColorStateList colorStateList = dVar.f48551j;
        if (colorStateList != null) {
            this.f35039p = colorStateList;
        }
        float f = dVar.f48552k;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            this.f35035n = f;
        }
        ColorStateList colorStateList2 = dVar.f48542a;
        if (colorStateList2 != null) {
            this.f35010a0 = colorStateList2;
        }
        this.f35007Y = dVar.f48546e;
        this.f35008Z = dVar.f48547f;
        this.f35006X = dVar.f48548g;
        this.f35020f0 = dVar.f48550i;
        C19096a aVar = this.f34988F;
        if (aVar != null) {
            aVar.f48541d = true;
        }
        C14048a aVar2 = new C14048a();
        dVar.mo51527a();
        this.f34988F = new C19096a(aVar2, dVar.f48555n);
        dVar.mo51529c(this.f35009a.getContext(), this.f34988F);
        mo41865j(false);
    }

    /* renamed from: l */
    public final void mo41867l(ColorStateList colorStateList) {
        if (this.f35039p != colorStateList) {
            this.f35039p = colorStateList;
            mo41865j(false);
        }
    }

    /* renamed from: m */
    public final void mo41868m(int i) {
        if (this.f35031l != i) {
            this.f35031l = i;
            mo41865j(false);
        }
    }

    /* renamed from: n */
    public final boolean mo41869n(Typeface typeface) {
        C19096a aVar = this.f34988F;
        if (aVar != null) {
            aVar.f48541d = true;
        }
        if (this.f35051z == typeface) {
            return false;
        }
        this.f35051z = typeface;
        Typeface a = C19103f.m46263a(this.f35009a.getContext().getResources().getConfiguration(), typeface);
        this.f35050y = a;
        if (a == null) {
            a = this.f35051z;
        }
        this.f35049x = a;
        return true;
    }

    /* renamed from: o */
    public final void mo41870o(int i) {
        C19100d dVar = new C19100d(this.f35009a.getContext(), i);
        ColorStateList colorStateList = dVar.f48551j;
        if (colorStateList != null) {
            this.f35037o = colorStateList;
        }
        float f = dVar.f48552k;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            this.f35033m = f;
        }
        ColorStateList colorStateList2 = dVar.f48542a;
        if (colorStateList2 != null) {
            this.f35018e0 = colorStateList2;
        }
        this.f35014c0 = dVar.f48546e;
        this.f35016d0 = dVar.f48547f;
        this.f35012b0 = dVar.f48548g;
        this.f35022g0 = dVar.f48550i;
        C19096a aVar = this.f34987E;
        if (aVar != null) {
            aVar.f48541d = true;
        }
        C14049b bVar = new C14049b();
        dVar.mo51527a();
        this.f34987E = new C19096a(bVar, dVar.f48555n);
        dVar.mo51529c(this.f35009a.getContext(), this.f34987E);
        mo41865j(false);
    }

    /* renamed from: p */
    public final boolean mo41871p(Typeface typeface) {
        C19096a aVar = this.f34987E;
        if (aVar != null) {
            aVar.f48541d = true;
        }
        if (this.f34985C == typeface) {
            return false;
        }
        this.f34985C = typeface;
        Typeface a = C19103f.m46263a(this.f35009a.getContext().getResources().getConfiguration(), typeface);
        this.f34984B = a;
        if (a == null) {
            a = this.f34985C;
        }
        this.f34983A = a;
        return true;
    }

    /* renamed from: q */
    public final void mo41872q(float f) {
        float f2;
        float f3;
        Rect rect;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f35013c) {
            this.f35013c = f;
            if (this.f35015d) {
                RectF rectF = this.f35027j;
                if (f < this.f35019f) {
                    rect = this.f35023h;
                } else {
                    rect = this.f35025i;
                }
                rectF.set(rect);
            } else {
                this.f35027j.left = m35013g((float) this.f35023h.left, (float) this.f35025i.left, f, this.f35004V);
                this.f35027j.top = m35013g(this.f35043r, this.f35044s, f, this.f35004V);
                this.f35027j.right = m35013g((float) this.f35023h.right, (float) this.f35025i.right, f, this.f35004V);
                this.f35027j.bottom = m35013g((float) this.f35023h.bottom, (float) this.f35025i.bottom, f, this.f35004V);
            }
            if (!this.f35015d) {
                this.f35047v = m35013g(this.f35045t, this.f35046u, f, this.f35004V);
                this.f35048w = m35013g(this.f35043r, this.f35044s, f, this.f35004V);
                mo41873r(f);
                f2 = f;
            } else if (f < this.f35019f) {
                this.f35047v = this.f35045t;
                this.f35048w = this.f35043r;
                mo41873r(BitmapDescriptorFactory.HUE_RED);
                f2 = BitmapDescriptorFactory.HUE_RED;
            } else {
                this.f35047v = this.f35046u;
                this.f35048w = this.f35044s - ((float) Math.max(0, this.f35021g));
                mo41873r(1.0f);
                f2 = 1.0f;
            }
            C4525b bVar = C13577a.f33538b;
            this.f35030k0 = 1.0f - m35013g(BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f - f, bVar);
            View view = this.f35009a;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15051k(view);
            this.f35032l0 = m35013g(1.0f, BitmapDescriptorFactory.HUE_RED, f, bVar);
            C6333d0.C6337d.m15051k(this.f35009a);
            ColorStateList colorStateList = this.f35039p;
            ColorStateList colorStateList2 = this.f35037o;
            if (colorStateList != colorStateList2) {
                this.f35002T.setColor(m35012a(f2, mo41862f(colorStateList2), mo41862f(this.f35039p)));
            } else {
                this.f35002T.setColor(mo41862f(colorStateList));
            }
            float f4 = this.f35020f0;
            float f5 = this.f35022g0;
            if (f4 != f5) {
                this.f35002T.setLetterSpacing(m35013g(f5, f4, f, bVar));
            } else {
                this.f35002T.setLetterSpacing(f4);
            }
            this.f34996N = m35013g(this.f35012b0, this.f35006X, f, (TimeInterpolator) null);
            this.f34997O = m35013g(this.f35014c0, this.f35007Y, f, (TimeInterpolator) null);
            this.f34998P = m35013g(this.f35016d0, this.f35008Z, f, (TimeInterpolator) null);
            int a = m35012a(f, mo41862f(this.f35018e0), mo41862f(this.f35010a0));
            this.f34999Q = a;
            this.f35002T.setShadowLayer(this.f34996N, this.f34997O, this.f34998P, a);
            if (this.f35015d) {
                int alpha = this.f35002T.getAlpha();
                float f6 = this.f35019f;
                if (f <= f6) {
                    f3 = C13577a.m33993a(1.0f, BitmapDescriptorFactory.HUE_RED, this.f35017e, f6, f);
                } else {
                    f3 = C13577a.m33993a(BitmapDescriptorFactory.HUE_RED, 1.0f, f6, 1.0f, f);
                }
                this.f35002T.setAlpha((int) (f3 * ((float) alpha)));
            }
            C6333d0.C6337d.m15051k(this.f35009a);
        }
    }

    /* renamed from: r */
    public final void mo41873r(float f) {
        mo41859c(f, false);
        View view = this.f35009a;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15051k(view);
    }

    /* renamed from: s */
    public final boolean mo41874s(int[] iArr) {
        boolean z;
        ColorStateList colorStateList;
        this.f35000R = iArr;
        ColorStateList colorStateList2 = this.f35039p;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.f35037o) == null || !colorStateList.isStateful())) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        mo41865j(false);
        return true;
    }
}
