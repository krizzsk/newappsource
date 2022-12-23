package kotlin.coroutines.jvm.internal;

import ff0.C23349c;
import kotlin.Metadata;
import mf0.C24360f;
import mf0.C24362h;
import mf0.C24365j;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, mo59060d2 = {"Lkotlin/coroutines/jvm/internal/SuspendLambda;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lmf0/f;", "", "", "toString", "", "arity", "I", "getArity", "()I", "Lff0/c;", "completion", "<init>", "(ILff0/c;)V", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public abstract class SuspendLambda extends ContinuationImpl implements C24360f<Object> {
    private final int arity;

    public SuspendLambda(int i, C23349c<Object> cVar) {
        super(cVar);
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String i = C24365j.f61688a.mo59371i(this);
        C24362h.m61210e(i, "renderLambdaToString(this)");
        return i;
    }
}
