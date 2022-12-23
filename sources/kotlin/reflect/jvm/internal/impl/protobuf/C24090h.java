package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import vg0.C25099f;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h */
public interface C24090h extends C25099f {

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$a */
    public interface C24091a extends Cloneable, C25099f {
        C24090h build();

        /* renamed from: n */
        C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException;
    }

    /* renamed from: a */
    void mo59605a(CodedOutputStream codedOutputStream) throws IOException;

    int getSerializedSize();

    C24091a newBuilderForType();

    C24091a toBuilder();
}
