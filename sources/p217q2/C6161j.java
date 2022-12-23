package p217q2;

import android.database.sqlite.SQLiteProgram;
import java.util.List;
import p269u2.C6683d;

/* renamed from: q2.j */
public class C6161j implements C6683d {

    /* renamed from: b */
    public final /* synthetic */ int f19533b = 1;

    /* renamed from: c */
    public Object f19534c;

    public C6161j(SQLiteProgram sQLiteProgram) {
        this.f19534c = sQLiteProgram;
    }

    /* renamed from: a */
    public final void mo22138a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= ((List) this.f19534c).size()) {
            for (int size = ((List) this.f19534c).size(); size <= i2; size++) {
                ((List) this.f19534c).add((Object) null);
            }
        }
        ((List) this.f19534c).set(i2, obj);
    }

    public final void bindBlob(int i, byte[] bArr) {
        switch (this.f19533b) {
            case 0:
                mo22138a(i, bArr);
                return;
            default:
                ((SQLiteProgram) this.f19534c).bindBlob(i, bArr);
                return;
        }
    }

    public final void bindDouble(int i, double d) {
        switch (this.f19533b) {
            case 0:
                mo22138a(i, Double.valueOf(d));
                return;
            default:
                ((SQLiteProgram) this.f19534c).bindDouble(i, d);
                return;
        }
    }

    public final void bindLong(int i, long j) {
        switch (this.f19533b) {
            case 0:
                mo22138a(i, Long.valueOf(j));
                return;
            default:
                ((SQLiteProgram) this.f19534c).bindLong(i, j);
                return;
        }
    }

    public final void bindNull(int i) {
        switch (this.f19533b) {
            case 0:
                mo22138a(i, (Object) null);
                return;
            default:
                ((SQLiteProgram) this.f19534c).bindNull(i);
                return;
        }
    }

    public final void bindString(int i, String str) {
        switch (this.f19533b) {
            case 0:
                mo22138a(i, str);
                return;
            default:
                ((SQLiteProgram) this.f19534c).bindString(i, str);
                return;
        }
    }

    public final void close() {
        switch (this.f19533b) {
            case 0:
                return;
            default:
                ((SQLiteProgram) this.f19534c).close();
                return;
        }
    }
}
