package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import p583jk.C17875h;

public enum AnnotationUseSiteTarget {
    FIELD((String) null, 1, (String) null),
    FILE((String) null, 1, (String) null),
    PROPERTY((String) null, 1, (String) null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER((String) null, 1, (String) null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");
    
    private final String renderName;

    private AnnotationUseSiteTarget(String str) {
        this.renderName = str == null ? C17875h.m44295V(name()) : str;
    }

    public final String getRenderName() {
        return this.renderName;
    }
}
