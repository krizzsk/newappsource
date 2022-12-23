package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21645fu;
import com.veriff.sdk.internal.C21650fw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mobi.lab.veriff.data.C24426d;
import mobi.lab.veriff.util.C24465j;

/* renamed from: com.veriff.sdk.internal.fz */
public class C21657fz implements C21645fu {

    /* renamed from: a */
    private static final C24465j f54706a = C24465j.m61536a(C21645fu.class);

    /* renamed from: b */
    private final C21650fw f54707b;

    /* renamed from: c */
    private final String f54708c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<C21667gf> f54709d;

    /* renamed from: e */
    private Boolean f54710e = Boolean.FALSE;

    public C21657fz(C21650fw fwVar, C24426d dVar) {
        this.f54707b = fwVar;
        this.f54708c = dVar.mo60598c();
        this.f54709d = new ArrayList();
    }

    /* renamed from: b */
    public void mo54923b() {
        this.f54710e = Boolean.TRUE;
    }

    /* renamed from: c */
    public void mo54924c() {
        this.f54710e = Boolean.FALSE;
    }

    /* renamed from: a */
    public void mo54921a(C21667gf gfVar) {
        if (!this.f54710e.booleanValue()) {
            C24465j jVar = f54706a;
            jVar.mo60705d("log() called with: event = [" + gfVar + "]");
            this.f54707b.mo54927a(Collections.singletonList(gfVar), this.f54708c, new C21650fw.C21654a() {
                /* renamed from: a */
                public void mo54933a() {
                }

                /* renamed from: a */
                public void mo54935a(List<C21667gf> list, int i) {
                    if (i >= 500) {
                        C21657fz.this.f54709d.addAll(list);
                    }
                }

                /* renamed from: a */
                public void mo54934a(List<C21667gf> list) {
                    C21657fz.this.f54709d.addAll(list);
                }
            });
        }
    }

    /* renamed from: a */
    public boolean mo54922a() {
        return !this.f54709d.isEmpty();
    }

    /* renamed from: a */
    public void mo54920a(final C21645fu.C21646a aVar) {
        C24465j jVar = f54706a;
        StringBuilder k = C13555b.m33972k("Retrying ");
        k.append(this.f54709d.size());
        k.append(" events");
        jVar.mo60705d(k.toString());
        this.f54707b.mo54927a(this.f54709d, this.f54708c, new C21650fw.C21654a() {
            /* renamed from: a */
            public void mo54933a() {
                List unused = C21657fz.this.f54709d = Collections.emptyList();
                aVar.mo54925a();
            }

            /* renamed from: a */
            public void mo54935a(List<C21667gf> list, int i) {
                if (i >= 500) {
                    List unused = C21657fz.this.f54709d = new ArrayList(list);
                    aVar.mo54926b();
                    return;
                }
                List unused2 = C21657fz.this.f54709d = Collections.emptyList();
                aVar.mo54925a();
            }

            /* renamed from: a */
            public void mo54934a(List<C21667gf> list) {
                List unused = C21657fz.this.f54709d = new ArrayList(list);
                aVar.mo54926b();
            }
        });
    }
}
