package com.google.protobuf;

import com.google.protobuf.C14600e;
import com.google.protobuf.GeneratedMessageLite;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.k */
public final class C14610k {

    /* renamed from: a */
    public static final Charset f36861a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f36862b;

    /* renamed from: com.google.protobuf.k$a */
    public interface C14611a {
        int getNumber();
    }

    /* renamed from: com.google.protobuf.k$b */
    public interface C14612b<T extends C14611a> {
    }

    /* renamed from: com.google.protobuf.k$c */
    public interface C14613c {
    }

    /* renamed from: com.google.protobuf.k$d */
    public interface C14614d extends C14615e<Integer> {
    }

    /* renamed from: com.google.protobuf.k$e */
    public interface C14615e<E> extends List<E>, RandomAccess {
        /* renamed from: H */
        void mo44024H();

        /* renamed from: Q0 */
        boolean mo44025Q0();

        /* renamed from: c1 */
        C14615e<E> mo44086c1(int i);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f36862b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C14600e.C14601a(bArr, 0, 0, false).mo44049a(0);
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m36622a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: b */
    public static GeneratedMessageLite m36623b(Object obj, Object obj2) {
        GeneratedMessageLite.C14572a builder = ((C14629t) obj).toBuilder();
        C14629t tVar = (C14629t) obj2;
        builder.getClass();
        if (builder.f36808b.getClass().isInstance(tVar)) {
            builder.mo43956p();
            GeneratedMessageLite.C14572a.m36511q(builder.f36809c, (GeneratedMessageLite) ((C14583a) tVar));
            return builder.mo43955o();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
