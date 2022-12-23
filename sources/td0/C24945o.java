package td0;

import com.vungle.warren.persistence.C23192a;
import ee0.C23285a;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: td0.o */
public final class C24945o implements Callable<List<C23285a>> {

    /* renamed from: b */
    public final /* synthetic */ String f63045b;

    /* renamed from: c */
    public final /* synthetic */ int f63046c;

    /* renamed from: d */
    public final /* synthetic */ long f63047d;

    /* renamed from: e */
    public final /* synthetic */ C23192a f63048e;

    public C24945o(C23192a aVar, String str, int i, long j) {
        this.f63048e = aVar;
        this.f63045b = str;
        this.f63046c = i;
        this.f63047d = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        r7 = r11.f63045b;
        r10 = java.lang.Integer.toString(r11.f63046c);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() throws java.lang.Exception {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = r11.f63045b
            java.lang.String r2 = "advertiser"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = r11.f63045b
            java.lang.String r2 = "campaign"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = r11.f63045b
            java.lang.String r2 = "creative"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0025
            goto L_0x00a7
        L_0x0025:
            r1 = 3
            java.lang.String[] r4 = new java.lang.String[r1]
            r1 = 0
            java.lang.String r2 = "COUNT ( * ) as viewCount"
            r4[r1] = r2
            r2 = 1
            java.lang.String r3 = "MAX ( timestamp ) as lastTimeStamp"
            r4[r2] = r3
            r3 = 2
            java.lang.String r7 = r11.f63045b
            r4[r3] = r7
            int r3 = r11.f63046c
            java.lang.String r10 = java.lang.Integer.toString(r3)
            java.lang.String[] r6 = new java.lang.String[r2]
            long r2 = r11.f63047d
            java.lang.String r2 = java.lang.Long.toString(r2)
            r6[r1] = r2
            com.vungle.warren.persistence.a r1 = r11.f63048e
            com.vungle.warren.persistence.DatabaseHelper r1 = r1.f58874a
            android.database.sqlite.SQLiteDatabase r2 = r1.mo58264e()
            r8 = 0
            java.lang.String r3 = "vision_data"
            java.lang.String r5 = "timestamp >= ?"
            java.lang.String r9 = "_id DESC"
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x00a7
        L_0x005c:
            boolean r2 = r1.moveToNext()     // Catch:{ Exception -> 0x0093 }
            if (r2 == 0) goto L_0x008d
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ Exception -> 0x0093 }
            r2.<init>()     // Catch:{ Exception -> 0x0093 }
            android.database.DatabaseUtils.cursorRowToContentValues(r1, r2)     // Catch:{ Exception -> 0x0093 }
            ee0.a r3 = new ee0.a     // Catch:{ Exception -> 0x0093 }
            java.lang.String r4 = r11.f63045b     // Catch:{ Exception -> 0x0093 }
            java.lang.String r4 = r2.getAsString(r4)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r5 = "viewCount"
            java.lang.Integer r5 = r2.getAsInteger(r5)     // Catch:{ Exception -> 0x0093 }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0093 }
            java.lang.String r6 = "lastTimeStamp"
            java.lang.Long r2 = r2.getAsLong(r6)     // Catch:{ Exception -> 0x0093 }
            long r6 = r2.longValue()     // Catch:{ Exception -> 0x0093 }
            r3.<init>(r4, r5, r6)     // Catch:{ Exception -> 0x0093 }
            r0.add(r3)     // Catch:{ Exception -> 0x0093 }
            goto L_0x005c
        L_0x008d:
            r1.close()
            goto L_0x00a7
        L_0x0091:
            r0 = move-exception
            goto L_0x00a3
        L_0x0093:
            r0 = move-exception
            java.lang.String r2 = "getVisionAggregationInfo"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0091 }
            com.vungle.warren.VungleLogger.m57029b(r2, r0)     // Catch:{ all -> 0x0091 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0091 }
            r0.<init>()     // Catch:{ all -> 0x0091 }
            goto L_0x008d
        L_0x00a3:
            r1.close()
            throw r0
        L_0x00a7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: td0.C24945o.call():java.lang.Object");
    }
}
