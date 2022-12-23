package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.gtm.zzfz;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

final class zzbe implements zzax {
    /* access modifiers changed from: private */
    public static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", new Object[]{"datalayer", "ID", LinksConfiguration.KEY_KEY, "value", "expires"});
    private final Executor zzb;
    /* access modifiers changed from: private */
    public final Context zzc;
    private final zzbc zzd;
    private final Clock zze;

    public zzbe(Context context) {
        Clock instance = DefaultClock.getInstance();
        ExecutorService zza2 = zzfz.zza().zza(2);
        this.zzc = context;
        this.zze = instance;
        this.zzb = zza2;
        this.zzd = new zzbc(this, context, "google_tagmanager.db");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.io.ObjectInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.io.ObjectInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.io.ObjectInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.io.ObjectInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.io.ObjectInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.io.ObjectInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.io.ObjectInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.io.ObjectInputStream} */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x008a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009b */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084 A[SYNTHETIC, Splitter:B:29:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008f A[SYNTHETIC, Splitter:B:37:0x008f] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0097 A[Catch:{ IOException -> 0x009b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* bridge */ /* synthetic */ java.util.List zzf(com.google.android.gms.tagmanager.zzbe r10) {
        /*
            com.google.android.gms.common.util.Clock r0 = r10.zze     // Catch:{ all -> 0x00ab }
            long r0 = r0.currentTimeMillis()     // Catch:{ all -> 0x00ab }
            r10.zzk(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "Error opening database for loadSerialized."
            android.database.sqlite.SQLiteDatabase r1 = r10.zzi(r0)     // Catch:{ all -> 0x00ab }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00ab }
            r0.<init>()     // Catch:{ all -> 0x00ab }
            if (r1 != 0) goto L_0x0017
            goto L_0x0049
        L_0x0017:
            java.lang.String r2 = "key"
            java.lang.String r3 = "value"
            java.lang.String[] r3 = new java.lang.String[]{r2, r3}     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "datalayer"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r8 = "ID"
            r9 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00ab }
        L_0x002d:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x00a6 }
            if (r2 == 0) goto L_0x0046
            com.google.android.gms.tagmanager.zzbd r2 = new com.google.android.gms.tagmanager.zzbd     // Catch:{ all -> 0x00a6 }
            r3 = 0
            java.lang.String r3 = r1.getString(r3)     // Catch:{ all -> 0x00a6 }
            r4 = 1
            byte[] r4 = r1.getBlob(r4)     // Catch:{ all -> 0x00a6 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00a6 }
            r0.add(r2)     // Catch:{ all -> 0x00a6 }
            goto L_0x002d
        L_0x0046:
            r1.close()     // Catch:{ all -> 0x00ab }
        L_0x0049:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00ab }
            r1.<init>()     // Catch:{ all -> 0x00ab }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00ab }
        L_0x0052:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x00ab }
            if (r2 == 0) goto L_0x00a2
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x00ab }
            com.google.android.gms.tagmanager.zzbd r2 = (com.google.android.gms.tagmanager.zzbd) r2     // Catch:{ all -> 0x00ab }
            com.google.android.gms.tagmanager.zzau r3 = new com.google.android.gms.tagmanager.zzau     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = r2.zza     // Catch:{ all -> 0x00ab }
            byte[] r2 = r2.zzb     // Catch:{ all -> 0x00ab }
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x00ab }
            r5.<init>(r2)     // Catch:{ all -> 0x00ab }
            r2 = 0
            java.io.ObjectInputStream r6 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0093, ClassNotFoundException -> 0x008b, all -> 0x0081 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x0093, ClassNotFoundException -> 0x008b, all -> 0x0081 }
            java.lang.Object r2 = r6.readObject()     // Catch:{ IOException -> 0x007f, ClassNotFoundException -> 0x007d, all -> 0x007a }
            r6.close()     // Catch:{ IOException -> 0x009b }
        L_0x0076:
            r5.close()     // Catch:{ IOException -> 0x009b }
            goto L_0x009b
        L_0x007a:
            r0 = move-exception
            r2 = r6
            goto L_0x0082
        L_0x007d:
            goto L_0x008d
        L_0x007f:
            goto L_0x0095
        L_0x0081:
            r0 = move-exception
        L_0x0082:
            if (r2 == 0) goto L_0x0087
            r2.close()     // Catch:{ IOException -> 0x008a }
        L_0x0087:
            r5.close()     // Catch:{ IOException -> 0x008a }
        L_0x008a:
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x008b:
            r6 = r2
        L_0x008d:
            if (r6 == 0) goto L_0x0076
            r6.close()     // Catch:{ IOException -> 0x009b }
            goto L_0x0076
        L_0x0093:
            r6 = r2
        L_0x0095:
            if (r6 == 0) goto L_0x0076
            r6.close()     // Catch:{ IOException -> 0x009b }
            goto L_0x0076
        L_0x009b:
            r3.<init>(r4, r2)     // Catch:{ all -> 0x00ab }
            r1.add(r3)     // Catch:{ all -> 0x00ab }
            goto L_0x0052
        L_0x00a2:
            r10.zzj()
            return r1
        L_0x00a6:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00ab }
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            r10.zzj()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzbe.zzf(com.google.android.gms.tagmanager.zzbe):java.util.List");
    }

    public static /* bridge */ /* synthetic */ void zzg(zzbe zzbe, String str) {
        SQLiteDatabase zzi = zzbe.zzi("Error opening database for clearKeysWithPrefix.");
        if (zzi != null) {
            try {
                int delete = zzi.delete("datalayer", "key = ? OR key LIKE ?", new String[]{str, String.valueOf(str).concat(".%")});
                StringBuilder sb = new StringBuilder(25);
                sb.append("Cleared ");
                sb.append(delete);
                sb.append(" items");
                zzdh.zzb.zzd(sb.toString());
            } catch (SQLiteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 44 + valueOf.length());
                sb2.append("Error deleting entries with key prefix: ");
                sb2.append(str);
                sb2.append(" (");
                sb2.append(valueOf);
                sb2.append(").");
                zzdh.zzc(sb2.toString());
            } finally {
                zzbe.zzj();
            }
        }
    }

    private final SQLiteDatabase zzi(String str) {
        try {
            return this.zzd.getWritableDatabase();
        } catch (SQLiteException unused) {
            zzdh.zzc(str);
            return null;
        }
    }

    private final void zzj() {
        try {
            this.zzd.close();
        } catch (SQLiteException unused) {
        }
    }

    private final void zzk(long j) {
        SQLiteDatabase zzi = zzi("Error opening database for deleteOlderThan.");
        if (zzi != null) {
            try {
                int delete = zzi.delete("datalayer", "expires <= ?", new String[]{Long.toString(j)});
                StringBuilder sb = new StringBuilder(33);
                sb.append("Deleted ");
                sb.append(delete);
                sb.append(" expired items");
                zzdh.zzb.zzd(sb.toString());
            } catch (SQLiteException unused) {
                zzdh.zzc("Error deleting old entries.");
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b9, code lost:
        if (r5 != null) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003e A[SYNTHETIC, Splitter:B:26:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0047 A[Catch:{ SQLiteException -> 0x0114, all -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ac A[Catch:{ all -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b1 A[Catch:{ all -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0134 A[Catch:{ SQLiteException -> 0x0114, all -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0142 A[Catch:{ SQLiteException -> 0x0114, all -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0143 A[Catch:{ SQLiteException -> 0x0114, all -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0180 A[SYNTHETIC, Splitter:B:94:0x0180] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzl(java.util.List<com.google.android.gms.tagmanager.zzbd> r19, long r20) {
        /*
            r18 = this;
            r1 = r18
            monitor-enter(r18)
            com.google.android.gms.common.util.Clock r0 = r1.zze     // Catch:{ all -> 0x0184 }
            long r2 = r0.currentTimeMillis()     // Catch:{ all -> 0x0184 }
            r1.zzk(r2)     // Catch:{ all -> 0x0184 }
            int r0 = r19.size()     // Catch:{ all -> 0x0184 }
            java.lang.String r4 = "Error opening database for getNumStoredEntries."
            android.database.sqlite.SQLiteDatabase r4 = r1.zzi(r4)     // Catch:{ all -> 0x0184 }
            r5 = 0
            r6 = 0
            if (r4 != 0) goto L_0x001c
        L_0x001a:
            r8 = 0
            goto L_0x0042
        L_0x001c:
            java.lang.String r7 = "SELECT COUNT(*) from datalayer"
            android.database.Cursor r4 = r4.rawQuery(r7, r5)     // Catch:{ SQLiteException -> 0x0036, all -> 0x0033 }
            boolean r7 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0037 }
            if (r7 == 0) goto L_0x002e
            long r7 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0037 }
            int r8 = (int) r7
            goto L_0x002f
        L_0x002e:
            r8 = 0
        L_0x002f:
            r4.close()     // Catch:{ all -> 0x0184 }
            goto L_0x0042
        L_0x0033:
            r0 = move-exception
            goto L_0x017e
        L_0x0036:
            r4 = r5
        L_0x0037:
            java.lang.String r7 = "Error getting numStoredEntries"
            com.google.android.gms.tagmanager.zzdh.zzc(r7)     // Catch:{ all -> 0x017c }
            if (r4 == 0) goto L_0x001a
            r4.close()     // Catch:{ all -> 0x0184 }
            goto L_0x001a
        L_0x0042:
            int r8 = r8 + -2000
            int r8 = r8 + r0
            if (r8 <= 0) goto L_0x0138
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0184 }
            r4.<init>()     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = "Error opening database for peekEntryIds."
            android.database.sqlite.SQLiteDatabase r9 = r1.zzi(r0)     // Catch:{ all -> 0x0184 }
            r7 = 1
            if (r9 != 0) goto L_0x0056
            goto L_0x00bc
        L_0x0056:
            java.lang.String r0 = "ID"
            java.lang.String[] r11 = new java.lang.String[]{r0}     // Catch:{ SQLiteException -> 0x009a, all -> 0x0096 }
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ SQLiteException -> 0x009a, all -> 0x0096 }
            java.lang.String r10 = "ID"
            r0[r6] = r10     // Catch:{ SQLiteException -> 0x009a, all -> 0x0096 }
            java.lang.String r10 = "datalayer"
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.String r5 = "%s ASC"
            java.lang.String r16 = java.lang.String.format(r5, r0)     // Catch:{ SQLiteException -> 0x009a, all -> 0x0096 }
            java.lang.String r17 = java.lang.Integer.toString(r8)     // Catch:{ SQLiteException -> 0x009a, all -> 0x0096 }
            android.database.Cursor r5 = r9.query(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x009a, all -> 0x0096 }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0094 }
            if (r0 == 0) goto L_0x008d
        L_0x007c:
            long r8 = r5.getLong(r6)     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x0094 }
            r4.add(r0)     // Catch:{ SQLiteException -> 0x0094 }
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0094 }
            if (r0 != 0) goto L_0x007c
        L_0x008d:
            r5.close()     // Catch:{ all -> 0x0184 }
            goto L_0x00bc
        L_0x0091:
            r0 = move-exception
            goto L_0x0132
        L_0x0094:
            r0 = move-exception
            goto L_0x009c
        L_0x0096:
            r0 = move-exception
            r5 = 0
            goto L_0x0132
        L_0x009a:
            r0 = move-exception
            r5 = 0
        L_0x009c:
            java.lang.String r8 = "Error in peekEntries fetching entryIds: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0091 }
            int r9 = r0.length()     // Catch:{ all -> 0x0091 }
            if (r9 == 0) goto L_0x00b1
            java.lang.String r0 = r8.concat(r0)     // Catch:{ all -> 0x0091 }
            goto L_0x00b6
        L_0x00b1:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0091 }
            r0.<init>(r8)     // Catch:{ all -> 0x0091 }
        L_0x00b6:
            com.google.android.gms.tagmanager.zzdh.zzc(r0)     // Catch:{ all -> 0x0091 }
            if (r5 == 0) goto L_0x00bc
            goto L_0x008d
        L_0x00bc:
            int r0 = r4.size()     // Catch:{ all -> 0x0184 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0184 }
            r8 = 64
            r5.<init>(r8)     // Catch:{ all -> 0x0184 }
            java.lang.String r8 = "DataLayer store full, deleting "
            r5.append(r8)     // Catch:{ all -> 0x0184 }
            r5.append(r0)     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = " entries to make room."
            r5.append(r0)     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0184 }
            com.google.android.gms.tagmanager.zzbg r5 = com.google.android.gms.tagmanager.zzdh.zzb     // Catch:{ all -> 0x0184 }
            r5.zzb(r0)     // Catch:{ all -> 0x0184 }
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ all -> 0x0184 }
            java.lang.Object[] r0 = r4.toArray(r0)     // Catch:{ all -> 0x0184 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x0184 }
            if (r0 == 0) goto L_0x0138
            int r4 = r0.length     // Catch:{ all -> 0x0184 }
            if (r4 != 0) goto L_0x00eb
            goto L_0x0138
        L_0x00eb:
            java.lang.String r5 = "Error opening database for deleteEntries."
            android.database.sqlite.SQLiteDatabase r5 = r1.zzi(r5)     // Catch:{ all -> 0x0184 }
            if (r5 == 0) goto L_0x0138
            java.lang.String r8 = "%s in (%s)"
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x0184 }
            java.lang.String r10 = "ID"
            r9[r6] = r10     // Catch:{ all -> 0x0184 }
            java.lang.String r6 = ","
            java.lang.String r10 = "?"
            java.util.List r4 = java.util.Collections.nCopies(r4, r10)     // Catch:{ all -> 0x0184 }
            java.lang.String r4 = android.text.TextUtils.join(r6, r4)     // Catch:{ all -> 0x0184 }
            r9[r7] = r4     // Catch:{ all -> 0x0184 }
            java.lang.String r4 = java.lang.String.format(r8, r9)     // Catch:{ all -> 0x0184 }
            java.lang.String r6 = "datalayer"
            r5.delete(r6, r4, r0)     // Catch:{ SQLiteException -> 0x0114 }
            goto L_0x0138
        L_0x0114:
            java.lang.String r4 = "Error deleting entries "
            java.lang.String r0 = java.util.Arrays.toString(r0)     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0184 }
            int r5 = r0.length()     // Catch:{ all -> 0x0184 }
            if (r5 == 0) goto L_0x0129
            java.lang.String r0 = r4.concat(r0)     // Catch:{ all -> 0x0184 }
            goto L_0x012e
        L_0x0129:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0184 }
            r0.<init>(r4)     // Catch:{ all -> 0x0184 }
        L_0x012e:
            com.google.android.gms.tagmanager.zzdh.zzc(r0)     // Catch:{ all -> 0x0184 }
            goto L_0x0138
        L_0x0132:
            if (r5 == 0) goto L_0x0137
            r5.close()     // Catch:{ all -> 0x0184 }
        L_0x0137:
            throw r0     // Catch:{ all -> 0x0184 }
        L_0x0138:
            long r2 = r2 + r20
            java.lang.String r0 = "Error opening database for writeEntryToDatabase."
            android.database.sqlite.SQLiteDatabase r0 = r1.zzi(r0)     // Catch:{ all -> 0x0184 }
            if (r0 != 0) goto L_0x0143
            goto L_0x0177
        L_0x0143:
            java.util.Iterator r4 = r19.iterator()     // Catch:{ all -> 0x0184 }
        L_0x0147:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0184 }
            if (r5 == 0) goto L_0x0177
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0184 }
            com.google.android.gms.tagmanager.zzbd r5 = (com.google.android.gms.tagmanager.zzbd) r5     // Catch:{ all -> 0x0184 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0184 }
            r6.<init>()     // Catch:{ all -> 0x0184 }
            java.lang.String r7 = "expires"
            java.lang.Long r8 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0184 }
            r6.put(r7, r8)     // Catch:{ all -> 0x0184 }
            java.lang.String r7 = "key"
            java.lang.String r8 = r5.zza     // Catch:{ all -> 0x0184 }
            r6.put(r7, r8)     // Catch:{ all -> 0x0184 }
            java.lang.String r7 = "value"
            byte[] r5 = r5.zzb     // Catch:{ all -> 0x0184 }
            r6.put(r7, r5)     // Catch:{ all -> 0x0184 }
            java.lang.String r5 = "datalayer"
            r7 = 0
            r0.insert(r5, r7, r6)     // Catch:{ all -> 0x0184 }
            goto L_0x0147
        L_0x0177:
            r18.zzj()     // Catch:{ all -> 0x0189 }
            monitor-exit(r18)
            return
        L_0x017c:
            r0 = move-exception
            r5 = r4
        L_0x017e:
            if (r5 == 0) goto L_0x0183
            r5.close()     // Catch:{ all -> 0x0184 }
        L_0x0183:
            throw r0     // Catch:{ all -> 0x0184 }
        L_0x0184:
            r0 = move-exception
            r18.zzj()     // Catch:{ all -> 0x0189 }
            throw r0     // Catch:{ all -> 0x0189 }
        L_0x0189:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzbe.zzl(java.util.List, long):void");
    }

    public final void zza(String str) {
        this.zzb.execute(new zzbb(this, str));
    }

    public final void zzb(zzaw zzaw) {
        this.zzb.execute(new zzba(this, zzaw));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.io.ObjectOutputStream} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r6 != null) goto L_0x002d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c A[SYNTHETIC, Splitter:B:16:0x003c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzc(java.util.List<com.google.android.gms.tagmanager.zzau> r8, long r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0009:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x004f
            java.lang.Object r1 = r8.next()
            com.google.android.gms.tagmanager.zzau r1 = (com.google.android.gms.tagmanager.zzau) r1
            com.google.android.gms.tagmanager.zzbd r2 = new com.google.android.gms.tagmanager.zzbd
            java.lang.String r3 = r1.zza
            java.lang.Object r1 = r1.zzb
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            r5 = 0
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0043, all -> 0x0039 }
            r6.<init>(r4)     // Catch:{ IOException -> 0x0043, all -> 0x0039 }
            r6.writeObject(r1)     // Catch:{ IOException -> 0x0037, all -> 0x0034 }
            byte[] r5 = r4.toByteArray()     // Catch:{ IOException -> 0x0037, all -> 0x0034 }
        L_0x002d:
            r6.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0030:
            r4.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x0048
        L_0x0034:
            r8 = move-exception
            r5 = r6
            goto L_0x003a
        L_0x0037:
            goto L_0x0045
        L_0x0039:
            r8 = move-exception
        L_0x003a:
            if (r5 == 0) goto L_0x003f
            r5.close()     // Catch:{ IOException -> 0x0042 }
        L_0x003f:
            r4.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            throw r8
        L_0x0043:
            r6 = r5
        L_0x0045:
            if (r6 == 0) goto L_0x0030
            goto L_0x002d
        L_0x0048:
            r2.<init>(r3, r5)
            r0.add(r2)
            goto L_0x0009
        L_0x004f:
            java.util.concurrent.Executor r8 = r7.zzb
            com.google.android.gms.tagmanager.zzaz r1 = new com.google.android.gms.tagmanager.zzaz
            r1.<init>(r7, r0, r9)
            r8.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzbe.zzc(java.util.List, long):void");
    }
}
