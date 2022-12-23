package p061d7;

import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams;
import com.cubic.umo.p045ad.ext.types.UMOAdKitAppUserType;
import java.util.Map;
import mf0.C24362h;

/* renamed from: d7.a */
public final class C4402a {

    /* renamed from: a */
    public final String f15455a;

    /* renamed from: b */
    public final String f15456b;

    /* renamed from: c */
    public String f15457c;

    /* renamed from: d */
    public String f15458d;

    /* renamed from: e */
    public String f15459e;

    /* renamed from: f */
    public UMOAdKitAppUserType f15460f;

    /* renamed from: g */
    public String f15461g;

    /* renamed from: h */
    public Map<String, String> f15462h;

    /* renamed from: i */
    public UMOAdKitAdQueryParams f15463i;

    public C4402a(String str, String str2, String str3, String str4, String str5, UMOAdKitAppUserType uMOAdKitAppUserType, String str6, Map<String, String> map, UMOAdKitAdQueryParams uMOAdKitAdQueryParams) {
        C24362h.m61211f(uMOAdKitAppUserType, "appUserType");
        this.f15455a = str;
        this.f15456b = str2;
        this.f15457c = str3;
        this.f15458d = str4;
        this.f15459e = str5;
        this.f15460f = uMOAdKitAppUserType;
        this.f15461g = str6;
        this.f15462h = map;
        this.f15463i = uMOAdKitAdQueryParams;
    }

    /* renamed from: a */
    public static C4402a m11578a(C4402a aVar, String str, int i) {
        UMOAdKitAdQueryParams uMOAdKitAdQueryParams = null;
        String str2 = (i & 1) != 0 ? aVar.f15455a : null;
        if ((i & 2) != 0) {
            str = aVar.f15456b;
        }
        String str3 = str;
        String str4 = (i & 4) != 0 ? aVar.f15457c : null;
        String str5 = (i & 8) != 0 ? aVar.f15458d : null;
        String str6 = (i & 16) != 0 ? aVar.f15459e : null;
        UMOAdKitAppUserType uMOAdKitAppUserType = (i & 32) != 0 ? aVar.f15460f : null;
        String str7 = (i & 64) != 0 ? aVar.f15461g : null;
        Map<String, String> map = (i & RecyclerView.C1119a0.FLAG_IGNORE) != 0 ? aVar.f15462h : null;
        if ((i & 256) != 0) {
            uMOAdKitAdQueryParams = aVar.f15463i;
        }
        aVar.getClass();
        C24362h.m61211f(str2, "publisherId");
        C24362h.m61211f(str3, "configFileBasePath");
        C24362h.m61211f(uMOAdKitAppUserType, "appUserType");
        return new C4402a(str2, str3, str4, str5, str6, uMOAdKitAppUserType, str7, map, uMOAdKitAdQueryParams);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4402a)) {
            return false;
        }
        C4402a aVar = (C4402a) obj;
        return C24362h.m61206a(this.f15455a, aVar.f15455a) && C24362h.m61206a(this.f15456b, aVar.f15456b) && C24362h.m61206a(this.f15457c, aVar.f15457c) && C24362h.m61206a(this.f15458d, aVar.f15458d) && C24362h.m61206a(this.f15459e, aVar.f15459e) && this.f15460f == aVar.f15460f && C24362h.m61206a(this.f15461g, aVar.f15461g) && C24362h.m61206a(this.f15462h, aVar.f15462h) && C24362h.m61206a(this.f15463i, aVar.f15463i);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int I0 = C21100e.m49313I0(this.f15455a.hashCode() * 31, this.f15456b);
        String str = this.f15457c;
        int i6 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i7 = (I0 + i) * 31;
        String str2 = this.f15458d;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i8 = (i7 + i2) * 31;
        String str3 = this.f15459e;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int hashCode = (this.f15460f.hashCode() + ((i8 + i3) * 31)) * 31;
        String str4 = this.f15461g;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i9 = (hashCode + i4) * 31;
        Map<String, String> map = this.f15462h;
        if (map == null) {
            i5 = 0;
        } else {
            i5 = map.hashCode();
        }
        int i11 = (i9 + i5) * 31;
        UMOAdKitAdQueryParams uMOAdKitAdQueryParams = this.f15463i;
        if (uMOAdKitAdQueryParams != null) {
            i6 = uMOAdKitAdQueryParams.hashCode();
        }
        return i11 + i6;
    }

    public final String toString() {
        StringBuilder J0 = C21100e.m49315J0("UMOAdKitParams(publisherId=");
        J0.append(this.f15455a);
        J0.append(", configFileBasePath=");
        J0.append(this.f15456b);
        J0.append(", regionId=");
        J0.append(this.f15457c);
        J0.append(", umoAppRegionId=");
        J0.append(this.f15458d);
        J0.append(", userId=");
        J0.append(this.f15459e);
        J0.append(", appUserType=");
        J0.append(this.f15460f);
        J0.append(", placeholderClickUrl=");
        J0.append(this.f15461g);
        J0.append(", mapStaticAppPlaceholders=");
        J0.append(this.f15462h);
        J0.append(", adQueryParams=");
        J0.append(this.f15463i);
        J0.append(')');
        return J0.toString();
    }
}
