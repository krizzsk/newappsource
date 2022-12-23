package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import p911xg.C20505m;

/* renamed from: com.google.protobuf.t */
public interface C14629t extends C20505m {

    /* renamed from: com.google.protobuf.t$a */
    public interface C14630a extends C20505m, Cloneable {
    }

    /* renamed from: a */
    void mo43942a(CodedOutputStream codedOutputStream) throws IOException;

    int getSerializedSize();

    GeneratedMessageLite.C14572a toBuilder();

    ByteString toByteString();
}
