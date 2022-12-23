package com.fyber.inneractive.sdk.player.exoplayer2;

import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C3058b;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3301o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3387g;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.a */
public abstract class C3026a implements C3268n {

    /* renamed from: a */
    public final int f10343a;

    /* renamed from: b */
    public C3269o f10344b;

    /* renamed from: c */
    public int f10345c;

    /* renamed from: d */
    public int f10346d;

    /* renamed from: e */
    public C3301o f10347e;

    /* renamed from: f */
    public long f10348f;

    /* renamed from: g */
    public boolean f10349g = true;

    /* renamed from: h */
    public boolean f10350h;

    public C3026a(int i) {
        this.f10343a = i;
    }

    /* renamed from: a */
    public final void mo13957a(int i) {
        this.f10345c = i;
    }

    /* renamed from: a */
    public abstract void mo13959a(long j, boolean z) throws C3054d;

    /* renamed from: a */
    public abstract void mo13961a(boolean z) throws C3054d;

    /* renamed from: a */
    public void mo13962a(C3226i[] iVarArr) throws C3054d {
    }

    /* renamed from: c */
    public final void mo13964c() {
        this.f10350h = true;
    }

    /* renamed from: d */
    public final void mo13965d() throws C3054d {
        boolean z;
        if (this.f10346d == 2) {
            z = true;
        } else {
            z = false;
        }
        C3380a.m8507b(z);
        this.f10346d = 1;
        mo13977r();
    }

    /* renamed from: e */
    public final void mo13966e() throws IOException {
        this.f10347e.mo14159a();
    }

    /* renamed from: f */
    public final void mo13967f() throws C3054d {
        boolean z = true;
        if (this.f10346d != 1) {
            z = false;
        }
        C3380a.m8507b(z);
        this.f10346d = 2;
        mo13976q();
    }

    /* renamed from: g */
    public final boolean mo13968g() {
        return this.f10349g;
    }

    /* renamed from: h */
    public final boolean mo13969h() {
        return this.f10350h;
    }

    /* renamed from: j */
    public C3387g mo13970j() {
        return null;
    }

    /* renamed from: k */
    public final int mo13971k() {
        return this.f10343a;
    }

    /* renamed from: l */
    public final void mo13972l() {
        boolean z = true;
        if (this.f10346d != 1) {
            z = false;
        }
        C3380a.m8507b(z);
        this.f10346d = 0;
        this.f10347e = null;
        this.f10350h = false;
        mo13975p();
    }

    /* renamed from: m */
    public final C3026a mo13973m() {
        return this;
    }

    /* renamed from: n */
    public final C3301o mo13974n() {
        return this.f10347e;
    }

    /* renamed from: p */
    public abstract void mo13975p();

    /* renamed from: q */
    public abstract void mo13976q() throws C3054d;

    /* renamed from: r */
    public abstract void mo13977r() throws C3054d;

    /* renamed from: a */
    public final int mo13955a() {
        return this.f10346d;
    }

    /* renamed from: a */
    public final void mo13960a(C3269o oVar, C3226i[] iVarArr, C3301o oVar2, long j, boolean z, long j2) throws C3054d {
        C3380a.m8507b(this.f10346d == 0);
        this.f10344b = oVar;
        this.f10346d = 1;
        mo13961a(z);
        C3380a.m8507b(!this.f10350h);
        this.f10347e = oVar2;
        this.f10349g = false;
        this.f10348f = j2;
        mo13962a(iVarArr);
        mo13959a(j, z);
    }

    /* renamed from: a */
    public final void mo13963a(C3226i[] iVarArr, C3301o oVar, long j) throws C3054d {
        C3380a.m8507b(!this.f10350h);
        this.f10347e = oVar;
        this.f10349g = false;
        this.f10348f = j;
        mo13962a(iVarArr);
    }

    /* renamed from: a */
    public final void mo13958a(long j) throws C3054d {
        this.f10350h = false;
        this.f10349g = false;
        mo13959a(j, false);
    }

    /* renamed from: a */
    public final int mo13956a(C3228j jVar, C3058b bVar, boolean z) {
        int a = this.f10347e.mo14158a(jVar, bVar, z);
        if (a == -4) {
            if (bVar.mo14058b(4)) {
                this.f10349g = true;
                if (this.f10350h) {
                    return -4;
                }
                return -3;
            }
            bVar.f10529d += this.f10348f;
        } else if (a == -5) {
            C3226i iVar = jVar.f11654a;
            long j = iVar.f11650w;
            if (j != Long.MAX_VALUE) {
                jVar.f11654a = iVar.mo14323a(j + this.f10348f);
            }
        }
        return a;
    }
}
