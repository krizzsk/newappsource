package com.moovit.database.sqlite;

import android.database.Cursor;
import com.moovit.database.sqlite.SQLiteDatabase;
import p177n1.C5802d;

public final class SQLiteDirectCursorDriver implements SQLiteCursorDriver {
    private final C5802d mCancellationSignal;
    private final SQLiteDatabase mDatabase;
    private final String mEditTable;
    private SQLiteQuery mQuery;
    private final String mSql;

    public SQLiteDirectCursorDriver(SQLiteDatabase sQLiteDatabase, String str, String str2, C5802d dVar) {
        this.mDatabase = sQLiteDatabase;
        this.mEditTable = str2;
        this.mSql = str;
        this.mCancellationSignal = dVar;
    }

    public void cursorClosed() {
    }

    public void cursorDeactivated() {
    }

    public void cursorRequeried(Cursor cursor) {
    }

    public Cursor query(SQLiteDatabase.CursorFactory cursorFactory, Object[] objArr) {
        Cursor cursor;
        SQLiteQuery sQLiteQuery = new SQLiteQuery(this.mDatabase, this.mSql, objArr, this.mCancellationSignal);
        if (cursorFactory == null) {
            try {
                cursor = new SQLiteCursor(this, this.mEditTable, sQLiteQuery);
            } catch (RuntimeException e) {
                sQLiteQuery.close();
                throw e;
            }
        } else {
            cursor = cursorFactory.newCursor(this.mDatabase, this, this.mEditTable, sQLiteQuery);
        }
        this.mQuery = sQLiteQuery;
        return cursor;
    }

    public void setBindArguments(String[] strArr) {
        this.mQuery.bindAllArgsAsStrings(strArr);
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("SQLiteDirectCursorDriver: ");
        k.append(this.mSql);
        return k.toString();
    }
}
