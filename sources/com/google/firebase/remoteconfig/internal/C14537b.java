package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;

/* renamed from: com.google.firebase.remoteconfig.internal.b */
public final class C14537b {

    /* renamed from: d */
    public static final Date f36698d = new Date(-1);

    /* renamed from: e */
    public static final Date f36699e = new Date(-1);

    /* renamed from: a */
    public final SharedPreferences f36700a;

    /* renamed from: b */
    public final Object f36701b = new Object();

    /* renamed from: c */
    public final Object f36702c = new Object();

    /* renamed from: com.google.firebase.remoteconfig.internal.b$a */
    public static class C14538a {

        /* renamed from: a */
        public int f36703a;

        /* renamed from: b */
        public Date f36704b;

        public C14538a(int i, Date date) {
            this.f36703a = i;
            this.f36704b = date;
        }
    }

    public C14537b(SharedPreferences sharedPreferences) {
        this.f36700a = sharedPreferences;
    }

    /* renamed from: a */
    public final C14538a mo43595a() {
        C14538a aVar;
        synchronized (this.f36702c) {
            aVar = new C14538a(this.f36700a.getInt("num_failed_fetches", 0), new Date(this.f36700a.getLong("backoff_end_time_in_millis", -1)));
        }
        return aVar;
    }

    /* renamed from: b */
    public final void mo43596b(int i, Date date) {
        synchronized (this.f36702c) {
            this.f36700a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
