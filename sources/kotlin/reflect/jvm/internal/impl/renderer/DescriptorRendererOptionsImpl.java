package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import mf0.C24362h;
import mf0.C24365j;
import sf0.C24866j;
import ug0.C25066c;
import wg0.C25145a;
import wg0.C25149b;
import wg0.C25150c;
import wg0.C25151d;

public final class DescriptorRendererOptionsImpl implements C25149b {

    /* renamed from: W */
    public static final /* synthetic */ C24866j<Object>[] f61130W;

    /* renamed from: A */
    public final C25150c f61131A;

    /* renamed from: B */
    public final C25150c f61132B;

    /* renamed from: C */
    public final C25150c f61133C;

    /* renamed from: D */
    public final C25150c f61134D;

    /* renamed from: E */
    public final C25150c f61135E;

    /* renamed from: F */
    public final C25150c f61136F;

    /* renamed from: G */
    public final C25150c f61137G;

    /* renamed from: H */
    public final C25150c f61138H;

    /* renamed from: I */
    public final C25150c f61139I;

    /* renamed from: J */
    public final C25150c f61140J;

    /* renamed from: K */
    public final C25150c f61141K;

    /* renamed from: L */
    public final C25150c f61142L;

    /* renamed from: M */
    public final C25150c f61143M;

    /* renamed from: N */
    public final C25150c f61144N;

    /* renamed from: O */
    public final C25150c f61145O;

    /* renamed from: P */
    public final C25150c f61146P;

    /* renamed from: Q */
    public final C25150c f61147Q;

    /* renamed from: R */
    public final C25150c f61148R;

    /* renamed from: S */
    public final C25150c f61149S;

    /* renamed from: T */
    public final C25150c f61150T;

    /* renamed from: U */
    public final C25150c f61151U;

    /* renamed from: V */
    public final C25150c f61152V;

    /* renamed from: a */
    public boolean f61153a;

    /* renamed from: b */
    public final C25150c f61154b = new C25150c(C25145a.C25148c.f63425a, this);

    /* renamed from: c */
    public final C25150c f61155c;

    /* renamed from: d */
    public final C25150c f61156d;

    /* renamed from: e */
    public final C25150c f61157e;

    /* renamed from: f */
    public final C25150c f61158f;

    /* renamed from: g */
    public final C25150c f61159g;

    /* renamed from: h */
    public final C25150c f61160h;

    /* renamed from: i */
    public final C25150c f61161i;

    /* renamed from: j */
    public final C25150c f61162j;

    /* renamed from: k */
    public final C25150c f61163k;

    /* renamed from: l */
    public final C25150c f61164l;

    /* renamed from: m */
    public final C25150c f61165m;

    /* renamed from: n */
    public final C25150c f61166n;

    /* renamed from: o */
    public final C25150c f61167o;

    /* renamed from: p */
    public final C25150c f61168p;

    /* renamed from: q */
    public final C25150c f61169q;

    /* renamed from: r */
    public final C25150c f61170r;

    /* renamed from: s */
    public final C25150c f61171s;

    /* renamed from: t */
    public final C25150c f61172t;

    /* renamed from: u */
    public final C25150c f61173u;

    /* renamed from: v */
    public final C25150c f61174v;

    /* renamed from: w */
    public final C25150c f61175w;

    /* renamed from: x */
    public final C25150c f61176x;

    /* renamed from: y */
    public final C25150c f61177y;

    /* renamed from: z */
    public final C25150c f61178z;

    static {
        Class<DescriptorRendererOptionsImpl> cls = DescriptorRendererOptionsImpl.class;
        f61130W = new C24866j[]{C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "withDefinedIn", "getWithDefinedIn()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "modifiers", "getModifiers()Ljava/util/Set;")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "startFromName", "getStartFromName()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "debugMode", "getDebugMode()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "verbose", "getVerbose()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "unitReturnType", "getUnitReturnType()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "withoutReturnType", "getWithoutReturnType()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "enhancedTypes", "getEnhancedTypes()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "normalizedVisibilities", "getNormalizedVisibilities()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "renderDefaultModality", "getRenderDefaultModality()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "includePropertyConstant", "getIncludePropertyConstant()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "withoutTypeParameters", "getWithoutTypeParameters()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "withoutSuperTypes", "getWithoutSuperTypes()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "receiverAfterName", "getReceiverAfterName()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "renderTypeExpansions", "getRenderTypeExpansions()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "renderFunctionContracts", "getRenderFunctionContracts()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), C24365j.m61220b(new MutablePropertyReference1Impl(C24365j.m61219a(cls), "informativeErrorType", "getInformativeErrorType()Z"))};
    }

    public DescriptorRendererOptionsImpl() {
        Boolean bool = Boolean.TRUE;
        this.f61155c = new C25150c(bool, this);
        this.f61156d = new C25150c(bool, this);
        this.f61157e = new C25150c(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS, this);
        Boolean bool2 = Boolean.FALSE;
        this.f61158f = new C25150c(bool2, this);
        this.f61159g = new C25150c(bool2, this);
        this.f61160h = new C25150c(bool2, this);
        this.f61161i = new C25150c(bool2, this);
        this.f61162j = new C25150c(bool2, this);
        this.f61163k = new C25150c(bool, this);
        this.f61164l = new C25150c(bool2, this);
        this.f61165m = new C25150c(bool2, this);
        this.f61166n = new C25150c(bool2, this);
        this.f61167o = new C25150c(bool, this);
        this.f61168p = new C25150c(bool, this);
        this.f61169q = new C25150c(bool2, this);
        this.f61170r = new C25150c(bool2, this);
        this.f61171s = new C25150c(bool2, this);
        this.f61172t = new C25150c(bool2, this);
        this.f61173u = new C25150c(bool2, this);
        this.f61174v = new C25150c(bool2, this);
        this.f61175w = new C25150c(bool2, this);
        this.f61176x = new C25150c(DescriptorRendererOptionsImpl$typeNormalizer$2.f61180f, this);
        this.f61177y = new C25150c(DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2.f61179f, this);
        this.f61178z = new C25150c(bool, this);
        this.f61131A = new C25150c(OverrideRenderingPolicy.RENDER_OPEN, this);
        this.f61132B = new C25150c(DescriptorRenderer.C24102b.C24103a.f61109a, this);
        this.f61133C = new C25150c(RenderingFormat.PLAIN, this);
        this.f61134D = new C25150c(ParameterNameRenderingPolicy.ALL, this);
        this.f61135E = new C25150c(bool2, this);
        this.f61136F = new C25150c(bool2, this);
        this.f61137G = new C25150c(PropertyAccessorRenderingPolicy.DEBUG, this);
        this.f61138H = new C25150c(bool2, this);
        this.f61139I = new C25150c(bool2, this);
        this.f61140J = new C25150c(EmptySet.f60175b, this);
        this.f61141K = new C25150c(C25151d.f63428a, this);
        this.f61142L = new C25150c((Object) null, this);
        this.f61143M = new C25150c(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS, this);
        this.f61144N = new C25150c(bool2, this);
        this.f61145O = new C25150c(bool, this);
        this.f61146P = new C25150c(bool, this);
        this.f61147Q = new C25150c(bool2, this);
        this.f61148R = new C25150c(bool, this);
        this.f61149S = new C25150c(bool, this);
        this.f61150T = new C25150c(bool2, this);
        this.f61151U = new C25150c(bool2, this);
        this.f61152V = new C25150c(bool, this);
    }

    /* renamed from: a */
    public final void mo60121a() {
        this.f61135E.mo60855c(Boolean.TRUE, f61130W[29]);
    }

    /* renamed from: b */
    public final void mo60123b() {
        this.f61136F.mo60855c(Boolean.TRUE, f61130W[30]);
    }

    /* renamed from: c */
    public final void mo60125c(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        C24362h.m61211f(parameterNameRenderingPolicy, "<set-?>");
        this.f61134D.mo60855c(parameterNameRenderingPolicy, f61130W[28]);
    }

    /* renamed from: d */
    public final boolean mo60127d() {
        return ((Boolean) this.f61165m.mo60854b(f61130W[11])).booleanValue();
    }

    /* renamed from: e */
    public final void mo60129e() {
        this.f61174v.mo60855c(Boolean.TRUE, f61130W[20]);
    }

    /* renamed from: f */
    public final void mo60131f(C25145a aVar) {
        this.f61154b.mo60855c(aVar, f61130W[0]);
    }

    /* renamed from: g */
    public final void mo60133g(RenderingFormat renderingFormat) {
        C24362h.m61211f(renderingFormat, "<set-?>");
        this.f61133C.mo60855c(renderingFormat, f61130W[27]);
    }

    /* renamed from: h */
    public final void mo60135h() {
        this.f61158f.mo60855c(Boolean.TRUE, f61130W[4]);
    }

    /* renamed from: i */
    public final Set<C25066c> mo60137i() {
        return (Set) this.f61141K.mo60854b(f61130W[35]);
    }

    /* renamed from: j */
    public final boolean mo60139j() {
        return ((Boolean) this.f61160h.mo60854b(f61130W[6])).booleanValue();
    }

    /* renamed from: k */
    public final void mo60141k() {
        this.f61175w.mo60855c(Boolean.TRUE, f61130W[21]);
    }

    /* renamed from: l */
    public final void mo60142l() {
        this.f61160h.mo60855c(Boolean.TRUE, f61130W[6]);
    }

    /* renamed from: m */
    public final void mo60143m(Set<? extends DescriptorRendererModifier> set) {
        C24362h.m61211f(set, "<set-?>");
        this.f61157e.mo60855c(set, f61130W[3]);
    }

    /* renamed from: n */
    public final void mo60144n(LinkedHashSet linkedHashSet) {
        this.f61141K.mo60855c(linkedHashSet, f61130W[35]);
    }

    /* renamed from: o */
    public final void mo60145o() {
        this.f61155c.mo60855c(Boolean.FALSE, f61130W[1]);
    }

    /* renamed from: p */
    public final AnnotationArgumentsRenderingPolicy mo60166p() {
        return (AnnotationArgumentsRenderingPolicy) this.f61143M.mo60854b(f61130W[37]);
    }
}
