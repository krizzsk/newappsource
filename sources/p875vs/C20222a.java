package p875vs;

import ce0.C21100e;
import com.moovit.commons.utils.Color;
import com.moovit.image.model.Image;

/* renamed from: vs.a */
public final class C20222a {

    /* renamed from: a */
    public final String f51317a;

    /* renamed from: b */
    public final int f51318b;

    /* renamed from: c */
    public final String f51319c;

    /* renamed from: d */
    public final String f51320d;

    /* renamed from: e */
    public final Image f51321e;

    /* renamed from: f */
    public final Color f51322f;

    /* renamed from: g */
    public final boolean f51323g;

    /* renamed from: h */
    public final long f51324h;

    /* renamed from: i */
    public long f51325i;

    public C20222a(String str, int i, String str2, String str3, Image image, Color color, boolean z, long j, long j2) {
        C21100e.m49373x(str, "id");
        this.f51317a = str;
        this.f51318b = i;
        C21100e.m49373x(str2, "name");
        this.f51319c = str2;
        C21100e.m49373x(str3, "url");
        this.f51320d = str3;
        this.f51321e = image;
        this.f51322f = color;
        this.f51323g = z;
        this.f51324h = j;
        this.f51325i = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20222a)) {
            return false;
        }
        return this.f51317a.equals(((C20222a) obj).f51317a);
    }

    public final int hashCode() {
        return this.f51317a.hashCode();
    }
}
