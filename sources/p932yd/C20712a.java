package p932yd;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.appindexing.internal.zzac;
import java.util.Arrays;
import p932yd.C20712a;

/* renamed from: yd.a */
public abstract class C20712a<T extends C20712a<?>> {

    /* renamed from: a */
    public final Bundle f52301a = new Bundle();

    /* renamed from: b */
    public final String f52302b = "Thing";

    /* renamed from: c */
    public zzac f52303c;

    /* renamed from: d */
    public String f52304d;

    public C20712a() {
        Preconditions.checkNotNull("Thing");
        Preconditions.checkNotEmpty("Thing");
    }

    /* renamed from: a */
    public final void mo52855a(String str, String... strArr) {
        Bundle bundle = this.f52301a;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(strArr);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < Math.min(strArr2.length, 100); i2++) {
                String str2 = strArr2[i2];
                strArr2[i] = str2;
                if (strArr2[i2] != null) {
                    int i3 = 20000;
                    if (str2.length() > 20000) {
                        String str3 = strArr2[i];
                        if (str3.length() > 20000) {
                            if (Character.isHighSurrogate(str3.charAt(19999)) && Character.isLowSurrogate(str3.charAt(20000))) {
                                i3 = 19999;
                            }
                            str3 = str3.substring(0, i3);
                        }
                        strArr2[i] = str3;
                    }
                    i++;
                }
            }
            if (i > 0) {
                Object[] objArr = (String[]) Arrays.copyOfRange(strArr2, 0, i);
                if (objArr.length >= 100) {
                    objArr = Arrays.copyOf(objArr, 100);
                }
                bundle.putStringArray(str, (String[]) objArr);
            }
        }
    }
}
