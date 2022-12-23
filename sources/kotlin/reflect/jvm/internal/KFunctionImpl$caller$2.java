package kotlin.reflect.jvm.internal;

import cf0.C21136j;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import lf0.C24225a;
import mf0.C24362h;
import p389bl.C13637c;
import tf0.C24978j;
import tf0.C24979k;
import tg0.C24985d;
import uf0.C25032b;
import uf0.C25034c;
import ug0.C25065b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Luf0/b;", "kotlin.jvm.PlatformType", "invoke", "()Luf0/b;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class KFunctionImpl$caller$2 extends Lambda implements C24225a<C25032b<? extends Member>> {
    public final /* synthetic */ KFunctionImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KFunctionImpl$caller$2(KFunctionImpl kFunctionImpl) {
        super(0);
        this.this$0 = kFunctionImpl;
    }

    public final Object invoke() {
        Object obj;
        C25034c cVar;
        C25034c fVar;
        C25034c cVar2;
        C25065b bVar = C24978j.f63115a;
        JvmFunctionSignature c = C24978j.m62673c(this.this$0.mo59298d());
        if (c instanceof JvmFunctionSignature.C23837b) {
            if (this.this$0.mo59299e()) {
                Class<?> a = this.this$0.f60230c.mo59301a();
                ArrayList<KParameter> invoke = this.this$0.f60206b.invoke();
                C24362h.m61210e(invoke, "_parameters()");
                List<KParameter> list = invoke;
                ArrayList arrayList = new ArrayList(C21136j.m49436X(list, 10));
                for (KParameter name : list) {
                    String name2 = name.getName();
                    C24362h.m61208c(name2);
                    arrayList.add(name2);
                }
                return new AnnotationConstructorCaller(a, arrayList, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.KOTLIN);
            }
            KDeclarationContainerImpl kDeclarationContainerImpl = this.this$0.f60230c;
            String str = ((JvmFunctionSignature.C23837b) c).f60200a.f63126b;
            kDeclarationContainerImpl.getClass();
            C24362h.m61211f(str, "desc");
            obj = KDeclarationContainerImpl.m58590p(kDeclarationContainerImpl.mo59301a(), kDeclarationContainerImpl.mo59320m(str));
        } else if (c instanceof JvmFunctionSignature.C23838c) {
            KDeclarationContainerImpl kDeclarationContainerImpl2 = this.this$0.f60230c;
            C24985d.C24987b bVar2 = ((JvmFunctionSignature.C23838c) c).f60202a;
            obj = kDeclarationContainerImpl2.mo59317e(bVar2.f63125a, bVar2.f63126b);
        } else if (c instanceof JvmFunctionSignature.C23836a) {
            obj = ((JvmFunctionSignature.C23836a) c).f60199a;
        } else if (c instanceof JvmFunctionSignature.JavaConstructor) {
            obj = ((JvmFunctionSignature.JavaConstructor) c).f60198a;
        } else if (c instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor) {
            List<Method> list2 = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) c).f60197a;
            Class<?> a2 = this.this$0.f60230c.mo59301a();
            ArrayList arrayList2 = new ArrayList(C21136j.m49436X(list2, 10));
            for (Method name3 : list2) {
                arrayList2.add(name3.getName());
            }
            return new AnnotationConstructorCaller(a2, arrayList2, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.JAVA, list2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (obj instanceof Constructor) {
            KFunctionImpl kFunctionImpl = this.this$0;
            cVar = KFunctionImpl.m58602g(kFunctionImpl, (Constructor) obj, kFunctionImpl.mo59298d());
        } else if (obj instanceof Method) {
            Method method = (Method) obj;
            if (!Modifier.isStatic(method.getModifiers())) {
                KFunctionImpl kFunctionImpl2 = this.this$0;
                if (kFunctionImpl2.mo59300f()) {
                    cVar2 = new C25034c.C25051g.C25052a(C13637c.m34072l(kFunctionImpl2.f60232e, kFunctionImpl2.mo59298d()), method);
                } else {
                    fVar = new C25034c.C25051g.C25055d(method);
                    cVar = fVar;
                }
            } else {
                if (this.this$0.mo59298d().getAnnotations().mo53071c(C24979k.f63116a) == null) {
                    KFunctionImpl kFunctionImpl3 = this.this$0;
                    if (kFunctionImpl3.mo59300f()) {
                        cVar2 = new C25034c.C25051g.C25054c(C13637c.m34072l(kFunctionImpl3.f60232e, kFunctionImpl3.mo59298d()), method);
                    } else {
                        fVar = new C25034c.C25051g.C25057f(method);
                    }
                } else if (this.this$0.mo59300f()) {
                    fVar = new C25034c.C25051g.C25053b(method);
                } else {
                    fVar = new C25034c.C25051g.C25056e(method);
                }
                cVar = fVar;
            }
            cVar = cVar2;
        } else {
            StringBuilder k = C13555b.m33972k("Could not compute caller for function: ");
            k.append(this.this$0.mo59298d());
            k.append(" (member = ");
            k.append(obj);
            k.append(')');
            throw new KotlinReflectionInternalError(k.toString());
        }
        return C13637c.m34075r(cVar, this.this$0.mo59298d(), false);
    }
}
