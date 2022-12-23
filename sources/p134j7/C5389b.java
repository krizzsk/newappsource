package p134j7;

import com.google.firebase.messaging.FirebaseMessagingService;
import hi0.C23553o;
import kotlin.NoWhenBranchMatchedException;
import mf0.C24362h;
import p196o7.C6009a;

/* renamed from: j7.b */
public abstract class C5389b {

    /* renamed from: a */
    public final C23553o.C23554a f17710a;

    /* renamed from: j7.b$a */
    public static final class C5390a extends C5389b {

        /* renamed from: b */
        public final String f17711b;

        /* renamed from: c */
        public final String f17712c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5390a(C6009a aVar, String str) {
            super(aVar, "authorization_code");
            C24362h.m61211f(aVar, "clientData");
            C24362h.m61211f(str, "code");
            this.f17711b = str;
            this.f17712c = aVar.f19205d;
        }
    }

    /* renamed from: j7.b$b */
    public static final class C5391b extends C5389b {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5391b(C6009a aVar) {
            super(aVar);
            C24362h.m61211f(aVar, "clientData");
        }
    }

    /* renamed from: j7.b$c */
    public static final class C5392c extends C5389b {

        /* renamed from: b */
        public final String f17713b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5392c(C6009a aVar, String str) {
            super(aVar, "refresh_token");
            C24362h.m61211f(aVar, "clientData");
            C24362h.m61211f(str, FirebaseMessagingService.EXTRA_TOKEN);
            this.f17713b = str;
        }
    }

    /* renamed from: j7.b$d */
    public static final class C5393d extends C5389b {

        /* renamed from: b */
        public final String f17714b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5393d(C6009a aVar, String str) {
            super(aVar);
            C24362h.m61211f(aVar, "clientData");
            C24362h.m61211f(str, "anonymousId");
            this.f17714b = str;
        }
    }

    public /* synthetic */ C5389b(C6009a aVar) {
        this(aVar, "client_credentials");
    }

    /* renamed from: a */
    public final C23553o mo21157a() {
        if (this instanceof C5391b) {
            C23553o.C23554a aVar = this.f17710a;
            aVar.getClass();
            return new C23553o(aVar.f59525a, aVar.f59526b);
        } else if (this instanceof C5393d) {
            C23553o.C23554a aVar2 = this.f17710a;
            aVar2.mo58678a("anonymous_id", ((C5393d) this).f17714b);
            return new C23553o(aVar2.f59525a, aVar2.f59526b);
        } else if (this instanceof C5392c) {
            C23553o.C23554a aVar3 = this.f17710a;
            aVar3.mo58678a("refresh_token", ((C5392c) this).f17713b);
            return new C23553o(aVar3.f59525a, aVar3.f59526b);
        } else if (this instanceof C5390a) {
            C23553o.C23554a aVar4 = this.f17710a;
            C5390a aVar5 = (C5390a) this;
            aVar4.mo58678a("code", aVar5.f17711b);
            aVar4.mo58678a("redirect_uri", C24362h.m61216k("://oauth2callback", aVar5.f17712c));
            return new C23553o(aVar4.f59525a, aVar4.f59526b);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public C5389b(C6009a aVar, String str) {
        C23553o.C23554a aVar2 = new C23553o.C23554a();
        aVar2.mo58678a("client_id", aVar.f19202a);
        aVar2.mo58678a("client_secret", aVar.f19203b);
        aVar2.mo58678a("grant_type", str);
        this.f17710a = aVar2;
    }
}
