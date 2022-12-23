package p918xn;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import com.masabi.justride.sdk.platform.info.Platform;
import p413co.C13872r;
import p725pj.C18926a;

/* renamed from: xn.b */
public final class C20543b implements C20546e {

    /* renamed from: a */
    public final Application f51976a;

    /* renamed from: b */
    public final C20542a f51977b;

    /* renamed from: c */
    public final String f51978c;

    /* renamed from: d */
    public final String f51979d;

    public C20543b(Application application, C20542a aVar, String str, String str2) {
        this.f51976a = application;
        this.f51977b = aVar;
        this.f51978c = str;
        this.f51979d = str2;
    }

    /* renamed from: a */
    public final String mo52742a() {
        Integer num;
        try {
            num = Integer.valueOf(this.f51976a.getPackageManager().getPackageInfo(mo52748g(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            num = null;
        }
        if (num != null) {
            return num.toString();
        }
        return "unknown";
    }

    /* renamed from: b */
    public final String mo52743b() {
        return Platform.ANDROID.getName();
    }

    /* renamed from: c */
    public final String mo52744c() {
        return String.format("%s %s", new Object[]{mo52743b(), Build.VERSION.RELEASE});
    }

    /* renamed from: d */
    public final String mo52745d() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: e */
    public final String mo52746e() {
        return this.f51979d;
    }

    /* renamed from: f */
    public final String mo52747f() {
        StringBuilder sb = new StringBuilder();
        String str = Build.MANUFACTURER;
        String str2 = "Unknown";
        if (str == null) {
            str = str2;
        }
        sb.append(str);
        sb.append(" ");
        String str3 = Build.MODEL;
        if (str3 != null) {
            str2 = str3;
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: g */
    public final String mo52748g() {
        return this.f51976a.getPackageName();
    }

    public final C13872r<String> getDeviceId() {
        return new C13872r<>(this.f51977b.mo52741a(), (C18926a) null);
    }

    /* renamed from: h */
    public final String mo52750h() {
        return this.f51978c;
    }

    /* renamed from: i */
    public final String mo52751i() {
        String str;
        try {
            str = this.f51976a.getPackageManager().getPackageInfo(mo52748g(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        return "unknown";
    }
}
