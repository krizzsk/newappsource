package com.moovit.database.sqlite;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import com.moovit.database.CursorWindow;
import p177n1.C5802d;

public final class SQLiteQuery extends SQLiteProgram {
    private final C5802d mCancellationSignal;

    public SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, C5802d dVar) {
        super(sQLiteDatabase, str, objArr, dVar);
        this.mCancellationSignal = dVar;
    }

    public int fillWindow(CursorWindow cursorWindow, int i, int i2, boolean z) {
        acquireReference();
        try {
            cursorWindow.acquireReference();
            int executeForCursorWindow = getSession().executeForCursorWindow(getSql(), getBindArgs(), cursorWindow, i, i2, z, getConnectionFlags(), this.mCancellationSignal);
            cursorWindow.releaseReference();
            releaseReference();
            return executeForCursorWindow;
        } catch (SQLiteDatabaseCorruptException e) {
            onCorruption();
            throw e;
        } catch (SQLiteException e2) {
            e2.getMessage();
            getSql();
            throw e2;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("SQLiteQuery: ");
        k.append(getSql());
        return k.toString();
    }
}
