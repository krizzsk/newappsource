package com.umo.ads.p347l;

import android.content.Context;
import android.content.IntentFilter;

/* renamed from: com.umo.ads.l.zza */
public final class zza extends zzc {

    /* renamed from: b */
    public final C12090a f30819b;

    /* renamed from: com.umo.ads.l.zza$a */
    public interface C12090a {
    }

    public zza(Context context, C12090a aVar) {
        super(context, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        this.f30819b = aVar;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Long, fc0.a>] */
    /* JADX WARNING: type inference failed for: r2v7, types: [bf0.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r7, android.content.Intent r8) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            mf0.C24362h.m61211f(r7, r0)
            java.lang.String r7 = "intent"
            mf0.C24362h.m61211f(r8, r7)
            java.lang.String r7 = "extra_download_id"
            r0 = -1
            long r7 = r8.getLongExtra(r7, r0)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0017
            return
        L_0x0017:
            com.umo.ads.l.zza$a r0 = r6.f30819b
            if (r0 != 0) goto L_0x001d
            goto L_0x00f7
        L_0x001d:
            kc0.i r0 = (kc0.C12844i) r0
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a
            java.lang.String r2 = "On MRAID Download Complete"
            java.lang.StringBuilder r2 = ce0.C21100e.m49315J0(r2)
            java.lang.String r3 = r0.f31743H
            r2.append(r3)
            java.lang.String r3 = " Download Id: "
            r2.append(r3)
            r2.append(r7)
            r3 = 46
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.mo6672i(r2)
            android.app.DownloadManager r1 = r0.f31737B
            r2 = 0
            if (r1 != 0) goto L_0x0047
            r1 = r2
            goto L_0x005a
        L_0x0047:
            android.app.DownloadManager$Query r3 = new android.app.DownloadManager$Query
            r3.<init>()
            r4 = 1
            long[] r4 = new long[r4]
            r5 = 0
            r4[r5] = r7
            android.app.DownloadManager$Query r3 = r3.setFilterById(r4)
            android.database.Cursor r1 = r1.query(r3)
        L_0x005a:
            if (r1 != 0) goto L_0x005e
            goto L_0x00e6
        L_0x005e:
            java.util.Map<java.lang.Long, fc0.a> r3 = r0.f31738C
            if (r3 != 0) goto L_0x0063
            goto L_0x006d
        L_0x0063:
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            java.lang.Object r3 = r3.remove(r4)
            fc0.a r3 = (fc0.C12669a) r3
        L_0x006d:
            java.util.Map<java.lang.Long, fc0.a> r3 = r0.f31738C
            if (r3 != 0) goto L_0x0072
            goto L_0x007c
        L_0x0072:
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.Object r2 = r3.get(r2)
            fc0.a r2 = (fc0.C12669a) r2
        L_0x007c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Error saving MRAID Image to device's Storage (Download Id: "
            r3.append(r4)
            r3.append(r7)
            r4 = 41
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            boolean r5 = r1.moveToFirst()
            if (r5 == 0) goto L_0x00e1
            java.lang.String r5 = "status"
            int r5 = r1.getColumnIndex(r5)
            int r1 = r1.getInt(r5)
            r5 = 8
            if (r1 == r5) goto L_0x00b2
            r4 = 16
            if (r1 == r4) goto L_0x00ae
            r0.mo39690i(r2, r3)
            goto L_0x00e4
        L_0x00ae:
            r0.mo39690i(r2, r3)
            goto L_0x00e4
        L_0x00b2:
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r3 = wb0.C13233c.m33333b()
            int r5 = p026b7.C1502g.umoak_mraid_store_picture_success
            java.lang.String r3 = r3.getString(r5)
            r2.append(r3)
            java.lang.String r3 = r0.f31743H
            r2.append(r3)
            java.lang.String r3 = " (Download Id: "
            r2.append(r3)
            r2.append(r7)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.mo6672i(r2)
            r0.mo39707x()
            goto L_0x00e4
        L_0x00e1:
            r0.mo39690i(r2, r3)
        L_0x00e4:
            bf0.d r2 = bf0.C21050d.f52856a
        L_0x00e6:
            if (r2 != 0) goto L_0x00f7
            java.util.Map<java.lang.Long, fc0.a> r0 = r0.f31738C
            if (r0 != 0) goto L_0x00ed
            goto L_0x00f7
        L_0x00ed:
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.Object r7 = r0.remove(r7)
            fc0.a r7 = (fc0.C12669a) r7
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umo.ads.p347l.zza.onReceive(android.content.Context, android.content.Intent):void");
    }
}
