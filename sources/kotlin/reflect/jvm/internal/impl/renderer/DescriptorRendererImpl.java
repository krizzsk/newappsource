package kotlin.reflect.jvm.internal.impl.renderer;

import ag0.C20984a;
import ag0.C20986c;
import bf0.C21049c;
import bf0.C21050d;
import cg0.C21167e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C23812a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C23825c;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.C23902d;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.text.C24179b;
import lf0.C24236l;
import lh0.C24253a;
import lh0.C24274i0;
import lh0.C24281l0;
import lh0.C24289p;
import lh0.C24299r0;
import lh0.C24306u0;
import lh0.C24307v;
import mf0.C24362h;
import p172m9.C5720b;
import p358af.C13437d;
import p559ii.C17601a;
import p583jk.C17875h;
import sf0.C24866j;
import ug0.C25066c;
import ug0.C25067d;
import ug0.C25069e;
import ug0.C25071g;
import uh0.C25081h;
import wg0.C25145a;
import wg0.C25149b;
import wg0.C25150c;
import xg0.C25260c;
import zf0.C25429a0;
import zf0.C25430b;
import zf0.C25431b0;
import zf0.C25432c;
import zf0.C25433c0;
import zf0.C25437e;
import zf0.C25440f;
import zf0.C25442g;
import zf0.C25446h0;
import zf0.C25447i;
import zf0.C25448i0;
import zf0.C25449j;
import zf0.C25452k0;
import zf0.C25454l0;
import zf0.C25455m;
import zf0.C25478n;
import zf0.C25480o;
import zf0.C25484s;
import zf0.C25485t;
import zf0.C25486u;
import zf0.C25489x;
import zf0.C25491z;
import zg0.C25492a;
import zg0.C25493b;
import zg0.C25498g;
import zg0.C25507o;

public final class DescriptorRendererImpl extends DescriptorRenderer implements C25149b {

    /* renamed from: e */
    public static final /* synthetic */ int f61120e = 0;

    /* renamed from: c */
    public final DescriptorRendererOptionsImpl f61121c;

    /* renamed from: d */
    public final C21049c f61122d = C23812a.m58432b(new DescriptorRendererImpl$functionTypeAnnotationsRenderer$2(this));

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$a */
    public final class C24105a implements C25447i<C21050d, StringBuilder> {

        /* renamed from: a */
        public final /* synthetic */ DescriptorRendererImpl f61123a;

        /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$a$a */
        public /* synthetic */ class C24106a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f61124a;

            static {
                int[] iArr = new int[PropertyAccessorRenderingPolicy.values().length];
                iArr[PropertyAccessorRenderingPolicy.PRETTY.ordinal()] = 1;
                iArr[PropertyAccessorRenderingPolicy.DEBUG.ordinal()] = 2;
                iArr[PropertyAccessorRenderingPolicy.NONE.ordinal()] = 3;
                f61124a = iArr;
            }
        }

        public C24105a(DescriptorRendererImpl descriptorRendererImpl) {
            C24362h.m61211f(descriptorRendererImpl, "this$0");
            this.f61123a = descriptorRendererImpl;
        }

        /* renamed from: a */
        public final Object mo60150a(C25446h0 h0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            C24362h.m61211f(h0Var, "descriptor");
            C24362h.m61211f(sb, "builder");
            DescriptorRendererImpl descriptorRendererImpl = this.f61123a;
            descriptorRendererImpl.mo60102G(sb, h0Var, (AnnotationUseSiteTarget) null);
            C25478n g = h0Var.mo53429g();
            C24362h.m61210e(g, "typeAlias.visibility");
            descriptorRendererImpl.mo60138i0(g, sb);
            descriptorRendererImpl.mo60109N(h0Var, sb);
            sb.append(descriptorRendererImpl.mo60107L("typealias"));
            sb.append(" ");
            descriptorRendererImpl.mo60113R(h0Var, sb, true);
            List<C25448i0> r = h0Var.mo53514r();
            C24362h.m61210e(r, "typeAlias.declaredTypeParameters");
            descriptorRendererImpl.mo60130e0(r, sb, false);
            descriptorRendererImpl.mo60103H(h0Var, sb);
            sb.append(" = ");
            sb.append(descriptorRendererImpl.mo60091s(h0Var.mo58973x0()));
            return C21050d.f52856a;
        }

        /* renamed from: b */
        public final Object mo60151b(C25486u uVar, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            C24362h.m61211f(uVar, "descriptor");
            C24362h.m61211f(sb, "builder");
            DescriptorRendererImpl descriptorRendererImpl = this.f61123a;
            descriptorRendererImpl.getClass();
            descriptorRendererImpl.mo60117V(uVar.mo53401f(), "package-fragment", sb);
            if (descriptorRendererImpl.mo60139j()) {
                sb.append(" in ");
                descriptorRendererImpl.mo60113R(uVar.mo53399b(), sb, false);
            }
            return C21050d.f52856a;
        }

        /* renamed from: c */
        public final Object mo60152c(C25448i0 i0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            C24362h.m61211f(i0Var, "descriptor");
            C24362h.m61211f(sb, "builder");
            this.f61123a.mo60126c0(i0Var, sb, true);
            return C21050d.f52856a;
        }

        /* renamed from: d */
        public final Object mo60153d(C25429a0 a0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            C24362h.m61211f(a0Var, "descriptor");
            C24362h.m61211f(sb, "builder");
            mo60164o(a0Var, sb, "getter");
            return C21050d.f52856a;
        }

        /* renamed from: e */
        public final Object mo60154e(C25431b0 b0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            C24362h.m61211f(b0Var, "descriptor");
            C24362h.m61211f(sb, "builder");
            mo60164o(b0Var, sb, "setter");
            return C21050d.f52856a;
        }

        /* renamed from: f */
        public final Object mo60155f(C25432c cVar, Object obj) {
            boolean z;
            C25430b H;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            String str;
            StringBuilder sb = (StringBuilder) obj;
            C24362h.m61211f(cVar, "descriptor");
            C24362h.m61211f(sb, "builder");
            DescriptorRendererImpl descriptorRendererImpl = this.f61123a;
            descriptorRendererImpl.getClass();
            if (cVar.mo53513p() == ClassKind.ENUM_ENTRY) {
                z = true;
            } else {
                z = false;
            }
            if (!descriptorRendererImpl.mo60149z()) {
                descriptorRendererImpl.mo60102G(sb, cVar, (AnnotationUseSiteTarget) null);
                if (!z) {
                    C25478n g = cVar.mo53429g();
                    C24362h.m61210e(g, "klass.visibility");
                    descriptorRendererImpl.mo60138i0(g, sb);
                }
                if (!(cVar.mo53513p() == ClassKind.INTERFACE && cVar.mo53436s() == Modality.ABSTRACT) && (!cVar.mo53513p().isSingleton() || cVar.mo53436s() != Modality.FINAL)) {
                    Modality s = cVar.mo53436s();
                    C24362h.m61210e(s, "klass.modality");
                    descriptorRendererImpl.mo60110O(s, sb, DescriptorRendererImpl.m60141D(cVar));
                }
                descriptorRendererImpl.mo60109N(cVar, sb);
                if (!descriptorRendererImpl.mo60148y().contains(DescriptorRendererModifier.INNER) || !cVar.mo53506E()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                descriptorRendererImpl.mo60112Q(sb, z2, "inner");
                if (!descriptorRendererImpl.mo60148y().contains(DescriptorRendererModifier.DATA) || !cVar.mo53520z()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                descriptorRendererImpl.mo60112Q(sb, z3, "data");
                if (!descriptorRendererImpl.mo60148y().contains(DescriptorRendererModifier.INLINE) || !cVar.mo53519w()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                descriptorRendererImpl.mo60112Q(sb, z4, "inline");
                if (!descriptorRendererImpl.mo60148y().contains(DescriptorRendererModifier.VALUE) || !cVar.mo53512o0()) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                descriptorRendererImpl.mo60112Q(sb, z5, "value");
                if (!descriptorRendererImpl.mo60148y().contains(DescriptorRendererModifier.FUN) || !cVar.mo53510h0()) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                descriptorRendererImpl.mo60112Q(sb, z6, "fun");
                if (cVar instanceof C25446h0) {
                    str = "typealias";
                } else if (cVar.mo53509d0()) {
                    str = "companion object";
                } else {
                    switch (DescriptorRenderer.C24100a.C24101a.f61108a[cVar.mo53513p().ordinal()]) {
                        case 1:
                            str = "class";
                            break;
                        case 2:
                            str = "interface";
                            break;
                        case 3:
                            str = "enum class";
                            break;
                        case 4:
                            str = "object";
                            break;
                        case 5:
                            str = "annotation class";
                            break;
                        case 6:
                            str = "enum entry";
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                sb.append(descriptorRendererImpl.mo60107L(str));
            }
            if (!C25260c.m63395l(cVar)) {
                if (!descriptorRendererImpl.mo60149z()) {
                    DescriptorRendererImpl.m60142Z(sb);
                }
                descriptorRendererImpl.mo60113R(cVar, sb, true);
            } else {
                if (((Boolean) descriptorRendererImpl.f61121c.f61136F.mo60854b(DescriptorRendererOptionsImpl.f61130W[30])).booleanValue()) {
                    if (descriptorRendererImpl.mo60149z()) {
                        sb.append("companion object");
                    }
                    DescriptorRendererImpl.m60142Z(sb);
                    C25442g b = cVar.mo53399b();
                    if (b != null) {
                        sb.append("of ");
                        C25069e name = b.getName();
                        C24362h.m61210e(name, "containingDeclaration.name");
                        sb.append(descriptorRendererImpl.mo60090r(name, false));
                    }
                }
                if (descriptorRendererImpl.mo60099C() || !C24362h.m61206a(cVar.getName(), C25071g.f63267b)) {
                    if (!descriptorRendererImpl.mo60149z()) {
                        DescriptorRendererImpl.m60142Z(sb);
                    }
                    C25069e name2 = cVar.getName();
                    C24362h.m61210e(name2, "descriptor.name");
                    sb.append(descriptorRendererImpl.mo60090r(name2, true));
                }
            }
            if (!z) {
                List<C25448i0> r = cVar.mo53514r();
                C24362h.m61210e(r, "klass.declaredTypeParameters");
                descriptorRendererImpl.mo60130e0(r, sb, false);
                descriptorRendererImpl.mo60103H(cVar, sb);
                if (!cVar.mo53513p().isSingleton() && ((Boolean) descriptorRendererImpl.f61121c.f61161i.mo60854b(DescriptorRendererOptionsImpl.f61130W[7])).booleanValue() && (H = cVar.mo53507H()) != null) {
                    sb.append(" ");
                    descriptorRendererImpl.mo60102G(sb, H, (AnnotationUseSiteTarget) null);
                    C25478n g2 = H.mo53429g();
                    C24362h.m61210e(g2, "primaryConstructor.visibility");
                    descriptorRendererImpl.mo60138i0(g2, sb);
                    sb.append(descriptorRendererImpl.mo60107L("constructor"));
                    List<C25452k0> h = H.mo53442h();
                    C24362h.m61210e(h, "primaryConstructor.valueParameters");
                    descriptorRendererImpl.mo60136h0(h, H.mo53431j0(), sb);
                }
                if (!((Boolean) descriptorRendererImpl.f61121c.f61175w.mo60854b(DescriptorRendererOptionsImpl.f61130W[21])).booleanValue() && !C23867c.m58675F(cVar.mo53412q())) {
                    Collection<C24307v> n = cVar.mo53481j().mo53459n();
                    C24362h.m61210e(n, "klass.typeConstructor.supertypes");
                    if (!n.isEmpty() && (n.size() != 1 || !C23867c.m58686y(n.iterator().next()))) {
                        DescriptorRendererImpl.m60142Z(sb);
                        sb.append(": ");
                        C23825c.m58518o0(n, sb, ", ", (String) null, (String) null, new DescriptorRendererImpl$renderSuperTypes$1(descriptorRendererImpl), 60);
                    }
                }
                descriptorRendererImpl.mo60140j0(sb, r);
            }
            return C21050d.f52856a;
        }

        /* renamed from: g */
        public final Object mo60156g(C25452k0 k0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            C24362h.m61211f(k0Var, "descriptor");
            C24362h.m61211f(sb, "builder");
            this.f61123a.mo60134g0(k0Var, true, sb, true);
            return C21050d.f52856a;
        }

        /* renamed from: h */
        public final Object mo60157h(C25485t tVar, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            C24362h.m61211f(tVar, "descriptor");
            C24362h.m61211f(sb, "builder");
            this.f61123a.mo60113R(tVar, sb, true);
            return C21050d.f52856a;
        }

        /* renamed from: i */
        public final Object mo60158i(C25489x xVar, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            C24362h.m61211f(xVar, "descriptor");
            C24362h.m61211f(sb, "builder");
            DescriptorRendererImpl descriptorRendererImpl = this.f61123a;
            descriptorRendererImpl.getClass();
            descriptorRendererImpl.mo60117V(xVar.mo59443f(), "package", sb);
            if (descriptorRendererImpl.mo60139j()) {
                sb.append(" in context of ");
                descriptorRendererImpl.mo60113R(xVar.mo59441G0(), sb, false);
            }
            return C21050d.f52856a;
        }

        /* renamed from: j */
        public final Object mo60159j(C25491z zVar, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            C24362h.m61211f(zVar, "descriptor");
            C24362h.m61211f(sb, "builder");
            DescriptorRendererImpl.m60145u(this.f61123a, zVar, sb);
            return C21050d.f52856a;
        }

        /* renamed from: k */
        public final /* bridge */ /* synthetic */ Object mo60160k(C23900c cVar, Object obj) {
            mo60163n(cVar, (StringBuilder) obj);
            return C21050d.f52856a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0073  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x009b  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00fd  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0120  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0153  */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo60161l(kotlin.reflect.jvm.internal.impl.descriptors.C23899b r19, java.lang.Object r20) {
            /*
                r18 = this;
                r0 = r19
                r1 = r20
                java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
                java.lang.String r2 = "constructorDescriptor"
                mf0.C24362h.m61211f(r0, r2)
                java.lang.String r2 = "builder"
                mf0.C24362h.m61211f(r1, r2)
                r2 = r18
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl r3 = r2.f61123a
                r4 = 0
                r3.mo60102G(r1, r0, r4)
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r4 = r3.f61121c
                wg0.c r4 = r4.f61167o
                sf0.j<java.lang.Object>[] r5 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.f61130W
                r6 = 13
                r6 = r5[r6]
                java.lang.Object r4 = r4.mo60854b(r6)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                r6 = 0
                r7 = 1
                if (r4 != 0) goto L_0x003c
                zf0.c r4 = r19.mo53500g0()
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = r4.mo53436s()
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r8 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED
                if (r4 == r8) goto L_0x004d
            L_0x003c:
                zf0.n r4 = r19.mo53429g()
                java.lang.String r8 = "constructor.visibility"
                mf0.C24362h.m61210e(r4, r8)
                boolean r4 = r3.mo60138i0(r4, r1)
                if (r4 == 0) goto L_0x004d
                r4 = 1
                goto L_0x004e
            L_0x004d:
                r4 = 0
            L_0x004e:
                r3.mo60108M(r0, r1)
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r8 = r3.f61121c
                wg0.c r8 = r8.f61145O
                r9 = 39
                r9 = r5[r9]
                java.lang.Object r8 = r8.mo60854b(r9)
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L_0x0070
                boolean r8 = r19.mo53499f0()
                if (r8 == 0) goto L_0x0070
                if (r4 == 0) goto L_0x006e
                goto L_0x0070
            L_0x006e:
                r4 = 0
                goto L_0x0071
            L_0x0070:
                r4 = 1
            L_0x0071:
                if (r4 == 0) goto L_0x007c
                java.lang.String r8 = "constructor"
                java.lang.String r8 = r3.mo60107L(r8)
                r1.append(r8)
            L_0x007c:
                zf0.f r8 = r19.mo53399b()
                java.lang.String r9 = "constructor.containingDeclaration"
                mf0.C24362h.m61210e(r8, r9)
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r9 = r3.f61121c
                wg0.c r9 = r9.f61178z
                r10 = 24
                r11 = r5[r10]
                java.lang.Object r9 = r9.mo60854b(r11)
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                java.lang.String r11 = "constructor.typeParameters"
                if (r9 == 0) goto L_0x00af
                if (r4 == 0) goto L_0x00a2
                java.lang.String r4 = " "
                r1.append(r4)
            L_0x00a2:
                r3.mo60113R(r8, r1, r7)
                java.util.List r4 = r19.getTypeParameters()
                mf0.C24362h.m61210e(r4, r11)
                r3.mo60130e0(r4, r1, r6)
            L_0x00af:
                java.util.List r4 = r19.mo53442h()
                java.lang.String r9 = "constructor.valueParameters"
                mf0.C24362h.m61210e(r4, r9)
                boolean r9 = r19.mo53431j0()
                r3.mo60136h0(r4, r9, r1)
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r4 = r3.f61121c
                wg0.c r4 = r4.f61169q
                r9 = 15
                r5 = r5[r9]
                java.lang.Object r4 = r4.mo60854b(r5)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L_0x013f
                boolean r4 = r19.mo53499f0()
                if (r4 != 0) goto L_0x013f
                boolean r4 = r8 instanceof zf0.C25432c
                if (r4 == 0) goto L_0x013f
                zf0.c r8 = (zf0.C25432c) r8
                zf0.b r4 = r8.mo53507H()
                if (r4 == 0) goto L_0x013f
                java.util.List r4 = r4.mo53442h()
                java.lang.String r5 = "primaryConstructor.valueParameters"
                mf0.C24362h.m61210e(r4, r5)
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x00f7:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x0119
                java.lang.Object r5 = r4.next()
                r8 = r5
                zf0.k0 r8 = (zf0.C25452k0) r8
                boolean r9 = r8.mo59462F0()
                if (r9 != 0) goto L_0x0112
                lh0.v r8 = r8.mo59467z0()
                if (r8 != 0) goto L_0x0112
                r8 = 1
                goto L_0x0113
            L_0x0112:
                r8 = 0
            L_0x0113:
                if (r8 == 0) goto L_0x00f7
                r12.add(r5)
                goto L_0x00f7
            L_0x0119:
                boolean r4 = r12.isEmpty()
                r4 = r4 ^ r7
                if (r4 == 0) goto L_0x013f
                java.lang.String r4 = " : "
                r1.append(r4)
                java.lang.String r4 = "this"
                java.lang.String r4 = r3.mo60107L(r4)
                r1.append(r4)
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderConstructor$1 r16 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderConstructor$1.f61128f
                r17 = 24
                java.lang.String r13 = ", "
                java.lang.String r14 = "("
                java.lang.String r15 = ")"
                java.lang.String r4 = kotlin.collections.C23825c.m58520q0(r12, r13, r14, r15, r16, r17)
                r1.append(r4)
            L_0x013f:
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r4 = r3.f61121c
                wg0.c r4 = r4.f61178z
                sf0.j<java.lang.Object>[] r5 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.f61130W
                r5 = r5[r10]
                java.lang.Object r4 = r4.mo60854b(r5)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L_0x015d
                java.util.List r0 = r19.getTypeParameters()
                mf0.C24362h.m61210e(r0, r11)
                r3.mo60140j0(r1, r0)
            L_0x015d:
                bf0.d r0 = bf0.C21050d.f52856a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.C24105a.mo60161l(kotlin.reflect.jvm.internal.impl.descriptors.b, java.lang.Object):java.lang.Object");
        }

        /* renamed from: m */
        public final Object mo60162m(C25433c0 c0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            C24362h.m61211f(c0Var, "descriptor");
            C24362h.m61211f(sb, "builder");
            sb.append(c0Var.getName());
            return C21050d.f52856a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:57:0x01ad, code lost:
            if (kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58674E(r1, kotlin.reflect.jvm.internal.impl.builtins.C23872e.C23873a.f60366d) == false) goto L_0x01af;
         */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00bc  */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo60163n(kotlin.reflect.jvm.internal.impl.descriptors.C23900c r10, java.lang.StringBuilder r11) {
            /*
                r9 = this;
                java.lang.String r0 = "descriptor"
                mf0.C24362h.m61211f(r10, r0)
                java.lang.String r0 = "builder"
                mf0.C24362h.m61211f(r11, r0)
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl r0 = r9.f61123a
                boolean r1 = r0.mo60149z()
                r2 = 1
                java.lang.String r3 = "function.typeParameters"
                if (r1 != 0) goto L_0x015f
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r1 = r0.f61121c
                wg0.c r1 = r1.f61159g
                sf0.j<java.lang.Object>[] r4 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.f61130W
                r5 = 5
                r5 = r4[r5]
                java.lang.Object r1 = r1.mo60854b(r5)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L_0x0144
                r1 = 0
                r0.mo60102G(r11, r10, r1)
                zf0.n r1 = r10.mo53429g()
                java.lang.String r5 = "function.visibility"
                mf0.C24362h.m61210e(r1, r5)
                r0.mo60138i0(r1, r11)
                r0.mo60111P(r10, r11)
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r1 = r0.f61121c
                wg0.c r1 = r1.f61148R
                r5 = 42
                r6 = r4[r5]
                java.lang.Object r1 = r1.mo60854b(r6)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L_0x0054
                r0.mo60109N(r10, r11)
            L_0x0054:
                r0.mo60116U(r10, r11)
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r1 = r0.f61121c
                wg0.c r1 = r1.f61148R
                r4 = r4[r5]
                java.lang.Object r1 = r1.mo60854b(r4)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                java.lang.String r4 = "suspend"
                if (r1 == 0) goto L_0x011e
                boolean r1 = r10.mo53435q0()
                java.lang.String r5 = "functionDescriptor.overriddenDescriptors"
                r6 = 38
                r7 = 0
                if (r1 == 0) goto L_0x00b5
                java.util.Collection r1 = r10.mo53440d()
                mf0.C24362h.m61210e(r1, r5)
                boolean r8 = r1.isEmpty()
                if (r8 == 0) goto L_0x0084
                goto L_0x009c
            L_0x0084:
                java.util.Iterator r1 = r1.iterator()
            L_0x0088:
                boolean r8 = r1.hasNext()
                if (r8 == 0) goto L_0x009c
                java.lang.Object r8 = r1.next()
                kotlin.reflect.jvm.internal.impl.descriptors.c r8 = (kotlin.reflect.jvm.internal.impl.descriptors.C23900c) r8
                boolean r8 = r8.mo53435q0()
                if (r8 == 0) goto L_0x0088
                r1 = 0
                goto L_0x009d
            L_0x009c:
                r1 = 1
            L_0x009d:
                if (r1 != 0) goto L_0x00b3
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r1 = r0.f61121c
                wg0.c r1 = r1.f61144N
                sf0.j<java.lang.Object>[] r8 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.f61130W
                r8 = r8[r6]
                java.lang.Object r1 = r1.mo60854b(r8)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L_0x00b5
            L_0x00b3:
                r1 = 1
                goto L_0x00b6
            L_0x00b5:
                r1 = 0
            L_0x00b6:
                boolean r8 = r10.mo53419K0()
                if (r8 == 0) goto L_0x00fa
                java.util.Collection r8 = r10.mo53440d()
                mf0.C24362h.m61210e(r8, r5)
                boolean r5 = r8.isEmpty()
                if (r5 == 0) goto L_0x00ca
                goto L_0x00e2
            L_0x00ca:
                java.util.Iterator r5 = r8.iterator()
            L_0x00ce:
                boolean r8 = r5.hasNext()
                if (r8 == 0) goto L_0x00e2
                java.lang.Object r8 = r5.next()
                kotlin.reflect.jvm.internal.impl.descriptors.c r8 = (kotlin.reflect.jvm.internal.impl.descriptors.C23900c) r8
                boolean r8 = r8.mo53419K0()
                if (r8 == 0) goto L_0x00ce
                r5 = 0
                goto L_0x00e3
            L_0x00e2:
                r5 = 1
            L_0x00e3:
                if (r5 != 0) goto L_0x00f9
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r5 = r0.f61121c
                wg0.c r5 = r5.f61144N
                sf0.j<java.lang.Object>[] r8 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.f61130W
                r6 = r8[r6]
                java.lang.Object r5 = r5.mo60854b(r6)
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L_0x00fa
            L_0x00f9:
                r7 = 1
            L_0x00fa:
                boolean r5 = r10.mo53414G()
                java.lang.String r6 = "tailrec"
                r0.mo60112Q(r11, r5, r6)
                boolean r5 = r10.mo53424V()
                r0.mo60112Q(r11, r5, r4)
                boolean r4 = r10.mo53437w()
                java.lang.String r5 = "inline"
                r0.mo60112Q(r11, r4, r5)
                java.lang.String r4 = "infix"
                r0.mo60112Q(r11, r7, r4)
                java.lang.String r4 = "operator"
                r0.mo60112Q(r11, r1, r4)
                goto L_0x0125
            L_0x011e:
                boolean r1 = r10.mo53424V()
                r0.mo60112Q(r11, r1, r4)
            L_0x0125:
                r0.mo60108M(r10, r11)
                boolean r1 = r0.mo60099C()
                if (r1 == 0) goto L_0x0144
                boolean r1 = r10.mo53415H0()
                if (r1 == 0) goto L_0x0139
                java.lang.String r1 = "/*isHiddenToOvercomeSignatureClash*/ "
                r11.append(r1)
            L_0x0139:
                boolean r1 = r10.mo53418J0()
                if (r1 == 0) goto L_0x0144
                java.lang.String r1 = "/*isHiddenForResolutionEverywhereBesideSupercalls*/ "
                r11.append(r1)
            L_0x0144:
                java.lang.String r1 = "fun"
                java.lang.String r1 = r0.mo60107L(r1)
                r11.append(r1)
                java.lang.String r1 = " "
                r11.append(r1)
                java.util.List r1 = r10.getTypeParameters()
                mf0.C24362h.m61210e(r1, r3)
                r0.mo60130e0(r1, r11, r2)
                r0.mo60119X(r11, r10)
            L_0x015f:
                r0.mo60113R(r10, r11, r2)
                java.util.List r1 = r10.mo53442h()
                java.lang.String r2 = "function.valueParameters"
                mf0.C24362h.m61210e(r1, r2)
                boolean r2 = r10.mo53431j0()
                r0.mo60136h0(r1, r2, r11)
                r0.mo60120Y(r11, r10)
                lh0.v r1 = r10.mo53443i()
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r2 = r0.f61121c
                wg0.c r2 = r2.f61164l
                sf0.j<java.lang.Object>[] r4 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.f61130W
                r5 = 10
                r5 = r4[r5]
                java.lang.Object r2 = r2.mo60854b(r5)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x01c0
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r2 = r0.f61121c
                wg0.c r2 = r2.f61163k
                r5 = 9
                r4 = r4[r5]
                java.lang.Object r2 = r2.mo60854b(r4)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x01af
                if (r1 == 0) goto L_0x01af
                ug0.e r2 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.f60309e
                ug0.d r2 = kotlin.reflect.jvm.internal.impl.builtins.C23872e.C23873a.f60366d
                boolean r2 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58674E(r1, r2)
                if (r2 != 0) goto L_0x01c0
            L_0x01af:
                java.lang.String r2 = ": "
                r11.append(r2)
                if (r1 != 0) goto L_0x01b9
                java.lang.String r1 = "[NULL]"
                goto L_0x01bd
            L_0x01b9:
                java.lang.String r1 = r0.mo60091s(r1)
            L_0x01bd:
                r11.append(r1)
            L_0x01c0:
                java.util.List r10 = r10.getTypeParameters()
                mf0.C24362h.m61210e(r10, r3)
                r0.mo60140j0(r11, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.C24105a.mo60163n(kotlin.reflect.jvm.internal.impl.descriptors.c, java.lang.StringBuilder):void");
        }

        /* renamed from: o */
        public final void mo60164o(C23902d dVar, StringBuilder sb, String str) {
            int i = C24106a.f61124a[((PropertyAccessorRenderingPolicy) this.f61123a.f61121c.f61137G.mo60854b(DescriptorRendererOptionsImpl.f61130W[31])).ordinal()];
            if (i == 1) {
                this.f61123a.mo60109N(dVar, sb);
                sb.append(C24362h.m61216k(" for ", str));
                DescriptorRendererImpl descriptorRendererImpl = this.f61123a;
                C25491z Y = dVar.mo53426Y();
                C24362h.m61210e(Y, "descriptor.correspondingProperty");
                DescriptorRendererImpl.m60145u(descriptorRendererImpl, Y, sb);
            } else if (i == 2) {
                mo60163n(dVar, sb);
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$b */
    public /* synthetic */ class C24107b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f61125a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f61126b;

        static {
            int[] iArr = new int[RenderingFormat.values().length];
            iArr[RenderingFormat.PLAIN.ordinal()] = 1;
            iArr[RenderingFormat.HTML.ordinal()] = 2;
            f61125a = iArr;
            int[] iArr2 = new int[ParameterNameRenderingPolicy.values().length];
            iArr2[ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
            iArr2[ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            iArr2[ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
            f61126b = iArr2;
        }
    }

    public DescriptorRendererImpl(DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        this.f61121c = descriptorRendererOptionsImpl;
    }

    /* renamed from: D */
    public static Modality m60141D(C25484s sVar) {
        C25432c cVar;
        if (!(sVar instanceof C25432c)) {
            C25442g b = sVar.mo53399b();
            if (b instanceof C25432c) {
                cVar = (C25432c) b;
            } else {
                cVar = null;
            }
            if (cVar == null) {
                return Modality.FINAL;
            }
            if (!(sVar instanceof CallableMemberDescriptor)) {
                return Modality.FINAL;
            }
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) sVar;
            Collection<? extends CallableMemberDescriptor> d = callableMemberDescriptor.mo53440d();
            C24362h.m61210e(d, "this.overriddenDescriptors");
            if ((!d.isEmpty()) && cVar.mo53436s() != Modality.FINAL) {
                return Modality.OPEN;
            }
            if (cVar.mo53513p() != ClassKind.INTERFACE || C24362h.m61206a(callableMemberDescriptor.mo53429g(), C25455m.f63740a)) {
                return Modality.FINAL;
            }
            Modality s = callableMemberDescriptor.mo53436s();
            Modality modality = Modality.ABSTRACT;
            if (s == modality) {
                return modality;
            }
            return Modality.OPEN;
        } else if (((C25432c) sVar).mo53513p() == ClassKind.INTERFACE) {
            return Modality.ABSTRACT;
        } else {
            return Modality.FINAL;
        }
    }

    /* renamed from: Z */
    public static void m60142Z(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    /* renamed from: k0 */
    public static String m60143k0(String str, String str2, String str3, String str4, String str5) {
        if (!C25081h.m62835F(str, str2) || !C25081h.m62835F(str3, str4)) {
            return null;
        }
        String substring = str.substring(str2.length());
        C24362h.m61210e(substring, "this as java.lang.String).substring(startIndex)");
        String substring2 = str3.substring(str4.length());
        C24362h.m61210e(substring2, "this as java.lang.String).substring(startIndex)");
        String k = C24362h.m61216k(substring, str5);
        if (C24362h.m61206a(substring, substring2)) {
            return k;
        }
        if (m60146v(substring, substring2)) {
            return C24362h.m61216k("!", k);
        }
        return null;
    }

    /* renamed from: l0 */
    public static boolean m60144l0(C24307v vVar) {
        boolean z;
        if (C5720b.m14069t(vVar)) {
            List<C24281l0> N0 = vVar.mo60410N0();
            if (!(N0 instanceof Collection) || !N0.isEmpty()) {
                Iterator<T> it = N0.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C24281l0) it.next()).mo60240a()) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: u */
    public static final void m60145u(DescriptorRendererImpl descriptorRendererImpl, C25491z zVar, StringBuilder sb) {
        boolean z;
        boolean z2;
        if (!descriptorRendererImpl.mo60149z()) {
            C25150c cVar = descriptorRendererImpl.f61121c.f61159g;
            C24866j<Object>[] jVarArr = DescriptorRendererOptionsImpl.f61130W;
            if (!((Boolean) cVar.mo60854b(jVarArr[5])).booleanValue()) {
                if (descriptorRendererImpl.mo60148y().contains(DescriptorRendererModifier.ANNOTATIONS)) {
                    descriptorRendererImpl.mo60102G(sb, zVar, (AnnotationUseSiteTarget) null);
                    C25480o C0 = zVar.mo53444C0();
                    if (C0 != null) {
                        descriptorRendererImpl.mo60102G(sb, C0, AnnotationUseSiteTarget.FIELD);
                    }
                    C25480o S = zVar.mo53450S();
                    if (S != null) {
                        descriptorRendererImpl.mo60102G(sb, S, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
                    }
                    if (((PropertyAccessorRenderingPolicy) descriptorRendererImpl.f61121c.f61137G.mo60854b(jVarArr[31])) == PropertyAccessorRenderingPolicy.NONE) {
                        C21167e0 getter = zVar.getGetter();
                        if (getter != null) {
                            descriptorRendererImpl.mo60102G(sb, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
                        }
                        C25431b0 setter = zVar.getSetter();
                        if (setter != null) {
                            descriptorRendererImpl.mo60102G(sb, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                            List<C25452k0> h = setter.mo53442h();
                            C24362h.m61210e(h, "setter.valueParameters");
                            C25452k0 k0Var = (C25452k0) C23825c.m58491C0(h);
                            C24362h.m61210e(k0Var, "it");
                            descriptorRendererImpl.mo60102G(sb, k0Var, AnnotationUseSiteTarget.SETTER_PARAMETER);
                        }
                    }
                }
                C25478n g = zVar.mo53429g();
                C24362h.m61210e(g, "property.visibility");
                descriptorRendererImpl.mo60138i0(g, sb);
                if (!descriptorRendererImpl.mo60148y().contains(DescriptorRendererModifier.CONST) || !zVar.mo53451e0()) {
                    z = false;
                } else {
                    z = true;
                }
                descriptorRendererImpl.mo60112Q(sb, z, "const");
                descriptorRendererImpl.mo60109N(zVar, sb);
                descriptorRendererImpl.mo60111P(zVar, sb);
                descriptorRendererImpl.mo60116U(zVar, sb);
                if (!descriptorRendererImpl.mo60148y().contains(DescriptorRendererModifier.LATEINIT) || !zVar.mo53445D0()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                descriptorRendererImpl.mo60112Q(sb, z2, "lateinit");
                descriptorRendererImpl.mo60108M(zVar, sb);
            }
            descriptorRendererImpl.mo60132f0(zVar, sb, false);
            List<C25448i0> typeParameters = zVar.getTypeParameters();
            C24362h.m61210e(typeParameters, "property.typeParameters");
            descriptorRendererImpl.mo60130e0(typeParameters, sb, true);
            descriptorRendererImpl.mo60119X(sb, zVar);
        }
        descriptorRendererImpl.mo60113R(zVar, sb, true);
        sb.append(": ");
        C24307v type = zVar.getType();
        C24362h.m61210e(type, "property.type");
        sb.append(descriptorRendererImpl.mo60091s(type));
        descriptorRendererImpl.mo60120Y(sb, zVar);
        descriptorRendererImpl.mo60106K(zVar, sb);
        List<C25448i0> typeParameters2 = zVar.getTypeParameters();
        C24362h.m61210e(typeParameters2, "property.typeParameters");
        descriptorRendererImpl.mo60140j0(sb, typeParameters2);
    }

    /* renamed from: v */
    public static boolean m60146v(String str, String str2) {
        if (!C24362h.m61206a(str, C25081h.m62833D(str2, "?", "", false)) && (!C25081h.m62836z(str2, "?", false) || !C24362h.m61206a(C24362h.m61216k("?", str), str2))) {
            if (C24362h.m61206a('(' + str + ")?", str2)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public final RenderingFormat mo60097A() {
        return (RenderingFormat) this.f61121c.f61133C.mo60854b(DescriptorRendererOptionsImpl.f61130W[27]);
    }

    /* renamed from: B */
    public final DescriptorRenderer.C24102b mo60098B() {
        return (DescriptorRenderer.C24102b) this.f61121c.f61132B.mo60854b(DescriptorRendererOptionsImpl.f61130W[26]);
    }

    /* renamed from: C */
    public final boolean mo60099C() {
        return ((Boolean) this.f61121c.f61162j.mo60854b(DescriptorRendererOptionsImpl.f61130W[8])).booleanValue();
    }

    /* renamed from: E */
    public final String mo60100E(C25442g gVar) {
        C25442g b;
        String str;
        String str2;
        C24362h.m61211f(gVar, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        gVar.mo53398B0(new C24105a(this), sb);
        C25150c cVar = this.f61121c.f61155c;
        C24866j<Object>[] jVarArr = DescriptorRendererOptionsImpl.f61130W;
        if (((Boolean) cVar.mo60854b(jVarArr[1])).booleanValue() && !(gVar instanceof C25486u) && !(gVar instanceof C25489x) && (b = gVar.mo53399b()) != null && !(b instanceof C25485t)) {
            sb.append(" ");
            int i = C24107b.f61125a[mo60097A().ordinal()];
            if (i == 1) {
                str = "defined in";
            } else if (i == 2) {
                str = "<i>defined in</i>";
            } else {
                throw new NoWhenBranchMatchedException();
            }
            sb.append(str);
            sb.append(" ");
            C25067d g = C25260c.m63390g(b);
            C24362h.m61210e(g, "getFqName(containingDeclaration)");
            if (g.mo61594e()) {
                str2 = "root package";
            } else {
                str2 = mo60089q(g);
            }
            sb.append(str2);
            if (((Boolean) this.f61121c.f61156d.mo60854b(jVarArr[2])).booleanValue() && (b instanceof C25486u) && (gVar instanceof C25449j)) {
                ((C25449j) gVar).mo53400e().mo58414b();
            }
        }
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo60101F(ag0.C20986c r9, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r10) {
        /*
            r8 = this;
            java.lang.String r0 = "annotation"
            mf0.C24362h.m61211f(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 64
            r0.append(r1)
            if (r10 == 0) goto L_0x001e
            java.lang.String r10 = r10.getRenderName()
            java.lang.String r1 = ":"
            java.lang.String r10 = mf0.C24362h.m61216k(r1, r10)
            r0.append(r10)
        L_0x001e:
            lh0.v r10 = r9.getType()
            java.lang.String r1 = r8.mo60091s(r10)
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r1 = r8.f61121c
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy r1 = r1.mo60166p()
            boolean r1 = r1.getIncludeAnnotationArguments()
            if (r1 == 0) goto L_0x017a
            java.util.Map r1 = r9.mo53067g()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r2 = r8.f61121c
            wg0.c r2 = r2.f61138H
            sf0.j<java.lang.Object>[] r3 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.f61130W
            r4 = 32
            r3 = r3[r4]
            java.lang.Object r2 = r2.mo60854b(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 0
            if (r2 == 0) goto L_0x0055
            zf0.c r9 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m60283d(r9)
            goto L_0x0056
        L_0x0055:
            r9 = r3
        L_0x0056:
            r2 = 10
            if (r9 != 0) goto L_0x005b
            goto L_0x00ad
        L_0x005b:
            zf0.b r9 = r9.mo53507H()
            if (r9 != 0) goto L_0x0062
            goto L_0x00ad
        L_0x0062:
            java.util.List r9 = r9.mo53442h()
            java.lang.String r3 = "valueParameters"
            mf0.C24362h.m61210e(r9, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0074:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x008b
            java.lang.Object r4 = r9.next()
            r5 = r4
            zf0.k0 r5 = (zf0.C25452k0) r5
            boolean r5 = r5.mo59462F0()
            if (r5 == 0) goto L_0x0074
            r3.add(r4)
            goto L_0x0074
        L_0x008b:
            java.util.ArrayList r9 = new java.util.ArrayList
            int r4 = cf0.C21136j.m49436X(r3, r2)
            r9.<init>(r4)
            java.util.Iterator r3 = r3.iterator()
        L_0x0098:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00ac
            java.lang.Object r4 = r3.next()
            zf0.k0 r4 = (zf0.C25452k0) r4
            ug0.e r4 = r4.getName()
            r9.add(r4)
            goto L_0x0098
        L_0x00ac:
            r3 = r9
        L_0x00ad:
            if (r3 != 0) goto L_0x00b1
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.f60173b
        L_0x00b1:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r4 = r3.iterator()
        L_0x00ba:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00d8
            java.lang.Object r5 = r4.next()
            r6 = r5
            ug0.e r6 = (ug0.C25069e) r6
            java.lang.String r7 = "it"
            mf0.C24362h.m61210e(r6, r7)
            boolean r6 = r1.containsKey(r6)
            r6 = r6 ^ 1
            if (r6 == 0) goto L_0x00ba
            r9.add(r5)
            goto L_0x00ba
        L_0x00d8:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = cf0.C21136j.m49436X(r9, r2)
            r4.<init>(r5)
            java.util.Iterator r9 = r9.iterator()
        L_0x00e5:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x00ff
            java.lang.Object r5 = r9.next()
            ug0.e r5 = (ug0.C25069e) r5
            java.lang.String r5 = r5.mo61604f()
            java.lang.String r6 = " = ..."
            java.lang.String r5 = mf0.C24362h.m61216k(r6, r5)
            r4.add(r5)
            goto L_0x00e5
        L_0x00ff:
            java.util.Set r9 = r1.entrySet()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = cf0.C21136j.m49436X(r9, r2)
            r1.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
        L_0x0110:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0151
            java.lang.Object r2 = r9.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r5 = r2.getKey()
            ug0.e r5 = (ug0.C25069e) r5
            java.lang.Object r2 = r2.getValue()
            zg0.g r2 = (zg0.C25498g) r2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r5.mo61604f()
            r6.append(r7)
            java.lang.String r7 = " = "
            r6.append(r7)
            boolean r5 = r3.contains(r5)
            if (r5 != 0) goto L_0x0144
            java.lang.String r2 = r8.mo60104I(r2)
            goto L_0x0146
        L_0x0144:
            java.lang.String r2 = "..."
        L_0x0146:
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r1.add(r2)
            goto L_0x0110
        L_0x0151:
            java.util.ArrayList r9 = kotlin.collections.C23825c.m58527x0(r1, r4)
            java.util.List r1 = kotlin.collections.C23825c.m58495G0(r9)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r9 = r8.f61121c
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy r9 = r9.mo60166p()
            boolean r9 = r9.getIncludeEmptyAnnotationArguments()
            if (r9 != 0) goto L_0x016d
            boolean r9 = r1.isEmpty()
            r9 = r9 ^ 1
            if (r9 == 0) goto L_0x017a
        L_0x016d:
            r6 = 0
            r7 = 112(0x70, float:1.57E-43)
            java.lang.String r3 = ", "
            java.lang.String r4 = "("
            java.lang.String r5 = ")"
            r2 = r0
            kotlin.collections.C23825c.m58518o0(r1, r2, r3, r4, r5, r6, r7)
        L_0x017a:
            boolean r9 = r8.mo60099C()
            if (r9 == 0) goto L_0x0197
            boolean r9 = p389bl.C13637c.m34082y(r10)
            if (r9 != 0) goto L_0x0192
            lh0.i0 r9 = r10.mo60411O0()
            zf0.e r9 = r9.mo53460o()
            boolean r9 = r9 instanceof kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.C23889b
            if (r9 == 0) goto L_0x0197
        L_0x0192:
            java.lang.String r9 = " /* annotation class not found */"
            r0.append(r9)
        L_0x0197:
            java.lang.String r9 = r0.toString()
            java.lang.String r10 = "StringBuilder().apply(builderAction).toString()"
            mf0.C24362h.m61210e(r9, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.mo60101F(ag0.c, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget):java.lang.String");
    }

    /* renamed from: G */
    public final void mo60102G(StringBuilder sb, C20984a aVar, AnnotationUseSiteTarget annotationUseSiteTarget) {
        Set<C25066c> set;
        if (mo60148y().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            if (aVar instanceof C24307v) {
                set = mo60137i();
            } else {
                set = (Set) this.f61121c.f61140J.mo60854b(DescriptorRendererOptionsImpl.f61130W[34]);
            }
            C24236l lVar = (C24236l) this.f61121c.f61142L.mo60854b(DescriptorRendererOptionsImpl.f61130W[36]);
            for (C20986c cVar : aVar.getAnnotations()) {
                if (!C23825c.m58507d0(set, cVar.mo53066f()) && !C24362h.m61206a(cVar.mo53066f(), C23872e.C23873a.f60379q)) {
                    if (lVar == null || ((Boolean) lVar.invoke(cVar)).booleanValue()) {
                        sb.append(mo60101F(cVar, annotationUseSiteTarget));
                        if (((Boolean) this.f61121c.f61139I.mo60854b(DescriptorRendererOptionsImpl.f61130W[33])).booleanValue()) {
                            sb.append(10);
                        } else {
                            sb.append(" ");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: H */
    public final void mo60103H(C25440f fVar, StringBuilder sb) {
        List<C25448i0> r = fVar.mo53514r();
        C24362h.m61210e(r, "classifier.declaredTypeParameters");
        List<C25448i0> parameters = fVar.mo53481j().getParameters();
        C24362h.m61210e(parameters, "classifier.typeConstructor.parameters");
        if (mo60099C() && fVar.mo53506E() && parameters.size() > r.size()) {
            sb.append(" /*captured type parameters: ");
            mo60128d0(sb, parameters.subList(r.size(), parameters.size()));
            sb.append("*/");
        }
    }

    /* renamed from: I */
    public final String mo60104I(C25498g<?> gVar) {
        if (gVar instanceof C25493b) {
            return C23825c.m58520q0((Iterable) ((C25493b) gVar).f63774a, ", ", "{", "}", new DescriptorRendererImpl$renderConstant$1(this), 24);
        }
        if (gVar instanceof C25492a) {
            return C24179b.m60573U("@", mo60101F((C20986c) ((C25492a) gVar).f63774a, (AnnotationUseSiteTarget) null));
        }
        if (!(gVar instanceof C25507o)) {
            return gVar.toString();
        }
        C25507o.C25508a aVar = (C25507o.C25508a) ((C25507o) gVar).f63774a;
        if (aVar instanceof C25507o.C25508a.C25509a) {
            return ((C25507o.C25508a.C25509a) aVar).f63778a + "::class";
        } else if (aVar instanceof C25507o.C25508a.C25510b) {
            C25507o.C25508a.C25510b bVar = (C25507o.C25508a.C25510b) aVar;
            String b = bVar.f63779a.f63772a.mo61569b().mo61580b();
            C24362h.m61210e(b, "classValue.classId.asSingleFqName().asString()");
            int i = 0;
            while (i < bVar.f63779a.f63773b) {
                i++;
                b = "kotlin.Array<" + b + '>';
            }
            return C24362h.m61216k("::class", b);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [zf0.e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60105J(java.lang.StringBuilder r5, lh0.C24312z r6) {
        /*
            r4 = this;
            r0 = 0
            r4.mo60102G(r5, r6, r0)
            boolean r1 = r6 instanceof lh0.C24272i
            if (r1 == 0) goto L_0x000c
            r1 = r6
            lh0.i r1 = (lh0.C24272i) r1
            goto L_0x000d
        L_0x000c:
            r1 = r0
        L_0x000d:
            if (r1 != 0) goto L_0x0011
            r1 = r0
            goto L_0x0013
        L_0x0011:
            lh0.z r1 = r1.f61566c
        L_0x0013:
            boolean r2 = p389bl.C13637c.m34082y(r6)
            if (r2 == 0) goto L_0x0078
            boolean r0 = r6 instanceof lh0.C24304t0
            if (r0 == 0) goto L_0x003c
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r0 = r4.f61121c
            wg0.c r0 = r0.f61150T
            sf0.j<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.f61130W
            r2 = 45
            r1 = r1[r2]
            java.lang.Object r0 = r0.mo60854b(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x003c
            r0 = r6
            lh0.t0 r0 = (lh0.C24304t0) r0
            java.lang.String r0 = r0.f61603h
            r5.append(r0)
            goto L_0x006c
        L_0x003c:
            boolean r0 = r6 instanceof lh0.C24286o
            if (r0 == 0) goto L_0x0061
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r0 = r4.f61121c
            wg0.c r0 = r0.f61152V
            sf0.j<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.f61130W
            r2 = 47
            r1 = r1[r2]
            java.lang.Object r0 = r0.mo60854b(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0061
            r0 = r6
            lh0.o r0 = (lh0.C24286o) r0
            java.lang.String r0 = r0.mo60443X0()
            r5.append(r0)
            goto L_0x006c
        L_0x0061:
            lh0.i0 r0 = r6.mo60411O0()
            java.lang.String r0 = r0.toString()
            r5.append(r0)
        L_0x006c:
            java.util.List r0 = r6.mo60410N0()
            java.lang.String r0 = r4.mo60122a0(r0)
            r5.append(r0)
            goto L_0x00c9
        L_0x0078:
            boolean r2 = r6 instanceof lh0.C24263e0
            if (r2 == 0) goto L_0x0089
            r0 = r6
            lh0.e0 r0 = (lh0.C24263e0) r0
            lh0.i0 r0 = r0.f61545c
            java.lang.String r0 = r0.toString()
            r5.append(r0)
            goto L_0x00c9
        L_0x0089:
            boolean r2 = r1 instanceof lh0.C24263e0
            if (r2 == 0) goto L_0x0099
            lh0.e0 r1 = (lh0.C24263e0) r1
            lh0.i0 r0 = r1.f61545c
            java.lang.String r0 = r0.toString()
            r5.append(r0)
            goto L_0x00c9
        L_0x0099:
            lh0.i0 r1 = r6.mo60411O0()
            lh0.i0 r2 = r6.mo60411O0()
            zf0.e r2 = r2.mo53460o()
            boolean r3 = r2 instanceof zf0.C25440f
            if (r3 == 0) goto L_0x00ac
            r0 = r2
            zf0.f r0 = (zf0.C25440f) r0
        L_0x00ac:
            r2 = 0
            ii.a r0 = kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt.m58767a(r6, r0, r2)
            if (r0 != 0) goto L_0x00c6
            java.lang.String r0 = r4.mo60124b0(r1)
            r5.append(r0)
            java.util.List r0 = r6.mo60410N0()
            java.lang.String r0 = r4.mo60122a0(r0)
            r5.append(r0)
            goto L_0x00c9
        L_0x00c6:
            r4.mo60118W(r5, r0)
        L_0x00c9:
            boolean r0 = r6.mo60412P0()
            if (r0 == 0) goto L_0x00d4
            java.lang.String r0 = "?"
            r5.append(r0)
        L_0x00d4:
            boolean r6 = r6 instanceof lh0.C24272i
            if (r6 == 0) goto L_0x00dd
            java.lang.String r6 = " & Any"
            r5.append(r6)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.mo60105J(java.lang.StringBuilder, lh0.z):void");
    }

    /* renamed from: K */
    public final void mo60106K(C25454l0 l0Var, StringBuilder sb) {
        C25498g<?> t0;
        if (((Boolean) this.f61121c.f61173u.mo60854b(DescriptorRendererOptionsImpl.f61130W[19])).booleanValue() && (t0 = l0Var.mo53527t0()) != null) {
            sb.append(" = ");
            sb.append(mo60146w(mo60104I(t0)));
        }
    }

    /* renamed from: L */
    public final String mo60107L(String str) {
        int i = C24107b.f61125a[mo60097A().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        } else if (((Boolean) this.f61121c.f61151U.mo60854b(DescriptorRendererOptionsImpl.f61130W[46])).booleanValue()) {
            return str;
        } else {
            return C13437d.m33706k("<b>", str, "</b>");
        }
    }

    /* renamed from: M */
    public final void mo60108M(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (mo60148y().contains(DescriptorRendererModifier.MEMBER_KIND) && mo60099C() && callableMemberDescriptor.mo53433p() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb.append("/*");
            sb.append(C17875h.m44295V(callableMemberDescriptor.mo53433p().name()));
            sb.append("*/ ");
        }
    }

    /* renamed from: N */
    public final void mo60109N(C25484s sVar, StringBuilder sb) {
        boolean z;
        mo60112Q(sb, sVar.mo53428c0(), "external");
        boolean z2 = true;
        if (!mo60148y().contains(DescriptorRendererModifier.EXPECT) || !sVar.mo53434p0()) {
            z = false;
        } else {
            z = true;
        }
        mo60112Q(sb, z, "expect");
        if (!mo60148y().contains(DescriptorRendererModifier.ACTUAL) || !sVar.mo53427a0()) {
            z2 = false;
        }
        mo60112Q(sb, z2, "actual");
    }

    /* renamed from: O */
    public final void mo60110O(Modality modality, StringBuilder sb, Modality modality2) {
        if (((Boolean) this.f61121c.f61168p.mo60854b(DescriptorRendererOptionsImpl.f61130W[14])).booleanValue() || modality != modality2) {
            mo60112Q(sb, mo60148y().contains(DescriptorRendererModifier.MODALITY), C17875h.m44295V(modality.name()));
        }
    }

    /* renamed from: P */
    public final void mo60111P(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (C25260c.m63403t(callableMemberDescriptor) && callableMemberDescriptor.mo53436s() == Modality.FINAL) {
            return;
        }
        if (((OverrideRenderingPolicy) this.f61121c.f61131A.mo60854b(DescriptorRendererOptionsImpl.f61130W[25])) != OverrideRenderingPolicy.RENDER_OVERRIDE || callableMemberDescriptor.mo53436s() != Modality.OPEN || !(!callableMemberDescriptor.mo53440d().isEmpty())) {
            Modality s = callableMemberDescriptor.mo53436s();
            C24362h.m61210e(s, "callable.modality");
            mo60110O(s, sb, m60141D(callableMemberDescriptor));
        }
    }

    /* renamed from: Q */
    public final void mo60112Q(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(mo60107L(str));
            sb.append(" ");
        }
    }

    /* renamed from: R */
    public final void mo60113R(C25442g gVar, StringBuilder sb, boolean z) {
        C25069e name = gVar.getName();
        C24362h.m61210e(name, "descriptor.name");
        sb.append(mo60090r(name, z));
    }

    /* renamed from: S */
    public final void mo60114S(StringBuilder sb, C24307v vVar) {
        C24253a aVar;
        C24306u0 R0 = vVar.mo60450R0();
        if (R0 instanceof C24253a) {
            aVar = (C24253a) R0;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            C25150c cVar = this.f61121c.f61147Q;
            C24866j<Object>[] jVarArr = DescriptorRendererOptionsImpl.f61130W;
            if (((Boolean) cVar.mo60854b(jVarArr[41])).booleanValue()) {
                mo60115T(sb, aVar.f61536c);
                return;
            }
            mo60115T(sb, aVar.f61537d);
            if (((Boolean) this.f61121c.f61146P.mo60854b(jVarArr[40])).booleanValue()) {
                RenderingFormat A = mo60097A();
                RenderingFormat renderingFormat = RenderingFormat.HTML;
                if (A == renderingFormat) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* = ");
                mo60115T(sb, aVar.f61536c);
                sb.append(" */");
                if (mo60097A() == renderingFormat) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        mo60115T(sb, vVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:81:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0146  */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60115T(java.lang.StringBuilder r13, lh0.C24307v r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof lh0.C24308v0
            if (r0 == 0) goto L_0x0019
            boolean r0 = r12.mo60139j()
            if (r0 == 0) goto L_0x0019
            r0 = r14
            lh0.v0 r0 = (lh0.C24308v0) r0
            boolean r0 = r0.mo60257T0()
            if (r0 != 0) goto L_0x0019
            java.lang.String r14 = "<Not computed yet>"
            r13.append(r14)
            return
        L_0x0019:
            lh0.u0 r14 = r14.mo60450R0()
            boolean r0 = r14 instanceof lh0.C24298r
            if (r0 == 0) goto L_0x002c
            lh0.r r14 = (lh0.C24298r) r14
            java.lang.String r14 = r14.mo59563W0(r12, r12)
            r13.append(r14)
            goto L_0x0205
        L_0x002c:
            boolean r0 = r14 instanceof lh0.C24312z
            if (r0 == 0) goto L_0x0205
            lh0.z r14 = (lh0.C24312z) r14
            lh0.o r0 = lh0.C24299r0.f61597b
            boolean r0 = mf0.C24362h.m61206a(r14, r0)
            java.lang.String r1 = "???"
            if (r0 != 0) goto L_0x0202
            r0 = 0
            r2 = 1
            if (r14 == 0) goto L_0x004c
            lh0.i0 r3 = r14.mo60411O0()
            lh0.o r4 = lh0.C24299r0.f61596a
            lh0.i0 r4 = r4.f61579c
            if (r3 != r4) goto L_0x004c
            r3 = 1
            goto L_0x004d
        L_0x004c:
            r3 = 0
        L_0x004d:
            if (r3 == 0) goto L_0x0051
            goto L_0x0202
        L_0x0051:
            if (r14 == 0) goto L_0x005d
            lh0.i0 r3 = r14.mo60411O0()
            boolean r3 = r3 instanceof lh0.C24289p.C24294e
            if (r3 == 0) goto L_0x005d
            r3 = 1
            goto L_0x005e
        L_0x005d:
            r3 = 0
        L_0x005e:
            r4 = 0
            if (r3 == 0) goto L_0x0089
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r0 = r12.f61121c
            wg0.c r0 = r0.f61172t
            sf0.j<java.lang.Object>[] r3 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.f61130W
            r5 = 18
            r3 = r3[r5]
            java.lang.Object r0 = r0.mo60854b(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x007c
            r13.append(r1)
            goto L_0x0205
        L_0x007c:
            lh0.i0 r13 = r14.mo60411O0()
            lh0.p$e r13 = (lh0.C24289p.C24294e) r13
            r13.getClass()
            lh0.C24289p.C24294e.m60949a(r2)
            throw r4
        L_0x0089:
            boolean r1 = p389bl.C13637c.m34082y(r14)
            if (r1 == 0) goto L_0x0094
            r12.mo60105J(r13, r14)
            goto L_0x0205
        L_0x0094:
            boolean r1 = m60144l0(r14)
            if (r1 == 0) goto L_0x01fe
            int r1 = r13.length()
            bf0.c r3 = r12.f61122d
            java.lang.Object r3 = r3.getValue()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl r3 = (kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl) r3
            r3.mo60102G(r13, r14, r4)
            int r3 = r13.length()
            if (r3 == r1) goto L_0x00b1
            r3 = 1
            goto L_0x00b2
        L_0x00b1:
            r3 = 0
        L_0x00b2:
            boolean r5 = p172m9.C5720b.m14073x(r14)
            boolean r6 = r14.mo60412P0()
            lh0.v r7 = p172m9.C5720b.m14064o(r14)
            if (r6 != 0) goto L_0x00c7
            if (r3 == 0) goto L_0x00c5
            if (r7 == 0) goto L_0x00c5
            goto L_0x00c7
        L_0x00c5:
            r8 = 0
            goto L_0x00c8
        L_0x00c7:
            r8 = 1
        L_0x00c8:
            java.lang.String r9 = "("
            if (r8 == 0) goto L_0x010e
            if (r5 == 0) goto L_0x00d4
            r3 = 40
            r13.insert(r1, r3)
            goto L_0x010e
        L_0x00d4:
            if (r3 == 0) goto L_0x010b
            int r1 = r13.length()
            if (r1 != 0) goto L_0x00de
            r1 = 1
            goto L_0x00df
        L_0x00de:
            r1 = 0
        L_0x00df:
            if (r1 != 0) goto L_0x0103
            int r1 = kotlin.text.C24179b.m60561I(r13)
            char r1 = r13.charAt(r1)
            mf0.C24361g.m61157a0(r1)
            int r1 = kotlin.text.C24179b.m60561I(r13)
            int r1 = r1 - r2
            char r1 = r13.charAt(r1)
            r3 = 41
            if (r1 == r3) goto L_0x010b
            int r1 = kotlin.text.C24179b.m60561I(r13)
            java.lang.String r3 = "()"
            r13.insert(r1, r3)
            goto L_0x010b
        L_0x0103:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException
            java.lang.String r14 = "Char sequence is empty."
            r13.<init>(r14)
            throw r13
        L_0x010b:
            r13.append(r9)
        L_0x010e:
            java.lang.String r1 = "suspend"
            r12.mo60112Q(r13, r5, r1)
            java.lang.String r1 = ")"
            if (r7 == 0) goto L_0x014e
            boolean r3 = m60144l0(r7)
            if (r3 == 0) goto L_0x0123
            boolean r3 = r7.mo60412P0()
            if (r3 == 0) goto L_0x0139
        L_0x0123:
            boolean r3 = p172m9.C5720b.m14073x(r7)
            if (r3 != 0) goto L_0x0136
            ag0.e r3 = r7.getAnnotations()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0134
            goto L_0x0136
        L_0x0134:
            r3 = 0
            goto L_0x0137
        L_0x0136:
            r3 = 1
        L_0x0137:
            if (r3 == 0) goto L_0x013b
        L_0x0139:
            r3 = 1
            goto L_0x013c
        L_0x013b:
            r3 = 0
        L_0x013c:
            if (r3 == 0) goto L_0x0141
            r13.append(r9)
        L_0x0141:
            r12.mo60114S(r13, r7)
            if (r3 == 0) goto L_0x0149
            r13.append(r1)
        L_0x0149:
            java.lang.String r3 = "."
            r13.append(r3)
        L_0x014e:
            r13.append(r9)
            java.util.List r3 = p172m9.C5720b.m14065p(r14)
            java.util.Iterator r3 = r3.iterator()
            r5 = 0
        L_0x015a:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x01ab
            int r7 = r5 + 1
            java.lang.Object r9 = r3.next()
            lh0.l0 r9 = (lh0.C24281l0) r9
            if (r5 <= 0) goto L_0x016f
            java.lang.String r5 = ", "
            r13.append(r5)
        L_0x016f:
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r5 = r12.f61121c
            wg0.c r5 = r5.f61149S
            sf0.j<java.lang.Object>[] r10 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.f61130W
            r11 = 43
            r10 = r10[r11]
            java.lang.Object r5 = r5.mo60854b(r10)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0193
            lh0.v r5 = r9.getType()
            java.lang.String r10 = "typeProjection.type"
            mf0.C24362h.m61210e(r5, r10)
            ug0.e r5 = p172m9.C5720b.m14058i(r5)
            goto L_0x0194
        L_0x0193:
            r5 = r4
        L_0x0194:
            if (r5 == 0) goto L_0x01a2
            java.lang.String r5 = r12.mo60090r(r5, r0)
            r13.append(r5)
            java.lang.String r5 = ": "
            r13.append(r5)
        L_0x01a2:
            java.lang.String r5 = r12.mo60092t(r9)
            r13.append(r5)
            r5 = r7
            goto L_0x015a
        L_0x01ab:
            java.lang.String r0 = ") "
            r13.append(r0)
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r0 = r12.mo60097A()
            int[] r3 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.C24107b.f61125a
            int r0 = r0.ordinal()
            r0 = r3[r0]
            if (r0 == r2) goto L_0x01ca
            r2 = 2
            if (r0 != r2) goto L_0x01c4
            java.lang.String r0 = "&rarr;"
            goto L_0x01d0
        L_0x01c4:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x01ca:
            java.lang.String r0 = "->"
            java.lang.String r0 = r12.mo60146w(r0)
        L_0x01d0:
            r13.append(r0)
            java.lang.String r0 = " "
            r13.append(r0)
            p172m9.C5720b.m14069t(r14)
            java.util.List r14 = r14.mo60410N0()
            java.lang.Object r14 = kotlin.collections.C23825c.m58522s0(r14)
            lh0.l0 r14 = (lh0.C24281l0) r14
            lh0.v r14 = r14.getType()
            java.lang.String r0 = "arguments.last().type"
            mf0.C24362h.m61210e(r14, r0)
            r12.mo60114S(r13, r14)
            if (r8 == 0) goto L_0x01f6
            r13.append(r1)
        L_0x01f6:
            if (r6 == 0) goto L_0x0205
            java.lang.String r14 = "?"
            r13.append(r14)
            goto L_0x0205
        L_0x01fe:
            r12.mo60105J(r13, r14)
            goto L_0x0205
        L_0x0202:
            r13.append(r1)
        L_0x0205:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.mo60115T(java.lang.StringBuilder, lh0.v):void");
    }

    /* renamed from: U */
    public final void mo60116U(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (mo60148y().contains(DescriptorRendererModifier.OVERRIDE) && (!callableMemberDescriptor.mo53440d().isEmpty()) && ((OverrideRenderingPolicy) this.f61121c.f61131A.mo60854b(DescriptorRendererOptionsImpl.f61130W[25])) != OverrideRenderingPolicy.RENDER_OPEN) {
            mo60112Q(sb, true, "override");
            if (mo60099C()) {
                sb.append("/*");
                sb.append(callableMemberDescriptor.mo53440d().size());
                sb.append("*/ ");
            }
        }
    }

    /* renamed from: V */
    public final void mo60117V(C25066c cVar, String str, StringBuilder sb) {
        boolean z;
        sb.append(mo60107L(str));
        C25067d i = cVar.mo61589i();
        C24362h.m61210e(i, "fqName.toUnsafe()");
        String q = mo60089q(i);
        if (q.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb.append(" ");
            sb.append(q);
        }
    }

    /* renamed from: W */
    public final void mo60118W(StringBuilder sb, C17601a aVar) {
        StringBuilder sb2;
        C17601a aVar2 = (C17601a) aVar.f45279d;
        if (aVar2 == null) {
            sb2 = null;
        } else {
            mo60118W(sb, aVar2);
            sb.append('.');
            C25069e name = ((C25440f) aVar.f45277b).getName();
            C24362h.m61210e(name, "possiblyInnerType.classifierDescriptor.name");
            sb.append(mo60090r(name, false));
            sb2 = sb;
        }
        if (sb2 == null) {
            C24274i0 j = ((C25440f) aVar.f45277b).mo53481j();
            C24362h.m61210e(j, "possiblyInnerType.classi…escriptor.typeConstructor");
            sb.append(mo60124b0(j));
        }
        sb.append(mo60122a0((List) aVar.f45278c));
    }

    /* renamed from: X */
    public final void mo60119X(StringBuilder sb, C23894a aVar) {
        C25433c0 R = aVar.mo53423R();
        if (R != null) {
            mo60102G(sb, R, AnnotationUseSiteTarget.RECEIVER);
            C24307v type = R.getType();
            C24362h.m61210e(type, "receiver.type");
            String s = mo60091s(type);
            if (m60144l0(type) && !C24299r0.m60975g(type)) {
                s = '(' + s + ')';
            }
            sb.append(s);
            sb.append(".");
        }
    }

    /* renamed from: Y */
    public final void mo60120Y(StringBuilder sb, C23894a aVar) {
        C25433c0 R;
        if (((Boolean) this.f61121c.f61135E.mo60854b(DescriptorRendererOptionsImpl.f61130W[29])).booleanValue() && (R = aVar.mo53423R()) != null) {
            sb.append(" on ");
            C24307v type = R.getType();
            C24362h.m61210e(type, "receiver.type");
            sb.append(mo60091s(type));
        }
    }

    /* renamed from: a */
    public final void mo60121a() {
        this.f61121c.mo60121a();
    }

    /* renamed from: a0 */
    public final String mo60122a0(List<? extends C24281l0> list) {
        C24362h.m61211f(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mo60146w("<"));
        C23825c.m58518o0(list, sb, ", ", (String) null, (String) null, new DescriptorRendererImpl$appendTypeProjections$1(this), 60);
        sb.append(mo60146w(">"));
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: b */
    public final void mo60123b() {
        this.f61121c.mo60123b();
    }

    /* renamed from: b0 */
    public final String mo60124b0(C24274i0 i0Var) {
        boolean z;
        C24362h.m61211f(i0Var, "typeConstructor");
        C25437e o = i0Var.mo53460o();
        boolean z2 = true;
        if (o instanceof C25448i0) {
            z = true;
        } else {
            z = o instanceof C25432c;
        }
        if (!z) {
            z2 = o instanceof C25446h0;
        }
        if (z2) {
            C24362h.m61211f(o, "klass");
            if (C24289p.m60918h(o)) {
                return o.mo53481j().toString();
            }
            return mo60147x().mo61745a(o, this);
        } else if (o != null) {
            throw new IllegalStateException(C24362h.m61216k(o.getClass(), "Unexpected classifier: ").toString());
        } else if (i0Var instanceof IntersectionTypeConstructor) {
            return ((IntersectionTypeConstructor) i0Var).mo60234b(DescriptorRendererImpl$renderTypeConstructor$1.f61129f);
        } else {
            return i0Var.toString();
        }
    }

    /* renamed from: c */
    public final void mo60125c(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        C24362h.m61211f(parameterNameRenderingPolicy, "<set-?>");
        this.f61121c.mo60125c(parameterNameRenderingPolicy);
    }

    /* renamed from: c0 */
    public final void mo60126c0(C25448i0 i0Var, StringBuilder sb, boolean z) {
        boolean z2;
        boolean z3;
        if (z) {
            sb.append(mo60146w("<"));
        }
        if (mo60099C()) {
            sb.append("/*");
            sb.append(i0Var.getIndex());
            sb.append("*/ ");
        }
        mo60112Q(sb, i0Var.mo53484y(), "reified");
        String label = i0Var.mo53482l().getLabel();
        boolean z4 = false;
        if (label.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        mo60112Q(sb, z2, label);
        mo60102G(sb, i0Var, (AnnotationUseSiteTarget) null);
        mo60113R(i0Var, sb, z);
        int size = i0Var.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            C24307v next = i0Var.getUpperBounds().iterator().next();
            if (next != null) {
                if (C23867c.m58686y(next) && next.mo60412P0()) {
                    z4 = true;
                }
                if (!z4) {
                    sb.append(" : ");
                    sb.append(mo60091s(next));
                }
            } else {
                C23867c.m58681a(141);
                throw null;
            }
        } else if (z) {
            boolean z5 = true;
            for (C24307v next2 : i0Var.getUpperBounds()) {
                if (next2 != null) {
                    if (!C23867c.m58686y(next2) || !next2.mo60412P0()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        if (z5) {
                            sb.append(" : ");
                        } else {
                            sb.append(" & ");
                        }
                        sb.append(mo60091s(next2));
                        z5 = false;
                    }
                } else {
                    C23867c.m58681a(141);
                    throw null;
                }
            }
        }
        if (z) {
            sb.append(mo60146w(">"));
        }
    }

    /* renamed from: d */
    public final boolean mo60127d() {
        return this.f61121c.mo60127d();
    }

    /* renamed from: d0 */
    public final void mo60128d0(StringBuilder sb, List<? extends C25448i0> list) {
        Iterator<? extends C25448i0> it = list.iterator();
        while (it.hasNext()) {
            mo60126c0((C25448i0) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* renamed from: e */
    public final void mo60129e() {
        this.f61121c.mo60129e();
    }

    /* renamed from: e0 */
    public final void mo60130e0(List<? extends C25448i0> list, StringBuilder sb, boolean z) {
        if (!((Boolean) this.f61121c.f61174v.mo60854b(DescriptorRendererOptionsImpl.f61130W[20])).booleanValue() && (!list.isEmpty())) {
            sb.append(mo60146w("<"));
            mo60128d0(sb, list);
            sb.append(mo60146w(">"));
            if (z) {
                sb.append(" ");
            }
        }
    }

    /* renamed from: f */
    public final void mo60131f(C25145a aVar) {
        this.f61121c.mo60131f(aVar);
    }

    /* renamed from: f0 */
    public final void mo60132f0(C25454l0 l0Var, StringBuilder sb, boolean z) {
        String str;
        if (z || !(l0Var instanceof C25452k0)) {
            if (l0Var.mo53526Q()) {
                str = "var";
            } else {
                str = "val";
            }
            sb.append(mo60107L(str));
            sb.append(" ");
        }
    }

    /* renamed from: g */
    public final void mo60133g(RenderingFormat renderingFormat) {
        C24362h.m61211f(renderingFormat, "<set-?>");
        this.f61121c.mo60133g(renderingFormat);
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [kotlin.reflect.jvm.internal.impl.descriptors.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60134g0(zf0.C25452k0 r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r9 = this;
            if (r13 == 0) goto L_0x0010
            java.lang.String r0 = "value-parameter"
            java.lang.String r0 = r9.mo60107L(r0)
            r12.append(r0)
            java.lang.String r0 = " "
            r12.append(r0)
        L_0x0010:
            boolean r0 = r9.mo60099C()
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = "/*"
            r12.append(r0)
            int r0 = r10.getIndex()
            r12.append(r0)
            java.lang.String r0 = "*/ "
            r12.append(r0)
        L_0x0027:
            r0 = 0
            r9.mo60102G(r12, r10, r0)
            boolean r1 = r10.mo59466v0()
            java.lang.String r2 = "crossinline"
            r9.mo60112Q(r12, r1, r2)
            boolean r1 = r10.mo59465u0()
            java.lang.String r2 = "noinline"
            r9.mo60112Q(r12, r1, r2)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r1 = r9.f61121c
            wg0.c r1 = r1.f61170r
            sf0.j<java.lang.Object>[] r2 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.f61130W
            r3 = 16
            r3 = r2[r3]
            java.lang.Object r1 = r1.mo60854b(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0070
            kotlin.reflect.jvm.internal.impl.descriptors.a r1 = r10.mo53399b()
            boolean r5 = r1 instanceof zf0.C25430b
            if (r5 == 0) goto L_0x0060
            r0 = r1
            zf0.b r0 = (zf0.C25430b) r0
        L_0x0060:
            if (r0 != 0) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            boolean r0 = r0.mo53499f0()
            if (r0 != r4) goto L_0x006b
            r0 = 1
            goto L_0x006c
        L_0x006b:
            r0 = 0
        L_0x006c:
            if (r0 == 0) goto L_0x0070
            r0 = 1
            goto L_0x0071
        L_0x0070:
            r0 = 0
        L_0x0071:
            if (r0 == 0) goto L_0x008a
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r1 = r9.f61121c
            wg0.c r1 = r1.f61171s
            r5 = 17
            r5 = r2[r5]
            java.lang.Object r1 = r1.mo60854b(r5)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r5 = "actual"
            r9.mo60112Q(r12, r1, r5)
        L_0x008a:
            lh0.v r1 = r10.getType()
            java.lang.String r5 = "variable.type"
            mf0.C24362h.m61210e(r1, r5)
            lh0.v r5 = r10.mo59467z0()
            if (r5 != 0) goto L_0x009b
            r6 = r1
            goto L_0x009c
        L_0x009b:
            r6 = r5
        L_0x009c:
            if (r5 == 0) goto L_0x00a0
            r7 = 1
            goto L_0x00a1
        L_0x00a0:
            r7 = 0
        L_0x00a1:
            java.lang.String r8 = "vararg"
            r9.mo60112Q(r12, r7, r8)
            if (r0 != 0) goto L_0x00b0
            if (r13 == 0) goto L_0x00b3
            boolean r7 = r9.mo60149z()
            if (r7 != 0) goto L_0x00b3
        L_0x00b0:
            r9.mo60132f0(r10, r12, r0)
        L_0x00b3:
            if (r11 == 0) goto L_0x00bd
            r9.mo60113R(r10, r12, r13)
            java.lang.String r11 = ": "
            r12.append(r11)
        L_0x00bd:
            java.lang.String r11 = r9.mo60091s(r6)
            r12.append(r11)
            r9.mo60106K(r10, r12)
            boolean r11 = r9.mo60099C()
            if (r11 == 0) goto L_0x00e0
            if (r5 == 0) goto L_0x00e0
            java.lang.String r11 = " /*"
            r12.append(r11)
            java.lang.String r11 = r9.mo60091s(r1)
            r12.append(r11)
            java.lang.String r11 = "*/"
            r12.append(r11)
        L_0x00e0:
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r11 = r9.f61121c
            wg0.c r11 = r11.f61177y
            r13 = 23
            r0 = r2[r13]
            java.lang.Object r11 = r11.mo60854b(r0)
            lf0.l r11 = (lf0.C24236l) r11
            if (r11 == 0) goto L_0x0102
            boolean r11 = r9.mo60139j()
            if (r11 == 0) goto L_0x00fb
            boolean r11 = r10.mo59462F0()
            goto L_0x00ff
        L_0x00fb:
            boolean r11 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m60280a(r10)
        L_0x00ff:
            if (r11 == 0) goto L_0x0102
            r3 = 1
        L_0x0102:
            if (r3 == 0) goto L_0x0120
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r11 = r9.f61121c
            wg0.c r11 = r11.f61177y
            r13 = r2[r13]
            java.lang.Object r11 = r11.mo60854b(r13)
            lf0.l r11 = (lf0.C24236l) r11
            mf0.C24362h.m61208c(r11)
            java.lang.Object r10 = r11.invoke(r10)
            java.lang.String r11 = " = "
            java.lang.String r10 = mf0.C24362h.m61216k(r10, r11)
            r12.append(r10)
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.mo60134g0(zf0.k0, boolean, java.lang.StringBuilder, boolean):void");
    }

    /* renamed from: h */
    public final void mo60135h() {
        this.f61121c.mo60135h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r8 == false) goto L_0x002d;
     */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60136h0(java.util.List r7, boolean r8, java.lang.StringBuilder r9) {
        /*
            r6 = this;
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r0 = r6.f61121c
            wg0.c r0 = r0.f61134D
            sf0.j<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.f61130W
            r2 = 28
            r1 = r1[r2]
            java.lang.Object r0 = r0.mo60854b(r1)
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r0 = (kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy) r0
            int[] r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.C24107b.f61126b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x002d
            r3 = 2
            if (r0 == r3) goto L_0x0029
            r8 = 3
            if (r0 != r8) goto L_0x0023
            goto L_0x002c
        L_0x0023:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L_0x0029:
            if (r8 != 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            int r8 = r7.size()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$b r0 = r6.mo60098B()
            r0.mo60093a(r9)
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
        L_0x003d:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x005e
            int r3 = r0 + 1
            java.lang.Object r4 = r7.next()
            zf0.k0 r4 = (zf0.C25452k0) r4
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$b r5 = r6.mo60098B()
            r5.mo60095c(r4, r9)
            r6.mo60134g0(r4, r1, r9, r2)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$b r5 = r6.mo60098B()
            r5.mo60094b(r4, r0, r8, r9)
            r0 = r3
            goto L_0x003d
        L_0x005e:
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$b r7 = r6.mo60098B()
            r7.mo60096d(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.mo60136h0(java.util.List, boolean, java.lang.StringBuilder):void");
    }

    /* renamed from: i */
    public final Set<C25066c> mo60137i() {
        return this.f61121c.mo60137i();
    }

    /* renamed from: i0 */
    public final boolean mo60138i0(C25478n nVar, StringBuilder sb) {
        if (!mo60148y().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        C25150c cVar = this.f61121c.f61166n;
        C24866j<Object>[] jVarArr = DescriptorRendererOptionsImpl.f61130W;
        if (((Boolean) cVar.mo60854b(jVarArr[12])).booleanValue()) {
            nVar = nVar.mo62741d();
        }
        if (!((Boolean) this.f61121c.f61167o.mo60854b(jVarArr[13])).booleanValue() && C24362h.m61206a(nVar, C25455m.f63750k)) {
            return false;
        }
        sb.append(mo60107L(nVar.mo62740b()));
        sb.append(" ");
        return true;
    }

    /* renamed from: j */
    public final boolean mo60139j() {
        return this.f61121c.mo60139j();
    }

    /* renamed from: j0 */
    public final void mo60140j0(StringBuilder sb, List list) {
        if (!((Boolean) this.f61121c.f61174v.mo60854b(DescriptorRendererOptionsImpl.f61130W[20])).booleanValue()) {
            ArrayList arrayList = new ArrayList(0);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C25448i0 i0Var = (C25448i0) it.next();
                List<C24307v> upperBounds = i0Var.getUpperBounds();
                C24362h.m61210e(upperBounds, "typeParameter.upperBounds");
                for (C24307v vVar : C23825c.m58508e0(upperBounds, 1)) {
                    StringBuilder sb2 = new StringBuilder();
                    C25069e name = i0Var.getName();
                    C24362h.m61210e(name, "typeParameter.name");
                    sb2.append(mo60090r(name, false));
                    sb2.append(" : ");
                    C24362h.m61210e(vVar, "it");
                    sb2.append(mo60091s(vVar));
                    arrayList.add(sb2.toString());
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" ");
                sb.append(mo60107L("where"));
                sb.append(" ");
                C23825c.m58518o0(arrayList, sb, ", ", (String) null, (String) null, (C24236l) null, 124);
            }
        }
    }

    /* renamed from: k */
    public final void mo60141k() {
        this.f61121c.mo60141k();
    }

    /* renamed from: l */
    public final void mo60142l() {
        this.f61121c.mo60142l();
    }

    /* renamed from: m */
    public final void mo60143m(Set<? extends DescriptorRendererModifier> set) {
        C24362h.m61211f(set, "<set-?>");
        this.f61121c.mo60143m(set);
    }

    /* renamed from: n */
    public final void mo60144n(LinkedHashSet linkedHashSet) {
        this.f61121c.mo60144n(linkedHashSet);
    }

    /* renamed from: o */
    public final void mo60145o() {
        this.f61121c.mo60145o();
    }

    /* renamed from: p */
    public final String mo60088p(String str, String str2, C23867c cVar) {
        C24362h.m61211f(str, "lowerRendered");
        C24362h.m61211f(str2, "upperRendered");
        if (!m60146v(str, str2)) {
            String e0 = C24179b.m60583e0(mo60147x().mo61745a(cVar.mo59387j(C23872e.C23873a.f60335A), this), "Collection");
            String k = C24362h.m61216k("Mutable", e0);
            String k0 = m60143k0(str, k, str2, e0, e0 + '(' + "Mutable" + ')');
            if (k0 != null) {
                return k0;
            }
            String k02 = m60143k0(str, C24362h.m61216k("MutableMap.MutableEntry", e0), str2, C24362h.m61216k("Map.Entry", e0), C24362h.m61216k("(Mutable)Map.(Mutable)Entry", e0));
            if (k02 != null) {
                return k02;
            }
            C25145a x = mo60147x();
            C25432c k2 = cVar.mo59388k("Array");
            C24362h.m61210e(k2, "builtIns.array");
            String e02 = C24179b.m60583e0(x.mo61745a(k2, this), "Array");
            String k03 = m60143k0(str, C24362h.m61216k(mo60146w("Array<"), e02), str2, C24362h.m61216k(mo60146w("Array<out "), e02), C24362h.m61216k(mo60146w("Array<(out) "), e02));
            if (k03 != null) {
                return k03;
            }
            return '(' + str + ".." + str2 + ')';
        } else if (!C25081h.m62835F(str2, "(")) {
            return C24362h.m61216k("!", str);
        } else {
            return '(' + str + ")!";
        }
    }

    /* renamed from: q */
    public final String mo60089q(C25067d dVar) {
        return mo60146w(C17875h.m44289N(dVar.mo61597g()));
    }

    /* renamed from: r */
    public final String mo60090r(C25069e eVar, boolean z) {
        String w = mo60146w(C17875h.m44288M(eVar));
        if (!((Boolean) this.f61121c.f61151U.mo60854b(DescriptorRendererOptionsImpl.f61130W[46])).booleanValue() || mo60097A() != RenderingFormat.HTML || !z) {
            return w;
        }
        return C13437d.m33706k("<b>", w, "</b>");
    }

    /* renamed from: s */
    public final String mo60091s(C24307v vVar) {
        C24362h.m61211f(vVar, "type");
        StringBuilder sb = new StringBuilder();
        mo60114S(sb, (C24307v) ((C24236l) this.f61121c.f61176x.mo60854b(DescriptorRendererOptionsImpl.f61130W[22])).invoke(vVar));
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: t */
    public final String mo60092t(C24281l0 l0Var) {
        C24362h.m61211f(l0Var, "typeProjection");
        StringBuilder sb = new StringBuilder();
        C23825c.m58518o0(C17875h.m44280D(l0Var), sb, ", ", (String) null, (String) null, new DescriptorRendererImpl$appendTypeProjections$1(this), 60);
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: w */
    public final String mo60146w(String str) {
        return mo60097A().escape(str);
    }

    /* renamed from: x */
    public final C25145a mo60147x() {
        return (C25145a) this.f61121c.f61154b.mo60854b(DescriptorRendererOptionsImpl.f61130W[0]);
    }

    /* renamed from: y */
    public final Set<DescriptorRendererModifier> mo60148y() {
        return (Set) this.f61121c.f61157e.mo60854b(DescriptorRendererOptionsImpl.f61130W[3]);
    }

    /* renamed from: z */
    public final boolean mo60149z() {
        return ((Boolean) this.f61121c.f61158f.mo60854b(DescriptorRendererOptionsImpl.f61130W[4])).booleanValue();
    }
}
