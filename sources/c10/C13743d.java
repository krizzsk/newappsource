package c10;

import android.os.ConditionVariable;
import android.text.TextUtils;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.network.model.ServerId;
import java.util.concurrent.atomic.AtomicReference;
import p977zz.C20964s0;

/* renamed from: c10.d */
public final class C13743d {

    /* renamed from: d */
    public static final C13743d f33820d = new C13743d();

    /* renamed from: a */
    public final ConditionVariable f33821a = new ConditionVariable(false);

    /* renamed from: b */
    public final AtomicReference<C13740a> f33822b = new AtomicReference<>((Object) null);

    /* renamed from: c */
    public final AtomicReference<Boolean> f33823c = new AtomicReference<>(Boolean.TRUE);

    /* renamed from: a */
    public final LatLonE6 mo40665a() {
        String str;
        try {
            C13740a aVar = this.f33822b.get();
            if (aVar != null) {
                str = aVar.f33815c.get("iml");
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String[] A = C20964s0.m49080A(str, ',');
            if (A.length != 2) {
                return null;
            }
            String str2 = A[0];
            String str3 = A[1];
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            if (TextUtils.isEmpty(str3)) {
                return null;
            }
            return LatLonE6.m40176g(Double.parseDouble(str2), Double.parseDouble(str3));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final ServerId mo40666b() {
        String str;
        try {
            C13740a aVar = this.f33822b.get();
            if (aVar != null) {
                str = aVar.f33815c.get("imi");
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!TextUtils.isDigitsOnly(str)) {
                return null;
            }
            return ServerId.m11392b(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
