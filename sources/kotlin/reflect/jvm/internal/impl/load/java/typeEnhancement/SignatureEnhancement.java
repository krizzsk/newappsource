package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import ag0.C20984a;
import ag0.C20986c;
import ag0.C20989e;
import androidx.recyclerview.widget.RecyclerView;
import cf0.C21136j;
import cg0.C21174i;
import com.usebutton.sdk.internal.api.AppActionRequest;
import hg0.C23469i;
import hg0.C23478n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kg0.C23780d;
import kotlin.Pair;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.C23922a;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import lf0.C24236l;
import lh0.C24281l0;
import lh0.C24306u0;
import lh0.C24307v;
import lh0.C24311y;
import mf0.C24362h;
import pg0.C24695c;
import pg0.C24700f;
import pg0.C24705i;
import pg0.C24706j;
import ug0.C25066c;
import ug0.C25069e;
import yf0.C25295c;
import zf0.C25437e;
import zf0.C25448i0;

public final class SignatureEnhancement {

    /* renamed from: a */
    public final C23922a f60729a;

    /* renamed from: b */
    public final JavaTypeEnhancementState f60730b;

    /* renamed from: c */
    public final C24695c f60731c;

    public final class SignatureParts {

        /* renamed from: a */
        public final C20984a f60732a;

        /* renamed from: b */
        public final C24307v f60733b;

        /* renamed from: c */
        public final Collection<C24307v> f60734c;

        /* renamed from: d */
        public final boolean f60735d;

        /* renamed from: e */
        public final C23780d f60736e;

        /* renamed from: f */
        public final AnnotationQualifierApplicabilityType f60737f;

        /* renamed from: g */
        public final boolean f60738g;

        /* renamed from: h */
        public final boolean f60739h;

        public SignatureParts(C20984a aVar, C24307v vVar, Collection collection, boolean z, C23780d dVar, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2, boolean z3, int i) {
            z2 = (i & 64) != 0 ? false : z2;
            z3 = (i & RecyclerView.C1119a0.FLAG_IGNORE) != 0 ? false : z3;
            C24362h.m61211f(SignatureEnhancement.this, "this$0");
            C24362h.m61211f(vVar, "fromOverride");
            C24362h.m61211f(collection, "fromOverridden");
            C24362h.m61211f(dVar, "containerContext");
            C24362h.m61211f(annotationQualifierApplicabilityType, "containerApplicabilityType");
            SignatureEnhancement.this = SignatureEnhancement.this;
            this.f60732a = aVar;
            this.f60733b = vVar;
            this.f60734c = collection;
            this.f60735d = z;
            this.f60736e = dVar;
            this.f60737f = annotationQualifierApplicabilityType;
            this.f60738g = z2;
            this.f60739h = z3;
        }

        /* renamed from: a */
        public static final boolean m59167a(C24306u0 u0Var) {
            C25437e o = u0Var.mo60411O0().mo53460o();
            if (o == null) {
                return false;
            }
            C25069e name = o.getName();
            C25066c cVar = C25295c.f63587f;
            if (!C24362h.m61206a(name, cVar.mo61585f()) || !C24362h.m61206a(DescriptorUtilsKt.m60282c(o), cVar)) {
                return false;
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00b6  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00be  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x00fe  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x012c  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x012f  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x00b1 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x00f2 A[SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static pg0.C24700f m59168b(zf0.C25448i0 r8) {
            /*
                boolean r0 = r8 instanceof lg0.C24252d
                r1 = 0
                if (r0 == 0) goto L_0x0137
                lg0.d r8 = (lg0.C24252d) r8
                java.util.List r0 = r8.getUpperBounds()
                java.lang.String r2 = "upperBounds"
                mf0.C24362h.m61210e(r0, r2)
                boolean r3 = r0.isEmpty()
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L_0x0019
                goto L_0x0031
            L_0x0019:
                java.util.Iterator r0 = r0.iterator()
            L_0x001d:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0031
                java.lang.Object r3 = r0.next()
                lh0.v r3 = (lh0.C24307v) r3
                boolean r3 = p389bl.C13637c.m34082y(r3)
                if (r3 != 0) goto L_0x001d
                r0 = 0
                goto L_0x0032
            L_0x0031:
                r0 = 1
            L_0x0032:
                if (r0 == 0) goto L_0x0036
                goto L_0x0137
            L_0x0036:
                java.util.List r0 = r8.getUpperBounds()
                mf0.C24362h.m61210e(r0, r2)
                boolean r3 = r0.isEmpty()
                if (r3 == 0) goto L_0x0044
                goto L_0x0078
            L_0x0044:
                java.util.Iterator r0 = r0.iterator()
            L_0x0048:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0078
                java.lang.Object r3 = r0.next()
                lh0.v r3 = (lh0.C24307v) r3
                lh0.u0 r3 = r3.mo60450R0()
                boolean r6 = r3 instanceof lh0.C24298r
                if (r6 == 0) goto L_0x005f
                lh0.r r3 = (lh0.C24298r) r3
                goto L_0x0060
            L_0x005f:
                r3 = r1
            L_0x0060:
                if (r3 != 0) goto L_0x0063
                goto L_0x0073
            L_0x0063:
                lh0.z r6 = r3.f61594c
                boolean r6 = r6.mo60412P0()
                lh0.z r3 = r3.f61595d
                boolean r3 = r3.mo60412P0()
                if (r6 == r3) goto L_0x0073
                r3 = 1
                goto L_0x0074
            L_0x0073:
                r3 = 0
            L_0x0074:
                if (r3 != 0) goto L_0x0048
                r0 = 0
                goto L_0x0079
            L_0x0078:
                r0 = 1
            L_0x0079:
                if (r0 == 0) goto L_0x00fe
                java.util.List r0 = r8.getUpperBounds()
                mf0.C24362h.m61210e(r0, r2)
                boolean r3 = r0.isEmpty()
                java.lang.String r6 = "<this>"
                if (r3 == 0) goto L_0x008b
                goto L_0x00b3
            L_0x008b:
                java.util.Iterator r0 = r0.iterator()
            L_0x008f:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x00b3
                java.lang.Object r3 = r0.next()
                lh0.v r3 = (lh0.C24307v) r3
                boolean r7 = r3 instanceof lh0.C24303t
                if (r7 == 0) goto L_0x00ae
                lh0.t r3 = (lh0.C24303t) r3
                lh0.v r3 = r3.f61602f
                mf0.C24362h.m61211f(r3, r6)
                boolean r3 = lh0.C24299r0.m60975g(r3)
                if (r3 != 0) goto L_0x00ae
                r3 = 1
                goto L_0x00af
            L_0x00ae:
                r3 = 0
            L_0x00af:
                if (r3 == 0) goto L_0x008f
                r0 = 1
                goto L_0x00b4
            L_0x00b3:
                r0 = 0
            L_0x00b4:
                if (r0 == 0) goto L_0x00be
                pg0.f r8 = new pg0.f
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                r8.<init>(r0, r4)
                return r8
            L_0x00be:
                java.util.List r8 = r8.getUpperBounds()
                mf0.C24362h.m61210e(r8, r2)
                boolean r0 = r8.isEmpty()
                if (r0 == 0) goto L_0x00cc
                goto L_0x00f3
            L_0x00cc:
                java.util.Iterator r8 = r8.iterator()
            L_0x00d0:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto L_0x00f3
                java.lang.Object r0 = r8.next()
                lh0.v r0 = (lh0.C24307v) r0
                boolean r2 = r0 instanceof lh0.C24303t
                if (r2 == 0) goto L_0x00ef
                lh0.t r0 = (lh0.C24303t) r0
                lh0.v r0 = r0.f61602f
                mf0.C24362h.m61211f(r0, r6)
                boolean r0 = lh0.C24299r0.m60975g(r0)
                if (r0 == 0) goto L_0x00ef
                r0 = 1
                goto L_0x00f0
            L_0x00ef:
                r0 = 0
            L_0x00f0:
                if (r0 == 0) goto L_0x00d0
                r5 = 1
            L_0x00f3:
                if (r5 == 0) goto L_0x00fd
                pg0.f r8 = new pg0.f
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
                r8.<init>(r0, r4)
                return r8
            L_0x00fd:
                return r1
            L_0x00fe:
                java.util.List r8 = r8.getUpperBounds()
                mf0.C24362h.m61210e(r8, r2)
                boolean r0 = r8.isEmpty()
                if (r0 == 0) goto L_0x010c
                goto L_0x0129
            L_0x010c:
                java.util.Iterator r8 = r8.iterator()
            L_0x0110:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto L_0x0129
                java.lang.Object r0 = r8.next()
                lh0.v r0 = (lh0.C24307v) r0
                java.lang.String r1 = "it"
                mf0.C24362h.m61210e(r0, r1)
                boolean r0 = lh0.C24299r0.m60975g(r0)
                r0 = r0 ^ r4
                if (r0 == 0) goto L_0x0110
                goto L_0x012a
            L_0x0129:
                r4 = 0
            L_0x012a:
                if (r4 == 0) goto L_0x012f
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                goto L_0x0131
            L_0x012f:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            L_0x0131:
                pg0.f r0 = new pg0.f
                r0.<init>(r8, r5)
                return r0
            L_0x0137:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.m59168b(zf0.i0):pg0.f");
        }

        /* renamed from: d */
        public static /* synthetic */ C23972a m59169d(SignatureParts signatureParts, C24706j jVar, int i) {
            if ((i & 1) != 0) {
                jVar = null;
            }
            return signatureParts.mo59578c(jVar, false);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0069  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0093  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static pg0.C24698d m59170e(lh0.C24307v r8) {
            /*
                boolean r0 = ce0.C21100e.m49356o0(r8)
                if (r0 == 0) goto L_0x0016
                lh0.u0 r0 = r8.mo60450R0()
                lh0.r r0 = (lh0.C24298r) r0
                kotlin.Pair r1 = new kotlin.Pair
                lh0.z r2 = r0.f61594c
                lh0.z r0 = r0.f61595d
                r1.<init>(r2, r0)
                goto L_0x001b
            L_0x0016:
                kotlin.Pair r1 = new kotlin.Pair
                r1.<init>(r8, r8)
            L_0x001b:
                java.lang.Object r0 = r1.mo59066a()
                lh0.v r0 = (lh0.C24307v) r0
                java.lang.Object r1 = r1.mo59067b()
                lh0.v r1 = (lh0.C24307v) r1
                pg0.d r2 = new pg0.d
                boolean r3 = r0.mo60412P0()
                r4 = 0
                if (r3 == 0) goto L_0x0033
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
                goto L_0x003d
            L_0x0033:
                boolean r3 = r1.mo60412P0()
                if (r3 != 0) goto L_0x003c
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                goto L_0x003d
            L_0x003c:
                r3 = r4
            L_0x003d:
                lh0.o r5 = lh0.C24299r0.f61596a
                lh0.i0 r0 = r0.mo60411O0()
                zf0.e r0 = r0.mo53460o()
                boolean r5 = r0 instanceof zf0.C25432c
                if (r5 == 0) goto L_0x004e
                zf0.c r0 = (zf0.C25432c) r0
                goto L_0x004f
            L_0x004e:
                r0 = r4
            L_0x004f:
                r5 = 1
                r6 = 0
                if (r0 == 0) goto L_0x0063
                java.lang.String r7 = yf0.C25295c.f63582a
                ug0.d r0 = xg0.C25260c.m63390g(r0)
                java.util.HashMap<ug0.d, ug0.c> r7 = yf0.C25295c.f63592k
                boolean r0 = r7.containsKey(r0)
                if (r0 == 0) goto L_0x0063
                r0 = 1
                goto L_0x0064
            L_0x0063:
                r0 = 0
            L_0x0064:
                if (r0 == 0) goto L_0x0069
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
                goto L_0x0095
            L_0x0069:
                java.lang.String r0 = "type"
                mf0.C24362h.m61211f(r1, r0)
                lh0.i0 r0 = r1.mo60411O0()
                zf0.e r0 = r0.mo53460o()
                boolean r1 = r0 instanceof zf0.C25432c
                if (r1 == 0) goto L_0x007d
                zf0.c r0 = (zf0.C25432c) r0
                goto L_0x007e
            L_0x007d:
                r0 = r4
            L_0x007e:
                if (r0 == 0) goto L_0x0090
                java.lang.String r1 = yf0.C25295c.f63582a
                ug0.d r0 = xg0.C25260c.m63390g(r0)
                java.util.HashMap<ug0.d, ug0.c> r1 = yf0.C25295c.f63591j
                boolean r0 = r1.containsKey(r0)
                if (r0 == 0) goto L_0x0090
                r0 = 1
                goto L_0x0091
            L_0x0090:
                r0 = 0
            L_0x0091:
                if (r0 == 0) goto L_0x0095
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
            L_0x0095:
                lh0.u0 r0 = r8.mo60450R0()
                boolean r0 = r0 instanceof pg0.C24699e
                if (r0 != 0) goto L_0x00a7
                lh0.u0 r8 = r8.mo60450R0()
                boolean r8 = r8 instanceof lh0.C24272i
                if (r8 == 0) goto L_0x00a6
                goto L_0x00a7
            L_0x00a6:
                r5 = 0
            L_0x00a7:
                r2.<init>(r3, r4, r5, r6)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.m59170e(lh0.v):pg0.d");
        }

        /* renamed from: f */
        public static final Object m59171f(List list, C20989e eVar, MutabilityQualifier mutabilityQualifier) {
            boolean z;
            boolean z2 = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (eVar.mo53071c((C25066c) it.next()) != null) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z2) {
                return mutabilityQualifier;
            }
            return null;
        }

        /* renamed from: g */
        public static final void m59172g(SignatureParts signatureParts, ArrayList<C24705i> arrayList, C24307v vVar, C23780d dVar, C25448i0 i0Var) {
            C23469i iVar;
            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType;
            C23780d c = ContextKt.m59010c(dVar, vVar.getAnnotations());
            C23478n a = c.mo59011a();
            if (a == null) {
                iVar = null;
            } else {
                if (signatureParts.f60738g) {
                    annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
                } else {
                    annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.TYPE_USE;
                }
                iVar = a.f59265a.get(annotationQualifierApplicabilityType);
            }
            arrayList.add(new C24705i(vVar, iVar, i0Var, false));
            if (!signatureParts.f60739h || !(vVar instanceof C24311y)) {
                List<C24281l0> N0 = vVar.mo60410N0();
                List<C25448i0> parameters = vVar.mo60411O0().getParameters();
                C24362h.m61210e(parameters, "type.constructor.parameters");
                Iterator it = C23825c.m58505Q0(N0, parameters).iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    C24281l0 l0Var = (C24281l0) pair.mo59066a();
                    C25448i0 i0Var2 = (C25448i0) pair.mo59067b();
                    if (l0Var.mo60240a()) {
                        C24307v type = l0Var.getType();
                        C24362h.m61210e(type, "arg.type");
                        arrayList.add(new C24705i(type, iVar, i0Var2, true));
                    } else {
                        C24307v type2 = l0Var.getType();
                        C24362h.m61210e(type2, "arg.type");
                        m59172g(signatureParts, arrayList, type2, c, i0Var2);
                    }
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier} */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x02d4, code lost:
            if (r4.f62537a == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL) goto L_0x02e9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x02e4, code lost:
            if (r1 != false) goto L_0x02e9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:225:0x0382, code lost:
            if (r6 != false) goto L_0x0385;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:169:0x02ee  */
        /* JADX WARNING: Removed duplicated region for block: B:170:0x02f0  */
        /* JADX WARNING: Removed duplicated region for block: B:178:0x0312  */
        /* JADX WARNING: Removed duplicated region for block: B:183:0x031d  */
        /* JADX WARNING: Removed duplicated region for block: B:184:0x031f  */
        /* JADX WARNING: Removed duplicated region for block: B:186:0x0322  */
        /* JADX WARNING: Removed duplicated region for block: B:187:0x0324  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:194:0x0335  */
        /* JADX WARNING: Removed duplicated region for block: B:195:0x0337  */
        /* JADX WARNING: Removed duplicated region for block: B:197:0x033a  */
        /* JADX WARNING: Removed duplicated region for block: B:198:0x033c  */
        /* JADX WARNING: Removed duplicated region for block: B:201:0x0344 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:206:0x0351  */
        /* JADX WARNING: Removed duplicated region for block: B:208:0x035e  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0073  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:231:0x039f  */
        /* JADX WARNING: Removed duplicated region for block: B:232:0x03a1  */
        /* JADX WARNING: Removed duplicated region for block: B:235:0x03a6  */
        /* JADX WARNING: Removed duplicated region for block: B:245:0x03c7  */
        /* JADX WARNING: Removed duplicated region for block: B:248:0x03cc A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:258:0x03f9  */
        /* JADX WARNING: Removed duplicated region for block: B:259:0x03fb  */
        /* JADX WARNING: Removed duplicated region for block: B:263:0x0403  */
        /* JADX WARNING: Removed duplicated region for block: B:264:0x040a  */
        /* JADX WARNING: Removed duplicated region for block: B:269:0x0432  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:270:0x0434  */
        /* JADX WARNING: Removed duplicated region for block: B:273:0x043d  */
        /* JADX WARNING: Removed duplicated region for block: B:281:0x045b  */
        /* JADX WARNING: Removed duplicated region for block: B:284:0x046c  */
        /* JADX WARNING: Removed duplicated region for block: B:287:0x0482  */
        /* JADX WARNING: Removed duplicated region for block: B:288:0x048a  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.C23972a mo59578c(pg0.C24706j r27, boolean r28) {
            /*
                r26 = this;
                r0 = r26
                r1 = r27
                java.util.Collection<lh0.v> r2 = r0.f60734c
                java.util.ArrayList r3 = new java.util.ArrayList
                r4 = 10
                int r5 = cf0.C21136j.m49436X(r2, r4)
                r3.<init>(r5)
                java.util.Iterator r2 = r2.iterator()
            L_0x0015:
                boolean r5 = r2.hasNext()
                r6 = 0
                r7 = 1
                if (r5 == 0) goto L_0x0031
                java.lang.Object r5 = r2.next()
                lh0.v r5 = (lh0.C24307v) r5
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>(r7)
                kg0.d r7 = r0.f60736e
                m59172g(r0, r8, r5, r7, r6)
                r3.add(r8)
                goto L_0x0015
            L_0x0031:
                lh0.v r2 = r0.f60733b
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r7)
                kg0.d r8 = r0.f60736e
                m59172g(r0, r5, r2, r8, r6)
                boolean r2 = r0.f60735d
                if (r2 == 0) goto L_0x0070
                java.util.Collection<lh0.v> r2 = r0.f60734c
                boolean r9 = r2 instanceof java.util.Collection
                if (r9 == 0) goto L_0x004e
                boolean r9 = r2.isEmpty()
                if (r9 == 0) goto L_0x004e
                goto L_0x006b
            L_0x004e:
                java.util.Iterator r2 = r2.iterator()
            L_0x0052:
                boolean r9 = r2.hasNext()
                if (r9 == 0) goto L_0x006b
                java.lang.Object r9 = r2.next()
                lh0.v r9 = (lh0.C24307v) r9
                mh0.h r10 = mh0.C24376c.f61714a
                lh0.v r11 = r0.f60733b
                boolean r9 = r10.mo60530d(r9, r11)
                r9 = r9 ^ r7
                if (r9 == 0) goto L_0x0052
                r2 = 1
                goto L_0x006c
            L_0x006b:
                r2 = 0
            L_0x006c:
                if (r2 == 0) goto L_0x0070
                r2 = 1
                goto L_0x0071
            L_0x0070:
                r2 = 0
            L_0x0071:
                if (r2 == 0) goto L_0x0075
                r2 = 1
                goto L_0x0079
            L_0x0075:
                int r2 = r5.size()
            L_0x0079:
                pg0.d[] r9 = new pg0.C24698d[r2]
                r10 = 0
            L_0x007c:
                java.lang.String r11 = "<this>"
                if (r10 >= r2) goto L_0x0425
                if (r10 != 0) goto L_0x0084
                r12 = 1
                goto L_0x0085
            L_0x0084:
                r12 = 0
            L_0x0085:
                java.lang.Object r13 = r5.get(r10)
                pg0.i r13 = (pg0.C24705i) r13
                lh0.v r14 = r13.f62548a
                hg0.i r15 = r13.f62549b
                zf0.i0 r7 = r13.f62550c
                boolean r13 = r13.f62551d
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Iterator r16 = r3.iterator()
            L_0x009c:
                boolean r17 = r16.hasNext()
                if (r17 == 0) goto L_0x00be
                java.lang.Object r17 = r16.next()
                r6 = r17
                java.util.List r6 = (java.util.List) r6
                java.lang.Object r6 = kotlin.collections.C23825c.m58516m0(r10, r6)
                pg0.i r6 = (pg0.C24705i) r6
                if (r6 != 0) goto L_0x00b4
                r6 = 0
                goto L_0x00b6
            L_0x00b4:
                lh0.v r6 = r6.f62548a
            L_0x00b6:
                if (r6 != 0) goto L_0x00b9
                goto L_0x00bc
            L_0x00b9:
                r8.add(r6)
            L_0x00bc:
                r6 = 0
                goto L_0x009c
            L_0x00be:
                java.util.ArrayList r6 = new java.util.ArrayList
                r16 = r2
                int r2 = cf0.C21136j.m49436X(r8, r4)
                r6.<init>(r2)
                java.util.Iterator r2 = r8.iterator()
            L_0x00cd:
                boolean r17 = r2.hasNext()
                if (r17 == 0) goto L_0x00e3
                java.lang.Object r17 = r2.next()
                lh0.v r17 = (lh0.C24307v) r17
                pg0.d r4 = m59170e(r17)
                r6.add(r4)
                r4 = 10
                goto L_0x00cd
            L_0x00e3:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r4 = r6.iterator()
            L_0x00ec:
                boolean r17 = r4.hasNext()
                if (r17 == 0) goto L_0x0107
                java.lang.Object r17 = r4.next()
                r18 = r3
                r3 = r17
                pg0.d r3 = (pg0.C24698d) r3
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r3 = r3.f62533b
                if (r3 != 0) goto L_0x0101
                goto L_0x0104
            L_0x0101:
                r2.add(r3)
            L_0x0104:
                r3 = r18
                goto L_0x00ec
            L_0x0107:
                r18 = r3
                java.util.Set r2 = kotlin.collections.C23825c.m58503O0(r2)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r4 = r6.iterator()
            L_0x0116:
                boolean r17 = r4.hasNext()
                if (r17 == 0) goto L_0x0131
                java.lang.Object r17 = r4.next()
                r19 = r4
                r4 = r17
                pg0.d r4 = (pg0.C24698d) r4
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r4 = r4.f62532a
                if (r4 != 0) goto L_0x012b
                goto L_0x012e
            L_0x012b:
                r3.add(r4)
            L_0x012e:
                r4 = r19
                goto L_0x0116
            L_0x0131:
                java.util.Set r3 = kotlin.collections.C23825c.m58503O0(r3)
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r8 = r8.iterator()
            L_0x013e:
                boolean r17 = r8.hasNext()
                if (r17 == 0) goto L_0x0169
                java.lang.Object r17 = r8.next()
                r19 = r5
                r5 = r17
                lh0.v r5 = (lh0.C24307v) r5
                mf0.C24362h.m61211f(r5, r11)
                lh0.v r17 = p584jl.C17885a.m44422S(r5)
                if (r17 != 0) goto L_0x0158
                goto L_0x015a
            L_0x0158:
                r5 = r17
            L_0x015a:
                pg0.d r5 = m59170e(r5)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r5 = r5.f62532a
                if (r5 != 0) goto L_0x0163
                goto L_0x0166
            L_0x0163:
                r4.add(r5)
            L_0x0166:
                r5 = r19
                goto L_0x013e
            L_0x0169:
                r19 = r5
                java.util.Set r4 = kotlin.collections.C23825c.m58503O0(r4)
                if (r13 == 0) goto L_0x018c
                if (r7 != 0) goto L_0x0175
                r5 = 0
                goto L_0x0179
            L_0x0175:
                kotlin.reflect.jvm.internal.impl.types.Variance r5 = r7.mo53482l()
            L_0x0179:
                kotlin.reflect.jvm.internal.impl.types.Variance r8 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
                if (r5 != r8) goto L_0x018c
                pg0.d r5 = pg0.C24698d.f62531e
                r23 = r2
                r22 = r4
                r21 = r6
                r17 = r9
                r20 = r10
                r7 = 1
                goto L_0x0330
            L_0x018c:
                kg0.d r5 = r0.f60736e
                kg0.b r5 = r5.f60080a
                kg0.c r5 = r5.f60074t
                r5.mo59010c()
                if (r12 == 0) goto L_0x019d
                ag0.a r5 = r0.f60732a
                if (r5 == 0) goto L_0x019d
                boolean r5 = r5 instanceof zf0.C25448i0
            L_0x019d:
                if (r12 == 0) goto L_0x01b0
                ag0.a r5 = r0.f60732a
                if (r5 == 0) goto L_0x01b0
                ag0.e r5 = r5.getAnnotations()
                ag0.e r8 = r14.getAnnotations()
                ag0.e r5 = p626lf.C18201b.m44914k(r5, r8)
                goto L_0x01b4
            L_0x01b0:
                ag0.e r5 = r14.getAnnotations()
            L_0x01b4:
                if (r12 == 0) goto L_0x01cb
                kg0.d r8 = r0.f60736e
                hg0.n r8 = r8.mo59011a()
                if (r8 != 0) goto L_0x01c0
                r15 = 0
                goto L_0x01cb
            L_0x01c0:
                kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r15 = r0.f60737f
                java.util.EnumMap<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType, hg0.i> r8 = r8.f59265a
                java.lang.Object r8 = r8.get(r15)
                r15 = r8
                hg0.i r15 = (hg0.C23469i) r15
            L_0x01cb:
                lh0.i0 r8 = r14.mo60411O0()
                zf0.e r8 = r8.mo53460o()
                boolean r1 = r8 instanceof zf0.C25448i0
                if (r1 == 0) goto L_0x01db
                r1 = r8
                zf0.i0 r1 = (zf0.C25448i0) r1
                goto L_0x01dc
            L_0x01db:
                r1 = 0
            L_0x01dc:
                if (r1 != 0) goto L_0x01e0
                r1 = 0
                goto L_0x01e4
            L_0x01e0:
                pg0.f r1 = m59168b(r1)
            L_0x01e4:
                if (r1 != 0) goto L_0x01f5
                kotlin.Pair r1 = new kotlin.Pair
                java.lang.Boolean r8 = java.lang.Boolean.FALSE
                r17 = r9
                r9 = 0
                r1.<init>(r9, r8)
                r21 = r6
                r20 = r10
                goto L_0x0215
            L_0x01f5:
                r17 = r9
                kotlin.Pair r8 = new kotlin.Pair
                pg0.f r9 = new pg0.f
                r20 = r10
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r10 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                r21 = r6
                boolean r6 = r1.f62538b
                r9.<init>(r10, r6)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = r1.f62537a
                if (r1 != r10) goto L_0x020c
                r1 = 1
                goto L_0x020d
            L_0x020c:
                r1 = 0
            L_0x020d:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r8.<init>(r9, r1)
                r1 = r8
            L_0x0215:
                java.lang.Object r6 = r1.mo59066a()
                r9 = r6
                pg0.f r9 = (pg0.C24700f) r9
                java.lang.Object r1 = r1.mo59067b()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                boolean r6 = r0.f60738g
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.this
                java.util.Iterator r10 = r5.iterator()
                r22 = r4
                r4 = 0
            L_0x0231:
                boolean r23 = r10.hasNext()
                if (r23 == 0) goto L_0x0274
                java.lang.Object r23 = r10.next()
                r24 = r10
                r10 = r23
                ag0.c r10 = (ag0.C20986c) r10
                r23 = r2
                r2 = 0
                pg0.f r10 = r8.mo59575c(r10, r2, r6)
                if (r4 != 0) goto L_0x024d
                r25 = r6
                goto L_0x0267
            L_0x024d:
                if (r10 == 0) goto L_0x026b
                boolean r2 = mf0.C24362h.m61206a(r10, r4)
                if (r2 == 0) goto L_0x0256
                goto L_0x026b
            L_0x0256:
                boolean r2 = r10.f62538b
                r25 = r6
                if (r2 == 0) goto L_0x0261
                boolean r6 = r4.f62538b
                if (r6 != 0) goto L_0x0261
                goto L_0x026d
            L_0x0261:
                if (r2 != 0) goto L_0x0269
                boolean r2 = r4.f62538b
                if (r2 == 0) goto L_0x0269
            L_0x0267:
                r4 = r10
                goto L_0x026d
            L_0x0269:
                r4 = 0
                goto L_0x0276
            L_0x026b:
                r25 = r6
            L_0x026d:
                r2 = r23
                r10 = r24
                r6 = r25
                goto L_0x0231
            L_0x0274:
                r23 = r2
            L_0x0276:
                if (r4 != 0) goto L_0x0279
                goto L_0x027c
            L_0x0279:
                if (r13 != 0) goto L_0x027c
                goto L_0x027d
            L_0x027c:
                r4 = 0
            L_0x027d:
                if (r4 != 0) goto L_0x02cd
                if (r9 != 0) goto L_0x0287
                if (r15 != 0) goto L_0x0285
                r9 = 0
                goto L_0x0287
            L_0x0285:
                pg0.f r9 = r15.f59251a
            L_0x0287:
                if (r7 != 0) goto L_0x028a
                goto L_0x0290
            L_0x028a:
                pg0.f r2 = m59168b(r7)
                if (r2 != 0) goto L_0x0292
            L_0x0290:
                r2 = 0
                goto L_0x02a0
            L_0x0292:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = r2.f62537a
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r7 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
                if (r6 != r7) goto L_0x02a0
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
                r7 = 2
                r8 = 0
                pg0.f r2 = pg0.C24700f.m62168a(r2, r6, r8, r7)
            L_0x02a0:
                if (r2 != 0) goto L_0x02a3
                goto L_0x02ce
            L_0x02a3:
                if (r9 != 0) goto L_0x02a6
                goto L_0x02cb
            L_0x02a6:
                boolean r6 = r2.f62538b
                if (r6 == 0) goto L_0x02af
                boolean r7 = r9.f62538b
                if (r7 != 0) goto L_0x02af
                goto L_0x02ce
            L_0x02af:
                if (r6 != 0) goto L_0x02b6
                boolean r6 = r9.f62538b
                if (r6 == 0) goto L_0x02b6
                goto L_0x02cb
            L_0x02b6:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = r2.f62537a
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r7 = r9.f62537a
                int r6 = r6.compareTo(r7)
                if (r6 >= 0) goto L_0x02c1
                goto L_0x02ce
            L_0x02c1:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = r2.f62537a
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r7 = r9.f62537a
                int r6 = r6.compareTo(r7)
                if (r6 <= 0) goto L_0x02ce
            L_0x02cb:
                r9 = r2
                goto L_0x02ce
            L_0x02cd:
                r9 = r4
            L_0x02ce:
                if (r4 == 0) goto L_0x02d7
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = r4.f62537a
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                if (r1 != r2) goto L_0x02e7
                goto L_0x02e9
            L_0x02d7:
                if (r1 != 0) goto L_0x02e9
                if (r15 != 0) goto L_0x02dc
                goto L_0x02e3
            L_0x02dc:
                boolean r1 = r15.f59253c
                r2 = 1
                if (r1 != r2) goto L_0x02e3
                r1 = 1
                goto L_0x02e4
            L_0x02e3:
                r1 = 0
            L_0x02e4:
                if (r1 == 0) goto L_0x02e7
                goto L_0x02e9
            L_0x02e7:
                r1 = 0
                goto L_0x02ea
            L_0x02e9:
                r1 = 1
            L_0x02ea:
                pg0.d r2 = new pg0.d
                if (r9 != 0) goto L_0x02f0
                r4 = 0
                goto L_0x02f2
            L_0x02f0:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r4 = r9.f62537a
            L_0x02f2:
                java.util.List<ug0.c> r6 = hg0.C23481q.f59295l
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r7 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
                java.lang.Object r6 = m59171f(r6, r5, r7)
                java.util.List<ug0.c> r7 = hg0.C23481q.f59296m
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
                java.lang.Object r5 = m59171f(r7, r5, r8)
                if (r6 == 0) goto L_0x030f
                if (r5 == 0) goto L_0x030f
                boolean r7 = mf0.C24362h.m61206a(r6, r5)
                if (r7 == 0) goto L_0x030d
                goto L_0x030f
            L_0x030d:
                r5 = 0
                goto L_0x0313
            L_0x030f:
                if (r6 != 0) goto L_0x0312
                goto L_0x0313
            L_0x0312:
                r5 = r6
            L_0x0313:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r5 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier) r5
                if (r1 == 0) goto L_0x031f
                boolean r1 = lh0.C24299r0.m60976h(r14)
                if (r1 == 0) goto L_0x031f
                r1 = 1
                goto L_0x0320
            L_0x031f:
                r1 = 0
            L_0x0320:
                if (r9 != 0) goto L_0x0324
                r7 = 1
                goto L_0x032b
            L_0x0324:
                boolean r6 = r9.f62538b
                r7 = 1
                if (r6 != r7) goto L_0x032b
                r6 = 1
                goto L_0x032c
            L_0x032b:
                r6 = 0
            L_0x032c:
                r2.<init>(r4, r5, r1, r6)
                r5 = r2
            L_0x0330:
                boolean r1 = r5.f62535d
                r1 = r1 ^ r7
                if (r1 == 0) goto L_0x0337
                r9 = r5
                goto L_0x0338
            L_0x0337:
                r9 = 0
            L_0x0338:
                if (r9 != 0) goto L_0x033c
                r9 = 0
                goto L_0x033e
            L_0x033c:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r9 = r9.f62532a
            L_0x033e:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = r5.f62532a
                boolean r2 = r0.f60735d
                if (r2 == 0) goto L_0x0348
                if (r12 == 0) goto L_0x0348
                r2 = 1
                goto L_0x0349
            L_0x0348:
                r2 = 0
            L_0x0349:
                mf0.C24362h.m61211f(r3, r11)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
                if (r9 != r4) goto L_0x0351
                goto L_0x035b
            L_0x0351:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
                java.lang.Object r4 = ce0.C21100e.m49376y0(r3, r4, r6, r9, r2)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r4 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier) r4
            L_0x035b:
                if (r4 != 0) goto L_0x035e
                goto L_0x0385
            L_0x035e:
                if (r28 != 0) goto L_0x0381
                ag0.a r6 = r0.f60732a
                boolean r7 = r6 instanceof zf0.C25452k0
                if (r7 != 0) goto L_0x0367
                r6 = 0
            L_0x0367:
                zf0.k0 r6 = (zf0.C25452k0) r6
                if (r6 != 0) goto L_0x036d
                r6 = 0
                goto L_0x0371
            L_0x036d:
                lh0.v r6 = r6.mo59467z0()
            L_0x0371:
                if (r6 == 0) goto L_0x0375
                r6 = 1
                goto L_0x0376
            L_0x0375:
                r6 = 0
            L_0x0376:
                if (r6 == 0) goto L_0x037f
                if (r12 == 0) goto L_0x037f
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
                if (r4 != r6) goto L_0x037f
                goto L_0x0381
            L_0x037f:
                r6 = 0
                goto L_0x0382
            L_0x0381:
                r6 = 1
            L_0x0382:
                if (r6 != 0) goto L_0x0385
                goto L_0x0386
            L_0x0385:
                r4 = 0
            L_0x0386:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r7 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r8 = r5.f62533b
                r10 = r23
                java.lang.Object r6 = ce0.C21100e.m49376y0(r10, r6, r7, r8, r2)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r6 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier) r6
                r7 = r22
                if (r1 != r9) goto L_0x03a1
                boolean r3 = mf0.C24362h.m61206a(r7, r3)
                if (r3 != 0) goto L_0x039f
                goto L_0x03a1
            L_0x039f:
                r3 = 0
                goto L_0x03a2
            L_0x03a1:
                r3 = 1
            L_0x03a2:
                boolean r5 = r5.f62534c
                if (r5 != 0) goto L_0x03c9
                boolean r5 = r21.isEmpty()
                if (r5 == 0) goto L_0x03ad
                goto L_0x03c3
            L_0x03ad:
                java.util.Iterator r5 = r21.iterator()
            L_0x03b1:
                boolean r8 = r5.hasNext()
                if (r8 == 0) goto L_0x03c3
                java.lang.Object r8 = r5.next()
                pg0.d r8 = (pg0.C24698d) r8
                boolean r8 = r8.f62534c
                if (r8 == 0) goto L_0x03b1
                r5 = 1
                goto L_0x03c4
            L_0x03c3:
                r5 = 0
            L_0x03c4:
                if (r5 == 0) goto L_0x03c7
                goto L_0x03c9
            L_0x03c7:
                r5 = 0
                goto L_0x03ca
            L_0x03c9:
                r5 = 1
            L_0x03ca:
                if (r4 != 0) goto L_0x03f7
                if (r3 == 0) goto L_0x03f7
                mf0.C24362h.m61211f(r7, r11)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
                if (r1 != r3) goto L_0x03d6
                goto L_0x03e1
            L_0x03d6:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
                java.lang.Object r1 = ce0.C21100e.m49376y0(r7, r3, r4, r1, r2)
                r3 = r1
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier) r3
            L_0x03e1:
                if (r5 == 0) goto L_0x03ef
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                if (r3 == r1) goto L_0x03e8
                goto L_0x03ef
            L_0x03e8:
                pg0.d r1 = new pg0.d
                r2 = 1
                r1.<init>(r3, r6, r2, r2)
                goto L_0x0411
            L_0x03ef:
                r2 = 1
                pg0.d r1 = new pg0.d
                r4 = 0
                r1.<init>(r3, r6, r4, r2)
                goto L_0x0411
            L_0x03f7:
                if (r4 != 0) goto L_0x03fb
                r1 = 1
                goto L_0x03fc
            L_0x03fb:
                r1 = 0
            L_0x03fc:
                if (r5 == 0) goto L_0x040a
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                if (r4 == r2) goto L_0x0403
                goto L_0x040a
            L_0x0403:
                pg0.d r2 = new pg0.d
                r3 = 1
                r2.<init>(r4, r6, r3, r1)
                goto L_0x0410
            L_0x040a:
                pg0.d r2 = new pg0.d
                r3 = 0
                r2.<init>(r4, r6, r3, r1)
            L_0x0410:
                r1 = r2
            L_0x0411:
                r17[r20] = r1
                int r10 = r20 + 1
                r1 = r27
                r2 = r16
                r9 = r17
                r3 = r18
                r5 = r19
                r4 = 10
                r6 = 0
                r7 = 1
                goto L_0x007c
            L_0x0425:
                r17 = r9
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$computeIndexedQualifiersForOverride$1 r1 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$computeIndexedQualifiersForOverride$1
                r2 = r17
                r1.<init>(r2)
                r2 = r27
                if (r2 != 0) goto L_0x0434
                r9 = 0
                goto L_0x0439
            L_0x0434:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$enhance$qualifiersWithPredefined$1$1 r9 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$enhance$qualifiersWithPredefined$1$1
                r9.<init>(r2, r1)
            L_0x0439:
                boolean r2 = r0.f60739h
                if (r2 == 0) goto L_0x045b
                lh0.v r2 = r0.f60733b
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1 r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1.f60744b
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$enhance$containsFunctionN$2 r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$enhance$containsFunctionN$2.f60745f
                if (r3 == 0) goto L_0x0454
                if (r4 == 0) goto L_0x044d
                r5 = 0
                boolean r2 = lh0.C24299r0.m60972d(r2, r3, r4, r5)
                goto L_0x0463
            L_0x044d:
                r5 = 0
                r1 = 45
                lh0.C24299r0.m60969a(r1)
                throw r5
            L_0x0454:
                r5 = 0
                r1 = 44
                lh0.C24299r0.m60969a(r1)
                throw r5
            L_0x045b:
                lh0.v r2 = r0.f60733b
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$enhance$containsFunctionN$3 r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$enhance$containsFunctionN$3.f60746b
                boolean r2 = lh0.C24299r0.m60971c(r2, r3)
            L_0x0463:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.this
                pg0.c r3 = r3.f60731c
                lh0.v r4 = r0.f60733b
                if (r9 != 0) goto L_0x046c
                goto L_0x046d
            L_0x046c:
                r1 = r9
            L_0x046d:
                boolean r5 = r0.f60739h
                r3.getClass()
                mf0.C24362h.m61211f(r4, r11)
                lh0.u0 r4 = r4.mo60450R0()
                r6 = 0
                pg0.c$a r1 = r3.mo61180b(r4, r1, r6, r5)
                lh0.v r1 = r1.f62526a
                if (r1 != 0) goto L_0x048a
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$a r1 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$a
                lh0.v r3 = r0.f60733b
                r1.<init>(r3, r6, r2)
                goto L_0x0491
            L_0x048a:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$a r3 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$a
                r4 = 1
                r3.<init>(r1, r4, r2)
                r1 = r3
            L_0x0491:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.mo59578c(pg0.j, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$a");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$a */
    public static class C23972a {

        /* renamed from: a */
        public final C24307v f60741a;

        /* renamed from: b */
        public final boolean f60742b;

        /* renamed from: c */
        public final boolean f60743c;

        public C23972a(C24307v vVar, boolean z, boolean z2) {
            C24362h.m61211f(vVar, "type");
            this.f60741a = vVar;
            this.f60742b = z;
            this.f60743c = z2;
        }
    }

    public SignatureEnhancement(C23922a aVar, JavaTypeEnhancementState javaTypeEnhancementState, C24695c cVar) {
        C24362h.m61211f(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f60729a = aVar;
        this.f60730b = javaTypeEnhancementState;
        this.f60731c = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: jg0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: jg0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: zf0.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: zf0.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: zf0.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: cg0.e0} */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02a7, code lost:
        if (r6 == false) goto L_0x02aa;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0212  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList mo59573a(kg0.C23780d r26, java.util.Collection r27) {
        /*
            r25 = this;
            r0 = r26
            r1 = r27
            java.lang.String r2 = "c"
            mf0.C24362h.m61211f(r0, r2)
            java.lang.String r2 = "platformSignatures"
            mf0.C24362h.m61211f(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = cf0.C21136j.m49436X(r1, r3)
            r2.<init>(r4)
            java.util.Iterator r1 = r27.iterator()
        L_0x001d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0311
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r4
            boolean r5 = r4 instanceof jg0.C23720a
            if (r5 != 0) goto L_0x002f
            goto L_0x02aa
        L_0x002f:
            r5 = r4
            jg0.a r5 = (jg0.C23720a) r5
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r6 = r5.mo53433p()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r7 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
            r12 = 1
            if (r6 != r7) goto L_0x004b
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r5 = r5.mo53407a()
            java.util.Collection r5 = r5.mo53440d()
            int r5 = r5.size()
            if (r5 != r12) goto L_0x004b
            goto L_0x02aa
        L_0x004b:
            zf0.e r5 = ce0.C21100e.m49349k0(r4)
            r13 = 0
            if (r5 != 0) goto L_0x0057
            ag0.e r5 = r4.getAnnotations()
            goto L_0x00b7
        L_0x0057:
            boolean r6 = r5 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor
            if (r6 == 0) goto L_0x005e
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r5 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor) r5
            goto L_0x005f
        L_0x005e:
            r5 = r13
        L_0x005f:
            if (r5 != 0) goto L_0x0063
            r5 = r13
            goto L_0x006b
        L_0x0063:
            bf0.c r5 = r5.f60640m
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
        L_0x006b:
            if (r5 == 0) goto L_0x0076
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            r6 = 0
            goto L_0x0077
        L_0x0076:
            r6 = 1
        L_0x0077:
            if (r6 == 0) goto L_0x007e
            ag0.e r5 = r4.getAnnotations()
            goto L_0x00b7
        L_0x007e:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = cf0.C21136j.m49436X(r5, r3)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L_0x008b:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00a0
            java.lang.Object r7 = r5.next()
            og0.a r7 = (og0.C24585a) r7
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor r8 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor
            r8.<init>(r0, r7, r12)
            r6.add(r8)
            goto L_0x008b
        L_0x00a0:
            ag0.e r5 = r4.getAnnotations()
            java.util.ArrayList r5 = kotlin.collections.C23825c.m58525v0(r5, r6)
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x00b1
            ag0.e$a$a r5 = ag0.C20989e.C20990a.f52739a
            goto L_0x00b7
        L_0x00b1:
            ag0.f r6 = new ag0.f
            r6.<init>(r5)
            r5 = r6
        L_0x00b7:
            kg0.d r15 = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.m59010c(r0, r5)
            boolean r5 = r4 instanceof jg0.C23724e
            if (r5 == 0) goto L_0x00d5
            r5 = r4
            jg0.e r5 = (jg0.C23724e) r5
            cg0.e0 r5 = r5.f53043w
            if (r5 != 0) goto L_0x00c7
            goto L_0x00cd
        L_0x00c7:
            boolean r6 = r5.f53021f
            if (r6 != 0) goto L_0x00cd
            r6 = 1
            goto L_0x00ce
        L_0x00cd:
            r6 = 0
        L_0x00ce:
            if (r6 == 0) goto L_0x00d5
            mf0.C24362h.m61208c(r5)
            r11 = r5
            goto L_0x00d6
        L_0x00d5:
            r11 = r4
        L_0x00d6:
            r10 = r4
            jg0.a r10 = (jg0.C23720a) r10
            zf0.c0 r5 = r10.mo53423R()
            r9 = 3
            if (r5 == 0) goto L_0x0122
            boolean r5 = r11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C23900c
            if (r5 != 0) goto L_0x00e6
            r5 = r13
            goto L_0x00e7
        L_0x00e6:
            r5 = r11
        L_0x00e7:
            kotlin.reflect.jvm.internal.impl.descriptors.c r5 = (kotlin.reflect.jvm.internal.impl.descriptors.C23900c) r5
            if (r5 != 0) goto L_0x00ed
            r7 = r13
            goto L_0x00f6
        L_0x00ed:
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor$a r6 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.f60601G
            java.lang.Object r5 = r5.mo53439y0(r6)
            zf0.k0 r5 = (zf0.C25452k0) r5
            r7 = r5
        L_0x00f6:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 r16 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1.f60747f
            if (r7 != 0) goto L_0x00fd
            r17 = r15
            goto L_0x0107
        L_0x00fd:
            ag0.e r5 = r7.getAnnotations()
            kg0.d r5 = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.m59010c(r15, r5)
            r17 = r5
        L_0x0107:
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r18 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.VALUE_PARAMETER
            r8 = 0
            r5 = r25
            r6 = r4
            r14 = 3
            r9 = r17
            r17 = r10
            r10 = r18
            r18 = r11
            r11 = r16
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts r5 = r5.mo59577e(r6, r7, r8, r9, r10, r11)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$a r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.m59169d(r5, r13, r14)
            r11 = r5
            goto L_0x0128
        L_0x0122:
            r17 = r10
            r18 = r11
            r14 = 3
            r11 = r13
        L_0x0128:
            boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor
            if (r5 == 0) goto L_0x0130
            r5 = r4
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor r5 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) r5
            goto L_0x0131
        L_0x0130:
            r5 = r13
        L_0x0131:
            if (r5 != 0) goto L_0x0135
            r14 = r13
            goto L_0x014c
        L_0x0135:
            zf0.g r6 = r5.mo53399b()
            zf0.c r6 = (zf0.C25432c) r6
            java.lang.String r5 = p584jl.C17885a.m44474z(r5, r14)
            java.lang.String r5 = p583jk.C17875h.m44291R(r6, r5)
            java.util.LinkedHashMap r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.f60728d
            java.lang.Object r5 = r6.get(r5)
            pg0.g r5 = (pg0.C24701g) r5
            r14 = r5
        L_0x014c:
            if (r14 != 0) goto L_0x014f
            goto L_0x015b
        L_0x014f:
            java.util.List<pg0.j> r5 = r14.f62540b
            r5.size()
            java.util.List r5 = r17.mo53442h()
            r5.size()
        L_0x015b:
            r10 = r25
            kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState r5 = r10.f60730b
            java.lang.String r6 = "javaTypeEnhancementState"
            mf0.C24362h.m61211f(r5, r6)
            lf0.l<ug0.c, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> r5 = r5.f60554b
            ug0.c r6 = hg0.C23476l.f59258a
            java.lang.Object r5 = r5.invoke(r6)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r6 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.STRICT
            if (r5 != r6) goto L_0x0172
            r5 = 1
            goto L_0x0173
        L_0x0172:
            r5 = 0
        L_0x0173:
            if (r5 != 0) goto L_0x017d
            kg0.b r5 = r15.f60080a
            kg0.c r5 = r5.f60074t
            r5.mo59009b()
            goto L_0x0196
        L_0x017d:
            boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C23900c
            if (r5 == 0) goto L_0x0191
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor$b r5 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.f60602H
            java.lang.Object r5 = r4.mo53439y0(r5)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r5 = mf0.C24362h.m61206a(r5, r6)
            if (r5 == 0) goto L_0x0191
            r5 = 1
            goto L_0x0192
        L_0x0191:
            r5 = 0
        L_0x0192:
            if (r5 == 0) goto L_0x0196
            r9 = 1
            goto L_0x0197
        L_0x0196:
            r9 = 0
        L_0x0197:
            java.util.List r5 = r18.mo53442h()
            java.lang.String r6 = "annotationOwnerForMember.valueParameters"
            mf0.C24362h.m61210e(r5, r6)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r6 = cf0.C21136j.m49436X(r5, r3)
            r8.<init>(r6)
            java.util.Iterator r16 = r5.iterator()
        L_0x01ad:
            boolean r5 = r16.hasNext()
            if (r5 == 0) goto L_0x020a
            java.lang.Object r5 = r16.next()
            r7 = r5
            zf0.k0 r7 = (zf0.C25452k0) r7
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1 r6 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1
            r6.<init>(r7)
            if (r7 != 0) goto L_0x01c4
            r19 = r15
            goto L_0x01ce
        L_0x01c4:
            ag0.e r5 = r7.getAnnotations()
            kg0.d r5 = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.m59010c(r15, r5)
            r19 = r5
        L_0x01ce:
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r20 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.VALUE_PARAMETER
            r21 = 0
            r5 = r25
            r22 = r6
            r6 = r4
            r23 = r7
            r13 = r8
            r8 = r21
            r3 = r9
            r9 = r19
            r10 = r20
            r24 = r11
            r11 = r22
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts r5 = r5.mo59577e(r6, r7, r8, r9, r10, r11)
            if (r14 != 0) goto L_0x01ed
            r6 = 0
            goto L_0x01f9
        L_0x01ed:
            java.util.List<pg0.j> r6 = r14.f62540b
            int r7 = r23.getIndex()
            java.lang.Object r6 = kotlin.collections.C23825c.m58516m0(r7, r6)
            pg0.j r6 = (pg0.C24706j) r6
        L_0x01f9:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$a r5 = r5.mo59578c(r6, r3)
            r13.add(r5)
            r10 = r25
            r9 = r3
            r8 = r13
            r11 = r24
            r3 = 10
            r13 = 0
            goto L_0x01ad
        L_0x020a:
            r13 = r8
            r24 = r11
            r8 = 1
            boolean r3 = r4 instanceof zf0.C25491z
            if (r3 != 0) goto L_0x0214
            r3 = 0
            goto L_0x0215
        L_0x0214:
            r3 = r4
        L_0x0215:
            zf0.z r3 = (zf0.C25491z) r3
            if (r3 != 0) goto L_0x021a
            goto L_0x0222
        L_0x021a:
            boolean r3 = p583jk.C17884p.m44339J(r3)
            if (r3 != r12) goto L_0x0222
            r3 = 1
            goto L_0x0223
        L_0x0222:
            r3 = 0
        L_0x0223:
            if (r3 == 0) goto L_0x0228
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r3 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.FIELD
            goto L_0x022a
        L_0x0228:
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r3 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE
        L_0x022a:
            r10 = r3
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1 r11 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.f60748f
            r5 = r25
            r6 = r4
            r7 = r18
            r9 = r15
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts r3 = r5.mo59577e(r6, r7, r8, r9, r10, r11)
            if (r14 != 0) goto L_0x023b
            r5 = 0
            goto L_0x023d
        L_0x023b:
            pg0.j r5 = r14.f62539a
        L_0x023d:
            r6 = 2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$a r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.m59169d(r3, r5, r6)
            r5 = r24
            if (r5 != 0) goto L_0x0247
            goto L_0x024d
        L_0x0247:
            boolean r6 = r5.f60743c
            if (r6 != r12) goto L_0x024d
            r6 = 1
            goto L_0x024e
        L_0x024d:
            r6 = 0
        L_0x024e:
            if (r6 != 0) goto L_0x0277
            boolean r6 = r3.f60743c
            if (r6 != 0) goto L_0x0277
            boolean r6 = r13.isEmpty()
            if (r6 == 0) goto L_0x025b
            goto L_0x0271
        L_0x025b:
            java.util.Iterator r6 = r13.iterator()
        L_0x025f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0271
            java.lang.Object r7 = r6.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$a r7 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.C23972a) r7
            boolean r7 = r7.f60743c
            if (r7 == 0) goto L_0x025f
            r6 = 1
            goto L_0x0272
        L_0x0271:
            r6 = 0
        L_0x0272:
            if (r6 == 0) goto L_0x0275
            goto L_0x0277
        L_0x0275:
            r6 = 0
            goto L_0x0278
        L_0x0277:
            r6 = 1
        L_0x0278:
            if (r5 != 0) goto L_0x027b
            goto L_0x0281
        L_0x027b:
            boolean r7 = r5.f60742b
            if (r7 != r12) goto L_0x0281
            r7 = 1
            goto L_0x0282
        L_0x0281:
            r7 = 0
        L_0x0282:
            if (r7 != 0) goto L_0x02ad
            boolean r7 = r3.f60742b
            if (r7 != 0) goto L_0x02ad
            boolean r7 = r13.isEmpty()
            if (r7 == 0) goto L_0x028f
            goto L_0x02a4
        L_0x028f:
            java.util.Iterator r7 = r13.iterator()
        L_0x0293:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x02a4
            java.lang.Object r8 = r7.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$a r8 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.C23972a) r8
            boolean r8 = r8.f60742b
            if (r8 == 0) goto L_0x0293
            goto L_0x02a5
        L_0x02a4:
            r12 = 0
        L_0x02a5:
            if (r12 != 0) goto L_0x02ad
            if (r6 == 0) goto L_0x02aa
            goto L_0x02ad
        L_0x02aa:
            r7 = 10
            goto L_0x030a
        L_0x02ad:
            if (r6 == 0) goto L_0x02bc
            ah0.a$a r6 = ah0.C20995a.f52743a
            g3.a r7 = new g3.a
            r7.<init>((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r4)
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r6, r7)
            goto L_0x02bd
        L_0x02bc:
            r4 = 0
        L_0x02bd:
            if (r5 != 0) goto L_0x02c1
            r5 = 0
            goto L_0x02c3
        L_0x02c1:
            lh0.v r5 = r5.f60741a
        L_0x02c3:
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r8 = cf0.C21136j.m49436X(r13, r7)
            r6.<init>(r8)
            java.util.Iterator r8 = r13.iterator()
            r14 = 0
        L_0x02d3:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0302
            java.lang.Object r9 = r8.next()
            int r10 = r14 + 1
            if (r14 < 0) goto L_0x02fd
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$a r9 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.C23972a) r9
            jg0.g r11 = new jg0.g
            lh0.v r9 = r9.f60741a
            java.util.List r12 = r18.mo53442h()
            java.lang.Object r12 = r12.get(r14)
            zf0.k0 r12 = (zf0.C25452k0) r12
            boolean r12 = r12.mo59462F0()
            r11.<init>(r9, r12)
            r6.add(r11)
            r14 = r10
            goto L_0x02d3
        L_0x02fd:
            p583jk.C17875h.m44294U()
            r0 = 0
            throw r0
        L_0x0302:
            lh0.v r3 = r3.f60741a
            r8 = r17
            jg0.a r4 = r8.mo58951A0(r5, r6, r3, r4)
        L_0x030a:
            r2.add(r4)
            r3 = 10
            goto L_0x001d
        L_0x0311:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.mo59573a(kg0.d, java.util.Collection):java.util.ArrayList");
    }

    /* renamed from: b */
    public final ArrayList mo59574b(C21174i iVar, List list, C23780d dVar) {
        List list2 = list;
        C24362h.m61211f(iVar, "typeParameter");
        C24362h.m61211f(list2, "bounds");
        C24362h.m61211f(dVar, AppActionRequest.KEY_CONTEXT);
        ArrayList arrayList = new ArrayList(C21136j.m49436X(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C24307v vVar = (C24307v) it.next();
            if (!TypeUtilsKt.m60517b(vVar, SignatureEnhancement$enhanceTypeParameterBounds$1$1.f60750f)) {
                vVar = SignatureParts.m59169d(new SignatureParts(iVar, vVar, EmptyList.f60173b, false, dVar, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, true, false, RecyclerView.C1119a0.FLAG_IGNORE), (C24706j) null, 3).f60741a;
            }
            arrayList.add(vVar);
        }
        return arrayList;
    }

    /* renamed from: c */
    public final C24700f mo59575c(C20986c cVar, boolean z, boolean z2) {
        C24700f d;
        C24362h.m61211f(cVar, "annotationDescriptor");
        C24700f d2 = mo59576d(cVar, z, z2);
        if (d2 != null) {
            return d2;
        }
        C20986c d3 = this.f60729a.mo59500d(cVar);
        if (d3 == null) {
            return null;
        }
        ReportLevel b = this.f60729a.mo59498b(cVar);
        if (!b.isIgnore() && (d = mo59576d(d3, z, z2)) != null) {
            return C24700f.m62168a(d, (NullabilityQualifier) null, b.isWarning(), 1);
        }
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00df, code lost:
        if (r7.equals("NEVER") == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e8, code lost:
        if (r7.equals("MAYBE") == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00eb, code lost:
        r7 = new pg0.C24700f(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE, r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0136 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0137  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final pg0.C24700f mo59576d(ag0.C20986c r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            ug0.c r0 = r6.mo53066f()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r2 = r6 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001b
            r2 = r6
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor r2 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor) r2
            boolean r2 = r2.f60635h
            if (r2 != 0) goto L_0x0017
            if (r8 == 0) goto L_0x001b
        L_0x0017:
            if (r7 != 0) goto L_0x001b
            r7 = 1
            goto L_0x001c
        L_0x001b:
            r7 = 0
        L_0x001c:
            kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState r8 = r5.f60730b
            lf0.l<ug0.c, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> r8 = r8.f60554b
            java.lang.Object r8 = r8.invoke(r0)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r8 = (kotlin.reflect.jvm.internal.impl.load.java.ReportLevel) r8
            boolean r2 = r8.isIgnore()
            if (r2 == 0) goto L_0x002e
            goto L_0x0133
        L_0x002e:
            boolean r8 = r8.isWarning()
            if (r8 != 0) goto L_0x0036
            if (r7 == 0) goto L_0x0037
        L_0x0036:
            r3 = 1
        L_0x0037:
            java.util.List<ug0.c> r7 = hg0.C23481q.f59287d
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L_0x0048
            pg0.f r7 = new pg0.f
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            r7.<init>(r8, r3)
            goto L_0x0134
        L_0x0048:
            java.util.List<ug0.c> r7 = hg0.C23481q.f59290g
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L_0x0059
            pg0.f r7 = new pg0.f
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            r7.<init>(r8, r3)
            goto L_0x0134
        L_0x0059:
            ug0.c r7 = hg0.C23481q.f59284a
            boolean r7 = mf0.C24362h.m61206a(r0, r7)
            if (r7 == 0) goto L_0x006a
            pg0.f r7 = new pg0.f
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            r7.<init>(r8, r3)
            goto L_0x0134
        L_0x006a:
            ug0.c r7 = hg0.C23481q.f59285b
            boolean r7 = mf0.C24362h.m61206a(r0, r7)
            if (r7 == 0) goto L_0x007b
            pg0.f r7 = new pg0.f
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            r7.<init>(r8, r3)
            goto L_0x0134
        L_0x007b:
            ug0.c r7 = hg0.C23481q.f59288e
            boolean r7 = mf0.C24362h.m61206a(r0, r7)
            if (r7 == 0) goto L_0x00f3
            int r7 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.f61206a
            java.util.Map r7 = r6.mo53067g()
            java.util.Collection r7 = r7.values()
            java.lang.Object r7 = kotlin.collections.C23825c.m58514k0(r7)
            zg0.g r7 = (zg0.C25498g) r7
            boolean r8 = r7 instanceof zg0.C25500i
            if (r8 == 0) goto L_0x009a
            zg0.i r7 = (zg0.C25500i) r7
            goto L_0x009b
        L_0x009a:
            r7 = r1
        L_0x009b:
            if (r7 != 0) goto L_0x00a6
            pg0.f r7 = new pg0.f
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            r7.<init>(r8, r3)
            goto L_0x0134
        L_0x00a6:
            ug0.e r7 = r7.f63776c
            java.lang.String r7 = r7.mo61604f()
            int r8 = r7.hashCode()
            switch(r8) {
                case 73135176: goto L_0x00e2;
                case 74175084: goto L_0x00d9;
                case 433141802: goto L_0x00c8;
                case 1933739535: goto L_0x00b5;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            goto L_0x0133
        L_0x00b5:
            java.lang.String r8 = "ALWAYS"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00bf
            goto L_0x0133
        L_0x00bf:
            pg0.f r7 = new pg0.f
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            r7.<init>(r8, r3)
            goto L_0x0134
        L_0x00c8:
            java.lang.String r8 = "UNKNOWN"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00d1
            goto L_0x0133
        L_0x00d1:
            pg0.f r7 = new pg0.f
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            r7.<init>(r8, r3)
            goto L_0x0134
        L_0x00d9:
            java.lang.String r8 = "NEVER"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00eb
            goto L_0x0133
        L_0x00e2:
            java.lang.String r8 = "MAYBE"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00eb
            goto L_0x0133
        L_0x00eb:
            pg0.f r7 = new pg0.f
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            r7.<init>(r8, r3)
            goto L_0x0134
        L_0x00f3:
            ug0.c r7 = hg0.C23481q.f59291h
            boolean r7 = mf0.C24362h.m61206a(r0, r7)
            if (r7 == 0) goto L_0x0103
            pg0.f r7 = new pg0.f
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            r7.<init>(r8, r3)
            goto L_0x0134
        L_0x0103:
            ug0.c r7 = hg0.C23481q.f59292i
            boolean r7 = mf0.C24362h.m61206a(r0, r7)
            if (r7 == 0) goto L_0x0113
            pg0.f r7 = new pg0.f
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            r7.<init>(r8, r3)
            goto L_0x0134
        L_0x0113:
            ug0.c r7 = hg0.C23481q.f59294k
            boolean r7 = mf0.C24362h.m61206a(r0, r7)
            if (r7 == 0) goto L_0x0123
            pg0.f r7 = new pg0.f
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            r7.<init>(r8, r3)
            goto L_0x0134
        L_0x0123:
            ug0.c r7 = hg0.C23481q.f59293j
            boolean r7 = mf0.C24362h.m61206a(r0, r7)
            if (r7 == 0) goto L_0x0133
            pg0.f r7 = new pg0.f
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            r7.<init>(r8, r3)
            goto L_0x0134
        L_0x0133:
            r7 = r1
        L_0x0134:
            if (r7 != 0) goto L_0x0137
            return r1
        L_0x0137:
            boolean r8 = r7.f62538b
            if (r8 != 0) goto L_0x014b
            boolean r8 = r6 instanceof jg0.C23725f
            if (r8 == 0) goto L_0x014b
            jg0.f r6 = (jg0.C23725f) r6
            boolean r6 = r6.mo58955i()
            if (r6 == 0) goto L_0x014b
            pg0.f r7 = pg0.C24700f.m62168a(r7, r1, r4, r4)
        L_0x014b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.mo59576d(ag0.c, boolean, boolean):pg0.f");
    }

    /* renamed from: e */
    public final SignatureParts mo59577e(CallableMemberDescriptor callableMemberDescriptor, C20984a aVar, boolean z, C23780d dVar, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, C24236l<? super CallableMemberDescriptor, ? extends C24307v> lVar) {
        CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
        C24236l<? super CallableMemberDescriptor, ? extends C24307v> lVar2 = lVar;
        C24307v vVar = (C24307v) lVar2.invoke(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> d = callableMemberDescriptor.mo53440d();
        C24362h.m61210e(d, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C21136j.m49436X(d, 10));
        for (CallableMemberDescriptor callableMemberDescriptor3 : d) {
            C24362h.m61210e(callableMemberDescriptor3, "it");
            arrayList.add((C24307v) lVar2.invoke(callableMemberDescriptor3));
        }
        return new SignatureParts(aVar, vVar, arrayList, z, ContextKt.m59010c(dVar, ((C24307v) lVar2.invoke(callableMemberDescriptor)).getAnnotations()), annotationQualifierApplicabilityType, false, false, 192);
    }
}
