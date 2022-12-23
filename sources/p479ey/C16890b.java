package p479ey;

import c00.C13720d;
import c00.C13722f;
import c70.C13779s;
import com.moovit.commons.request.BadResponseException;
import com.moovit.gcm.notification.GcmNotification;
import com.tranzmate.moovit.protocol.users.MVAllValidNotifications;
import java.util.Collections;
import java.util.List;
import org.apache.thrift.TBase;
import p435de.C16596f;
import p828tt.C19759a;

/* renamed from: ey.b */
public final class C16890b extends C13779s<C16890b, MVAllValidNotifications, List<GcmNotification>> {
    public C16890b() {
        super(MVAllValidNotifications.class);
    }

    /* renamed from: e */
    public final Object mo23773e(TBase tBase) throws BadResponseException {
        try {
            return C13720d.m34273c(((MVAllValidNotifications) tBase).notifications, (C13722f) null, new C19759a(6));
        } catch (Exception e) {
            C16596f.m42113a().mo49364c(new BadResponseException("GetUserNotificationsResponse failure!", e));
            return Collections.emptyList();
        }
    }
}
