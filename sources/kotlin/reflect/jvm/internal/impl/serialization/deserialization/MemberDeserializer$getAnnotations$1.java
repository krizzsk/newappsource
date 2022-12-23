package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ag0.C20986c;
import hh0.C23509r;
import java.util.List;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.protobuf.C24090h;
import lf0.C24225a;

public final class MemberDeserializer$getAnnotations$1 extends Lambda implements C24225a<List<? extends C20986c>> {
    public final /* synthetic */ AnnotatedCallableKind $kind;
    public final /* synthetic */ C24090h $proto;
    public final /* synthetic */ MemberDeserializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$getAnnotations$1(MemberDeserializer memberDeserializer, C24090h hVar, AnnotatedCallableKind annotatedCallableKind) {
        super(0);
        this.this$0 = memberDeserializer;
        this.$proto = hVar;
        this.$kind = annotatedCallableKind;
    }

    public final Object invoke() {
        List<T> list;
        MemberDeserializer memberDeserializer = this.this$0;
        C23509r a = memberDeserializer.mo60190a(memberDeserializer.f61241a.f59333c);
        if (a == null) {
            list = null;
        } else {
            MemberDeserializer memberDeserializer2 = this.this$0;
            list = C23825c.m58499K0(memberDeserializer2.f61241a.f59331a.f59315e.mo58589a(a, this.$proto, this.$kind));
        }
        if (list == null) {
            return EmptyList.f60173b;
        }
        return list;
    }
}
