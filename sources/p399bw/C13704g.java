package p399bw;

import android.content.SharedPreferences;
import com.moovit.app.MoovitAppApplication;
import f00.C16919g;

/* renamed from: bw.g */
public final class C13704g {

    /* renamed from: b */
    public static final C13704g f33778b = new C13704g(MoovitAppApplication.m37038x());

    /* renamed from: c */
    public static final C16919g.C16924e f33779c = new C16919g.C16924e("helpfulness_query_shown", 0);

    /* renamed from: d */
    public static final C16919g.C16920a f33780d = new C16919g.C16920a("helpfulness_query_answered", false);

    /* renamed from: a */
    public final SharedPreferences f33781a;

    public C13704g(MoovitAppApplication moovitAppApplication) {
        this.f33781a = moovitAppApplication.getSharedPreferences("smart_trackback", 0);
    }
}
