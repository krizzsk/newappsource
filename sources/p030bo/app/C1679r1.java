package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

/* renamed from: bo.app.r1 */
public class C1679r1 implements C1724x1 {

    /* renamed from: a */
    public final SharedPreferences f5966a;

    public C1679r1(Context context) {
        this.f5966a = context.getSharedPreferences("com.appboy.device", 0);
    }

    /* renamed from: b */
    public static String m4666b() {
        return String.valueOf(722989291);
    }

    /* renamed from: a */
    public String mo6342a() {
        String str = null;
        String string = this.f5966a.getString("device_id", (String) null);
        if (!mo6344c()) {
            str = string;
        }
        if (str == null) {
            String uuid = UUID.randomUUID().toString();
            mo6343a(uuid);
            return uuid;
        }
        if (!this.f5966a.contains("persistent_device_id")) {
            mo6343a(str);
        }
        return str;
    }

    /* renamed from: c */
    public final boolean mo6344c() {
        if (!this.f5966a.contains("persistent_device_id")) {
            return false;
        }
        return !m4666b().equals(this.f5966a.getString("persistent_device_id", ""));
    }

    /* renamed from: a */
    public final void mo6343a(String str) {
        SharedPreferences.Editor edit = this.f5966a.edit();
        edit.putString("device_id", str);
        edit.putString("persistent_device_id", m4666b());
        edit.apply();
    }
}
