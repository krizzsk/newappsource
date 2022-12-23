package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.Protobuf;
import java.lang.annotation.Annotation;

/* renamed from: com.google.firebase.encoders.proto.a */
public final class C14455a implements Protobuf {

    /* renamed from: a */
    public final int f36512a;

    /* renamed from: b */
    public final Protobuf.IntEncoding f36513b;

    public C14455a(int i, Protobuf.IntEncoding intEncoding) {
        this.f36512a = i;
        this.f36513b = intEncoding;
    }

    public final Class<? extends Annotation> annotationType() {
        return Protobuf.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Protobuf)) {
            return false;
        }
        Protobuf protobuf = (Protobuf) obj;
        if (this.f36512a != ((C14455a) protobuf).f36512a || !this.f36513b.equals(((C14455a) protobuf).f36513b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f36512a ^ 14552422) + (this.f36513b.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + '(' + "tag=" + this.f36512a + "intEncoding=" + this.f36513b + ')';
    }
}
