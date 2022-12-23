package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

final class zzaa extends zzkn {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzaa(zzkz zzkz) {
        super(zzkz);
    }

    private final zzu zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzu) this.zzc.get(num);
        }
        zzu zzu = new zzu(this, this.zza, (zzt) null);
        this.zzc.put(num, zzu);
        return zzu;
    }

    private final boolean zzf(int i, int i2) {
        zzu zzu = (zzu) this.zzc.get(Integer.valueOf(i));
        if (zzu == null) {
            return false;
        }
        return zzu.zze.get(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02e8, code lost:
        if (r5 != null) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x078d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0793, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0794, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x07b0, code lost:
        if (r5 == null) goto L_0x07b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x07bc, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0953, code lost:
        if (r13 == null) goto L_0x0958;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0a69, code lost:
        if (r7.zzj() == false) goto L_0x0a74;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0a6b, code lost:
        r7 = java.lang.Integer.valueOf(r7.zza());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0a74, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0a75, code lost:
        r0.zzc("Invalid property filter ID. appId, id", r6, java.lang.String.valueOf(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016c, code lost:
        if (r5 != null) goto L_0x016e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0607  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0793 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:257:0x06f2] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x07bc  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0869  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x0960  */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x0ab2  */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x0b46  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01af A[Catch:{ SQLiteException -> 0x0221 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01bd A[SYNTHETIC, Splitter:B:65:0x01bd] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0248  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zza(java.lang.String r65, java.util.List r66, java.util.List r67, java.lang.Long r68, java.lang.Long r69) {
        /*
            r64 = this;
            r10 = r64
            java.lang.String r11 = "current_results"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r65)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r66)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r67)
            r0 = r65
            r10.zza = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r10.zzb = r0
            s0.b r0 = new s0.b
            r0.<init>()
            r10.zzc = r0
            r0 = r68
            r10.zzd = r0
            r0 = r69
            r10.zze = r0
            java.util.Iterator r0 = r66.iterator()
        L_0x002b:
            boolean r1 = r0.hasNext()
            r12 = 0
            r13 = 1
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.zzfs r1 = (com.google.android.gms.internal.measurement.zzfs) r1
            java.lang.String r1 = r1.zzh()
            java.lang.String r2 = "_s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x002b
            r1 = 1
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            com.google.android.gms.internal.measurement.zzny.zzc()
            com.google.android.gms.measurement.internal.zzfy r0 = r10.zzs
            com.google.android.gms.measurement.internal.zzag r0 = r0.zzf()
            java.lang.String r2 = r10.zza
            com.google.android.gms.measurement.internal.zzea r3 = com.google.android.gms.measurement.internal.zzeb.zzW
            boolean r14 = r0.zzs(r2, r3)
            com.google.android.gms.internal.measurement.zzny.zzc()
            com.google.android.gms.measurement.internal.zzfy r0 = r10.zzs
            com.google.android.gms.measurement.internal.zzag r0 = r0.zzf()
            java.lang.String r2 = r10.zza
            com.google.android.gms.measurement.internal.zzea r3 = com.google.android.gms.measurement.internal.zzeb.zzV
            boolean r15 = r0.zzs(r2, r3)
            if (r1 == 0) goto L_0x00af
            com.google.android.gms.measurement.internal.zzkz r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzam r2 = r0.zzi()
            java.lang.String r3 = r10.zza
            r2.zzW()
            r2.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            java.lang.String r5 = "current_session_count"
            r0.put(r5, r4)
            android.database.sqlite.SQLiteDatabase r4 = r2.zzh()     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String[] r5 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x009b }
            r5[r12] = r3     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String r6 = "events"
            java.lang.String r7 = "app_id = ?"
            r4.update(r6, r0, r7, r5)     // Catch:{ SQLiteException -> 0x009b }
            goto L_0x00af
        L_0x009b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfy r2 = r2.zzs
            com.google.android.gms.measurement.internal.zzeo r2 = r2.zzay()
            com.google.android.gms.measurement.internal.zzem r2 = r2.zzd()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeo.zzn(r3)
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            r2.zzc(r4, r3, r0)
        L_0x00af:
            java.util.Map r0 = java.util.Collections.emptyMap()
            java.lang.String r9 = "Failed to merge filter. appId"
            java.lang.String r8 = "Database error querying filters. appId"
            java.lang.String r7 = "data"
            java.lang.String r6 = "audience_id"
            if (r15 == 0) goto L_0x0179
            if (r14 == 0) goto L_0x0179
            com.google.android.gms.measurement.internal.zzkz r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzam r2 = r0.zzi()
            java.lang.String r3 = r10.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            s0.b r4 = new s0.b
            r4.<init>()
            android.database.sqlite.SQLiteDatabase r16 = r2.zzh()
            java.lang.String[] r18 = new java.lang.String[]{r6, r7}     // Catch:{ SQLiteException -> 0x0155, all -> 0x0152 }
            java.lang.String[] r0 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0155, all -> 0x0152 }
            r0[r12] = r3     // Catch:{ SQLiteException -> 0x0155, all -> 0x0152 }
            java.lang.String r17 = "event_filters"
            java.lang.String r19 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r5 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x0155, all -> 0x0152 }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0150 }
            if (r0 == 0) goto L_0x014b
        L_0x00f1:
            byte[] r0 = r5.getBlob(r13)     // Catch:{ SQLiteException -> 0x0150 }
            com.google.android.gms.internal.measurement.zzei r13 = com.google.android.gms.internal.measurement.zzej.zzc()     // Catch:{ IOException -> 0x012b }
            com.google.android.gms.internal.measurement.zzlk r0 = com.google.android.gms.measurement.internal.zzlb.zzl(r13, r0)     // Catch:{ IOException -> 0x012b }
            com.google.android.gms.internal.measurement.zzei r0 = (com.google.android.gms.internal.measurement.zzei) r0     // Catch:{ IOException -> 0x012b }
            com.google.android.gms.internal.measurement.zzke r0 = r0.zzaE()     // Catch:{ IOException -> 0x012b }
            com.google.android.gms.internal.measurement.zzej r0 = (com.google.android.gms.internal.measurement.zzej) r0     // Catch:{ IOException -> 0x012b }
            boolean r13 = r0.zzo()     // Catch:{ SQLiteException -> 0x0150 }
            if (r13 != 0) goto L_0x010c
            goto L_0x013d
        L_0x010c:
            int r13 = r5.getInt(r12)     // Catch:{ SQLiteException -> 0x0150 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ SQLiteException -> 0x0150 }
            java.lang.Object r16 = r4.get(r13)     // Catch:{ SQLiteException -> 0x0150 }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x0150 }
            if (r16 != 0) goto L_0x0125
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0150 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0150 }
            r4.put(r13, r12)     // Catch:{ SQLiteException -> 0x0150 }
            goto L_0x0127
        L_0x0125:
            r12 = r16
        L_0x0127:
            r12.add(r0)     // Catch:{ SQLiteException -> 0x0150 }
            goto L_0x013d
        L_0x012b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfy r12 = r2.zzs     // Catch:{ SQLiteException -> 0x0150 }
            com.google.android.gms.measurement.internal.zzeo r12 = r12.zzay()     // Catch:{ SQLiteException -> 0x0150 }
            com.google.android.gms.measurement.internal.zzem r12 = r12.zzd()     // Catch:{ SQLiteException -> 0x0150 }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzeo.zzn(r3)     // Catch:{ SQLiteException -> 0x0150 }
            r12.zzc(r9, r13, r0)     // Catch:{ SQLiteException -> 0x0150 }
        L_0x013d:
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0150 }
            if (r0 != 0) goto L_0x0148
            r5.close()
            r12 = r4
            goto L_0x017a
        L_0x0148:
            r12 = 0
            r13 = 1
            goto L_0x00f1
        L_0x014b:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0150 }
            goto L_0x016e
        L_0x0150:
            r0 = move-exception
            goto L_0x0157
        L_0x0152:
            r0 = move-exception
            r5 = 0
            goto L_0x0173
        L_0x0155:
            r0 = move-exception
            r5 = 0
        L_0x0157:
            com.google.android.gms.measurement.internal.zzfy r2 = r2.zzs     // Catch:{ all -> 0x0172 }
            com.google.android.gms.measurement.internal.zzeo r2 = r2.zzay()     // Catch:{ all -> 0x0172 }
            com.google.android.gms.measurement.internal.zzem r2 = r2.zzd()     // Catch:{ all -> 0x0172 }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeo.zzn(r3)     // Catch:{ all -> 0x0172 }
            r2.zzc(r8, r3, r0)     // Catch:{ all -> 0x0172 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0172 }
            if (r5 == 0) goto L_0x0179
        L_0x016e:
            r5.close()
            goto L_0x0179
        L_0x0172:
            r0 = move-exception
        L_0x0173:
            if (r5 == 0) goto L_0x0178
            r5.close()
        L_0x0178:
            throw r0
        L_0x0179:
            r12 = r0
        L_0x017a:
            com.google.android.gms.measurement.internal.zzkz r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzam r2 = r0.zzi()
            java.lang.String r3 = r10.zza
            r2.zzW()
            r2.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            android.database.sqlite.SQLiteDatabase r16 = r2.zzh()
            java.lang.String[] r18 = new java.lang.String[]{r6, r11}     // Catch:{ SQLiteException -> 0x0229, all -> 0x0225 }
            r4 = 1
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0229, all -> 0x0225 }
            r4 = 0
            r0[r4] = r3     // Catch:{ SQLiteException -> 0x0229, all -> 0x0225 }
            java.lang.String r17 = "audience_filter_values"
            java.lang.String r19 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r4 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x0229, all -> 0x0225 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0221 }
            if (r0 != 0) goto L_0x01bd
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0221 }
            r4.close()
            r13 = r0
            r18 = r6
            r19 = r7
            goto L_0x024c
        L_0x01bd:
            s0.b r5 = new s0.b     // Catch:{ SQLiteException -> 0x0221 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0221 }
        L_0x01c2:
            r13 = 0
            int r16 = r4.getInt(r13)     // Catch:{ SQLiteException -> 0x0221 }
            r13 = 1
            byte[] r0 = r4.getBlob(r13)     // Catch:{ SQLiteException -> 0x0221 }
            com.google.android.gms.internal.measurement.zzgg r13 = com.google.android.gms.internal.measurement.zzgh.zzf()     // Catch:{ IOException -> 0x01ea }
            com.google.android.gms.internal.measurement.zzlk r0 = com.google.android.gms.measurement.internal.zzlb.zzl(r13, r0)     // Catch:{ IOException -> 0x01ea }
            com.google.android.gms.internal.measurement.zzgg r0 = (com.google.android.gms.internal.measurement.zzgg) r0     // Catch:{ IOException -> 0x01ea }
            com.google.android.gms.internal.measurement.zzke r0 = r0.zzaE()     // Catch:{ IOException -> 0x01ea }
            com.google.android.gms.internal.measurement.zzgh r0 = (com.google.android.gms.internal.measurement.zzgh) r0     // Catch:{ IOException -> 0x01ea }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x0221 }
            r5.put(r13, r0)     // Catch:{ SQLiteException -> 0x0221 }
            r17 = r5
            r18 = r6
            r19 = r7
            goto L_0x0208
        L_0x01ea:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfy r13 = r2.zzs     // Catch:{ SQLiteException -> 0x0221 }
            com.google.android.gms.measurement.internal.zzeo r13 = r13.zzay()     // Catch:{ SQLiteException -> 0x0221 }
            com.google.android.gms.measurement.internal.zzem r13 = r13.zzd()     // Catch:{ SQLiteException -> 0x0221 }
            r17 = r5
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            r18 = r6
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzeo.zzn(r3)     // Catch:{ SQLiteException -> 0x021d }
            r19 = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x021b }
            r13.zzd(r5, r6, r7, r0)     // Catch:{ SQLiteException -> 0x021b }
        L_0x0208:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x021b }
            if (r0 != 0) goto L_0x0214
            r4.close()
            r13 = r17
            goto L_0x024c
        L_0x0214:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L_0x01c2
        L_0x021b:
            r0 = move-exception
            goto L_0x022f
        L_0x021d:
            r0 = move-exception
        L_0x021e:
            r19 = r7
            goto L_0x022f
        L_0x0221:
            r0 = move-exception
            r18 = r6
            goto L_0x021e
        L_0x0225:
            r0 = move-exception
            r5 = 0
            goto L_0x0b44
        L_0x0229:
            r0 = move-exception
            r18 = r6
            r19 = r7
            r4 = 0
        L_0x022f:
            com.google.android.gms.measurement.internal.zzfy r2 = r2.zzs     // Catch:{ all -> 0x0b42 }
            com.google.android.gms.measurement.internal.zzeo r2 = r2.zzay()     // Catch:{ all -> 0x0b42 }
            com.google.android.gms.measurement.internal.zzem r2 = r2.zzd()     // Catch:{ all -> 0x0b42 }
            java.lang.String r5 = "Database error querying filter results. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeo.zzn(r3)     // Catch:{ all -> 0x0b42 }
            r2.zzc(r5, r3, r0)     // Catch:{ all -> 0x0b42 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0b42 }
            if (r4 == 0) goto L_0x024b
            r4.close()
        L_0x024b:
            r13 = r0
        L_0x024c:
            boolean r0 = r13.isEmpty()
            r7 = 2
            if (r0 == 0) goto L_0x025b
            r12 = r8
            r13 = r9
            r28 = r18
            r29 = r19
            goto L_0x05fb
        L_0x025b:
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r0 = r13.keySet()
            r2.<init>(r0)
            if (r1 == 0) goto L_0x0454
            java.lang.String r1 = r10.zza
            com.google.android.gms.measurement.internal.zzkz r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzam r3 = r0.zzi()
            java.lang.String r4 = r10.zza
            r3.zzW()
            r3.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            s0.b r0 = new s0.b
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r5 = r3.zzh()
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x02cf, all -> 0x02cb }
            r16 = 0
            r6[r16] = r4     // Catch:{ SQLiteException -> 0x02cf, all -> 0x02cb }
            r16 = 1
            r6[r16] = r4     // Catch:{ SQLiteException -> 0x02cf, all -> 0x02cb }
            java.lang.String r7 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            android.database.Cursor r5 = r5.rawQuery(r7, r6)     // Catch:{ SQLiteException -> 0x02cf, all -> 0x02cb }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x02c9 }
            if (r6 == 0) goto L_0x02c4
        L_0x0298:
            r6 = 0
            int r7 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02c9 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ SQLiteException -> 0x02c9 }
            java.lang.Object r7 = r0.get(r6)     // Catch:{ SQLiteException -> 0x02c9 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ SQLiteException -> 0x02c9 }
            if (r7 != 0) goto L_0x02b1
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x02c9 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x02c9 }
            r0.put(r6, r7)     // Catch:{ SQLiteException -> 0x02c9 }
        L_0x02b1:
            r6 = 1
            int r17 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02c9 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x02c9 }
            r7.add(r6)     // Catch:{ SQLiteException -> 0x02c9 }
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x02c9 }
            if (r6 != 0) goto L_0x0298
            goto L_0x02ea
        L_0x02c4:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x02c9 }
            goto L_0x02ea
        L_0x02c9:
            r0 = move-exception
            goto L_0x02d1
        L_0x02cb:
            r0 = move-exception
            r5 = 0
            goto L_0x044e
        L_0x02cf:
            r0 = move-exception
            r5 = 0
        L_0x02d1:
            com.google.android.gms.measurement.internal.zzfy r3 = r3.zzs     // Catch:{ all -> 0x044d }
            com.google.android.gms.measurement.internal.zzeo r3 = r3.zzay()     // Catch:{ all -> 0x044d }
            com.google.android.gms.measurement.internal.zzem r3 = r3.zzd()     // Catch:{ all -> 0x044d }
            java.lang.String r6 = "Database error querying scoped filters. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeo.zzn(r4)     // Catch:{ all -> 0x044d }
            r3.zzc(r6, r4, r0)     // Catch:{ all -> 0x044d }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x044d }
            if (r5 == 0) goto L_0x02ed
        L_0x02ea:
            r5.close()
        L_0x02ed:
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)
            s0.b r1 = new s0.b
            r1.<init>()
            boolean r3 = r13.isEmpty()
            if (r3 == 0) goto L_0x0302
        L_0x02fe:
            r21 = r8
            goto L_0x044b
        L_0x0302:
            java.util.Set r3 = r13.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x030a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x02fe
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r6 = r13.get(r5)
            com.google.android.gms.internal.measurement.zzgh r6 = (com.google.android.gms.internal.measurement.zzgh) r6
            java.lang.Object r7 = r0.get(r5)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x043a
            boolean r17 = r7.isEmpty()
            if (r17 == 0) goto L_0x0334
            goto L_0x043a
        L_0x0334:
            com.google.android.gms.measurement.internal.zzkz r5 = r10.zzf
            com.google.android.gms.measurement.internal.zzlb r5 = r5.zzu()
            r17 = r0
            java.util.List r0 = r6.zzk()
            java.util.List r0 = r5.zzq(r0, r7)
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x0436
            com.google.android.gms.internal.measurement.zzka r5 = r6.zzby()
            com.google.android.gms.internal.measurement.zzgg r5 = (com.google.android.gms.internal.measurement.zzgg) r5
            r5.zzf()
            r5.zzb(r0)
            com.google.android.gms.measurement.internal.zzkz r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzlb r0 = r0.zzu()
            r20 = r3
            java.util.List r3 = r6.zzn()
            java.util.List r0 = r0.zzq(r3, r7)
            r5.zzh()
            r5.zzd(r0)
            com.google.android.gms.internal.measurement.zzob.zzc()
            com.google.android.gms.measurement.internal.zzfy r0 = r10.zzs
            com.google.android.gms.measurement.internal.zzag r0 = r0.zzf()
            com.google.android.gms.measurement.internal.zzea r3 = com.google.android.gms.measurement.internal.zzeb.zzaA
            r21 = r8
            r8 = 0
            boolean r0 = r0.zzs(r8, r3)
            if (r0 == 0) goto L_0x03ea
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r3 = r6.zzj()
            java.util.Iterator r3 = r3.iterator()
        L_0x038d:
            boolean r22 = r3.hasNext()
            if (r22 == 0) goto L_0x03b2
            java.lang.Object r22 = r3.next()
            r8 = r22
            com.google.android.gms.internal.measurement.zzfq r8 = (com.google.android.gms.internal.measurement.zzfq) r8
            int r22 = r8.zza()
            r23 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            boolean r3 = r7.contains(r3)
            if (r3 != 0) goto L_0x03ae
            r0.add(r8)
        L_0x03ae:
            r3 = r23
            r8 = 0
            goto L_0x038d
        L_0x03b2:
            r5.zze()
            r5.zza(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r3 = r6.zzm()
            java.util.Iterator r3 = r3.iterator()
        L_0x03c5:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x03e3
            java.lang.Object r6 = r3.next()
            com.google.android.gms.internal.measurement.zzgj r6 = (com.google.android.gms.internal.measurement.zzgj) r6
            int r8 = r6.zzb()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r8 = r7.contains(r8)
            if (r8 != 0) goto L_0x03c5
            r0.add(r6)
            goto L_0x03c5
        L_0x03e3:
            r5.zzg()
            r5.zzc(r0)
            goto L_0x0428
        L_0x03ea:
            r0 = 0
        L_0x03eb:
            int r3 = r6.zza()
            if (r0 >= r3) goto L_0x0409
            com.google.android.gms.internal.measurement.zzfq r3 = r6.zze(r0)
            int r3 = r3.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r7.contains(r3)
            if (r3 == 0) goto L_0x0406
            r5.zzi(r0)
        L_0x0406:
            int r0 = r0 + 1
            goto L_0x03eb
        L_0x0409:
            r0 = 0
        L_0x040a:
            int r3 = r6.zzc()
            if (r0 >= r3) goto L_0x0428
            com.google.android.gms.internal.measurement.zzgj r3 = r6.zzi(r0)
            int r3 = r3.zzb()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r7.contains(r3)
            if (r3 == 0) goto L_0x0425
            r5.zzj(r0)
        L_0x0425:
            int r0 = r0 + 1
            goto L_0x040a
        L_0x0428:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            com.google.android.gms.internal.measurement.zzke r3 = r5.zzaE()
            com.google.android.gms.internal.measurement.zzgh r3 = (com.google.android.gms.internal.measurement.zzgh) r3
            r1.put(r0, r3)
            goto L_0x0443
        L_0x0436:
            r0 = r17
            goto L_0x030a
        L_0x043a:
            r17 = r0
            r20 = r3
            r21 = r8
            r1.put(r5, r6)
        L_0x0443:
            r0 = r17
            r3 = r20
            r8 = r21
            goto L_0x030a
        L_0x044b:
            r0 = r1
            goto L_0x0457
        L_0x044d:
            r0 = move-exception
        L_0x044e:
            if (r5 == 0) goto L_0x0453
            r5.close()
        L_0x0453:
            throw r0
        L_0x0454:
            r21 = r8
            r0 = r13
        L_0x0457:
            java.util.Iterator r17 = r2.iterator()
        L_0x045b:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x05f4
            java.lang.Object r1 = r17.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r20 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzgh r1 = (com.google.android.gms.internal.measurement.zzgh) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            s0.b r7 = new s0.b
            r7.<init>()
            if (r1 == 0) goto L_0x04c3
            int r2 = r1.zza()
            if (r2 != 0) goto L_0x048d
            goto L_0x04c3
        L_0x048d:
            java.util.List r2 = r1.zzj()
            java.util.Iterator r2 = r2.iterator()
        L_0x0495:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04c3
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zzfq r3 = (com.google.android.gms.internal.measurement.zzfq) r3
            boolean r4 = r3.zzh()
            if (r4 == 0) goto L_0x0495
            int r4 = r3.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r8 = r3.zzg()
            if (r8 == 0) goto L_0x04be
            long r22 = r3.zzb()
            java.lang.Long r3 = java.lang.Long.valueOf(r22)
            goto L_0x04bf
        L_0x04be:
            r3 = 0
        L_0x04bf:
            r7.put(r4, r3)
            goto L_0x0495
        L_0x04c3:
            s0.b r8 = new s0.b
            r8.<init>()
            if (r1 == 0) goto L_0x050f
            int r2 = r1.zzc()
            if (r2 != 0) goto L_0x04d1
            goto L_0x050f
        L_0x04d1:
            java.util.List r2 = r1.zzm()
            java.util.Iterator r2 = r2.iterator()
        L_0x04d9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x050f
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zzgj r3 = (com.google.android.gms.internal.measurement.zzgj) r3
            boolean r4 = r3.zzi()
            if (r4 == 0) goto L_0x04d9
            int r4 = r3.zza()
            if (r4 <= 0) goto L_0x04d9
            int r4 = r3.zzb()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r22 = r3.zza()
            r23 = r0
            int r0 = r22 + -1
            long r24 = r3.zzc(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r24)
            r8.put(r4, r0)
            r0 = r23
            goto L_0x04d9
        L_0x050f:
            r23 = r0
            if (r1 == 0) goto L_0x055e
            r0 = 0
        L_0x0514:
            int r2 = r1.zzd()
            int r2 = r2 * 64
            if (r0 >= r2) goto L_0x055e
            java.util.List r2 = r1.zzn()
            boolean r2 = com.google.android.gms.measurement.internal.zzlb.zzv(r2, r0)
            if (r2 == 0) goto L_0x0550
            com.google.android.gms.measurement.internal.zzfy r2 = r10.zzs
            com.google.android.gms.measurement.internal.zzeo r2 = r2.zzay()
            com.google.android.gms.measurement.internal.zzem r2 = r2.zzj()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r22 = r9
            java.lang.String r9 = "Filter already evaluated. audience ID, filter ID"
            r2.zzc(r9, r3, r4)
            r6.set(r0)
            java.util.List r2 = r1.zzk()
            boolean r2 = com.google.android.gms.measurement.internal.zzlb.zzv(r2, r0)
            if (r2 == 0) goto L_0x0552
            r5.set(r0)
            goto L_0x0559
        L_0x0550:
            r22 = r9
        L_0x0552:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r7.remove(r2)
        L_0x0559:
            int r0 = r0 + 1
            r9 = r22
            goto L_0x0514
        L_0x055e:
            r22 = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r13.get(r0)
            r4 = r1
            com.google.android.gms.internal.measurement.zzgh r4 = (com.google.android.gms.internal.measurement.zzgh) r4
            if (r15 == 0) goto L_0x05cb
            if (r14 == 0) goto L_0x05cb
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x05cb
            java.lang.Long r1 = r10.zze
            if (r1 == 0) goto L_0x05cb
            java.lang.Long r1 = r10.zzd
            if (r1 != 0) goto L_0x0580
            goto L_0x05cb
        L_0x0580:
            java.util.Iterator r0 = r0.iterator()
        L_0x0584:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x05cb
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.zzej r1 = (com.google.android.gms.internal.measurement.zzej) r1
            int r2 = r1.zzb()
            java.lang.Long r3 = r10.zze
            long r24 = r3.longValue()
            r26 = 1000(0x3e8, double:4.94E-321)
            long r24 = r24 / r26
            boolean r1 = r1.zzm()
            if (r1 == 0) goto L_0x05ac
            java.lang.Long r1 = r10.zzd
            long r24 = r1.longValue()
            long r24 = r24 / r26
        L_0x05ac:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r2 = r7.containsKey(r1)
            if (r2 == 0) goto L_0x05bd
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r7.put(r1, r2)
        L_0x05bd:
            boolean r2 = r8.containsKey(r1)
            if (r2 == 0) goto L_0x0584
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r8.put(r1, r2)
            goto L_0x0584
        L_0x05cb:
            com.google.android.gms.measurement.internal.zzu r0 = new com.google.android.gms.measurement.internal.zzu
            java.lang.String r3 = r10.zza
            r9 = 0
            r1 = r0
            r2 = r64
            r28 = r18
            r29 = r19
            r16 = r12
            r12 = r21
            r65 = r13
            r13 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.Map r1 = r10.zzc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r1.put(r2, r0)
            r9 = r13
            r12 = r16
            r0 = r23
            r13 = r65
            goto L_0x045b
        L_0x05f4:
            r13 = r9
            r28 = r18
            r29 = r19
            r12 = r21
        L_0x05fb:
            boolean r0 = r66.isEmpty()
            java.lang.String r1 = "Skipping failed audience ID"
            if (r0 == 0) goto L_0x0607
        L_0x0603:
            r24 = r11
            goto L_0x085f
        L_0x0607:
            com.google.android.gms.measurement.internal.zzw r2 = new com.google.android.gms.measurement.internal.zzw
            r3 = 0
            r2.<init>(r10, r3)
            s0.b r4 = new s0.b
            r4.<init>()
            java.util.Iterator r5 = r66.iterator()
        L_0x0616:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0603
            java.lang.Object r0 = r5.next()
            com.google.android.gms.internal.measurement.zzfs r0 = (com.google.android.gms.internal.measurement.zzfs) r0
            java.lang.String r6 = r10.zza
            com.google.android.gms.internal.measurement.zzfs r6 = r2.zza(r6, r0)
            if (r6 == 0) goto L_0x0616
            com.google.android.gms.measurement.internal.zzkz r7 = r10.zzf
            com.google.android.gms.measurement.internal.zzam r7 = r7.zzi()
            java.lang.String r8 = r10.zza
            java.lang.String r9 = r6.zzh()
            java.lang.String r14 = r0.zzh()
            com.google.android.gms.measurement.internal.zzas r14 = r7.zzn(r8, r14)
            if (r14 != 0) goto L_0x067f
            com.google.android.gms.measurement.internal.zzfy r14 = r7.zzs
            com.google.android.gms.measurement.internal.zzeo r14 = r14.zzay()
            com.google.android.gms.measurement.internal.zzem r14 = r14.zzk()
            java.lang.Object r15 = com.google.android.gms.measurement.internal.zzeo.zzn(r8)
            com.google.android.gms.measurement.internal.zzfy r7 = r7.zzs
            com.google.android.gms.measurement.internal.zzej r7 = r7.zzj()
            java.lang.String r7 = r7.zzd(r9)
            java.lang.String r9 = "Event aggregate wasn't created during raw event logging. appId, event"
            r14.zzc(r9, r15, r7)
            com.google.android.gms.measurement.internal.zzas r7 = new com.google.android.gms.measurement.internal.zzas
            r30 = r7
            java.lang.String r32 = r0.zzh()
            r33 = 1
            r35 = 1
            r37 = 1
            long r39 = r0.zzd()
            r41 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r31 = r8
            r30.<init>(r31, r32, r33, r35, r37, r39, r41, r43, r44, r45, r46)
            goto L_0x06b4
        L_0x067f:
            com.google.android.gms.measurement.internal.zzas r7 = new com.google.android.gms.measurement.internal.zzas
            r47 = r7
            java.lang.String r0 = r14.zza
            r48 = r0
            java.lang.String r0 = r14.zzb
            r49 = r0
            long r8 = r14.zzc
            r15 = 1
            long r50 = r8 + r15
            long r8 = r14.zzd
            long r52 = r8 + r15
            long r8 = r14.zze
            long r54 = r8 + r15
            long r8 = r14.zzf
            r56 = r8
            long r8 = r14.zzg
            r58 = r8
            java.lang.Long r0 = r14.zzh
            r60 = r0
            java.lang.Long r0 = r14.zzi
            r61 = r0
            java.lang.Long r0 = r14.zzj
            r62 = r0
            java.lang.Boolean r0 = r14.zzk
            r63 = r0
            r47.<init>(r48, r49, r50, r52, r54, r56, r58, r60, r61, r62, r63)
        L_0x06b4:
            com.google.android.gms.measurement.internal.zzkz r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzi()
            r0.zzE(r7)
            long r8 = r7.zzc
            java.lang.String r14 = r6.zzh()
            java.lang.Object r0 = r4.get(r14)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x07c0
            com.google.android.gms.measurement.internal.zzkz r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzam r15 = r0.zzi()
            java.lang.String r3 = r10.zza
            r15.zzW()
            r15.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            r65 = r2
            s0.b r2 = new s0.b
            r2.<init>()
            android.database.sqlite.SQLiteDatabase r16 = r15.zzh()
            r66 = r5
            r24 = r11
            r11 = r28
            r5 = r29
            java.lang.String[] r18 = new java.lang.String[]{r11, r5}     // Catch:{ SQLiteException -> 0x0796, all -> 0x0793 }
            r29 = r5
            r5 = 2
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x078d, all -> 0x0793 }
            r17 = 0
            r0[r17] = r3     // Catch:{ SQLiteException -> 0x078d, all -> 0x0793 }
            r17 = 1
            r0[r17] = r14     // Catch:{ SQLiteException -> 0x078d, all -> 0x0793 }
            java.lang.String r17 = "event_filters"
            java.lang.String r19 = "app_id=? AND event_name=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r5 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x078d, all -> 0x0793 }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0787 }
            if (r0 == 0) goto L_0x077c
        L_0x0719:
            r28 = r11
            r11 = 1
            byte[] r0 = r5.getBlob(r11)     // Catch:{ SQLiteException -> 0x0778 }
            com.google.android.gms.internal.measurement.zzei r11 = com.google.android.gms.internal.measurement.zzej.zzc()     // Catch:{ IOException -> 0x0754 }
            com.google.android.gms.internal.measurement.zzlk r0 = com.google.android.gms.measurement.internal.zzlb.zzl(r11, r0)     // Catch:{ IOException -> 0x0754 }
            com.google.android.gms.internal.measurement.zzei r0 = (com.google.android.gms.internal.measurement.zzei) r0     // Catch:{ IOException -> 0x0754 }
            com.google.android.gms.internal.measurement.zzke r0 = r0.zzaE()     // Catch:{ IOException -> 0x0754 }
            com.google.android.gms.internal.measurement.zzej r0 = (com.google.android.gms.internal.measurement.zzej) r0     // Catch:{ IOException -> 0x0754 }
            r11 = 0
            int r16 = r5.getInt(r11)     // Catch:{ SQLiteException -> 0x0778 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x0778 }
            java.lang.Object r16 = r2.get(r11)     // Catch:{ SQLiteException -> 0x0778 }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x0778 }
            if (r16 != 0) goto L_0x074c
            r22 = r7
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0785 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x0785 }
            r2.put(r11, r7)     // Catch:{ SQLiteException -> 0x0785 }
            goto L_0x0750
        L_0x074c:
            r22 = r7
            r7 = r16
        L_0x0750:
            r7.add(r0)     // Catch:{ SQLiteException -> 0x0785 }
            goto L_0x0768
        L_0x0754:
            r0 = move-exception
            r22 = r7
            com.google.android.gms.measurement.internal.zzfy r7 = r15.zzs     // Catch:{ SQLiteException -> 0x0785 }
            com.google.android.gms.measurement.internal.zzeo r7 = r7.zzay()     // Catch:{ SQLiteException -> 0x0785 }
            com.google.android.gms.measurement.internal.zzem r7 = r7.zzd()     // Catch:{ SQLiteException -> 0x0785 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzeo.zzn(r3)     // Catch:{ SQLiteException -> 0x0785 }
            r7.zzc(r13, r11, r0)     // Catch:{ SQLiteException -> 0x0785 }
        L_0x0768:
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0785 }
            if (r0 != 0) goto L_0x0773
            r5.close()
            r0 = r2
            goto L_0x07b5
        L_0x0773:
            r7 = r22
            r11 = r28
            goto L_0x0719
        L_0x0778:
            r0 = move-exception
            r22 = r7
            goto L_0x079b
        L_0x077c:
            r22 = r7
            r28 = r11
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0785 }
            goto L_0x07b2
        L_0x0785:
            r0 = move-exception
            goto L_0x079b
        L_0x0787:
            r0 = move-exception
            r22 = r7
            r28 = r11
            goto L_0x079b
        L_0x078d:
            r0 = move-exception
        L_0x078e:
            r22 = r7
            r28 = r11
            goto L_0x079a
        L_0x0793:
            r0 = move-exception
            r5 = 0
            goto L_0x07ba
        L_0x0796:
            r0 = move-exception
            r29 = r5
            goto L_0x078e
        L_0x079a:
            r5 = 0
        L_0x079b:
            com.google.android.gms.measurement.internal.zzfy r2 = r15.zzs     // Catch:{ all -> 0x07b9 }
            com.google.android.gms.measurement.internal.zzeo r2 = r2.zzay()     // Catch:{ all -> 0x07b9 }
            com.google.android.gms.measurement.internal.zzem r2 = r2.zzd()     // Catch:{ all -> 0x07b9 }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeo.zzn(r3)     // Catch:{ all -> 0x07b9 }
            r2.zzc(r12, r3, r0)     // Catch:{ all -> 0x07b9 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x07b9 }
            if (r5 == 0) goto L_0x07b5
        L_0x07b2:
            r5.close()
        L_0x07b5:
            r4.put(r14, r0)
            goto L_0x07c8
        L_0x07b9:
            r0 = move-exception
        L_0x07ba:
            if (r5 == 0) goto L_0x07bf
            r5.close()
        L_0x07bf:
            throw r0
        L_0x07c0:
            r65 = r2
            r66 = r5
            r22 = r7
            r24 = r11
        L_0x07c8:
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x07d0:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0856
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.util.Set r5 = r10.zzb
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r5 = r5.contains(r7)
            if (r5 == 0) goto L_0x07fa
            com.google.android.gms.measurement.internal.zzfy r3 = r10.zzs
            com.google.android.gms.measurement.internal.zzeo r3 = r3.zzay()
            com.google.android.gms.measurement.internal.zzem r3 = r3.zzj()
            r3.zzb(r1, r7)
            goto L_0x07d0
        L_0x07fa:
            java.lang.Object r5 = r0.get(r7)
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
            r7 = 1
        L_0x0805:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x0849
            java.lang.Object r7 = r5.next()
            com.google.android.gms.internal.measurement.zzej r7 = (com.google.android.gms.internal.measurement.zzej) r7
            com.google.android.gms.measurement.internal.zzx r11 = new com.google.android.gms.measurement.internal.zzx
            java.lang.String r14 = r10.zza
            r11.<init>(r10, r14, r3, r7)
            java.lang.Long r15 = r10.zzd
            java.lang.Long r14 = r10.zze
            int r7 = r7.zzb()
            boolean r21 = r10.zzf(r3, r7)
            r7 = r14
            r14 = r11
            r16 = r7
            r17 = r6
            r18 = r8
            r20 = r22
            boolean r7 = r14.zzd(r15, r16, r17, r18, r20, r21)
            if (r7 == 0) goto L_0x0840
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            com.google.android.gms.measurement.internal.zzu r14 = r10.zzd(r14)
            r14.zzc(r11)
            goto L_0x0805
        L_0x0840:
            java.util.Set r5 = r10.zzb
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            r5.add(r11)
        L_0x0849:
            if (r7 != 0) goto L_0x07d0
            java.util.Set r5 = r10.zzb
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.add(r3)
            goto L_0x07d0
        L_0x0856:
            r2 = r65
            r5 = r66
            r11 = r24
            r3 = 0
            goto L_0x0616
        L_0x085f:
            boolean r0 = r67.isEmpty()
            if (r0 == 0) goto L_0x0869
        L_0x0865:
            r11 = r28
            goto L_0x0a98
        L_0x0869:
            s0.b r2 = new s0.b
            r2.<init>()
            java.util.Iterator r3 = r67.iterator()
        L_0x0872:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0865
            java.lang.Object r0 = r3.next()
            r4 = r0
            com.google.android.gms.internal.measurement.zzgl r4 = (com.google.android.gms.internal.measurement.zzgl) r4
            java.lang.String r5 = r4.zzf()
            java.lang.Object r0 = r2.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x0964
            com.google.android.gms.measurement.internal.zzkz r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzam r6 = r0.zzi()
            java.lang.String r7 = r10.zza
            r6.zzW()
            r6.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)
            s0.b r8 = new s0.b
            r8.<init>()
            android.database.sqlite.SQLiteDatabase r13 = r6.zzh()
            r11 = r28
            r9 = r29
            java.lang.String[] r15 = new java.lang.String[]{r11, r9}     // Catch:{ SQLiteException -> 0x093a, all -> 0x0937 }
            r14 = 2
            java.lang.String[] r0 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x093a, all -> 0x0937 }
            r14 = 0
            r0[r14] = r7     // Catch:{ SQLiteException -> 0x093a, all -> 0x0937 }
            r14 = 1
            r0[r14] = r5     // Catch:{ SQLiteException -> 0x093a, all -> 0x0937 }
            java.lang.String r14 = "property_filters"
            java.lang.String r16 = "app_id=? AND property_name=?"
            r18 = 0
            r19 = 0
            r20 = 0
            r17 = r0
            android.database.Cursor r13 = r13.query(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x093a, all -> 0x0937 }
            boolean r0 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x0933 }
            if (r0 == 0) goto L_0x092a
        L_0x08cf:
            r14 = 1
            byte[] r0 = r13.getBlob(r14)     // Catch:{ SQLiteException -> 0x0933 }
            com.google.android.gms.internal.measurement.zzer r15 = com.google.android.gms.internal.measurement.zzes.zzc()     // Catch:{ IOException -> 0x0906 }
            com.google.android.gms.internal.measurement.zzlk r0 = com.google.android.gms.measurement.internal.zzlb.zzl(r15, r0)     // Catch:{ IOException -> 0x0906 }
            com.google.android.gms.internal.measurement.zzer r0 = (com.google.android.gms.internal.measurement.zzer) r0     // Catch:{ IOException -> 0x0906 }
            com.google.android.gms.internal.measurement.zzke r0 = r0.zzaE()     // Catch:{ IOException -> 0x0906 }
            com.google.android.gms.internal.measurement.zzes r0 = (com.google.android.gms.internal.measurement.zzes) r0     // Catch:{ IOException -> 0x0906 }
            r15 = 0
            int r16 = r13.getInt(r15)     // Catch:{ SQLiteException -> 0x0933 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x0933 }
            java.lang.Object r16 = r8.get(r14)     // Catch:{ SQLiteException -> 0x0933 }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x0933 }
            if (r16 != 0) goto L_0x08fe
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0933 }
            r15.<init>()     // Catch:{ SQLiteException -> 0x0933 }
            r8.put(r14, r15)     // Catch:{ SQLiteException -> 0x0933 }
            goto L_0x0900
        L_0x08fe:
            r15 = r16
        L_0x0900:
            r15.add(r0)     // Catch:{ SQLiteException -> 0x0933 }
            r65 = r3
            goto L_0x091c
        L_0x0906:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfy r14 = r6.zzs     // Catch:{ SQLiteException -> 0x0933 }
            com.google.android.gms.measurement.internal.zzeo r14 = r14.zzay()     // Catch:{ SQLiteException -> 0x0933 }
            com.google.android.gms.measurement.internal.zzem r14 = r14.zzd()     // Catch:{ SQLiteException -> 0x0933 }
            java.lang.String r15 = "Failed to merge filter"
            r65 = r3
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeo.zzn(r7)     // Catch:{ SQLiteException -> 0x0931 }
            r14.zzc(r15, r3, r0)     // Catch:{ SQLiteException -> 0x0931 }
        L_0x091c:
            boolean r0 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x0931 }
            if (r0 != 0) goto L_0x0927
            r13.close()
            r0 = r8
            goto L_0x0958
        L_0x0927:
            r3 = r65
            goto L_0x08cf
        L_0x092a:
            r65 = r3
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0931 }
            goto L_0x0955
        L_0x0931:
            r0 = move-exception
            goto L_0x093e
        L_0x0933:
            r0 = move-exception
            r65 = r3
            goto L_0x093e
        L_0x0937:
            r0 = move-exception
            r5 = 0
            goto L_0x095e
        L_0x093a:
            r0 = move-exception
            r65 = r3
            r13 = 0
        L_0x093e:
            com.google.android.gms.measurement.internal.zzfy r3 = r6.zzs     // Catch:{ all -> 0x095c }
            com.google.android.gms.measurement.internal.zzeo r3 = r3.zzay()     // Catch:{ all -> 0x095c }
            com.google.android.gms.measurement.internal.zzem r3 = r3.zzd()     // Catch:{ all -> 0x095c }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzeo.zzn(r7)     // Catch:{ all -> 0x095c }
            r3.zzc(r12, r6, r0)     // Catch:{ all -> 0x095c }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x095c }
            if (r13 == 0) goto L_0x0958
        L_0x0955:
            r13.close()
        L_0x0958:
            r2.put(r5, r0)
            goto L_0x096a
        L_0x095c:
            r0 = move-exception
            r5 = r13
        L_0x095e:
            if (r5 == 0) goto L_0x0963
            r5.close()
        L_0x0963:
            throw r0
        L_0x0964:
            r65 = r3
            r11 = r28
            r9 = r29
        L_0x096a:
            java.util.Set r3 = r0.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0972:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0a90
            java.lang.Object r5 = r3.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.util.Set r6 = r10.zzb
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L_0x099d
            com.google.android.gms.measurement.internal.zzfy r0 = r10.zzs
            com.google.android.gms.measurement.internal.zzeo r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzj()
            r0.zzb(r1, r7)
            goto L_0x0a90
        L_0x099d:
            java.lang.Object r6 = r0.get(r7)
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = 1
        L_0x09a8:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0a7f
            java.lang.Object r7 = r6.next()
            com.google.android.gms.internal.measurement.zzes r7 = (com.google.android.gms.internal.measurement.zzes) r7
            com.google.android.gms.measurement.internal.zzfy r8 = r10.zzs
            com.google.android.gms.measurement.internal.zzeo r8 = r8.zzay()
            java.lang.String r8 = r8.zzq()
            r13 = 2
            boolean r8 = android.util.Log.isLoggable(r8, r13)
            if (r8 == 0) goto L_0x0a12
            com.google.android.gms.measurement.internal.zzfy r8 = r10.zzs
            com.google.android.gms.measurement.internal.zzeo r8 = r8.zzay()
            com.google.android.gms.measurement.internal.zzem r8 = r8.zzj()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            boolean r15 = r7.zzj()
            if (r15 == 0) goto L_0x09e2
            int r15 = r7.zza()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            goto L_0x09e3
        L_0x09e2:
            r15 = 0
        L_0x09e3:
            com.google.android.gms.measurement.internal.zzfy r13 = r10.zzs
            com.google.android.gms.measurement.internal.zzej r13 = r13.zzj()
            r66 = r0
            java.lang.String r0 = r7.zze()
            java.lang.String r0 = r13.zzf(r0)
            java.lang.String r13 = "Evaluating filter. audience, filter, property"
            r8.zzd(r13, r14, r15, r0)
            com.google.android.gms.measurement.internal.zzfy r0 = r10.zzs
            com.google.android.gms.measurement.internal.zzeo r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzj()
            com.google.android.gms.measurement.internal.zzkz r8 = r10.zzf
            com.google.android.gms.measurement.internal.zzlb r8 = r8.zzu()
            java.lang.String r8 = r8.zzp(r7)
            java.lang.String r13 = "Filter definition"
            r0.zzb(r13, r8)
            goto L_0x0a14
        L_0x0a12:
            r66 = r0
        L_0x0a14:
            boolean r0 = r7.zzj()
            if (r0 == 0) goto L_0x0a55
            int r0 = r7.zza()
            r8 = 256(0x100, float:3.59E-43)
            if (r0 <= r8) goto L_0x0a23
            goto L_0x0a55
        L_0x0a23:
            com.google.android.gms.measurement.internal.zzz r0 = new com.google.android.gms.measurement.internal.zzz
            java.lang.String r8 = r10.zza
            r0.<init>(r10, r8, r5, r7)
            java.lang.Long r8 = r10.zzd
            java.lang.Long r13 = r10.zze
            int r7 = r7.zza()
            boolean r7 = r10.zzf(r5, r7)
            boolean r7 = r0.zzd(r8, r13, r4, r7)
            if (r7 == 0) goto L_0x0a4b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            com.google.android.gms.measurement.internal.zzu r8 = r10.zzd(r8)
            r8.zzc(r0)
            r0 = r66
            goto L_0x09a8
        L_0x0a4b:
            java.util.Set r0 = r10.zzb
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r0.add(r6)
            goto L_0x0a81
        L_0x0a55:
            com.google.android.gms.measurement.internal.zzfy r0 = r10.zzs
            com.google.android.gms.measurement.internal.zzeo r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzk()
            java.lang.String r6 = r10.zza
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzeo.zzn(r6)
            boolean r8 = r7.zzj()
            if (r8 == 0) goto L_0x0a74
            int r7 = r7.zza()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0a75
        L_0x0a74:
            r7 = 0
        L_0x0a75:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "Invalid property filter ID. appId, id"
            r0.zzc(r8, r6, r7)
            goto L_0x0a83
        L_0x0a7f:
            r66 = r0
        L_0x0a81:
            if (r7 != 0) goto L_0x0a8c
        L_0x0a83:
            java.util.Set r0 = r10.zzb
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
        L_0x0a8c:
            r0 = r66
            goto L_0x0972
        L_0x0a90:
            r3 = r65
            r29 = r9
            r28 = r11
            goto L_0x0872
        L_0x0a98:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map r0 = r10.zzc
            java.util.Set r0 = r0.keySet()
            java.util.Set r2 = r10.zzb
            r0.removeAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x0aac:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0b41
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map r3 = r10.zzc
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            com.google.android.gms.measurement.internal.zzu r3 = (com.google.android.gms.measurement.internal.zzu) r3
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.internal.measurement.zzfo r0 = r3.zza(r0)
            r1.add(r0)
            com.google.android.gms.measurement.internal.zzkz r3 = r10.zzf
            com.google.android.gms.measurement.internal.zzam r3 = r3.zzi()
            java.lang.String r5 = r10.zza
            com.google.android.gms.internal.measurement.zzgh r0 = r0.zzd()
            r3.zzW()
            r3.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            byte[] r0 = r0.zzbv()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "app_id"
            r6.put(r7, r5)
            r6.put(r11, r4)
            r4 = r24
            r6.put(r4, r0)
            android.database.sqlite.SQLiteDatabase r0 = r3.zzh()     // Catch:{ SQLiteException -> 0x0b28 }
            java.lang.String r7 = "audience_filter_values"
            r8 = 5
            r9 = 0
            long r6 = r0.insertWithOnConflict(r7, r9, r6, r8)     // Catch:{ SQLiteException -> 0x0b26 }
            r12 = -1
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0b3d
            com.google.android.gms.measurement.internal.zzfy r0 = r3.zzs     // Catch:{ SQLiteException -> 0x0b26 }
            com.google.android.gms.measurement.internal.zzeo r0 = r0.zzay()     // Catch:{ SQLiteException -> 0x0b26 }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzd()     // Catch:{ SQLiteException -> 0x0b26 }
            java.lang.String r6 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzeo.zzn(r5)     // Catch:{ SQLiteException -> 0x0b26 }
            r0.zzb(r6, r7)     // Catch:{ SQLiteException -> 0x0b26 }
            goto L_0x0b3d
        L_0x0b26:
            r0 = move-exception
            goto L_0x0b2a
        L_0x0b28:
            r0 = move-exception
            r9 = 0
        L_0x0b2a:
            com.google.android.gms.measurement.internal.zzfy r3 = r3.zzs
            com.google.android.gms.measurement.internal.zzeo r3 = r3.zzay()
            com.google.android.gms.measurement.internal.zzem r3 = r3.zzd()
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeo.zzn(r5)
            java.lang.String r6 = "Error storing filter results. appId"
            r3.zzc(r6, r5, r0)
        L_0x0b3d:
            r24 = r4
            goto L_0x0aac
        L_0x0b41:
            return r1
        L_0x0b42:
            r0 = move-exception
            r5 = r4
        L_0x0b44:
            if (r5 == 0) goto L_0x0b49
            r5.close()
        L_0x0b49:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaa.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    public final boolean zzb() {
        return false;
    }
}
