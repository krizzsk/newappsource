package td0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import ce0.C21100e;
import ce0.C21105j;
import ce0.C21120u;
import com.vungle.warren.VungleLogger;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: td0.d */
public final class C24933d {

    /* renamed from: a */
    public final File f63017a;

    /* renamed from: b */
    public final Executor f63018b;

    /* renamed from: c */
    public final ConcurrentHashMap<String, Object> f63019c;

    /* renamed from: d */
    public final SharedPreferences f63020d;

    /* renamed from: e */
    public final HashSet<String> f63021e = new HashSet<>();

    /* renamed from: td0.d$a */
    public class C24934a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Serializable f63022b;

        public C24934a(HashMap hashMap) {
            this.f63022b = hashMap;
        }

        public final void run() {
            C21105j.m49401f(C24933d.this.f63017a, this.f63022b);
        }
    }

    @SuppressLint({"NewApi"})
    public C24933d(Context context, C21120u uVar) {
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        this.f63019c = concurrentHashMap;
        this.f63018b = uVar;
        File file = new File(context.getNoBackupFilesDir(), "vungle_settings");
        this.f63017a = file;
        File file2 = new File(context.getFilesDir(), "vungle_settings");
        if (file2.exists() && !file2.renameTo(file)) {
            VungleLogger.m57029b("FilePreferences", "Can't move old FilePreferences");
        }
        Object d = C21105j.m49399d(file);
        if (d instanceof HashMap) {
            concurrentHashMap.putAll((HashMap) d);
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.vungle.sdk", 0);
        this.f63020d = sharedPreferences;
        for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
            Object value = next.getValue();
            if (value instanceof Boolean) {
                mo61498g((String) next.getKey(), ((Boolean) value).booleanValue());
            } else if (value instanceof String) {
                mo61496e((String) next.getKey(), (String) value);
            } else if (value instanceof Integer) {
                mo61495d(((Integer) value).intValue(), (String) next.getKey());
            } else if (value instanceof HashSet) {
                mo61497f((String) next.getKey(), (HashSet) value);
            }
        }
        this.f63020d.edit().clear().apply();
        mo61492a();
    }

    /* renamed from: a */
    public final void mo61492a() {
        this.f63018b.execute(new C24934a(new HashMap(this.f63019c)));
    }

    /* renamed from: b */
    public final boolean mo61493b(String str) {
        Object obj = this.f63019c.get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    /* renamed from: c */
    public final String mo61494c(String str, String str2) {
        Object obj = this.f63019c.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return str2;
    }

    /* renamed from: d */
    public final void mo61495d(int i, String str) {
        this.f63019c.put(str, Integer.valueOf(i));
        if (this.f63021e.contains(str)) {
            this.f63020d.edit().putInt(str, i).apply();
        }
    }

    /* renamed from: e */
    public final void mo61496e(String str, String str2) {
        this.f63019c.put(str, str2);
        if (this.f63021e.contains(str)) {
            this.f63020d.edit().putString(str, str2).apply();
        }
    }

    /* renamed from: f */
    public final void mo61497f(String str, HashSet hashSet) {
        HashSet hashSet2;
        HashSet hashSet3;
        Class<C21100e> cls = C21100e.class;
        ConcurrentHashMap<String, Object> concurrentHashMap = this.f63019c;
        synchronized (cls) {
            hashSet2 = new HashSet(hashSet);
        }
        concurrentHashMap.put(str, hashSet2);
        if (this.f63021e.contains(str)) {
            SharedPreferences.Editor edit = this.f63020d.edit();
            synchronized (cls) {
                hashSet3 = new HashSet(hashSet);
            }
            edit.putStringSet(str, hashSet3).apply();
        }
    }

    /* renamed from: g */
    public final void mo61498g(String str, boolean z) {
        this.f63019c.put(str, Boolean.valueOf(z));
        if (this.f63021e.contains(str)) {
            this.f63020d.edit().putBoolean(str, z).apply();
        }
    }
}
