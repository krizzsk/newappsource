package kotlin.reflect.jvm.internal.impl.builtins;

import bf0.C21049c;
import java.util.Set;
import kotlin.C23812a;
import kotlin.LazyThreadSafetyMode;
import mf0.C24362h;
import p583jk.C17884p;
import ug0.C25066c;
import ug0.C25069e;

public enum PrimitiveType {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    
    public static final C23864a Companion = null;
    public static final Set<PrimitiveType> NUMBER_TYPES = null;
    private final C21049c arrayTypeFqName$delegate;
    private final C25069e arrayTypeName;
    private final C21049c typeFqName$delegate;
    private final C25069e typeName;

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$a */
    public static final class C23864a {
    }

    /* access modifiers changed from: public */
    static {
        PrimitiveType primitiveType;
        PrimitiveType primitiveType2;
        PrimitiveType primitiveType3;
        PrimitiveType primitiveType4;
        PrimitiveType primitiveType5;
        PrimitiveType primitiveType6;
        PrimitiveType primitiveType7;
        Companion = new C23864a();
        NUMBER_TYPES = C17884p.m44349T(primitiveType, primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7);
    }

    private PrimitiveType(String str) {
        this.typeName = C25069e.m62820i(str);
        this.arrayTypeName = C25069e.m62820i(C24362h.m61216k("Array", str));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.typeFqName$delegate = C23812a.m58431a(lazyThreadSafetyMode, new PrimitiveType$typeFqName$2(this));
        this.arrayTypeFqName$delegate = C23812a.m58431a(lazyThreadSafetyMode, new PrimitiveType$arrayTypeFqName$2(this));
    }

    public final C25066c getArrayTypeFqName() {
        return (C25066c) this.arrayTypeFqName$delegate.getValue();
    }

    public final C25069e getArrayTypeName() {
        return this.arrayTypeName;
    }

    public final C25066c getTypeFqName() {
        return (C25066c) this.typeFqName$delegate.getValue();
    }

    public final C25069e getTypeName() {
        return this.typeName;
    }
}
