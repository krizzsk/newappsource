package v00;

import android.content.ContentValues;
import android.database.Cursor;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import fh0.C23385c;
import java.io.Serializable;
import java.util.Locale;
import lh0.C24307v;
import p977zz.C20964s0;

/* renamed from: v00.c */
public abstract class C20064c implements C23385c {

    /* renamed from: a */
    public final Object f50907a;

    /* renamed from: b */
    public final Object f50908b;

    public /* synthetic */ C20064c(C24307v vVar, C23385c cVar) {
        if (vVar != null) {
            this.f50907a = vVar;
            this.f50908b = cVar == null ? this : cVar;
            return;
        }
        m47563b(0);
        throw null;
    }

    /* renamed from: b */
    public static /* synthetic */ void m47563b(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i == 1 || i == 2)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: c */
    public final Object mo52326c(SQLiteDatabase sQLiteDatabase, ServerId serverId, long j) {
        Object[] objArr = {(String) this.f50907a};
        String str = C20964s0.f52718a;
        Cursor rawQuery = sQLiteDatabase.rawQuery(String.format((Locale) null, "SELECT %s FROM revisions WHERE metro_id = ? AND revision = ?;", objArr), DatabaseUtils.createSelectionArgs(serverId.mo19751c(), Long.toString(j)));
        int columnIndex = rawQuery.getColumnIndex((String) this.f50907a);
        Object obj = this.f50908b;
        if (rawQuery.moveToFirst()) {
            obj = mo52325e(rawQuery, columnIndex);
        }
        rawQuery.close();
        return obj;
    }

    /* renamed from: d */
    public abstract void mo52324d(ContentValues contentValues, String str, Serializable serializable);

    /* renamed from: e */
    public abstract Object mo52325e(Cursor cursor, int i);

    /* renamed from: f */
    public final void mo52327f(SQLiteDatabase sQLiteDatabase, ServerId serverId, long j, Serializable serializable) {
        String createSelection = DatabaseUtils.createSelection("metro_id", "revision");
        String[] createSelectionArgs = DatabaseUtils.createSelectionArgs(serverId.mo19751c(), Long.toString(j));
        if (serializable != null) {
            ContentValues contentValues = new ContentValues(1);
            mo52324d(contentValues, (String) this.f50907a, serializable);
            sQLiteDatabase.update("revisions", contentValues, createSelection, createSelectionArgs);
            return;
        }
        sQLiteDatabase.delete("revisions", createSelection, createSelectionArgs);
    }

    public final C24307v getType() {
        C24307v vVar = (C24307v) this.f50907a;
        if (vVar != null) {
            return vVar;
        }
        m47563b(1);
        throw null;
    }

    public /* synthetic */ C20064c(String str, Object obj) {
        this.f50907a = str;
        this.f50908b = obj;
    }
}
