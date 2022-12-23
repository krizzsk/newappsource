package e70;

import android.content.Context;
import android.content.SharedPreferences;
import f00.C16919g;
import p389bl.C13641g;
import p977zz.C20964s0;

/* renamed from: e70.d */
public final class C4591d {

    /* renamed from: a */
    public static final C16919g.C16928i f15772a = new C16919g.C16928i("USER_KEY_PREF", (String) null);

    /* renamed from: b */
    public static final C16919g.C16928i f15773b = new C16919g.C16928i("ACCESS_ID_PREF", (String) null);

    /* renamed from: c */
    public static final C16919g.C16928i f15774c = new C16919g.C16928i("LICENSE_KEY_PREF", (String) null);

    /* renamed from: d */
    public static final C16919g.C16928i f15775d = new C16919g.C16928i("EXT_USER_KEY_PREF", (String) null);

    /* renamed from: e */
    public static volatile C4591d f15776e;

    /* renamed from: f */
    public static volatile C4592a f15777f;

    /* renamed from: e70.d$a */
    public static class C4592a {

        /* renamed from: a */
        public String f15778a;

        /* renamed from: b */
        public final String f15779b;

        /* renamed from: c */
        public final String f15780c;

        /* renamed from: d */
        public final String f15781d;

        public C4592a(String str, String str2, String str3, String str4) {
            this.f15778a = str;
            this.f15779b = str2;
            this.f15780c = str3;
            this.f15781d = str4;
        }
    }

    /* renamed from: a */
    public static C4591d m11903a(Context context) {
        if (f15776e == null) {
            synchronized (C4591d.class) {
                if (f15776e == null) {
                    Context applicationContext = context.getApplicationContext();
                    SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("moovit_sdk_shared_prefs", 0);
                    try {
                        C4594f fVar = (C4594f) C13641g.m34133v(applicationContext, "user.dat", C4594f.f15785e);
                        if (fVar != null) {
                            f15773b.mo49545d(sharedPreferences, Integer.toString(fVar.f15788c.f23119b));
                        }
                    } catch (Exception e) {
                        e.toString();
                    }
                    f15777f = new C4592a(f15772a.mo19759a(sharedPreferences), f15774c.mo19759a(sharedPreferences), f15775d.mo19759a(sharedPreferences), f15773b.mo19759a(sharedPreferences));
                    f15776e = new C4591d();
                }
            }
        }
        return f15776e;
    }

    /* renamed from: b */
    public static boolean m11904b() {
        return !C20964s0.m49090h(f15777f.f15778a);
    }

    /* renamed from: c */
    public static synchronized void m11905c(Context context, String str, String str2, String str3, String str4) {
        synchronized (C4591d.class) {
            SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("moovit_sdk_shared_prefs", 0).edit();
            edit.putString(f15772a.f43935a, str);
            edit.putString(f15774c.f43935a, str2);
            edit.putString(f15775d.f43935a, str3);
            edit.putString(f15773b.f43935a, str4);
            f15777f = new C4592a(str, str2, str3, str4);
            edit.commit();
        }
    }
}
