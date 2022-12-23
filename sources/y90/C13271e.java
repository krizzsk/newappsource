package y90;

import android.content.Context;
import android.content.SharedPreferences;
import f00.C16919g;
import java.util.UUID;

/* renamed from: y90.e */
public final class C13271e {

    /* renamed from: a */
    public static final C16919g.C16924e f32922a = new C16919g.C16924e("client_version_code", -1);

    /* renamed from: b */
    public static final C16919g.C16928i f32923b = new C16919g.C16928i("installation_id", (String) null);

    /* renamed from: a */
    public static String m33393a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("UserData", 0);
        C16919g.C16928i iVar = f32923b;
        String e = iVar.mo19759a(sharedPreferences);
        if (e == null) {
            synchronized (iVar) {
                e = iVar.mo19759a(sharedPreferences);
                if (e == null) {
                    e = UUID.randomUUID().toString();
                    iVar.mo49545d(sharedPreferences, e);
                }
            }
        }
        return e;
    }
}
