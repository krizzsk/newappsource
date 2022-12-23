package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.C3873a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p011aa.C0141e;
import p099ga.C4865c1;
import p277ub.C6774a0;
import p326ya.C7354a;
import p326ya.C7355b;
import p326ya.C7357c;
import p326ya.C7358d;
import p431cy.C16525b;

/* renamed from: com.google.android.exoplayer2.metadata.a */
public final class C3946a extends C3873a implements Handler.Callback {

    /* renamed from: m */
    public final C7355b f13865m;

    /* renamed from: n */
    public final C7358d f13866n;

    /* renamed from: o */
    public final Handler f13867o;

    /* renamed from: p */
    public final C7357c f13868p;

    /* renamed from: q */
    public C7354a f13869q;

    /* renamed from: r */
    public boolean f13870r;

    /* renamed from: s */
    public boolean f13871s;

    /* renamed from: t */
    public long f13872t;

    /* renamed from: u */
    public long f13873u;

    /* renamed from: v */
    public Metadata f13874v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3946a(C4865c1.C4867b bVar, Looper looper) {
        super(5);
        Handler handler;
        C7355b.C7356a aVar = C7355b.f22585a;
        this.f13866n = bVar;
        if (looper == null) {
            handler = null;
        } else {
            int i = C6774a0.f20959a;
            handler = new Handler(looper, this);
        }
        this.f13867o = handler;
        this.f13865m = aVar;
        this.f13868p = new C7357c();
        this.f13873u = -9223372036854775807L;
    }

    /* renamed from: D */
    public final void mo15811D(Format[] formatArr, long j, long j2) {
        this.f13869q = this.f13865m.mo23564a(formatArr[0]);
    }

    /* renamed from: F */
    public final void mo16095F(Metadata metadata, ArrayList arrayList) {
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f13864b;
            if (i < entryArr.length) {
                Format d0 = entryArr[i].mo16092d0();
                if (d0 == null || !this.f13865m.mo23565c(d0)) {
                    arrayList.add(metadata.f13864b[i]);
                } else {
                    C0141e a = this.f13865m.mo23564a(d0);
                    byte[] X1 = metadata.f13864b[i].mo16090X1();
                    X1.getClass();
                    this.f13868p.mo15948h();
                    this.f13868p.mo15950j(X1.length);
                    ByteBuffer byteBuffer = this.f13868p.f13647d;
                    int i2 = C6774a0.f20959a;
                    byteBuffer.put(X1);
                    this.f13868p.mo15951k();
                    Metadata g = a.mo318g(this.f13868p);
                    if (g != null) {
                        mo16095F(g, arrayList);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final int mo16040c(Format format) {
        int i;
        if (!this.f13865m.mo23565c(format)) {
            return 0;
        }
        if (format.f13405F == null) {
            i = 4;
        } else {
            i = 2;
        }
        return i | 0 | 0;
    }

    /* renamed from: d */
    public final boolean mo15932d() {
        return this.f13871s;
    }

    public final String getName() {
        return "MetadataRenderer";
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.f13866n.mo16519x((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public final boolean isReady() {
        return true;
    }

    /* renamed from: q */
    public final void mo16049q(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.f13870r && this.f13874v == null) {
                this.f13868p.mo15948h();
                C16525b bVar = this.f13463c;
                bVar.f43143a = null;
                bVar.f43144b = null;
                int E = mo15812E(bVar, this.f13868p, 0);
                if (E == -4) {
                    if (this.f13868p.mo21174d(4)) {
                        this.f13870r = true;
                    } else {
                        C7357c cVar = this.f13868p;
                        cVar.f22586j = this.f13872t;
                        cVar.mo15951k();
                        C7354a aVar = this.f13869q;
                        int i = C6774a0.f20959a;
                        Metadata g = aVar.mo318g(this.f13868p);
                        if (g != null) {
                            ArrayList arrayList = new ArrayList(g.f13864b.length);
                            mo16095F(g, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f13874v = new Metadata(arrayList);
                                this.f13873u = this.f13868p.f13649f;
                            }
                        }
                    }
                } else if (E == -5) {
                    Format format = (Format) bVar.f43144b;
                    format.getClass();
                    this.f13872t = format.f13422q;
                }
            }
            Metadata metadata = this.f13874v;
            if (metadata == null || this.f13873u > j) {
                z = false;
            } else {
                Handler handler = this.f13867o;
                if (handler != null) {
                    handler.obtainMessage(0, metadata).sendToTarget();
                } else {
                    this.f13866n.mo16519x(metadata);
                }
                this.f13874v = null;
                this.f13873u = -9223372036854775807L;
                z = true;
            }
            if (this.f13870r && this.f13874v == null) {
                this.f13871s = true;
            }
        }
    }

    /* renamed from: x */
    public final void mo15835x() {
        this.f13874v = null;
        this.f13873u = -9223372036854775807L;
        this.f13869q = null;
    }

    /* renamed from: z */
    public final void mo15837z(long j, boolean z) {
        this.f13874v = null;
        this.f13873u = -9223372036854775807L;
        this.f13870r = false;
        this.f13871s = false;
    }
}
