package p434dd;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import p585jm.C17890d;
import p609km.C18102f;
import p956ze.C20839b;
import p988j$.util.DesugarCollections;

/* renamed from: dd.c */
public final /* synthetic */ class C16545c {

    /* renamed from: a */
    public final Object f43180a;

    /* renamed from: b */
    public final Object f43181b;

    public /* synthetic */ C16545c(Object obj, Object obj2) {
        this.f43180a = obj;
        this.f43181b = obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b A[SYNTHETIC, Splitter:B:14:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032 A[SYNTHETIC, Splitter:B:18:0x0032] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p434dd.C16545c m42048a(android.content.Context r3) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0026 }
            java.io.File r3 = r3.getFilesDir()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0026 }
            r2.<init>(r3, r0)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0026 }
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0026 }
            java.lang.String r0 = "rw"
            r3.<init>(r2, r0)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0026 }
            java.nio.channels.FileChannel r3 = r3.getChannel()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0026 }
            java.nio.channels.FileLock r0 = r3.lock()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0023 }
            dd.c r2 = new dd.c     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0021 }
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r0)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0021 }
            return r2
        L_0x0021:
            goto L_0x0029
        L_0x0023:
            r0 = r1
            goto L_0x0029
        L_0x0026:
            r3 = r1
            r0 = r3
        L_0x0029:
            if (r0 == 0) goto L_0x0030
            r0.release()     // Catch:{ IOException -> 0x002f }
            goto L_0x0030
        L_0x002f:
        L_0x0030:
            if (r3 == 0) goto L_0x0035
            r3.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p434dd.C16545c.m42048a(android.content.Context):dd.c");
    }

    /* renamed from: b */
    public final void mo49324b() {
        try {
            ((FileLock) this.f43181b).release();
            ((FileChannel) this.f43180a).close();
        } catch (IOException unused) {
        }
    }

    public /* synthetic */ C16545c(C18102f fVar, C17890d dVar) {
        this.f43180a = fVar;
        this.f43181b = dVar;
    }

    public /* synthetic */ C16545c(C20839b bVar) {
        this.f43181b = DesugarCollections.synchronizedMap(new HashMap());
        this.f43180a = bVar;
    }
}
