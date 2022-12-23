package p269u2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.io.File;
import p281v2.C6846a;

/* renamed from: u2.c */
public interface C6679c extends Closeable {

    /* renamed from: u2.c$a */
    public static abstract class C6680a {

        /* renamed from: a */
        public final int f20760a;

        public C6680a(int i) {
            this.f20760a = i;
        }

        /* renamed from: a */
        public static void m15769a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        public abstract void mo5201b();

        /* renamed from: c */
        public abstract void mo5202c(C6846a aVar);

        /* renamed from: d */
        public abstract void mo5203d(C6846a aVar, int i, int i2);

        /* renamed from: e */
        public abstract void mo5204e(C6846a aVar);

        /* renamed from: f */
        public abstract void mo5205f(C6846a aVar, int i, int i2);
    }

    /* renamed from: u2.c$b */
    public static class C6681b {

        /* renamed from: a */
        public final Context f20761a;

        /* renamed from: b */
        public final String f20762b;

        /* renamed from: c */
        public final C6680a f20763c;

        /* renamed from: d */
        public final boolean f20764d;

        public C6681b(Context context, String str, C6680a aVar, boolean z) {
            this.f20761a = context;
            this.f20762b = str;
            this.f20763c = aVar;
            this.f20764d = z;
        }
    }

    /* renamed from: u2.c$c */
    public interface C6682c {
        /* renamed from: a */
        C6679c mo20274a(C6681b bVar);
    }

    void close();

    String getDatabaseName();

    C6678b getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
