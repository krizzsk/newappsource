package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.protobuf.C24077b;
import lf0.C24225a;
import vg0.C25100g;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 */
public final class C24134xb5e458c1 extends Lambda implements C24225a {
    public final /* synthetic */ ByteArrayInputStream $inputStream;
    public final /* synthetic */ C25100g $parser;
    public final /* synthetic */ DeserializedMemberScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24134xb5e458c1(C24077b bVar, ByteArrayInputStream byteArrayInputStream, DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.$parser = bVar;
        this.$inputStream = byteArrayInputStream;
        this.this$0 = deserializedMemberScope;
    }

    public final Object invoke() {
        return ((C24077b) this.$parser).mo60018c(this.$inputStream, this.this$0.f61291b.f59331a.f59326p);
    }
}
