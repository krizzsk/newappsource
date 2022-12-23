package p531he;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import p358af.C13436c;

/* renamed from: he.b0 */
public final class C17390b0 implements C17392c0 {

    /* renamed from: g */
    public static final Pattern f44794g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h */
    public static final String f44795h = Pattern.quote("/");

    /* renamed from: a */
    public final C17394d0 f44796a;

    /* renamed from: b */
    public final Context f44797b;

    /* renamed from: c */
    public final String f44798c;

    /* renamed from: d */
    public final C13436c f44799d;

    /* renamed from: e */
    public final C17422x f44800e;

    /* renamed from: f */
    public String f44801f;

    public C17390b0(Context context, String str, C13436c cVar, C17422x xVar) {
        if (str != null) {
            this.f44797b = context;
            this.f44798c = str;
            this.f44799d = cVar;
            this.f44800e = xVar;
            this.f44796a = new C17394d0(0);
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }

    /* renamed from: b */
    public static String m43438b() {
        StringBuilder k = C13555b.m33972k("SYN_");
        k.append(UUID.randomUUID().toString());
        return k.toString();
    }

    /* renamed from: a */
    public final synchronized String mo49863a(SharedPreferences sharedPreferences, String str) {
        String str2;
        String uuid = UUID.randomUUID().toString();
        if (uuid == null) {
            str2 = null;
        } else {
            str2 = f44794g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", str2).putString("firebase.installation.id", str).apply();
        return str2;
    }

    /* renamed from: c */
    public final synchronized String mo49864c() {
        String str;
        String str2 = this.f44801f;
        if (str2 != null) {
            return str2;
        }
        boolean z = false;
        SharedPreferences sharedPreferences = this.f44797b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", (String) null);
        if (this.f44800e.mo49890a()) {
            try {
                str = (String) C17406i0.m43451a(this.f44799d.getId());
            } catch (Exception unused) {
                str = null;
            }
            if (str == null) {
                if (string == null) {
                    str = m43438b();
                } else {
                    str = string;
                }
            }
            if (str.equals(string)) {
                this.f44801f = sharedPreferences.getString("crashlytics.installation.id", (String) null);
            } else {
                this.f44801f = mo49863a(sharedPreferences, str);
            }
        } else {
            if (string != null && string.startsWith("SYN_")) {
                z = true;
            }
            if (z) {
                this.f44801f = sharedPreferences.getString("crashlytics.installation.id", (String) null);
            } else {
                this.f44801f = mo49863a(sharedPreferences, m43438b());
            }
        }
        if (this.f44801f == null) {
            this.f44801f = mo49863a(sharedPreferences, m43438b());
        }
        return this.f44801f;
    }

    /* renamed from: d */
    public final String mo49865d() {
        String str;
        C17394d0 d0Var = this.f44796a;
        Context context = this.f44797b;
        synchronized (d0Var) {
            if (d0Var.f44804a == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                d0Var.f44804a = installerPackageName;
            }
            if ("".equals(d0Var.f44804a)) {
                str = null;
            } else {
                str = d0Var.f44804a;
            }
        }
        return str;
    }
}
