package hh0;

import ag0.C20986c;
import cf0.C21136j;
import gh0.C23420a;
import hh0.C23509r;
import ih0.C23603a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.C24090h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import lh0.C24307v;
import mf0.C24362h;
import p584jl.C17885a;
import sg0.C24876c;
import zf0.C25485t;
import zg0.C25498g;

/* renamed from: hh0.b */
public final class C23485b implements C23484a<C20986c, C25498g<?>> {

    /* renamed from: a */
    public final C23420a f59300a;

    /* renamed from: b */
    public final C23487c f59301b;

    /* renamed from: hh0.b$a */
    public /* synthetic */ class C23486a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f59302a;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 1;
            iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 2;
            iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 3;
            f59302a = iArr;
        }
    }

    public C23485b(C25485t tVar, NotFoundClasses notFoundClasses, C23603a aVar) {
        C24362h.m61211f(tVar, "module");
        C24362h.m61211f(aVar, "protocol");
        this.f59300a = aVar;
        this.f59301b = new C23487c(tVar, notFoundClasses);
    }

    /* renamed from: a */
    public final List<C20986c> mo58589a(C23509r rVar, C24090h hVar, AnnotatedCallableKind annotatedCallableKind) {
        Iterable<ProtoBuf$Annotation> iterable;
        C24362h.m61211f(hVar, "proto");
        C24362h.m61211f(annotatedCallableKind, "kind");
        if (hVar instanceof ProtoBuf$Constructor) {
            iterable = (List) ((ProtoBuf$Constructor) hVar).mo59990g(this.f59300a.f59202b);
        } else if (hVar instanceof ProtoBuf$Function) {
            iterable = (List) ((ProtoBuf$Function) hVar).mo59990g(this.f59300a.f59204d);
        } else if (hVar instanceof ProtoBuf$Property) {
            int i = C23486a.f59302a[annotatedCallableKind.ordinal()];
            if (i == 1) {
                iterable = (List) ((ProtoBuf$Property) hVar).mo59990g(this.f59300a.f59205e);
            } else if (i == 2) {
                iterable = (List) ((ProtoBuf$Property) hVar).mo59990g(this.f59300a.f59206f);
            } else if (i == 3) {
                iterable = (List) ((ProtoBuf$Property) hVar).mo59990g(this.f59300a.f59207g);
            } else {
                throw new IllegalStateException("Unsupported callable kind with property proto".toString());
            }
        } else {
            throw new IllegalStateException(C24362h.m61216k(hVar, "Unknown message: ").toString());
        }
        if (iterable == null) {
            iterable = EmptyList.f60173b;
        }
        ArrayList arrayList = new ArrayList(C21136j.m49436X(iterable, 10));
        for (ProtoBuf$Annotation a : iterable) {
            arrayList.add(this.f59301b.mo58599a(a, rVar.f59352a));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final ArrayList mo58590b(ProtoBuf$Type protoBuf$Type, C24876c cVar) {
        C24362h.m61211f(protoBuf$Type, "proto");
        C24362h.m61211f(cVar, "nameResolver");
        Iterable<ProtoBuf$Annotation> iterable = (List) protoBuf$Type.mo59990g(this.f59300a.f59211k);
        if (iterable == null) {
            iterable = EmptyList.f60173b;
        }
        ArrayList arrayList = new ArrayList(C21136j.m49436X(iterable, 10));
        for (ProtoBuf$Annotation a : iterable) {
            arrayList.add(this.f59301b.mo58599a(a, cVar));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final ArrayList mo58591c(C23509r.C23510a aVar) {
        C24362h.m61211f(aVar, "container");
        Iterable<ProtoBuf$Annotation> iterable = (List) aVar.f59355d.mo59990g(this.f59300a.f59203c);
        if (iterable == null) {
            iterable = EmptyList.f60173b;
        }
        ArrayList arrayList = new ArrayList(C21136j.m49436X(iterable, 10));
        for (ProtoBuf$Annotation a : iterable) {
            arrayList.add(this.f59301b.mo58599a(a, aVar.f59352a));
        }
        return arrayList;
    }

    /* renamed from: d */
    public final Object mo58592d(C23509r rVar, ProtoBuf$Property protoBuf$Property, C24307v vVar) {
        C24362h.m61211f(protoBuf$Property, "proto");
        ProtoBuf$Annotation.Argument.Value value = (ProtoBuf$Annotation.Argument.Value) C17885a.m44423T(protoBuf$Property, this.f59300a.f59209i);
        if (value == null) {
            return null;
        }
        return this.f59301b.mo58601c(vVar, value, rVar.f59352a);
    }

    /* renamed from: e */
    public final List<C20986c> mo58593e(C23509r rVar, C24090h hVar, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        C24362h.m61211f(rVar, "container");
        C24362h.m61211f(hVar, "callableProto");
        C24362h.m61211f(annotatedCallableKind, "kind");
        C24362h.m61211f(protoBuf$ValueParameter, "proto");
        Iterable<ProtoBuf$Annotation> iterable = (List) protoBuf$ValueParameter.mo59990g(this.f59300a.f59210j);
        if (iterable == null) {
            iterable = EmptyList.f60173b;
        }
        ArrayList arrayList = new ArrayList(C21136j.m49436X(iterable, 10));
        for (ProtoBuf$Annotation a : iterable) {
            arrayList.add(this.f59301b.mo58599a(a, rVar.f59352a));
        }
        return arrayList;
    }

    /* renamed from: f */
    public final List<C20986c> mo58594f(C23509r rVar, ProtoBuf$Property protoBuf$Property) {
        C24362h.m61211f(protoBuf$Property, "proto");
        return EmptyList.f60173b;
    }

    /* renamed from: g */
    public final ArrayList mo58595g(ProtoBuf$TypeParameter protoBuf$TypeParameter, C24876c cVar) {
        C24362h.m61211f(protoBuf$TypeParameter, "proto");
        C24362h.m61211f(cVar, "nameResolver");
        Iterable<ProtoBuf$Annotation> iterable = (List) protoBuf$TypeParameter.mo59990g(this.f59300a.f59212l);
        if (iterable == null) {
            iterable = EmptyList.f60173b;
        }
        ArrayList arrayList = new ArrayList(C21136j.m49436X(iterable, 10));
        for (ProtoBuf$Annotation a : iterable) {
            arrayList.add(this.f59301b.mo58599a(a, cVar));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final List<C20986c> mo58596h(C23509r rVar, ProtoBuf$Property protoBuf$Property) {
        C24362h.m61211f(protoBuf$Property, "proto");
        return EmptyList.f60173b;
    }

    /* renamed from: i */
    public final List<C20986c> mo58597i(C23509r rVar, C24090h hVar, AnnotatedCallableKind annotatedCallableKind) {
        C24362h.m61211f(hVar, "proto");
        C24362h.m61211f(annotatedCallableKind, "kind");
        return EmptyList.f60173b;
    }

    /* renamed from: j */
    public final List mo58598j(C23509r.C23510a aVar, ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        C24362h.m61211f(aVar, "container");
        C24362h.m61211f(protoBuf$EnumEntry, "proto");
        Iterable<ProtoBuf$Annotation> iterable = (List) protoBuf$EnumEntry.mo59990g(this.f59300a.f59208h);
        if (iterable == null) {
            iterable = EmptyList.f60173b;
        }
        ArrayList arrayList = new ArrayList(C21136j.m49436X(iterable, 10));
        for (ProtoBuf$Annotation a : iterable) {
            arrayList.add(this.f59301b.mo58599a(a, aVar.f59352a));
        }
        return arrayList;
    }
}
