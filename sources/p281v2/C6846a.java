package p281v2;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import p217q2.C6161j;
import p269u2.C6677a;
import p269u2.C6678b;
import p269u2.C6684e;
import p269u2.C6685f;

/* renamed from: v2.a */
public final class C6846a implements C6678b {

    /* renamed from: c */
    public static final String[] f21189c = new String[0];

    /* renamed from: b */
    public final SQLiteDatabase f21190b;

    /* renamed from: v2.a$a */
    public class C6847a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        public final /* synthetic */ C6684e f21191a;

        public C6847a(C6684e eVar) {
            this.f21191a = eVar;
        }

        public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f21191a.mo22145c(new C6161j(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public C6846a(SQLiteDatabase sQLiteDatabase) {
        this.f21190b = sQLiteDatabase;
    }

    /* renamed from: a */
    public final void mo23085a(String str, Object[] objArr) throws SQLException {
        this.f21190b.execSQL(str, objArr);
    }

    public final void beginTransaction() {
        this.f21190b.beginTransaction();
    }

    public final void beginTransactionNonExclusive() {
        this.f21190b.beginTransactionNonExclusive();
    }

    public final void close() throws IOException {
        this.f21190b.close();
    }

    public final C6685f compileStatement(String str) {
        return new C6852d(this.f21190b.compileStatement(str));
    }

    /* renamed from: e */
    public final String mo23087e() {
        return this.f21190b.getPath();
    }

    public final void endTransaction() {
        this.f21190b.endTransaction();
    }

    public final void execSQL(String str) throws SQLException {
        this.f21190b.execSQL(str);
    }

    /* renamed from: f */
    public final Cursor mo23088f(String str) {
        return query(new C6677a(str, (Object) null));
    }

    public final List<Pair<String, String>> getAttachedDbs() {
        return this.f21190b.getAttachedDbs();
    }

    public final boolean inTransaction() {
        return this.f21190b.inTransaction();
    }

    public final boolean isOpen() {
        return this.f21190b.isOpen();
    }

    public final boolean isWriteAheadLoggingEnabled() {
        return this.f21190b.isWriteAheadLoggingEnabled();
    }

    public final Cursor query(C6684e eVar) {
        return this.f21190b.rawQueryWithFactory(new C6847a(eVar), eVar.mo22147e(), f21189c, (String) null);
    }

    public final void setTransactionSuccessful() {
        this.f21190b.setTransactionSuccessful();
    }
}
