package p555ie;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.nio.charset.Charset;

/* renamed from: ie.g */
public final class C17587g implements C17578a {

    /* renamed from: d */
    public static final Charset f45225d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final File f45226a;

    /* renamed from: b */
    public final int f45227b = SQLiteDatabase.OPEN_FULLMUTEX;

    /* renamed from: c */
    public C17584f f45228c;

    /* renamed from: ie.g$a */
    public static class C17588a {

        /* renamed from: a */
        public final byte[] f45229a;

        /* renamed from: b */
        public final int f45230b;

        public C17588a(byte[] bArr, int i) {
            this.f45229a = bArr;
            this.f45230b = i;
        }
    }

    public C17587g(File file) {
        this.f45226a = file;
    }

    /* renamed from: a */
    public final void mo50030a() {
        CommonUtils.m35963a(this.f45228c);
        this.f45228c = null;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo50031b() {
        /*
            r10 = this;
            java.io.File r0 = r10.f45226a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x000b
            goto L_0x0022
        L_0x000b:
            ie.f r0 = r10.f45228c
            if (r0 != 0) goto L_0x001e
            ie.f r0 = new ie.f     // Catch:{ IOException -> 0x0019 }
            java.io.File r3 = r10.f45226a     // Catch:{ IOException -> 0x0019 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0019 }
            r10.f45228c = r0     // Catch:{ IOException -> 0x0019 }
            goto L_0x001e
        L_0x0019:
            java.io.File r0 = r10.f45226a
            java.util.Objects.toString(r0)
        L_0x001e:
            ie.f r0 = r10.f45228c
            if (r0 != 0) goto L_0x0024
        L_0x0022:
            r4 = r1
            goto L_0x0072
        L_0x0024:
            r3 = 1
            int[] r3 = new int[r3]
            r3[r2] = r2
            int r0 = r0.mo50046v()
            byte[] r0 = new byte[r0]
            ie.f r4 = r10.f45228c     // Catch:{ IOException -> 0x006b }
            monitor-enter(r4)     // Catch:{ IOException -> 0x006b }
            ie.f$a r5 = r4.f45216e     // Catch:{ all -> 0x0068 }
            int r5 = r5.f45220a     // Catch:{ all -> 0x0068 }
            r6 = 0
        L_0x0037:
            int r7 = r4.f45215d     // Catch:{ all -> 0x0068 }
            if (r6 >= r7) goto L_0x0066
            ie.f$a r5 = r4.mo50041j(r5)     // Catch:{ all -> 0x0068 }
            ie.f$b r7 = new ie.f$b     // Catch:{ all -> 0x0068 }
            r7.<init>(r5)     // Catch:{ all -> 0x0068 }
            int r8 = r5.f45221b     // Catch:{ all -> 0x0068 }
            r9 = r3[r2]     // Catch:{ all -> 0x0061 }
            r7.read(r0, r9, r8)     // Catch:{ all -> 0x0061 }
            r9 = r3[r2]     // Catch:{ all -> 0x0061 }
            int r9 = r9 + r8
            r3[r2] = r9     // Catch:{ all -> 0x0061 }
            r7.close()     // Catch:{ all -> 0x0068 }
            int r7 = r5.f45220a     // Catch:{ all -> 0x0068 }
            int r7 = r7 + 4
            int r5 = r5.f45221b     // Catch:{ all -> 0x0068 }
            int r7 = r7 + r5
            int r5 = r4.mo50047w(r7)     // Catch:{ all -> 0x0068 }
            int r6 = r6 + 1
            goto L_0x0037
        L_0x0061:
            r5 = move-exception
            r7.close()     // Catch:{ all -> 0x0068 }
            throw r5     // Catch:{ all -> 0x0068 }
        L_0x0066:
            monitor-exit(r4)     // Catch:{ IOException -> 0x006b }
            goto L_0x006b
        L_0x0068:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ IOException -> 0x006b }
            throw r5     // Catch:{ IOException -> 0x006b }
        L_0x006b:
            ie.g$a r4 = new ie.g$a
            r3 = r3[r2]
            r4.<init>(r0, r3)
        L_0x0072:
            if (r4 != 0) goto L_0x0076
            r3 = r1
            goto L_0x007f
        L_0x0076:
            int r0 = r4.f45230b
            byte[] r3 = new byte[r0]
            byte[] r4 = r4.f45229a
            java.lang.System.arraycopy(r4, r2, r3, r2, r0)
        L_0x007f:
            if (r3 == 0) goto L_0x0088
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r0 = f45225d
            r1.<init>(r3, r0)
        L_0x0088:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p555ie.C17587g.mo50031b():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50032c(long r5, java.lang.String r7) {
        /*
            r4 = this;
            ie.f r0 = r4.f45228c
            if (r0 != 0) goto L_0x0013
            ie.f r0 = new ie.f     // Catch:{ IOException -> 0x000e }
            java.io.File r1 = r4.f45226a     // Catch:{ IOException -> 0x000e }
            r0.<init>(r1)     // Catch:{ IOException -> 0x000e }
            r4.f45228c = r0     // Catch:{ IOException -> 0x000e }
            goto L_0x0013
        L_0x000e:
            java.io.File r0 = r4.f45226a
            java.util.Objects.toString(r0)
        L_0x0013:
            java.lang.String r0 = " "
            ie.f r1 = r4.f45228c
            if (r1 != 0) goto L_0x001b
            goto L_0x008f
        L_0x001b:
            if (r7 != 0) goto L_0x001f
            java.lang.String r7 = "null"
        L_0x001f:
            int r1 = r4.f45227b     // Catch:{ IOException -> 0x008f }
            int r1 = r1 / 4
            int r2 = r7.length()     // Catch:{ IOException -> 0x008f }
            if (r2 <= r1) goto L_0x0043
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008f }
            r2.<init>()     // Catch:{ IOException -> 0x008f }
            java.lang.String r3 = "..."
            r2.append(r3)     // Catch:{ IOException -> 0x008f }
            int r3 = r7.length()     // Catch:{ IOException -> 0x008f }
            int r3 = r3 - r1
            java.lang.String r7 = r7.substring(r3)     // Catch:{ IOException -> 0x008f }
            r2.append(r7)     // Catch:{ IOException -> 0x008f }
            java.lang.String r7 = r2.toString()     // Catch:{ IOException -> 0x008f }
        L_0x0043:
            java.lang.String r1 = "\r"
            java.lang.String r7 = r7.replaceAll(r1, r0)     // Catch:{ IOException -> 0x008f }
            java.lang.String r1 = "\n"
            java.lang.String r7 = r7.replaceAll(r1, r0)     // Catch:{ IOException -> 0x008f }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IOException -> 0x008f }
            java.lang.String r1 = "%d %s%n"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x008f }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ IOException -> 0x008f }
            r6 = 0
            r2[r6] = r5     // Catch:{ IOException -> 0x008f }
            r5 = 1
            r2[r5] = r7     // Catch:{ IOException -> 0x008f }
            java.lang.String r7 = java.lang.String.format(r0, r1, r2)     // Catch:{ IOException -> 0x008f }
            java.nio.charset.Charset r0 = f45225d     // Catch:{ IOException -> 0x008f }
            byte[] r7 = r7.getBytes(r0)     // Catch:{ IOException -> 0x008f }
            ie.f r0 = r4.f45228c     // Catch:{ IOException -> 0x008f }
            r0.mo50039e(r7)     // Catch:{ IOException -> 0x008f }
        L_0x006f:
            ie.f r7 = r4.f45228c     // Catch:{ IOException -> 0x008f }
            monitor-enter(r7)     // Catch:{ IOException -> 0x008f }
            int r0 = r7.f45215d     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x0078
            r0 = 1
            goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            monitor-exit(r7)     // Catch:{ IOException -> 0x008f }
            if (r0 != 0) goto L_0x008f
            ie.f r7 = r4.f45228c     // Catch:{ IOException -> 0x008f }
            int r7 = r7.mo50046v()     // Catch:{ IOException -> 0x008f }
            int r0 = r4.f45227b     // Catch:{ IOException -> 0x008f }
            if (r7 <= r0) goto L_0x008f
            ie.f r7 = r4.f45228c     // Catch:{ IOException -> 0x008f }
            r7.mo50042q()     // Catch:{ IOException -> 0x008f }
            goto L_0x006f
        L_0x008c:
            r5 = move-exception
            monitor-exit(r7)     // Catch:{ IOException -> 0x008f }
            throw r5     // Catch:{ IOException -> 0x008f }
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p555ie.C17587g.mo50032c(long, java.lang.String):void");
    }
}
