package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ag0.C20986c;
import hh0.C23509r;
import java.util.List;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import lf0.C24225a;

public final class MemberDeserializer$getPropertyFieldAnnotations$1 extends Lambda implements C24225a<List<? extends C20986c>> {
    public final /* synthetic */ boolean $isDelegate;
    public final /* synthetic */ ProtoBuf$Property $proto;
    public final /* synthetic */ MemberDeserializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$getPropertyFieldAnnotations$1(MemberDeserializer memberDeserializer, boolean z, ProtoBuf$Property protoBuf$Property) {
        super(0);
        this.this$0 = memberDeserializer;
        this.$isDelegate = z;
        this.$proto = protoBuf$Property;
    }

    public final Object invoke() {
        List<T> list;
        MemberDeserializer memberDeserializer = this.this$0;
        C23509r a = memberDeserializer.mo60190a(memberDeserializer.f61241a.f59333c);
        if (a == null) {
            list = null;
        } else {
            boolean z = this.$isDelegate;
            MemberDeserializer memberDeserializer2 = this.this$0;
            ProtoBuf$Property protoBuf$Property = this.$proto;
            if (z) {
                list = C23825c.m58499K0(memberDeserializer2.f61241a.f59331a.f59315e.mo58596h(a, protoBuf$Property));
            } else {
                list = C23825c.m58499K0(memberDeserializer2.f61241a.f59331a.f59315e.mo58594f(a, protoBuf$Property));
            }
        }
        if (list == null) {
            return EmptyList.f60173b;
        }
        return list;
    }
}
