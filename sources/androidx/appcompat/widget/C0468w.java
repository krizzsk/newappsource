package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.p014os.LocaleList;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import p114i.C5224j;
import p116i1.C5247f;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p280v1.C6838a;

/* renamed from: androidx.appcompat.widget.w */
public final class C0468w {

    /* renamed from: a */
    public final TextView f1632a;

    /* renamed from: b */
    public C0406f1 f1633b;

    /* renamed from: c */
    public C0406f1 f1634c;

    /* renamed from: d */
    public C0406f1 f1635d;

    /* renamed from: e */
    public C0406f1 f1636e;

    /* renamed from: f */
    public C0406f1 f1637f;

    /* renamed from: g */
    public C0406f1 f1638g;

    /* renamed from: h */
    public C0406f1 f1639h;

    /* renamed from: i */
    public final C0396e0 f1640i;

    /* renamed from: j */
    public int f1641j = 0;

    /* renamed from: k */
    public int f1642k = -1;

    /* renamed from: l */
    public Typeface f1643l;

    /* renamed from: m */
    public boolean f1644m;

    /* renamed from: androidx.appcompat.widget.w$a */
    public class C0469a extends C5247f.C5252e {

        /* renamed from: a */
        public final /* synthetic */ int f1645a;

        /* renamed from: b */
        public final /* synthetic */ int f1646b;

        /* renamed from: c */
        public final /* synthetic */ WeakReference f1647c;

        public C0469a(int i, int i2, WeakReference weakReference) {
            this.f1645a = i;
            this.f1646b = i2;
            this.f1647c = weakReference;
        }

        /* renamed from: c */
        public final void mo2199c(int i) {
        }

        /* renamed from: d */
        public final void mo2200d(Typeface typeface) {
            int i;
            boolean z;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f1645a) != -1) {
                if ((this.f1646b & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                typeface = C0474f.m1312a(typeface, i, z);
            }
            C0468w wVar = C0468w.this;
            WeakReference weakReference = this.f1647c;
            if (wVar.f1644m) {
                wVar.f1643l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                    if (C6333d0.C6340g.m15075b(textView)) {
                        textView.post(new C0477x(textView, typeface, wVar.f1641j));
                    } else {
                        textView.setTypeface(typeface, wVar.f1641j);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.w$b */
    public static class C0470b {
        /* renamed from: a */
        public static Drawable[] m1302a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        public static void m1303b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: c */
        public static void m1304c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* renamed from: androidx.appcompat.widget.w$c */
    public static class C0471c {
        /* renamed from: a */
        public static Locale m1305a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* renamed from: androidx.appcompat.widget.w$d */
    public static class C0472d {
        /* renamed from: a */
        public static LocaleList m1306a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        /* renamed from: b */
        public static void m1307b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* renamed from: androidx.appcompat.widget.w$e */
    public static class C0473e {
        /* renamed from: a */
        public static int m1308a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        /* renamed from: b */
        public static void m1309b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        /* renamed from: c */
        public static void m1310c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        /* renamed from: d */
        public static boolean m1311d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* renamed from: androidx.appcompat.widget.w$f */
    public static class C0474f {
        /* renamed from: a */
        public static Typeface m1312a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public C0468w(TextView textView) {
        this.f1632a = textView;
        this.f1640i = new C0396e0(textView);
    }

    /* renamed from: c */
    public static C0406f1 m1286c(Context context, C0407g gVar, int i) {
        ColorStateList i2;
        synchronized (gVar) {
            i2 = gVar.f1505a.mo2209i(i, context);
        }
        if (i2 == null) {
            return null;
        }
        C0406f1 f1Var = new C0406f1();
        f1Var.f1502d = true;
        f1Var.f1499a = i2;
        return f1Var;
    }

    /* renamed from: h */
    public static void m1287h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i;
        int i2;
        boolean z;
        int i3;
        CharSequence charSequence;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i4 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            text.getClass();
            if (i4 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            int i5 = editorInfo.initialSelStart;
            int i6 = editorInfo.initialSelEnd;
            if (i5 > i6) {
                i = i6 + 0;
            } else {
                i = i5 + 0;
            }
            if (i5 > i6) {
                i2 = i5 - 0;
            } else {
                i2 = i6 + 0;
            }
            int length = text.length();
            if (i < 0 || i2 > length) {
                C6838a.m16155c(editorInfo, (CharSequence) null, 0, 0);
                return;
            }
            int i7 = editorInfo.inputType & 4095;
            if (i7 == 129 || i7 == 225 || i7 == 18) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C6838a.m16155c(editorInfo, (CharSequence) null, 0, 0);
            } else if (length <= 2048) {
                C6838a.m16155c(editorInfo, text, i, i2);
            } else {
                int i8 = i2 - i;
                if (i8 > 1024) {
                    i3 = 0;
                } else {
                    i3 = i8;
                }
                int i9 = 2048 - i3;
                int min = Math.min(text.length() - i2, i9 - Math.min(i, (int) (((double) i9) * 0.8d)));
                int min2 = Math.min(i, i9 - min);
                int i11 = i - min2;
                if (Character.isLowSurrogate(text.charAt(i11))) {
                    i11++;
                    min2--;
                }
                if (Character.isHighSurrogate(text.charAt((i2 + min) - 1))) {
                    min--;
                }
                int i12 = min2 + i3 + min;
                if (i3 != i8) {
                    charSequence = TextUtils.concat(new CharSequence[]{text.subSequence(i11, i11 + min2), text.subSequence(i2, min + i2)});
                } else {
                    charSequence = text.subSequence(i11, i12 + i11);
                }
                int i13 = min2 + 0;
                C6838a.m16155c(editorInfo, charSequence, i13, i3 + i13);
            }
        }
    }

    /* renamed from: a */
    public final void mo2187a(Drawable drawable, C0406f1 f1Var) {
        if (drawable != null && f1Var != null) {
            C0407g.m1028e(drawable, f1Var, this.f1632a.getDrawableState());
        }
    }

    /* renamed from: b */
    public final void mo2188b() {
        if (!(this.f1633b == null && this.f1634c == null && this.f1635d == null && this.f1636e == null)) {
            Drawable[] compoundDrawables = this.f1632a.getCompoundDrawables();
            mo2187a(compoundDrawables[0], this.f1633b);
            mo2187a(compoundDrawables[1], this.f1634c);
            mo2187a(compoundDrawables[2], this.f1635d);
            mo2187a(compoundDrawables[3], this.f1636e);
        }
        if (this.f1637f != null || this.f1638g != null) {
            Drawable[] a = C0470b.m1302a(this.f1632a);
            mo2187a(a[0], this.f1637f);
            mo2187a(a[2], this.f1638g);
        }
    }

    /* renamed from: d */
    public final ColorStateList mo2189d() {
        C0406f1 f1Var = this.f1639h;
        if (f1Var != null) {
            return f1Var.f1499a;
        }
        return null;
    }

    /* renamed from: e */
    public final PorterDuff.Mode mo2190e() {
        C0406f1 f1Var = this.f1639h;
        if (f1Var != null) {
            return f1Var.f1500b;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0388 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0457  */
    /* JADX WARNING: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01d1  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2191f(android.util.AttributeSet r23, int r24) {
        /*
            r22 = this;
            r0 = r22
            r8 = r23
            r9 = r24
            android.widget.TextView r1 = r0.f1632a
            android.content.Context r10 = r1.getContext()
            androidx.appcompat.widget.g r11 = androidx.appcompat.widget.C0407g.m1025a()
            int[] r3 = p114i.C5224j.AppCompatTextHelper
            androidx.appcompat.widget.h1 r12 = androidx.appcompat.widget.C0413h1.m1063m(r10, r8, r3, r9)
            android.widget.TextView r1 = r0.f1632a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r12.f1515b
            r7 = 0
            r4 = r23
            r6 = r24
            p242s1.C6333d0.m15028p(r1, r2, r3, r4, r5, r6, r7)
            int r1 = p114i.C5224j.AppCompatTextHelper_android_textAppearance
            r13 = -1
            int r1 = r12.mo2095i(r1, r13)
            int r2 = p114i.C5224j.AppCompatTextHelper_android_drawableLeft
            boolean r3 = r12.mo2098l(r2)
            r14 = 0
            if (r3 == 0) goto L_0x0040
            int r2 = r12.mo2095i(r2, r14)
            androidx.appcompat.widget.f1 r2 = m1286c(r10, r11, r2)
            r0.f1633b = r2
        L_0x0040:
            int r2 = p114i.C5224j.AppCompatTextHelper_android_drawableTop
            boolean r3 = r12.mo2098l(r2)
            if (r3 == 0) goto L_0x0052
            int r2 = r12.mo2095i(r2, r14)
            androidx.appcompat.widget.f1 r2 = m1286c(r10, r11, r2)
            r0.f1634c = r2
        L_0x0052:
            int r2 = p114i.C5224j.AppCompatTextHelper_android_drawableRight
            boolean r3 = r12.mo2098l(r2)
            if (r3 == 0) goto L_0x0064
            int r2 = r12.mo2095i(r2, r14)
            androidx.appcompat.widget.f1 r2 = m1286c(r10, r11, r2)
            r0.f1635d = r2
        L_0x0064:
            int r2 = p114i.C5224j.AppCompatTextHelper_android_drawableBottom
            boolean r3 = r12.mo2098l(r2)
            if (r3 == 0) goto L_0x0076
            int r2 = r12.mo2095i(r2, r14)
            androidx.appcompat.widget.f1 r2 = m1286c(r10, r11, r2)
            r0.f1636e = r2
        L_0x0076:
            int r2 = android.os.Build.VERSION.SDK_INT
            int r3 = p114i.C5224j.AppCompatTextHelper_android_drawableStart
            boolean r4 = r12.mo2098l(r3)
            if (r4 == 0) goto L_0x008a
            int r3 = r12.mo2095i(r3, r14)
            androidx.appcompat.widget.f1 r3 = m1286c(r10, r11, r3)
            r0.f1637f = r3
        L_0x008a:
            int r3 = p114i.C5224j.AppCompatTextHelper_android_drawableEnd
            boolean r4 = r12.mo2098l(r3)
            if (r4 == 0) goto L_0x009c
            int r3 = r12.mo2095i(r3, r14)
            androidx.appcompat.widget.f1 r3 = m1286c(r10, r11, r3)
            r0.f1638g = r3
        L_0x009c:
            r12.mo2099n()
            android.widget.TextView r3 = r0.f1632a
            android.text.method.TransformationMethod r3 = r3.getTransformationMethod()
            boolean r3 = r3 instanceof android.text.method.PasswordTransformationMethod
            r4 = 23
            r5 = 26
            if (r1 == r13) goto L_0x011f
            int[] r6 = p114i.C5224j.TextAppearance
            androidx.appcompat.widget.h1 r7 = new androidx.appcompat.widget.h1
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r1, r6)
            r7.<init>(r10, r1)
            if (r3 != 0) goto L_0x00c8
            int r1 = p114i.C5224j.TextAppearance_textAllCaps
            boolean r6 = r7.mo2098l(r1)
            if (r6 == 0) goto L_0x00c8
            boolean r1 = r7.mo2087a(r1, r14)
            r6 = 1
            goto L_0x00ca
        L_0x00c8:
            r1 = 0
            r6 = 0
        L_0x00ca:
            r0.mo2198n(r10, r7)
            if (r2 >= r4) goto L_0x00fa
            int r15 = p114i.C5224j.TextAppearance_android_textColor
            boolean r16 = r7.mo2098l(r15)
            if (r16 == 0) goto L_0x00dc
            android.content.res.ColorStateList r15 = r7.mo2088b(r15)
            goto L_0x00dd
        L_0x00dc:
            r15 = 0
        L_0x00dd:
            int r12 = p114i.C5224j.TextAppearance_android_textColorHint
            boolean r17 = r7.mo2098l(r12)
            if (r17 == 0) goto L_0x00ea
            android.content.res.ColorStateList r12 = r7.mo2088b(r12)
            goto L_0x00eb
        L_0x00ea:
            r12 = 0
        L_0x00eb:
            int r13 = p114i.C5224j.TextAppearance_android_textColorLink
            boolean r18 = r7.mo2098l(r13)
            if (r18 == 0) goto L_0x00f8
            android.content.res.ColorStateList r13 = r7.mo2088b(r13)
            goto L_0x00fd
        L_0x00f8:
            r13 = 0
            goto L_0x00fd
        L_0x00fa:
            r12 = 0
            r13 = 0
            r15 = 0
        L_0x00fd:
            int r4 = p114i.C5224j.TextAppearance_textLocale
            boolean r19 = r7.mo2098l(r4)
            if (r19 == 0) goto L_0x010a
            java.lang.String r4 = r7.mo2096j(r4)
            goto L_0x010b
        L_0x010a:
            r4 = 0
        L_0x010b:
            if (r2 < r5) goto L_0x011a
            int r5 = p114i.C5224j.TextAppearance_fontVariationSettings
            boolean r20 = r7.mo2098l(r5)
            if (r20 == 0) goto L_0x011a
            java.lang.String r5 = r7.mo2096j(r5)
            goto L_0x011b
        L_0x011a:
            r5 = 0
        L_0x011b:
            r7.mo2099n()
            goto L_0x0126
        L_0x011f:
            r1 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r12 = 0
            r13 = 0
            r15 = 0
        L_0x0126:
            int[] r7 = p114i.C5224j.TextAppearance
            r20 = r1
            androidx.appcompat.widget.h1 r1 = new androidx.appcompat.widget.h1
            android.content.res.TypedArray r7 = r10.obtainStyledAttributes(r8, r7, r9, r14)
            r1.<init>(r10, r7)
            if (r3 != 0) goto L_0x0143
            int r7 = p114i.C5224j.TextAppearance_textAllCaps
            boolean r21 = r1.mo2098l(r7)
            if (r21 == 0) goto L_0x0143
            boolean r6 = r1.mo2087a(r7, r14)
            r7 = 1
            goto L_0x0146
        L_0x0143:
            r7 = r6
            r6 = r20
        L_0x0146:
            r14 = 23
            if (r2 >= r14) goto L_0x016e
            int r14 = p114i.C5224j.TextAppearance_android_textColor
            boolean r20 = r1.mo2098l(r14)
            if (r20 == 0) goto L_0x0156
            android.content.res.ColorStateList r15 = r1.mo2088b(r14)
        L_0x0156:
            int r14 = p114i.C5224j.TextAppearance_android_textColorHint
            boolean r20 = r1.mo2098l(r14)
            if (r20 == 0) goto L_0x0162
            android.content.res.ColorStateList r12 = r1.mo2088b(r14)
        L_0x0162:
            int r14 = p114i.C5224j.TextAppearance_android_textColorLink
            boolean r20 = r1.mo2098l(r14)
            if (r20 == 0) goto L_0x016e
            android.content.res.ColorStateList r13 = r1.mo2088b(r14)
        L_0x016e:
            int r14 = p114i.C5224j.TextAppearance_textLocale
            boolean r20 = r1.mo2098l(r14)
            if (r20 == 0) goto L_0x017a
            java.lang.String r4 = r1.mo2096j(r14)
        L_0x017a:
            r14 = 26
            if (r2 < r14) goto L_0x018a
            int r14 = p114i.C5224j.TextAppearance_fontVariationSettings
            boolean r19 = r1.mo2098l(r14)
            if (r19 == 0) goto L_0x018a
            java.lang.String r5 = r1.mo2096j(r14)
        L_0x018a:
            r14 = 28
            if (r2 < r14) goto L_0x01a7
            int r14 = p114i.C5224j.TextAppearance_android_textSize
            boolean r19 = r1.mo2098l(r14)
            if (r19 == 0) goto L_0x01a7
            r19 = r11
            r11 = -1
            int r14 = r1.mo2090d(r14, r11)
            if (r14 != 0) goto L_0x01a9
            android.widget.TextView r11 = r0.f1632a
            r14 = 0
            r8 = 0
            r11.setTextSize(r8, r14)
            goto L_0x01a9
        L_0x01a7:
            r19 = r11
        L_0x01a9:
            r0.mo2198n(r10, r1)
            r1.mo2099n()
            if (r15 == 0) goto L_0x01b6
            android.widget.TextView r1 = r0.f1632a
            r1.setTextColor(r15)
        L_0x01b6:
            if (r12 == 0) goto L_0x01bd
            android.widget.TextView r1 = r0.f1632a
            r1.setHintTextColor(r12)
        L_0x01bd:
            if (r13 == 0) goto L_0x01c4
            android.widget.TextView r1 = r0.f1632a
            r1.setLinkTextColor(r13)
        L_0x01c4:
            if (r3 != 0) goto L_0x01cd
            if (r7 == 0) goto L_0x01cd
            android.widget.TextView r1 = r0.f1632a
            r1.setAllCaps(r6)
        L_0x01cd:
            android.graphics.Typeface r1 = r0.f1643l
            if (r1 == 0) goto L_0x01e3
            int r3 = r0.f1642k
            r6 = -1
            if (r3 != r6) goto L_0x01de
            android.widget.TextView r3 = r0.f1632a
            int r6 = r0.f1641j
            r3.setTypeface(r1, r6)
            goto L_0x01e3
        L_0x01de:
            android.widget.TextView r3 = r0.f1632a
            r3.setTypeface(r1)
        L_0x01e3:
            if (r5 == 0) goto L_0x01ea
            android.widget.TextView r1 = r0.f1632a
            androidx.appcompat.widget.C0468w.C0473e.m1311d(r1, r5)
        L_0x01ea:
            r8 = 24
            if (r4 == 0) goto L_0x020d
            if (r2 < r8) goto L_0x01fa
            android.widget.TextView r1 = r0.f1632a
            android.os.LocaleList r2 = androidx.appcompat.widget.C0468w.C0472d.m1306a(r4)
            androidx.appcompat.widget.C0468w.C0472d.m1307b(r1, r2)
            goto L_0x020d
        L_0x01fa:
            java.lang.String r1 = ","
            java.lang.String[] r1 = r4.split(r1)
            r2 = 0
            r1 = r1[r2]
            android.widget.TextView r3 = r0.f1632a
            java.util.Locale r1 = androidx.appcompat.widget.C0468w.C0471c.m1305a(r1)
            androidx.appcompat.widget.C0468w.C0470b.m1304c(r3, r1)
            goto L_0x020e
        L_0x020d:
            r2 = 0
        L_0x020e:
            androidx.appcompat.widget.e0 r11 = r0.f1640i
            android.content.Context r1 = r11.f1490j
            int[] r3 = p114i.C5224j.AppCompatTextView
            r12 = r23
            android.content.res.TypedArray r13 = r1.obtainStyledAttributes(r12, r3, r9, r2)
            android.widget.TextView r1 = r11.f1489i
            android.content.Context r2 = r1.getContext()
            r7 = 0
            r4 = r23
            r5 = r13
            r6 = r24
            p242s1.C6333d0.m15028p(r1, r2, r3, r4, r5, r6, r7)
            int r1 = p114i.C5224j.AppCompatTextView_autoSizeTextType
            boolean r2 = r13.hasValue(r1)
            if (r2 == 0) goto L_0x0238
            r2 = 0
            int r1 = r13.getInt(r1, r2)
            r11.f1481a = r1
        L_0x0238:
            int r1 = p114i.C5224j.AppCompatTextView_autoSizeStepGranularity
            boolean r2 = r13.hasValue(r1)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L_0x0247
            float r1 = r13.getDimension(r1, r3)
            goto L_0x0249
        L_0x0247:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0249:
            int r2 = p114i.C5224j.AppCompatTextView_autoSizeMinTextSize
            boolean r4 = r13.hasValue(r2)
            if (r4 == 0) goto L_0x0256
            float r2 = r13.getDimension(r2, r3)
            goto L_0x0258
        L_0x0256:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0258:
            int r4 = p114i.C5224j.AppCompatTextView_autoSizeMaxTextSize
            boolean r5 = r13.hasValue(r4)
            if (r5 == 0) goto L_0x0265
            float r4 = r13.getDimension(r4, r3)
            goto L_0x0267
        L_0x0265:
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0267:
            int r5 = p114i.C5224j.AppCompatTextView_autoSizePresetSizes
            boolean r6 = r13.hasValue(r5)
            if (r6 == 0) goto L_0x029f
            r6 = 0
            int r5 = r13.getResourceId(r5, r6)
            if (r5 <= 0) goto L_0x029f
            android.content.res.Resources r6 = r13.getResources()
            android.content.res.TypedArray r5 = r6.obtainTypedArray(r5)
            int r6 = r5.length()
            int[] r7 = new int[r6]
            if (r6 <= 0) goto L_0x029c
            r9 = 0
        L_0x0287:
            if (r9 >= r6) goto L_0x0293
            r14 = -1
            int r15 = r5.getDimensionPixelSize(r9, r14)
            r7[r9] = r15
            int r9 = r9 + 1
            goto L_0x0287
        L_0x0293:
            int[] r6 = androidx.appcompat.widget.C0396e0.m993b(r7)
            r11.f1486f = r6
            r11.mo2070g()
        L_0x029c:
            r5.recycle()
        L_0x029f:
            r13.recycle()
            boolean r5 = r11.mo2071h()
            r6 = 2
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L_0x02df
            int r5 = r11.f1481a
            r9 = 1
            if (r5 != r9) goto L_0x02e2
            boolean r5 = r11.f1487g
            if (r5 != 0) goto L_0x02db
            android.content.Context r5 = r11.f1490j
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r9 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r9 != 0) goto L_0x02c8
            r2 = 1094713344(0x41400000, float:12.0)
            float r2 = android.util.TypedValue.applyDimension(r6, r2, r5)
        L_0x02c8:
            int r9 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r9 != 0) goto L_0x02d2
            r4 = 1121976320(0x42e00000, float:112.0)
            float r4 = android.util.TypedValue.applyDimension(r6, r4, r5)
        L_0x02d2:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x02d8
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x02d8:
            r11.mo2072i(r2, r4, r1)
        L_0x02db:
            r11.mo2069f()
            goto L_0x02e2
        L_0x02df:
            r1 = 0
            r11.f1481a = r1
        L_0x02e2:
            boolean r1 = androidx.core.widget.C0785b.f3418V
            if (r1 == 0) goto L_0x0321
            androidx.appcompat.widget.e0 r1 = r0.f1640i
            int r2 = r1.f1481a
            if (r2 == 0) goto L_0x0321
            int[] r1 = r1.f1486f
            int r2 = r1.length
            if (r2 <= 0) goto L_0x0321
            android.widget.TextView r2 = r0.f1632a
            int r2 = androidx.appcompat.widget.C0468w.C0473e.m1308a(r2)
            float r2 = (float) r2
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x031b
            android.widget.TextView r1 = r0.f1632a
            androidx.appcompat.widget.e0 r2 = r0.f1640i
            float r2 = r2.f1484d
            int r2 = java.lang.Math.round(r2)
            androidx.appcompat.widget.e0 r3 = r0.f1640i
            float r3 = r3.f1485e
            int r3 = java.lang.Math.round(r3)
            androidx.appcompat.widget.e0 r4 = r0.f1640i
            float r4 = r4.f1483c
            int r4 = java.lang.Math.round(r4)
            r5 = 0
            androidx.appcompat.widget.C0468w.C0473e.m1309b(r1, r2, r3, r4, r5)
            goto L_0x0321
        L_0x031b:
            r5 = 0
            android.widget.TextView r2 = r0.f1632a
            androidx.appcompat.widget.C0468w.C0473e.m1310c(r2, r1, r5)
        L_0x0321:
            int[] r1 = p114i.C5224j.AppCompatTextView
            androidx.appcompat.widget.h1 r2 = new androidx.appcompat.widget.h1
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r12, r1)
            r2.<init>(r10, r1)
            int r1 = p114i.C5224j.AppCompatTextView_drawableLeftCompat
            r3 = -1
            int r1 = r2.mo2095i(r1, r3)
            if (r1 == r3) goto L_0x033c
            r4 = r19
            android.graphics.drawable.Drawable r1 = r4.mo2077b(r10, r1)
            goto L_0x033f
        L_0x033c:
            r4 = r19
            r1 = 0
        L_0x033f:
            int r5 = p114i.C5224j.AppCompatTextView_drawableTopCompat
            int r5 = r2.mo2095i(r5, r3)
            if (r5 == r3) goto L_0x034c
            android.graphics.drawable.Drawable r5 = r4.mo2077b(r10, r5)
            goto L_0x034d
        L_0x034c:
            r5 = 0
        L_0x034d:
            int r9 = p114i.C5224j.AppCompatTextView_drawableRightCompat
            int r9 = r2.mo2095i(r9, r3)
            if (r9 == r3) goto L_0x035a
            android.graphics.drawable.Drawable r9 = r4.mo2077b(r10, r9)
            goto L_0x035b
        L_0x035a:
            r9 = 0
        L_0x035b:
            int r11 = p114i.C5224j.AppCompatTextView_drawableBottomCompat
            int r11 = r2.mo2095i(r11, r3)
            if (r11 == r3) goto L_0x0368
            android.graphics.drawable.Drawable r11 = r4.mo2077b(r10, r11)
            goto L_0x0369
        L_0x0368:
            r11 = 0
        L_0x0369:
            int r12 = p114i.C5224j.AppCompatTextView_drawableStartCompat
            int r12 = r2.mo2095i(r12, r3)
            if (r12 == r3) goto L_0x0376
            android.graphics.drawable.Drawable r12 = r4.mo2077b(r10, r12)
            goto L_0x0377
        L_0x0376:
            r12 = 0
        L_0x0377:
            int r13 = p114i.C5224j.AppCompatTextView_drawableEndCompat
            int r13 = r2.mo2095i(r13, r3)
            if (r13 == r3) goto L_0x0384
            android.graphics.drawable.Drawable r3 = r4.mo2077b(r10, r13)
            goto L_0x0385
        L_0x0384:
            r3 = 0
        L_0x0385:
            r4 = 3
            if (r12 != 0) goto L_0x03d7
            if (r3 == 0) goto L_0x038b
            goto L_0x03d7
        L_0x038b:
            if (r1 != 0) goto L_0x0393
            if (r5 != 0) goto L_0x0393
            if (r9 != 0) goto L_0x0393
            if (r11 == 0) goto L_0x03f8
        L_0x0393:
            android.widget.TextView r3 = r0.f1632a
            android.graphics.drawable.Drawable[] r3 = androidx.appcompat.widget.C0468w.C0470b.m1302a(r3)
            r10 = 0
            r12 = r3[r10]
            if (r12 != 0) goto L_0x03c4
            r13 = r3[r6]
            if (r13 == 0) goto L_0x03a3
            goto L_0x03c4
        L_0x03a3:
            android.widget.TextView r3 = r0.f1632a
            android.graphics.drawable.Drawable[] r3 = r3.getCompoundDrawables()
            android.widget.TextView r12 = r0.f1632a
            if (r1 == 0) goto L_0x03ae
            goto L_0x03b0
        L_0x03ae:
            r1 = r3[r10]
        L_0x03b0:
            if (r5 == 0) goto L_0x03b3
            goto L_0x03b6
        L_0x03b3:
            r5 = 1
            r5 = r3[r5]
        L_0x03b6:
            if (r9 == 0) goto L_0x03b9
            goto L_0x03bb
        L_0x03b9:
            r9 = r3[r6]
        L_0x03bb:
            if (r11 == 0) goto L_0x03be
            goto L_0x03c0
        L_0x03be:
            r11 = r3[r4]
        L_0x03c0:
            r12.setCompoundDrawablesWithIntrinsicBounds(r1, r5, r9, r11)
            goto L_0x03f8
        L_0x03c4:
            android.widget.TextView r1 = r0.f1632a
            if (r5 == 0) goto L_0x03c9
            goto L_0x03cc
        L_0x03c9:
            r5 = 1
            r5 = r3[r5]
        L_0x03cc:
            r6 = r3[r6]
            if (r11 == 0) goto L_0x03d1
            goto L_0x03d3
        L_0x03d1:
            r11 = r3[r4]
        L_0x03d3:
            androidx.appcompat.widget.C0468w.C0470b.m1303b(r1, r12, r5, r6, r11)
            goto L_0x03f8
        L_0x03d7:
            android.widget.TextView r1 = r0.f1632a
            android.graphics.drawable.Drawable[] r1 = androidx.appcompat.widget.C0468w.C0470b.m1302a(r1)
            android.widget.TextView r9 = r0.f1632a
            if (r12 == 0) goto L_0x03e2
            goto L_0x03e5
        L_0x03e2:
            r10 = 0
            r12 = r1[r10]
        L_0x03e5:
            if (r5 == 0) goto L_0x03e8
            goto L_0x03eb
        L_0x03e8:
            r5 = 1
            r5 = r1[r5]
        L_0x03eb:
            if (r3 == 0) goto L_0x03ee
            goto L_0x03f0
        L_0x03ee:
            r3 = r1[r6]
        L_0x03f0:
            if (r11 == 0) goto L_0x03f3
            goto L_0x03f5
        L_0x03f3:
            r11 = r1[r4]
        L_0x03f5:
            androidx.appcompat.widget.C0468w.C0470b.m1303b(r9, r12, r5, r3, r11)
        L_0x03f8:
            int r1 = p114i.C5224j.AppCompatTextView_drawableTint
            boolean r3 = r2.mo2098l(r1)
            if (r3 == 0) goto L_0x0409
            android.content.res.ColorStateList r1 = r2.mo2088b(r1)
            android.widget.TextView r3 = r0.f1632a
            androidx.core.widget.C0801k.m2420b(r3, r1)
        L_0x0409:
            int r1 = p114i.C5224j.AppCompatTextView_drawableTintMode
            boolean r3 = r2.mo2098l(r1)
            if (r3 == 0) goto L_0x0431
            r3 = -1
            int r1 = r2.mo2094h(r1, r3)
            r3 = 0
            android.graphics.PorterDuff$Mode r1 = androidx.appcompat.widget.C0418j0.m1109c(r1, r3)
            android.widget.TextView r3 = r0.f1632a
            r3.getClass()
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r8) goto L_0x0428
            androidx.core.widget.C0801k.C0804c.m2444g(r3, r1)
            goto L_0x0431
        L_0x0428:
            boolean r4 = r3 instanceof androidx.core.widget.C0812p
            if (r4 == 0) goto L_0x0431
            androidx.core.widget.p r3 = (androidx.core.widget.C0812p) r3
            r3.setSupportCompoundDrawablesTintMode(r1)
        L_0x0431:
            int r1 = p114i.C5224j.AppCompatTextView_firstBaselineToTopHeight
            r3 = -1
            int r1 = r2.mo2090d(r1, r3)
            int r4 = p114i.C5224j.AppCompatTextView_lastBaselineToBottomHeight
            int r4 = r2.mo2090d(r4, r3)
            int r5 = p114i.C5224j.AppCompatTextView_lineHeight
            int r5 = r2.mo2090d(r5, r3)
            r2.mo2099n()
            if (r1 == r3) goto L_0x044e
            android.widget.TextView r2 = r0.f1632a
            androidx.core.widget.C0801k.m2421c(r2, r1)
        L_0x044e:
            if (r4 == r3) goto L_0x0455
            android.widget.TextView r1 = r0.f1632a
            androidx.core.widget.C0801k.m2422d(r1, r4)
        L_0x0455:
            if (r5 == r3) goto L_0x046c
            android.widget.TextView r1 = r0.f1632a
            mf0.C24361g.m61181q(r5)
            android.text.TextPaint r2 = r1.getPaint()
            r3 = 0
            int r2 = r2.getFontMetricsInt(r3)
            if (r5 == r2) goto L_0x046c
            int r5 = r5 - r2
            float r2 = (float) r5
            r1.setLineSpacing(r2, r7)
        L_0x046c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0468w.mo2191f(android.util.AttributeSet, int):void");
    }

    /* renamed from: g */
    public final void mo2192g(int i, Context context) {
        String j;
        ColorStateList b;
        ColorStateList b2;
        ColorStateList b3;
        C0413h1 h1Var = new C0413h1(context, context.obtainStyledAttributes(i, C5224j.TextAppearance));
        int i2 = C5224j.TextAppearance_textAllCaps;
        if (h1Var.mo2098l(i2)) {
            this.f1632a.setAllCaps(h1Var.mo2087a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = C5224j.TextAppearance_android_textColor;
            if (h1Var.mo2098l(i4) && (b3 = h1Var.mo2088b(i4)) != null) {
                this.f1632a.setTextColor(b3);
            }
            int i5 = C5224j.TextAppearance_android_textColorLink;
            if (h1Var.mo2098l(i5) && (b2 = h1Var.mo2088b(i5)) != null) {
                this.f1632a.setLinkTextColor(b2);
            }
            int i6 = C5224j.TextAppearance_android_textColorHint;
            if (h1Var.mo2098l(i6) && (b = h1Var.mo2088b(i6)) != null) {
                this.f1632a.setHintTextColor(b);
            }
        }
        int i7 = C5224j.TextAppearance_android_textSize;
        if (h1Var.mo2098l(i7) && h1Var.mo2090d(i7, -1) == 0) {
            this.f1632a.setTextSize(0, BitmapDescriptorFactory.HUE_RED);
        }
        mo2198n(context, h1Var);
        if (i3 >= 26) {
            int i8 = C5224j.TextAppearance_fontVariationSettings;
            if (h1Var.mo2098l(i8) && (j = h1Var.mo2096j(i8)) != null) {
                C0473e.m1311d(this.f1632a, j);
            }
        }
        h1Var.mo2099n();
        Typeface typeface = this.f1643l;
        if (typeface != null) {
            this.f1632a.setTypeface(typeface, this.f1641j);
        }
    }

    /* renamed from: i */
    public final void mo2193i(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        C0396e0 e0Var = this.f1640i;
        if (e0Var.mo2071h()) {
            DisplayMetrics displayMetrics = e0Var.f1490j.getResources().getDisplayMetrics();
            e0Var.mo2072i(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (e0Var.mo2069f()) {
                e0Var.mo2066a();
            }
        }
    }

    /* renamed from: j */
    public final void mo2194j(int[] iArr, int i) throws IllegalArgumentException {
        C0396e0 e0Var = this.f1640i;
        if (e0Var.mo2071h()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = e0Var.f1490j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                e0Var.f1486f = C0396e0.m993b(iArr2);
                if (!e0Var.mo2070g()) {
                    StringBuilder k = C13555b.m33972k("None of the preset sizes is valid: ");
                    k.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(k.toString());
                }
            } else {
                e0Var.f1487g = false;
            }
            if (e0Var.mo2069f()) {
                e0Var.mo2066a();
            }
        }
    }

    /* renamed from: k */
    public final void mo2195k(int i) {
        C0396e0 e0Var = this.f1640i;
        if (!e0Var.mo2071h()) {
            return;
        }
        if (i == 0) {
            e0Var.f1481a = 0;
            e0Var.f1484d = -1.0f;
            e0Var.f1485e = -1.0f;
            e0Var.f1483c = -1.0f;
            e0Var.f1486f = new int[0];
            e0Var.f1482b = false;
        } else if (i == 1) {
            DisplayMetrics displayMetrics = e0Var.f1490j.getResources().getDisplayMetrics();
            e0Var.mo2072i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (e0Var.mo2069f()) {
                e0Var.mo2066a();
            }
        } else {
            throw new IllegalArgumentException(C16759e.m42349e("Unknown auto-size text type: ", i));
        }
    }

    /* renamed from: l */
    public final void mo2196l(ColorStateList colorStateList) {
        boolean z;
        if (this.f1639h == null) {
            this.f1639h = new C0406f1();
        }
        C0406f1 f1Var = this.f1639h;
        f1Var.f1499a = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        f1Var.f1502d = z;
        this.f1633b = f1Var;
        this.f1634c = f1Var;
        this.f1635d = f1Var;
        this.f1636e = f1Var;
        this.f1637f = f1Var;
        this.f1638g = f1Var;
    }

    /* renamed from: m */
    public final void mo2197m(PorterDuff.Mode mode) {
        boolean z;
        if (this.f1639h == null) {
            this.f1639h = new C0406f1();
        }
        C0406f1 f1Var = this.f1639h;
        f1Var.f1500b = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        f1Var.f1501c = z;
        this.f1633b = f1Var;
        this.f1634c = f1Var;
        this.f1635d = f1Var;
        this.f1636e = f1Var;
        this.f1637f = f1Var;
        this.f1638g = f1Var;
    }

    /* renamed from: n */
    public final void mo2198n(Context context, C0413h1 h1Var) {
        String j;
        boolean z;
        boolean z2;
        this.f1641j = h1Var.mo2094h(C5224j.TextAppearance_android_textStyle, this.f1641j);
        int i = Build.VERSION.SDK_INT;
        boolean z3 = false;
        if (i >= 28) {
            int h = h1Var.mo2094h(C5224j.TextAppearance_android_textFontWeight, -1);
            this.f1642k = h;
            if (h != -1) {
                this.f1641j = (this.f1641j & 2) | 0;
            }
        }
        int i2 = C5224j.TextAppearance_android_fontFamily;
        if (h1Var.mo2098l(i2) || h1Var.mo2098l(C5224j.TextAppearance_fontFamily)) {
            this.f1643l = null;
            int i3 = C5224j.TextAppearance_fontFamily;
            if (h1Var.mo2098l(i3)) {
                i2 = i3;
            }
            int i4 = this.f1642k;
            int i5 = this.f1641j;
            if (!context.isRestricted()) {
                try {
                    Typeface g = h1Var.mo2093g(i2, this.f1641j, new C0469a(i4, i5, new WeakReference(this.f1632a)));
                    if (g != null) {
                        if (i < 28 || this.f1642k == -1) {
                            this.f1643l = g;
                        } else {
                            Typeface create = Typeface.create(g, 0);
                            int i6 = this.f1642k;
                            if ((this.f1641j & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.f1643l = C0474f.m1312a(create, i6, z2);
                        }
                    }
                    if (this.f1643l == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f1644m = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1643l == null && (j = h1Var.mo2096j(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f1642k == -1) {
                    this.f1643l = Typeface.create(j, this.f1641j);
                    return;
                }
                Typeface create2 = Typeface.create(j, 0);
                int i7 = this.f1642k;
                if ((this.f1641j & 2) != 0) {
                    z3 = true;
                }
                this.f1643l = C0474f.m1312a(create2, i7, z3);
                return;
            }
            return;
        }
        int i8 = C5224j.TextAppearance_android_typeface;
        if (h1Var.mo2098l(i8)) {
            this.f1644m = false;
            int h2 = h1Var.mo2094h(i8, 1);
            if (h2 == 1) {
                this.f1643l = Typeface.SANS_SERIF;
            } else if (h2 == 2) {
                this.f1643l = Typeface.SERIF;
            } else if (h2 == 3) {
                this.f1643l = Typeface.MONOSPACE;
            }
        }
    }
}
