package com.google.protobuf;

import com.google.protobuf.ByteString;

/* renamed from: com.google.protobuf.d */
public final class C14598d extends ByteString.C14567a {

    /* renamed from: b */
    public int f36837b = 0;

    /* renamed from: c */
    public final int f36838c;

    /* renamed from: d */
    public final /* synthetic */ ByteString f36839d;

    public C14598d(ByteString byteString) {
        this.f36839d = byteString;
        this.f36838c = byteString.size();
    }

    public final boolean hasNext() {
        return this.f36837b < this.f36838c;
    }
}
