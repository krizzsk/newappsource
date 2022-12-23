package p742qc;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import ci0.C21211f;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p116i1.C5247f;
import p355ac.C13411l;

/* renamed from: qc.d */
public final class C19100d {

    /* renamed from: a */
    public final ColorStateList f48542a;

    /* renamed from: b */
    public final String f48543b;

    /* renamed from: c */
    public final int f48544c;

    /* renamed from: d */
    public final int f48545d;

    /* renamed from: e */
    public final float f48546e;

    /* renamed from: f */
    public final float f48547f;

    /* renamed from: g */
    public final float f48548g;

    /* renamed from: h */
    public final boolean f48549h;

    /* renamed from: i */
    public final float f48550i;

    /* renamed from: j */
    public ColorStateList f48551j;

    /* renamed from: k */
    public float f48552k;

    /* renamed from: l */
    public final int f48553l;

    /* renamed from: m */
    public boolean f48554m = false;

    /* renamed from: n */
    public Typeface f48555n;

    /* renamed from: qc.d$a */
    public class C19101a extends C5247f.C5252e {

        /* renamed from: a */
        public final /* synthetic */ C21211f f48556a;

        public C19101a(C21211f fVar) {
            this.f48556a = fVar;
        }

        /* renamed from: c */
        public final void mo2199c(int i) {
            C19100d.this.f48554m = true;
            this.f48556a.mo41361s(i);
        }

        /* renamed from: d */
        public final void mo2200d(Typeface typeface) {
            C19100d dVar = C19100d.this;
            dVar.f48555n = Typeface.create(typeface, dVar.f48544c);
            C19100d dVar2 = C19100d.this;
            dVar2.f48554m = true;
            this.f48556a.mo41362t(dVar2.f48555n, false);
        }
    }

    public C19100d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C13411l.TextAppearance);
        this.f48552k = obtainStyledAttributes.getDimension(C13411l.TextAppearance_android_textSize, BitmapDescriptorFactory.HUE_RED);
        this.f48551j = C19099c.m46247a(context, obtainStyledAttributes, C13411l.TextAppearance_android_textColor);
        C19099c.m46247a(context, obtainStyledAttributes, C13411l.TextAppearance_android_textColorHint);
        C19099c.m46247a(context, obtainStyledAttributes, C13411l.TextAppearance_android_textColorLink);
        this.f48544c = obtainStyledAttributes.getInt(C13411l.TextAppearance_android_textStyle, 0);
        this.f48545d = obtainStyledAttributes.getInt(C13411l.TextAppearance_android_typeface, 1);
        int i2 = C13411l.TextAppearance_fontFamily;
        i2 = !obtainStyledAttributes.hasValue(i2) ? C13411l.TextAppearance_android_fontFamily : i2;
        this.f48553l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f48543b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(C13411l.TextAppearance_textAllCaps, false);
        this.f48542a = C19099c.m46247a(context, obtainStyledAttributes, C13411l.TextAppearance_android_shadowColor);
        this.f48546e = obtainStyledAttributes.getFloat(C13411l.TextAppearance_android_shadowDx, BitmapDescriptorFactory.HUE_RED);
        this.f48547f = obtainStyledAttributes.getFloat(C13411l.TextAppearance_android_shadowDy, BitmapDescriptorFactory.HUE_RED);
        this.f48548g = obtainStyledAttributes.getFloat(C13411l.TextAppearance_android_shadowRadius, BitmapDescriptorFactory.HUE_RED);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C13411l.MaterialTextAppearance);
        int i3 = C13411l.MaterialTextAppearance_android_letterSpacing;
        this.f48549h = obtainStyledAttributes2.hasValue(i3);
        this.f48550i = obtainStyledAttributes2.getFloat(i3, BitmapDescriptorFactory.HUE_RED);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: a */
    public final void mo51527a() {
        String str;
        if (this.f48555n == null && (str = this.f48543b) != null) {
            this.f48555n = Typeface.create(str, this.f48544c);
        }
        if (this.f48555n == null) {
            int i = this.f48545d;
            if (i == 1) {
                this.f48555n = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f48555n = Typeface.SERIF;
            } else if (i != 3) {
                this.f48555n = Typeface.DEFAULT;
            } else {
                this.f48555n = Typeface.MONOSPACE;
            }
            this.f48555n = Typeface.create(this.f48555n, this.f48544c);
        }
    }

    /* renamed from: b */
    public final Typeface mo51528b(Context context) {
        Typeface typeface;
        if (this.f48554m) {
            return this.f48555n;
        }
        if (!context.isRestricted()) {
            try {
                int i = this.f48553l;
                ThreadLocal<TypedValue> threadLocal = C5247f.f17365a;
                if (context.isRestricted()) {
                    typeface = null;
                } else {
                    typeface = C5247f.m13263b(context, i, new TypedValue(), 0, (C5247f.C5252e) null, false, false);
                }
                this.f48555n = typeface;
                if (typeface != null) {
                    this.f48555n = Typeface.create(typeface, this.f48544c);
                }
            } catch (Resources.NotFoundException | Exception | UnsupportedOperationException unused) {
            }
        }
        mo51527a();
        this.f48554m = true;
        return this.f48555n;
    }

    /* renamed from: c */
    public final void mo51529c(Context context, C21211f fVar) {
        if (mo51530d(context)) {
            mo51528b(context);
        } else {
            mo51527a();
        }
        int i = this.f48553l;
        if (i == 0) {
            this.f48554m = true;
        }
        if (this.f48554m) {
            fVar.mo41362t(this.f48555n, true);
            return;
        }
        try {
            C19101a aVar = new C19101a(fVar);
            ThreadLocal<TypedValue> threadLocal = C5247f.f17365a;
            if (context.isRestricted()) {
                aVar.mo21012a(-4);
                return;
            }
            C5247f.m13263b(context, i, new TypedValue(), 0, aVar, false, false);
        } catch (Resources.NotFoundException unused) {
            this.f48554m = true;
            fVar.mo41361s(1);
        } catch (Exception unused2) {
            this.f48554m = true;
            fVar.mo41361s(-3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo51530d(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = r7.f48553l
            if (r1 == 0) goto L_0x001c
            java.lang.ThreadLocal<android.util.TypedValue> r0 = p116i1.C5247f.f17365a
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L_0x000d
            goto L_0x001c
        L_0x000d:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r0 = r8
            android.graphics.Typeface r8 = p116i1.C5247f.m13263b(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x001d
        L_0x001c:
            r8 = 0
        L_0x001d:
            if (r8 == 0) goto L_0x0021
            r8 = 1
            goto L_0x0022
        L_0x0021:
            r8 = 0
        L_0x0022:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p742qc.C19100d.mo51530d(android.content.Context):boolean");
    }

    /* renamed from: e */
    public final void mo51531e(Context context, TextPaint textPaint, C21211f fVar) {
        int i;
        int i2;
        mo51532f(context, textPaint, fVar);
        ColorStateList colorStateList = this.f48551j;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = this.f48548g;
        float f2 = this.f48546e;
        float f3 = this.f48547f;
        ColorStateList colorStateList2 = this.f48542a;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }

    /* renamed from: f */
    public final void mo51532f(Context context, TextPaint textPaint, C21211f fVar) {
        if (mo51530d(context)) {
            mo51533g(context, textPaint, mo51528b(context));
            return;
        }
        mo51527a();
        mo51533g(context, textPaint, this.f48555n);
        mo51529c(context, new C19102e(this, context, textPaint, fVar));
    }

    /* renamed from: g */
    public final void mo51533g(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z;
        float f;
        Typeface a = C19103f.m46263a(context.getResources().getConfiguration(), typeface);
        if (a != null) {
            typeface = a;
        }
        textPaint.setTypeface(typeface);
        int i = this.f48544c & (~typeface.getStyle());
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.f48552k);
        if (this.f48549h) {
            textPaint.setLetterSpacing(this.f48550i);
        }
    }
}
