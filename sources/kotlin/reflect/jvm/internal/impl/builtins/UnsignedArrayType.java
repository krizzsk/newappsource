package kotlin.reflect.jvm.internal.impl.builtins;

import mf0.C24362h;
import ug0.C25065b;
import ug0.C25069e;

public enum UnsignedArrayType {
    UBYTEARRAY(C25065b.m62788e("kotlin/UByteArray")),
    USHORTARRAY(C25065b.m62788e("kotlin/UShortArray")),
    UINTARRAY(C25065b.m62788e("kotlin/UIntArray")),
    ULONGARRAY(C25065b.m62788e("kotlin/ULongArray"));
    
    private final C25065b classId;
    private final C25069e typeName;

    private UnsignedArrayType(C25065b bVar) {
        this.classId = bVar;
        C25069e j = bVar.mo61577j();
        C24362h.m61210e(j, "classId.shortClassName");
        this.typeName = j;
    }

    public final C25069e getTypeName() {
        return this.typeName;
    }
}
