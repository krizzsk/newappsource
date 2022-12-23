package p406cg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.SortedSet;
import p359ag.C13446c;
import p485fg.C16999b;
import p509gg.C17189a;
import p583jk.C17875h;

/* renamed from: cg.b */
public final class C13810b {

    /* renamed from: a */
    public final Map<Type, C13446c<?>> f33996a;

    /* renamed from: b */
    public final C16999b f33997b = C16999b.f44115a;

    /* renamed from: cg.b$a */
    public class C13811a implements C13821j<T> {

        /* renamed from: b */
        public final /* synthetic */ C13446c f33998b;

        public C13811a(C13446c cVar, Type type) {
            this.f33998b = cVar;
        }

        /* renamed from: g */
        public final T mo40737g() {
            return this.f33998b.mo40325a();
        }
    }

    /* renamed from: cg.b$b */
    public class C13812b implements C13821j<T> {

        /* renamed from: b */
        public final /* synthetic */ C13446c f33999b;

        public C13812b(C13446c cVar, Type type) {
            this.f33999b = cVar;
        }

        /* renamed from: g */
        public final T mo40737g() {
            return this.f33999b.mo40325a();
        }
    }

    public C13810b(Map<Type, C13446c<?>> map) {
        this.f33996a = map;
    }

    /* renamed from: a */
    public final <T> C13821j<T> mo40738a(C17189a<T> aVar) {
        C13813c cVar;
        Type type = aVar.f44432b;
        Class<? super T> cls = aVar.f44431a;
        C13446c cVar2 = this.f33996a.get(type);
        if (cVar2 != null) {
            return new C13811a(cVar2, type);
        }
        C13446c cVar3 = this.f33996a.get(cls);
        if (cVar3 != null) {
            return new C13812b(cVar3, type);
        }
        C13821j<T> jVar = null;
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f33997b.mo49636a(declaredConstructor);
            }
            cVar = new C13813c(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            cVar = null;
        }
        if (cVar != null) {
            return cVar;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                new C17875h
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0054: CONSTRUCTOR  (r1v35 ? I:jk.h) =  call: jk.h.<init>():void type: CONSTRUCTOR in method: cg.b.a(gg.a):cg.j<T>, dex: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v35 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 51 more
                    */
                /*
                    this = this;
                    java.lang.reflect.Type r0 = r6.f44432b
                    java.lang.Class<? super T> r6 = r6.f44431a
                    java.util.Map<java.lang.reflect.Type, ag.c<?>> r1 = r5.f33996a
                    java.lang.Object r1 = r1.get(r0)
                    ag.c r1 = (p359ag.C13446c) r1
                    if (r1 == 0) goto L_0x0014
                    cg.b$a r6 = new cg.b$a
                    r6.<init>(r1, r0)
                    return r6
                L_0x0014:
                    java.util.Map<java.lang.reflect.Type, ag.c<?>> r1 = r5.f33996a
                    java.lang.Object r1 = r1.get(r6)
                    ag.c r1 = (p359ag.C13446c) r1
                    if (r1 == 0) goto L_0x0024
                    cg.b$b r6 = new cg.b$b
                    r6.<init>(r1, r0)
                    return r6
                L_0x0024:
                    r1 = 0
                    r2 = 0
                    java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x003d }
                    java.lang.reflect.Constructor r3 = r6.getDeclaredConstructor(r3)     // Catch:{ NoSuchMethodException -> 0x003d }
                    boolean r4 = r3.isAccessible()     // Catch:{ NoSuchMethodException -> 0x003d }
                    if (r4 != 0) goto L_0x0037
                    fg.b r4 = r5.f33997b     // Catch:{ NoSuchMethodException -> 0x003d }
                    r4.mo49636a(r3)     // Catch:{ NoSuchMethodException -> 0x003d }
                L_0x0037:
                    cg.c r4 = new cg.c     // Catch:{ NoSuchMethodException -> 0x003d }
                    r4.<init>(r3)     // Catch:{ NoSuchMethodException -> 0x003d }
                    goto L_0x003f
                L_0x003d:
                    r4 = r1
                L_0x003f:
                    if (r4 == 0) goto L_0x0042
                    return r4
                L_0x0042:
                    java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
                    boolean r3 = r3.isAssignableFrom(r6)
                    if (r3 == 0) goto L_0x008b
                    java.lang.Class<java.util.SortedSet> r1 = java.util.SortedSet.class
                    boolean r1 = r1.isAssignableFrom(r6)
                    if (r1 == 0) goto L_0x0059
                    jk.h r1 = new jk.h
                    r1.<init>()
                    goto L_0x00eb
                L_0x0059:
                    java.lang.Class<java.util.EnumSet> r1 = java.util.EnumSet.class
                    boolean r1 = r1.isAssignableFrom(r6)
                    if (r1 == 0) goto L_0x0068
                    cg.d r1 = new cg.d
                    r1.<init>(r0)
                    goto L_0x00eb
                L_0x0068:
                    java.lang.Class<java.util.Set> r1 = java.util.Set.class
                    boolean r1 = r1.isAssignableFrom(r6)
                    if (r1 == 0) goto L_0x0077
                    cg.e r1 = new cg.e
                    r1.<init>()
                    goto L_0x00eb
                L_0x0077:
                    java.lang.Class<java.util.Queue> r1 = java.util.Queue.class
                    boolean r1 = r1.isAssignableFrom(r6)
                    if (r1 == 0) goto L_0x0085
                    jl.b r1 = new jl.b
                    r1.<init>()
                    goto L_0x00eb
                L_0x0085:
                    cg.f r1 = new cg.f
                    r1.<init>()
                    goto L_0x00eb
                L_0x008b:
                    java.lang.Class<java.util.Map> r3 = java.util.Map.class
                    boolean r3 = r3.isAssignableFrom(r6)
                    if (r3 == 0) goto L_0x00eb
                    java.lang.Class<java.util.concurrent.ConcurrentNavigableMap> r1 = java.util.concurrent.ConcurrentNavigableMap.class
                    boolean r1 = r1.isAssignableFrom(r6)
                    if (r1 == 0) goto L_0x00a1
                    km.c r1 = new km.c
                    r1.<init>()
                    goto L_0x00eb
                L_0x00a1:
                    java.lang.Class<java.util.concurrent.ConcurrentMap> r1 = java.util.concurrent.ConcurrentMap.class
                    boolean r1 = r1.isAssignableFrom(r6)
                    if (r1 == 0) goto L_0x00af
                    jl.a r1 = new jl.a
                    r1.<init>()
                    goto L_0x00eb
                L_0x00af:
                    java.lang.Class<java.util.SortedMap> r1 = java.util.SortedMap.class
                    boolean r1 = r1.isAssignableFrom(r6)
                    if (r1 == 0) goto L_0x00bd
                    lf.b r1 = new lf.b
                    r1.<init>()
                    goto L_0x00eb
                L_0x00bd:
                    boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
                    if (r1 == 0) goto L_0x00e6
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r3 = r0
                    java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
                    java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
                    r2 = r3[r2]
                    r2.getClass()
                    java.lang.reflect.Type r2 = com.google.gson.internal.C$Gson$Types.m36262a(r2)
                    java.lang.Class r3 = com.google.gson.internal.C$Gson$Types.m36266e(r2)
                    r2.hashCode()
                    boolean r1 = r1.isAssignableFrom(r3)
                    if (r1 != 0) goto L_0x00e6
                    mf0.g r1 = new mf0.g
                    r1.<init>()
                    goto L_0x00eb
                L_0x00e6:
                    um.a r1 = new um.a
                    r1.<init>()
                L_0x00eb:
                    if (r1 == 0) goto L_0x00ee
                    return r1
                L_0x00ee:
                    cg.a r1 = new cg.a
                    r1.<init>(r6, r0)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: p406cg.C13810b.mo40738a(gg.a):cg.j");
            }

            public final String toString() {
                return this.f33996a.toString();
            }
        }
