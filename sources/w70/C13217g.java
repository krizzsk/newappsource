package w70;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import ce0.C21100e;
import com.appsflyer.ServerParameters;
import com.moovit.sdk.Locale.LocaleInfo;
import f00.C16918f;
import f00.C16919g;
import p977zz.C20975x0;
import x70.C13238a;
import y70.C13256a;

/* renamed from: w70.g */
public final class C13217g {

    /* renamed from: b */
    public static C16918f<String> f32784b;

    /* renamed from: c */
    public static C16918f<String> f32785c;

    /* renamed from: d */
    public static C16918f<String> f32786d;

    /* renamed from: e */
    public static C16918f<LocaleInfo> f32787e;

    /* renamed from: f */
    public static final C13218a f32788f = new C13218a();

    /* renamed from: a */
    public final Context f32789a;

    /* renamed from: w70.g$a */
    public class C13218a extends C16919g<LocaleInfo> {
        public C13218a() {
            super("localeKnownToServer", null);
        }

        /* renamed from: a */
        public final Object mo19759a(SharedPreferences sharedPreferences) {
            String string = sharedPreferences.getString("language", (String) null);
            if (string == null) {
                return null;
            }
            return new LocaleInfo(string, sharedPreferences.getString(ServerParameters.COUNTRY, ""), sharedPreferences.getString("variant", ""));
        }

        /* renamed from: c */
        public final void mo19760c(SharedPreferences.Editor editor, Object obj) {
            LocaleInfo localeInfo = (LocaleInfo) obj;
            editor.putString("language", localeInfo.f15164b);
            editor.putString(ServerParameters.COUNTRY, localeInfo.f15165c);
            editor.putString("variant", localeInfo.f15166d);
        }
    }

    public C13217g(Context context) {
        this.f32789a = context;
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("moovit_sdk_versions", 0);
        f32784b = new C16918f<>(sharedPreferences, new C16919g.C16928i(ServerParameters.SDK_DATA_SDK_VERSION, (String) null));
        f32785c = new C16918f<>(sharedPreferences, new C16919g.C16928i("hosted_app_version", (String) null));
        f32786d = new C16918f<>(sharedPreferences, new C16919g.C16928i("os_version", (String) null));
        f32787e = new C16918f<>(sharedPreferences, f32788f);
    }

    /* renamed from: a */
    public final void mo40088a(boolean z) {
        boolean z2 = true;
        if (!C20975x0.m49118e("5.37.2.429", f32784b.mo49542a())) {
            f32784b.mo49544c("5.37.2.429");
            z = true;
        }
        try {
            String str = this.f32789a.getPackageManager().getPackageInfo(this.f32789a.getPackageName(), 0).versionName;
            if (!C20975x0.m49118e(str, f32785c.mo49542a())) {
                f32785c.mo49544c(str);
                z = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        StringBuilder sb = new StringBuilder();
        String str2 = Build.VERSION.RELEASE;
        sb.append(str2);
        sb.append("_");
        int i = Build.VERSION.SDK_INT;
        sb.append(i);
        if (!C20975x0.m49118e(sb.toString(), f32786d.mo49542a())) {
            C16918f<String> fVar = f32786d;
            fVar.mo49544c(str2 + "_" + i);
        } else {
            z2 = z;
        }
        if (!C20975x0.m49118e("5.37.2.429", f32787e.mo49542a())) {
            f32784b.mo49544c("5.37.2.429");
        }
        if (z2) {
            C13256a.m33377b(this.f32789a).mo40132a(new C13238a(f32784b.mo49542a(), f32785c.mo49542a(), f32786d.mo49542a(), C21100e.m49319N(f32787e.mo49542a())));
        }
    }
}
