package p041ca;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
import p001a0.C0016g;

/* renamed from: ca.b0 */
public final class C1811b0 extends SQLiteOpenHelper {

    /* renamed from: d */
    public static final String f6311d;

    /* renamed from: e */
    public static int f6312e = 5;

    /* renamed from: f */
    public static final List<C1812a> f6313f = Arrays.asList(new C1812a[]{new C1839w(), new C1840x(), new C1841y(), new C1842z(), new C1809a0()});

    /* renamed from: b */
    public final int f6314b;

    /* renamed from: c */
    public boolean f6315c = false;

    /* renamed from: ca.b0$a */
    public interface C1812a {
        /* renamed from: a */
        void mo6630a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        StringBuilder k = C13555b.m33972k("INSERT INTO global_log_event_state VALUES (");
        k.append(System.currentTimeMillis());
        k.append(")");
        f6311d = k.toString();
    }

    public C1811b0(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f6314b = i;
    }

    /* renamed from: a */
    public static void m5131a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<C1812a> list = f6313f;
        if (i2 <= list.size()) {
            while (i < i2) {
                f6313f.get(i).mo6630a(sQLiteDatabase);
                i++;
            }
            return;
        }
        StringBuilder s = C0016g.m35s("Migration from ", i, " to ", i2, " was requested, but cannot be performed. Only ");
        s.append(list.size());
        s.append(" migrations are provided");
        throw new IllegalArgumentException(s.toString());
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f6315c = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.f6314b;
        if (!this.f6315c) {
            onConfigure(sQLiteDatabase);
        }
        m5131a(sQLiteDatabase, 0, i);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f6315c) {
            onConfigure(sQLiteDatabase);
        }
        m5131a(sQLiteDatabase, 0, i2);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f6315c) {
            onConfigure(sQLiteDatabase);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.f6315c) {
            onConfigure(sQLiteDatabase);
        }
        m5131a(sQLiteDatabase, i, i2);
    }
}
