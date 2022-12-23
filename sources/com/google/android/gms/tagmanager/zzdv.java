package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
final class zzdv extends SQLiteOpenHelper {
    public final /* synthetic */ zzdw zza;
    private boolean zzb;
    private long zzc = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdv(zzdw zzdw, Context context, String str) {
        super(context, "gtm_urls.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzdw;
    }

    public final SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        if (!this.zzb || this.zzc + 3600000 <= this.zza.zzg.currentTimeMillis()) {
            this.zzb = true;
            this.zzc = this.zza.zzg.currentTimeMillis();
            try {
                sQLiteDatabase = super.getWritableDatabase();
            } catch (SQLiteException unused) {
                this.zza.zzd.getDatabasePath(this.zza.zze).delete();
                sQLiteDatabase = null;
            }
            if (sQLiteDatabase == null) {
                sQLiteDatabase = super.getWritableDatabase();
            }
            this.zzb = false;
            return sQLiteDatabase;
        }
        throw new SQLiteException("Database creation failed");
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzbv.zza(sQLiteDatabase.getPath());
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008b, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0086 */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r13) {
        /*
            r12 = this;
            java.lang.String r0 = "Error querying for table gtm_hits"
            java.lang.String r1 = "gtm_hits"
            r2 = 0
            java.lang.String r3 = "name"
            java.lang.String[] r6 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0086 }
            java.lang.String[] r8 = new java.lang.String[]{r1}     // Catch:{ SQLiteException -> 0x0086 }
            java.lang.String r5 = "SQLITE_MASTER"
            java.lang.String r7 = "name=?"
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r13
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0086 }
            boolean r0 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0082, all -> 0x007f }
            r1.close()
            if (r0 != 0) goto L_0x0025
            goto L_0x008e
        L_0x0025:
            java.lang.String r0 = "SELECT * FROM gtm_hits WHERE 0"
            android.database.Cursor r13 = r13.rawQuery(r0, r2)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.String[] r1 = r13.getColumnNames()     // Catch:{ all -> 0x007a }
            r2 = 0
        L_0x0035:
            int r3 = r1.length     // Catch:{ all -> 0x007a }
            if (r2 >= r3) goto L_0x0040
            r3 = r1[r2]     // Catch:{ all -> 0x007a }
            r0.add(r3)     // Catch:{ all -> 0x007a }
            int r2 = r2 + 1
            goto L_0x0035
        L_0x0040:
            r13.close()
            java.lang.String r13 = "hit_id"
            boolean r13 = r0.remove(r13)
            if (r13 == 0) goto L_0x0072
            java.lang.String r13 = "hit_url"
            boolean r13 = r0.remove(r13)
            if (r13 == 0) goto L_0x0072
            java.lang.String r13 = "hit_time"
            boolean r13 = r0.remove(r13)
            if (r13 == 0) goto L_0x0072
            java.lang.String r13 = "hit_first_send_time"
            boolean r13 = r0.remove(r13)
            if (r13 == 0) goto L_0x0072
            boolean r13 = r0.isEmpty()
            if (r13 == 0) goto L_0x006a
            return
        L_0x006a:
            android.database.sqlite.SQLiteException r13 = new android.database.sqlite.SQLiteException
            java.lang.String r0 = "Database has extra columns"
            r13.<init>(r0)
            throw r13
        L_0x0072:
            android.database.sqlite.SQLiteException r13 = new android.database.sqlite.SQLiteException
            java.lang.String r0 = "Database column missing"
            r13.<init>(r0)
            throw r13
        L_0x007a:
            r0 = move-exception
            r13.close()
            throw r0
        L_0x007f:
            r13 = move-exception
            r2 = r1
            goto L_0x0096
        L_0x0082:
            r2 = r1
            goto L_0x0086
        L_0x0084:
            r13 = move-exception
            goto L_0x0096
        L_0x0086:
            com.google.android.gms.tagmanager.zzdh.zzc(r0)     // Catch:{ all -> 0x0084 }
            if (r2 == 0) goto L_0x008e
            r2.close()
        L_0x008e:
            java.lang.String r0 = com.google.android.gms.tagmanager.zzdw.zza
            r13.execSQL(r0)
            return
        L_0x0096:
            if (r2 == 0) goto L_0x009b
            r2.close()
        L_0x009b:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzdv.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
