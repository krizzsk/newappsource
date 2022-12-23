package p281v2;

import android.database.sqlite.SQLiteStatement;
import p217q2.C6161j;
import p269u2.C6685f;

/* renamed from: v2.d */
public final class C6852d extends C6161j implements C6685f {

    /* renamed from: d */
    public final SQLiteStatement f21204d;

    public C6852d(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f21204d = sQLiteStatement;
    }

    public final long executeInsert() {
        return this.f21204d.executeInsert();
    }

    public final int executeUpdateDelete() {
        return this.f21204d.executeUpdateDelete();
    }
}
