package kotlin;

import java.io.Serializable;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b@\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0001\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b\u0001\u0005\u0001\u0004\u0018\u00010\u0004ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, mo59060d2 = {"Lkotlin/Result;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "value", "Ljava/lang/Object;", "getValue$annotations", "()V", "Failure", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class Result<T> implements Serializable {
    private final Object value;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo59060d2 = {"Lkotlin/Result$Failure;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "exception", "Ljava/lang/Throwable;", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
    public static final class Failure implements Serializable {
        public final Throwable exception;

        public Failure(Throwable th) {
            C24362h.m61211f(th, "exception");
            this.exception = th;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Failure) && C24362h.m61206a(this.exception, ((Failure) obj).exception);
        }

        public final int hashCode() {
            return this.exception.hashCode();
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("Failure(");
            k.append(this.exception);
            k.append(')');
            return k.toString();
        }
    }

    public /* synthetic */ Result(Object obj) {
        this.value = obj;
    }

    /* renamed from: a */
    public static final Throwable m58423a(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).exception;
        }
        return null;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo59073b() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        Object obj2 = this.value;
        if ((obj instanceof Result) && C24362h.m61206a(obj2, ((Result) obj).value)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.value;
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
