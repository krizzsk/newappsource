package com.google.android.gms.internal.gtm;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.analytics.zzr;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.HttpUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p358af.C13437d;

final class zzce extends zzbs implements Closeable {
    /* access modifiers changed from: private */
    public static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[]{"hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"});
    private static final String zzb = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[]{"hit_time", "hits2"});
    private final zzcd zzc;
    private final zzfo zzd = new zzfo(zzC());
    /* access modifiers changed from: private */
    public final zzfo zze = new zzfo(zzC());

    public zzce(zzbv zzbv) {
        super(zzbv);
        this.zzc = new zzcd(this, zzbv.zza(), zzae());
    }

    private final long zzad(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = zzf().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return 0;
        } catch (SQLiteException e) {
            zzL("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public final String zzae() {
        zzw();
        zzw();
        return "google_analytics_v4.db";
    }

    public final void close() {
        try {
            this.zzc.close();
        } catch (SQLiteException e) {
            zzK("Sql error closing database", e);
        } catch (IllegalStateException e2) {
            zzK("Error closing database", e2);
        }
    }

    public final void zzZ(List<Long> list) {
        Preconditions.checkNotNull(list);
        zzr.zzh();
        zzW();
        if (!list.isEmpty()) {
            StringBuilder n = C13437d.m33708n("hit_id", " in (");
            for (int i = 0; i < list.size(); i++) {
                Long l = list.get(i);
                if (l == null || l.longValue() == 0) {
                    throw new SQLiteException("Invalid hit id");
                }
                if (i > 0) {
                    n.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                }
                n.append(l);
            }
            n.append(")");
            String sb = n.toString();
            try {
                SQLiteDatabase zzf = zzf();
                zzP("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                int delete = zzf.delete("hits2", sb, (String[]) null);
                if (delete != list.size()) {
                    zzU("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), sb);
                }
            } catch (SQLiteException e) {
                zzK("Error deleting hits", e);
                throw e;
            }
        }
    }

    public final int zza() {
        zzr.zzh();
        zzW();
        if (!this.zzd.zzc(86400000)) {
            return 0;
        }
        this.zzd.zzb();
        zzO("Deleting stale hits (if any)");
        int delete = zzf().delete("hits2", "hit_time < ?", new String[]{Long.toString(zzC().currentTimeMillis() - 2592000000L)});
        zzP("Deleted stale hits, count", Integer.valueOf(delete));
        return delete;
    }

    public final void zzaa() {
        zzW();
        zzf().endTransaction();
    }

    public final void zzab() {
        zzW();
        zzf().setTransactionSuccessful();
    }

    public final boolean zzac() {
        return zzb() == 0;
    }

    public final long zzb() {
        zzr.zzh();
        zzW();
        Cursor cursor = null;
        try {
            cursor = zzf().rawQuery("SELECT COUNT(*) FROM hits2", (String[]) null);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                cursor.close();
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            zzL("Database error", "SELECT COUNT(*) FROM hits2", e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long zzc() {
        zzr.zzh();
        zzW();
        return zzad(zzb, (String[]) null, 0);
    }

    public final void zzd() {
    }

    public final long zze(long j, String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzW();
        zzr.zzh();
        return zzad("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{"0", str, str2}, 0);
    }

    @VisibleForTesting
    public final SQLiteDatabase zzf() {
        try {
            return this.zzc.getWritableDatabase();
        } catch (SQLiteException e) {
            zzS("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.gtm.zzex> zzj(long r17) {
        /*
            r16 = this;
            r11 = r16
            java.lang.String r0 = "hit_id"
            r12 = 0
            r13 = 1
            r1 = 0
            int r3 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x000e
            r1 = 1
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1)
            com.google.android.gms.analytics.zzr.zzh()
            r16.zzW()
            android.database.sqlite.SQLiteDatabase r2 = r16.zzf()
            r1 = 0
            java.lang.String r3 = "hit_time"
            java.lang.String r4 = "hit_string"
            java.lang.String r5 = "hit_url"
            java.lang.String r6 = "hit_app_id"
            java.lang.String[] r4 = new java.lang.String[]{r0, r3, r4, r5, r6}     // Catch:{ SQLiteException -> 0x0098 }
            java.lang.Object[] r3 = new java.lang.Object[r13]     // Catch:{ SQLiteException -> 0x0098 }
            r3[r12] = r0     // Catch:{ SQLiteException -> 0x0098 }
            java.lang.String r0 = "hits2"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = "%s ASC"
            java.lang.String r9 = java.lang.String.format(r9, r3)     // Catch:{ SQLiteException -> 0x0098 }
            java.lang.String r10 = java.lang.Long.toString(r17)     // Catch:{ SQLiteException -> 0x0098 }
            r3 = r0
            android.database.Cursor r14 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0098 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            r0.<init>()     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            if (r1 == 0) goto L_0x008c
        L_0x004d:
            long r7 = r14.getLong(r12)     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            long r4 = r14.getLong(r13)     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            r1 = 2
            java.lang.String r1 = r14.getString(r1)     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            r2 = 3
            java.lang.String r2 = r14.getString(r2)     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            r3 = 4
            int r9 = r14.getInt(r3)     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            java.util.Map r3 = r11.zzk(r1)     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            if (r1 == 0) goto L_0x0070
        L_0x006e:
            r6 = 1
            goto L_0x007a
        L_0x0070:
            java.lang.String r1 = "http:"
            boolean r1 = r2.startsWith(r1)     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            if (r1 != 0) goto L_0x0079
            goto L_0x006e
        L_0x0079:
            r6 = 0
        L_0x007a:
            com.google.android.gms.internal.gtm.zzex r15 = new com.google.android.gms.internal.gtm.zzex     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            r10 = 0
            r1 = r15
            r2 = r16
            r1.<init>(r2, r3, r4, r6, r7, r9, r10)     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            r0.add(r15)     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            if (r1 != 0) goto L_0x004d
        L_0x008c:
            r14.close()
            return r0
        L_0x0090:
            r0 = move-exception
            r1 = r14
            goto L_0x009f
        L_0x0093:
            r0 = move-exception
            r1 = r14
            goto L_0x0099
        L_0x0096:
            r0 = move-exception
            goto L_0x009f
        L_0x0098:
            r0 = move-exception
        L_0x0099:
            java.lang.String r2 = "Error loading hits from the database"
            r11.zzK(r2, r0)     // Catch:{ all -> 0x0096 }
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x009f:
            if (r1 == 0) goto L_0x00a4
            r1.close()
        L_0x00a4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzce.zzj(long):java.util.List");
    }

    @VisibleForTesting
    public final Map<String, String> zzk(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                if (str.length() != 0) {
                    str = "?".concat(str);
                } else {
                    str = new String("?");
                }
            }
            return HttpUtils.parse(new URI(str), "UTF-8");
        } catch (URISyntaxException e) {
            zzK("Error parsing hit parameters", e);
            return new HashMap(0);
        }
    }

    @VisibleForTesting
    public final Map<String, String> zzl(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "?".concat(valueOf);
            } else {
                str2 = new String("?");
            }
            return HttpUtils.parse(new URI(str2), "UTF-8");
        } catch (URISyntaxException e) {
            zzK("Error parsing property parameters", e);
            return new HashMap(0);
        }
    }

    public final void zzm() {
        zzW();
        zzf().beginTransaction();
    }

    public final void zzn(long j) {
        zzr.zzh();
        zzW();
        ArrayList arrayList = new ArrayList(1);
        Long valueOf = Long.valueOf(j);
        arrayList.add(valueOf);
        zzP("Deleting hit, id", valueOf);
        zzZ(arrayList);
    }
}
