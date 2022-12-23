package ud0;

import android.os.Bundle;
import android.util.Log;

/* renamed from: ud0.g */
public final class C25023g implements Cloneable {

    /* renamed from: b */
    public final String f63197b;

    /* renamed from: c */
    public boolean f63198c;

    /* renamed from: d */
    public long f63199d;

    /* renamed from: e */
    public long f63200e;

    /* renamed from: f */
    public long f63201f;

    /* renamed from: g */
    public Bundle f63202g = new Bundle();

    /* renamed from: h */
    public int f63203h = 1;

    /* renamed from: i */
    public int f63204i = 2;

    /* renamed from: j */
    public int f63205j = 0;

    public C25023g(String str) {
        this.f63197b = str;
    }

    /* renamed from: f */
    public final C25023g mo61560f() {
        try {
            return (C25023g) clone();
        } catch (CloneNotSupportedException e) {
            Log.getStackTraceString(e);
            return null;
        }
    }
}
