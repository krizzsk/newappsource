package com.masabi.justride.sdk.jobs.ticket.get;

import org.json.JSONException;
import p364al.C13483d;
import p364al.C13487h;
import p413co.C13867m;
import p413co.C13872r;
import p441dk.C16672a;
import p465ek.C16835c;
import p561ik.C17618a;
import p725pj.C18926a;
import p891wk.C20348c;
import p913xi.C20531d;

/* renamed from: com.masabi.justride.sdk.jobs.ticket.get.a */
public final class C14659a implements C13483d<C20348c> {

    /* renamed from: a */
    public final C13867m f37158a;

    /* renamed from: b */
    public final C20531d f37159b;

    /* renamed from: c */
    public final String f37160c;

    /* renamed from: com.masabi.justride.sdk.jobs.ticket.get.a$a */
    public static class C14660a {

        /* renamed from: a */
        public final C13867m f37161a;

        /* renamed from: b */
        public final C20531d f37162b;

        public C14660a(C13867m mVar, C20531d dVar) {
            this.f37161a = mVar;
            this.f37162b = dVar;
        }
    }

    public C14659a(C13867m mVar, C20531d dVar, String str) {
        this.f37158a = mVar;
        this.f37159b = dVar;
        this.f37160c = str;
    }

    /* renamed from: C */
    public final C13487h<C20348c> mo40394C() {
        StringBuilder k = C13555b.m33972k("t-");
        k.append(this.f37160c);
        C13872r<String> a = this.f37158a.mo40781a(k.toString());
        if (a.mo40817a()) {
            return new C13487h<>(null, new C16835c(a.f34120b, C16672a.f43403f, "No item was found for the provided key"));
        }
        try {
            C20348c cVar = (C20348c) this.f37159b.mo52732a(C20348c.class, (String) a.f34119a);
            if (cVar == null) {
                cVar = new C20348c((Integer) null, (Long) null, (Long) null);
            }
            return new C13487h<>(cVar, (C18926a) null);
        } catch (JSONException e) {
            return new C13487h<>(null, new C16835c(new C17618a(e.getMessage()), C16835c.f43818k, "Failed reading backup data"));
        }
    }
}
