package kotlin.coroutines.jvm.internal;

import bf0.C21050d;
import ff0.C23349c;
import gf0.C23412b;
import gf0.C23413c;
import gf0.C23414d;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import mf0.C24362h;
import p584jl.C17885a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H$ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0007H\u0014J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R!\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, mo59060d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lff0/c;", "", "Lgf0/b;", "Ljava/io/Serializable;", "Lkotlin/Result;", "result", "Lbf0/d;", "resumeWith", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "completion", "create", "value", "", "toString", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lff0/c;", "getCompletion", "()Lff0/c;", "getCallerFrame", "()Lgf0/b;", "callerFrame", "<init>", "(Lff0/c;)V", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public abstract class BaseContinuationImpl implements C23349c<Object>, C23412b, Serializable {
    private final C23349c<Object> completion;

    public BaseContinuationImpl(C23349c<Object> cVar) {
        this.completion = cVar;
    }

    public C23349c<C21050d> create(C23349c<?> cVar) {
        C24362h.m61211f(cVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public C23412b getCallerFrame() {
        C23349c<Object> cVar = this.completion;
        if (cVar instanceof C23412b) {
            return (C23412b) cVar;
        }
        return null;
    }

    public final C23349c<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Integer num;
        int i2;
        C23413c cVar = (C23413c) getClass().getAnnotation(C23413c.class);
        String str2 = null;
        if (cVar == null) {
            return null;
        }
        int v = cVar.mo58558v();
        if (v <= 1) {
            int i3 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj4 = declaredField.get(this);
                if (obj4 instanceof Integer) {
                    num = (Integer) obj4;
                } else {
                    num = null;
                }
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                i = i2 - 1;
            } catch (Exception unused) {
                i = -1;
            }
            if (i >= 0) {
                i3 = cVar.mo58556l()[i];
            }
            C23414d.C23415a aVar = C23414d.f59196b;
            if (aVar == null) {
                try {
                    C23414d.C23415a aVar2 = new C23414d.C23415a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    C23414d.f59196b = aVar2;
                    aVar = aVar2;
                } catch (Exception unused2) {
                    aVar = C23414d.f59195a;
                    C23414d.f59196b = aVar;
                }
            }
            if (aVar != C23414d.f59195a) {
                Method method = aVar.f59197a;
                if (method != null) {
                    obj = method.invoke(getClass(), new Object[0]);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    Method method2 = aVar.f59198b;
                    if (method2 != null) {
                        obj2 = method2.invoke(obj, new Object[0]);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        Method method3 = aVar.f59199c;
                        if (method3 != null) {
                            obj3 = method3.invoke(obj2, new Object[0]);
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof String) {
                            str2 = (String) obj3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = cVar.mo58554c();
            } else {
                str = str2 + '/' + cVar.mo58554c();
            }
            return new StackTraceElement(str, cVar.mo58557m(), cVar.mo58555f(), i3);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + 1 + ", got " + v + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    public final void resumeWith(Object obj) {
        C23349c cVar = this;
        while (true) {
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) cVar;
            C23349c cVar2 = baseContinuationImpl.completion;
            C24362h.m61208c(cVar2);
            try {
                obj = baseContinuationImpl.invokeSuspend(obj);
                if (obj == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = C17885a.m44400G(th);
            }
            baseContinuationImpl.releaseIntercepted();
            if (cVar2 instanceof BaseContinuationImpl) {
                cVar = cVar2;
            } else {
                cVar2.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        k.append(stackTraceElement);
        return k.toString();
    }

    public C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        C24362h.m61211f(cVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
