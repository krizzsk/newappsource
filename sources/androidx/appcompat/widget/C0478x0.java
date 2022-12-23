package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0407g;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p004a3.C0051c;
import p004a3.C0059g;
import p114i.C5218d;
import p114i.C5219e;
import p139k.C5430a;
import p152l.C5547b;
import p241s0.C6305e;
import p241s0.C6306f;
import p241s0.C6313h;
import p241s0.C6314i;

/* renamed from: androidx.appcompat.widget.x0 */
public final class C0478x0 {

    /* renamed from: h */
    public static final PorterDuff.Mode f1657h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i */
    public static C0478x0 f1658i;

    /* renamed from: j */
    public static final C0481c f1659j = new C0481c();

    /* renamed from: a */
    public WeakHashMap<Context, C6314i<ColorStateList>> f1660a;

    /* renamed from: b */
    public C6313h<String, C0483e> f1661b;

    /* renamed from: c */
    public C6314i<String> f1662c;

    /* renamed from: d */
    public final WeakHashMap<Context, C6305e<WeakReference<Drawable.ConstantState>>> f1663d = new WeakHashMap<>(0);

    /* renamed from: e */
    public TypedValue f1664e;

    /* renamed from: f */
    public boolean f1665f;

    /* renamed from: g */
    public C0484f f1666g;

    /* renamed from: androidx.appcompat.widget.x0$a */
    public static class C0479a implements C0483e {
        /* renamed from: a */
        public final Drawable mo2211a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C5430a.m13566g(context, theme, context.getResources(), attributeSet, xmlResourceParser);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.x0$b */
    public static class C0480b implements C0483e {
        /* renamed from: a */
        public final Drawable mo2211a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                C0051c cVar = new C0051c(context);
                cVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                return cVar;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.x0$c */
    public static class C0481c extends C6306f<Integer, PorterDuffColorFilter> {
        public C0481c() {
            super(6);
        }
    }

    /* renamed from: androidx.appcompat.widget.x0$d */
    public static class C0482d implements C0483e {
        /* renamed from: a */
        public final Drawable mo2211a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute == null) {
                return null;
            }
            try {
                Drawable drawable = (Drawable) C0482d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                C5547b.m13763c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                return drawable;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.x0$e */
    public interface C0483e {
        /* renamed from: a */
        Drawable mo2211a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.x0$f */
    public interface C0484f {
    }

    /* renamed from: androidx.appcompat.widget.x0$g */
    public static class C0485g implements C0483e {
        /* renamed from: a */
        public final Drawable mo2211a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                C0059g gVar = new C0059g();
                gVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                return gVar;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: d */
    public static synchronized C0478x0 m1313d() {
        C0478x0 x0Var;
        synchronized (C0478x0.class) {
            if (f1658i == null) {
                C0478x0 x0Var2 = new C0478x0();
                f1658i = x0Var2;
                m1315j(x0Var2);
            }
            x0Var = f1658i;
        }
        return x0Var;
    }

    /* renamed from: h */
    public static synchronized PorterDuffColorFilter m1314h(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C0478x0.class) {
            C0481c cVar = f1659j;
            cVar.getClass();
            int i2 = (i + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) cVar.get(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) cVar.put(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* renamed from: j */
    public static void m1315j(C0478x0 x0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            x0Var.mo2203a("vector", new C0485g());
            x0Var.mo2203a("animated-vector", new C0480b());
            x0Var.mo2203a("animated-selector", new C0479a());
            x0Var.mo2203a("drawable", new C0482d());
        }
    }

    /* renamed from: a */
    public final void mo2203a(String str, C0483e eVar) {
        if (this.f1661b == null) {
            this.f1661b = new C6313h<>();
        }
        this.f1661b.put(str, eVar);
    }

    /* renamed from: b */
    public final synchronized void mo2204b(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C6305e eVar = this.f1663d.get(context);
            if (eVar == null) {
                eVar = new C6305e();
                this.f1663d.put(context, eVar);
            }
            eVar.mo22331k(j, new WeakReference(constantState));
        }
    }

    /* renamed from: c */
    public final Drawable mo2205c(int i, Context context) {
        if (this.f1664e == null) {
            this.f1664e = new TypedValue();
        }
        TypedValue typedValue = this.f1664e;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable e = mo2206e(context, j);
        if (e != null) {
            return e;
        }
        LayerDrawable layerDrawable = null;
        if (this.f1666g != null) {
            if (i == C5219e.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{mo2207f(context, C5219e.abc_cab_background_internal_bg), mo2207f(context, C5219e.abc_cab_background_top_mtrl_alpha)});
            } else if (i == C5219e.abc_ratingbar_material) {
                layerDrawable = C0407g.C0408a.m1032c(this, context, C5218d.abc_star_big);
            } else if (i == C5219e.abc_ratingbar_indicator_material) {
                layerDrawable = C0407g.C0408a.m1032c(this, context, C5218d.abc_star_medium);
            } else if (i == C5219e.abc_ratingbar_small_material) {
                layerDrawable = C0407g.C0408a.m1032c(this, context, C5218d.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            mo2204b(context, j, layerDrawable);
        }
        return layerDrawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable mo2206e(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, s0.e<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1663d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            s0.e r0 = (p241s0.C6305e) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo22329i(r5, r1)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo22332l(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0478x0.mo2206e(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: f */
    public final synchronized Drawable mo2207f(Context context, int i) {
        return mo2208g(context, i, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.graphics.PorterDuff$Mode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: android.graphics.PorterDuff$Mode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: android.graphics.PorterDuff$Mode} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r0 == false) goto L_0x019c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a5 A[Catch:{ Exception -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d0 A[Catch:{ Exception -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e3 A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e9 A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ef A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0189 A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0197 A[Catch:{ all -> 0x00cb }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable mo2208g(android.content.Context r13, int r14, boolean r15) {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.f1665f     // Catch:{ all -> 0x00cb }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0008
            goto L_0x002c
        L_0x0008:
            r12.f1665f = r2     // Catch:{ all -> 0x00cb }
            int r0 = p152l.C5548c.abc_vector_test     // Catch:{ all -> 0x00cb }
            android.graphics.drawable.Drawable r0 = r12.mo2207f(r13, r0)     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x019c
            boolean r3 = r0 instanceof p004a3.C0059g     // Catch:{ all -> 0x00cb }
            if (r3 != 0) goto L_0x0029
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x00cb }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r0 = 0
            goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            if (r0 == 0) goto L_0x019c
        L_0x002c:
            s0.h<java.lang.String, androidx.appcompat.widget.x0$e> r0 = r12.f1661b     // Catch:{ all -> 0x00cb }
            r3 = 0
            if (r0 == 0) goto L_0x00e0
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00cb }
            if (r0 != 0) goto L_0x00e0
            s0.i<java.lang.String> r0 = r12.f1662c     // Catch:{ all -> 0x00cb }
            java.lang.String r4 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = r0.mo22434g(r14, r3)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00cb }
            boolean r5 = r4.equals(r0)     // Catch:{ all -> 0x00cb }
            if (r5 != 0) goto L_0x00e0
            if (r0 == 0) goto L_0x005c
            s0.h<java.lang.String, androidx.appcompat.widget.x0$e> r5 = r12.f1661b     // Catch:{ all -> 0x00cb }
            java.lang.Object r0 = r5.getOrDefault(r0, r3)     // Catch:{ all -> 0x00cb }
            if (r0 != 0) goto L_0x005c
            goto L_0x00e0
        L_0x0055:
            s0.i r0 = new s0.i     // Catch:{ all -> 0x00cb }
            r0.<init>()     // Catch:{ all -> 0x00cb }
            r12.f1662c = r0     // Catch:{ all -> 0x00cb }
        L_0x005c:
            android.util.TypedValue r0 = r12.f1664e     // Catch:{ all -> 0x00cb }
            if (r0 != 0) goto L_0x0067
            android.util.TypedValue r0 = new android.util.TypedValue     // Catch:{ all -> 0x00cb }
            r0.<init>()     // Catch:{ all -> 0x00cb }
            r12.f1664e = r0     // Catch:{ all -> 0x00cb }
        L_0x0067:
            android.util.TypedValue r0 = r12.f1664e     // Catch:{ all -> 0x00cb }
            android.content.res.Resources r5 = r13.getResources()     // Catch:{ all -> 0x00cb }
            r5.getValue(r14, r0, r2)     // Catch:{ all -> 0x00cb }
            int r6 = r0.assetCookie     // Catch:{ all -> 0x00cb }
            long r6 = (long) r6     // Catch:{ all -> 0x00cb }
            r8 = 32
            long r6 = r6 << r8
            int r8 = r0.data     // Catch:{ all -> 0x00cb }
            long r8 = (long) r8     // Catch:{ all -> 0x00cb }
            long r6 = r6 | r8
            android.graphics.drawable.Drawable r8 = r12.mo2206e(r13, r6)     // Catch:{ all -> 0x00cb }
            if (r8 == 0) goto L_0x0081
            goto L_0x00e1
        L_0x0081:
            java.lang.CharSequence r9 = r0.string     // Catch:{ all -> 0x00cb }
            if (r9 == 0) goto L_0x00d8
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00cb }
            java.lang.String r10 = ".xml"
            boolean r9 = r9.endsWith(r10)     // Catch:{ all -> 0x00cb }
            if (r9 == 0) goto L_0x00d8
            android.content.res.XmlResourceParser r5 = r5.getXml(r14)     // Catch:{ Exception -> 0x00ce }
            android.util.AttributeSet r9 = android.util.Xml.asAttributeSet(r5)     // Catch:{ Exception -> 0x00ce }
        L_0x0099:
            int r10 = r5.next()     // Catch:{ Exception -> 0x00ce }
            r11 = 2
            if (r10 == r11) goto L_0x00a3
            if (r10 == r2) goto L_0x00a3
            goto L_0x0099
        L_0x00a3:
            if (r10 != r11) goto L_0x00d0
            java.lang.String r10 = r5.getName()     // Catch:{ Exception -> 0x00ce }
            s0.i<java.lang.String> r11 = r12.f1662c     // Catch:{ Exception -> 0x00ce }
            r11.mo22431a(r14, r10)     // Catch:{ Exception -> 0x00ce }
            s0.h<java.lang.String, androidx.appcompat.widget.x0$e> r11 = r12.f1661b     // Catch:{ Exception -> 0x00ce }
            java.lang.Object r10 = r11.getOrDefault(r10, r3)     // Catch:{ Exception -> 0x00ce }
            androidx.appcompat.widget.x0$e r10 = (androidx.appcompat.widget.C0478x0.C0483e) r10     // Catch:{ Exception -> 0x00ce }
            if (r10 == 0) goto L_0x00c0
            android.content.res.Resources$Theme r11 = r13.getTheme()     // Catch:{ Exception -> 0x00ce }
            android.graphics.drawable.Drawable r8 = r10.mo2211a(r13, r5, r9, r11)     // Catch:{ Exception -> 0x00ce }
        L_0x00c0:
            if (r8 == 0) goto L_0x00d8
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00ce }
            r8.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00ce }
            r12.mo2204b(r13, r6, r8)     // Catch:{ Exception -> 0x00ce }
            goto L_0x00d8
        L_0x00cb:
            r13 = move-exception
            goto L_0x01a6
        L_0x00ce:
            goto L_0x00d8
        L_0x00d0:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00ce }
            java.lang.String r5 = "No start tag found"
            r0.<init>(r5)     // Catch:{ Exception -> 0x00ce }
            throw r0     // Catch:{ Exception -> 0x00ce }
        L_0x00d8:
            if (r8 != 0) goto L_0x00e1
            s0.i<java.lang.String> r0 = r12.f1662c     // Catch:{ all -> 0x00cb }
            r0.mo22431a(r14, r4)     // Catch:{ all -> 0x00cb }
            goto L_0x00e1
        L_0x00e0:
            r8 = r3
        L_0x00e1:
            if (r8 != 0) goto L_0x00e7
            android.graphics.drawable.Drawable r8 = r12.mo2205c(r14, r13)     // Catch:{ all -> 0x00cb }
        L_0x00e7:
            if (r8 != 0) goto L_0x00ed
            android.graphics.drawable.Drawable r8 = p090g1.C4732a.getDrawable(r13, r14)     // Catch:{ all -> 0x00cb }
        L_0x00ed:
            if (r8 == 0) goto L_0x0195
            android.content.res.ColorStateList r0 = r12.mo2209i(r14, r13)     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x0115
            int[] r13 = androidx.appcompat.widget.C0418j0.f1525a     // Catch:{ all -> 0x00cb }
            android.graphics.drawable.Drawable r13 = r8.mutate()     // Catch:{ all -> 0x00cb }
            android.graphics.drawable.Drawable r13 = p141k1.C5450a.m13604g(r13)     // Catch:{ all -> 0x00cb }
            p141k1.C5450a.C5452b.m13617h(r13, r0)     // Catch:{ all -> 0x00cb }
            androidx.appcompat.widget.x0$f r15 = r12.f1666g     // Catch:{ all -> 0x00cb }
            if (r15 != 0) goto L_0x0107
            goto L_0x010d
        L_0x0107:
            int r15 = p114i.C5219e.abc_switch_thumb_material     // Catch:{ all -> 0x00cb }
            if (r14 != r15) goto L_0x010d
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ all -> 0x00cb }
        L_0x010d:
            if (r3 == 0) goto L_0x0112
            p141k1.C5450a.C5452b.m13618i(r13, r3)     // Catch:{ all -> 0x00cb }
        L_0x0112:
            r3 = r13
            goto L_0x0194
        L_0x0115:
            androidx.appcompat.widget.x0$f r0 = r12.f1666g     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x018a
            int r0 = p114i.C5219e.abc_seekbar_track_material     // Catch:{ all -> 0x00cb }
            r4 = 16908301(0x102000d, float:2.3877265E-38)
            r5 = 16908303(0x102000f, float:2.387727E-38)
            r6 = 16908288(0x1020000, float:2.387723E-38)
            if (r14 != r0) goto L_0x0150
            r0 = r8
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0     // Catch:{ all -> 0x00cb }
            android.graphics.drawable.Drawable r1 = r0.findDrawableByLayerId(r6)     // Catch:{ all -> 0x00cb }
            int r6 = p114i.C5215a.colorControlNormal     // Catch:{ all -> 0x00cb }
            int r7 = androidx.appcompat.widget.C0391c1.m974c(r6, r13)     // Catch:{ all -> 0x00cb }
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.C0407g.f1503b     // Catch:{ all -> 0x00cb }
            androidx.appcompat.widget.C0407g.C0408a.m1033e(r1, r7, r9)     // Catch:{ all -> 0x00cb }
            android.graphics.drawable.Drawable r1 = r0.findDrawableByLayerId(r5)     // Catch:{ all -> 0x00cb }
            int r5 = androidx.appcompat.widget.C0391c1.m974c(r6, r13)     // Catch:{ all -> 0x00cb }
            androidx.appcompat.widget.C0407g.C0408a.m1033e(r1, r5, r9)     // Catch:{ all -> 0x00cb }
            android.graphics.drawable.Drawable r0 = r0.findDrawableByLayerId(r4)     // Catch:{ all -> 0x00cb }
            int r1 = p114i.C5215a.colorControlActivated     // Catch:{ all -> 0x00cb }
            int r1 = androidx.appcompat.widget.C0391c1.m974c(r1, r13)     // Catch:{ all -> 0x00cb }
            androidx.appcompat.widget.C0407g.C0408a.m1033e(r0, r1, r9)     // Catch:{ all -> 0x00cb }
            goto L_0x0186
        L_0x0150:
            int r0 = p114i.C5219e.abc_ratingbar_material     // Catch:{ all -> 0x00cb }
            if (r14 == r0) goto L_0x015c
            int r0 = p114i.C5219e.abc_ratingbar_indicator_material     // Catch:{ all -> 0x00cb }
            if (r14 == r0) goto L_0x015c
            int r0 = p114i.C5219e.abc_ratingbar_small_material     // Catch:{ all -> 0x00cb }
            if (r14 != r0) goto L_0x0187
        L_0x015c:
            r0 = r8
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0     // Catch:{ all -> 0x00cb }
            android.graphics.drawable.Drawable r1 = r0.findDrawableByLayerId(r6)     // Catch:{ all -> 0x00cb }
            int r6 = p114i.C5215a.colorControlNormal     // Catch:{ all -> 0x00cb }
            int r6 = androidx.appcompat.widget.C0391c1.m973b(r6, r13)     // Catch:{ all -> 0x00cb }
            android.graphics.PorterDuff$Mode r7 = androidx.appcompat.widget.C0407g.f1503b     // Catch:{ all -> 0x00cb }
            androidx.appcompat.widget.C0407g.C0408a.m1033e(r1, r6, r7)     // Catch:{ all -> 0x00cb }
            android.graphics.drawable.Drawable r1 = r0.findDrawableByLayerId(r5)     // Catch:{ all -> 0x00cb }
            int r5 = p114i.C5215a.colorControlActivated     // Catch:{ all -> 0x00cb }
            int r6 = androidx.appcompat.widget.C0391c1.m974c(r5, r13)     // Catch:{ all -> 0x00cb }
            androidx.appcompat.widget.C0407g.C0408a.m1033e(r1, r6, r7)     // Catch:{ all -> 0x00cb }
            android.graphics.drawable.Drawable r0 = r0.findDrawableByLayerId(r4)     // Catch:{ all -> 0x00cb }
            int r1 = androidx.appcompat.widget.C0391c1.m974c(r5, r13)     // Catch:{ all -> 0x00cb }
            androidx.appcompat.widget.C0407g.C0408a.m1033e(r0, r1, r7)     // Catch:{ all -> 0x00cb }
        L_0x0186:
            r1 = 1
        L_0x0187:
            if (r1 == 0) goto L_0x018a
            goto L_0x0193
        L_0x018a:
            boolean r13 = r12.mo2210k(r13, r14, r8)     // Catch:{ all -> 0x00cb }
            if (r13 != 0) goto L_0x0193
            if (r15 == 0) goto L_0x0193
            goto L_0x0194
        L_0x0193:
            r3 = r8
        L_0x0194:
            r8 = r3
        L_0x0195:
            if (r8 == 0) goto L_0x019a
            androidx.appcompat.widget.C0418j0.m1107a(r8)     // Catch:{ all -> 0x00cb }
        L_0x019a:
            monitor-exit(r12)
            return r8
        L_0x019c:
            r12.f1665f = r1     // Catch:{ all -> 0x00cb }
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00cb }
            java.lang.String r14 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r13.<init>(r14)     // Catch:{ all -> 0x00cb }
            throw r13     // Catch:{ all -> 0x00cb }
        L_0x01a6:
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0478x0.mo2208g(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* renamed from: i */
    public final synchronized ColorStateList mo2209i(int i, Context context) {
        ColorStateList colorStateList;
        C6314i iVar;
        try {
            WeakHashMap<Context, C6314i<ColorStateList>> weakHashMap = this.f1660a;
            ColorStateList colorStateList2 = null;
            if (weakHashMap == null || (iVar = weakHashMap.get(context)) == null) {
                colorStateList = null;
            } else {
                colorStateList = (ColorStateList) iVar.mo22434g(i, (Integer) null);
            }
            if (colorStateList == null) {
                C0484f fVar = this.f1666g;
                if (fVar != null) {
                    colorStateList2 = ((C0407g.C0408a) fVar).mo2078d(i, context);
                }
                if (colorStateList2 != null) {
                    if (this.f1660a == null) {
                        this.f1660a = new WeakHashMap<>();
                    }
                    C6314i iVar2 = this.f1660a.get(context);
                    if (iVar2 == null) {
                        iVar2 = new C6314i();
                        this.f1660a.put(context, iVar2);
                    }
                    iVar2.mo22431a(i, colorStateList2);
                }
                colorStateList = colorStateList2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return colorStateList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2210k(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            androidx.appcompat.widget.x0$f r0 = r7.f1666g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0067
            androidx.appcompat.widget.g$a r0 = (androidx.appcompat.widget.C0407g.C0408a) r0
            android.graphics.PorterDuff$Mode r3 = androidx.appcompat.widget.C0407g.f1503b
            int[] r4 = r0.f1506a
            boolean r4 = androidx.appcompat.widget.C0407g.C0408a.m1030a(r9, r4)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L_0x0019
            int r5 = p114i.C5215a.colorControlNormal
            goto L_0x0042
        L_0x0019:
            int[] r4 = r0.f1508c
            boolean r4 = androidx.appcompat.widget.C0407g.C0408a.m1030a(r9, r4)
            if (r4 == 0) goto L_0x0024
            int r5 = p114i.C5215a.colorControlActivated
            goto L_0x0042
        L_0x0024:
            int[] r0 = r0.f1509d
            boolean r0 = androidx.appcompat.widget.C0407g.C0408a.m1030a(r9, r0)
            if (r0 == 0) goto L_0x002f
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0042
        L_0x002f:
            int r0 = p114i.C5219e.abc_list_divider_mtrl_alpha
            if (r9 != r0) goto L_0x003e
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L_0x0044
        L_0x003e:
            int r0 = p114i.C5219e.abc_dialog_material_background
            if (r9 != r0) goto L_0x0046
        L_0x0042:
            r9 = r5
            r0 = -1
        L_0x0044:
            r4 = 1
            goto L_0x0049
        L_0x0046:
            r9 = 0
            r0 = -1
            r4 = 0
        L_0x0049:
            if (r4 == 0) goto L_0x0063
            int[] r4 = androidx.appcompat.widget.C0418j0.f1525a
            android.graphics.drawable.Drawable r10 = r10.mutate()
            int r8 = androidx.appcompat.widget.C0391c1.m974c(r9, r8)
            android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.C0407g.m1026c(r8, r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L_0x0061
            r10.setAlpha(r0)
        L_0x0061:
            r8 = 1
            goto L_0x0064
        L_0x0063:
            r8 = 0
        L_0x0064:
            if (r8 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r1 = 0
        L_0x0068:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0478x0.mo2210k(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
