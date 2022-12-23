package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.protobuf.q0 */
public interface C3564q0 extends C3568r0 {

    /* renamed from: com.fyber.inneractive.sdk.protobuf.q0$a */
    public interface C3565a extends C3568r0, Cloneable {
    }

    int getSerializedSize();

    C3565a newBuilderForType();

    C3565a toBuilder();

    C3508i toByteString();

    void writeTo(C3540l lVar) throws IOException;
}
