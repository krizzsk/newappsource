package mh0;

import ce0.C21100e;
import cf0.C21136j;
import com.appboy.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C23825c;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import lh0.C24256b0;
import lh0.C24257c;
import lh0.C24263e0;
import lh0.C24272i;
import lh0.C24274i0;
import lh0.C24278k0;
import lh0.C24281l0;
import lh0.C24284n;
import lh0.C24285n0;
import lh0.C24289p;
import lh0.C24298r;
import lh0.C24299r0;
import lh0.C24306u0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24361g;
import mf0.C24362h;
import mf0.C24365j;
import oh0.C24612a;
import oh0.C24613b;
import oh0.C24614c;
import oh0.C24615d;
import oh0.C24617f;
import oh0.C24618g;
import oh0.C24619h;
import oh0.C24620i;
import oh0.C24621j;
import oh0.C24622k;
import oh0.C24623l;
import oh0.C24624m;
import oh0.C24627o;
import p358af.C13437d;
import p389bl.C13637c;
import p845um.C19958a;
import ug0.C25066c;
import ug0.C25067d;
import xg0.C25261d;
import zf0.C25432c;
import zf0.C25437e;
import zf0.C25448i0;
import zf0.C25481p;

/* renamed from: mh0.a */
public interface C24373a extends C24623l {

    /* renamed from: mh0.a$a */
    public static final class C24374a {
        /* renamed from: A */
        public static boolean m61259A(C24373a aVar, C24617f fVar, C25066c cVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(fVar, "receiver");
            if (fVar instanceof C24307v) {
                return ((C24307v) fVar).getAnnotations().mo53070b1(cVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + C24365j.m61219a(fVar.getClass())).toString());
        }

        /* renamed from: B */
        public static boolean m61260B(C24373a aVar, C24617f fVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(fVar, "receiver");
            return aVar.mo42712P(aVar.mo42738h0(fVar)) != aVar.mo42712P(aVar.mo42711O(fVar));
        }

        /* renamed from: C */
        public static boolean m61261C(C24373a aVar, C24622k kVar, C24621j jVar) {
            boolean z;
            C24362h.m61211f(aVar, "this");
            if (kVar instanceof C25448i0) {
                if (jVar == null) {
                    z = true;
                } else {
                    z = jVar instanceof C24274i0;
                }
                if (z) {
                    return TypeUtilsKt.m60525j((C25448i0) kVar, (C24274i0) jVar, 4);
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C24365j.m61219a(kVar.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C24365j.m61219a(kVar.getClass())).toString());
        }

        /* renamed from: D */
        public static boolean m61262D(C24373a aVar, C24618g gVar, C24618g gVar2) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(gVar, Constants.APPBOY_PUSH_CONTENT_KEY);
            C24362h.m61211f(gVar2, "b");
            if (!(gVar instanceof C24312z)) {
                StringBuilder o = C13437d.m33709o("ClassicTypeSystemContext couldn't handle: ", gVar, ", ");
                o.append(C24365j.m61219a(gVar.getClass()));
                throw new IllegalArgumentException(o.toString().toString());
            } else if (!(gVar2 instanceof C24312z)) {
                StringBuilder o2 = C13437d.m33709o("ClassicTypeSystemContext couldn't handle: ", gVar2, ", ");
                o2.append(C24365j.m61219a(gVar2.getClass()));
                throw new IllegalArgumentException(o2.toString().toString());
            } else if (((C24312z) gVar).mo60410N0() == ((C24312z) gVar2).mo60410N0()) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: E */
        public static C24306u0 m61263E(C24373a aVar, ArrayList arrayList) {
            C24312z zVar;
            C24362h.m61211f(aVar, "this");
            int size = arrayList.size();
            if (size == 0) {
                throw new IllegalStateException("Expected some types".toString());
            } else if (size == 1) {
                return (C24306u0) C23825c.m58491C0(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(C21136j.m49436X(arrayList, 10));
                Iterator it = arrayList.iterator();
                boolean z = false;
                boolean z2 = false;
                while (it.hasNext()) {
                    C24306u0 u0Var = (C24306u0) it.next();
                    if (z || C13637c.m34082y(u0Var)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (u0Var instanceof C24312z) {
                        zVar = (C24312z) u0Var;
                    } else if (!(u0Var instanceof C24298r)) {
                        throw new NoWhenBranchMatchedException();
                    } else if (C24361g.m61151U(u0Var)) {
                        return u0Var;
                    } else {
                        zVar = ((C24298r) u0Var).f61594c;
                        z2 = true;
                    }
                    arrayList2.add(zVar);
                }
                if (z) {
                    return C24289p.m60914d(C24362h.m61216k(arrayList, "Intersection of error types: "));
                }
                if (!z2) {
                    return TypeIntersector.f61365a.mo60265b(arrayList2);
                }
                ArrayList arrayList3 = new ArrayList(C21136j.m49436X(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(C21100e.m49309G0((C24306u0) it2.next()));
                }
                TypeIntersector typeIntersector = TypeIntersector.f61365a;
                return KotlinTypeFactory.m60474c(typeIntersector.mo60265b(arrayList2), typeIntersector.mo60265b(arrayList3));
            }
        }

        /* renamed from: F */
        public static boolean m61264F(C24373a aVar, C24621j jVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(jVar, "receiver");
            if (jVar instanceof C24274i0) {
                return C23867c.m58679J((C24274i0) jVar, C23872e.C23873a.f60361a);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + C24365j.m61219a(jVar.getClass())).toString());
        }

        /* renamed from: G */
        public static boolean m61265G(C24373a aVar, C24621j jVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(jVar, "receiver");
            if (jVar instanceof C24274i0) {
                return ((C24274i0) jVar).mo53460o() instanceof C25432c;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + C24365j.m61219a(jVar.getClass())).toString());
        }

        /* renamed from: H */
        public static boolean m61266H(C24373a aVar, C24621j jVar) {
            C25432c cVar;
            boolean z;
            C24362h.m61211f(aVar, "this");
            if (jVar instanceof C24274i0) {
                C25437e o = ((C24274i0) jVar).mo53460o();
                if (o instanceof C25432c) {
                    cVar = (C25432c) o;
                } else {
                    cVar = null;
                }
                if (cVar == null) {
                    return false;
                }
                if (cVar.mo53436s() != Modality.FINAL || cVar.mo53513p() == ClassKind.ENUM_CLASS) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z || cVar.mo53513p() == ClassKind.ENUM_ENTRY || cVar.mo53513p() == ClassKind.ANNOTATION_CLASS) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + C24365j.m61219a(jVar.getClass())).toString());
        }

        /* renamed from: I */
        public static boolean m61267I(C24373a aVar, C24621j jVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(jVar, "receiver");
            if (jVar instanceof C24274i0) {
                return ((C24274i0) jVar).mo53461p();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + C24365j.m61219a(jVar.getClass())).toString());
        }

        /* renamed from: J */
        public static boolean m61268J(C24373a aVar, C24618g gVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(gVar, "receiver");
            if (gVar instanceof C24307v) {
                return C13637c.m34082y((C24307v) gVar);
            }
            StringBuilder o = C13437d.m33709o("ClassicTypeSystemContext couldn't handle: ", gVar, ", ");
            o.append(C24365j.m61219a(gVar.getClass()));
            throw new IllegalArgumentException(o.toString().toString());
        }

        /* renamed from: K */
        public static boolean m61269K(C24373a aVar, C24621j jVar) {
            C25432c cVar;
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(jVar, "receiver");
            if (jVar instanceof C24274i0) {
                C25437e o = ((C24274i0) jVar).mo53460o();
                if (o instanceof C25432c) {
                    cVar = (C25432c) o;
                } else {
                    cVar = null;
                }
                if (cVar != null && C25261d.m63407b(cVar)) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + C24365j.m61219a(jVar.getClass())).toString());
        }

        /* renamed from: L */
        public static boolean m61270L(C24373a aVar, C24621j jVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(jVar, "receiver");
            if (jVar instanceof C24274i0) {
                return jVar instanceof IntegerLiteralTypeConstructor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + C24365j.m61219a(jVar.getClass())).toString());
        }

        /* renamed from: M */
        public static boolean m61271M(C24373a aVar, C24621j jVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(jVar, "receiver");
            if (jVar instanceof C24274i0) {
                return jVar instanceof IntersectionTypeConstructor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + C24365j.m61219a(jVar.getClass())).toString());
        }

        /* renamed from: N */
        public static boolean m61272N(C24373a aVar, C24618g gVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(gVar, "receiver");
            if (gVar instanceof C24312z) {
                return ((C24312z) gVar).mo60412P0();
            }
            StringBuilder o = C13437d.m33709o("ClassicTypeSystemContext couldn't handle: ", gVar, ", ");
            o.append(C24365j.m61219a(gVar.getClass()));
            throw new IllegalArgumentException(o.toString().toString());
        }

        /* renamed from: O */
        public static boolean m61273O(C24373a aVar, C24617f fVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(fVar, "receiver");
            return aVar.mo42735g(aVar.mo42748o(fVar)) && !aVar.mo42722Z(fVar);
        }

        /* renamed from: P */
        public static boolean m61274P(C24373a aVar, C24621j jVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(jVar, "receiver");
            if (jVar instanceof C24274i0) {
                return C23867c.m58679J((C24274i0) jVar, C23872e.C23873a.f60363b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + C24365j.m61219a(jVar.getClass())).toString());
        }

        /* renamed from: Q */
        public static boolean m61275Q(C24373a aVar, C24617f fVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(fVar, "receiver");
            if (fVar instanceof C24307v) {
                return C24299r0.m60975g((C24307v) fVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + C24365j.m61219a(fVar.getClass())).toString());
        }

        /* renamed from: R */
        public static boolean m61276R(C24373a aVar, C24618g gVar) {
            C24362h.m61211f(aVar, "this");
            if (gVar instanceof C24307v) {
                return C23867c.m58676G((C24307v) gVar);
            }
            StringBuilder o = C13437d.m33709o("ClassicTypeSystemContext couldn't handle: ", gVar, ", ");
            o.append(C24365j.m61219a(gVar.getClass()));
            throw new IllegalArgumentException(o.toString().toString());
        }

        /* renamed from: S */
        public static boolean m61277S(C24373a aVar, C24613b bVar) {
            C24362h.m61211f(aVar, "this");
            if (bVar instanceof C24381f) {
                return ((C24381f) bVar).f61722h;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + C24365j.m61219a(bVar.getClass())).toString());
        }

        /* renamed from: T */
        public static boolean m61278T(C24373a aVar, C24620i iVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(iVar, "receiver");
            if (iVar instanceof C24281l0) {
                return ((C24281l0) iVar).mo60240a();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C24365j.m61219a(iVar.getClass())).toString());
        }

        /* renamed from: U */
        public static boolean m61279U(C24373a aVar, C24618g gVar) {
            boolean z;
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(gVar, "receiver");
            if (gVar instanceof C24312z) {
                if (!(gVar instanceof C24257c)) {
                    if (!(gVar instanceof C24272i) || !(((C24272i) gVar).f61566c instanceof C24257c)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            StringBuilder o = C13437d.m33709o("ClassicTypeSystemContext couldn't handle: ", gVar, ", ");
            o.append(C24365j.m61219a(gVar.getClass()));
            throw new IllegalArgumentException(o.toString().toString());
        }

        /* renamed from: V */
        public static boolean m61280V(C24373a aVar, C24618g gVar) {
            boolean z;
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(gVar, "receiver");
            if (gVar instanceof C24312z) {
                if (!(gVar instanceof C24263e0)) {
                    if (!(gVar instanceof C24272i) || !(((C24272i) gVar).f61566c instanceof C24263e0)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            StringBuilder o = C13437d.m33709o("ClassicTypeSystemContext couldn't handle: ", gVar, ", ");
            o.append(C24365j.m61219a(gVar.getClass()));
            throw new IllegalArgumentException(o.toString().toString());
        }

        /* renamed from: W */
        public static boolean m61281W(C24373a aVar, C24621j jVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(jVar, "receiver");
            if (jVar instanceof C24274i0) {
                C25437e o = ((C24274i0) jVar).mo53460o();
                if (o != null && C23867c.m58680K(o)) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + C24365j.m61219a(jVar.getClass())).toString());
        }

        /* renamed from: X */
        public static C24312z m61282X(C24373a aVar, C24615d dVar) {
            C24362h.m61211f(aVar, "this");
            if (dVar instanceof C24298r) {
                return ((C24298r) dVar).f61594c;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + C24365j.m61219a(dVar.getClass())).toString());
        }

        /* renamed from: Y */
        public static C24618g m61283Y(C24373a aVar, C24617f fVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(fVar, "receiver");
            C24298r E = aVar.mo42701E(fVar);
            if (E != null) {
                return aVar.mo42725b(E);
            }
            C24312z e = aVar.mo42731e(fVar);
            C24362h.m61208c(e);
            return e;
        }

        /* renamed from: Z */
        public static C24306u0 m61284Z(C24373a aVar, C24613b bVar) {
            C24362h.m61211f(aVar, "this");
            if (bVar instanceof C24381f) {
                return ((C24381f) bVar).f61719e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + C24365j.m61219a(bVar.getClass())).toString());
        }

        /* renamed from: a */
        public static boolean m61285a(C24373a aVar, C24621j jVar, C24621j jVar2) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(jVar, "c1");
            C24362h.m61211f(jVar2, "c2");
            if (!(jVar instanceof C24274i0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + C24365j.m61219a(jVar.getClass())).toString());
            } else if (jVar2 instanceof C24274i0) {
                return C24362h.m61206a(jVar, jVar2);
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar2 + ", " + C24365j.m61219a(jVar2.getClass())).toString());
            }
        }

        /* renamed from: a0 */
        public static C24306u0 m61286a0(C24373a aVar, C24617f fVar) {
            C24362h.m61211f(aVar, "this");
            if (fVar instanceof C24306u0) {
                return C19958a.m47436k((C24306u0) fVar, false);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + C24365j.m61219a(fVar.getClass())).toString());
        }

        /* renamed from: b */
        public static int m61287b(C24373a aVar, C24617f fVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(fVar, "receiver");
            if (fVar instanceof C24307v) {
                return ((C24307v) fVar).mo60410N0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + C24365j.m61219a(fVar.getClass())).toString());
        }

        /* renamed from: b0 */
        public static C24312z m61288b0(C24373a aVar, C24614c cVar) {
            C24362h.m61211f(aVar, "this");
            if (cVar instanceof C24272i) {
                return ((C24272i) cVar).f61566c;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + cVar + ", " + C24365j.m61219a(cVar.getClass())).toString());
        }

        /* renamed from: c */
        public static C24619h m61289c(C24373a aVar, C24618g gVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(gVar, "receiver");
            if (gVar instanceof C24312z) {
                return (C24619h) gVar;
            }
            StringBuilder o = C13437d.m33709o("ClassicTypeSystemContext couldn't handle: ", gVar, ", ");
            o.append(C24365j.m61219a(gVar.getClass()));
            throw new IllegalArgumentException(o.toString().toString());
        }

        /* renamed from: c0 */
        public static int m61290c0(C24373a aVar, C24621j jVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(jVar, "receiver");
            if (jVar instanceof C24274i0) {
                return ((C24274i0) jVar).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + C24365j.m61219a(jVar.getClass())).toString());
        }

        /* renamed from: d */
        public static C24613b m61291d(C24373a aVar, C24618g gVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(gVar, "receiver");
            if (!(gVar instanceof C24312z)) {
                StringBuilder o = C13437d.m33709o("ClassicTypeSystemContext couldn't handle: ", gVar, ", ");
                o.append(C24365j.m61219a(gVar.getClass()));
                throw new IllegalArgumentException(o.toString().toString());
            } else if (gVar instanceof C24256b0) {
                return aVar.mo42729d(((C24256b0) gVar).f61543c);
            } else {
                if (gVar instanceof C24381f) {
                    return (C24381f) gVar;
                }
                return null;
            }
        }

        /* renamed from: d0 */
        public static Set m61292d0(C24373a aVar, C24618g gVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(gVar, "receiver");
            C24274i0 f = aVar.mo42733f(gVar);
            if (f instanceof IntegerLiteralTypeConstructor) {
                return ((IntegerLiteralTypeConstructor) f).f61201c;
            }
            StringBuilder o = C13437d.m33709o("ClassicTypeSystemContext couldn't handle: ", gVar, ", ");
            o.append(C24365j.m61219a(gVar.getClass()));
            throw new IllegalArgumentException(o.toString().toString());
        }

        /* renamed from: e */
        public static C24272i m61293e(C24373a aVar, C24618g gVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(gVar, "receiver");
            if (!(gVar instanceof C24312z)) {
                StringBuilder o = C13437d.m33709o("ClassicTypeSystemContext couldn't handle: ", gVar, ", ");
                o.append(C24365j.m61219a(gVar.getClass()));
                throw new IllegalArgumentException(o.toString().toString());
            } else if (gVar instanceof C24272i) {
                return (C24272i) gVar;
            } else {
                return null;
            }
        }

        /* renamed from: e0 */
        public static C24281l0 m61294e0(C24373a aVar, C24612a aVar2) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(aVar2, "receiver");
            if (aVar2 instanceof NewCapturedTypeConstructor) {
                return ((NewCapturedTypeConstructor) aVar2).f61360a;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + aVar2 + ", " + C24365j.m61219a(aVar2.getClass())).toString());
        }

        /* renamed from: f */
        public static C24284n m61295f(C24373a aVar, C24615d dVar) {
            C24362h.m61211f(aVar, "this");
            if (!(dVar instanceof C24298r)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + C24365j.m61219a(dVar.getClass())).toString());
            } else if (dVar instanceof C24284n) {
                return (C24284n) dVar;
            } else {
                return null;
            }
        }

        /* renamed from: f0 */
        public static int m61296f0(C24373a aVar, C24619h hVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(hVar, "receiver");
            if (hVar instanceof C24618g) {
                return aVar.mo42728c0((C24617f) hVar);
            }
            if (hVar instanceof ArgumentList) {
                return ((ArgumentList) hVar).size();
            }
            throw new IllegalStateException(("unknown type argument list type: " + hVar + ", " + C24365j.m61219a(hVar.getClass())).toString());
        }

        /* renamed from: g */
        public static C24298r m61297g(C24373a aVar, C24617f fVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(fVar, "receiver");
            if (fVar instanceof C24307v) {
                C24306u0 R0 = ((C24307v) fVar).mo60450R0();
                if (R0 instanceof C24298r) {
                    return (C24298r) R0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + C24365j.m61219a(fVar.getClass())).toString());
        }

        /* renamed from: g0 */
        public static C24375b m61298g0(C24373a aVar, C24618g gVar) {
            C24362h.m61211f(aVar, "this");
            if (gVar instanceof C24312z) {
                return new C24375b(aVar, TypeSubstitutor.m60494e(C24278k0.f61571b.mo60437a((C24307v) gVar)));
            }
            StringBuilder o = C13437d.m33709o("ClassicTypeSystemContext couldn't handle: ", gVar, ", ");
            o.append(C24365j.m61219a(gVar.getClass()));
            throw new IllegalArgumentException(o.toString().toString());
        }

        /* renamed from: h */
        public static C24312z m61299h(C24373a aVar, C24617f fVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(fVar, "receiver");
            if (fVar instanceof C24307v) {
                C24306u0 R0 = ((C24307v) fVar).mo60450R0();
                if (R0 instanceof C24312z) {
                    return (C24312z) R0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + C24365j.m61219a(fVar.getClass())).toString());
        }

        /* renamed from: h0 */
        public static Collection<C24617f> m61300h0(C24373a aVar, C24621j jVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(jVar, "receiver");
            if (jVar instanceof C24274i0) {
                Collection<C24307v> n = ((C24274i0) jVar).mo53459n();
                C24362h.m61210e(n, "this.supertypes");
                return n;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + C24365j.m61219a(jVar.getClass())).toString());
        }

        /* renamed from: i */
        public static C24285n0 m61301i(C24373a aVar, C24617f fVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(fVar, "receiver");
            if (fVar instanceof C24307v) {
                return TypeUtilsKt.m60516a((C24307v) fVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + C24365j.m61219a(fVar.getClass())).toString());
        }

        /* renamed from: i0 */
        public static NewCapturedTypeConstructor m61302i0(C24373a aVar, C24613b bVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(bVar, "receiver");
            if (bVar instanceof C24381f) {
                return ((C24381f) bVar).f61718d;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + C24365j.m61219a(bVar.getClass())).toString());
        }

        /* JADX WARNING: Removed duplicated region for block: B:48:0x0180  */
        /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static lh0.C24312z m61303j(mh0.C24373a r21, oh0.C24618g r22, kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r23) {
            /*
                r0 = r22
                java.lang.String r1 = "this"
                r2 = r21
                mf0.C24362h.m61211f(r2, r1)
                java.lang.String r1 = "status"
                r9 = r23
                mf0.C24362h.m61211f(r9, r1)
                boolean r1 = r0 instanceof lh0.C24312z
                if (r1 == 0) goto L_0x0191
                lh0.z r0 = (lh0.C24312z) r0
                java.util.List r1 = r0.mo60410N0()
                int r1 = r1.size()
                lh0.i0 r2 = r0.mo60411O0()
                java.util.List r2 = r2.getParameters()
                int r2 = r2.size()
                r10 = 0
                if (r1 == r2) goto L_0x002e
                goto L_0x005f
            L_0x002e:
                java.util.List r1 = r0.mo60410N0()
                boolean r2 = r1 instanceof java.util.Collection
                r3 = 1
                r11 = 0
                if (r2 == 0) goto L_0x003f
                boolean r2 = r1.isEmpty()
                if (r2 == 0) goto L_0x003f
                goto L_0x005d
            L_0x003f:
                java.util.Iterator r2 = r1.iterator()
            L_0x0043:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x005d
                java.lang.Object r4 = r2.next()
                lh0.l0 r4 = (lh0.C24281l0) r4
                kotlin.reflect.jvm.internal.impl.types.Variance r4 = r4.mo60241b()
                kotlin.reflect.jvm.internal.impl.types.Variance r5 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
                if (r4 != r5) goto L_0x0059
                r4 = 1
                goto L_0x005a
            L_0x0059:
                r4 = 0
            L_0x005a:
                if (r4 != 0) goto L_0x0043
                r3 = 0
            L_0x005d:
                if (r3 == 0) goto L_0x0062
            L_0x005f:
                r12 = r10
                goto L_0x017d
            L_0x0062:
                lh0.i0 r2 = r0.mo60411O0()
                java.util.List r2 = r2.getParameters()
                java.lang.String r3 = "type.constructor.parameters"
                mf0.C24362h.m61210e(r2, r3)
                java.util.ArrayList r2 = kotlin.collections.C23825c.m58505Q0(r1, r2)
                java.util.ArrayList r12 = new java.util.ArrayList
                r3 = 10
                int r3 = cf0.C21136j.m49436X(r2, r3)
                r12.<init>(r3)
                java.util.Iterator r13 = r2.iterator()
            L_0x0082:
                boolean r2 = r13.hasNext()
                if (r2 == 0) goto L_0x00e5
                java.lang.Object r2 = r13.next()
                kotlin.Pair r2 = (kotlin.Pair) r2
                java.lang.Object r3 = r2.mo59066a()
                r15 = r3
                lh0.l0 r15 = (lh0.C24281l0) r15
                java.lang.Object r2 = r2.mo59067b()
                zf0.i0 r2 = (zf0.C25448i0) r2
                kotlin.reflect.jvm.internal.impl.types.Variance r3 = r15.mo60241b()
                kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
                if (r3 != r4) goto L_0x00a4
                goto L_0x00e1
            L_0x00a4:
                boolean r3 = r15.mo60240a()
                if (r3 != 0) goto L_0x00bc
                kotlin.reflect.jvm.internal.impl.types.Variance r3 = r15.mo60241b()
                kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
                if (r3 != r4) goto L_0x00bc
                lh0.v r3 = r15.getType()
                lh0.u0 r3 = r3.mo60450R0()
                r5 = r3
                goto L_0x00bd
            L_0x00bc:
                r5 = r10
            L_0x00bd:
                mh0.f r20 = new mh0.f
                java.lang.String r3 = "parameter"
                mf0.C24362h.m61210e(r2, r3)
                kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor r4 = new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor
                r6 = 0
                r17 = 0
                r19 = 6
                r16 = 0
                r14 = r4
                r18 = r2
                r14.<init>(r15, r16, r17, r18, r19)
                r7 = 0
                r8 = 56
                r2 = r20
                r3 = r23
                r2.<init>((kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus) r3, (kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor) r4, (lh0.C24306u0) r5, (ag0.C20989e) r6, (boolean) r7, (int) r8)
                lh0.n0 r15 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.m60516a(r20)
            L_0x00e1:
                r12.add(r15)
                goto L_0x0082
            L_0x00e5:
                lh0.k0$a r2 = lh0.C24278k0.f61571b
                lh0.i0 r3 = r0.mo60411O0()
                lh0.o0 r2 = r2.mo60438b(r3, r12)
                kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r2 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.m60494e(r2)
                int r3 = r1.size()
            L_0x00f7:
                if (r11 >= r3) goto L_0x017d
                int r4 = r11 + 1
                java.lang.Object r5 = r1.get(r11)
                lh0.l0 r5 = (lh0.C24281l0) r5
                java.lang.Object r6 = r12.get(r11)
                lh0.l0 r6 = (lh0.C24281l0) r6
                kotlin.reflect.jvm.internal.impl.types.Variance r7 = r5.mo60241b()
                kotlin.reflect.jvm.internal.impl.types.Variance r8 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
                if (r7 != r8) goto L_0x0110
                goto L_0x017a
            L_0x0110:
                lh0.i0 r7 = r0.mo60411O0()
                java.util.List r7 = r7.getParameters()
                java.lang.Object r7 = r7.get(r11)
                zf0.i0 r7 = (zf0.C25448i0) r7
                java.util.List r7 = r7.getUpperBounds()
                java.lang.String r8 = "type.constructor.parameters[index].upperBounds"
                mf0.C24362h.m61210e(r7, r8)
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
            L_0x0130:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x0150
                java.lang.Object r9 = r7.next()
                lh0.v r9 = (lh0.C24307v) r9
                kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator$a r11 = kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator.C24163a.f61359b
                kotlin.reflect.jvm.internal.impl.types.Variance r13 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
                lh0.v r9 = r2.mo60250i(r9, r13)
                lh0.u0 r9 = r9.mo60450R0()
                lh0.u0 r9 = r11.mo58949d(r9)
                r8.add(r9)
                goto L_0x0130
            L_0x0150:
                boolean r7 = r5.mo60240a()
                if (r7 != 0) goto L_0x016f
                kotlin.reflect.jvm.internal.impl.types.Variance r7 = r5.mo60241b()
                kotlin.reflect.jvm.internal.impl.types.Variance r9 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
                if (r7 != r9) goto L_0x016f
                kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator$a r7 = kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator.C24163a.f61359b
                lh0.v r5 = r5.getType()
                lh0.u0 r5 = r5.mo60450R0()
                lh0.u0 r5 = r7.mo58949d(r5)
                r8.add(r5)
            L_0x016f:
                lh0.v r5 = r6.getType()
                mh0.f r5 = (mh0.C24381f) r5
                kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor r5 = r5.f61718d
                r5.mo60259a(r8)
            L_0x017a:
                r11 = r4
                goto L_0x00f7
            L_0x017d:
                if (r12 != 0) goto L_0x0180
                goto L_0x0190
            L_0x0180:
                ag0.e r1 = r0.getAnnotations()
                lh0.i0 r2 = r0.mo60411O0()
                boolean r0 = r0.mo60412P0()
                lh0.z r10 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m60477f(r1, r2, r12, r0, r10)
            L_0x0190:
                return r10
            L_0x0191:
                java.lang.String r1 = "ClassicTypeSystemContext couldn't handle: "
                java.lang.String r2 = ", "
                java.lang.StringBuilder r1 = p358af.C13437d.m33709o(r1, r0, r2)
                java.lang.Class r0 = r22.getClass()
                sf0.b r0 = mf0.C24365j.m61219a(r0)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: mh0.C24373a.C24374a.m61303j(mh0.a, oh0.g, kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus):lh0.z");
        }

        /* renamed from: j0 */
        public static C24274i0 m61304j0(C24373a aVar, C24618g gVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(gVar, "receiver");
            if (gVar instanceof C24312z) {
                return ((C24312z) gVar).mo60411O0();
            }
            StringBuilder o = C13437d.m33709o("ClassicTypeSystemContext couldn't handle: ", gVar, ", ");
            o.append(C24365j.m61219a(gVar.getClass()));
            throw new IllegalArgumentException(o.toString().toString());
        }

        /* renamed from: k */
        public static CaptureStatus m61305k(C24373a aVar, C24613b bVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(bVar, "receiver");
            if (bVar instanceof C24381f) {
                return ((C24381f) bVar).f61717c;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + C24365j.m61219a(bVar.getClass())).toString());
        }

        /* renamed from: k0 */
        public static C24312z m61306k0(C24373a aVar, C24615d dVar) {
            C24362h.m61211f(aVar, "this");
            if (dVar instanceof C24298r) {
                return ((C24298r) dVar).f61595d;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + C24365j.m61219a(dVar.getClass())).toString());
        }

        /* renamed from: l */
        public static C24306u0 m61307l(C24373a aVar, C24618g gVar, C24618g gVar2) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(gVar, "lowerBound");
            C24362h.m61211f(gVar2, "upperBound");
            if (!(gVar instanceof C24312z)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + aVar + ", " + C24365j.m61219a(aVar.getClass())).toString());
            } else if (gVar2 instanceof C24312z) {
                return KotlinTypeFactory.m60474c((C24312z) gVar, (C24312z) gVar2);
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + aVar + ", " + C24365j.m61219a(aVar.getClass())).toString());
            }
        }

        /* renamed from: l0 */
        public static C24618g m61308l0(C24373a aVar, C24617f fVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(fVar, "receiver");
            C24298r E = aVar.mo42701E(fVar);
            if (E != null) {
                return aVar.mo42727c(E);
            }
            C24312z e = aVar.mo42731e(fVar);
            C24362h.m61208c(e);
            return e;
        }

        /* renamed from: m */
        public static C24620i m61309m(C24373a aVar, C24619h hVar, int i) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(hVar, "receiver");
            if (hVar instanceof C24618g) {
                return aVar.mo42706J((C24617f) hVar, i);
            }
            if (hVar instanceof ArgumentList) {
                Object obj = ((ArgumentList) hVar).get(i);
                C24362h.m61210e(obj, "get(index)");
                return (C24620i) obj;
            }
            throw new IllegalStateException(("unknown type argument list type: " + hVar + ", " + C24365j.m61219a(hVar.getClass())).toString());
        }

        /* renamed from: m0 */
        public static C24312z m61310m0(C24373a aVar, C24618g gVar, boolean z) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(gVar, "receiver");
            if (gVar instanceof C24312z) {
                return ((C24312z) gVar).mo59559S0(z);
            }
            StringBuilder o = C13437d.m33709o("ClassicTypeSystemContext couldn't handle: ", gVar, ", ");
            o.append(C24365j.m61219a(gVar.getClass()));
            throw new IllegalArgumentException(o.toString().toString());
        }

        /* renamed from: n */
        public static C24620i m61311n(C24373a aVar, C24617f fVar, int i) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(fVar, "receiver");
            if (fVar instanceof C24307v) {
                return ((C24307v) fVar).mo60410N0().get(i);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + C24365j.m61219a(fVar.getClass())).toString());
        }

        /* renamed from: n0 */
        public static C24617f m61312n0(C24373a aVar, C24617f fVar) {
            C24362h.m61211f(aVar, "this");
            if (fVar instanceof C24618g) {
                return aVar.mo42723a((C24618g) fVar, true);
            }
            if (fVar instanceof C24615d) {
                C24615d dVar = (C24615d) fVar;
                return aVar.mo42726b0(aVar.mo42723a(aVar.mo42725b(dVar), true), aVar.mo42723a(aVar.mo42727c(dVar), true));
            }
            throw new IllegalStateException("sealed".toString());
        }

        /* renamed from: o */
        public static C24620i m61313o(C24373a aVar, C24618g gVar, int i) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(gVar, "receiver");
            boolean z = false;
            if (i >= 0 && i < aVar.mo42728c0(gVar)) {
                z = true;
            }
            if (z) {
                return aVar.mo42706J(gVar, i);
            }
            return null;
        }

        /* renamed from: p */
        public static C25067d m61314p(C24373a aVar, C24621j jVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(jVar, "receiver");
            if (jVar instanceof C24274i0) {
                C25437e o = ((C24274i0) jVar).mo53460o();
                if (o != null) {
                    return DescriptorUtilsKt.m60287h((C25432c) o);
                }
                throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + C24365j.m61219a(jVar.getClass())).toString());
        }

        /* renamed from: q */
        public static C24622k m61315q(C24373a aVar, C24621j jVar, int i) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(jVar, "receiver");
            if (jVar instanceof C24274i0) {
                C25448i0 i0Var = ((C24274i0) jVar).getParameters().get(i);
                C24362h.m61210e(i0Var, "this.parameters[index]");
                return i0Var;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + C24365j.m61219a(jVar.getClass())).toString());
        }

        /* renamed from: r */
        public static PrimitiveType m61316r(C24373a aVar, C24621j jVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(jVar, "receiver");
            if (jVar instanceof C24274i0) {
                C25437e o = ((C24274i0) jVar).mo53460o();
                if (o != null) {
                    return C23867c.m58684s((C25432c) o);
                }
                throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + C24365j.m61219a(jVar.getClass())).toString());
        }

        /* renamed from: s */
        public static PrimitiveType m61317s(C24373a aVar, C24621j jVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(jVar, "receiver");
            if (jVar instanceof C24274i0) {
                C25437e o = ((C24274i0) jVar).mo53460o();
                if (o != null) {
                    return C23867c.m58685u((C25432c) o);
                }
                throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + C24365j.m61219a(jVar.getClass())).toString());
        }

        /* renamed from: t */
        public static C24307v m61318t(C24373a aVar, C24622k kVar) {
            C24362h.m61211f(aVar, "this");
            if (kVar instanceof C25448i0) {
                return TypeUtilsKt.m60523h((C25448i0) kVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C24365j.m61219a(kVar.getClass())).toString());
        }

        /* renamed from: u */
        public static C24307v m61319u(C24373a aVar, C24617f fVar) {
            C24312z zVar;
            C25481p<C24312z> v;
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(fVar, "receiver");
            if (fVar instanceof C24307v) {
                C24307v vVar = (C24307v) fVar;
                int i = C25261d.f63537a;
                C25437e o = vVar.mo60411O0().mo53460o();
                if (!(o instanceof C25432c)) {
                    o = null;
                }
                C25432c cVar = (C25432c) o;
                if (cVar == null || (v = cVar.mo53518v()) == null) {
                    zVar = null;
                } else {
                    zVar = (C24312z) v.f63769b;
                }
                if (zVar == null) {
                    return null;
                }
                return TypeSubstitutor.m60493d(vVar).mo60251k(zVar, Variance.INVARIANT);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + C24365j.m61219a(fVar.getClass())).toString());
        }

        /* renamed from: v */
        public static C24306u0 m61320v(C24373a aVar, C24620i iVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(iVar, "receiver");
            if (iVar instanceof C24281l0) {
                return ((C24281l0) iVar).getType().mo60450R0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C24365j.m61219a(iVar.getClass())).toString());
        }

        /* renamed from: w */
        public static C25448i0 m61321w(C24373a aVar, C24627o oVar) {
            C24362h.m61211f(aVar, "this");
            if (oVar instanceof C24385i) {
                return ((C24385i) oVar).mo60532a();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + oVar + ", " + C24365j.m61219a(oVar.getClass())).toString());
        }

        /* renamed from: x */
        public static C25448i0 m61322x(C24373a aVar, C24621j jVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(jVar, "receiver");
            if (jVar instanceof C24274i0) {
                C25437e o = ((C24274i0) jVar).mo53460o();
                if (o instanceof C25448i0) {
                    return (C25448i0) o;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + C24365j.m61219a(jVar.getClass())).toString());
        }

        /* renamed from: y */
        public static TypeVariance m61323y(C24373a aVar, C24620i iVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(iVar, "receiver");
            if (iVar instanceof C24281l0) {
                Variance b = ((C24281l0) iVar).mo60241b();
                C24362h.m61210e(b, "this.projectionKind");
                return C24624m.m61889a(b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C24365j.m61219a(iVar.getClass())).toString());
        }

        /* renamed from: z */
        public static TypeVariance m61324z(C24373a aVar, C24622k kVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(kVar, "receiver");
            if (kVar instanceof C25448i0) {
                Variance l = ((C25448i0) kVar).mo53482l();
                C24362h.m61210e(l, "this.variance");
                return C24624m.m61889a(l);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C24365j.m61219a(kVar.getClass())).toString());
        }
    }

    /* renamed from: a */
    C24312z mo42723a(C24618g gVar, boolean z);

    /* renamed from: b */
    C24312z mo42725b(C24615d dVar);

    /* renamed from: b0 */
    C24306u0 mo42726b0(C24618g gVar, C24618g gVar2);

    /* renamed from: c */
    C24312z mo42727c(C24615d dVar);

    /* renamed from: d */
    C24613b mo42729d(C24618g gVar);

    /* renamed from: e */
    C24312z mo42731e(C24617f fVar);

    /* renamed from: f */
    C24274i0 mo42733f(C24618g gVar);
}
