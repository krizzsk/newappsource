package y90;

import android.content.pm.PackageInfo;
import c00.C13722f;

/* renamed from: y90.b */
public final class C13268b implements C13722f<PackageInfo> {

    /* renamed from: b */
    public final /* synthetic */ String f32921b;

    public C13268b(String str) {
        this.f32921b = str;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        boolean z;
        PackageInfo packageInfo = (PackageInfo) obj;
        if ((packageInfo.applicationInfo.flags & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || packageInfo.packageName.startsWith("com.huawei") || packageInfo.packageName.equals(this.f32921b)) {
            return true;
        }
        return false;
    }
}
