package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.os.Handler;
import com.fyber.inneractive.sdk.player.exoplayer2.C3052b;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3357j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.f */
public interface C3283f {

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.f$a */
    public static final class C3284a {

        /* renamed from: a */
        public final Handler f11798a;

        /* renamed from: b */
        public final C3283f f11799b;

        /* renamed from: c */
        public final long f11800c;

        public C3284a(Handler handler, C3283f fVar) {
            this(handler, fVar, 0);
        }

        /* renamed from: a */
        public static long m8288a(C3284a aVar, long j) {
            aVar.getClass();
            long b = C3052b.m7658b(j);
            if (b == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return aVar.f11800c + b;
        }

        /* renamed from: b */
        public void mo14420b(C3357j jVar, int i, long j, long j2, long j3) {
            if (this.f11799b != null) {
                C3275b bVar = r0;
                C3275b bVar2 = new C3275b(this, jVar, i, -1, (C3226i) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
                this.f11798a.post(bVar);
            }
        }

        public C3284a(Handler handler, C3283f fVar, long j) {
            this.f11798a = fVar != null ? (Handler) C3380a.m8503a(handler) : null;
            this.f11799b = fVar;
            this.f11800c = j;
        }

        /* renamed from: a */
        public void mo14418a(C3357j jVar, int i, long j, long j2, long j3) {
            if (this.f11799b != null) {
                C3276c cVar = r0;
                C3276c cVar2 = new C3276c(this, jVar, i, -1, (C3226i) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
                this.f11798a.post(cVar);
            }
        }

        /* renamed from: a */
        public void mo14419a(C3357j jVar, int i, long j, long j2, long j3, IOException iOException, boolean z) {
            if (this.f11799b != null) {
                C3281d dVar = r0;
                C3281d dVar2 = new C3281d(this, jVar, i, -1, (C3226i) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, j3, iOException, z);
                this.f11798a.post(dVar);
            }
        }
    }
}
