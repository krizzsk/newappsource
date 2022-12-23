package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ag0.C20986c;
import hh0.C23509r;
import java.util.List;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.C24090h;
import lf0.C24225a;

public final class MemberDeserializer$valueParameters$1$annotations$1 extends Lambda implements C24225a<List<? extends C20986c>> {
    public final /* synthetic */ C24090h $callable;
    public final /* synthetic */ C23509r $containerOfCallable;

    /* renamed from: $i */
    public final /* synthetic */ int f61243$i;
    public final /* synthetic */ AnnotatedCallableKind $kind;
    public final /* synthetic */ ProtoBuf$ValueParameter $proto;
    public final /* synthetic */ MemberDeserializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$valueParameters$1$annotations$1(MemberDeserializer memberDeserializer, C23509r rVar, C24090h hVar, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        super(0);
        this.this$0 = memberDeserializer;
        this.$containerOfCallable = rVar;
        this.$callable = hVar;
        this.$kind = annotatedCallableKind;
        this.f61243$i = i;
        this.$proto = protoBuf$ValueParameter;
    }

    public final Object invoke() {
        return C23825c.m58499K0(this.this$0.f61241a.f59331a.f59315e.mo58593e(this.$containerOfCallable, this.$callable, this.$kind, this.f61243$i, this.$proto));
    }
}
