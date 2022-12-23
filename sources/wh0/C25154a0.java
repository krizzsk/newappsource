package wh0;

import bi0.C21066e;
import com.appboy.Constants;
import ff0.C23349c;
import kotlin.Result;
import p584jl.C17885a;

/* renamed from: wh0.a0 */
public final class C25154a0 {

    /* renamed from: a */
    public static C25154a0 f63431a;

    /* renamed from: a */
    public static /* synthetic */ void m63136a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
            default:
                objArr[0] = Constants.APPBOY_PUSH_CONTENT_KEY;
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static final String m63137b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m63138c(C23349c cVar) {
        String str;
        if (cVar instanceof C21066e) {
            return cVar.toString();
        }
        try {
            str = cVar + '@' + m63137b(cVar);
        } catch (Throwable th) {
            str = C17885a.m44400G(th);
        }
        Throwable a = Result.m58423a(str);
        String str2 = str;
        if (a != null) {
            str2 = cVar.getClass().getName() + '@' + m63137b(cVar);
        }
        return (String) str2;
    }
}
