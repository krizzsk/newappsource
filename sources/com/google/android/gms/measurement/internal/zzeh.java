package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.util.VisibleForTesting;

public final class zzeh extends zzf {
    private final zzeg zza;
    private boolean zzb;

    public zzeh(zzfy zzfy) {
        super(zzfy);
        Context zzau = this.zzs.zzau();
        this.zzs.zzf();
        this.zza = new zzeg(this, zzau, "google_app_measurement_local.db");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r3v5, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v8, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c8 A[SYNTHETIC, Splitter:B:47:0x00c8] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x011e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x011e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x011e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzq(int r14, byte[] r15) {
        /*
            r13 = this;
            r13.zzg()
            boolean r0 = r13.zzb
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.String r2 = "type"
            r0.put(r2, r14)
            java.lang.String r14 = "entry"
            r0.put(r14, r15)
            com.google.android.gms.measurement.internal.zzfy r14 = r13.zzs
            r14.zzf()
            r14 = 5
            r15 = 0
            r2 = 5
        L_0x0025:
            if (r15 >= r14) goto L_0x0134
            r14 = 1
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r13.zzh()     // Catch:{ SQLiteFullException -> 0x00ff, SQLiteDatabaseLockedException -> 0x00ed, SQLiteException -> 0x00c4, all -> 0x00c0 }
            if (r4 != 0) goto L_0x0032
            r13.zzb = r14     // Catch:{ SQLiteFullException -> 0x00be, SQLiteDatabaseLockedException -> 0x00ee, SQLiteException -> 0x00ba }
            return r1
        L_0x0032:
            r4.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00be, SQLiteDatabaseLockedException -> 0x00ee, SQLiteException -> 0x00ba }
            java.lang.String r5 = "select count(1) from messages"
            android.database.Cursor r5 = r4.rawQuery(r5, r3)     // Catch:{ SQLiteFullException -> 0x00be, SQLiteDatabaseLockedException -> 0x00ee, SQLiteException -> 0x00ba }
            r6 = 0
            if (r5 == 0) goto L_0x0050
            boolean r8 = r5.moveToFirst()     // Catch:{ SQLiteFullException -> 0x004e, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x004c, all -> 0x004a }
            if (r8 == 0) goto L_0x0050
            long r6 = r5.getLong(r1)     // Catch:{ SQLiteFullException -> 0x004e, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x004c, all -> 0x004a }
            goto L_0x0050
        L_0x004a:
            r14 = move-exception
            goto L_0x00ae
        L_0x004c:
            r14 = move-exception
            goto L_0x00b1
        L_0x004e:
            r14 = move-exception
            goto L_0x00b5
        L_0x0050:
            java.lang.String r8 = "messages"
            r9 = 100000(0x186a0, double:4.94066E-319)
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x009b
            com.google.android.gms.measurement.internal.zzfy r11 = r13.zzs     // Catch:{ SQLiteFullException -> 0x004e, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x004c, all -> 0x004a }
            com.google.android.gms.measurement.internal.zzeo r11 = r11.zzay()     // Catch:{ SQLiteFullException -> 0x004e, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x004c, all -> 0x004a }
            com.google.android.gms.measurement.internal.zzem r11 = r11.zzd()     // Catch:{ SQLiteFullException -> 0x004e, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x004c, all -> 0x004a }
            java.lang.String r12 = "Data loss, local db full"
            r11.zza(r12)     // Catch:{ SQLiteFullException -> 0x004e, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x004c, all -> 0x004a }
            long r9 = r9 - r6
            r6 = 1
            long r9 = r9 + r6
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ SQLiteFullException -> 0x004e, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x004c, all -> 0x004a }
            java.lang.String r6 = java.lang.Long.toString(r9)     // Catch:{ SQLiteFullException -> 0x004e, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x004c, all -> 0x004a }
            r14[r1] = r6     // Catch:{ SQLiteFullException -> 0x004e, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x004c, all -> 0x004a }
            java.lang.String r1 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            int r14 = r4.delete(r8, r1, r14)     // Catch:{ SQLiteFullException -> 0x004e, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x004c, all -> 0x004a }
            long r6 = (long) r14     // Catch:{ SQLiteFullException -> 0x004e, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x004c, all -> 0x004a }
            int r14 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r14 == 0) goto L_0x009b
            com.google.android.gms.measurement.internal.zzfy r14 = r13.zzs     // Catch:{ SQLiteFullException -> 0x004e, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x004c, all -> 0x004a }
            com.google.android.gms.measurement.internal.zzeo r14 = r14.zzay()     // Catch:{ SQLiteFullException -> 0x004e, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x004c, all -> 0x004a }
            com.google.android.gms.measurement.internal.zzem r14 = r14.zzd()     // Catch:{ SQLiteFullException -> 0x004e, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x004c, all -> 0x004a }
            java.lang.String r1 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r11 = java.lang.Long.valueOf(r9)     // Catch:{ SQLiteFullException -> 0x004e, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x004c, all -> 0x004a }
            java.lang.Long r12 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteFullException -> 0x004e, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x004c, all -> 0x004a }
            long r9 = r9 - r6
            java.lang.Long r6 = java.lang.Long.valueOf(r9)     // Catch:{ SQLiteFullException -> 0x004e, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x004c, all -> 0x004a }
            r14.zzd(r1, r11, r12, r6)     // Catch:{ SQLiteFullException -> 0x004e, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x004c, all -> 0x004a }
        L_0x009b:
            r4.insertOrThrow(r8, r3, r0)     // Catch:{ SQLiteFullException -> 0x004e, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x004c, all -> 0x004a }
            r4.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x004e, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x004c, all -> 0x004a }
            r4.endTransaction()     // Catch:{ SQLiteFullException -> 0x004e, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x004c, all -> 0x004a }
            if (r5 == 0) goto L_0x00a9
            r5.close()
        L_0x00a9:
            r4.close()
            r14 = 1
            return r14
        L_0x00ae:
            r3 = r5
            goto L_0x0129
        L_0x00b1:
            r3 = r5
            goto L_0x00bb
        L_0x00b3:
            r3 = r5
            goto L_0x00ee
        L_0x00b5:
            r3 = r5
            goto L_0x0101
        L_0x00b7:
            r14 = move-exception
            goto L_0x0129
        L_0x00ba:
            r14 = move-exception
        L_0x00bb:
            r1 = r3
            r3 = r4
            goto L_0x00c6
        L_0x00be:
            r14 = move-exception
            goto L_0x0101
        L_0x00c0:
            r14 = move-exception
            r4 = r3
            goto L_0x0129
        L_0x00c4:
            r14 = move-exception
            r1 = r3
        L_0x00c6:
            if (r3 == 0) goto L_0x00d1
            boolean r4 = r3.inTransaction()     // Catch:{ all -> 0x00eb }
            if (r4 == 0) goto L_0x00d1
            r3.endTransaction()     // Catch:{ all -> 0x00eb }
        L_0x00d1:
            com.google.android.gms.measurement.internal.zzfy r4 = r13.zzs     // Catch:{ all -> 0x00eb }
            com.google.android.gms.measurement.internal.zzeo r4 = r4.zzay()     // Catch:{ all -> 0x00eb }
            com.google.android.gms.measurement.internal.zzem r4 = r4.zzd()     // Catch:{ all -> 0x00eb }
            java.lang.String r5 = "Error writing entry to local database"
            r4.zzb(r5, r14)     // Catch:{ all -> 0x00eb }
            r14 = 1
            r13.zzb = r14     // Catch:{ all -> 0x00eb }
            if (r1 == 0) goto L_0x00e8
            r1.close()
        L_0x00e8:
            if (r3 == 0) goto L_0x011e
            goto L_0x011b
        L_0x00eb:
            r14 = move-exception
            goto L_0x0127
        L_0x00ed:
            r4 = r3
        L_0x00ee:
            long r5 = (long) r2
            android.os.SystemClock.sleep(r5)     // Catch:{ all -> 0x00b7 }
            int r2 = r2 + 20
            if (r3 == 0) goto L_0x00f9
            r3.close()
        L_0x00f9:
            if (r4 == 0) goto L_0x011e
            r4.close()
            goto L_0x011e
        L_0x00ff:
            r14 = move-exception
            r4 = r3
        L_0x0101:
            com.google.android.gms.measurement.internal.zzfy r1 = r13.zzs     // Catch:{ all -> 0x0124 }
            com.google.android.gms.measurement.internal.zzeo r1 = r1.zzay()     // Catch:{ all -> 0x0124 }
            com.google.android.gms.measurement.internal.zzem r1 = r1.zzd()     // Catch:{ all -> 0x0124 }
            java.lang.String r5 = "Error writing entry; local database full"
            r1.zzb(r5, r14)     // Catch:{ all -> 0x0124 }
            r14 = 1
            r13.zzb = r14     // Catch:{ all -> 0x0124 }
            if (r3 == 0) goto L_0x0118
            r3.close()
        L_0x0118:
            if (r4 == 0) goto L_0x011e
            r3 = r4
        L_0x011b:
            r3.close()
        L_0x011e:
            int r15 = r15 + 1
            r1 = 0
            r14 = 5
            goto L_0x0025
        L_0x0124:
            r14 = move-exception
            r1 = r3
            r3 = r4
        L_0x0127:
            r4 = r3
            r3 = r1
        L_0x0129:
            if (r3 == 0) goto L_0x012e
            r3.close()
        L_0x012e:
            if (r4 == 0) goto L_0x0133
            r4.close()
        L_0x0133:
            throw r14
        L_0x0134:
            com.google.android.gms.measurement.internal.zzfy r14 = r13.zzs
            java.lang.String r15 = "Failed to write entry to local database"
            p358af.C13437d.m33710p(r14, r15)
            r14 = 0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeh.zzq(int, byte[]):boolean");
    }

    public final boolean zzf() {
        return false;
    }

    @VisibleForTesting
    public final SQLiteDatabase zzh() throws SQLiteException {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzb = true;
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:59|60|61|62) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:74|75|76|77) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:46|47|48|49|196) */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r1.zzs.zzay().zzd().zza("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r1.zzs.zzay().zzd().zza("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r12.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r1.zzs.zzay().zzd().zza("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r12.recycle();
        r0 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00c6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x0130 */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01dc A[SYNTHETIC, Splitter:B:123:0x01dc] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0200 A[SYNTHETIC, Splitter:B:149:0x0200] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x01df A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x024c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x024c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x024c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zzi(int r23) {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r2 = "rowid"
            java.lang.String r3 = "Error reading entries from local database"
            r22.zzg()
            boolean r0 = r1.zzb
            r4 = 0
            if (r0 == 0) goto L_0x000f
            return r4
        L_0x000f:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r0 = r22.zzl()
            if (r0 == 0) goto L_0x0266
            r6 = 5
            r7 = 0
            r0 = 0
            r8 = 5
            r8 = 0
            r9 = 5
        L_0x0020:
            if (r8 >= r6) goto L_0x025e
            r10 = 1
            android.database.sqlite.SQLiteDatabase r15 = r22.zzh()     // Catch:{ SQLiteFullException -> 0x0230, SQLiteDatabaseLockedException -> 0x0220, SQLiteException -> 0x01fb, all -> 0x01f8 }
            if (r15 != 0) goto L_0x002c
            r1.zzb = r10     // Catch:{ SQLiteFullException -> 0x01f3, SQLiteDatabaseLockedException -> 0x01ef, SQLiteException -> 0x01ea, all -> 0x01e7 }
            return r4
        L_0x002c:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x01f3, SQLiteDatabaseLockedException -> 0x01ef, SQLiteException -> 0x01ea, all -> 0x01e7 }
            java.lang.String r0 = "3"
            java.lang.String r12 = "messages"
            java.lang.String[] r13 = new java.lang.String[]{r2}     // Catch:{ all -> 0x01d7 }
            java.lang.String r14 = "type=?"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x01d7 }
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid desc"
            java.lang.String r19 = "1"
            r11 = r15
            r23 = r15
            r15 = r0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01d3 }
            boolean r0 = r11.moveToFirst()     // Catch:{ all -> 0x01cf }
            r20 = -1
            if (r0 == 0) goto L_0x005e
            long r12 = r11.getLong(r7)     // Catch:{ all -> 0x01cf }
            r11.close()     // Catch:{ SQLiteFullException -> 0x01cb, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            goto L_0x0063
        L_0x005e:
            r11.close()     // Catch:{ SQLiteFullException -> 0x01cb, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            r12 = r20
        L_0x0063:
            int r0 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = "rowid<?"
            java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ SQLiteFullException -> 0x01cb, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ SQLiteFullException -> 0x01cb, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            r11[r7] = r12     // Catch:{ SQLiteFullException -> 0x01cb, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            r14 = r0
            r15 = r11
            goto L_0x0076
        L_0x0074:
            r14 = r4
            r15 = r14
        L_0x0076:
            java.lang.String r0 = "type"
            java.lang.String r11 = "entry"
            java.lang.String[] r13 = new java.lang.String[]{r2, r0, r11}     // Catch:{ SQLiteFullException -> 0x01cb, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            java.lang.String r12 = "messages"
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid asc"
            r0 = 100
            java.lang.String r19 = java.lang.Integer.toString(r0)     // Catch:{ SQLiteFullException -> 0x01cb, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            r11 = r23
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteFullException -> 0x01cb, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
        L_0x0093:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            if (r0 == 0) goto L_0x0173
            long r20 = r11.getLong(r7)     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            int r0 = r11.getInt(r10)     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            r12 = 2
            byte[] r13 = r11.getBlob(r12)     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            if (r0 != 0) goto L_0x00dd
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            int r0 = r13.length     // Catch:{ ParseException -> 0x00c6 }
            r12.unmarshall(r13, r7, r0)     // Catch:{ ParseException -> 0x00c6 }
            r12.setDataPosition(r7)     // Catch:{ ParseException -> 0x00c6 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzaw> r0 = com.google.android.gms.measurement.internal.zzaw.CREATOR     // Catch:{ ParseException -> 0x00c6 }
            java.lang.Object r0 = r0.createFromParcel(r12)     // Catch:{ ParseException -> 0x00c6 }
            com.google.android.gms.measurement.internal.zzaw r0 = (com.google.android.gms.measurement.internal.zzaw) r0     // Catch:{ ParseException -> 0x00c6 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            if (r0 == 0) goto L_0x0093
            r5.add(r0)     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            goto L_0x0093
        L_0x00c4:
            r0 = move-exception
            goto L_0x00d9
        L_0x00c6:
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzs     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.measurement.internal.zzeo r0 = r0.zzay()     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzd()     // Catch:{ all -> 0x00c4 }
            java.lang.String r13 = "Failed to load event from local database"
            r0.zza(r13)     // Catch:{ all -> 0x00c4 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            goto L_0x0093
        L_0x00d9:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            throw r0     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
        L_0x00dd:
            if (r0 != r10) goto L_0x0115
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            int r0 = r13.length     // Catch:{ ParseException -> 0x00f8 }
            r12.unmarshall(r13, r7, r0)     // Catch:{ ParseException -> 0x00f8 }
            r12.setDataPosition(r7)     // Catch:{ ParseException -> 0x00f8 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzlc> r0 = com.google.android.gms.measurement.internal.zzlc.CREATOR     // Catch:{ ParseException -> 0x00f8 }
            java.lang.Object r0 = r0.createFromParcel(r12)     // Catch:{ ParseException -> 0x00f8 }
            com.google.android.gms.measurement.internal.zzlc r0 = (com.google.android.gms.measurement.internal.zzlc) r0     // Catch:{ ParseException -> 0x00f8 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            goto L_0x010b
        L_0x00f6:
            r0 = move-exception
            goto L_0x0111
        L_0x00f8:
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzs     // Catch:{ all -> 0x00f6 }
            com.google.android.gms.measurement.internal.zzeo r0 = r0.zzay()     // Catch:{ all -> 0x00f6 }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzd()     // Catch:{ all -> 0x00f6 }
            java.lang.String r13 = "Failed to load user property from local database"
            r0.zza(r13)     // Catch:{ all -> 0x00f6 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            r0 = r4
        L_0x010b:
            if (r0 == 0) goto L_0x0093
            r5.add(r0)     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            goto L_0x0093
        L_0x0111:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            throw r0     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
        L_0x0115:
            if (r0 != r12) goto L_0x014e
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            int r0 = r13.length     // Catch:{ ParseException -> 0x0130 }
            r12.unmarshall(r13, r7, r0)     // Catch:{ ParseException -> 0x0130 }
            r12.setDataPosition(r7)     // Catch:{ ParseException -> 0x0130 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzac> r0 = com.google.android.gms.measurement.internal.zzac.CREATOR     // Catch:{ ParseException -> 0x0130 }
            java.lang.Object r0 = r0.createFromParcel(r12)     // Catch:{ ParseException -> 0x0130 }
            com.google.android.gms.measurement.internal.zzac r0 = (com.google.android.gms.measurement.internal.zzac) r0     // Catch:{ ParseException -> 0x0130 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            goto L_0x0143
        L_0x012e:
            r0 = move-exception
            goto L_0x014a
        L_0x0130:
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzs     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.zzeo r0 = r0.zzay()     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzd()     // Catch:{ all -> 0x012e }
            java.lang.String r13 = "Failed to load conditional user property from local database"
            r0.zza(r13)     // Catch:{ all -> 0x012e }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            r0 = r4
        L_0x0143:
            if (r0 == 0) goto L_0x0093
            r5.add(r0)     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            goto L_0x0093
        L_0x014a:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            throw r0     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
        L_0x014e:
            r12 = 3
            if (r0 != r12) goto L_0x0162
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzs     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            com.google.android.gms.measurement.internal.zzeo r0 = r0.zzay()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzk()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            java.lang.String r12 = "Skipping app launch break"
            r0.zza(r12)     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            goto L_0x0093
        L_0x0162:
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzs     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            com.google.android.gms.measurement.internal.zzeo r0 = r0.zzay()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzd()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            java.lang.String r12 = "Unknown record type in local database"
            r0.zza(r12)     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            goto L_0x0093
        L_0x0173:
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            java.lang.String r12 = java.lang.Long.toString(r20)     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            r0[r7] = r12     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01ae }
            java.lang.String r12 = "messages"
            java.lang.String r13 = "rowid <= ?"
            r14 = r23
            int r0 = r14.delete(r12, r13, r0)     // Catch:{ SQLiteFullException -> 0x01ab, SQLiteDatabaseLockedException -> 0x01f1, SQLiteException -> 0x01a9, all -> 0x01a7 }
            int r12 = r5.size()     // Catch:{ SQLiteFullException -> 0x01ab, SQLiteDatabaseLockedException -> 0x01f1, SQLiteException -> 0x01a9, all -> 0x01a7 }
            if (r0 >= r12) goto L_0x019a
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzs     // Catch:{ SQLiteFullException -> 0x01ab, SQLiteDatabaseLockedException -> 0x01f1, SQLiteException -> 0x01a9, all -> 0x01a7 }
            com.google.android.gms.measurement.internal.zzeo r0 = r0.zzay()     // Catch:{ SQLiteFullException -> 0x01ab, SQLiteDatabaseLockedException -> 0x01f1, SQLiteException -> 0x01a9, all -> 0x01a7 }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzd()     // Catch:{ SQLiteFullException -> 0x01ab, SQLiteDatabaseLockedException -> 0x01f1, SQLiteException -> 0x01a9, all -> 0x01a7 }
            java.lang.String r12 = "Fewer entries removed from local database than expected"
            r0.zza(r12)     // Catch:{ SQLiteFullException -> 0x01ab, SQLiteDatabaseLockedException -> 0x01f1, SQLiteException -> 0x01a9, all -> 0x01a7 }
        L_0x019a:
            r14.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x01ab, SQLiteDatabaseLockedException -> 0x01f1, SQLiteException -> 0x01a9, all -> 0x01a7 }
            r14.endTransaction()     // Catch:{ SQLiteFullException -> 0x01ab, SQLiteDatabaseLockedException -> 0x01f1, SQLiteException -> 0x01a9, all -> 0x01a7 }
            r11.close()
            r14.close()
            return r5
        L_0x01a7:
            r0 = move-exception
            goto L_0x01b1
        L_0x01a9:
            r0 = move-exception
            goto L_0x01ed
        L_0x01ab:
            r0 = move-exception
            goto L_0x01f6
        L_0x01ae:
            r0 = move-exception
            r14 = r23
        L_0x01b1:
            r4 = r11
            goto L_0x0253
        L_0x01b4:
            r0 = move-exception
            r14 = r23
            goto L_0x01ed
        L_0x01b8:
            r14 = r23
            goto L_0x01f1
        L_0x01bb:
            r0 = move-exception
            r14 = r23
            goto L_0x01f6
        L_0x01bf:
            r0 = move-exception
            r14 = r23
            goto L_0x0253
        L_0x01c4:
            r0 = move-exception
            r14 = r23
            goto L_0x01ec
        L_0x01c8:
            r14 = r23
            goto L_0x01f0
        L_0x01cb:
            r0 = move-exception
            r14 = r23
            goto L_0x01f5
        L_0x01cf:
            r0 = move-exception
            r14 = r23
            goto L_0x01da
        L_0x01d3:
            r0 = move-exception
            r14 = r23
            goto L_0x01d9
        L_0x01d7:
            r0 = move-exception
            r14 = r15
        L_0x01d9:
            r11 = r4
        L_0x01da:
            if (r11 == 0) goto L_0x01df
            r11.close()     // Catch:{ SQLiteFullException -> 0x01e5, SQLiteDatabaseLockedException -> 0x01f0, SQLiteException -> 0x01e3, all -> 0x01e0 }
        L_0x01df:
            throw r0     // Catch:{ SQLiteFullException -> 0x01e5, SQLiteDatabaseLockedException -> 0x01f0, SQLiteException -> 0x01e3, all -> 0x01e0 }
        L_0x01e0:
            r0 = move-exception
            goto L_0x0253
        L_0x01e3:
            r0 = move-exception
            goto L_0x01ec
        L_0x01e5:
            r0 = move-exception
            goto L_0x01f5
        L_0x01e7:
            r0 = move-exception
            goto L_0x0252
        L_0x01ea:
            r0 = move-exception
            r14 = r15
        L_0x01ec:
            r11 = r4
        L_0x01ed:
            r15 = r14
            goto L_0x01fe
        L_0x01ef:
            r14 = r15
        L_0x01f0:
            r11 = r4
        L_0x01f1:
            r15 = r14
            goto L_0x0222
        L_0x01f3:
            r0 = move-exception
            r14 = r15
        L_0x01f5:
            r11 = r4
        L_0x01f6:
            r15 = r14
            goto L_0x0233
        L_0x01f8:
            r0 = move-exception
            r14 = r4
            goto L_0x0253
        L_0x01fb:
            r0 = move-exception
            r11 = r4
            r15 = r11
        L_0x01fe:
            if (r15 == 0) goto L_0x0209
            boolean r12 = r15.inTransaction()     // Catch:{ all -> 0x0250 }
            if (r12 == 0) goto L_0x0209
            r15.endTransaction()     // Catch:{ all -> 0x0250 }
        L_0x0209:
            com.google.android.gms.measurement.internal.zzfy r12 = r1.zzs     // Catch:{ all -> 0x0250 }
            com.google.android.gms.measurement.internal.zzeo r12 = r12.zzay()     // Catch:{ all -> 0x0250 }
            com.google.android.gms.measurement.internal.zzem r12 = r12.zzd()     // Catch:{ all -> 0x0250 }
            r12.zzb(r3, r0)     // Catch:{ all -> 0x0250 }
            r1.zzb = r10     // Catch:{ all -> 0x0250 }
            if (r11 == 0) goto L_0x021d
            r11.close()
        L_0x021d:
            if (r15 == 0) goto L_0x024c
            goto L_0x0249
        L_0x0220:
            r11 = r4
            r15 = r11
        L_0x0222:
            long r12 = (long) r9
            android.os.SystemClock.sleep(r12)     // Catch:{ all -> 0x0250 }
            int r9 = r9 + 20
            if (r11 == 0) goto L_0x022d
            r11.close()
        L_0x022d:
            if (r15 == 0) goto L_0x024c
            goto L_0x0249
        L_0x0230:
            r0 = move-exception
            r11 = r4
            r15 = r11
        L_0x0233:
            com.google.android.gms.measurement.internal.zzfy r12 = r1.zzs     // Catch:{ all -> 0x0250 }
            com.google.android.gms.measurement.internal.zzeo r12 = r12.zzay()     // Catch:{ all -> 0x0250 }
            com.google.android.gms.measurement.internal.zzem r12 = r12.zzd()     // Catch:{ all -> 0x0250 }
            r12.zzb(r3, r0)     // Catch:{ all -> 0x0250 }
            r1.zzb = r10     // Catch:{ all -> 0x0250 }
            if (r11 == 0) goto L_0x0247
            r11.close()
        L_0x0247:
            if (r15 == 0) goto L_0x024c
        L_0x0249:
            r15.close()
        L_0x024c:
            int r8 = r8 + 1
            goto L_0x0020
        L_0x0250:
            r0 = move-exception
            r4 = r11
        L_0x0252:
            r14 = r15
        L_0x0253:
            if (r4 == 0) goto L_0x0258
            r4.close()
        L_0x0258:
            if (r14 == 0) goto L_0x025d
            r14.close()
        L_0x025d:
            throw r0
        L_0x025e:
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzs
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            p379.C16759e.m42354j(r0, r2)
            return r4
        L_0x0266:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeh.zzi(int):java.util.List");
    }

    public final void zzj() {
        int delete;
        zzg();
        try {
            SQLiteDatabase zzh = zzh();
            if (zzh != null && (delete = zzh.delete("messages", (String) null, (String[]) null)) > 0) {
                this.zzs.zzay().zzj().zzb("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            this.zzs.zzay().zzd().zzb("Error resetting local analytics data. error", e);
        }
    }

    public final boolean zzk() {
        return zzq(3, new byte[0]);
    }

    @VisibleForTesting
    public final boolean zzl() {
        Context zzau = this.zzs.zzau();
        this.zzs.zzf();
        return zzau.getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final boolean zzm() {
        zzg();
        if (!this.zzb && zzl()) {
            int i = 0;
            int i2 = 5;
            while (i < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase zzh = zzh();
                    if (zzh == null) {
                        this.zzb = true;
                        return false;
                    }
                    zzh.beginTransaction();
                    zzh.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    zzh.setTransactionSuccessful();
                    zzh.endTransaction();
                    zzh.close();
                    return true;
                } catch (SQLiteFullException e) {
                    this.zzs.zzay().zzd().zzb("Error deleting app launch break from local database", e);
                    this.zzb = true;
                    if (sQLiteDatabase == null) {
                        i++;
                    }
                    sQLiteDatabase.close();
                    i++;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep((long) i2);
                    i2 += 20;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        i++;
                    } else {
                        i++;
                    }
                } catch (SQLiteException e2) {
                    if (sQLiteDatabase != null) {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    }
                    this.zzs.zzay().zzd().zzb("Error deleting app launch break from local database", e2);
                    this.zzb = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        i++;
                    } else {
                        i++;
                    }
                } catch (Throwable th) {
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    throw th;
                }
            }
            C16759e.m42354j(this.zzs, "Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean zzn(zzac zzac) {
        byte[] zzan = this.zzs.zzv().zzan(zzac);
        if (zzan.length <= 131072) {
            return zzq(2, zzan);
        }
        this.zzs.zzay().zzh().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzo(zzaw zzaw) {
        Parcel obtain = Parcel.obtain();
        zzax.zza(zzaw, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zzq(0, marshall);
        }
        this.zzs.zzay().zzh().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzp(zzlc zzlc) {
        Parcel obtain = Parcel.obtain();
        zzld.zza(zzlc, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zzq(1, marshall);
        }
        this.zzs.zzay().zzh().zza("User property too long for local database. Sending directly to service");
        return false;
    }
}
