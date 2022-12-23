package kotlin.reflect.jvm.internal.impl.resolve;

import ce0.C21100e;
import cf0.C21136j;
import com.appboy.Constants;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Pair;
import kotlin.collections.C23825c;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import lf0.C24236l;
import lh0.C24274i0;
import lh0.C24306u0;
import lh0.C24307v;
import mh0.C24376c;
import mh0.C24378d;
import mh0.C24380e;
import mh0.C24384h;
import mh0.C24386j;
import p389bl.C13637c;
import p583jk.C17875h;
import xg0.C25260c;
import xg0.C25263f;
import xg0.C25264g;
import xg0.C25265h;
import xg0.C25268k;
import zf0.C25431b0;
import zf0.C25432c;
import zf0.C25433c0;
import zf0.C25442g;
import zf0.C25448i0;
import zf0.C25451k;
import zf0.C25452k0;
import zf0.C25453l;
import zf0.C25455m;
import zf0.C25491z;

public final class OverridingUtil {

    /* renamed from: c */
    public static final List<ExternalOverridabilityCondition> f61188c;

    /* renamed from: d */
    public static final OverridingUtil f61189d;

    /* renamed from: e */
    public static final C24113a f61190e;

    /* renamed from: a */
    public final C24378d f61191a;

    /* renamed from: b */
    public final C24376c.C24377a f61192b;

    public static class OverrideCompatibilityInfo {

        /* renamed from: b */
        public static final OverrideCompatibilityInfo f61193b = new OverrideCompatibilityInfo(Result.OVERRIDABLE, "SUCCESS");

        /* renamed from: a */
        public final Result f61194a;

        public enum Result {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public OverrideCompatibilityInfo(Result result, String str) {
            if (result != null) {
                this.f61194a = result;
            } else {
                m60258a(3);
                throw null;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ void m60258a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto L_0x000f
                if (r10 == r2) goto L_0x000f
                if (r10 == r1) goto L_0x000f
                if (r10 == r0) goto L_0x000f
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L_0x0011
            L_0x000f:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L_0x0011:
                if (r10 == r3) goto L_0x001b
                if (r10 == r2) goto L_0x001b
                if (r10 == r1) goto L_0x001b
                if (r10 == r0) goto L_0x001b
                r5 = 2
                goto L_0x001c
            L_0x001b:
                r5 = 3
            L_0x001c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L_0x0031
                if (r10 == r2) goto L_0x0031
                if (r10 == r1) goto L_0x002e
                if (r10 == r0) goto L_0x0031
                r5[r8] = r7
                goto L_0x0035
            L_0x002e:
                r5[r8] = r6
                goto L_0x0035
            L_0x0031:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L_0x0035:
                switch(r10) {
                    case 1: goto L_0x0045;
                    case 2: goto L_0x0045;
                    case 3: goto L_0x0045;
                    case 4: goto L_0x0045;
                    case 5: goto L_0x0040;
                    case 6: goto L_0x003b;
                    default: goto L_0x0038;
                }
            L_0x0038:
                r5[r3] = r6
                goto L_0x0047
            L_0x003b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L_0x0047
            L_0x0040:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L_0x0047
            L_0x0045:
                r5[r3] = r7
            L_0x0047:
                if (r10 == r3) goto L_0x005a
                if (r10 == r2) goto L_0x0055
                if (r10 == r1) goto L_0x0050
                if (r10 == r0) goto L_0x0050
                goto L_0x005e
            L_0x0050:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L_0x005e
            L_0x0055:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L_0x005e
            L_0x005a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L_0x005e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L_0x0070
                if (r10 == r2) goto L_0x0070
                if (r10 == r1) goto L_0x0070
                if (r10 == r0) goto L_0x0070
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L_0x0075
            L_0x0070:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L_0x0075:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.m60258a(int):void");
        }

        /* renamed from: b */
        public static OverrideCompatibilityInfo m60259b(String str) {
            return new OverrideCompatibilityInfo(Result.CONFLICT, str);
        }

        /* renamed from: d */
        public static OverrideCompatibilityInfo m60260d(String str) {
            return new OverrideCompatibilityInfo(Result.INCOMPATIBLE, str);
        }

        /* renamed from: c */
        public final Result mo60174c() {
            Result result = this.f61194a;
            if (result != null) {
                return result;
            }
            m60258a(5);
            throw null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$a */
    public static class C24113a implements C24376c.C24377a {
        /* renamed from: b */
        public static /* synthetic */ void m60262b(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = Constants.APPBOY_PUSH_CONTENT_KEY;
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public final boolean mo60168a(C24274i0 i0Var, C24274i0 i0Var2) {
            if (i0Var == null) {
                m60262b(0);
                throw null;
            } else if (i0Var2 != null) {
                return i0Var.equals(i0Var2);
            } else {
                m60262b(1);
                throw null;
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$b */
    public static /* synthetic */ class C24114b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f61195a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f61196b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f61197c;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007d */
        static {
            /*
                kotlin.reflect.jvm.internal.impl.descriptors.Modality[] r0 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f61197c = r0
                r1 = 1
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r2 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f61197c     // Catch:{ NoSuchFieldError -> 0x001d }
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f61197c     // Catch:{ NoSuchFieldError -> 0x0028 }
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f61197c     // Catch:{ NoSuchFieldError -> 0x0033 }
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r5 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result[] r4 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f61196b = r4
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r5 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = f61196b     // Catch:{ NoSuchFieldError -> 0x004e }
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r5 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.CONFLICT     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r4 = f61196b     // Catch:{ NoSuchFieldError -> 0x0058 }
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r5 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.INCOMPATIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result[] r4 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f61195a = r4
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r5 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.OVERRIDABLE     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r1 = f61195a     // Catch:{ NoSuchFieldError -> 0x0073 }
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r4 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.CONFLICT     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f61195a     // Catch:{ NoSuchFieldError -> 0x007d }
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r1 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r0 = f61195a     // Catch:{ NoSuchFieldError -> 0x0087 }
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r1 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.C24114b.<clinit>():void");
        }
    }

    static {
        Class<ExternalOverridabilityCondition> cls = ExternalOverridabilityCondition.class;
        f61188c = C23825c.m58499K0(ServiceLoader.load(cls, cls.getClassLoader()));
        C24113a aVar = new C24113a();
        f61190e = aVar;
        f61189d = new OverridingUtil(aVar, C24378d.C24379a.f61715b);
    }

    public OverridingUtil(C24376c.C24377a aVar, C24378d dVar) {
        if (aVar == null) {
            m60239a(4);
            throw null;
        } else if (dVar != null) {
            this.f61192b = aVar;
            this.f61191a = dVar;
        } else {
            m60239a(5);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m60239a(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (!(i3 == 9 || i3 == 10 || i3 == 14 || i3 == 19 || i3 == 95 || i3 == 98 || i3 == 103 || i3 == 44 || i3 == 45)) {
            switch (i3) {
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i3) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i3) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    break;
                                default:
                                    switch (i3) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                            }
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i3 == 9 || i3 == 10 || i3 == 14 || i3 == 19 || i3 == 95 || i3 == 98 || i3 == 103 || i3 == 44 || i3 == 45)) {
            switch (i3) {
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i3) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i3) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    break;
                                default:
                                    switch (i3) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                            }
                    }
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i3) {
            case 1:
            case 2:
            case 5:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "axioms";
                break;
            case 6:
            case 7:
                objArr[0] = "candidateSet";
                break;
            case 8:
                objArr[0] = "transformFirst";
                break;
            case 9:
            case 10:
            case 14:
            case 19:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 44:
            case 45:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 95:
            case 98:
            case 103:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 11:
                objArr[0] = InneractiveMediationDefs.GENDER_FEMALE;
                break;
            case 12:
                objArr[0] = "g";
                break;
            case 13:
            case 15:
                objArr[0] = "descriptor";
                break;
            case 16:
                objArr[0] = "result";
                break;
            case 17:
            case 20:
            case 28:
            case 38:
                objArr[0] = "superDescriptor";
                break;
            case 18:
            case 21:
            case 29:
            case 39:
                objArr[0] = "subDescriptor";
                break;
            case 40:
            case 42:
                objArr[0] = "firstParameters";
                break;
            case 41:
            case 43:
                objArr[0] = "secondParameters";
                break;
            case 46:
                objArr[0] = "typeInSuper";
                break;
            case 47:
                objArr[0] = "typeInSub";
                break;
            case 48:
            case 51:
            case 77:
                objArr[0] = "typeChecker";
                break;
            case 49:
                objArr[0] = "superTypeParameter";
                break;
            case 50:
                objArr[0] = "subTypeParameter";
                break;
            case 52:
                objArr[0] = "name";
                break;
            case 53:
                objArr[0] = "membersFromSupertypes";
                break;
            case 54:
                objArr[0] = "membersFromCurrent";
                break;
            case 55:
            case 61:
            case 64:
            case 86:
            case 89:
            case 96:
                objArr[0] = "current";
                break;
            case 56:
            case 62:
            case 66:
            case 87:
            case 106:
                objArr[0] = "strategy";
                break;
            case 57:
                objArr[0] = "overriding";
                break;
            case 58:
                objArr[0] = "fromSuper";
                break;
            case 59:
                objArr[0] = "fromCurrent";
                break;
            case 60:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 63:
            case 65:
                objArr[0] = "notOverridden";
                break;
            case 67:
            case 69:
            case 73:
                objArr[0] = Constants.APPBOY_PUSH_CONTENT_KEY;
                break;
            case 68:
            case 70:
            case 75:
                objArr[0] = "b";
                break;
            case 71:
                objArr[0] = "candidate";
                break;
            case 72:
            case 88:
            case 93:
            case 109:
                objArr[0] = "descriptors";
                break;
            case 74:
                objArr[0] = "aReturnType";
                break;
            case 76:
                objArr[0] = "bReturnType";
                break;
            case 78:
            case 85:
                objArr[0] = "overridables";
                break;
            case 79:
            case 101:
                objArr[0] = "descriptorByHandle";
                break;
            case 94:
                objArr[0] = "classModality";
                break;
            case 97:
                objArr[0] = "toFilter";
                break;
            case 99:
            case 104:
                objArr[0] = "overrider";
                break;
            case 100:
            case 105:
                objArr[0] = "extractFrom";
                break;
            case 102:
                objArr[0] = "onConflict";
                break;
            case 107:
            case 108:
                objArr[0] = "memberDescriptor";
                break;
            default:
                objArr[0] = "equalityAxioms";
                break;
        }
        if (i3 == 9 || i3 == 10) {
            objArr[1] = "filterOverrides";
        } else if (i3 != 14) {
            if (i3 != 19) {
                if (i3 == 95) {
                    objArr[1] = "getMinimalModality";
                } else if (i3 == 98) {
                    objArr[1] = "filterVisibleFakeOverrides";
                } else if (i3 != 103) {
                    if (i3 != 44 && i3 != 45) {
                        switch (i3) {
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                                break;
                            default:
                                switch (i3) {
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                        objArr[1] = "isOverridableByWithoutExternalConditions";
                                        break;
                                    default:
                                        switch (i3) {
                                            case 80:
                                            case 81:
                                            case 82:
                                            case 83:
                                            case 84:
                                                objArr[1] = "selectMostSpecificMember";
                                                break;
                                            default:
                                                switch (i3) {
                                                    case 90:
                                                    case 91:
                                                    case 92:
                                                        objArr[1] = "determineModalityForFakeOverride";
                                                        break;
                                                    default:
                                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                                        break;
                                                }
                                        }
                                }
                        }
                    } else {
                        objArr[1] = "createTypeCheckerState";
                    }
                } else {
                    objArr[1] = "extractMembersOverridableInBothWays";
                }
            }
            objArr[1] = "isOverridableBy";
        } else {
            objArr[1] = "getOverriddenDeclarations";
        }
        switch (i3) {
            case 1:
                objArr[2] = "createWithTypeRefiner";
                break;
            case 2:
            case 3:
                objArr[2] = "create";
                break;
            case 4:
            case 5:
                objArr[2] = "<init>";
                break;
            case 6:
                objArr[2] = "filterOutOverridden";
                break;
            case 7:
            case 8:
                objArr[2] = "filterOverrides";
                break;
            case 9:
            case 10:
            case 14:
            case 19:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 44:
            case 45:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 95:
            case 98:
            case 103:
                break;
            case 11:
            case 12:
                objArr[2] = "overrides";
                break;
            case 13:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 15:
            case 16:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 17:
            case 18:
            case 20:
            case 21:
                objArr[2] = "isOverridableBy";
                break;
            case 28:
            case 29:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 38:
            case 39:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 40:
            case 41:
                objArr[2] = "createTypeChecker";
                break;
            case 42:
            case 43:
                objArr[2] = "createTypeCheckerState";
                break;
            case 46:
            case 47:
            case 48:
                objArr[2] = "areTypesEquivalent";
                break;
            case 49:
            case 50:
            case 51:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 57:
            case 58:
                objArr[2] = "isVisibleForOverride";
                break;
            case 59:
            case 60:
            case 61:
            case 62:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 63:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 64:
            case 65:
            case 66:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 67:
            case 68:
                objArr[2] = "isMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 71:
            case 72:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 78:
            case 79:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 85:
            case 86:
            case 87:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 88:
            case 89:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 93:
            case 94:
                objArr[2] = "getMinimalModality";
                break;
            case 96:
            case 97:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 99:
            case 100:
            case 101:
            case 102:
            case 104:
            case 105:
            case 106:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 107:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 108:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 109:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithEqualityAxioms";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i3 == 9 || i3 == 10 || i3 == 14 || i3 == 19 || i3 == 95 || i3 == 98 || i3 == 103 || i3 == 44 || i3 == 45)) {
            switch (i3) {
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i3) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i3) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    break;
                                default:
                                    switch (i3) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            th = new IllegalArgumentException(format);
                                            break;
                                    }
                            }
                    }
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: b */
    public static boolean m60240b(C24307v vVar, C24307v vVar2, Pair pair) {
        boolean z;
        if (vVar == null) {
            m60239a(46);
            throw null;
        } else if (vVar2 != null) {
            if (!C13637c.m34082y(vVar) || !C13637c.m34082y(vVar2)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
            C24306u0 R0 = vVar.mo60450R0();
            C24306u0 R02 = vVar2.mo60450R0();
            ((C24384h) pair.mo59068c()).getClass();
            return C24384h.m61351c((TypeCheckerState) pair.mo59069d(), R0, R02);
        } else {
            m60239a(47);
            throw null;
        }
    }

    /* renamed from: c */
    public static void m60241c(CallableMemberDescriptor callableMemberDescriptor, LinkedHashSet linkedHashSet) {
        if (callableMemberDescriptor == null) {
            m60239a(15);
            throw null;
        } else if (callableMemberDescriptor.mo53433p().isReal()) {
            linkedHashSet.add(callableMemberDescriptor);
        } else if (!callableMemberDescriptor.mo53440d().isEmpty()) {
            for (CallableMemberDescriptor c : callableMemberDescriptor.mo53440d()) {
                m60241c(c, linkedHashSet);
            }
        } else {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + callableMemberDescriptor);
        }
    }

    /* renamed from: d */
    public static ArrayList m60242d(C23894a aVar) {
        C25433c0 R = aVar.mo53423R();
        ArrayList arrayList = new ArrayList();
        if (R != null) {
            arrayList.add(R.getType());
        }
        for (C25452k0 type : aVar.mo53442h()) {
            arrayList.add(type.getType());
        }
        return arrayList;
    }

    /* renamed from: e */
    public static void m60243e(Collection<CallableMemberDescriptor> collection, C25432c cVar, C25263f fVar) {
        Modality modality;
        Modality modality2;
        C25453l lVar;
        if (collection == null) {
            m60239a(85);
            throw null;
        } else if (cVar != null) {
            ArrayList g0 = C23825c.m58510g0(collection, new C25265h(cVar));
            boolean isEmpty = g0.isEmpty();
            if (!isEmpty) {
                collection = g0;
            }
            Iterator it = collection.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                if (it.hasNext()) {
                    CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) it.next();
                    int i = C24114b.f61197c[callableMemberDescriptor.mo53436s().ordinal()];
                    if (i == 1) {
                        modality = Modality.FINAL;
                        if (modality == null) {
                            m60239a(90);
                            throw null;
                        }
                    } else if (i == 2) {
                        throw new IllegalStateException("Member cannot have SEALED modality: " + callableMemberDescriptor);
                    } else if (i == 3) {
                        z2 = true;
                    } else if (i == 4) {
                        z3 = true;
                    }
                } else {
                    if (!(!cVar.mo53434p0() || cVar.mo53436s() == Modality.ABSTRACT || cVar.mo53436s() == Modality.SEALED)) {
                        z = true;
                    }
                    if (z2 && !z3) {
                        modality = Modality.OPEN;
                        if (modality == null) {
                            m60239a(91);
                            throw null;
                        }
                    } else if (z2 || !z3) {
                        HashSet<CallableMemberDescriptor> hashSet = new HashSet<>();
                        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
                            if (callableMemberDescriptor2 != null) {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                m60241c(callableMemberDescriptor2, linkedHashSet);
                                hashSet.addAll(linkedHashSet);
                            } else {
                                m60239a(13);
                                throw null;
                            }
                        }
                        if (hashSet.isEmpty() || ((C24386j) DescriptorUtilsKt.m60289j((C25442g) hashSet.iterator().next()).mo59456K(C24380e.f61716a)) == null) {
                            if (hashSet.size() > 1) {
                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                Iterator it2 = hashSet.iterator();
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    Iterator it3 = linkedHashSet2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            linkedHashSet2.add(next);
                                            break;
                                        }
                                        Pair pair = new Pair((C23894a) next, (C23894a) it3.next());
                                        C23894a aVar = (C23894a) pair.mo59066a();
                                        C23894a aVar2 = (C23894a) pair.mo59067b();
                                        if (m60250q(aVar, aVar2)) {
                                            it3.remove();
                                        } else if (m60250q(aVar2, aVar)) {
                                            break;
                                        }
                                    }
                                }
                                hashSet = linkedHashSet2;
                            }
                            Modality s = cVar.mo53436s();
                            if (s != null) {
                                Modality modality3 = Modality.ABSTRACT;
                                for (CallableMemberDescriptor callableMemberDescriptor3 : hashSet) {
                                    if (!z || callableMemberDescriptor3.mo53436s() != Modality.ABSTRACT) {
                                        modality2 = callableMemberDescriptor3.mo53436s();
                                    } else {
                                        modality2 = s;
                                    }
                                    if (modality2.compareTo(modality3) < 0) {
                                        modality3 = modality2;
                                    }
                                }
                                if (modality3 != null) {
                                    modality = modality3;
                                } else {
                                    m60239a(95);
                                    throw null;
                                }
                            } else {
                                m60239a(94);
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        if (z) {
                            modality = cVar.mo53436s();
                        } else {
                            modality = Modality.ABSTRACT;
                        }
                        if (modality == null) {
                            m60239a(92);
                            throw null;
                        }
                    }
                }
            }
            if (isEmpty) {
                lVar = C25455m.f63747h;
            } else {
                lVar = C25455m.f63746g;
            }
            CallableMemberDescriptor L0 = ((CallableMemberDescriptor) m60252s(collection, new C25264g())).mo53420L0(cVar, modality, lVar, CallableMemberDescriptor.Kind.FAKE_OVERRIDE);
            fVar.mo323o(L0, collection);
            fVar.mo320l(L0);
        } else {
            m60239a(86);
            throw null;
        }
    }

    /* renamed from: g */
    public static ArrayList m60244g(Object obj, LinkedList linkedList, C24236l lVar, C24236l lVar2) {
        if (obj == null) {
            m60239a(99);
            throw null;
        } else if (lVar != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            C23894a aVar = (C23894a) lVar.invoke(obj);
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C23894a aVar2 = (C23894a) lVar.invoke(next);
                if (obj == next) {
                    it.remove();
                } else {
                    OverrideCompatibilityInfo.Result j = m60246j(aVar, aVar2);
                    if (j == OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                        arrayList.add(next);
                        it.remove();
                    } else if (j == OverrideCompatibilityInfo.Result.CONFLICT) {
                        lVar2.invoke(next);
                        it.remove();
                    }
                }
            }
            return arrayList;
        } else {
            m60239a(101);
            throw null;
        }
    }

    /* renamed from: i */
    public static OverrideCompatibilityInfo m60245i(C23894a aVar, C23894a aVar2) {
        boolean z;
        boolean z2;
        OverrideCompatibilityInfo overrideCompatibilityInfo;
        if (aVar == null) {
            m60239a(38);
            throw null;
        } else if (aVar2 != null) {
            boolean z3 = aVar instanceof C23900c;
            if ((z3 && !(aVar2 instanceof C23900c)) || (((z = aVar instanceof C25491z)) && !(aVar2 instanceof C25491z))) {
                return OverrideCompatibilityInfo.m60260d("Member kind mismatch");
            }
            if (!z3 && !z) {
                throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + aVar);
            } else if (!aVar.getName().equals(aVar2.getName())) {
                return OverrideCompatibilityInfo.m60260d("Name mismatch");
            } else {
                boolean z4 = false;
                if (aVar.mo53423R() == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (aVar2.mo53423R() == null) {
                    z4 = true;
                }
                if (z2 != z4) {
                    overrideCompatibilityInfo = OverrideCompatibilityInfo.m60260d("Receiver presence mismatch");
                } else if (aVar.mo53442h().size() != aVar2.mo53442h().size()) {
                    overrideCompatibilityInfo = OverrideCompatibilityInfo.m60260d("Value parameter number mismatch");
                } else {
                    overrideCompatibilityInfo = null;
                }
                if (overrideCompatibilityInfo != null) {
                    return overrideCompatibilityInfo;
                }
                return null;
            }
        } else {
            m60239a(39);
            throw null;
        }
    }

    /* renamed from: j */
    public static OverrideCompatibilityInfo.Result m60246j(C23894a aVar, C23894a aVar2) {
        OverridingUtil overridingUtil = f61189d;
        OverrideCompatibilityInfo.Result c = overridingUtil.mo60171l(aVar2, aVar, (C25432c) null).mo60174c();
        OverrideCompatibilityInfo.Result c2 = overridingUtil.mo60171l(aVar, aVar2, (C25432c) null).mo60174c();
        OverrideCompatibilityInfo.Result result = OverrideCompatibilityInfo.Result.OVERRIDABLE;
        if (c == result && c2 == result) {
            return result;
        }
        OverrideCompatibilityInfo.Result result2 = OverrideCompatibilityInfo.Result.CONFLICT;
        if (c == result2 || c2 == result2) {
            return result2;
        }
        return OverrideCompatibilityInfo.Result.INCOMPATIBLE;
    }

    /* renamed from: k */
    public static boolean m60247k(C23894a aVar, C23894a aVar2) {
        boolean z;
        if (aVar == null) {
            m60239a(67);
            throw null;
        } else if (aVar2 != null) {
            C24307v i = aVar.mo53443i();
            C24307v i2 = aVar2.mo53443i();
            if (!m60249p(aVar, aVar2)) {
                return false;
            }
            Pair<C24384h, TypeCheckerState> f = f61189d.mo60169f(aVar.getTypeParameters(), aVar2.getTypeParameters());
            if (aVar instanceof C23900c) {
                return m60248o(aVar, i, aVar2, i2, f);
            }
            if (aVar instanceof C25491z) {
                C25491z zVar = (C25491z) aVar;
                C25491z zVar2 = (C25491z) aVar2;
                C25431b0 setter = zVar.getSetter();
                C25431b0 setter2 = zVar2.getSetter();
                if (setter == null || setter2 == null) {
                    z = true;
                } else {
                    z = m60249p(setter, setter2);
                }
                if (!z) {
                    return false;
                }
                if (zVar.mo53526Q() && zVar2.mo53526Q()) {
                    C24306u0 R0 = i.mo60450R0();
                    C24306u0 R02 = i2.mo60450R0();
                    f.mo59068c().getClass();
                    return C24384h.m61351c(f.mo59069d(), R0, R02);
                } else if ((zVar.mo53526Q() || !zVar2.mo53526Q()) && m60248o(aVar, i, aVar2, i2, f)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                StringBuilder k = C13555b.m33972k("Unexpected callable: ");
                k.append(aVar.getClass());
                throw new IllegalArgumentException(k.toString());
            }
        } else {
            m60239a(68);
            throw null;
        }
    }

    /* renamed from: o */
    public static boolean m60248o(C23894a aVar, C24307v vVar, C23894a aVar2, C24307v vVar2, Pair<C24384h, TypeCheckerState> pair) {
        if (aVar == null) {
            m60239a(73);
            throw null;
        } else if (vVar == null) {
            m60239a(74);
            throw null;
        } else if (aVar2 == null) {
            m60239a(75);
            throw null;
        } else if (vVar2 != null) {
            C24306u0 R0 = vVar.mo60450R0();
            C24306u0 R02 = vVar2.mo60450R0();
            pair.mo59068c().getClass();
            return C24384h.m61352e(pair.mo59069d(), R0, R02);
        } else {
            m60239a(76);
            throw null;
        }
    }

    /* renamed from: p */
    public static boolean m60249p(C25451k kVar, C25451k kVar2) {
        if (kVar == null) {
            m60239a(69);
            throw null;
        } else if (kVar2 != null) {
            Integer b = C25455m.m63773b(kVar.mo53429g(), kVar2.mo53429g());
            if (b == null || b.intValue() >= 0) {
                return true;
            }
            return false;
        } else {
            m60239a(70);
            throw null;
        }
    }

    /* renamed from: q */
    public static boolean m60250q(C23894a aVar, C23894a aVar2) {
        if (aVar == null) {
            m60239a(11);
            throw null;
        } else if (aVar2 == null) {
            m60239a(12);
            throw null;
        } else if (!aVar.equals(aVar2) && C24116a.f61198a.mo60175a(aVar.mo53407a(), aVar2.mo53407a(), false, true)) {
            return true;
        } else {
            C23894a a = aVar2.mo53407a();
            int i = C25260c.f63536a;
            LinkedHashSet<C23894a> linkedHashSet = new LinkedHashSet<>();
            C25260c.m63385b(aVar.mo53407a(), linkedHashSet);
            for (C23894a a2 : linkedHashSet) {
                if (C24116a.f61198a.mo60175a(a, a2, false, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f6  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m60251r(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r6, lf0.C24236l<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, bf0.C21050d> r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x011f
            java.util.Collection r1 = r6.mo53440d()
            java.util.Iterator r1 = r1.iterator()
        L_0x000b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0023
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r2
            zf0.n r3 = r2.mo53429g()
            zf0.m$j r4 = zf0.C25455m.f63746g
            if (r3 != r4) goto L_0x000b
            m60251r(r2, r7)
            goto L_0x000b
        L_0x0023:
            zf0.n r1 = r6.mo53429g()
            zf0.m$j r2 = zf0.C25455m.f63746g
            if (r1 == r2) goto L_0x002c
            return
        L_0x002c:
            java.util.Collection r1 = r6.mo53440d()
            if (r1 == 0) goto L_0x0119
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x003b
            zf0.m$h r2 = zf0.C25455m.f63750k
            goto L_0x0088
        L_0x003b:
            java.util.Iterator r2 = r1.iterator()
        L_0x003f:
            r3 = r0
        L_0x0040:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0062
            java.lang.Object r4 = r2.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r4
            zf0.n r4 = r4.mo53429g()
            if (r3 != 0) goto L_0x0053
            goto L_0x0060
        L_0x0053:
            java.lang.Integer r5 = zf0.C25455m.m63773b(r4, r3)
            if (r5 != 0) goto L_0x005a
            goto L_0x003f
        L_0x005a:
            int r5 = r5.intValue()
            if (r5 <= 0) goto L_0x0040
        L_0x0060:
            r3 = r4
            goto L_0x0040
        L_0x0062:
            if (r3 != 0) goto L_0x0065
            goto L_0x0085
        L_0x0065:
            java.util.Iterator r2 = r1.iterator()
        L_0x0069:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0087
            java.lang.Object r4 = r2.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r4
            zf0.n r4 = r4.mo53429g()
            java.lang.Integer r4 = zf0.C25455m.m63773b(r3, r4)
            if (r4 == 0) goto L_0x0085
            int r4 = r4.intValue()
            if (r4 >= 0) goto L_0x0069
        L_0x0085:
            r2 = r0
            goto L_0x0088
        L_0x0087:
            r2 = r3
        L_0x0088:
            if (r2 != 0) goto L_0x008b
            goto L_0x00b5
        L_0x008b:
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r3 = r6.mo53433p()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r4 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
            if (r3 != r4) goto L_0x00b7
            java.util.Iterator r1 = r1.iterator()
        L_0x0097:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00bb
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r3
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = r3.mo53436s()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r5 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT
            if (r4 == r5) goto L_0x0097
            zf0.n r3 = r3.mo53429g()
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x0097
        L_0x00b5:
            r2 = r0
            goto L_0x00bb
        L_0x00b7:
            zf0.n r2 = r2.mo62741d()
        L_0x00bb:
            if (r2 != 0) goto L_0x00c5
            if (r7 == 0) goto L_0x00c2
            r7.invoke(r6)
        L_0x00c2:
            zf0.m$h r1 = zf0.C25455m.f63744e
            goto L_0x00c6
        L_0x00c5:
            r1 = r2
        L_0x00c6:
            boolean r3 = r6 instanceof cg0.C21164d0
            if (r3 == 0) goto L_0x00f6
            r3 = r6
            cg0.d0 r3 = (cg0.C21164d0) r3
            if (r1 == 0) goto L_0x00f0
            r3.f53030j = r1
            zf0.z r6 = (zf0.C25491z) r6
            java.util.ArrayList r6 = r6.mo53455x()
            java.util.Iterator r6 = r6.iterator()
        L_0x00db:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0118
            java.lang.Object r1 = r6.next()
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.C23902d) r1
            if (r2 != 0) goto L_0x00eb
            r3 = r0
            goto L_0x00ec
        L_0x00eb:
            r3 = r7
        L_0x00ec:
            m60251r(r1, r3)
            goto L_0x00db
        L_0x00f0:
            r6 = 17
            cg0.C21164d0.m49513A(r6)
            throw r0
        L_0x00f6:
            boolean r7 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.C23907b
            if (r7 == 0) goto L_0x0107
            kotlin.reflect.jvm.internal.impl.descriptors.impl.b r6 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.C23907b) r6
            if (r1 == 0) goto L_0x0101
            r6.f60476l = r1
            goto L_0x0118
        L_0x0101:
            r6 = 9
            kotlin.reflect.jvm.internal.impl.descriptors.impl.C23907b.m58859A(r6)
            throw r0
        L_0x0107:
            cg0.c0 r6 = (cg0.C21162c0) r6
            r6.f53027l = r1
            zf0.z r7 = r6.mo53426Y()
            zf0.n r7 = r7.mo53429g()
            if (r1 == r7) goto L_0x0118
            r7 = 0
            r6.f53021f = r7
        L_0x0118:
            return
        L_0x0119:
            r6 = 109(0x6d, float:1.53E-43)
            m60239a(r6)
            throw r0
        L_0x011f:
            r6 = 107(0x6b, float:1.5E-43)
            m60239a(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.m60251r(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, lf0.l):void");
    }

    /* renamed from: s */
    public static <H> H m60252s(Collection<H> collection, C24236l<H, C23894a> lVar) {
        H h;
        boolean z;
        if (lVar == null) {
            m60239a(79);
            throw null;
        } else if (collection.size() == 1) {
            H i0 = C23825c.m58512i0(collection);
            if (i0 != null) {
                return i0;
            }
            m60239a(80);
            throw null;
        } else {
            ArrayList arrayList = new ArrayList(2);
            ArrayList arrayList2 = new ArrayList(C21136j.m49436X(collection, 10));
            for (H invoke : collection) {
                arrayList2.add(lVar.invoke(invoke));
            }
            H i02 = C23825c.m58512i0(collection);
            C23894a invoke2 = lVar.invoke(i02);
            for (H next : collection) {
                C23894a invoke3 = lVar.invoke(next);
                if (invoke3 != null) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!m60247k(invoke3, (C23894a) it.next())) {
                                z = false;
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                    if (m60247k(invoke3, invoke2) && !m60247k(invoke2, invoke3)) {
                        i02 = next;
                    }
                } else {
                    m60239a(71);
                    throw null;
                }
            }
            if (arrayList.isEmpty()) {
                if (i02 != null) {
                    return i02;
                }
                m60239a(81);
                throw null;
            } else if (arrayList.size() == 1) {
                H i03 = C23825c.m58512i0(arrayList);
                if (i03 != null) {
                    return i03;
                }
                m60239a(82);
                throw null;
            } else {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        h = null;
                        break;
                    }
                    h = it2.next();
                    if (!C21100e.m49356o0(lVar.invoke(h).mo53443i())) {
                        break;
                    }
                }
                if (h != null) {
                    return h;
                }
                H i04 = C23825c.m58512i0(arrayList);
                if (i04 != null) {
                    return i04;
                }
                m60239a(84);
                throw null;
            }
        }
    }

    /* renamed from: f */
    public final Pair<C24384h, TypeCheckerState> mo60169f(List<C25448i0> list, List<C25448i0> list2) {
        TypeCheckerState typeCheckerState;
        if (list == null) {
            m60239a(40);
            throw null;
        } else if (list2 != null) {
            C24384h hVar = new C24384h(this.f61191a, KotlinTypePreparator.C24163a.f61359b);
            if (list.isEmpty()) {
                C25268k kVar = new C25268k((HashMap) null, this.f61192b, this.f61191a);
                typeCheckerState = C17875h.m44309t(true, true, kVar, (KotlinTypePreparator) null, kVar.f63544d, 8);
            } else {
                HashMap hashMap = new HashMap();
                for (int i = 0; i < list.size(); i++) {
                    hashMap.put(list.get(i).mo53481j(), list2.get(i).mo53481j());
                }
                C25268k kVar2 = new C25268k(hashMap, this.f61192b, this.f61191a);
                typeCheckerState = C17875h.m44309t(true, true, kVar2, (KotlinTypePreparator) null, kVar2.f63544d, 8);
            }
            return new Pair<>(hVar, typeCheckerState);
        } else {
            m60239a(41);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f8  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60170h(ug0.C25069e r18, java.util.Collection r19, java.util.Collection r20, zf0.C25432c r21, xg0.C25263f r22) {
        /*
            r17 = this;
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 0
            if (r18 == 0) goto L_0x015e
            if (r0 == 0) goto L_0x0156
            if (r20 == 0) goto L_0x014e
            if (r1 == 0) goto L_0x0146
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>(r0)
            java.util.Iterator r5 = r20.iterator()
        L_0x0018:
            boolean r6 = r5.hasNext()
            r7 = 2
            r9 = 1
            if (r6 == 0) goto L_0x009a
            java.lang.Object r6 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r6 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r6
            if (r6 == 0) goto L_0x0092
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r19.size()
            r10.<init>(r11)
            rh0.d r11 = new rh0.d
            r11.<init>()
            java.util.Iterator r12 = r19.iterator()
        L_0x003a:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0089
            java.lang.Object r13 = r12.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r13 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r13
            r14 = r17
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r15 = r14.mo60171l(r13, r6, r1)
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r15 = r15.mo60174c()
            zf0.n r16 = r13.mo53429g()
            boolean r16 = zf0.C25455m.m63776e(r16)
            if (r16 != 0) goto L_0x0069
            zf0.m$b r8 = zf0.C25455m.f63752m
            zf0.k r8 = zf0.C25455m.m63774c(r8, r13, r6)
            if (r8 != 0) goto L_0x0064
            r8 = 1
            goto L_0x0065
        L_0x0064:
            r8 = 0
        L_0x0065:
            if (r8 == 0) goto L_0x0069
            r8 = 1
            goto L_0x006a
        L_0x0069:
            r8 = 0
        L_0x006a:
            int[] r16 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.C24114b.f61196b
            int r15 = r15.ordinal()
            r15 = r16[r15]
            if (r15 == r9) goto L_0x0080
            if (r15 == r7) goto L_0x0077
            goto L_0x003a
        L_0x0077:
            if (r8 == 0) goto L_0x007c
            r2.mo53536p(r13, r6)
        L_0x007c:
            r10.add(r13)
            goto L_0x003a
        L_0x0080:
            if (r8 == 0) goto L_0x0085
            r11.add(r13)
        L_0x0085:
            r10.add(r13)
            goto L_0x003a
        L_0x0089:
            r14 = r17
            r2.mo323o(r6, r11)
            r4.removeAll(r10)
            goto L_0x0018
        L_0x0092:
            r14 = r17
            r0 = 59
            m60239a(r0)
            throw r3
        L_0x009a:
            r14 = r17
            int r0 = r4.size()
            if (r0 >= r7) goto L_0x00a3
            goto L_0x00dd
        L_0x00a3:
            java.util.Iterator r0 = r4.iterator()
            java.lang.Object r0 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            zf0.g r0 = r0.mo53399b()
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x00b8
            goto L_0x00dd
        L_0x00b8:
            java.util.Iterator r5 = r4.iterator()
        L_0x00bc:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00dd
            java.lang.Object r6 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r6 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r6
            zf0.g r6 = r6.mo53399b()
            if (r6 != r0) goto L_0x00d0
            r6 = 1
            goto L_0x00d1
        L_0x00d0:
            r6 = 0
        L_0x00d1:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x00bc
            r8 = 0
            goto L_0x00de
        L_0x00dd:
            r8 = 1
        L_0x00de:
            if (r8 == 0) goto L_0x00f8
            java.util.Iterator r0 = r4.iterator()
        L_0x00e4:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0145
            java.lang.Object r3 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r3
            java.util.Set r3 = java.util.Collections.singleton(r3)
            m60243e(r3, r1, r2)
            goto L_0x00e4
        L_0x00f8:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>(r4)
        L_0x00fd:
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L_0x0145
            r0.isEmpty()
            java.util.Iterator r4 = r0.iterator()
            r5 = r3
        L_0x010b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0130
            java.lang.Object r6 = r4.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r6 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r6
            if (r5 != 0) goto L_0x011a
            goto L_0x012e
        L_0x011a:
            zf0.n r7 = r5.mo53429g()
            zf0.n r8 = r6.mo53429g()
            java.lang.Integer r7 = zf0.C25455m.m63773b(r7, r8)
            if (r7 == 0) goto L_0x010b
            int r7 = r7.intValue()
            if (r7 >= 0) goto L_0x010b
        L_0x012e:
            r5 = r6
            goto L_0x010b
        L_0x0130:
            mf0.C24362h.m61208c(r5)
            xg0.i r4 = new xg0.i
            r4.<init>()
            xg0.j r6 = new xg0.j
            r6.<init>(r2, r5)
            java.util.ArrayList r4 = m60244g(r5, r0, r4, r6)
            m60243e(r4, r1, r2)
            goto L_0x00fd
        L_0x0145:
            return
        L_0x0146:
            r14 = r17
            r0 = 55
            m60239a(r0)
            throw r3
        L_0x014e:
            r14 = r17
            r0 = 54
            m60239a(r0)
            throw r3
        L_0x0156:
            r14 = r17
            r0 = 53
            m60239a(r0)
            throw r3
        L_0x015e:
            r14 = r17
            r0 = 52
            m60239a(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.mo60170h(ug0.e, java.util.Collection, java.util.Collection, zf0.c, xg0.f):void");
    }

    /* renamed from: l */
    public final OverrideCompatibilityInfo mo60171l(C23894a aVar, C23894a aVar2, C25432c cVar) {
        if (aVar == null) {
            m60239a(17);
            throw null;
        } else if (aVar2 != null) {
            OverrideCompatibilityInfo m = mo60172m(aVar, aVar2, cVar, false);
            if (m != null) {
                return m;
            }
            m60239a(19);
            throw null;
        } else {
            m60239a(18);
            throw null;
        }
    }

    /* renamed from: m */
    public final OverrideCompatibilityInfo mo60172m(C23894a aVar, C23894a aVar2, C25432c cVar, boolean z) {
        boolean z2;
        if (aVar == null) {
            m60239a(20);
            throw null;
        } else if (aVar2 != null) {
            OverrideCompatibilityInfo n = mo60173n(aVar, aVar2, z);
            if (n.mo60174c() == OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                z2 = true;
            } else {
                z2 = false;
            }
            for (ExternalOverridabilityCondition next : f61188c) {
                if (next.mo58577b() != ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY && (!z2 || next.mo58577b() != ExternalOverridabilityCondition.Contract.SUCCESS_ONLY)) {
                    int i = C24114b.f61195a[next.mo58576a(aVar, aVar2, cVar).ordinal()];
                    if (i == 1) {
                        z2 = true;
                    } else if (i == 2) {
                        return OverrideCompatibilityInfo.m60259b("External condition failed");
                    } else {
                        if (i == 3) {
                            return OverrideCompatibilityInfo.m60260d("External condition");
                        }
                    }
                }
            }
            if (!z2) {
                return n;
            }
            for (ExternalOverridabilityCondition next2 : f61188c) {
                if (next2.mo58577b() == ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY) {
                    int i2 = C24114b.f61195a[next2.mo58576a(aVar, aVar2, cVar).ordinal()];
                    if (i2 == 1) {
                        StringBuilder k = C13555b.m33972k("Contract violation in ");
                        k.append(next2.getClass().getName());
                        k.append(" condition. It's not supposed to end with success");
                        throw new IllegalStateException(k.toString());
                    } else if (i2 == 2) {
                        return OverrideCompatibilityInfo.m60259b("External condition failed");
                    } else {
                        if (i2 == 3) {
                            return OverrideCompatibilityInfo.m60260d("External condition");
                        }
                    }
                }
            }
            OverrideCompatibilityInfo overrideCompatibilityInfo = OverrideCompatibilityInfo.f61193b;
            if (overrideCompatibilityInfo != null) {
                return overrideCompatibilityInfo;
            }
            OverrideCompatibilityInfo.m60258a(0);
            throw null;
        } else {
            m60239a(21);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c1 A[LOOP:1: B:18:0x005b->B:39:0x00c1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00ba A[SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo mo60173n(kotlin.reflect.jvm.internal.impl.descriptors.C23894a r18, kotlin.reflect.jvm.internal.impl.descriptors.C23894a r19, boolean r20) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = 0
            if (r0 == 0) goto L_0x0166
            if (r1 == 0) goto L_0x015e
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r3 = m60245i(r18, r19)
            if (r3 == 0) goto L_0x0010
            return r3
        L_0x0010:
            java.util.ArrayList r3 = m60242d(r18)
            java.util.ArrayList r4 = m60242d(r19)
            java.util.List r5 = r18.getTypeParameters()
            java.util.List r6 = r19.getTypeParameters()
            int r7 = r5.size()
            int r8 = r6.size()
            r9 = 0
            if (r7 == r8) goto L_0x0054
        L_0x002b:
            int r0 = r3.size()
            java.lang.String r1 = "Type parameter number mismatch"
            if (r9 >= r0) goto L_0x004f
            mh0.h r0 = mh0.C24376c.f61714a
            java.lang.Object r2 = r3.get(r9)
            lh0.v r2 = (lh0.C24307v) r2
            java.lang.Object r5 = r4.get(r9)
            lh0.v r5 = (lh0.C24307v) r5
            boolean r0 = r0.mo60530d(r2, r5)
            if (r0 != 0) goto L_0x004c
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r0 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.m60260d(r1)
            return r0
        L_0x004c:
            int r9 = r9 + 1
            goto L_0x002b
        L_0x004f:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r0 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.m60259b(r1)
            return r0
        L_0x0054:
            r7 = r17
            kotlin.Pair r8 = r7.mo60169f(r5, r6)
            r10 = 0
        L_0x005b:
            int r11 = r5.size()
            if (r10 >= r11) goto L_0x00d0
            java.lang.Object r11 = r5.get(r10)
            zf0.i0 r11 = (zf0.C25448i0) r11
            java.lang.Object r13 = r6.get(r10)
            zf0.i0 r13 = (zf0.C25448i0) r13
            if (r11 == 0) goto L_0x00ca
            if (r13 == 0) goto L_0x00c4
            java.util.List r11 = r11.getUpperBounds()
            java.util.ArrayList r14 = new java.util.ArrayList
            java.util.List r13 = r13.getUpperBounds()
            r14.<init>(r13)
            int r13 = r11.size()
            int r15 = r14.size()
            if (r13 == r15) goto L_0x0089
            goto L_0x00b5
        L_0x0089:
            java.util.Iterator r11 = r11.iterator()
        L_0x008d:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x00b7
            java.lang.Object r13 = r11.next()
            lh0.v r13 = (lh0.C24307v) r13
            java.util.ListIterator r15 = r14.listIterator()
        L_0x009d:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x00b5
            java.lang.Object r16 = r15.next()
            r12 = r16
            lh0.v r12 = (lh0.C24307v) r12
            boolean r12 = m60240b(r13, r12, r8)
            if (r12 == 0) goto L_0x009d
            r15.remove()
            goto L_0x008d
        L_0x00b5:
            r12 = 0
            goto L_0x00b8
        L_0x00b7:
            r12 = 1
        L_0x00b8:
            if (r12 != 0) goto L_0x00c1
            java.lang.String r0 = "Type parameter bounds mismatch"
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r0 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.m60260d(r0)
            return r0
        L_0x00c1:
            int r10 = r10 + 1
            goto L_0x005b
        L_0x00c4:
            r0 = 50
            m60239a(r0)
            throw r2
        L_0x00ca:
            r0 = 49
            m60239a(r0)
            throw r2
        L_0x00d0:
            r5 = 0
        L_0x00d1:
            int r6 = r3.size()
            if (r5 >= r6) goto L_0x00f3
            java.lang.Object r6 = r3.get(r5)
            lh0.v r6 = (lh0.C24307v) r6
            java.lang.Object r10 = r4.get(r5)
            lh0.v r10 = (lh0.C24307v) r10
            boolean r6 = m60240b(r6, r10, r8)
            if (r6 != 0) goto L_0x00f0
            java.lang.String r0 = "Value parameter type mismatch"
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r0 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.m60260d(r0)
            return r0
        L_0x00f0:
            int r5 = r5 + 1
            goto L_0x00d1
        L_0x00f3:
            boolean r3 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C23900c
            if (r3 == 0) goto L_0x0112
            boolean r3 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C23900c
            if (r3 == 0) goto L_0x0112
            r3 = r0
            kotlin.reflect.jvm.internal.impl.descriptors.c r3 = (kotlin.reflect.jvm.internal.impl.descriptors.C23900c) r3
            boolean r3 = r3.mo53424V()
            r4 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.c r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C23900c) r4
            boolean r4 = r4.mo53424V()
            if (r3 == r4) goto L_0x0112
            java.lang.String r0 = "Incompatible suspendability"
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r0 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.m60259b(r0)
            return r0
        L_0x0112:
            if (r20 == 0) goto L_0x0155
            lh0.v r0 = r18.mo53443i()
            lh0.v r1 = r19.mo53443i()
            if (r0 == 0) goto L_0x0155
            if (r1 == 0) goto L_0x0155
            boolean r3 = p389bl.C13637c.m34082y(r1)
            if (r3 == 0) goto L_0x012e
            boolean r3 = p389bl.C13637c.m34082y(r0)
            if (r3 == 0) goto L_0x012e
            r12 = 1
            goto L_0x012f
        L_0x012e:
            r12 = 0
        L_0x012f:
            if (r12 != 0) goto L_0x0155
            java.lang.Object r3 = r8.mo59068c()
            mh0.h r3 = (mh0.C24384h) r3
            java.lang.Object r4 = r8.mo59069d()
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r4 = (kotlin.reflect.jvm.internal.impl.types.TypeCheckerState) r4
            lh0.u0 r1 = r1.mo60450R0()
            lh0.u0 r0 = r0.mo60450R0()
            r3.getClass()
            boolean r0 = mh0.C24384h.m61352e(r4, r1, r0)
            if (r0 != 0) goto L_0x0155
            java.lang.String r0 = "Return type mismatch"
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r0 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.m60259b(r0)
            return r0
        L_0x0155:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r0 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.f61193b
            if (r0 == 0) goto L_0x015a
            return r0
        L_0x015a:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.m60258a(r9)
            throw r2
        L_0x015e:
            r7 = r17
            r0 = 29
            m60239a(r0)
            throw r2
        L_0x0166:
            r7 = r17
            r0 = 28
            m60239a(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.mo60173n(kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a, boolean):kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo");
    }
}
