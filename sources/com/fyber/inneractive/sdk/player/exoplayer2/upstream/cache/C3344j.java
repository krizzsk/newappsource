package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C3331a;
import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j */
public final class C3344j implements C3340f, Comparator<C3341g> {

    /* renamed from: a */
    public final TreeSet<C3341g> f11976a = new TreeSet<>(this);

    /* renamed from: b */
    public long f11977b;

    public C3344j(long j) {
    }

    /* renamed from: a */
    public void mo14469a(C3331a aVar, C3341g gVar) {
        this.f11976a.remove(gVar);
        this.f11977b -= gVar.f11961c;
    }

    /* renamed from: b */
    public void mo14471b(C3331a aVar, C3341g gVar) {
        this.f11976a.add(gVar);
        this.f11977b += gVar.f11961c;
        mo14491a(aVar, 0);
    }

    public int compare(Object obj, Object obj2) {
        C3341g gVar = (C3341g) obj;
        C3341g gVar2 = (C3341g) obj2;
        long j = gVar.f11964f;
        long j2 = gVar2.f11964f;
        if (j - j2 == 0) {
            return gVar.compareTo(gVar2);
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }

    /* renamed from: a */
    public void mo14470a(C3331a aVar, C3341g gVar, C3341g gVar2) {
        this.f11976a.remove(gVar);
        this.f11977b -= gVar.f11961c;
        mo14471b(aVar, gVar2);
    }

    /* renamed from: a */
    public final void mo14491a(C3331a aVar, long j) {
        while (this.f11977b + j > 10485760) {
            try {
                aVar.mo14463a(this.f11976a.first());
            } catch (C3331a.C3332a unused) {
            }
        }
    }
}
