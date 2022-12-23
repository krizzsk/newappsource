package kotlin.reflect.jvm.internal.impl.builtins;

import mf0.C24362h;
import ug0.C25065b;
import ug0.C25069e;

public enum UnsignedType {
    UBYTE(C25065b.m62788e("kotlin/UByte")),
    USHORT(C25065b.m62788e("kotlin/UShort")),
    UINT(C25065b.m62788e("kotlin/UInt")),
    ULONG(C25065b.m62788e("kotlin/ULong"));
    
    private final C25065b arrayClassId;
    private final C25065b classId;
    private final C25069e typeName;

    private UnsignedType(C25065b bVar) {
        this.classId = bVar;
        C25069e j = bVar.mo61577j();
        C24362h.m61210e(j, "classId.shortClassName");
        this.typeName = j;
        this.arrayClassId = new C25065b(bVar.mo61574h(), C25069e.m62820i(C24362h.m61216k("Array", j.mo61604f())));
    }

    public final C25065b getArrayClassId() {
        return this.arrayClassId;
    }

    public final C25065b getClassId() {
        return this.classId;
    }

    public final C25069e getTypeName() {
        return this.typeName;
    }
}
