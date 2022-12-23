package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import hi0.C23521b0;
import hi0.C23529c0;
import hi0.C23534e;
import hi0.C23536e0;
import hi0.C23538f;
import hi0.C23548l;
import hi0.C23558r;
import hi0.C23562t;
import hi0.C23569w;
import hi0.C23571x;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import ki0.C23803h;
import p649mf.C18367b;
import p697of.C18745g;
import p697of.C18746h;
import p766rf.C19260d;
import pi0.C24721f;

public class FirebasePerfOkHttpClient {
    /* renamed from: a */
    public static void m36079a(C23529c0 c0Var, C18367b bVar, long j, long j2) throws IOException {
        C23571x xVar = c0Var.f59410b;
        if (xVar != null) {
            C23558r rVar = xVar.f59636a;
            rVar.getClass();
            try {
                bVar.mo50839o(new URL(rVar.f59542i).toString());
                bVar.mo50832f(xVar.f59637b);
                C23521b0 b0Var = xVar.f59639d;
                if (b0Var != null) {
                    long a = b0Var.mo53612a();
                    if (a != -1) {
                        bVar.mo50834j(a);
                    }
                }
                C23536e0 e0Var = c0Var.f59416h;
                if (e0Var != null) {
                    long i = e0Var.mo53598i();
                    if (i != -1) {
                        bVar.mo50837m(i);
                    }
                    C23562t q = e0Var.mo53599q();
                    if (q != null) {
                        bVar.mo50836l(q.f59553a);
                    }
                }
                bVar.mo50833g(c0Var.f59412d);
                bVar.mo50835k(j);
                bVar.mo50838n(j2);
                bVar.mo50831c();
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Keep
    public static void enqueue(C23534e eVar, C23538f fVar) {
        C23569w.C23570a a;
        Timer timer = new Timer();
        C23538f fVar2 = fVar;
        C18745g gVar = new C18745g(fVar2, C19260d.f48934t, timer, timer.f36654b);
        C23569w wVar = (C23569w) eVar;
        synchronized (wVar) {
            if (!wVar.f59632f) {
                wVar.f59632f = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        C23803h hVar = wVar.f59629c;
        hVar.getClass();
        hVar.f60153f = C24721f.f62584a.mo61200k();
        hVar.f60151d.getClass();
        C23548l lVar = wVar.f59628b.f59575b;
        C23569w.C23570a aVar = new C23569w.C23570a(wVar, gVar);
        synchronized (lVar) {
            try {
                lVar.f59517d.add(aVar);
                if (!wVar.f59631e && (a = lVar.mo58673a(wVar.f59630d.f59636a.f59537d)) != null) {
                    aVar.f59634d = a.f59634d;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        lVar.mo58676d();
    }

    @Keep
    public static C23529c0 execute(C23534e eVar) throws IOException {
        C18367b bVar = new C18367b(C19260d.f48934t);
        Timer timer = new Timer();
        long j = timer.f36654b;
        try {
            C23529c0 g = ((C23569w) eVar).mo58720g();
            m36079a(g, bVar, j, timer.mo43519b());
            return g;
        } catch (IOException e) {
            C23571x xVar = ((C23569w) eVar).f59630d;
            if (xVar != null) {
                C23558r rVar = xVar.f59636a;
                if (rVar != null) {
                    try {
                        bVar.mo50839o(new URL(rVar.f59542i).toString());
                    } catch (MalformedURLException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                String str = xVar.f59637b;
                if (str != null) {
                    bVar.mo50832f(str);
                }
            }
            bVar.mo50835k(j);
            bVar.mo50838n(timer.mo43519b());
            C18746h.m45753c(bVar);
            throw e;
        }
    }
}
