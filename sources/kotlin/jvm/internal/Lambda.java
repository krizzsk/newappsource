package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.Metadata;
import mf0.C24360f;
import mf0.C24362h;
import mf0.C24365j;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, mo59060d2 = {"Lkotlin/jvm/internal/Lambda;", "R", "Lmf0/f;", "Ljava/io/Serializable;", "", "toString", "", "arity", "I", "getArity", "()I", "<init>", "(I)V", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public abstract class Lambda<R> implements C24360f<R>, Serializable {
    private final int arity;

    public Lambda(int i) {
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String h = C24365j.f61688a.mo59370h(this);
        C24362h.m61210e(h, "renderLambdaToString(this)");
        return h;
    }
}
