package p413co;

import p413co.C13862i;

/* renamed from: co.s */
public final class C13873s {

    /* renamed from: a */
    public final C13862i.C13863a f34121a;

    /* renamed from: b */
    public final C13860h f34122b;

    public C13873s(C13862i.C13863a aVar, C13860h hVar) {
        this.f34121a = aVar;
        this.f34122b = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028 A[Catch:{ IOException | SecurityException -> 0x0039 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029 A[Catch:{ IOException | SecurityException -> 0x0039 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40820a(java.lang.String r5) throws com.masabi.justride.sdk.platform.storage.FileStorageException {
        /*
            r4 = this;
            co.h r0 = r4.f34122b
            r0.mo40807a()
            co.i$a r0 = r4.f34121a
            java.io.File r1 = new java.io.File
            r1.<init>(r5)
            co.i r0 = r0.mo40812a(r1)
            java.io.File r1 = r0.f34100a     // Catch:{ IOException -> 0x003b, SecurityException -> 0x0039 }
            boolean r1 = r1.delete()     // Catch:{ IOException -> 0x003b, SecurityException -> 0x0039 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0025
            java.io.File r0 = r0.f34100a     // Catch:{ IOException -> 0x003b, SecurityException -> 0x0039 }
            boolean r0 = r0.exists()     // Catch:{ IOException -> 0x003b, SecurityException -> 0x0039 }
            if (r0 != 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r0 = 0
            goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x0029
            return
        L_0x0029:
            com.masabi.justride.sdk.platform.storage.FileStorageException r0 = new com.masabi.justride.sdk.platform.storage.FileStorageException     // Catch:{ IOException -> 0x003b, SecurityException -> 0x0039 }
            java.lang.String r1 = "Couldn't delete file %s."
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x003b, SecurityException -> 0x0039 }
            r2[r3] = r5     // Catch:{ IOException -> 0x003b, SecurityException -> 0x0039 }
            java.lang.String r5 = java.lang.String.format(r1, r2)     // Catch:{ IOException -> 0x003b, SecurityException -> 0x0039 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x003b, SecurityException -> 0x0039 }
            throw r0     // Catch:{ IOException -> 0x003b, SecurityException -> 0x0039 }
        L_0x0039:
            r5 = move-exception
            goto L_0x003c
        L_0x003b:
            r5 = move-exception
        L_0x003c:
            com.masabi.justride.sdk.platform.storage.FileStorageException r0 = new com.masabi.justride.sdk.platform.storage.FileStorageException
            java.lang.String r1 = "Failed deleting file"
            r0.<init>(r1, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p413co.C13873s.mo40820a(java.lang.String):void");
    }
}
