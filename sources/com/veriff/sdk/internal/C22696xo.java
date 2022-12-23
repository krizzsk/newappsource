package com.veriff.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import mobi.lab.veriff.data.Branding;
import mobi.lab.veriff.data.DrawableProvider;
import p358af.C13437d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bE\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0001dBu\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u0004\u0012\b\b\u0001\u0010 \u001a\u00020\u0004\u0012\b\b\u0001\u0010!\u001a\u00020\u0004\u0012\b\b\u0001\u0010\"\u001a\u00020\u0004\u0012\b\b\u0001\u0010#\u001a\u00020\u0018\u0012\b\b\u0001\u0010$\u001a\u00020\u0004\u0012\b\u0010%\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0001\u0010&\u001a\u00020\u0004\u0012\b\b\u0001\u0010'\u001a\u00020\u0004¢\u0006\u0004\b_\u0010`B\u0011\b\u0016\u0012\u0006\u0010b\u001a\u00020a¢\u0006\u0004\b_\u0010cB\t\b\u0017¢\u0006\u0004\b_\u00105J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0018HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0003Jy\u0010(\u001a\u00020\u00002\b\b\u0003\u0010\u001d\u001a\u00020\u00042\b\b\u0003\u0010\u001e\u001a\u00020\u00042\b\b\u0003\u0010\u001f\u001a\u00020\u00042\b\b\u0003\u0010 \u001a\u00020\u00042\b\b\u0003\u0010!\u001a\u00020\u00042\b\b\u0003\u0010\"\u001a\u00020\u00042\b\b\u0003\u0010#\u001a\u00020\u00182\b\b\u0003\u0010$\u001a\u00020\u00042\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001b2\b\b\u0003\u0010&\u001a\u00020\u00042\b\b\u0003\u0010'\u001a\u00020\u0004HÆ\u0001R\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010#\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b#\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b0\u0010+R\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b1\u0010+R \u00102\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010)\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010+R \u00106\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u0010)\u0012\u0004\b8\u00105\u001a\u0004\b7\u0010+R \u00109\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b9\u0010)\u0012\u0004\b;\u00105\u001a\u0004\b:\u0010+R \u0010<\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u0010)\u0012\u0004\b>\u00105\u001a\u0004\b=\u0010+R \u0010?\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b?\u0010)\u0012\u0004\bA\u00105\u001a\u0004\b@\u0010+R \u0010B\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bB\u0010)\u0012\u0004\bD\u00105\u001a\u0004\bC\u0010+R \u0010E\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bE\u0010)\u0012\u0004\bG\u00105\u001a\u0004\bF\u0010+R \u0010H\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bH\u0010)\u0012\u0004\bJ\u00105\u001a\u0004\bI\u0010+R \u0010K\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bK\u0010)\u0012\u0004\bM\u00105\u001a\u0004\bL\u0010+R \u0010N\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bN\u0010)\u0012\u0004\bP\u00105\u001a\u0004\bO\u0010+R\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010)\u001a\u0004\bQ\u0010+R\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010)\u001a\u0004\bR\u0010+R \u0010S\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bS\u0010)\u0012\u0004\bU\u00105\u001a\u0004\bT\u0010+R\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010)\u001a\u0004\bV\u0010+R \u0010W\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bW\u0010)\u0012\u0004\bY\u00105\u001a\u0004\bX\u0010+R\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\bZ\u0010+R\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b[\u0010+R\u0019\u0010%\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b%\u0010\\\u001a\u0004\b]\u0010^¨\u0006e"}, mo59060d2 = {"Lmobi/lab/veriff/util/resourcesHelper/Branding;", "Landroid/os/Parcelable;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lbf0/d;", "writeToParcel", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "", "component7", "component8", "Lmobi/lab/veriff/data/DrawableProvider;", "component9", "primary01", "secondary", "background", "statusBarColor", "primaryTextColor", "secondaryTextColor", "buttonCornerRadius", "toolbarIcon", "toolbarIconDrawableProvider", "bulletPoint", "notificationIcon", "copy", "I", "getBackground", "()I", "getBulletPoint", "F", "getButtonCornerRadius", "()F", "getNotificationIcon", "getPrimary01", "primary01Alpha16", "getPrimary01Alpha16", "getPrimary01Alpha16$annotations", "()V", "primary01Alpha38", "getPrimary01Alpha38", "getPrimary01Alpha38$annotations", "primary01Alpha4", "getPrimary01Alpha4", "getPrimary01Alpha4$annotations", "primary01Alpha8", "getPrimary01Alpha8", "getPrimary01Alpha8$annotations", "primary01Dark", "getPrimary01Dark", "getPrimary01Dark$annotations", "primary02", "getPrimary02", "getPrimary02$annotations", "primary03", "getPrimary03", "getPrimary03$annotations", "primary04", "getPrimary04", "getPrimary04$annotations", "primary05", "getPrimary05", "getPrimary05$annotations", "primary06", "getPrimary06", "getPrimary06$annotations", "getPrimaryTextColor", "getSecondary", "secondaryBackground", "getSecondaryBackground", "getSecondaryBackground$annotations", "getSecondaryTextColor", "separator", "getSeparator", "getSeparator$annotations", "getStatusBarColor", "getToolbarIcon", "Lmobi/lab/veriff/data/DrawableProvider;", "getToolbarIconDrawableProvider", "()Lmobi/lab/veriff/data/DrawableProvider;", "<init>", "(IIIIIIFILmobi/lab/veriff/data/DrawableProvider;II)V", "Lmobi/lab/veriff/data/Branding;", "branding", "(Lmobi/lab/veriff/data/Branding;)V", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.xo */
public final class C22696xo implements Parcelable {
    public static final Parcelable.Creator<C22696xo> CREATOR = new C22698b();

    /* renamed from: a */
    public static final C22697a f57357a = new C22697a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final C22696xo f57358y;

    /* renamed from: b */
    private final int f57359b;

    /* renamed from: c */
    private final int f57360c;

    /* renamed from: d */
    private final int f57361d;

    /* renamed from: g */
    private final int f57362g;

    /* renamed from: i */
    private final int f57363i;

    /* renamed from: k */
    private final int f57364k;

    /* renamed from: l */
    private final int f57365l;

    /* renamed from: m */
    private final int f57366m;

    /* renamed from: n */
    private final int f57367n;

    /* renamed from: o */
    private final int f57368o;

    /* renamed from: p */
    private final int f57369p;

    /* renamed from: q */
    private final int f57370q;

    /* renamed from: r */
    private final int f57371r;

    /* renamed from: s */
    private final int f57372s;

    /* renamed from: t */
    private final float f57373t;

    /* renamed from: u */
    private final int f57374u;

    /* renamed from: v */
    private final DrawableProvider f57375v;

    /* renamed from: w */
    private final int f57376w;

    /* renamed from: x */
    private final int f57377x;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lmobi/lab/veriff/util/resourcesHelper/Branding$Companion;", "", "()V", "DEFAULT", "Lmobi/lab/veriff/util/resourcesHelper/Branding;", "getDEFAULT", "()Lmobi/lab/veriff/util/resourcesHelper/Branding;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.xo$a */
    public static final class C22697a {
        private C22697a() {
        }

        public /* synthetic */ C22697a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C22696xo mo57107a() {
            return C22696xo.f57358y;
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.xo$b */
    public static class C22698b implements Parcelable.Creator<C22696xo> {
        /* renamed from: a */
        public final C22696xo createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "in");
            return new C22696xo(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), (DrawableProvider) parcel.readParcelable(C22696xo.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        /* renamed from: a */
        public final C22696xo[] newArray(int i) {
            return new C22696xo[i];
        }
    }

    static {
        Branding build = new Branding.Builder().build();
        C24362h.m61210e(build, "mobi.lab.veriff.data.Branding.Builder().build()");
        f57358y = new C22696xo(build);
    }

    public C22696xo(int i, int i2, int i3, int i4, int i5, int i6, float f, int i7, DrawableProvider drawableProvider, int i8, int i9) {
        int i11;
        int i12;
        this.f57367n = i;
        this.f57368o = i2;
        this.f57369p = i3;
        this.f57370q = i4;
        this.f57371r = i5;
        this.f57372s = i6;
        this.f57373t = f;
        this.f57374u = i7;
        this.f57375v = drawableProvider;
        this.f57376w = i8;
        this.f57377x = i9;
        this.f57359b = C22699xp.m55357f(i, 0.05f);
        this.f57360c = C22699xp.m55356e(i, 0.05f);
        this.f57361d = i2;
        int unused = C22699xp.m55355d(C22699xp.m55357f(i2, 0.1f), 0.32f);
        int unused2 = C22699xp.m55355d(C22699xp.m55357f(i2, 0.1f), 0.24f);
        this.f57362g = C22699xp.m55355d(C22699xp.m55357f(i2, 0.1f), 0.16f);
        int unused3 = C22699xp.m55355d(i, 0.08f);
        this.f57363i = C22699xp.m55355d(i, 0.04f);
        int unused4 = C22699xp.m55355d(i, 0.16f);
        this.f57364k = C22699xp.m55355d(i, 0.38f);
        if (i3 == C22087nq.m53870a()) {
            i11 = C22699xp.f57378a;
        } else {
            i11 = C22699xp.m55357f(i3, 0.1f);
        }
        this.f57365l = i11;
        if (i3 == C22087nq.m53870a()) {
            i12 = C22699xp.f57379b;
        } else {
            i12 = C22699xp.m55357f(i3, 0.05f);
        }
        this.f57366m = i12;
    }

    /* renamed from: a */
    public final int mo57083a() {
        return this.f57359b;
    }

    /* renamed from: b */
    public final int mo57084b() {
        return this.f57360c;
    }

    /* renamed from: c */
    public final int mo57085c() {
        return this.f57361d;
    }

    /* renamed from: d */
    public final int mo57086d() {
        return this.f57362g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int mo57088e() {
        return this.f57363i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22696xo)) {
            return false;
        }
        C22696xo xoVar = (C22696xo) obj;
        return this.f57367n == xoVar.f57367n && this.f57368o == xoVar.f57368o && this.f57369p == xoVar.f57369p && this.f57370q == xoVar.f57370q && this.f57371r == xoVar.f57371r && this.f57372s == xoVar.f57372s && Float.compare(this.f57373t, xoVar.f57373t) == 0 && this.f57374u == xoVar.f57374u && C24362h.m61206a(this.f57375v, xoVar.f57375v) && this.f57376w == xoVar.f57376w && this.f57377x == xoVar.f57377x;
    }

    /* renamed from: f */
    public final int mo57090f() {
        return this.f57364k;
    }

    /* renamed from: g */
    public final int mo57091g() {
        return this.f57365l;
    }

    /* renamed from: h */
    public final int mo57092h() {
        return this.f57366m;
    }

    public int hashCode() {
        int floatToIntBits = (((Float.floatToIntBits(this.f57373t) + (((((((((((this.f57367n * 31) + this.f57368o) * 31) + this.f57369p) * 31) + this.f57370q) * 31) + this.f57371r) * 31) + this.f57372s) * 31)) * 31) + this.f57374u) * 31;
        DrawableProvider drawableProvider = this.f57375v;
        return ((((floatToIntBits + (drawableProvider != null ? drawableProvider.hashCode() : 0)) * 31) + this.f57376w) * 31) + this.f57377x;
    }

    /* renamed from: i */
    public final int mo57094i() {
        return this.f57367n;
    }

    /* renamed from: j */
    public final int mo57095j() {
        return this.f57368o;
    }

    /* renamed from: k */
    public final int mo57096k() {
        return this.f57369p;
    }

    /* renamed from: l */
    public final int mo57097l() {
        return this.f57370q;
    }

    /* renamed from: m */
    public final int mo57098m() {
        return this.f57371r;
    }

    /* renamed from: n */
    public final int mo57099n() {
        return this.f57372s;
    }

    /* renamed from: o */
    public final float mo57100o() {
        return this.f57373t;
    }

    /* renamed from: p */
    public final int mo57101p() {
        return this.f57374u;
    }

    /* renamed from: q */
    public final DrawableProvider mo57102q() {
        return this.f57375v;
    }

    /* renamed from: r */
    public final int mo57103r() {
        return this.f57376w;
    }

    /* renamed from: s */
    public final int mo57104s() {
        return this.f57377x;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Branding(primary01=");
        k.append(this.f57367n);
        k.append(", secondary=");
        k.append(this.f57368o);
        k.append(", background=");
        k.append(this.f57369p);
        k.append(", statusBarColor=");
        k.append(this.f57370q);
        k.append(", primaryTextColor=");
        k.append(this.f57371r);
        k.append(", secondaryTextColor=");
        k.append(this.f57372s);
        k.append(", buttonCornerRadius=");
        k.append(this.f57373t);
        k.append(", toolbarIcon=");
        k.append(this.f57374u);
        k.append(", toolbarIconDrawableProvider=");
        k.append(this.f57375v);
        k.append(", bulletPoint=");
        k.append(this.f57376w);
        k.append(", notificationIcon=");
        return C13437d.m33707l(k, this.f57377x, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "parcel");
        parcel.writeInt(this.f57367n);
        parcel.writeInt(this.f57368o);
        parcel.writeInt(this.f57369p);
        parcel.writeInt(this.f57370q);
        parcel.writeInt(this.f57371r);
        parcel.writeInt(this.f57372s);
        parcel.writeFloat(this.f57373t);
        parcel.writeInt(this.f57374u);
        parcel.writeParcelable(this.f57375v, i);
        parcel.writeInt(this.f57376w);
        parcel.writeInt(this.f57377x);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C22696xo(Branding branding) {
        this(branding.getThemeColor(), branding.getSecondaryColor(), branding.getBackgroundColor(), branding.getStatusBarColor(), branding.getPrimaryTextColor(), branding.getSecondaryTextColor(), branding.getButtonCornerRadius(), branding.getToolbarIcon(), branding.getToolbarIconDrawableProvider(), branding.getBulletPoint(), branding.getNotificationIcon());
        C24362h.m61211f(branding, "branding");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22696xo() {
        /*
            r2 = this;
            mobi.lab.veriff.data.Branding$Builder r0 = new mobi.lab.veriff.data.Branding$Builder
            r0.<init>()
            mobi.lab.veriff.data.Branding r0 = r0.build()
            java.lang.String r1 = "mobi.lab.veriff.data.Branding.Builder().build()"
            mf0.C24362h.m61210e(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22696xo.<init>():void");
    }
}
