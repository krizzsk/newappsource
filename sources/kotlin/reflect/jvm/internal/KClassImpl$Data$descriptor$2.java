package kotlin.reflect.jvm.internal;

import eg0.C23293d;
import eg0.C23297g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import lf0.C24225a;
import mf0.C24362h;
import sf0.C24866j;
import tf0.C24973i;
import ug0.C25065b;
import zf0.C25432c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"", "T", "Lzf0/c;", "kotlin.jvm.PlatformType", "invoke", "()Lzf0/c;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class KClassImpl$Data$descriptor$2 extends Lambda implements C24225a<C25432c> {
    public final /* synthetic */ KClassImpl<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$descriptor$2(KClassImpl<T> kClassImpl) {
        super(0);
        this.this$0 = kClassImpl;
    }

    public final Object invoke() {
        C25432c cVar;
        KotlinClassHeader.Kind kind;
        int i;
        KClassImpl<T> kClassImpl = this.this$0;
        int i2 = KClassImpl.f60208e;
        C25065b r = kClassImpl.mo59310r();
        C24973i.C24974a aVar = this.this$0.f60210d.invoke().f60226a;
        C24866j<Object> jVar = KDeclarationContainerImpl.Data.f60225b[0];
        Object invoke = aVar.invoke();
        C24362h.m61210e(invoke, "<get-moduleData>(...)");
        C23297g gVar = (C23297g) invoke;
        if (r.f63252c) {
            cVar = gVar.f59079a.mo58608b(r);
        } else {
            cVar = FindClassInModuleKt.m58735a(gVar.f59079a.f59312b, r);
        }
        if (cVar != null) {
            return cVar;
        }
        KClassImpl<T> kClassImpl2 = this.this$0;
        C23293d a = C23293d.C23294a.m57365a(kClassImpl2.f60209c);
        if (a == null) {
            kind = null;
        } else {
            kind = a.f59075b.f60764a;
        }
        if (kind == null) {
            i = -1;
        } else {
            i = KClassImpl.C23843a.f60221a[kind.ordinal()];
        }
        switch (i) {
            case -1:
            case 6:
                throw new KotlinReflectionInternalError(C24362h.m61216k(kClassImpl2.f60209c, "Unresolved class: "));
            case 1:
            case 2:
            case 3:
                throw new UnsupportedOperationException(C24362h.m61216k(kClassImpl2.f60209c, "Packages and file facades are not yet supported in Kotlin reflection. Meanwhile please use Java reflection to inspect this class: "));
            case 4:
                throw new UnsupportedOperationException(C24362h.m61216k(kClassImpl2.f60209c, "This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection library has no idea what declarations does it have. Please use Java reflection to inspect this class: "));
            case 5:
                StringBuilder k = C13555b.m33972k("Unknown class: ");
                k.append(kClassImpl2.f60209c);
                k.append(" (kind = ");
                k.append(kind);
                k.append(')');
                throw new KotlinReflectionInternalError(k.toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}