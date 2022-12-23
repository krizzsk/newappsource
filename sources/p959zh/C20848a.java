package p959zh;

import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;

/* renamed from: zh.a */
public final class C20848a {

    /* renamed from: a */
    public final Owner f52578a;

    /* renamed from: b */
    public final Owner f52579b;

    /* renamed from: c */
    public final boolean f52580c;

    /* renamed from: d */
    public final CreativeType f52581d;

    /* renamed from: e */
    public final ImpressionType f52582e;

    public C20848a(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2) {
        this.f52581d = creativeType;
        this.f52582e = impressionType;
        this.f52578a = owner;
        if (owner2 == null) {
            this.f52579b = Owner.NONE;
        } else {
            this.f52579b = owner2;
        }
        this.f52580c = false;
    }
}
