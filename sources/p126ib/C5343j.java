package p126ib;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.C3873a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.Collections;
import java.util.List;
import p099ga.C4865c1;
import p126ib.C5338f;
import p277ub.C6774a0;
import p277ub.C6776b0;
import p277ub.C6792n;
import p431cy.C16525b;

/* renamed from: ib.j */
public final class C5343j extends C3873a implements Handler.Callback {

    /* renamed from: A */
    public long f17628A;

    /* renamed from: m */
    public final Handler f17629m;

    /* renamed from: n */
    public final C5342i f17630n;

    /* renamed from: o */
    public final C5338f f17631o;

    /* renamed from: p */
    public final C16525b f17632p;

    /* renamed from: q */
    public boolean f17633q;

    /* renamed from: r */
    public boolean f17634r;

    /* renamed from: s */
    public boolean f17635s;

    /* renamed from: t */
    public int f17636t;

    /* renamed from: u */
    public Format f17637u;

    /* renamed from: v */
    public C5337e f17638v;

    /* renamed from: w */
    public C5340g f17639w;

    /* renamed from: x */
    public C5341h f17640x;

    /* renamed from: y */
    public C5341h f17641y;

    /* renamed from: z */
    public int f17642z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5343j(C4865c1.C4867b bVar, Looper looper) {
        super(3);
        Handler handler;
        C5338f.C5339a aVar = C5338f.f17624a;
        this.f17630n = bVar;
        if (looper == null) {
            handler = null;
        } else {
            int i = C6774a0.f20959a;
            handler = new Handler(looper, this);
        }
        this.f17629m = handler;
        this.f17631o = aVar;
        this.f17632p = new C16525b();
        this.f17628A = -9223372036854775807L;
    }

    /* renamed from: D */
    public final void mo15811D(Format[] formatArr, long j, long j2) {
        this.f17637u = formatArr[0];
        if (this.f17638v != null) {
            this.f17636t = 1;
        } else {
            mo21128H();
        }
    }

    /* renamed from: F */
    public final long mo21126F() {
        if (this.f17642z == -1) {
            return Long.MAX_VALUE;
        }
        this.f17640x.getClass();
        if (this.f17642z >= this.f17640x.mo21124f()) {
            return Long.MAX_VALUE;
        }
        return this.f17640x.mo21123c(this.f17642z);
    }

    /* renamed from: G */
    public final void mo21127G(SubtitleDecoderException subtitleDecoderException) {
        String valueOf = String.valueOf(this.f17637u);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39);
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(valueOf);
        C6776b0.m15968a(sb.toString(), subtitleDecoderException);
        List emptyList = Collections.emptyList();
        Handler handler = this.f17629m;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.f17630n.mo16508B(emptyList);
        }
        mo21129I();
        C5337e eVar = this.f17638v;
        eVar.getClass();
        eVar.release();
        this.f17638v = null;
        this.f17636t = 0;
        mo21128H();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0090, code lost:
        if (r1.equals("application/pgs") == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ea, code lost:
        r4.f17638v = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ec, code lost:
        return;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21128H() {
        /*
            r4 = this;
            r0 = 1
            r4.f17635s = r0
            ib.f r1 = r4.f17631o
            com.google.android.exoplayer2.Format r2 = r4.f17637u
            r2.getClass()
            ib.f$a r1 = (p126ib.C5338f.C5339a) r1
            r1.getClass()
            java.lang.String r1 = r2.f13418m
            if (r1 == 0) goto L_0x00ed
            int r3 = r1.hashCode()
            switch(r3) {
                case -1351681404: goto L_0x0093;
                case -1248334819: goto L_0x008a;
                case -1026075066: goto L_0x007f;
                case -1004728940: goto L_0x0073;
                case 691401887: goto L_0x0068;
                case 822864842: goto L_0x005c;
                case 930165504: goto L_0x0051;
                case 1566015601: goto L_0x0046;
                case 1566016562: goto L_0x0038;
                case 1668750253: goto L_0x002a;
                case 1693976202: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x009e
        L_0x001c:
            java.lang.String r0 = "application/ttml+xml"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0026
            goto L_0x009e
        L_0x0026:
            r0 = 10
            goto L_0x009f
        L_0x002a:
            java.lang.String r0 = "application/x-subrip"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0034
            goto L_0x009e
        L_0x0034:
            r0 = 9
            goto L_0x009f
        L_0x0038:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0042
            goto L_0x009e
        L_0x0042:
            r0 = 8
            goto L_0x009f
        L_0x0046:
            java.lang.String r0 = "application/cea-608"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x004f
            goto L_0x009e
        L_0x004f:
            r0 = 7
            goto L_0x009f
        L_0x0051:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005a
            goto L_0x009e
        L_0x005a:
            r0 = 6
            goto L_0x009f
        L_0x005c:
            java.lang.String r0 = "text/x-ssa"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0066
            goto L_0x009e
        L_0x0066:
            r0 = 5
            goto L_0x009f
        L_0x0068:
            java.lang.String r0 = "application/x-quicktime-tx3g"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0071
            goto L_0x009e
        L_0x0071:
            r0 = 4
            goto L_0x009f
        L_0x0073:
            java.lang.String r0 = "text/vtt"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x007d
            goto L_0x009e
        L_0x007d:
            r0 = 3
            goto L_0x009f
        L_0x007f:
            java.lang.String r0 = "application/x-mp4-vtt"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0088
            goto L_0x009e
        L_0x0088:
            r0 = 2
            goto L_0x009f
        L_0x008a:
            java.lang.String r3 = "application/pgs"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x009f
            goto L_0x009e
        L_0x0093:
            java.lang.String r0 = "application/dvbsubs"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            r0 = 0
            goto L_0x009f
        L_0x009e:
            r0 = -1
        L_0x009f:
            switch(r0) {
                case 0: goto L_0x00e3;
                case 1: goto L_0x00dd;
                case 2: goto L_0x00d7;
                case 3: goto L_0x00d1;
                case 4: goto L_0x00c9;
                case 5: goto L_0x00c1;
                case 6: goto L_0x00b9;
                case 7: goto L_0x00b9;
                case 8: goto L_0x00af;
                case 9: goto L_0x00a9;
                case 10: goto L_0x00a3;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            goto L_0x00ed
        L_0x00a3:
            pb.c r0 = new pb.c
            r0.<init>()
            goto L_0x00ea
        L_0x00a9:
            ob.a r0 = new ob.a
            r0.<init>()
            goto L_0x00ea
        L_0x00af:
            jb.b r0 = new jb.b
            int r1 = r2.f13404E
            java.util.List<byte[]> r2 = r2.f13420o
            r0.<init>(r1, r2)
            goto L_0x00ea
        L_0x00b9:
            jb.a r0 = new jb.a
            int r2 = r2.f13404E
            r0.<init>(r1, r2)
            goto L_0x00ea
        L_0x00c1:
            nb.a r0 = new nb.a
            java.util.List<byte[]> r1 = r2.f13420o
            r0.<init>(r1)
            goto L_0x00ea
        L_0x00c9:
            qb.a r0 = new qb.a
            java.util.List<byte[]> r1 = r2.f13420o
            r0.<init>(r1)
            goto L_0x00ea
        L_0x00d1:
            rb.h r0 = new rb.h
            r0.<init>()
            goto L_0x00ea
        L_0x00d7:
            rb.b r0 = new rb.b
            r0.<init>()
            goto L_0x00ea
        L_0x00dd:
            lb.a r0 = new lb.a
            r0.<init>()
            goto L_0x00ea
        L_0x00e3:
            kb.a r0 = new kb.a
            java.util.List<byte[]> r1 = r2.f13420o
            r0.<init>(r1)
        L_0x00ea:
            r4.f17638v = r0
            return
        L_0x00ed:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            if (r3 == 0) goto L_0x0100
            java.lang.String r1 = r2.concat(r1)
            goto L_0x0105
        L_0x0100:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L_0x0105:
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p126ib.C5343j.mo21128H():void");
    }

    /* renamed from: I */
    public final void mo21129I() {
        this.f17639w = null;
        this.f17642z = -1;
        C5341h hVar = this.f17640x;
        if (hVar != null) {
            hVar.mo21120h();
            this.f17640x = null;
        }
        C5341h hVar2 = this.f17641y;
        if (hVar2 != null) {
            hVar2.mo21120h();
            this.f17641y = null;
        }
    }

    /* renamed from: c */
    public final int mo16040c(Format format) {
        boolean z;
        int i;
        ((C5338f.C5339a) this.f17631o).getClass();
        String str = format.f13418m;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (format.f13405F == null) {
                i = 4;
            } else {
                i = 2;
            }
            return i | 0 | 0;
        } else if (C6792n.m15996i(format.f13418m)) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: d */
    public final boolean mo15932d() {
        return this.f17634r;
    }

    public final String getName() {
        return "TextRenderer";
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.f17630n.mo16508B((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public final boolean isReady() {
        return true;
    }

    /* renamed from: q */
    public final void mo16049q(long j, long j2) {
        boolean z;
        boolean z2;
        if (this.f13471k) {
            long j3 = this.f17628A;
            if (j3 != -9223372036854775807L && j >= j3) {
                mo21129I();
                this.f17634r = true;
            }
        }
        if (!this.f17634r) {
            if (this.f17641y == null) {
                C5337e eVar = this.f17638v;
                eVar.getClass();
                eVar.mo21117b(j);
                try {
                    C5337e eVar2 = this.f17638v;
                    eVar2.getClass();
                    this.f17641y = (C5341h) eVar2.mo21177c();
                } catch (SubtitleDecoderException e) {
                    mo21127G(e);
                    return;
                }
            }
            if (this.f13466f == 2) {
                if (this.f17640x != null) {
                    long F = mo21126F();
                    z = false;
                    while (F <= j) {
                        this.f17642z++;
                        F = mo21126F();
                        z = true;
                    }
                } else {
                    z = false;
                }
                C5341h hVar = this.f17641y;
                if (hVar != null) {
                    if (hVar.mo21174d(4)) {
                        if (!z && mo21126F() == Long.MAX_VALUE) {
                            if (this.f17636t == 2) {
                                mo21129I();
                                C5337e eVar3 = this.f17638v;
                                eVar3.getClass();
                                eVar3.release();
                                this.f17638v = null;
                                this.f17636t = 0;
                                mo21128H();
                            } else {
                                mo21129I();
                                this.f17634r = true;
                            }
                        }
                    } else if (hVar.f17777c <= j) {
                        C5341h hVar2 = this.f17640x;
                        if (hVar2 != null) {
                            hVar2.mo21120h();
                        }
                        this.f17642z = hVar.mo21121a(j);
                        this.f17640x = hVar;
                        this.f17641y = null;
                        z = true;
                    }
                }
                if (z) {
                    this.f17640x.getClass();
                    List<C5332a> b = this.f17640x.mo21122b(j);
                    Handler handler = this.f17629m;
                    if (handler != null) {
                        handler.obtainMessage(0, b).sendToTarget();
                    } else {
                        this.f17630n.mo16508B(b);
                    }
                }
                if (this.f17636t != 2) {
                    while (!this.f17633q) {
                        try {
                            C5340g gVar = this.f17639w;
                            if (gVar == null) {
                                C5337e eVar4 = this.f17638v;
                                eVar4.getClass();
                                gVar = (C5340g) eVar4.mo21178d();
                                if (gVar != null) {
                                    this.f17639w = gVar;
                                } else {
                                    return;
                                }
                            }
                            if (this.f17636t == 1) {
                                gVar.f17757b = 4;
                                C5337e eVar5 = this.f17638v;
                                eVar5.getClass();
                                eVar5.mo21176a(gVar);
                                this.f17639w = null;
                                this.f17636t = 2;
                                return;
                            }
                            int E = mo15812E(this.f17632p, gVar, 0);
                            if (E == -4) {
                                if (gVar.mo21174d(4)) {
                                    this.f17633q = true;
                                    this.f17635s = false;
                                } else {
                                    Format format = (Format) this.f17632p.f43144b;
                                    if (format != null) {
                                        gVar.f17625j = format.f13422q;
                                        gVar.mo15951k();
                                        boolean z3 = this.f17635s;
                                        if (!gVar.mo21174d(1)) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        this.f17635s = z3 & z2;
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.f17635s) {
                                    C5337e eVar6 = this.f17638v;
                                    eVar6.getClass();
                                    eVar6.mo21176a(gVar);
                                    this.f17639w = null;
                                }
                            } else if (E == -3) {
                                return;
                            }
                        } catch (SubtitleDecoderException e2) {
                            mo21127G(e2);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: x */
    public final void mo15835x() {
        this.f17637u = null;
        this.f17628A = -9223372036854775807L;
        List emptyList = Collections.emptyList();
        Handler handler = this.f17629m;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.f17630n.mo16508B(emptyList);
        }
        mo21129I();
        C5337e eVar = this.f17638v;
        eVar.getClass();
        eVar.release();
        this.f17638v = null;
        this.f17636t = 0;
    }

    /* renamed from: z */
    public final void mo15837z(long j, boolean z) {
        List emptyList = Collections.emptyList();
        Handler handler = this.f17629m;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.f17630n.mo16508B(emptyList);
        }
        this.f17633q = false;
        this.f17634r = false;
        this.f17628A = -9223372036854775807L;
        if (this.f17636t != 0) {
            mo21129I();
            C5337e eVar = this.f17638v;
            eVar.getClass();
            eVar.release();
            this.f17638v = null;
            this.f17636t = 0;
            mo21128H();
            return;
        }
        mo21129I();
        C5337e eVar2 = this.f17638v;
        eVar2.getClass();
        eVar2.flush();
    }
}
