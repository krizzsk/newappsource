package p693nz;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import p693nz.C18656g;
import p810sz.C19610m;

/* renamed from: nz.d */
public abstract class C18652d<K, V> implements C18651c<K, V> {
    /* renamed from: b */
    public abstract V mo51033b(K k);

    public V get(K k) {
        boolean z;
        V b = mo51033b(k);
        if (b == null) {
            b = null;
        }
        if (b != null) {
            C18656g gVar = (C18656g) this;
            C18656g.C18657a aVar = (C18656g.C18657a) gVar.f47526g.get(gVar.mo39749j(k));
            if (aVar != null) {
                z = gVar.mo39750m(aVar);
            } else if (gVar.mo23807k(k, b) < System.currentTimeMillis()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                gVar.remove(k);
                return null;
            }
        }
        return b;
    }

    public boolean put(K k, V v) {
        boolean z;
        long j;
        BufferedOutputStream bufferedOutputStream;
        C18656g gVar = (C18656g) this;
        C18656g.C18657a aVar = (C18656g.C18657a) gVar.f47526g.get(gVar.mo39749j(k));
        boolean z2 = false;
        if (aVar != null) {
            z = gVar.mo39750m(aVar);
        } else if (gVar.mo23807k(k, v) < System.currentTimeMillis()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        gVar.mo51038c();
        String j2 = gVar.mo39749j(k);
        File i = gVar.mo51041i(j2);
        try {
            if (i.isFile()) {
                j = i.length();
            } else {
                j = 0;
            }
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(i));
            new C19610m(bufferedOutputStream).mo51967q(v, gVar.f47524e);
            bufferedOutputStream.close();
            C18656g.C18657a h = gVar.mo39748h(k, j2, v);
            gVar.f47526g.put(h, h.f47530a);
            boolean d = gVar.mo51039d();
            gVar.f47529j = (i.length() - j) + gVar.f47529j;
            z2 = d;
        } catch (IOException unused) {
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        if (z2) {
            return gVar.mo39751o(gVar.f47528i);
        }
        return z2;
        throw th;
    }
}
