package p460ef;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.firebase.messaging.FirebaseMessagingService;

@KeepForSdk
/* renamed from: ef.b */
public final class C16818b {

    /* renamed from: a */
    public String f43781a;

    @KeepForSdk
    public C16818b(String str) {
        this.f43781a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16818b)) {
            return false;
        }
        return Objects.equal(this.f43781a, ((C16818b) obj).f43781a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f43781a);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(FirebaseMessagingService.EXTRA_TOKEN, this.f43781a).toString();
    }
}
