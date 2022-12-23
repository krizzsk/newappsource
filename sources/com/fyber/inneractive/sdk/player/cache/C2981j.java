package com.fyber.inneractive.sdk.player.cache;

/* renamed from: com.fyber.inneractive.sdk.player.cache.j */
public final class C2981j extends C2954b {

    /* renamed from: b */
    public final boolean f10203b;

    public C2981j(boolean z) {
        this.f10203b = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0086 A[Catch:{ all -> 0x008c }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b9 A[Catch:{ all -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d2 A[EDGE_INSN: B:64:0x00d2->B:51:0x00d2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fyber.inneractive.sdk.player.cache.C2954b.C2955a mo13753a(com.fyber.inneractive.sdk.player.cache.C2953a r9, java.lang.String r10) {
        /*
            r8 = this;
            com.fyber.inneractive.sdk.player.cache.b$a r10 = com.fyber.inneractive.sdk.player.cache.C2954b.C2955a.INVALID
            android.media.MediaPlayer r0 = new android.media.MediaPlayer
            r0.<init>()
            java.io.File r1 = r9.f10107a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0015
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x0015
            r1 = 1
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            if (r1 == 0) goto L_0x0091
            r1 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x0077 }
            java.io.File r5 = r9.mo13752a()     // Catch:{ all -> 0x0077 }
            r4.<init>(r5)     // Catch:{ all -> 0x0077 }
            java.io.File r1 = r9.mo13752a()     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x0075 }
            r0.setDataSource(r1)     // Catch:{ all -> 0x0075 }
            r0.prepare()     // Catch:{ all -> 0x0075 }
            int r1 = r0.getDuration()     // Catch:{ all -> 0x0075 }
            if (r1 <= 0) goto L_0x0088
            com.fyber.inneractive.sdk.player.cache.b$a r10 = com.fyber.inneractive.sdk.player.cache.C2954b.C2955a.f10114a     // Catch:{ all -> 0x0075 }
            int r1 = r0.getVideoWidth()     // Catch:{ all -> 0x0075 }
            if (r1 <= 0) goto L_0x0064
            int r1 = r0.getVideoHeight()     // Catch:{ all -> 0x0075 }
            if (r1 <= 0) goto L_0x0064
            java.lang.String r1 = "video.width"
            int r5 = r0.getVideoWidth()     // Catch:{ all -> 0x0075 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0075 }
            java.util.Map<java.lang.String, java.lang.String> r6 = r8.f10113a     // Catch:{ all -> 0x0075 }
            r6.put(r1, r5)     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = "video.height"
            int r5 = r0.getVideoHeight()     // Catch:{ all -> 0x0075 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0075 }
            java.util.Map<java.lang.String, java.lang.String> r6 = r8.f10113a     // Catch:{ all -> 0x0075 }
            r6.put(r1, r5)     // Catch:{ all -> 0x0075 }
        L_0x0064:
            java.lang.String r1 = "video.duration"
            int r5 = r0.getDuration()     // Catch:{ all -> 0x0075 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0075 }
            java.util.Map<java.lang.String, java.lang.String> r6 = r8.f10113a     // Catch:{ all -> 0x0075 }
            r6.put(r1, r5)     // Catch:{ all -> 0x0075 }
            goto L_0x0088
        L_0x0075:
            r1 = move-exception
            goto L_0x007b
        L_0x0077:
            r4 = move-exception
            r7 = r4
            r4 = r1
            r1 = r7
        L_0x007b:
            java.lang.String r5 = "Exception raised while trying to open a cache candidate"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x008c }
            com.fyber.inneractive.sdk.util.IAlog.m9901a(r5, r1, r6)     // Catch:{ all -> 0x008c }
            boolean r1 = r9.f10109c     // Catch:{ all -> 0x008c }
            if (r1 == 0) goto L_0x0088
            com.fyber.inneractive.sdk.player.cache.b$a r10 = com.fyber.inneractive.sdk.player.cache.C2954b.C2955a.PARTIAL_CANNOT_VALIDATE     // Catch:{ all -> 0x008c }
        L_0x0088:
            com.fyber.inneractive.sdk.player.cache.C2985m.m7338a((java.io.Closeable) r4)
            goto L_0x0091
        L_0x008c:
            r9 = move-exception
            com.fyber.inneractive.sdk.player.cache.C2985m.m7338a((java.io.Closeable) r4)
            throw r9
        L_0x0091:
            r0.release()     // Catch:{ all -> 0x0095 }
            goto L_0x0096
        L_0x0095:
        L_0x0096:
            boolean r0 = r8.f10203b
            if (r0 == 0) goto L_0x009c
            r0 = 0
            goto L_0x009d
        L_0x009c:
            r0 = 1
        L_0x009d:
            if (r0 != 0) goto L_0x00d9
            com.fyber.inneractive.sdk.player.cache.b$a r1 = com.fyber.inneractive.sdk.player.cache.C2954b.C2955a.f10114a
            if (r10 != r1) goto L_0x00d9
            android.media.MediaExtractor r1 = new android.media.MediaExtractor
            r1.<init>()
            java.io.File r4 = r9.mo13752a()     // Catch:{ all -> 0x00d2 }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ all -> 0x00d2 }
            r1.setDataSource(r4)     // Catch:{ all -> 0x00d2 }
        L_0x00b3:
            int r4 = r1.getTrackCount()     // Catch:{ all -> 0x00d2 }
            if (r3 >= r4) goto L_0x00d2
            android.media.MediaFormat r4 = r1.getTrackFormat(r3)     // Catch:{ all -> 0x00d2 }
            java.lang.String r5 = "mime"
            java.lang.String r4 = r4.getString(r5)     // Catch:{ all -> 0x00d2 }
            if (r4 == 0) goto L_0x00cf
            java.lang.String r5 = "video/"
            boolean r4 = r4.startsWith(r5)     // Catch:{ all -> 0x00d2 }
            if (r4 == 0) goto L_0x00cf
            goto L_0x00d3
        L_0x00cf:
            int r3 = r3 + 1
            goto L_0x00b3
        L_0x00d2:
            r2 = r0
        L_0x00d3:
            r1.release()     // Catch:{ all -> 0x00d7 }
            goto L_0x00d8
        L_0x00d7:
        L_0x00d8:
            r0 = r2
        L_0x00d9:
            com.fyber.inneractive.sdk.player.cache.b$a r1 = com.fyber.inneractive.sdk.player.cache.C2954b.C2955a.f10114a
            if (r10 != r1) goto L_0x00e8
            if (r0 != 0) goto L_0x00e8
            boolean r9 = r9.f10109c
            if (r9 == 0) goto L_0x00e6
            com.fyber.inneractive.sdk.player.cache.b$a r10 = com.fyber.inneractive.sdk.player.cache.C2954b.C2955a.PARTIAL_CANNOT_VALIDATE
            goto L_0x00e8
        L_0x00e6:
            com.fyber.inneractive.sdk.player.cache.b$a r10 = com.fyber.inneractive.sdk.player.cache.C2954b.C2955a.INVALID
        L_0x00e8:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C2981j.mo13753a(com.fyber.inneractive.sdk.player.cache.a, java.lang.String):com.fyber.inneractive.sdk.player.cache.b$a");
    }
}
