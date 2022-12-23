package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.q */
public final class C14625q<K, V> {

    /* renamed from: a */
    public final C14626a<K, V> f36873a;

    /* renamed from: b */
    public final K f36874b = "";

    /* renamed from: c */
    public final V f36875c;

    /* renamed from: com.google.protobuf.q$a */
    public static class C14626a<K, V> {

        /* renamed from: a */
        public final WireFormat$FieldType f36876a;

        /* renamed from: b */
        public final K f36877b = "";

        /* renamed from: c */
        public final WireFormat$FieldType f36878c;

        /* renamed from: d */
        public final V f36879d;

        public C14626a(WireFormat$FieldType wireFormat$FieldType, WireFormat$FieldType wireFormat$FieldType2, Object obj) {
            this.f36876a = wireFormat$FieldType;
            this.f36878c = wireFormat$FieldType2;
            this.f36879d = obj;
        }
    }

    public C14625q(WireFormat$FieldType wireFormat$FieldType, WireFormat$FieldType wireFormat$FieldType2, Object obj) {
        this.f36873a = new C14626a<>(wireFormat$FieldType, wireFormat$FieldType2, obj);
        this.f36875c = obj;
    }

    /* renamed from: a */
    public static <K, V> int m36643a(C14626a<K, V> aVar, K k, V v) {
        return C14606i.m36599b(aVar.f36878c, 2, v) + C14606i.m36599b(aVar.f36876a, 1, k);
    }

    /* renamed from: b */
    public static <K, V> void m36644b(CodedOutputStream codedOutputStream, C14626a<K, V> aVar, K k, V v) throws IOException {
        C14606i.m36605o(codedOutputStream, aVar.f36876a, 1, k);
        C14606i.m36605o(codedOutputStream, aVar.f36878c, 2, v);
    }
}
