package kotlin.reflect.jvm.internal;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import lf0.C24225a;
import mf0.C24362h;
import tf0.C24978j;
import ug0.C25069e;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/c;", "kotlin.jvm.PlatformType", "invoke", "()Lkotlin/reflect/jvm/internal/impl/descriptors/c;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class KFunctionImpl$descriptor$2 extends Lambda implements C24225a<C23900c> {
    public final /* synthetic */ String $name;
    public final /* synthetic */ KFunctionImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KFunctionImpl$descriptor$2(KFunctionImpl kFunctionImpl, String str) {
        super(0);
        this.this$0 = kFunctionImpl;
        this.$name = str;
    }

    public final Object invoke() {
        Iterable iterable;
        String str;
        KFunctionImpl kFunctionImpl = this.this$0;
        KDeclarationContainerImpl kDeclarationContainerImpl = kFunctionImpl.f60230c;
        String str2 = this.$name;
        String str3 = kFunctionImpl.f60231d;
        kDeclarationContainerImpl.getClass();
        C24362h.m61211f(str2, "name");
        C24362h.m61211f(str3, InAppPurchaseMetaData.KEY_SIGNATURE);
        if (C24362h.m61206a(str2, "<init>")) {
            iterable = C23825c.m58499K0(kDeclarationContainerImpl.mo59305f());
        } else {
            iterable = kDeclarationContainerImpl.mo59306g(C25069e.m62820i(str2));
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable2) {
            if (C24362h.m61206a(C24978j.m62673c((C23900c) next).mo59293a(), str3)) {
                arrayList.add(next);
            }
        }
        boolean z = true;
        if (arrayList.size() == 1) {
            return (C23900c) C23825c.m58491C0(arrayList);
        }
        String q0 = C23825c.m58520q0(iterable2, "\n", (String) null, (String) null, KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1.f60227f, 30);
        StringBuilder h = C16759e.m42352h("Function '", str2, "' (JVM signature: ", str3, ") not resolved in ");
        h.append(kDeclarationContainerImpl);
        h.append(':');
        if (q0.length() != 0) {
            z = false;
        }
        if (z) {
            str = " no members found";
        } else {
            str = C24362h.m61216k(q0, "\n");
        }
        h.append(str);
        throw new KotlinReflectionInternalError(h.toString());
    }
}
