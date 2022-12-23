package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.appboy.support.AppboyFileUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C23816b;
import kotlin.collections.C23825c;
import kotlin.collections.C23826d;
import p583jk.C17875h;

public enum KotlinTarget {
    CLASS("class", false, 2, (boolean) null),
    ANNOTATION_CLASS("annotation class", false, 2, (boolean) null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, (boolean) null),
    FIELD("field", false, 2, (boolean) null),
    LOCAL_VARIABLE("local variable", false, 2, (boolean) null),
    VALUE_PARAMETER("value parameter", false, 2, (boolean) null),
    CONSTRUCTOR("constructor", false, 2, (boolean) null),
    FUNCTION("function", false, 2, (boolean) null),
    PROPERTY_GETTER("getter", false, 2, (boolean) null),
    PROPERTY_SETTER("setter", false, 2, (boolean) null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE(AppboyFileUtils.FILE_SCHEME, false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY("class", false),
    OBJECT("object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);
    
    private static final Set<KotlinTarget> ALL_TARGET_SET = null;
    private static final List<KotlinTarget> ANNOTATION_CLASS_LIST = null;
    private static final List<KotlinTarget> CLASS_LIST = null;
    private static final List<KotlinTarget> COMPANION_OBJECT_LIST = null;
    public static final C23897a Companion = null;
    private static final Set<KotlinTarget> DEFAULT_TARGET_SET = null;
    private static final List<KotlinTarget> ENUM_ENTRY_LIST = null;
    private static final List<KotlinTarget> ENUM_LIST = null;
    private static final List<KotlinTarget> FILE_LIST = null;
    private static final List<KotlinTarget> FUNCTION_LIST = null;
    private static final List<KotlinTarget> INTERFACE_LIST = null;
    private static final List<KotlinTarget> LOCAL_CLASS_LIST = null;
    private static final List<KotlinTarget> OBJECT_LIST = null;
    private static final List<KotlinTarget> PROPERTY_GETTER_LIST = null;
    private static final List<KotlinTarget> PROPERTY_SETTER_LIST = null;
    private static final Map<AnnotationUseSiteTarget, KotlinTarget> USE_SITE_MAPPING = null;
    private static final HashMap<String, KotlinTarget> map = null;
    private final String description;
    private final boolean isDefault;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget$a */
    public static final class C23897a {
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C23897a();
        map = new HashMap<>();
        KotlinTarget[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            KotlinTarget kotlinTarget = values[i];
            i++;
            map.put(kotlinTarget.name(), kotlinTarget);
        }
        KotlinTarget[] values2 = values();
        ArrayList arrayList = new ArrayList();
        int length2 = values2.length;
        int i2 = 0;
        while (i2 < length2) {
            KotlinTarget kotlinTarget2 = values2[i2];
            i2++;
            if (kotlinTarget2.isDefault()) {
                arrayList.add(kotlinTarget2);
            }
        }
        DEFAULT_TARGET_SET = C23825c.m58503O0(arrayList);
        ALL_TARGET_SET = C23816b.m58453i1(values());
        KotlinTarget kotlinTarget3 = CLASS;
        ANNOTATION_CLASS_LIST = C17875h.m44281E(ANNOTATION_CLASS, kotlinTarget3);
        LOCAL_CLASS_LIST = C17875h.m44281E(LOCAL_CLASS, kotlinTarget3);
        CLASS_LIST = C17875h.m44281E(CLASS_ONLY, kotlinTarget3);
        KotlinTarget kotlinTarget4 = OBJECT;
        COMPANION_OBJECT_LIST = C17875h.m44281E(COMPANION_OBJECT, kotlinTarget4, kotlinTarget3);
        OBJECT_LIST = C17875h.m44281E(kotlinTarget4, kotlinTarget3);
        INTERFACE_LIST = C17875h.m44281E(INTERFACE, kotlinTarget3);
        ENUM_LIST = C17875h.m44281E(ENUM_CLASS, kotlinTarget3);
        KotlinTarget kotlinTarget5 = PROPERTY;
        KotlinTarget kotlinTarget6 = FIELD;
        ENUM_ENTRY_LIST = C17875h.m44281E(ENUM_ENTRY, kotlinTarget5, kotlinTarget6);
        KotlinTarget kotlinTarget7 = PROPERTY_SETTER;
        PROPERTY_SETTER_LIST = C17875h.m44280D(kotlinTarget7);
        KotlinTarget kotlinTarget8 = PROPERTY_GETTER;
        PROPERTY_GETTER_LIST = C17875h.m44280D(kotlinTarget8);
        FUNCTION_LIST = C17875h.m44280D(FUNCTION);
        KotlinTarget kotlinTarget9 = FILE;
        FILE_LIST = C17875h.m44280D(kotlinTarget9);
        AnnotationUseSiteTarget annotationUseSiteTarget = AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER;
        KotlinTarget kotlinTarget10 = VALUE_PARAMETER;
        USE_SITE_MAPPING = C23826d.m58533X(new Pair(annotationUseSiteTarget, kotlinTarget10), new Pair(AnnotationUseSiteTarget.FIELD, kotlinTarget6), new Pair(AnnotationUseSiteTarget.PROPERTY, kotlinTarget5), new Pair(AnnotationUseSiteTarget.FILE, kotlinTarget9), new Pair(AnnotationUseSiteTarget.PROPERTY_GETTER, kotlinTarget8), new Pair(AnnotationUseSiteTarget.PROPERTY_SETTER, kotlinTarget7), new Pair(AnnotationUseSiteTarget.RECEIVER, kotlinTarget10), new Pair(AnnotationUseSiteTarget.SETTER_PARAMETER, kotlinTarget10), new Pair(AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD, kotlinTarget6));
    }

    private KotlinTarget(String str, boolean z) {
        this.description = str;
        this.isDefault = z;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }
}
