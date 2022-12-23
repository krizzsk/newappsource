package p699oh;

import com.google.android.play.core.appupdate.C14226d;
import com.iab.omid.library.fyber.adsession.CreativeType;
import com.iab.omid.library.fyber.adsession.ImpressionType;
import com.iab.omid.library.fyber.adsession.Owner;

/* renamed from: oh.c */
public final class C18750c {

    /* renamed from: a */
    public final Owner f47692a;

    /* renamed from: b */
    public final Owner f47693b;

    /* renamed from: c */
    public final boolean f47694c;

    /* renamed from: d */
    public final CreativeType f47695d;

    /* renamed from: e */
    public final ImpressionType f47696e;

    public C18750c(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2) {
        this.f47695d = creativeType;
        this.f47696e = impressionType;
        this.f47692a = owner;
        if (owner2 == null) {
            this.f47693b = Owner.NONE;
        } else {
            this.f47693b = owner2;
        }
        this.f47694c = false;
    }

    /* renamed from: a */
    public static C18750c m45764a(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2) {
        C14226d.m35346l0(creativeType, "CreativeType is null");
        C14226d.m35346l0(impressionType, "ImpressionType is null");
        C14226d.m35346l0(owner, "Impression owner is null");
        if (owner == Owner.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (creativeType == CreativeType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (impressionType != ImpressionType.DEFINED_BY_JAVASCRIPT || owner != Owner.NATIVE) {
            return new C18750c(creativeType, impressionType, owner, owner2);
        } else {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }
}
