package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.measurement.C2823g;
import com.fyber.inneractive.sdk.player.controller.C2997g;
import com.fyber.inneractive.sdk.player.enums.C3025b;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.play.core.appupdate.C14226d;
import p723ph.C18923a;

/* renamed from: com.fyber.inneractive.sdk.player.g */
public class C3428g implements C2997g.C3003f {

    /* renamed from: a */
    public final C2823g f12243a;

    /* renamed from: b */
    public boolean f12244b = false;

    /* renamed from: c */
    public boolean f12245c = false;

    /* renamed from: d */
    public boolean f12246d = false;

    public C3428g(C2823g gVar) {
        this.f12243a = gVar;
    }

    /* renamed from: a */
    public void mo13864a(C3025b bVar) {
        IAlog.m9902a("MeasurementHelper onPlayerStateChanged=%s mBuffering=%s mPrepared=%s", bVar, String.valueOf(this.f12244b), String.valueOf(this.f12246d));
        if (this.f12243a != null) {
            int ordinal = bVar.ordinal();
            if (ordinal == 2) {
                this.f12246d = true;
            } else if (ordinal != 3) {
                if (ordinal != 6) {
                    if (ordinal == 7) {
                        C2823g gVar = this.f12243a;
                        if (gVar.f9692c != null) {
                            IAlog.m9902a("%s pause", "OMVideo");
                            try {
                                C18923a aVar = gVar.f9692c;
                                C14226d.m35351r0(aVar.f48164a);
                                aVar.f48164a.f47714e.mo44187b("pause");
                            } catch (Throwable th) {
                                gVar.mo13612a(th);
                            }
                        }
                        this.f12245c = true;
                    } else if (ordinal == 8) {
                        C2823g gVar2 = this.f12243a;
                        if (gVar2.f9692c != null) {
                            IAlog.m9902a("%s complete", "OMVideo");
                            try {
                                C18923a aVar2 = gVar2.f9692c;
                                C14226d.m35351r0(aVar2.f48164a);
                                aVar2.f48164a.f47714e.mo44187b("complete");
                            } catch (Throwable th2) {
                                gVar2.mo13612a(th2);
                            }
                        }
                    }
                } else if (this.f12244b) {
                    this.f12244b = false;
                    C2823g gVar3 = this.f12243a;
                    if (gVar3.f9692c != null) {
                        IAlog.m9902a("%s bufferEnd", "OMVideo");
                        try {
                            C18923a aVar3 = gVar3.f9692c;
                            C14226d.m35351r0(aVar3.f48164a);
                            aVar3.f48164a.f47714e.mo44187b("bufferFinish");
                        } catch (Throwable th3) {
                            gVar3.mo13612a(th3);
                        }
                    }
                } else if (this.f12245c) {
                    C2823g gVar4 = this.f12243a;
                    if (gVar4.f9692c != null) {
                        IAlog.m9902a("%s resume", "OMVideo");
                        try {
                            C18923a aVar4 = gVar4.f9692c;
                            C14226d.m35351r0(aVar4.f48164a);
                            aVar4.f48164a.f47714e.mo44187b("resume");
                        } catch (Throwable th4) {
                            gVar4.mo13612a(th4);
                        }
                    }
                    this.f12245c = false;
                }
            } else if (this.f12246d) {
                C2823g gVar5 = this.f12243a;
                if (gVar5.f9692c != null) {
                    IAlog.m9902a("%s bufferStart", "OMVideo");
                    try {
                        C18923a aVar5 = gVar5.f9692c;
                        C14226d.m35351r0(aVar5.f48164a);
                        aVar5.f48164a.f47714e.mo44187b("bufferStart");
                    } catch (Throwable th5) {
                        gVar5.mo13612a(th5);
                    }
                }
                this.f12244b = true;
            }
        }
    }

    /* renamed from: a */
    public void mo13741a(Exception exc) {
    }

    /* renamed from: e */
    public void mo13865e() {
    }

    /* renamed from: e */
    public void mo13747e(boolean z) {
    }
}
