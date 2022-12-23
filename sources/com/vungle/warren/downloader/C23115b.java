package com.vungle.warren.downloader;

import com.vungle.warren.C23152i;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.downloader.C23112a;
import com.vungle.warren.downloader.C23117d;
import java.io.IOException;

/* renamed from: com.vungle.warren.downloader.b */
public final class C23115b extends C23117d.C23123f {

    /* renamed from: f */
    public final /* synthetic */ C23127h f58668f;

    /* renamed from: g */
    public final /* synthetic */ C23112a f58669g;

    /* renamed from: h */
    public final /* synthetic */ C23117d f58670h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23115b(C23117d dVar, C23125f fVar, C23127h hVar, C23152i iVar) {
        super(fVar);
        this.f58670h = dVar;
        this.f58668f = hVar;
        this.f58669g = iVar;
    }

    public final void run() {
        int i = C23117d.f58675n;
        VungleLogger.m57031d("ttDownloadContext", String.format("Start to download asset %1$s, at: %2$d", new Object[]{this.f58668f, Long.valueOf(System.currentTimeMillis())}));
        try {
            C23117d.m57101k(this.f58670h, this.f58668f, this.f58669g);
        } catch (IOException e) {
            VungleLogger.m57029b("AssetDownloader#download; loadAd sequence", "cannot launch request due to " + e);
            int i2 = C23117d.f58675n;
            this.f58670h.mo58163O(this.f58668f, this.f58669g, new C23112a.C23113a(-1, e, 1));
        }
    }
}
