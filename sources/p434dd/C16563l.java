package p434dd;

import java.util.List;
import p037c5.C1790k;

/* renamed from: dd.l */
public final class C16563l implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ List f43218b;

    /* renamed from: c */
    public final /* synthetic */ C1790k f43219c;

    /* renamed from: d */
    public final /* synthetic */ C16565m f43220d;

    public C16563l(C16565m mVar, List list, C1790k kVar) {
        this.f43220d = mVar;
        this.f43218b = list;
        this.f43219c = kVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0155 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x015a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x01db */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r1 = r20
            dd.m r2 = r1.f43220d     // Catch:{ Exception -> 0x0226 }
            dd.o r2 = r2.f43224c     // Catch:{ Exception -> 0x0226 }
            java.util.List r3 = r1.f43218b     // Catch:{ Exception -> 0x0226 }
            r2.getClass()     // Catch:{ Exception -> 0x0226 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x0226 }
        L_0x000f:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x0226 }
            java.lang.String r5 = "split_id"
            java.lang.String r6 = ".apk"
            java.lang.String r7 = "verified-splits"
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L_0x004c
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x0226 }
            android.content.Intent r4 = (android.content.Intent) r4     // Catch:{ Exception -> 0x0226 }
            java.lang.String r4 = r4.getStringExtra(r5)     // Catch:{ Exception -> 0x0226 }
            gd.e r10 = r2.f43228a     // Catch:{ Exception -> 0x0226 }
            r10.getClass()     // Catch:{ Exception -> 0x0226 }
            java.io.File r11 = new java.io.File     // Catch:{ Exception -> 0x0226 }
            java.io.File r10 = r10.mo49764g()     // Catch:{ Exception -> 0x0226 }
            r11.<init>(r10, r7)     // Catch:{ Exception -> 0x0226 }
            p506gd.C17174e.m43161e(r11)     // Catch:{ Exception -> 0x0226 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0226 }
            java.lang.String r4 = r4.concat(r6)     // Catch:{ Exception -> 0x0226 }
            java.io.File r4 = p506gd.C17174e.m43160d(r11, r4)     // Catch:{ Exception -> 0x0226 }
            boolean r4 = r4.exists()     // Catch:{ Exception -> 0x0226 }
            if (r4 != 0) goto L_0x000f
            r2 = 0
            goto L_0x004d
        L_0x004c:
            r2 = 1
        L_0x004d:
            if (r2 == 0) goto L_0x0080
            dd.m r0 = r1.f43220d
            c5.k r2 = r1.f43219c
            r3 = -12
            android.content.Context r0 = r0.f43222a     // Catch:{ Exception -> 0x007c }
            android.content.Context r4 = r0.getApplicationContext()     // Catch:{ Exception -> 0x007c }
            if (r4 == 0) goto L_0x005e
            r0 = r4
        L_0x005e:
            boolean r0 = p506gd.C17170a.m43154c(r0, r8)     // Catch:{ Exception -> 0x007c }
            if (r0 != 0) goto L_0x0068
            r2.mo6605a(r3)
            goto L_0x007f
        L_0x0068:
            java.lang.Object r0 = r2.f6261d
            hd.k r0 = (p530hd.C17386k) r0
            java.lang.Object r2 = r2.f6258a
            hd.a r2 = (p530hd.C17376a) r2
            r3 = 5
            android.os.Handler r4 = r0.f44781g
            hd.j r5 = new hd.j
            r5.<init>(r0, r2, r3, r9)
            r4.post(r5)
            goto L_0x007f
        L_0x007c:
            r2.mo6605a(r3)
        L_0x007f:
            return
        L_0x0080:
            dd.m r2 = r1.f43220d
            java.util.List r3 = r1.f43218b
            c5.k r4 = r1.f43219c
            r2.getClass()
            java.io.RandomAccessFile r11 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x01e2 }
            gd.e r12 = r2.f43223b     // Catch:{ Exception -> 0x01e2 }
            r12.getClass()     // Catch:{ Exception -> 0x01e2 }
            java.io.File r13 = new java.io.File     // Catch:{ Exception -> 0x01e2 }
            java.io.File r12 = r12.mo49764g()     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r14 = "lock.tmp"
            r13.<init>(r12, r14)     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r12 = "rw"
            r11.<init>(r13, r12)     // Catch:{ Exception -> 0x01e2 }
            java.nio.channels.FileChannel r11 = r11.getChannel()     // Catch:{ Exception -> 0x01e2 }
            r12 = 0
            java.nio.channels.FileLock r13 = r11.tryLock()     // Catch:{ OverlappingFileLockException -> 0x00aa }
            goto L_0x00ac
        L_0x00aa:
            r13 = r12
        L_0x00ac:
            if (r13 == 0) goto L_0x01dc
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x01cc }
        L_0x00b2:
            boolean r12 = r3.hasNext()     // Catch:{ Exception -> 0x01cc }
            java.lang.String r14 = "unverified-splits"
            if (r12 == 0) goto L_0x015e
            java.lang.Object r12 = r3.next()     // Catch:{ Exception -> 0x01cc }
            android.content.Intent r12 = (android.content.Intent) r12     // Catch:{ Exception -> 0x01cc }
            java.lang.String r15 = r12.getStringExtra(r5)     // Catch:{ Exception -> 0x01cc }
            android.content.Context r0 = r2.f43222a     // Catch:{ Exception -> 0x01cc }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ Exception -> 0x01cc }
            android.net.Uri r12 = r12.getData()     // Catch:{ Exception -> 0x01cc }
            java.lang.String r10 = "r"
            android.content.res.AssetFileDescriptor r0 = r0.openAssetFileDescriptor(r12, r10)     // Catch:{ Exception -> 0x01cc }
            gd.e r10 = r2.f43223b     // Catch:{ Exception -> 0x01cc }
            r10.getClass()     // Catch:{ Exception -> 0x01cc }
            java.io.File r12 = new java.io.File     // Catch:{ Exception -> 0x01cc }
            java.io.File r10 = r10.mo49764g()     // Catch:{ Exception -> 0x01cc }
            r12.<init>(r10, r14)     // Catch:{ Exception -> 0x01cc }
            p506gd.C17174e.m43161e(r12)     // Catch:{ Exception -> 0x01cc }
            java.lang.String r10 = java.lang.String.valueOf(r15)     // Catch:{ Exception -> 0x01cc }
            java.lang.String r10 = r10.concat(r6)     // Catch:{ Exception -> 0x01cc }
            java.io.File r10 = p506gd.C17174e.m43160d(r12, r10)     // Catch:{ Exception -> 0x01cc }
            boolean r12 = r10.exists()     // Catch:{ Exception -> 0x01cc }
            if (r12 == 0) goto L_0x0104
            long r16 = r10.length()     // Catch:{ Exception -> 0x01cc }
            long r18 = r0.getLength()     // Catch:{ Exception -> 0x01cc }
            int r12 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r12 == 0) goto L_0x0104
            goto L_0x010a
        L_0x0104:
            boolean r12 = r10.exists()     // Catch:{ Exception -> 0x01cc }
            if (r12 != 0) goto L_0x00b2
        L_0x010a:
            gd.e r12 = r2.f43223b     // Catch:{ Exception -> 0x01cc }
            r12.getClass()     // Catch:{ Exception -> 0x01cc }
            java.io.File r14 = new java.io.File     // Catch:{ Exception -> 0x01cc }
            java.io.File r12 = r12.mo49764g()     // Catch:{ Exception -> 0x01cc }
            r14.<init>(r12, r7)     // Catch:{ Exception -> 0x01cc }
            p506gd.C17174e.m43161e(r14)     // Catch:{ Exception -> 0x01cc }
            java.lang.String r12 = java.lang.String.valueOf(r15)     // Catch:{ Exception -> 0x01cc }
            java.lang.String r12 = r12.concat(r6)     // Catch:{ Exception -> 0x01cc }
            java.io.File r12 = p506gd.C17174e.m43160d(r14, r12)     // Catch:{ Exception -> 0x01cc }
            boolean r12 = r12.exists()     // Catch:{ Exception -> 0x01cc }
            if (r12 != 0) goto L_0x00b2
            java.io.BufferedInputStream r12 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x01cc }
            java.io.FileInputStream r0 = r0.createInputStream()     // Catch:{ Exception -> 0x01cc }
            r12.<init>(r0)     // Catch:{ Exception -> 0x01cc }
            java.io.FileOutputStream r14 = new java.io.FileOutputStream     // Catch:{ all -> 0x0156 }
            r14.<init>(r10)     // Catch:{ all -> 0x0156 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0151 }
        L_0x013f:
            int r10 = r12.read(r0)     // Catch:{ all -> 0x0151 }
            if (r10 <= 0) goto L_0x0149
            r14.write(r0, r9, r10)     // Catch:{ all -> 0x0151 }
            goto L_0x013f
        L_0x0149:
            r14.close()     // Catch:{ all -> 0x0156 }
            r12.close()     // Catch:{ Exception -> 0x01cc }
            goto L_0x00b2
        L_0x0151:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x0155 }
        L_0x0155:
            throw r0     // Catch:{ all -> 0x0156 }
        L_0x0156:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x015a }
        L_0x015a:
            throw r0     // Catch:{ Exception -> 0x01cc }
        L_0x015b:
            r0 = move-exception
            goto L_0x01d6
        L_0x015e:
            gd.e r0 = r2.f43223b     // Catch:{  }
            r0.getClass()     // Catch:{  }
            java.io.File r3 = new java.io.File     // Catch:{  }
            java.io.File r0 = r0.mo49764g()     // Catch:{  }
            r3.<init>(r0, r14)     // Catch:{  }
            p506gd.C17174e.m43161e(r3)     // Catch:{  }
            java.io.File[] r0 = r3.listFiles()     // Catch:{  }
            dd.o r3 = r2.f43224c     // Catch:{ Exception -> 0x01c9 }
            boolean r3 = r3.mo49347b(r0)     // Catch:{ Exception -> 0x01c9 }
            if (r3 == 0) goto L_0x01c9
            dd.o r3 = r2.f43224c     // Catch:{ Exception -> 0x01c9 }
            boolean r0 = r3.mo49346a(r0)     // Catch:{ Exception -> 0x01c9 }
            if (r0 == 0) goto L_0x01c9
            gd.e r0 = r2.f43223b     // Catch:{  }
            r0.getClass()     // Catch:{  }
            java.io.File r3 = new java.io.File     // Catch:{  }
            java.io.File r0 = r0.mo49764g()     // Catch:{  }
            r3.<init>(r0, r14)     // Catch:{  }
            p506gd.C17174e.m43161e(r3)     // Catch:{  }
            java.io.File[] r0 = r3.listFiles()     // Catch:{  }
            java.util.Arrays.sort(r0)     // Catch:{  }
            int r3 = r0.length     // Catch:{  }
        L_0x019c:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x01c7
            r5 = r0[r3]     // Catch:{  }
            r5.setWritable(r9, r8)     // Catch:{  }
            r5.setWritable(r9, r9)     // Catch:{  }
            r5 = r0[r3]     // Catch:{  }
            gd.e r6 = r2.f43223b     // Catch:{  }
            r6.getClass()     // Catch:{  }
            java.io.File r10 = new java.io.File     // Catch:{  }
            java.io.File r6 = r6.mo49764g()     // Catch:{  }
            r10.<init>(r6, r7)     // Catch:{  }
            p506gd.C17174e.m43161e(r10)     // Catch:{  }
            java.lang.String r6 = r5.getName()     // Catch:{  }
            java.io.File r6 = p506gd.C17174e.m43160d(r10, r6)     // Catch:{  }
            r5.renameTo(r6)     // Catch:{  }
            goto L_0x019c
        L_0x01c7:
            r0 = 0
            goto L_0x01ce
        L_0x01c9:
            r0 = -11
            goto L_0x01ce
        L_0x01cc:
            r0 = -13
        L_0x01ce:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x015b }
            r13.release()     // Catch:{ all -> 0x015b }
            goto L_0x01dc
        L_0x01d6:
            if (r11 == 0) goto L_0x01db
            r11.close()     // Catch:{ all -> 0x01db }
        L_0x01db:
            throw r0     // Catch:{ Exception -> 0x01e2 }
        L_0x01dc:
            if (r11 == 0) goto L_0x01e8
            r11.close()     // Catch:{ Exception -> 0x01e2 }
            goto L_0x01e8
        L_0x01e2:
            r2 = -13
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
        L_0x01e8:
            if (r12 != 0) goto L_0x01eb
            goto L_0x0225
        L_0x01eb:
            int r0 = r12.intValue()
            if (r0 != 0) goto L_0x021e
            java.lang.Object r0 = r4.f6259b
            android.content.Intent r0 = (android.content.Intent) r0
            java.lang.String r2 = "triggered_from_app_after_verification"
            boolean r0 = r0.getBooleanExtra(r2, r9)
            if (r0 != 0) goto L_0x0210
            java.lang.Object r0 = r4.f6259b
            android.content.Intent r0 = (android.content.Intent) r0
            r0.putExtra(r2, r8)
            java.lang.Object r0 = r4.f6260c
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r4.f6259b
            android.content.Intent r2 = (android.content.Intent) r2
            r0.sendBroadcast(r2)
            goto L_0x0225
        L_0x0210:
            java.lang.Object r0 = r4.f6261d
            hd.k r0 = (p530hd.C17386k) r0
            androidx.appcompat.app.r r0 = r0.f43762a
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.String r3 = "Splits copied and verified more than once."
            r0.mo975b(r3, r2)
            goto L_0x0225
        L_0x021e:
            int r0 = r12.intValue()
            r4.mo6605a(r0)
        L_0x0225:
            return
        L_0x0226:
            c5.k r0 = r1.f43219c
            r2 = -11
            r0.mo6605a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p434dd.C16563l.run():void");
    }
}
