package kotlin.reflect.jvm.internal.impl.builtins;

import ag0.C20989e;
import androidx.recyclerview.widget.RecyclerView;
import bg0.C21051a;
import bg0.C21053b;
import bg0.C21054c;
import ce0.C21100e;
import cg0.C21167e0;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kh0.C23787c;
import kh0.C23789e;
import kh0.C23792h;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23909c;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lh0.C24274i0;
import lh0.C24285n0;
import lh0.C24299r0;
import lh0.C24306u0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25067d;
import ug0.C25069e;
import wf0.C25137a;
import wf0.C25140d;
import wf0.C25141e;
import wf0.C25144h;
import xf0.C25249a;
import xg0.C25260c;
import zf0.C25431b0;
import zf0.C25432c;
import zf0.C25437e;
import zf0.C25442g;
import zf0.C25485t;
import zf0.C25486u;
import zf0.C25487v;
import zf0.C25491z;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.c */
public abstract class C23867c {

    /* renamed from: e */
    public static final C25069e f60309e = C25069e.m62822k("<built-ins module>");

    /* renamed from: a */
    public C23909c f60310a;

    /* renamed from: b */
    public final C23789e<C23868a> f60311b;

    /* renamed from: c */
    public final C23787c<C25069e, C25432c> f60312c;

    /* renamed from: d */
    public final C23792h f60313d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.c$a */
    public static class C23868a {

        /* renamed from: a */
        public final Map<PrimitiveType, C24312z> f60314a;

        /* renamed from: b */
        public final Map<C24307v, C24312z> f60315b;

        /* renamed from: c */
        public final Map<C24312z, C24312z> f60316c;

        public C23868a() {
            throw null;
        }

        public C23868a(EnumMap enumMap, HashMap hashMap, HashMap hashMap2) {
            this.f60314a = enumMap;
            this.f60315b = hashMap;
            this.f60316c = hashMap2;
        }
    }

    public C23867c(LockBasedStorageManager lockBasedStorageManager) {
        this.f60313d = lockBasedStorageManager;
        lockBasedStorageManager.mo59019d(new C25140d(this));
        this.f60311b = lockBasedStorageManager.mo59019d(new C23866b(this));
        this.f60312c = lockBasedStorageManager.mo59020e(new C25141e(this));
    }

    /* renamed from: A */
    public static boolean m58670A(C25442g gVar) {
        if (gVar == null) {
            m58681a(9);
            throw null;
        } else if (C25260c.m63392i(gVar, C25137a.class, false) != null) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: B */
    public static boolean m58671B(C24307v vVar, C25067d dVar) {
        if (vVar == null) {
            m58681a(97);
            throw null;
        } else if (dVar != null) {
            return m58679J(vVar.mo60411O0(), dVar);
        } else {
            m58681a(98);
            throw null;
        }
    }

    /* renamed from: C */
    public static boolean m58672C(C24307v vVar, C25067d dVar) {
        if (dVar == null) {
            m58681a(135);
            throw null;
        } else if (!m58671B(vVar, dVar) || vVar.mo60412P0()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: D */
    public static boolean m58673D(C23900c cVar) {
        if (cVar.mo53407a().getAnnotations().mo53070b1(C23872e.C23873a.f60375m)) {
            return true;
        }
        if (!(cVar instanceof C25491z)) {
            return false;
        }
        C25491z zVar = (C25491z) cVar;
        boolean Q = zVar.mo53526Q();
        C21167e0 getter = zVar.getGetter();
        C25431b0 setter = zVar.getSetter();
        if (getter != null && m58673D(getter)) {
            if (!Q) {
                return true;
            }
            if (setter == null || !m58673D(setter)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public static boolean m58674E(C24307v vVar, C25067d dVar) {
        if (dVar == null) {
            m58681a(106);
            throw null;
        } else if (vVar.mo60412P0() || !m58671B(vVar, dVar)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: F */
    public static boolean m58675F(C24307v vVar) {
        if (vVar == null) {
            m58681a(136);
            throw null;
        } else if (vVar == null) {
            m58681a(138);
            throw null;
        } else if (!m58671B(vVar, C23872e.C23873a.f60363b) || C24299r0.m60975g(vVar)) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m58676G(lh0.C24307v r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x0033
            boolean r1 = r4.mo60412P0()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0032
            lh0.i0 r4 = r4.mo60411O0()
            zf0.e r4 = r4.mo53460o()
            boolean r1 = r4 instanceof zf0.C25432c
            if (r1 == 0) goto L_0x002e
            zf0.c r4 = (zf0.C25432c) r4
            if (r4 == 0) goto L_0x0028
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r4 = m58685u(r4)
            if (r4 == 0) goto L_0x0023
            r4 = 1
            goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            if (r4 == 0) goto L_0x002e
            r4 = 1
            goto L_0x002f
        L_0x0028:
            r4 = 96
            m58681a(r4)
            throw r0
        L_0x002e:
            r4 = 0
        L_0x002f:
            if (r4 == 0) goto L_0x0032
            r2 = 1
        L_0x0032:
            return r2
        L_0x0033:
            r4 = 94
            m58681a(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58676G(lh0.v):boolean");
    }

    /* renamed from: H */
    public static boolean m58677H(C25432c cVar) {
        if (cVar == null) {
            m58681a(107);
            throw null;
        } else if (m58683c(cVar, C23872e.C23873a.f60361a) || m58683c(cVar, C23872e.C23873a.f60363b)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: I */
    public static boolean m58678I(C24307v vVar) {
        return m58674E(vVar, C23872e.C23873a.f60368f);
    }

    /* renamed from: J */
    public static boolean m58679J(C24274i0 i0Var, C25067d dVar) {
        if (i0Var == null) {
            m58681a(101);
            throw null;
        } else if (dVar != null) {
            C25437e o = i0Var.mo53460o();
            if (!(o instanceof C25432c) || !m58683c(o, dVar)) {
                return false;
            }
            return true;
        } else {
            m58681a(102);
            throw null;
        }
    }

    /* renamed from: K */
    public static boolean m58680K(C25442g gVar) {
        if (gVar != null) {
            while (gVar != null) {
                if (gVar instanceof C25486u) {
                    return ((C25486u) gVar).mo53401f().mo61587h(C23872e.f60329h);
                }
                gVar = gVar.mo53399b();
            }
            return false;
        }
        m58681a(10);
        throw null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m58681a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 145:
            case 146:
            case 148:
            case 156:
            case 157:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 53:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case RecyclerView.C1119a0.FLAG_IGNORE:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 147:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 161:
                objArr[0] = "type";
                break;
            case 46:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 160:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKCallable";
                break;
            case 23:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case 30:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case 35:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case 38:
                objArr[1] = "getSet";
                break;
            case 39:
                objArr[1] = "getMutableSet";
                break;
            case 40:
                objArr[1] = "getMap";
                break;
            case 41:
                objArr[1] = "getMutableMap";
                break;
            case 42:
                objArr[1] = "getMapEntry";
                break;
            case 43:
                objArr[1] = "getMutableMapEntry";
                break;
            case 44:
                objArr[1] = "getListIterator";
                break;
            case 45:
                objArr[1] = "getMutableListIterator";
                break;
            case 47:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 48:
                objArr[1] = "getNothingType";
                break;
            case 49:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case 51:
                objArr[1] = "getNullableAnyType";
                break;
            case 52:
                objArr[1] = "getDefaultBound";
                break;
            case 54:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 55:
                objArr[1] = "getNumberType";
                break;
            case 56:
                objArr[1] = "getByteType";
                break;
            case 57:
                objArr[1] = "getShortType";
                break;
            case 58:
                objArr[1] = "getIntType";
                break;
            case 59:
                objArr[1] = "getLongType";
                break;
            case 60:
                objArr[1] = "getFloatType";
                break;
            case 61:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case 63:
                objArr[1] = "getBooleanType";
                break;
            case 64:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = "getArrayElementType";
                break;
            case 74:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 81:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
                objArr[1] = "getAnnotationType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 46:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 53:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case RecyclerView.C1119a0.FLAG_IGNORE:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 144:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 145:
                objArr[2] = "isMemberOfAny";
                break;
            case 146:
            case 147:
                objArr[2] = "isEnum";
                break;
            case 148:
            case 149:
                objArr[2] = "isComparable";
                break;
            case 150:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 151:
                objArr[2] = "isListOrNullableList";
                break;
            case 152:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 153:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 154:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 155:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 156:
                objArr[2] = "isThrowable";
                break;
            case 157:
                objArr[2] = "isKClass";
                break;
            case 158:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 159:
                objArr[2] = "isCloneable";
                break;
            case 160:
                objArr[2] = "isDeprecated";
                break;
            case 161:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: b */
    public static C24312z m58682b(C23867c cVar, String str) {
        if (str != null) {
            C24312z q = cVar.mo59388k(str).mo53412q();
            if (q != null) {
                return q;
            }
            m58681a(47);
            throw null;
        }
        cVar.getClass();
        m58681a(46);
        throw null;
    }

    /* renamed from: c */
    public static boolean m58683c(C25437e eVar, C25067d dVar) {
        if (eVar == null) {
            m58681a(103);
            throw null;
        } else if (dVar == null) {
            m58681a(104);
            throw null;
        } else if (!eVar.getName().equals(dVar.mo61598h()) || !dVar.equals(C25260c.m63390g(eVar))) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: s */
    public static PrimitiveType m58684s(C25437e eVar) {
        if (eVar == null) {
            m58681a(77);
            throw null;
        } else if (C23872e.C23873a.f60360Z.contains(eVar.getName())) {
            return (PrimitiveType) C23872e.C23873a.f60364b0.get(C25260c.m63390g(eVar));
        } else {
            return null;
        }
    }

    /* renamed from: u */
    public static PrimitiveType m58685u(C25442g gVar) {
        if (gVar == null) {
            m58681a(76);
            throw null;
        } else if (C23872e.C23873a.f60359Y.contains(gVar.getName())) {
            return (PrimitiveType) C23872e.C23873a.f60362a0.get(C25260c.m63390g(gVar));
        } else {
            return null;
        }
    }

    /* renamed from: y */
    public static boolean m58686y(C24307v vVar) {
        if (vVar != null) {
            return m58671B(vVar, C23872e.C23873a.f60361a);
        }
        m58681a(139);
        throw null;
    }

    /* renamed from: z */
    public static boolean m58687z(C24307v vVar) {
        if (vVar != null) {
            return m58671B(vVar, C23872e.C23873a.f60369g);
        }
        m58681a(88);
        throw null;
    }

    /* renamed from: d */
    public final void mo59381d(boolean z) {
        C25069e eVar = f60309e;
        C23792h hVar = this.f60313d;
        C24362h.m61211f(eVar, "moduleName");
        C24362h.m61211f(hVar, "storageManager");
        C23909c cVar = new C23909c(eVar, hVar, this, 48);
        this.f60310a = cVar;
        BuiltInsLoader.f60303a.getClass();
        C25487v a = BuiltInsLoader.Companion.f60305b.getValue().mo59372a(this.f60313d, this.f60310a, mo59390m(), mo59394q(), mo59382e(), z);
        C24362h.m61211f(a, "providerForModuleContent");
        cVar.f60519i = a;
        C23909c cVar2 = this.f60310a;
        cVar2.mo59459l0(cVar2);
    }

    /* renamed from: e */
    public C21051a mo59382e() {
        return C21051a.C21052a.f52857a;
    }

    /* renamed from: f */
    public final C24312z mo59383f() {
        C24312z q = mo59388k("Any").mo53412q();
        if (q != null) {
            return q;
        }
        m58681a(50);
        throw null;
    }

    /* renamed from: g */
    public final C24307v mo59384g(C24307v vVar) {
        C25485t tVar;
        C25065b f;
        C25065b bVar;
        C25432c a;
        C24312z zVar = null;
        if (vVar == null) {
            m58681a(67);
            throw null;
        } else if (!m58687z(vVar)) {
            C24306u0 i = C24299r0.m60977i(vVar);
            C24307v vVar2 = ((C23868a) this.f60311b.invoke()).f60316c.get(i);
            if (vVar2 != null) {
                return vVar2;
            }
            int i2 = C25260c.f63536a;
            C25437e o = i.mo60411O0().mo53460o();
            if (o == null) {
                tVar = null;
            } else {
                tVar = C25260c.m63388e(o);
            }
            if (tVar != null) {
                C25437e o2 = i.mo60411O0().mo53460o();
                if (o2 != null) {
                    Set<C25069e> set = C25144h.f63419a;
                    C25069e name = o2.getName();
                    C24362h.m61211f(name, "name");
                    if (!(!C25144h.f63422d.contains(name) || (f = DescriptorUtilsKt.m60285f(o2)) == null || (bVar = C25144h.f63420b.get(f)) == null || (a = FindClassInModuleKt.m58735a(tVar, bVar)) == null)) {
                        zVar = a.mo53412q();
                    }
                }
                if (zVar != null) {
                    return zVar;
                }
            }
            throw new IllegalStateException("not array: " + vVar);
        } else if (vVar.mo60410N0().size() == 1) {
            C24307v type = vVar.mo60410N0().get(0).getType();
            if (type != null) {
                return type;
            }
            m58681a(68);
            throw null;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: h */
    public final C24312z mo59385h(Variance variance, C24307v vVar, C20989e eVar) {
        if (variance == null) {
            m58681a(78);
            throw null;
        } else if (vVar != null) {
            return KotlinTypeFactory.m60476e(eVar, mo59388k("Array"), Collections.singletonList(new C24285n0(vVar, variance)));
        } else {
            m58681a(79);
            throw null;
        }
    }

    /* renamed from: i */
    public final C24312z mo59386i(C24306u0 u0Var, Variance variance) {
        if (variance == null) {
            m58681a(82);
            throw null;
        } else if (u0Var != null) {
            return mo59385h(variance, u0Var, C20989e.C20990a.f52739a);
        } else {
            m58681a(83);
            throw null;
        }
    }

    /* renamed from: j */
    public final C25432c mo59387j(C25066c cVar) {
        if (cVar != null) {
            C25432c v0 = C21100e.m49370v0(mo59389l(), cVar, NoLookupLocation.FROM_BUILTINS);
            if (v0 != null) {
                return v0;
            }
            m58681a(13);
            throw null;
        }
        m58681a(12);
        throw null;
    }

    /* renamed from: k */
    public final C25432c mo59388k(String str) {
        if (str != null) {
            C25432c cVar = (C25432c) ((LockBasedStorageManager.C24148k) this.f60312c).invoke(C25069e.m62820i(str));
            if (cVar != null) {
                return cVar;
            }
            m58681a(15);
            throw null;
        }
        m58681a(14);
        throw null;
    }

    /* renamed from: l */
    public final C23909c mo59389l() {
        C23909c cVar = this.f60310a;
        cVar.getClass();
        if (cVar != null) {
            return cVar;
        }
        m58681a(7);
        throw null;
    }

    /* renamed from: m */
    public Iterable<C21053b> mo59390m() {
        List singletonList = Collections.singletonList(new C25249a(this.f60313d, mo59389l()));
        if (singletonList != null) {
            return singletonList;
        }
        m58681a(5);
        throw null;
    }

    /* renamed from: n */
    public final C24312z mo59391n() {
        return mo59393p();
    }

    /* renamed from: o */
    public final C24312z mo59392o() {
        C24312z q = mo59388k("Nothing").mo53412q();
        if (q != null) {
            return q;
        }
        m58681a(48);
        throw null;
    }

    /* renamed from: p */
    public final C24312z mo59393p() {
        C24312z V0 = mo59383f().mo59559S0(true);
        if (V0 != null) {
            return V0;
        }
        m58681a(51);
        throw null;
    }

    /* renamed from: q */
    public C21054c mo59394q() {
        return C21054c.C21056b.f52859a;
    }

    /* renamed from: r */
    public final C24312z mo59395r(PrimitiveType primitiveType) {
        if (primitiveType != null) {
            C24312z zVar = ((C23868a) this.f60311b.invoke()).f60314a.get(primitiveType);
            if (zVar != null) {
                return zVar;
            }
            m58681a(74);
            throw null;
        }
        m58681a(73);
        throw null;
    }

    /* renamed from: t */
    public final C24312z mo59396t(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            m58681a(53);
            throw null;
        } else if (primitiveType != null) {
            C24312z q = mo59388k(primitiveType.getTypeName().mo61604f()).mo53412q();
            if (q != null) {
                return q;
            }
            m58681a(54);
            throw null;
        } else {
            m58681a(16);
            throw null;
        }
    }

    /* renamed from: v */
    public final C24312z mo59397v() {
        C24312z q = mo59388k("String").mo53412q();
        if (q != null) {
            return q;
        }
        m58681a(65);
        throw null;
    }

    /* renamed from: w */
    public final C25432c mo59398w(int i) {
        C25432c j = mo59387j(C23872e.f60324c.mo61581c(C25069e.m62820i(C24362h.m61216k(Integer.valueOf(i), FunctionClassKind.SuspendFunction.getClassNamePrefix()))));
        if (j != null) {
            return j;
        }
        m58681a(18);
        throw null;
    }

    /* renamed from: x */
    public final C24312z mo59399x() {
        C24312z q = mo59388k("Unit").mo53412q();
        if (q != null) {
            return q;
        }
        m58681a(64);
        throw null;
    }
}
