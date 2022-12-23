package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21625ff;
import java.util.Arrays;
import java.util.List;
import mobi.lab.veriff.util.C24465j;

/* renamed from: com.veriff.sdk.internal.fw */
public class C21650fw {

    /* renamed from: a */
    public static final List<Long> f54688a = Arrays.asList(new Long[]{3000L, Long.valueOf(InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS), 8000L});
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C24465j f54689b = C24465j.m61536a(C21650fw.class);

    /* renamed from: c */
    private final C21636fm f54690c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C21636fm f54691d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public xb$a f54692e;

    /* renamed from: com.veriff.sdk.internal.fw$a */
    public interface C21654a {
        /* renamed from: a */
        void mo54933a();

        /* renamed from: a */
        void mo54934a(List<C21667gf> list);

        /* renamed from: a */
        void mo54935a(List<C21667gf> list, int i);
    }

    public C21650fw(xb$a xb_a, C21636fm fmVar, C21636fm fmVar2) {
        this.f54692e = xb_a;
        this.f54690c = fmVar;
        this.f54691d = fmVar2;
    }

    /* renamed from: a */
    public void mo54927a(List<C21667gf> list, String str, C21654a aVar) {
        C24465j jVar = f54689b;
        StringBuilder k = C13555b.m33972k("sendEvents() called with: event = [");
        k.append(list.size());
        k.append("]");
        jVar.mo60705d(k.toString());
        m52560a(list, str, f54688a, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m52560a(List<C21667gf> list, String str, List<Long> list2, C21654a aVar) {
        final List<Long> list3 = list2;
        final String str2 = str;
        final List<C21667gf> list4 = list;
        final C21654a aVar2 = aVar;
        this.f54690c.mo54894a(new Runnable() {
            public void run() {
                C21650fw.this.f54692e.mo57052a(str2, new C22530sp(list4)).mo54003a(new C22673wx<C22558tn>() {
                    /* renamed from: a */
                    public void mo54929a(ace<C22558tn> ace, Throwable th) {
                        C21650fw.f54689b.mo60706d("Failed to send event", th);
                        C216511 r2 = C216511.this;
                        aVar2.mo54934a(list4);
                    }

                    /* renamed from: a_ */
                    public void mo54930a_(ace<C22558tn> ace, acu<C22558tn> acu) {
                        C24465j a = C21650fw.f54689b;
                        StringBuilder k = C13555b.m33972k("Successfully sent the events: ");
                        k.append(list4.size());
                        a.mo60705d(k.toString());
                        aVar2.mo54933a();
                    }

                    /* renamed from: b */
                    public void mo54931b(ace<C22558tn> ace, acu<C22558tn> acu) {
                        if (acu.mo54070a() < 500 || !C216511.this.m52563a(acu)) {
                            C216511 r4 = C216511.this;
                            aVar2.mo54935a(list4, acu.mo54070a());
                            return;
                        }
                        final C21625ff.C21626a a = C21625ff.f54627a.mo54898a();
                        C21650fw.this.f54691d.mo54893a(((Long) list3.get(0)).longValue(), new Runnable() {
                            public void run() {
                                C216511 r0 = C216511.this;
                                C21650fw fwVar = C21650fw.this;
                                List list = list4;
                                String str = str2;
                                List list2 = list3;
                                fwVar.m52560a(list, str, list2.subList(1, list2.size()), aVar2);
                                a.mo54900a();
                            }
                        });
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public boolean m52563a(acu<C22558tn> acu) {
                if (list3.isEmpty()) {
                    return false;
                }
                if (acu != null) {
                    return acu.mo54072c().mo57270b("X-Veriff-No-Retry-Event").isEmpty();
                }
                return true;
            }
        });
    }
}
