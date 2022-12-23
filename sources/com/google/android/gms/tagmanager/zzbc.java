package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
final class zzbc extends SQLiteOpenHelper {
    public final /* synthetic */ zzbe zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbc(zzbe zzbe, Context context, String str) {
        super(context, "google_tagmanager.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzbe;
    }

    public final SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = super.getWritableDatabase();
        } catch (SQLiteException unused) {
            this.zza.zzc.getDatabasePath("google_tagmanager.db").delete();
            sQLiteDatabase = null;
        }
        if (sQLiteDatabase == null) {
            return super.getWritableDatabase();
        }
        return sQLiteDatabase;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzbv.zza(sQLiteDatabase.getPath());
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:35|34|37|38|(1:40)|41|42) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0085, code lost:
        r13 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0099, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0087 */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r13) {
        /*
            r12 = this;
            java.lang.String r0 = "Error querying for table datalayer"
            java.lang.String r1 = "datalayer"
            r2 = 0
            java.lang.String r3 = "name"
            java.lang.String[] r6 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0087 }
            java.lang.String[] r8 = new java.lang.String[]{r1}     // Catch:{ SQLiteException -> 0x0087 }
            java.lang.String r5 = "SQLITE_MASTER"
            java.lang.String r7 = "name=?"
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r13
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0087 }
            boolean r0 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0083, all -> 0x0080 }
            r1.close()
            if (r0 != 0) goto L_0x0025
            goto L_0x008f
        L_0x0025:
            java.lang.String r0 = "SELECT * FROM datalayer WHERE 0"
            android.database.Cursor r13 = r13.rawQuery(r0, r2)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.String[] r1 = r13.getColumnNames()     // Catch:{ all -> 0x007b }
            r2 = 0
        L_0x0035:
            int r3 = r1.length     // Catch:{ all -> 0x007b }
            if (r2 >= r3) goto L_0x0040
            r3 = r1[r2]     // Catch:{ all -> 0x007b }
            r0.add(r3)     // Catch:{ all -> 0x007b }
            int r2 = r2 + 1
            goto L_0x0035
        L_0x0040:
            r13.close()
            java.lang.String r13 = "key"
            boolean r13 = r0.remove(r13)
            if (r13 == 0) goto L_0x0073
            java.lang.String r13 = "value"
            boolean r13 = r0.remove(r13)
            if (r13 == 0) goto L_0x0073
            java.lang.String r13 = "ID"
            boolean r13 = r0.remove(r13)
            if (r13 == 0) goto L_0x0073
            java.lang.String r13 = "expires"
            boolean r13 = r0.remove(r13)
            if (r13 == 0) goto L_0x0073
            boolean r13 = r0.isEmpty()
            if (r13 == 0) goto L_0x006b
            return
        L_0x006b:
            android.database.sqlite.SQLiteException r13 = new android.database.sqlite.SQLiteException
            java.lang.String r0 = "Database has extra columns"
            r13.<init>(r0)
            throw r13
        L_0x0073:
            android.database.sqlite.SQLiteException r13 = new android.database.sqlite.SQLiteException
            java.lang.String r0 = "Database column missing"
            r13.<init>(r0)
            throw r13
        L_0x007b:
            r0 = move-exception
            r13.close()
            throw r0
        L_0x0080:
            r13 = move-exception
            r2 = r1
            goto L_0x0097
        L_0x0083:
            r2 = r1
            goto L_0x0087
        L_0x0085:
            r13 = move-exception
            goto L_0x0097
        L_0x0087:
            com.google.android.gms.tagmanager.zzdh.zzc(r0)     // Catch:{ all -> 0x0085 }
            if (r2 == 0) goto L_0x008f
            r2.close()
        L_0x008f:
            java.lang.String r0 = com.google.android.gms.tagmanager.zzbe.zza
            r13.execSQL(r0)
            return
        L_0x0097:
            if (r2 == 0) goto L_0x009c
            r2.close()
        L_0x009c:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzbc.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
