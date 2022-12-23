package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.protobuf.C3473a;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.z */
public final class C3609z {

    /* renamed from: a */
    public static final Charset f12640a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f12641b;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$a */
    public interface C3610a extends C3620j<Boolean> {
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$b */
    public interface C3611b extends C3620j<Double> {
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$c */
    public interface C3612c {
        /* renamed from: a */
        int mo13014a();
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$d */
    public interface C3613d<T extends C3612c> {
        /* renamed from: a */
        T mo15253a(int i);
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$e */
    public interface C3614e {
        /* renamed from: a */
        boolean mo15254a(int i);
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$f */
    public interface C3615f extends C3620j<Float> {
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$g */
    public interface C3616g extends C3620j<Integer> {
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$h */
    public static class C3617h<F, T> extends AbstractList<T> {

        /* renamed from: a */
        public final List<F> f12642a;

        /* renamed from: b */
        public final C3618a<F, T> f12643b;

        /* renamed from: com.fyber.inneractive.sdk.protobuf.z$h$a */
        public interface C3618a<F, T> {
        }

        public C3617h(List<F> list, C3618a<F, T> aVar) {
            this.f12642a = list;
            this.f12643b = aVar;
        }

        public T get(int i) {
            C3618a<F, T> aVar = this.f12643b;
            F f = this.f12642a.get(i);
            ((TokenParametersOuterClass$TokenParameters.C2552a) aVar).getClass();
            T a = TokenParametersOuterClass$TokenParameters.C2562k.m6567a(((Integer) f).intValue());
            if (a == null) {
                return TokenParametersOuterClass$TokenParameters.C2562k.UNRECOGNIZED;
            }
            return a;
        }

        public int size() {
            return this.f12642a.size();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$i */
    public interface C3619i extends C3620j<Long> {
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$j */
    public interface C3620j<E> extends List<E>, RandomAccess {
        /* renamed from: b */
        C3620j<E> mo14808b(int i);

        /* renamed from: b */
        void mo14790b();

        /* renamed from: d */
        boolean mo14792d();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f12641b = bArr;
        ByteBuffer.wrap(bArr);
        C3529j.m9024a(bArr, 0, 0, false);
    }

    /* renamed from: a */
    public static int m9635a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m9636a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    public static <T> T m9638a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static Object m9637a(Object obj, Object obj2) {
        C3564q0 q0Var = (C3564q0) obj2;
        C3473a.C3474a aVar = (C3473a.C3474a) ((C3564q0) obj).toBuilder();
        aVar.getClass();
        GeneratedMessageLite.C3465a aVar2 = (GeneratedMessageLite.C3465a) aVar;
        if (aVar2.f12364a.getClass().isInstance(q0Var)) {
            aVar2.mo14761c();
            aVar2.mo14759a(aVar2.f12365b, (GeneratedMessageLite) ((C3473a) q0Var));
            return aVar2.mo14760b();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
