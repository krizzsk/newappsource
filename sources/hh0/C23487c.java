package hh0;

import ag0.C20988d;
import cf0.C21136j;
import com.appboy.models.InAppMessageBase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C23825c;
import kotlin.collections.C23826d;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C24126b;
import lh0.C24289p;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import p389bl.C13637c;
import p584jl.C17885a;
import rf0.C24805g;
import rf0.C24806h;
import sg0.C24872b;
import sg0.C24876c;
import ug0.C25069e;
import xg0.C25260c;
import zf0.C25430b;
import zf0.C25432c;
import zf0.C25435d0;
import zf0.C25437e;
import zf0.C25452k0;
import zf0.C25485t;
import zg0.C25492a;
import zg0.C25493b;
import zg0.C25494c;
import zg0.C25495d;
import zg0.C25496e;
import zg0.C25498g;
import zg0.C25499h;
import zg0.C25500i;
import zg0.C25501j;
import zg0.C25503k;
import zg0.C25504l;
import zg0.C25507o;
import zg0.C25511p;
import zg0.C25513r;
import zg0.C25514s;
import zg0.C25515t;
import zg0.C25516u;
import zg0.C25517v;
import zg0.C25518w;

/* renamed from: hh0.c */
public final class C23487c {

    /* renamed from: a */
    public final C25485t f59303a;

    /* renamed from: b */
    public final NotFoundClasses f59304b;

    /* renamed from: hh0.c$a */
    public /* synthetic */ class C23488a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f59305a;

        static {
            int[] iArr = new int[ProtoBuf$Annotation.Argument.Value.Type.values().length];
            iArr[ProtoBuf$Annotation.Argument.Value.Type.BYTE.ordinal()] = 1;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.CHAR.ordinal()] = 2;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.SHORT.ordinal()] = 3;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.INT.ordinal()] = 4;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.LONG.ordinal()] = 5;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.FLOAT.ordinal()] = 6;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.DOUBLE.ordinal()] = 7;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.BOOLEAN.ordinal()] = 8;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.STRING.ordinal()] = 9;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.CLASS.ordinal()] = 10;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.ENUM.ordinal()] = 11;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.ANNOTATION.ordinal()] = 12;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.ARRAY.ordinal()] = 13;
            f59305a = iArr;
        }
    }

    public C23487c(C25485t tVar, NotFoundClasses notFoundClasses) {
        C24362h.m61211f(tVar, "module");
        C24362h.m61211f(notFoundClasses, "notFoundClasses");
        this.f59303a = tVar;
        this.f59304b = notFoundClasses;
    }

    /* renamed from: a */
    public final C20988d mo58599a(ProtoBuf$Annotation protoBuf$Annotation, C24876c cVar) {
        C24362h.m61211f(protoBuf$Annotation, "proto");
        C24362h.m61211f(cVar, "nameResolver");
        C25432c c = FindClassInModuleKt.m58737c(this.f59303a, C17885a.m44421R(cVar, protoBuf$Annotation.mo59610k()), this.f59304b);
        Map U = C23826d.m58530U();
        if (protoBuf$Annotation.mo59607i() != 0 && !C24289p.m60918h(c)) {
            int i = C25260c.f63536a;
            if (C25260c.m63397n(c, ClassKind.ANNOTATION_CLASS)) {
                Collection<C25430b> k = c.mo53511k();
                C24362h.m61210e(k, "annotationClass.constructors");
                C25430b bVar = (C25430b) C23825c.m58492D0(k);
                if (bVar != null) {
                    List<C25452k0> h = bVar.mo53442h();
                    C24362h.m61210e(h, "constructor.valueParameters");
                    int z = C13637c.m34083z(C21136j.m49436X(h, 10));
                    if (z < 16) {
                        z = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(z);
                    for (T next : h) {
                        linkedHashMap.put(((C25452k0) next).getName(), next);
                    }
                    List<ProtoBuf$Annotation.Argument> j = protoBuf$Annotation.mo59609j();
                    C24362h.m61210e(j, "proto.argumentList");
                    ArrayList arrayList = new ArrayList();
                    for (ProtoBuf$Annotation.Argument argument : j) {
                        C24362h.m61210e(argument, "it");
                        C25452k0 k0Var = (C25452k0) linkedHashMap.get(C17885a.m44427X(cVar, argument.mo59614h()));
                        C25498g<?> gVar = null;
                        if (k0Var != null) {
                            C25069e X = C17885a.m44427X(cVar, argument.mo59614h());
                            C24307v type = k0Var.getType();
                            C24362h.m61210e(type, "parameter.type");
                            ProtoBuf$Annotation.Argument.Value i2 = argument.mo59615i();
                            C24362h.m61210e(i2, "proto.value");
                            C25498g<?> c2 = mo58601c(type, i2, cVar);
                            if (mo58600b(c2, type, i2)) {
                                gVar = c2;
                            }
                            if (gVar == null) {
                                StringBuilder k2 = C13555b.m33972k("Unexpected argument value: actual type ");
                                k2.append(i2.mo59621D());
                                k2.append(" != expected type ");
                                k2.append(type);
                                String sb = k2.toString();
                                C24362h.m61211f(sb, InAppMessageBase.MESSAGE);
                                gVar = new C25501j.C25502a(sb);
                            }
                            gVar = new Pair<>(X, gVar);
                        }
                        if (gVar != null) {
                            arrayList.add(gVar);
                        }
                    }
                    U = C23826d.m58536a0(arrayList);
                }
            }
        }
        return new C20988d(c.mo53412q(), U, C25435d0.f63736a);
    }

    /* renamed from: b */
    public final boolean mo58600b(C25498g<?> gVar, C24307v vVar, ProtoBuf$Annotation.Argument.Value value) {
        int i;
        C25432c cVar;
        boolean z;
        ProtoBuf$Annotation.Argument.Value.Type D = value.mo59621D();
        if (D == null) {
            i = -1;
        } else {
            i = C23488a.f59305a[D.ordinal()];
        }
        if (i == 10) {
            C25437e o = vVar.mo60411O0().mo53460o();
            if (o instanceof C25432c) {
                cVar = (C25432c) o;
            } else {
                cVar = null;
            }
            if (cVar == null) {
                return true;
            }
            C25069e eVar = C23867c.f60309e;
            if (C23867c.m58683c(cVar, C23872e.C23873a.f60349O)) {
                return true;
            }
        } else if (i != 13) {
            return C24362h.m61206a(gVar.mo62745a(this.f59303a), vVar);
        } else {
            if (!(gVar instanceof C25493b) || ((List) ((C25493b) gVar).f63774a).size() != value.mo59636v().size()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C24307v g = this.f59303a.mo59460m().mo59384g(vVar);
                C25493b bVar = (C25493b) gVar;
                Collection collection = (Collection) bVar.f63774a;
                C24362h.m61211f(collection, "<this>");
                C24806h hVar = new C24806h(0, collection.size() - 1);
                if ((hVar instanceof Collection) && ((Collection) hVar).isEmpty()) {
                    return true;
                }
                C24805g p = hVar.iterator();
                while (p.f62733d) {
                    int nextInt = p.nextInt();
                    ProtoBuf$Annotation.Argument.Value u = value.mo59635u(nextInt);
                    C24362h.m61210e(u, "value.getArrayElement(i)");
                    if (!mo58600b((C25498g) ((List) bVar.f63774a).get(nextInt), g, u)) {
                    }
                }
                return true;
            }
            throw new IllegalStateException(C24362h.m61216k(gVar, "Deserialized ArrayValue should have the same number of elements as the original array value: ").toString());
        }
        return false;
    }

    /* renamed from: c */
    public final C25498g<?> mo58601c(C24307v vVar, ProtoBuf$Annotation.Argument.Value value, C24876c cVar) {
        int i;
        C25498g<?> gVar;
        C25498g<?> gVar2;
        boolean z;
        C24362h.m61211f(cVar, "nameResolver");
        Boolean c = C24872b.f62881M.mo61346c(value.mo59640z());
        C24362h.m61210e(c, "IS_UNSIGNED.get(value.flags)");
        boolean booleanValue = c.booleanValue();
        ProtoBuf$Annotation.Argument.Value.Type D = value.mo59621D();
        if (D == null) {
            i = -1;
        } else {
            i = C23488a.f59305a[D.ordinal()];
        }
        switch (i) {
            case 1:
                byte B = (byte) ((int) value.mo59619B());
                if (booleanValue) {
                    return new C25515t(B);
                }
                return new C25495d(B);
            case 2:
                gVar = new C25496e((char) ((int) value.mo59619B()));
                break;
            case 3:
                short B2 = (short) ((int) value.mo59619B());
                if (booleanValue) {
                    return new C25518w(B2);
                }
                return new C25513r(B2);
            case 4:
                int B3 = (int) value.mo59619B();
                if (!booleanValue) {
                    gVar = new C25504l(B3);
                    break;
                } else {
                    gVar = new C25516u(B3);
                    break;
                }
            case 5:
                long B4 = value.mo59619B();
                if (booleanValue) {
                    gVar2 = new C25517v(B4);
                } else {
                    gVar2 = new C25511p(B4);
                }
                return gVar2;
            case 6:
                gVar = new C25503k(value.mo59618A());
                break;
            case 7:
                gVar = new C25499h(value.mo59638x());
                break;
            case 8:
                if (value.mo59619B() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                gVar = new C25494c(z);
                break;
            case 9:
                gVar = new C25514s(cVar.getString(value.mo59620C()));
                break;
            case 10:
                gVar = new C25507o(C17885a.m44421R(cVar, value.mo59637w()), value.mo59634t());
                break;
            case 11:
                gVar = new C25500i(C17885a.m44421R(cVar, value.mo59637w()), C17885a.m44427X(cVar, value.mo59639y()));
                break;
            case 12:
                ProtoBuf$Annotation s = value.mo59633s();
                C24362h.m61210e(s, "value.annotation");
                gVar = new C25492a(mo58599a(s, cVar));
                break;
            case 13:
                List<ProtoBuf$Annotation.Argument.Value> v = value.mo59636v();
                C24362h.m61210e(v, "value.arrayElementList");
                ArrayList arrayList = new ArrayList(C21136j.m49436X(v, 10));
                for (ProtoBuf$Annotation.Argument.Value value2 : v) {
                    C24312z f = this.f59303a.mo59460m().mo59383f();
                    C24362h.m61210e(f, "builtIns.anyType");
                    C24362h.m61210e(value2, "it");
                    arrayList.add(mo58601c(f, value2, cVar));
                }
                return new C24126b(arrayList, vVar);
            default:
                StringBuilder k = C13555b.m33972k("Unsupported annotation argument type: ");
                k.append(value.mo59621D());
                k.append(" (expected ");
                k.append(vVar);
                k.append(')');
                throw new IllegalStateException(k.toString().toString());
        }
        return gVar;
    }
}
