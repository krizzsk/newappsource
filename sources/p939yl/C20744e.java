package p939yl;

import ce0.C21100e;
import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.masabi.justride.sdk.jobs.network.brand_data.BrandDataEndpoint;
import java.util.Date;
import org.json.JSONException;
import p364al.C13487h;
import p445do.C16690b;
import p561ik.C17618a;
import p584jl.C17885a;
import p702ok.C18775a;
import p725pj.C18926a;
import p771rk.C19283b;
import p796sl.C19469a;
import p796sl.C19471b;
import p818tj.C19683a;
import p913xi.C20531d;
import p941yn.C20746a;

/* renamed from: yl.e */
public final class C20744e {

    /* renamed from: g */
    public static final Long f52341g = 86400000L;

    /* renamed from: a */
    public final C19471b f52342a;

    /* renamed from: b */
    public final C19469a f52343b;

    /* renamed from: c */
    public final C20531d f52344c;

    /* renamed from: d */
    public final C16690b f52345d;

    /* renamed from: e */
    public final C20746a f52346e;

    /* renamed from: f */
    public volatile Date f52347f = new Date(0);

    public C20744e(C19471b bVar, C19469a.C19470a aVar, C20531d dVar, C16690b bVar2, C20746a aVar2) {
        this.f52342a = bVar;
        this.f52344c = dVar;
        this.f52345d = bVar2;
        this.f52346e = aVar2;
        this.f52343b = new C19469a(aVar.f49510a, aVar.f49511b, aVar.f49512c, aVar.f49513d, BrandDataEndpoint.FARE_BLOCKS, aVar.f49514e, aVar.f49515f, C21100e.m49332a0(), C21100e.m49304E(new byte[]{102, 97, 114, 101, 98, 108, 111, 99, 107, 115, 46, 106, 115, 111, 110}));
    }

    /* renamed from: b */
    public static C13487h m48715b(C18926a aVar) {
        if (aVar.f48169a.equals("brand_data")) {
            return new C13487h(null, aVar);
        }
        return new C13487h(null, new C19683a(aVar, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
    }

    /* renamed from: a */
    public final C13487h<Void> mo52887a() {
        C13487h<C18775a> C = this.f52343b.mo40394C();
        if (C.mo40399a()) {
            return new C13487h<>(null, C.f33366b);
        }
        return mo52888c((C18775a) C.f33365a);
    }

    /* renamed from: c */
    public final C13487h<Void> mo52888c(C18775a aVar) {
        String str = aVar.f47784a;
        try {
            return mo52889d((C19283b) this.f52344c.mo52732a(C19283b.class, str), C17885a.m44394D(aVar.f47785b));
        } catch (JSONException e) {
            return m48715b(new C17618a(e.getMessage()));
        }
    }

    /* renamed from: d */
    public final synchronized C13487h<Void> mo52889d(C19283b bVar, Date date) {
        if (date.getTime() <= this.f52347f.getTime()) {
            return new C13487h<>(null, (C18926a) null);
        } else if (bVar == null) {
            return new C13487h<>(null, new C19683a((C18926a) null, C19683a.f49967m, (String) null));
        } else {
            this.f52347f = date;
            return new C13487h<>(null, (C18926a) null);
        }
    }
}
