package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import kotlin.reflect.KParameter;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import mf0.C24362h;
import sf0.C24854a;
import tf0.C24971g;
import tf0.C24973i;
import uf0.C25032b;

public abstract class KCallableImpl<R> implements C24854a<R>, C24971g {

    /* renamed from: b */
    public final C24973i.C24974a<ArrayList<KParameter>> f60206b = C24973i.m62670c(new KCallableImpl$_parameters$1(this));

    public KCallableImpl() {
        C24973i.m62670c(new KCallableImpl$_annotations$1(this));
        C24973i.m62670c(new KCallableImpl$_returnType$1(this));
        C24973i.m62670c(new KCallableImpl$_typeParameters$1(this));
    }

    /* renamed from: a */
    public final R mo59295a(Object... objArr) {
        try {
            return mo59296b().mo59358a(objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    /* renamed from: b */
    public abstract C25032b<?> mo59296b();

    /* renamed from: c */
    public abstract KDeclarationContainerImpl mo59297c();

    /* renamed from: d */
    public abstract CallableMemberDescriptor mo59298d();

    /* renamed from: e */
    public final boolean mo59299e() {
        return C24362h.m61206a(getName(), "<init>") && mo59297c().mo59301a().isAnnotation();
    }

    /* renamed from: f */
    public abstract boolean mo59300f();
}
