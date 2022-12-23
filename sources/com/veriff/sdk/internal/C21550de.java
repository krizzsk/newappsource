package com.veriff.sdk.internal;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.C1020l;
import androidx.lifecycle.C1033p;
import com.google.android.play.core.appupdate.C14230h;
import com.veriff.sdk.internal.C21541cu;
import com.veriff.sdk.internal.C21580du;
import com.veriff.sdk.internal.C21582dw;
import com.veriff.sdk.internal.C21610ep;
import com.veriff.sdk.internal.C22295qc;
import com.veriff.sdk.internal.C22377ri;
import com.veriff.sdk.internal.permission.C22252a;
import com.veriff.sdk.internal.permission.C22253b;
import com.veriff.sdk.internal.permission.C22257e;
import com.veriff.sdk.views.C22808a;
import com.veriff.sdk.views.C22809b;
import com.veriff.sdk.views.C22932d;
import com.veriff.sdk.views.base.verification.C22814a;
import com.veriff.sdk.views.base.verification.C22815b;
import com.veriff.sdk.views.base.verification.C22816c;
import com.veriff.sdk.views.base.verification.C22817d;
import com.veriff.sdk.views.base.verification.C22818e;
import com.veriff.sdk.views.base.verification.C22820f;
import com.veriff.sdk.views.base.verification.VeriffActivity;
import ie0.C23586a;
import ie0.C23587b;
import ie0.C23589d;
import java.util.Collections;
import java.util.Map;
import kotlinx.coroutines.CoroutineDispatcher;
import mobi.lab.veriff.data.C24426d;
import mobi.lab.veriff.service.C24441a;
import mobi.lab.veriff.service.SendAuthenticationFlowDataToServerService;
import mobi.lab.veriff.util.C24454g;
import mobi.lab.veriff.util.C24457h;
import mobi.lab.veriff.util.C24464i;
import mobi.lab.veriff.util.C24469n;
import mobi.lab.veriff.util.C24471o;
import wh0.C25235z;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.de */
public final class C21550de implements C21593eg {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C25292a<C22746yp> f54229b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C25292a<C21450bi> f54230c;

    /* renamed from: d */
    private C25292a<C21582dw.C21583a> f54231d;

    /* renamed from: e */
    private C25292a<C22664wo> f54232e;

    /* renamed from: com.veriff.sdk.internal.de$a */
    public static final class C21552a {
        /* renamed from: a */
        public C21593eg mo54568a() {
            return new C21550de();
        }

        private C21552a() {
        }
    }

    /* renamed from: com.veriff.sdk.internal.de$b */
    public final class C21553b implements C21582dw.C21583a {
        private C21553b() {
        }

        /* renamed from: a */
        public C21582dw mo54569a(Context context, C24426d dVar) {
            context.getClass();
            dVar.getClass();
            return new C21554c(context, dVar);
        }
    }

    /* renamed from: com.veriff.sdk.internal.de$c */
    public final class C21554c implements C21582dw {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C24426d f54236b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C25292a<C24426d> f54237c;

        /* renamed from: d */
        private C25292a<Context> f54238d;

        /* renamed from: e */
        private C25292a<C22746yp> f54239e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C25292a<xb$a> f54240f;

        /* renamed from: g */
        private C25292a<C21650fw> f54241g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C25292a<C21657fz> f54242h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C25292a<C21905kb> f54243i;

        /* renamed from: j */
        private C25292a<C21919kj> f54244j;

        /* renamed from: k */
        private C25292a<C22054nd> f54245k;

        /* renamed from: l */
        private C25292a<C22067nl> f54246l;

        /* renamed from: m */
        private C25292a<C22206ol> f54247m;

        /* renamed from: n */
        private C25292a<C22199oh> f54248n;

        /* renamed from: o */
        private C25292a<C21784it> f54249o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public C25292a<C24457h> f54250p;

        /* renamed from: q */
        private C25292a<C22704xu> f54251q;

        /* renamed from: r */
        private C25292a<C21512ci> f54252r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public C25292a<C21639fp> f54253s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public C25292a<C24454g> f54254t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public C25292a<C21616ex> f54255u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public C25292a<C22696xo> f54256v;

        /* renamed from: com.veriff.sdk.internal.de$c$a */
        public final class C21555a implements C21610ep.C21611a {
            private C21555a() {
            }

            /* renamed from: a */
            public C21610ep mo54572a(C21895jw jwVar, C21900jz jzVar) {
                jwVar.getClass();
                jzVar.getClass();
                return new C21556b(jwVar, jzVar);
            }
        }

        /* renamed from: com.veriff.sdk.internal.de$c$b */
        public final class C21556b implements C21610ep {
            /* access modifiers changed from: private */

            /* renamed from: b */
            public final C21895jw f54259b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public final C21900jz f54260c;
            /* access modifiers changed from: private */

            /* renamed from: d */
            public C25292a<C21895jw> f54261d;
            /* access modifiers changed from: private */

            /* renamed from: e */
            public C25292a<C21789ix> f54262e;
            /* access modifiers changed from: private */

            /* renamed from: f */
            public C25292a<C21900jz> f54263f;
            /* access modifiers changed from: private */

            /* renamed from: g */
            public C25292a<Boolean> f54264g;

            /* renamed from: com.veriff.sdk.internal.de$c$b$a */
            public final class C21557a implements C21541cu.C21542a {
                private C21557a() {
                }

                /* renamed from: a */
                public C21541cu mo54555a(C22233ot otVar) {
                    otVar.getClass();
                    return new C21558b(otVar);
                }
            }

            /* renamed from: com.veriff.sdk.internal.de$c$b$b */
            public final class C21558b implements C21541cu {
                /* access modifiers changed from: private */

                /* renamed from: b */
                public C25292a<C22233ot> f54267b;

                /* renamed from: c */
                private C25292a<C21580du.C21581a> f54268c;

                /* renamed from: d */
                private C25292a<C22259pf> f54269d;

                /* renamed from: e */
                private C25292a<C22251pe> f54270e;
                /* access modifiers changed from: private */

                /* renamed from: f */
                public C25292a<C22243pa> f54271f;

                /* renamed from: g */
                private C25292a<C22252a> f54272g;
                /* access modifiers changed from: private */

                /* renamed from: h */
                public C25292a<C22257e> f54273h;
                /* access modifiers changed from: private */

                /* renamed from: i */
                public C25292a<C22420rr> f54274i;

                /* renamed from: j */
                private C25292a<C22816c> f54275j;
                /* access modifiers changed from: private */

                /* renamed from: k */
                public C25292a<C22818e> f54276k;

                /* renamed from: com.veriff.sdk.internal.de$c$b$b$a */
                public final class C21560a implements C21580du.C21581a {
                    private C21560a() {
                    }

                    /* renamed from: a */
                    public C21580du mo54575a() {
                        return new C21561b();
                    }
                }

                /* renamed from: com.veriff.sdk.internal.de$c$b$b$b */
                public final class C21561b implements C21580du {

                    /* renamed from: b */
                    private C25292a<C22816c> f54280b;

                    /* renamed from: c */
                    private C25292a<C22261pi> f54281c;

                    /* renamed from: d */
                    private C25292a<C22267pn> f54282d;

                    /* renamed from: e */
                    private C25292a<C22808a> f54283e;

                    /* renamed from: f */
                    private C25292a<C22281ps> f54284f;

                    /* renamed from: g */
                    private C25292a<C22700xq> f54285g;

                    /* renamed from: h */
                    private C25292a<C24469n> f54286h;

                    /* renamed from: i */
                    private C25292a<C22290py> f54287i;

                    /* renamed from: j */
                    private C25292a<C1020l> f54288j;

                    /* renamed from: k */
                    private C25292a<C25235z> f54289k;

                    /* renamed from: l */
                    private C25292a<C22285pv> f54290l;

                    /* renamed from: m */
                    private C25292a<C22293qa> f54291m;

                    /* renamed from: n */
                    private C25292a<C22295qc> f54292n;

                    /* renamed from: o */
                    private C25292a<C22371rc> f54293o;

                    /* renamed from: p */
                    private C25292a<C22360qx> f54294p;

                    /* renamed from: q */
                    private C25292a<C22354qv> f54295q;

                    /* renamed from: r */
                    private C25292a<C22362qz> f54296r;

                    /* renamed from: s */
                    private C25292a<C22375rg> f54297s;

                    /* renamed from: t */
                    private C25292a<C22377ri> f54298t;

                    /* renamed from: b */
                    private void m51577b() {
                        this.f54280b = C22817d.m56095a((C25292a<C22233ot>) C21558b.this.f54267b, (C25292a<C24426d>) C21554c.this.f54237c, (C25292a<C21895jw>) C21556b.this.f54261d, (C25292a<C24457h>) C21554c.this.f54250p);
                        this.f54281c = C22263pk.m54216a((C25292a<C24426d>) C21554c.this.f54237c, (C25292a<C21639fp>) C21554c.this.f54253s, (C25292a<C21900jz>) C21556b.this.f54263f);
                        this.f54282d = C23587b.m57773b(C22270po.m54258a((C25292a<Context>) C21558b.this.f54267b, (C25292a<C24426d>) C21554c.this.f54237c, (C25292a<C21639fp>) C21554c.this.f54253s, (C25292a<C21789ix>) C21556b.this.f54262e, this.f54280b, (C25292a<C22243pa>) C21558b.this.f54271f, (C25292a<C21895jw>) C21556b.this.f54261d, this.f54281c));
                        this.f54283e = C23587b.m57773b(C22809b.m56068b());
                        this.f54284f = C22284pu.m54314a((C25292a<C21900jz>) C21556b.this.f54263f, (C25292a<C22243pa>) C21558b.this.f54271f, (C25292a<C24426d>) C21554c.this.f54237c, (C25292a<xb$a>) C21554c.this.f54240f, (C25292a<C21895jw>) C21556b.this.f54261d);
                        this.f54285g = C22701xr.m55395a((C25292a<Context>) C21558b.this.f54267b, (C25292a<C22696xo>) C21554c.this.f54256v);
                        this.f54286h = C24471o.m61572a((C25292a<C22696xo>) C21554c.this.f54256v, (C25292a<C21616ex>) C21554c.this.f54255u, (C25292a<C21789ix>) C21556b.this.f54262e);
                        this.f54287i = new C23586a();
                        C21576dr a = C21576dr.m51610a((C25292a<C1033p>) this.f54283e);
                        this.f54288j = a;
                        this.f54289k = C21573dp.m51602a((C25292a<C1020l>) a);
                        C25292a<C22285pv> b = C23587b.m57773b(C22289px.m54332a((C25292a<pr$c>) this.f54287i, (C25292a<pr$a>) this.f54284f, (C25292a<C21645fu>) C21554c.this.f54242h, (C25292a<C21910kf>) C21554c.this.f54243i, (C25292a<C21789ix>) C21556b.this.f54262e, (C25292a<C22257e>) C21558b.this.f54273h, (C25292a<C22420rr>) C21558b.this.f54274i, this.f54289k, (C25292a<C21895jw>) C21556b.this.f54261d));
                        this.f54290l = b;
                        this.f54291m = C22294qb.m54352a((C25292a<pr$b>) b);
                        C22305qg a2 = C22305qg.m54374a((C25292a<Context>) C21558b.this.f54267b, (C25292a<pr$a>) this.f54284f, (C25292a<C24454g>) C21554c.this.f54254t, (C25292a<C21616ex>) C21554c.this.f54255u, this.f54285g, (C25292a<C21789ix>) C21556b.this.f54262e, (C25292a<C21645fu>) C21554c.this.f54242h, this.f54286h, (C25292a<C22295qc.C22299a>) this.f54291m);
                        this.f54292n = a2;
                        C25292a<C22290py> aVar = this.f54287i;
                        C25292a<T> b2 = C23587b.m57773b(C22291pz.m54343a(this.f54283e, (C25292a<C22295qc>) a2, (C25292a<pr$b>) this.f54290l, (C25292a<C21645fu>) C21554c.this.f54242h, (C25292a<C22818e>) C21558b.this.f54276k, (C25292a<C22243pa>) C21558b.this.f54271f));
                        C23586a aVar2 = (C23586a) aVar;
                        if (aVar2.f59658a == null) {
                            aVar2.f59658a = b2;
                            this.f54293o = new C23586a();
                            this.f54294p = C22361qy.m54524a((C25292a<C22257e>) C21558b.this.f54273h);
                            C25292a<C22354qv> b3 = C23587b.m57773b(C22359qw.m54519a((C25292a<C21895jw>) C21556b.this.f54261d, (C25292a<C22420rr>) C21558b.this.f54274i, (C25292a<C24426d>) C21554c.this.f54237c, (C25292a<xb$a>) C21554c.this.f54240f, (C25292a<C24457h>) C21554c.this.f54250p));
                            this.f54295q = b3;
                            C25292a<C22362qz> b4 = C23587b.m57773b(C22370rb.m54560a((C25292a<qu$c>) this.f54293o, (C25292a<C22374rf>) this.f54294p, (C25292a<qu$a>) b3, (C25292a<C21645fu>) C21554c.this.f54242h, (C25292a<C21910kf>) C21554c.this.f54243i, (C25292a<C21895jw>) C21556b.this.f54261d, this.f54289k, (C25292a<CoroutineDispatcher>) C21574dq.m51605b()));
                            this.f54296r = b4;
                            this.f54297s = C22376rh.m54594a((C25292a<qu$b>) b4);
                            this.f54298t = C23587b.m57773b(C22387rj.m54627a((C25292a<Context>) C21558b.this.f54267b, this.f54286h, (C25292a<C21616ex>) C21554c.this.f54255u, this.f54285g, (C25292a<C21645fu>) C21554c.this.f54242h, (C25292a<Boolean>) C21556b.this.f54264g, (C25292a<C22377ri.C22380c>) this.f54297s));
                            C25292a<C22371rc> aVar3 = this.f54293o;
                            C25292a<T> b5 = C23587b.m57773b(C22373re.m54584a((C25292a<Context>) C21558b.this.f54267b, (C25292a<C22257e>) C21558b.this.f54273h, (C25292a<C24457h>) C21554c.this.f54250p, (C25292a<C22818e>) C21558b.this.f54276k, (C25292a<C22243pa>) C21558b.this.f54271f, this.f54298t, (C25292a<qu$b>) this.f54296r));
                            C23586a aVar4 = (C23586a) aVar3;
                            if (aVar4.f59658a == null) {
                                aVar4.f59658a = b5;
                                return;
                            }
                            throw new IllegalStateException();
                        }
                        throw new IllegalStateException();
                    }

                    /* renamed from: a */
                    public Map<C22250pd, C25292a<C22932d>> mo54576a() {
                        C14230h hVar = new C14230h(0);
                        ((Map) hVar.f35762a).put(C22250pd.f56104b, this.f54282d);
                        ((Map) hVar.f35762a).put(C22250pd.f56105c, this.f54287i);
                        ((Map) hVar.f35762a).put(C22250pd.f56103a, this.f54293o);
                        if (((Map) hVar.f35762a).isEmpty()) {
                            return Collections.emptyMap();
                        }
                        return Collections.unmodifiableMap((Map) hVar.f35762a);
                    }

                    private C21561b() {
                        m51577b();
                    }
                }

                private C21558b(C22233ot otVar) {
                    m51568a(otVar);
                }

                /* renamed from: a */
                private void m51568a(C22233ot otVar) {
                    this.f54267b = C23589d.m57775a(otVar);
                    C215591 r4 = new C25292a<C21580du.C21581a>() {
                        /* renamed from: a */
                        public C21580du.C21581a get() {
                            return new C21560a();
                        }
                    };
                    this.f54268c = r4;
                    C25292a<C22259pf> b = C23587b.m57773b(C22260pg.m54188a((C25292a<Activity>) this.f54267b, (C25292a<C21580du.C21581a>) r4));
                    this.f54269d = b;
                    C21546cy a = C21546cy.m51523a(b);
                    this.f54270e = a;
                    this.f54271f = C23587b.m57773b(C22246pb.m54154a((C25292a<C22251pe>) a));
                    C25292a<C22252a> b2 = C23587b.m57773b(C22253b.m54173a((C25292a<Activity>) this.f54267b));
                    this.f54272g = b2;
                    this.f54273h = C21545cx.m51520a(b2);
                    this.f54274i = C23587b.m57773b(C21549da.m51527a((C25292a<Activity>) this.f54267b, (C25292a<C21789ix>) C21556b.this.f54262e));
                    C22817d a2 = C22817d.m56095a(this.f54267b, (C25292a<C24426d>) C21554c.this.f54237c, (C25292a<C21895jw>) C21556b.this.f54261d, (C25292a<C24457h>) C21554c.this.f54250p);
                    this.f54275j = a2;
                    this.f54276k = C21544cw.m51517a((C25292a<C22816c>) a2);
                }

                /* renamed from: b */
                private VeriffActivity m51569b(VeriffActivity veriffActivity) {
                    C22237ou.m54128a((C22233ot) veriffActivity, C21554c.this.f54236b);
                    C22237ou.m54127a((C22233ot) veriffActivity, (C21639fp) C21554c.this.f54253s.get());
                    C22237ou.m54126a((C22233ot) veriffActivity, (C21610ep.C21611a) new C21555a());
                    C22815b.m56083a((C22814a) veriffActivity, C21556b.this.f54259b);
                    C22815b.m56082a((C22814a) veriffActivity, C21556b.this.m51555a());
                    C22815b.m56081a((C22814a) veriffActivity, (C21541cu.C21542a) new C21557a());
                    C22815b.m56084a((C22814a) veriffActivity, C21556b.this.f54260c);
                    C22820f.m56104a(veriffActivity, this.f54271f.get());
                    C22820f.m56107a(veriffActivity, (C24457h) C21554c.this.f54250p.get());
                    C22820f.m56105a(veriffActivity, this.f54272g.get());
                    C22820f.m56106a(veriffActivity, this.f54269d.get());
                    return veriffActivity;
                }

                /* renamed from: a */
                public void mo54554a(VeriffActivity veriffActivity) {
                    m51569b(veriffActivity);
                }
            }

            private C21556b(C21895jw jwVar, C21900jz jzVar) {
                this.f54259b = jwVar;
                this.f54260c = jzVar;
                m51557a(jwVar, jzVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C21789ix m51555a() {
                return C21614es.m51697a(this.f54259b);
            }

            /* renamed from: b */
            private C22814a m51558b(C22814a aVar) {
                C22237ou.m54128a((C22233ot) aVar, C21554c.this.f54236b);
                C22237ou.m54127a((C22233ot) aVar, (C21639fp) C21554c.this.f54253s.get());
                C22237ou.m54126a((C22233ot) aVar, (C21610ep.C21611a) new C21555a());
                C22815b.m56083a(aVar, this.f54259b);
                C22815b.m56082a(aVar, m51555a());
                C22815b.m56081a(aVar, (C21541cu.C21542a) new C21557a());
                C22815b.m56084a(aVar, this.f54260c);
                return aVar;
            }

            /* renamed from: a */
            private void m51557a(C21895jw jwVar, C21900jz jzVar) {
                C23589d a = C23589d.m57775a(jwVar);
                this.f54261d = a;
                this.f54262e = C21614es.m51696a((C25292a<C21895jw>) a);
                this.f54263f = C23589d.m57775a(jzVar);
                this.f54264g = C21613er.m51693a(this.f54261d);
            }

            /* renamed from: a */
            public void mo54573a(C22814a aVar) {
                m51558b(aVar);
            }
        }

        private C21554c(Context context, C24426d dVar) {
            this.f54236b = dVar;
            m51540a(context, dVar);
        }

        /* renamed from: a */
        private void m51540a(Context context, C24426d dVar) {
            this.f54237c = C23589d.m57775a(dVar);
            this.f54238d = C23589d.m57775a(context);
            C25292a<C22746yp> b = C23587b.m57773b(C21591ed.m51645a((C25292a<C22746yp>) C21550de.this.f54229b, this.f54237c, this.f54238d));
            this.f54239e = b;
            C25292a<xb$a> b2 = C23587b.m57773b(C21564dg.m51582a(b, (C25292a<C21450bi>) C21550de.this.f54230c, this.f54237c));
            this.f54240f = b2;
            C25292a<C21650fw> b3 = C23587b.m57773b(C21655fx.m52572a(b2, (C25292a<C21636fm>) C21608eo.m51685b(), (C25292a<C21636fm>) C21606en.m51681b()));
            this.f54241g = b3;
            C25292a<C21657fz> b4 = C23587b.m57773b(C21661ga.m52592a(b3, this.f54237c));
            this.f54242h = b4;
            C25292a<C21905kb> b5 = C23587b.m57773b(C21909ke.m53468a(this.f54238d, (C25292a<C21645fu>) b4, this.f54240f, (C25292a<CoroutineDispatcher>) C21598ej.m51665b()));
            this.f54243i = b5;
            this.f54244j = C23587b.m57773b(C21565dh.m51585a(this.f54238d, (C25292a<C21910kf>) b5, this.f54237c, (C25292a<CoroutineDispatcher>) C21602el.m51673b()));
            this.f54245k = C23587b.m57773b(C22059nf.m53794a(this.f54240f, this.f54237c));
            this.f54246l = C23587b.m57773b(C22082nn.m53862a((C25292a<C25235z>) C21604em.m51677b(), (C25292a<CoroutineDispatcher>) C21600ek.m51669b(), (C25292a<CoroutineDispatcher>) C21602el.m51673b(), this.f54244j, this.f54245k, (C25292a<C21910kf>) this.f54243i, (C25292a<C21450bi>) C21550de.this.f54230c));
            C25292a<C22206ol> b6 = C23587b.m57773b(C22214om.m54033a((C25292a<C21629fg>) C21634fl.m52513b(), (C25292a<CoroutineDispatcher>) C21600ek.m51669b(), (C25292a<CoroutineDispatcher>) C21596ei.m51661b(), (C25292a<C25235z>) C21604em.m51677b()));
            this.f54247m = b6;
            this.f54248n = C23587b.m57773b(C21588ea.m51636a(b6));
            C21786iv a = C21786iv.m53192a(this.f54238d, (C25292a<C21910kf>) this.f54243i, (C25292a<C21450bi>) C21550de.this.f54230c);
            this.f54249o = a;
            this.f54250p = C23587b.m57773b(C24464i.m61534a((C25292a<C21899jy>) a, (C25292a<C21645fu>) this.f54242h));
            this.f54251q = C23587b.m57773b(C21589eb.m51639a(this.f54238d));
            this.f54252r = C23587b.m57773b(C21590ec.m51643a(this.f54238d, this.f54237c, (C25292a<C21910kf>) this.f54243i, (C25292a<C22746yp>) C21550de.this.f54229b, this.f54251q));
            this.f54253s = C23587b.m57773b(C21640fq.m52538a(this.f54240f, (C25292a<C21645fu>) this.f54242h, (C25292a<C22064nk>) this.f54246l, (C25292a<C21910kf>) this.f54243i, this.f54248n, this.f54250p, (C25292a<C21450bi>) C21550de.this.f54230c, this.f54252r));
            this.f54254t = C21587dz.m51633a(this.f54250p);
            this.f54255u = C21592ee.m51648a(this.f54250p);
            this.f54256v = C21586dy.m51630a(this.f54237c);
        }

        /* renamed from: b */
        private C22233ot m51541b(C22233ot otVar) {
            C22237ou.m54128a(otVar, this.f54236b);
            C22237ou.m54127a(otVar, this.f54253s.get());
            C22237ou.m54126a(otVar, (C21610ep.C21611a) new C21555a());
            return otVar;
        }

        /* renamed from: b */
        private SendAuthenticationFlowDataToServerService m51542b(SendAuthenticationFlowDataToServerService sendAuthenticationFlowDataToServerService) {
            C24441a.m61481a(sendAuthenticationFlowDataToServerService, this.f54253s.get());
            return sendAuthenticationFlowDataToServerService;
        }

        /* renamed from: a */
        public void mo54570a(C22233ot otVar) {
            m51541b(otVar);
        }

        /* renamed from: a */
        public void mo54571a(SendAuthenticationFlowDataToServerService sendAuthenticationFlowDataToServerService) {
            m51542b(sendAuthenticationFlowDataToServerService);
        }
    }

    /* renamed from: d */
    private void m51533d() {
        this.f54229b = C23587b.m57773b(C21578dt.m51613b());
        this.f54230c = C23587b.m57773b(C21570dl.m51595b());
        C215511 r0 = new C25292a<C21582dw.C21583a>() {
            /* renamed from: a */
            public C21582dw.C21583a get() {
                return new C21553b();
            }
        };
        this.f54231d = r0;
        this.f54232e = C23587b.m57773b(C22665wp.m55260a((C25292a<C21582dw.C21583a>) r0));
    }

    /* renamed from: c */
    public C22663wn mo54566c() {
        return this.f54232e.get();
    }

    private C21550de() {
        m51533d();
    }

    /* renamed from: a */
    public static C21593eg m51530a() {
        return new C21552a().mo54568a();
    }

    /* renamed from: b */
    public C22746yp mo54565b() {
        return this.f54229b.get();
    }
}
