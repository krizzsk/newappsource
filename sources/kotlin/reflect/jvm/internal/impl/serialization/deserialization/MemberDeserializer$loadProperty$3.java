package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ag0.C20986c;
import hh0.C23484a;
import hh0.C23509r;
import jh0.C23733g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import lf0.C24225a;
import lh0.C24307v;
import mf0.C24362h;
import zg0.C25498g;

final class MemberDeserializer$loadProperty$3 extends Lambda implements C24225a<C25498g<?>> {
    public final /* synthetic */ C23733g $property;
    public final /* synthetic */ ProtoBuf$Property $proto;
    public final /* synthetic */ MemberDeserializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$loadProperty$3(MemberDeserializer memberDeserializer, ProtoBuf$Property protoBuf$Property, C23733g gVar) {
        super(0);
        this.this$0 = memberDeserializer;
        this.$proto = protoBuf$Property;
        this.$property = gVar;
    }

    public final Object invoke() {
        MemberDeserializer memberDeserializer = this.this$0;
        C23509r a = memberDeserializer.mo60190a(memberDeserializer.f61241a.f59333c);
        C24362h.m61208c(a);
        C23484a<C20986c, C25498g<?>> aVar = this.this$0.f61241a.f59331a.f59315e;
        ProtoBuf$Property protoBuf$Property = this.$proto;
        C24307v i = this.$property.mo53443i();
        C24362h.m61210e(i, "property.returnType");
        return aVar.mo58592d(a, protoBuf$Property, i);
    }
}
