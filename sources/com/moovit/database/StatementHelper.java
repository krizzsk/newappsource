package com.moovit.database;

import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.database.sqlite.SQLiteStatement;
import com.moovit.network.model.ServerId;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import mf0.C24361g;
import p001a0.C0016g;
import p977zz.C20964s0;

public class StatementHelper {
    public static final String[] EMPTY_COLUMNS = new String[0];
    private final Map<String, Integer> columns;
    private final String sql;
    private final Map<String, Integer> whereColumns;

    public StatementHelper(String str, String[] strArr) {
        this(str, strArr, EMPTY_COLUMNS);
    }

    private void bind(SQLiteStatement sQLiteStatement, int i, long j) {
        sQLiteStatement.bindLong(i, j);
    }

    private void bindNull(SQLiteStatement sQLiteStatement, int i) {
        sQLiteStatement.bindNull(i);
    }

    private static String createDeleteSqlCommand(String str, String... strArr) {
        StringBuilder t = C0016g.m36t("DELETE FROM ", str);
        if (!C24361g.m61154X(strArr)) {
            t.append(" WHERE ");
            t.append(DatabaseUtils.createSelection(strArr));
        }
        return t.toString();
    }

    private static String createInsertSqlCommand(String str, int i, String... strArr) {
        StringBuilder k = C13555b.m33972k("INSERT ");
        k.append(DatabaseUtils.getConflictAlgorithm(i));
        k.append(" INTO ");
        C21100e.m49373x(str, "table");
        k.append(str);
        k.append('(');
        k.append(C20964s0.m49102t(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, strArr));
        k.append(") VALUES (");
        k.append(C20964s0.m49100r(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, Collections.nCopies(strArr.length, "?")));
        k.append(");");
        return k.toString();
    }

    private static String createUpdateSqlCommand(String str, int i, String[] strArr, String... strArr2) {
        StringBuilder k = C13555b.m33972k("UPDATE ");
        k.append(DatabaseUtils.getConflictAlgorithm(i));
        k.append(' ');
        k.append(str);
        k.append(" SET ");
        k.append(C20964s0.m49102t("=?,", strArr2));
        k.append("=?");
        if (!C24361g.m61154X(strArr)) {
            k.append(" WHERE ");
            k.append(DatabaseUtils.createSelection(strArr));
        }
        return k.toString();
    }

    public static StatementHelper newDeleteHelper(String str, String... strArr) {
        return new StatementHelper(createDeleteSqlCommand(str, strArr), EMPTY_COLUMNS, strArr);
    }

    public static StatementHelper newInsertHelper(String str, String... strArr) {
        return newInsertHelper(str, 0, strArr);
    }

    public static StatementHelper newUpdateHelper(String str, int i, String[] strArr, String... strArr2) {
        if (strArr2.length != 0) {
            return new StatementHelper(createUpdateSqlCommand(str, i, strArr, strArr2), strArr2, strArr);
        }
        throw new IllegalArgumentException("Columns may not be zero length");
    }

    public void bindNullValue(SQLiteStatement sQLiteStatement, String str) {
        bindNull(sQLiteStatement, this.columns.get(str).intValue());
    }

    public void bindValue(SQLiteStatement sQLiteStatement, String str, long j) {
        bind(sQLiteStatement, this.columns.get(str).intValue(), j);
    }

    public void bindWhereArg(SQLiteStatement sQLiteStatement, String str, long j) {
        bind(sQLiteStatement, this.whereColumns.get(str).intValue(), j);
    }

    public SQLiteStatement prepare(SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase.compileStatement(this.sql);
    }

    public StatementHelper(String str, String[] strArr, String[] strArr2) {
        C21100e.m49373x(str, "sql");
        this.sql = str;
        HashMap hashMap = new HashMap(strArr.length);
        int i = 0;
        while (i < strArr.length) {
            String str2 = strArr[i];
            i++;
            hashMap.put(str2, Integer.valueOf(i));
        }
        this.columns = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap(strArr2.length);
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            hashMap2.put(strArr2[i2], Integer.valueOf(strArr.length + i2 + 1));
        }
        this.whereColumns = Collections.unmodifiableMap(hashMap2);
    }

    private void bind(SQLiteStatement sQLiteStatement, int i, String str) {
        if (str == null) {
            sQLiteStatement.bindNull(i);
        } else {
            sQLiteStatement.bindString(i, str);
        }
    }

    public static StatementHelper newInsertHelper(String str, int i, String... strArr) {
        if (strArr.length != 0) {
            return new StatementHelper(createInsertSqlCommand(str, i, strArr), strArr);
        }
        throw new IllegalArgumentException("Columns may not be zero length");
    }

    public void bindValue(SQLiteStatement sQLiteStatement, String str, String str2) {
        bind(sQLiteStatement, this.columns.get(str).intValue(), str2);
    }

    public void bindWhereArg(SQLiteStatement sQLiteStatement, String str, String str2) {
        bind(sQLiteStatement, this.whereColumns.get(str).intValue(), str2);
    }

    public void bindValue(SQLiteStatement sQLiteStatement, String str, byte[] bArr) {
        bind(sQLiteStatement, this.columns.get(str).intValue(), bArr);
    }

    public void bindWhereArg(SQLiteStatement sQLiteStatement, String str, ServerId serverId) {
        bind(sQLiteStatement, this.whereColumns.get(str).intValue(), (long) serverId.f15142b);
    }

    private void bind(SQLiteStatement sQLiteStatement, int i, byte[] bArr) {
        if (bArr == null) {
            sQLiteStatement.bindNull(i);
        } else {
            sQLiteStatement.bindBlob(i, bArr);
        }
    }

    public void bindValue(SQLiteStatement sQLiteStatement, String str, boolean z) {
        bind(sQLiteStatement, this.columns.get(str).intValue(), z);
    }

    public void bindValue(SQLiteStatement sQLiteStatement, String str, ServerId serverId) {
        bind(sQLiteStatement, this.columns.get(str).intValue(), (long) serverId.f15142b);
    }

    private void bind(SQLiteStatement sQLiteStatement, int i, boolean z) {
        sQLiteStatement.bindLong(i, z ? 1 : 0);
    }
}
