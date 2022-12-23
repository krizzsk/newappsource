package com.vungle.warren;

import android.text.TextUtils;
import com.appboy.support.StringUtils;
import com.vungle.warren.C23097c;
import com.vungle.warren.downloader.C23112a;
import com.vungle.warren.downloader.C23127h;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.persistence.DatabaseHelper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import od0.C24543a;
import od0.C24545c;
import sd0.C24849b;

/* renamed from: com.vungle.warren.i */
public final class C23152i implements C23112a {

    /* renamed from: a */
    public AtomicLong f58759a;

    /* renamed from: b */
    public List<C23112a.C23113a> f58760b = Collections.synchronizedList(new ArrayList());

    /* renamed from: c */
    public final /* synthetic */ C23097c.C23105g f58761c;

    /* renamed from: d */
    public final /* synthetic */ C24545c f58762d;

    /* renamed from: e */
    public final /* synthetic */ C23097c f58763e;

    /* renamed from: com.vungle.warren.i$a */
    public class C23153a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C23127h f58764b;

        /* renamed from: c */
        public final /* synthetic */ C23112a.C23113a f58765c;

        public C23153a(C23127h hVar, C23112a.C23113a aVar) {
            this.f58764b = hVar;
            this.f58765c = aVar;
        }

        public final void run() {
            C24543a aVar;
            int i = C23097c.f58614q;
            C23127h hVar = this.f58764b;
            if (hVar != null) {
                String str = hVar.f58719g;
                if (TextUtils.isEmpty(str)) {
                    aVar = null;
                } else {
                    aVar = (C24543a) C23152i.this.f58763e.f58620f.mo58281p(C24543a.class, str).get();
                }
                if (aVar != null) {
                    C23152i.this.f58760b.add(this.f58765c);
                    aVar.f62172f = 2;
                    try {
                        C23152i.this.f58763e.f58620f.mo58288w(aVar);
                    } catch (DatabaseHelper.DBException unused) {
                        C23152i.this.f58760b.add(new C23112a.C23113a(-1, new VungleException(26), 4));
                    }
                } else {
                    C23152i.this.f58760b.add(new C23112a.C23113a(-1, new IOException("Downloaded file not found!"), 1));
                }
            } else {
                C23152i.this.f58760b.add(new C23112a.C23113a(-1, new RuntimeException("error in request"), 4));
            }
            if (C23152i.this.f58759a.decrementAndGet() <= 0) {
                C23152i iVar = C23152i.this;
                iVar.f58763e.mo58107n(iVar.f58761c, iVar.f58762d.getId(), C23152i.this.f58760b, true);
            }
        }
    }

    /* renamed from: com.vungle.warren.i$b */
    public class C23154b implements Runnable {
        public C23154b() {
        }

        public final void run() {
            C23152i iVar = C23152i.this;
            iVar.f58763e.mo58108o(iVar.f58761c.f58643a);
        }
    }

    /* renamed from: com.vungle.warren.i$c */
    public class C23155c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ File f58768b;

        /* renamed from: c */
        public final /* synthetic */ C23127h f58769c;

        public C23155c(File file, C23127h hVar) {
            this.f58768b = file;
            this.f58769c = hVar;
        }

        public final void run() {
            C24543a aVar;
            int i;
            String str;
            String str2;
            boolean z = true;
            if (!this.f58768b.exists()) {
                VungleLogger.m57029b("AdLoader#getAssetDownloadListener; loadAd sequence", String.format("Downloaded file %1$s doesn't exist", new Object[]{this.f58768b.getPath()}));
                C23152i.this.mo58158c(new C23112a.C23113a(-1, new IOException("Downloaded file not found!"), 3), this.f58769c);
                return;
            }
            String str3 = this.f58769c.f58719g;
            if (str3 == null) {
                aVar = null;
            } else {
                aVar = (C24543a) C23152i.this.f58763e.f58620f.mo58281p(C24543a.class, str3).get();
            }
            if (aVar == null) {
                Object[] objArr = new Object[2];
                if (str3 == null) {
                    str2 = "id is null";
                } else {
                    str2 = "repository returned null";
                }
                objArr[0] = str2;
                objArr[1] = this.f58769c;
                VungleLogger.m57029b("AdLoader#getAssetDownloadListener; loadAd sequence", String.format("adAsset is null because %1$s, downloadRequest = %2$s", objArr));
                C23152i.this.mo58158c(new C23112a.C23113a(-1, new IOException("Downloaded file not found!"), 1), this.f58769c);
                return;
            }
            if (C23097c.m57040a(C23152i.this.f58763e, this.f58768b)) {
                i = 0;
            } else {
                i = 2;
            }
            aVar.f62173g = i;
            aVar.f62174h = this.f58768b.length();
            aVar.f62172f = 3;
            try {
                C23152i.this.f58763e.f58620f.mo58288w(aVar);
                if (C23097c.m57040a(C23152i.this.f58763e, this.f58768b)) {
                    C23152i iVar = C23152i.this;
                    C23097c cVar = iVar.f58763e;
                    C23097c.C23105g gVar = iVar.f58761c;
                    C24545c cVar2 = iVar.f58762d;
                    cVar.getClass();
                    if (cVar2.f62186H) {
                        try {
                            File g = cVar.mo58101g(cVar2);
                            if (g != null) {
                                if (g.isDirectory()) {
                                    cVar.f58629o.getClass();
                                    Iterator it = C24849b.m62391a(g).iterator();
                                    while (it.hasNext()) {
                                        File file = (File) it.next();
                                        C24543a aVar2 = new C24543a(cVar2.getId(), (String) null, file.getPath());
                                        aVar2.f62174h = file.length();
                                        aVar2.f62173g = 2;
                                        aVar2.f62172f = 3;
                                        cVar.f58620f.mo58288w(aVar2);
                                    }
                                }
                            }
                            Object[] objArr2 = new Object[3];
                            if (g == null) {
                                str = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
                            } else {
                                str = "not a dir";
                            }
                            objArr2[0] = str;
                            objArr2[1] = gVar.f58643a;
                            objArr2[2] = cVar2;
                            VungleLogger.m57029b("AdLoader#onAssetDownloadFinished; loadAd sequence", String.format("Mraid ad; bad destinationDir - %1$srequest = %2$s; advertisement = %3$s", objArr2));
                            cVar.mo58110q(new VungleException(26), gVar.f58643a, cVar2.getId());
                        } catch (IOException unused) {
                            cVar.mo58110q(new VungleException(24), gVar.f58643a, cVar2.getId());
                        } catch (DatabaseHelper.DBException unused2) {
                            cVar.mo58110q(new VungleException(26), gVar.f58643a, cVar2.getId());
                        }
                    }
                    C23152i iVar2 = C23152i.this;
                    C23097c cVar3 = iVar2.f58763e;
                    C23097c.C23105g gVar2 = iVar2.f58761c;
                    C24545c cVar4 = iVar2.f58762d;
                    cVar3.getClass();
                    if (aVar.f62172f != 3) {
                        cVar3.mo58110q(new VungleException(24), gVar2.f58643a, cVar4.getId());
                    } else {
                        File file2 = new File(aVar.f62171e);
                        if (!C23097c.m57041f(file2, aVar)) {
                            VungleLogger.m57029b("AdLoader#onAssetDownloadFinished; loadAd sequence", String.format("Assets file not valid %1$s; asset = %2$s,request = %3$s; advertisement = %4$s", new Object[]{file2.getPath(), aVar.toString(), gVar2.f58643a, cVar4}));
                            cVar3.mo58110q(new VungleException(24), gVar2.f58643a, cVar4.getId());
                        } else {
                            if (aVar.f62173g == 0) {
                                long currentTimeMillis = System.currentTimeMillis();
                                VungleLogger.m57031d("ttDownloadContext", String.format("Start to unzip assets, request  = %1$s, at: %2$d", new Object[]{gVar2.f58643a, Long.valueOf(currentTimeMillis)}));
                                try {
                                    cVar3.mo58116x(cVar4, aVar, file2, cVar3.f58620f.mo58284s(cVar4.getId()).get());
                                    VungleLogger.m57031d("ttDownloadContext", String.format("Unzip assets completed, request  = %1$s, elapsed time = %2$dms", new Object[]{gVar2.f58643a, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)}));
                                } catch (IOException unused3) {
                                    VungleLogger.m57029b("AdLoader#onAssetDownloadFinished; loadAd sequence", String.format("Unzip failed %1$s; asset = %2$s,request = %3$s; advertisement = %4$s", new Object[]{file2.getPath(), aVar.toString(), gVar2.f58643a, cVar4}));
                                    cVar3.f58624j.mo58149d(aVar.f62170d);
                                    cVar3.mo58110q(new VungleException(24), gVar2.f58643a, cVar4.getId());
                                } catch (DatabaseHelper.DBException e) {
                                    VungleLogger.m57029b("AdLoader#onAssetDownloadFinished; loadAd sequence", String.format("Issue(s) with database: exception = %1$s; asset = %2$s,request = %3$s; advertisement = %4$s", new Object[]{e, aVar.toString(), gVar2.f58643a, cVar4}));
                                    cVar3.mo58110q(new VungleException(26), gVar2.f58643a, cVar4.getId());
                                }
                            }
                            if (cVar3.mo58104j(cVar4)) {
                                VungleLogger.m57031d("ttDownloadContext", String.format("Ad ready to play, request  = %1$s, elapsed time = %2$dms", new Object[]{gVar2.f58643a, Long.valueOf(System.currentTimeMillis() - cVar4.f62198T)}));
                                cVar3.mo58109p(gVar2.f58643a, cVar4.getId());
                            }
                        }
                    }
                }
                if (C23152i.this.f58759a.decrementAndGet() <= 0) {
                    if (!"native".equals(C23152i.this.f58762d.f62185G)) {
                        C23152i iVar3 = C23152i.this;
                        if (iVar3.f58763e.mo58104j(iVar3.f58762d)) {
                            z = false;
                        }
                    }
                    C23152i iVar4 = C23152i.this;
                    iVar4.f58763e.mo58107n(iVar4.f58761c, iVar4.f58762d.getId(), C23152i.this.f58760b, z);
                }
            } catch (DatabaseHelper.DBException e2) {
                VungleLogger.m57029b("AdLoader#getAssetDownloadListener; loadAd sequence", String.format("Can't save adAsset %1$s; exception = %2$s", new Object[]{aVar, e2}));
                C23152i.this.mo58158c(new C23112a.C23113a(-1, new VungleException(26), 4), this.f58769c);
            }
        }
    }

    /* renamed from: com.vungle.warren.i$d */
    public class C23156d implements Runnable {
        public C23156d() {
        }

        public final void run() {
            C23152i iVar = C23152i.this;
            iVar.f58763e.mo58108o(iVar.f58761c.f58643a);
        }
    }

    public C23152i(C23097c cVar, C23097c.C23105g gVar, C24545c cVar2) {
        this.f58763e = cVar;
        this.f58761c = gVar;
        this.f58762d = cVar2;
        this.f58759a = new AtomicLong((long) gVar.f58654l.size());
    }

    /* renamed from: a */
    public final void mo58156a() {
    }

    /* renamed from: b */
    public final void mo58157b(File file, C23127h hVar) {
        this.f58763e.f58621g.mo53305j().mo53324a(new C23155c(file, hVar), new C23156d());
    }

    /* renamed from: c */
    public final void mo58158c(C23112a.C23113a aVar, C23127h hVar) {
        this.f58763e.f58621g.mo53305j().mo53324a(new C23153a(hVar, aVar), new C23154b());
    }
}
