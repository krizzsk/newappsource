package kotlin.reflect.jvm.internal;

import cf0.C21139m;
import java.util.ArrayList;
import jg0.C23720a;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import lf0.C24225a;
import mf0.C24362h;
import tf0.C24967c;
import tf0.C24979k;
import ug0.C25066c;
import zf0.C25432c;
import zf0.C25433c0;
import zf0.C25452k0;
import zf0.C25490y;

@Metadata(mo59059d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, mo59060d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lkotlin/reflect/KParameter;", "kotlin.jvm.PlatformType", "R", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class KCallableImpl$_parameters$1 extends Lambda implements C24225a<ArrayList<KParameter>> {
    public final /* synthetic */ KCallableImpl<R> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KCallableImpl$_parameters$1(KCallableImpl<? extends R> kCallableImpl) {
        super(0);
        this.this$0 = kCallableImpl;
    }

    public final Object invoke() {
        int i;
        final C25433c0 c0Var;
        final CallableMemberDescriptor d = this.this$0.mo59298d();
        ArrayList arrayList = new ArrayList();
        final int i2 = 0;
        if (!this.this$0.mo59300f()) {
            C25066c cVar = C24979k.f63116a;
            C24362h.m61211f(d, "<this>");
            if (d.mo53422O() != null) {
                c0Var = ((C25432c) d.mo53399b()).mo53404M0();
            } else {
                c0Var = null;
            }
            if (c0Var != null) {
                arrayList.add(new KParameterImpl(this.this$0, 0, KParameter.Kind.INSTANCE, new C24225a<C25490y>() {
                    public final Object invoke() {
                        return C25433c0.this;
                    }
                }));
                i = 1;
            } else {
                i = 0;
            }
            final C25433c0 R = d.mo53423R();
            if (R != null) {
                arrayList.add(new KParameterImpl(this.this$0, i, KParameter.Kind.EXTENSION_RECEIVER, new C24225a<C25490y>() {
                    public final Object invoke() {
                        return C25433c0.this;
                    }
                }));
                i++;
            }
        } else {
            i = 0;
        }
        int size = d.mo53442h().size();
        while (i2 < size) {
            arrayList.add(new KParameterImpl(this.this$0, i, KParameter.Kind.VALUE, new C24225a<C25490y>() {
                public final Object invoke() {
                    C25452k0 k0Var = CallableMemberDescriptor.this.mo53442h().get(i2);
                    C24362h.m61210e(k0Var, "descriptor.valueParameters[i]");
                    return k0Var;
                }
            }));
            i2++;
            i++;
        }
        if (this.this$0.mo59299e() && (d instanceof C23720a) && arrayList.size() > 1) {
            C21139m.m49437Y(arrayList, new C24967c());
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
