package kotlin;

import bf0.C21049c;
import java.io.Serializable;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004R\u001a\u0010\u0005\u001a\u00028\u00008\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, mo59060d2 = {"Lkotlin/InitializedLazyImpl;", "T", "Lbf0/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "value", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class InitializedLazyImpl<T> implements C21049c<T>, Serializable {
    private final T value;

    public InitializedLazyImpl(T t) {
        this.value = t;
    }

    public final T getValue() {
        return this.value;
    }

    public final String toString() {
        return String.valueOf(this.value);
    }
}
