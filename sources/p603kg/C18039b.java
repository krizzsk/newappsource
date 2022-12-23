package p603kg;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.mlkit_common.zzv;
import com.google.android.gms.internal.mlkit_common.zzw;
import com.google.mlkit.common.sdkinternal.model.BaseModel;
import java.util.EnumMap;

/* renamed from: kg.b */
public abstract class C18039b {

    /* renamed from: a */
    public static final EnumMap f46151a;

    static {
        Class<BaseModel> cls = BaseModel.class;
        new EnumMap(cls);
        f46151a = new EnumMap(cls);
    }

    @KeepForSdk
    /* renamed from: a */
    public static String m44709a() {
        String valueOf = String.valueOf((String) f46151a.get((Object) null));
        return valueOf.length() != 0 ? "COM.GOOGLE.BASE_".concat(valueOf) : new String("COM.GOOGLE.BASE_");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18039b)) {
            return false;
        }
        ((C18039b) obj).getClass();
        if (!Objects.equal((Object) null, (Object) null) || !Objects.equal((Object) null, (Object) null) || !Objects.equal((Object) null, (Object) null)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(null, null, null);
    }

    public final String toString() {
        zzv zzb = zzw.zzb("RemoteModel");
        zzb.zza("modelName", (Object) null);
        zzb.zza("baseModel", (Object) null);
        zzb.zza("modelType", (Object) null);
        return zzb.toString();
    }
}
