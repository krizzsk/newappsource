package kotlin.reflect.jvm.internal;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.jvm.C23834a;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.pcollections.C24174a;
import lh0.C24307v;
import mf0.C24360f;
import mf0.C24362h;
import mf0.C24366k;
import sf0.C24855b;
import sf0.C24857d;
import sf0.C24858e;
import sf0.C24859f;
import sf0.C24861g;
import sf0.C24862h;
import sf0.C24864i;
import tf0.C24968d;
import tf0.C24979k;
import zf0.C25452k0;

/* renamed from: kotlin.reflect.jvm.internal.d */
public class C23862d extends C24366k {
    /* renamed from: j */
    public static KDeclarationContainerImpl m58658j(CallableReference callableReference) {
        C24857d owner = callableReference.getOwner();
        if (owner instanceof KDeclarationContainerImpl) {
            return (KDeclarationContainerImpl) owner;
        }
        return C23853a.f60285c;
    }

    /* renamed from: a */
    public final C24858e mo59363a(FunctionReference functionReference) {
        KDeclarationContainerImpl j = m58658j(functionReference);
        String name = functionReference.getName();
        String signature = functionReference.getSignature();
        Object boundReceiver = functionReference.getBoundReceiver();
        C24362h.m61211f(j, "container");
        C24362h.m61211f(name, "name");
        C24362h.m61211f(signature, InAppPurchaseMetaData.KEY_SIGNATURE);
        return new KFunctionImpl(j, name, signature, (C23900c) null, boundReceiver);
    }

    /* renamed from: b */
    public final C24855b mo59364b(Class cls) {
        Class<T> cls2;
        C24174a<String, Object> aVar = C24968d.f63107a;
        C24362h.m61211f(cls, "jClass");
        String name = cls.getName();
        Object a = C24968d.f63107a.mo60280a(name);
        Class<T> cls3 = null;
        if (a instanceof WeakReference) {
            KClassImpl kClassImpl = (KClassImpl) ((WeakReference) a).get();
            if (kClassImpl != null) {
                cls3 = kClassImpl.f60209c;
            }
            if (C24362h.m61206a(cls3, cls)) {
                return kClassImpl;
            }
        } else if (a != null) {
            WeakReference[] weakReferenceArr = (WeakReference[]) a;
            int length = weakReferenceArr.length;
            int i = 0;
            while (i < length) {
                WeakReference weakReference = weakReferenceArr[i];
                i++;
                KClassImpl kClassImpl2 = (KClassImpl) weakReference.get();
                if (kClassImpl2 == null) {
                    cls2 = null;
                } else {
                    cls2 = kClassImpl2.f60209c;
                }
                if (C24362h.m61206a(cls2, cls)) {
                    return kClassImpl2;
                }
            }
            int length2 = ((Object[]) a).length;
            WeakReference[] weakReferenceArr2 = new WeakReference[(length2 + 1)];
            System.arraycopy(a, 0, weakReferenceArr2, 0, length2);
            KClassImpl kClassImpl3 = new KClassImpl(cls);
            weakReferenceArr2[length2] = new WeakReference(kClassImpl3);
            C24968d.f63107a = C24968d.f63107a.mo60281b(name, weakReferenceArr2);
            return kClassImpl3;
        }
        KClassImpl kClassImpl4 = new KClassImpl(cls);
        C24968d.f63107a = C24968d.f63107a.mo60281b(name, new WeakReference(kClassImpl4));
        return kClassImpl4;
    }

    /* renamed from: c */
    public final C24857d mo59365c(Class cls, String str) {
        return new KPackageImpl(cls);
    }

    /* renamed from: d */
    public final C24859f mo59366d(MutablePropertyReference0 mutablePropertyReference0) {
        return new KMutableProperty0Impl(m58658j(mutablePropertyReference0), mutablePropertyReference0.getName(), mutablePropertyReference0.getSignature(), mutablePropertyReference0.getBoundReceiver());
    }

    /* renamed from: e */
    public final C24861g mo59367e(MutablePropertyReference1 mutablePropertyReference1) {
        return new KMutableProperty1Impl(m58658j(mutablePropertyReference1), mutablePropertyReference1.getName(), mutablePropertyReference1.getSignature(), mutablePropertyReference1.getBoundReceiver());
    }

    /* renamed from: f */
    public final C24862h mo59368f(PropertyReference0 propertyReference0) {
        return new KProperty0Impl(m58658j(propertyReference0), propertyReference0.getName(), propertyReference0.getSignature(), propertyReference0.getBoundReceiver());
    }

    /* renamed from: g */
    public final C24864i mo59369g(PropertyReference1 propertyReference1) {
        return new KProperty1Impl(m58658j(propertyReference1), propertyReference1.getName(), propertyReference1.getSignature(), propertyReference1.getBoundReceiver());
    }

    /* renamed from: h */
    public final String mo59370h(Lambda lambda) {
        return mo59371i(lambda);
    }

    /* renamed from: i */
    public final String mo59371i(C24360f fVar) {
        KFunctionImpl a;
        KFunctionImpl a2 = C23834a.m58564a(fVar);
        if (a2 == null || (a = C24979k.m62674a(a2)) == null) {
            return super.mo59371i(fVar);
        }
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f60280a;
        C23900c h = a.mo59298d();
        StringBuilder sb = new StringBuilder();
        ReflectionObjectRenderer.m58641a(sb, h);
        List<C25452k0> h2 = h.mo53442h();
        C24362h.m61210e(h2, "invoke.valueParameters");
        C23825c.m58518o0(h2, sb, ", ", "(", ")", ReflectionObjectRenderer$renderLambda$1$1.f60283f, 48);
        sb.append(" -> ");
        C24307v i = h.mo53443i();
        C24362h.m61208c(i);
        sb.append(ReflectionObjectRenderer.m58644d(i));
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
