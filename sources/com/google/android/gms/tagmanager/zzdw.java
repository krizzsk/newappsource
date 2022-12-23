package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;

@VisibleForTesting
final class zzdw implements zzcd {
    /* access modifiers changed from: private */
    public static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL,'%s' INTEGER NOT NULL);", new Object[]{"gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time"});
    private final zzdv zzb;
    private volatile zzbk zzc;
    /* access modifiers changed from: private */
    public final Context zzd;
    /* access modifiers changed from: private */
    public final String zze = "gtm_urls.db";
    private long zzf;
    /* access modifiers changed from: private */
    public final Clock zzg;
    private final int zzh;
    private final zzez zzi;

    public zzdw(zzez zzez, Context context, byte[] bArr) {
        Context applicationContext = context.getApplicationContext();
        this.zzd = applicationContext;
        this.zzi = zzez;
        this.zzg = DefaultClock.getInstance();
        this.zzb = new zzdv(this, applicationContext, "gtm_urls.db");
        this.zzc = new zzfj(applicationContext, new zzdu(this));
        this.zzf = 0;
        this.zzh = 2000;
    }

    public static /* bridge */ /* synthetic */ void zzi(zzdw zzdw, long j, long j2) {
        SQLiteDatabase zzk = zzdw.zzk("Error opening database for getNumStoredHits.");
        if (zzk != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_first_send_time", Long.valueOf(j2));
            try {
                zzk.update("gtm_hits", contentValues, "hit_id=?", new String[]{String.valueOf(j)});
            } catch (SQLiteException unused) {
                StringBuilder sb = new StringBuilder(69);
                sb.append("Error setting HIT_FIRST_DISPATCH_TIME for hitId: ");
                sb.append(j);
                zzdh.zzc(sb.toString());
                zzdw.zzl(j);
            }
        }
    }

    private final SQLiteDatabase zzk(String str) {
        try {
            return this.zzb.getWritableDatabase();
        } catch (SQLiteException unused) {
            zzdh.zzc(str);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final void zzl(long j) {
        zzj(new String[]{String.valueOf(j)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01ec, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014f, code lost:
        r17 = r12;
        r2 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0154, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0155, code lost:
        r14 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0163, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0164, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0167, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x017a, code lost:
        r0 = "Error in peekHits fetching hitIds: ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x017f, code lost:
        r0 = new java.lang.String("Error in peekHits fetching hitIds: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0189, code lost:
        r12.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0142 A[EDGE_INSN: B:125:0x0142->B:60:0x0142 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010d A[Catch:{ all -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0112 A[Catch:{ all -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012a A[Catch:{ all -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0154 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:11:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0163 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x017a A[Catch:{ all -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x017f A[Catch:{ all -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza() {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r0 = "%s ASC"
            com.google.android.gms.tagmanager.zzbg r2 = com.google.android.gms.tagmanager.zzdh.zzb
            java.lang.String r3 = "GTM Dispatch running..."
            r2.zzd(r3)
            com.google.android.gms.tagmanager.zzbk r2 = r1.zzc
            boolean r2 = r2.zzb()
            if (r2 == 0) goto L_0x01f0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = "Error opening database for peekHits"
            android.database.sqlite.SQLiteDatabase r3 = r1.zzk(r3)
            java.lang.String r13 = "hit_first_send_time"
            java.lang.String r15 = "hit_id"
            r12 = 0
            r11 = 1
            if (r3 != 0) goto L_0x0029
            r14 = 0
            goto L_0x018c
        L_0x0029:
            java.lang.String r4 = "hit_time"
            java.lang.String[] r6 = new java.lang.String[]{r15, r4, r13}     // Catch:{ SQLiteException -> 0x0167, all -> 0x0163 }
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ SQLiteException -> 0x0167, all -> 0x0163 }
            r4[r12] = r15     // Catch:{ SQLiteException -> 0x0167, all -> 0x0163 }
            java.lang.String r5 = "gtm_hits"
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r16 = java.lang.String.format(r0, r4)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0163 }
            r17 = 40
            java.lang.String r18 = java.lang.Integer.toString(r17)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0163 }
            r4 = r3
            r14 = 1
            r11 = r16
            r14 = 0
            r12 = r18
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x0161, all -> 0x0163 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x015b, all -> 0x0154 }
            r11.<init>()     // Catch:{ SQLiteException -> 0x015b, all -> 0x0154 }
            boolean r2 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x014e, all -> 0x0154 }
            if (r2 == 0) goto L_0x0076
        L_0x0059:
            com.google.android.gms.tagmanager.zzca r2 = new com.google.android.gms.tagmanager.zzca     // Catch:{ SQLiteException -> 0x014e, all -> 0x0154 }
            long r5 = r12.getLong(r14)     // Catch:{ SQLiteException -> 0x014e, all -> 0x0154 }
            r4 = 1
            long r7 = r12.getLong(r4)     // Catch:{ SQLiteException -> 0x014e, all -> 0x0154 }
            r4 = 2
            long r9 = r12.getLong(r4)     // Catch:{ SQLiteException -> 0x014e, all -> 0x0154 }
            r4 = r2
            r4.<init>(r5, r7, r9)     // Catch:{ SQLiteException -> 0x014e, all -> 0x0154 }
            r11.add(r2)     // Catch:{ SQLiteException -> 0x014e, all -> 0x0154 }
            boolean r2 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x014e, all -> 0x0154 }
            if (r2 != 0) goto L_0x0059
        L_0x0076:
            r12.close()
            java.lang.String r2 = "hit_url"
            java.lang.String[] r6 = new java.lang.String[]{r15, r2}     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00f1 }
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00f1 }
            r4[r14] = r15     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00f1 }
            java.lang.String r5 = "gtm_hits"
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r0 = java.lang.String.format(r0, r4)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00f1 }
            java.lang.String r2 = java.lang.Integer.toString(r17)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00f1 }
            r4 = r3
            r3 = r11
            r11 = r0
            r17 = r12
            r12 = r2
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x00ef, all -> 0x00ed }
            boolean r0 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x00eb }
            if (r0 == 0) goto L_0x00e3
            r0 = 0
        L_0x00a3:
            r2 = r12
            android.database.sqlite.SQLiteCursor r2 = (android.database.sqlite.SQLiteCursor) r2     // Catch:{ SQLiteException -> 0x00eb }
            android.database.CursorWindow r2 = r2.getWindow()     // Catch:{ SQLiteException -> 0x00eb }
            int r2 = r2.getNumRows()     // Catch:{ SQLiteException -> 0x00eb }
            if (r2 <= 0) goto L_0x00bf
            java.lang.Object r2 = r3.get(r0)     // Catch:{ SQLiteException -> 0x00eb }
            com.google.android.gms.tagmanager.zzca r2 = (com.google.android.gms.tagmanager.zzca) r2     // Catch:{ SQLiteException -> 0x00eb }
            r4 = 1
            java.lang.String r5 = r12.getString(r4)     // Catch:{ SQLiteException -> 0x00eb }
            r2.zzd(r5)     // Catch:{ SQLiteException -> 0x00eb }
            goto L_0x00db
        L_0x00bf:
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ SQLiteException -> 0x00eb }
            java.lang.Object r2 = r3.get(r0)     // Catch:{ SQLiteException -> 0x00eb }
            com.google.android.gms.tagmanager.zzca r2 = (com.google.android.gms.tagmanager.zzca) r2     // Catch:{ SQLiteException -> 0x00eb }
            long r5 = r2.zzb()     // Catch:{ SQLiteException -> 0x00eb }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x00eb }
            r4[r14] = r2     // Catch:{ SQLiteException -> 0x00eb }
            java.lang.String r2 = "HitString for hitId %d too large.  Hit will be deleted."
            java.lang.String r2 = java.lang.String.format(r2, r4)     // Catch:{ SQLiteException -> 0x00eb }
            com.google.android.gms.tagmanager.zzdh.zzc(r2)     // Catch:{ SQLiteException -> 0x00eb }
        L_0x00db:
            int r0 = r0 + 1
            boolean r2 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x00eb }
            if (r2 != 0) goto L_0x00a3
        L_0x00e3:
            r12.close()
            r2 = r3
            goto L_0x018c
        L_0x00e9:
            r0 = move-exception
            goto L_0x0148
        L_0x00eb:
            r0 = move-exception
            goto L_0x00fd
        L_0x00ed:
            r0 = move-exception
            goto L_0x00f4
        L_0x00ef:
            r0 = move-exception
            goto L_0x00fb
        L_0x00f1:
            r0 = move-exception
            r17 = r12
        L_0x00f4:
            r12 = r17
            goto L_0x0148
        L_0x00f7:
            r0 = move-exception
            r3 = r11
            r17 = r12
        L_0x00fb:
            r12 = r17
        L_0x00fd:
            java.lang.String r2 = "Error in peekHits fetching hit url: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00e9 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00e9 }
            int r4 = r0.length()     // Catch:{ all -> 0x00e9 }
            if (r4 == 0) goto L_0x0112
            java.lang.String r0 = r2.concat(r0)     // Catch:{ all -> 0x00e9 }
            goto L_0x0117
        L_0x0112:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x00e9 }
            r0.<init>(r2)     // Catch:{ all -> 0x00e9 }
        L_0x0117:
            com.google.android.gms.tagmanager.zzdh.zzc(r0)     // Catch:{ all -> 0x00e9 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00e9 }
            r2.<init>()     // Catch:{ all -> 0x00e9 }
            java.util.Iterator r0 = r3.iterator()     // Catch:{ all -> 0x00e9 }
            r3 = 0
        L_0x0124:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x00e9 }
            if (r4 == 0) goto L_0x0142
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.tagmanager.zzca r4 = (com.google.android.gms.tagmanager.zzca) r4     // Catch:{ all -> 0x00e9 }
            java.lang.String r5 = r4.zzc()     // Catch:{ all -> 0x00e9 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00e9 }
            if (r5 == 0) goto L_0x013e
            if (r3 == 0) goto L_0x013d
            goto L_0x0142
        L_0x013d:
            r3 = 1
        L_0x013e:
            r2.add(r4)     // Catch:{ all -> 0x00e9 }
            goto L_0x0124
        L_0x0142:
            if (r12 == 0) goto L_0x018c
            r12.close()
            goto L_0x018c
        L_0x0148:
            if (r12 == 0) goto L_0x014d
            r12.close()
        L_0x014d:
            throw r0
        L_0x014e:
            r0 = move-exception
            r3 = r11
            r17 = r12
            r2 = r3
            goto L_0x015e
        L_0x0154:
            r0 = move-exception
            r17 = r12
            r14 = r17
            goto L_0x01ea
        L_0x015b:
            r0 = move-exception
            r17 = r12
        L_0x015e:
            r12 = r17
            goto L_0x016a
        L_0x0161:
            r0 = move-exception
            goto L_0x0169
        L_0x0163:
            r0 = move-exception
            r14 = 0
            goto L_0x01ea
        L_0x0167:
            r0 = move-exception
            r14 = 0
        L_0x0169:
            r12 = 0
        L_0x016a:
            java.lang.String r3 = "Error in peekHits fetching hitIds: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01e8 }
            int r4 = r0.length()     // Catch:{ all -> 0x01e8 }
            if (r4 == 0) goto L_0x017f
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x01e8 }
            goto L_0x0184
        L_0x017f:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x01e8 }
            r0.<init>(r3)     // Catch:{ all -> 0x01e8 }
        L_0x0184:
            com.google.android.gms.tagmanager.zzdh.zzc(r0)     // Catch:{ all -> 0x01e8 }
            if (r12 == 0) goto L_0x018c
            r12.close()
        L_0x018c:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x01a0
            com.google.android.gms.tagmanager.zzbg r0 = com.google.android.gms.tagmanager.zzdh.zzb
            java.lang.String r2 = "...nothing to dispatch"
            r0.zzd(r2)
            com.google.android.gms.tagmanager.zzez r0 = r1.zzi
            r2 = 1
            r0.zza(r2)
            return
        L_0x01a0:
            com.google.android.gms.tagmanager.zzbk r0 = r1.zzc
            r0.zza(r2)
            java.lang.String r0 = "Error opening database for getNumStoredHits."
            android.database.sqlite.SQLiteDatabase r2 = r1.zzk(r0)
            if (r2 != 0) goto L_0x01ae
            goto L_0x01db
        L_0x01ae:
            java.lang.String[] r4 = new java.lang.String[]{r15, r13}     // Catch:{ SQLiteException -> 0x01c9, all -> 0x01c6 }
            java.lang.String r3 = "gtm_hits"
            java.lang.String r5 = "hit_first_send_time=0"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x01c9, all -> 0x01c6 }
            int r12 = r2.getCount()     // Catch:{ SQLiteException -> 0x01ca }
            r2.close()
            goto L_0x01d2
        L_0x01c6:
            r0 = move-exception
            r14 = 0
            goto L_0x01e2
        L_0x01c9:
            r2 = 0
        L_0x01ca:
            java.lang.String r0 = "Error getting num untried hits"
            com.google.android.gms.tagmanager.zzdh.zzc(r0)     // Catch:{ all -> 0x01e0 }
            if (r2 != 0) goto L_0x01dc
            r12 = 0
        L_0x01d2:
            if (r12 <= 0) goto L_0x01db
            com.google.android.gms.tagmanager.zzff r0 = com.google.android.gms.tagmanager.zzff.zzg()
            r0.zza()
        L_0x01db:
            return
        L_0x01dc:
            r2.close()
            return
        L_0x01e0:
            r0 = move-exception
            r14 = r2
        L_0x01e2:
            if (r14 == 0) goto L_0x01e7
            r14.close()
        L_0x01e7:
            throw r0
        L_0x01e8:
            r0 = move-exception
            r14 = r12
        L_0x01ea:
            if (r14 == 0) goto L_0x01ef
            r14.close()
        L_0x01ef:
            throw r0
        L_0x01f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzdw.zza():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ba, code lost:
        if (r2 != null) goto L_0x00bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ad A[Catch:{ all -> 0x00de }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2 A[Catch:{ all -> 0x00de }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(long r19, java.lang.String r21) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "hit_id"
            com.google.android.gms.common.util.Clock r2 = r1.zzg
            long r2 = r2.currentTimeMillis()
            long r4 = r1.zzf
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 + r6
            java.lang.String r6 = "gtm_hits"
            r7 = 1
            r8 = 0
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x0019
            goto L_0x004a
        L_0x0019:
            r1.zzf = r2
            java.lang.String r2 = "Error opening database for deleteStaleHits."
            android.database.sqlite.SQLiteDatabase r2 = r1.zzk(r2)
            if (r2 == 0) goto L_0x004a
            com.google.android.gms.common.util.Clock r3 = r1.zzg
            long r3 = r3.currentTimeMillis()
            java.lang.String[] r5 = new java.lang.String[r7]
            r9 = -2592000000(0xffffffff65813800, double:NaN)
            long r3 = r3 + r9
            java.lang.String r3 = java.lang.Long.toString(r3)
            r5[r8] = r3
            java.lang.String r3 = "HIT_TIME < ?"
            r2.delete(r6, r3, r5)
            com.google.android.gms.tagmanager.zzez r2 = r1.zzi
            int r3 = r18.zzc()
            if (r3 != 0) goto L_0x0046
            r3 = 1
            goto L_0x0047
        L_0x0046:
            r3 = 0
        L_0x0047:
            r2.zza(r3)
        L_0x004a:
            int r2 = r18.zzc()
            int r3 = r1.zzh
            int r2 = r2 - r3
            int r2 = r2 + r7
            r3 = 0
            if (r2 <= 0) goto L_0x00e6
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r5 = "Error opening database for peekHitIds."
            android.database.sqlite.SQLiteDatabase r9 = r1.zzk(r5)
            if (r9 != 0) goto L_0x0063
            goto L_0x00bf
        L_0x0063:
            java.lang.String[] r11 = new java.lang.String[]{r0}     // Catch:{ SQLiteException -> 0x009b, all -> 0x0099 }
            java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch:{ SQLiteException -> 0x009b, all -> 0x0099 }
            r5[r8] = r0     // Catch:{ SQLiteException -> 0x009b, all -> 0x0099 }
            java.lang.String r10 = "gtm_hits"
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.String r0 = "%s ASC"
            java.lang.String r16 = java.lang.String.format(r0, r5)     // Catch:{ SQLiteException -> 0x009b, all -> 0x0099 }
            java.lang.String r17 = java.lang.Integer.toString(r2)     // Catch:{ SQLiteException -> 0x009b, all -> 0x0099 }
            android.database.Cursor r2 = r9.query(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x009b, all -> 0x0099 }
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0097 }
            if (r0 == 0) goto L_0x00bc
        L_0x0085:
            long r9 = r2.getLong(r8)     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x0097 }
            r4.add(r0)     // Catch:{ SQLiteException -> 0x0097 }
            boolean r0 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0097 }
            if (r0 != 0) goto L_0x0085
            goto L_0x00bc
        L_0x0097:
            r0 = move-exception
            goto L_0x009d
        L_0x0099:
            r0 = move-exception
            goto L_0x00e0
        L_0x009b:
            r0 = move-exception
            r2 = r3
        L_0x009d:
            java.lang.String r5 = "Error in peekHits fetching hitIds: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00de }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00de }
            int r7 = r0.length()     // Catch:{ all -> 0x00de }
            if (r7 == 0) goto L_0x00b2
            java.lang.String r0 = r5.concat(r0)     // Catch:{ all -> 0x00de }
            goto L_0x00b7
        L_0x00b2:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x00de }
            r0.<init>(r5)     // Catch:{ all -> 0x00de }
        L_0x00b7:
            com.google.android.gms.tagmanager.zzdh.zzc(r0)     // Catch:{ all -> 0x00de }
            if (r2 == 0) goto L_0x00bf
        L_0x00bc:
            r2.close()
        L_0x00bf:
            int r0 = r4.size()
            r2 = 51
            java.lang.String r5 = "Store full, deleting "
            java.lang.String r7 = " hits to make room."
            java.lang.String r0 = p379.C13715c.m34242h(r2, r5, r0, r7)
            com.google.android.gms.tagmanager.zzbg r2 = com.google.android.gms.tagmanager.zzdh.zzb
            r2.zzd(r0)
            java.lang.String[] r0 = new java.lang.String[r8]
            java.lang.Object[] r0 = r4.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r1.zzj(r0)
            goto L_0x00e6
        L_0x00de:
            r0 = move-exception
            r3 = r2
        L_0x00e0:
            if (r3 == 0) goto L_0x00e5
            r3.close()
        L_0x00e5:
            throw r0
        L_0x00e6:
            java.lang.String r0 = "Error opening database for putHit"
            android.database.sqlite.SQLiteDatabase r0 = r1.zzk(r0)
            if (r0 != 0) goto L_0x00ef
            return
        L_0x00ef:
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.Long r4 = java.lang.Long.valueOf(r19)
            java.lang.String r5 = "hit_time"
            r2.put(r5, r4)
            java.lang.String r4 = "hit_url"
            r5 = r21
            r2.put(r4, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.lang.String r5 = "hit_first_send_time"
            r2.put(r5, r4)
            r0.insert(r6, r3, r2)     // Catch:{ SQLiteException -> 0x0116 }
            com.google.android.gms.tagmanager.zzez r0 = r1.zzi     // Catch:{ SQLiteException -> 0x0116 }
            r0.zza(r8)     // Catch:{ SQLiteException -> 0x0116 }
            return
        L_0x0116:
            java.lang.String r0 = "Error storing hit"
            com.google.android.gms.tagmanager.zzdh.zzc(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzdw.zzb(long, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String[], android.database.Cursor] */
    public final int zzc() {
        SQLiteDatabase zzk = zzk("Error opening database for getNumStoredHits.");
        int i = 0;
        if (zzk == null) {
            return 0;
        }
        ? r2 = 0;
        try {
            Cursor rawQuery = zzk.rawQuery("SELECT COUNT(*) from gtm_hits", r2);
            if (rawQuery.moveToFirst()) {
                i = (int) rawQuery.getLong(0);
            }
            rawQuery.close();
            return i;
        } catch (SQLiteException unused) {
            zzdh.zzc("Error getting numStoredHits");
            if (r2 == 0) {
                return 0;
            }
            r2.close();
            return 0;
        } catch (Throwable th) {
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
    }

    public final void zzj(String[] strArr) {
        int length;
        SQLiteDatabase zzk;
        if (strArr != null && (length = strArr.length) != 0 && (zzk = zzk("Error opening database for deleteHits.")) != null) {
            boolean z = true;
            try {
                zzk.delete("gtm_hits", String.format("HIT_ID in (%s)", new Object[]{TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, Collections.nCopies(length, "?"))}), strArr);
                zzez zzez = this.zzi;
                if (zzc() != 0) {
                    z = false;
                }
                zzez.zza(z);
            } catch (SQLiteException unused) {
                zzdh.zzc("Error deleting hits");
            }
        }
    }
}
