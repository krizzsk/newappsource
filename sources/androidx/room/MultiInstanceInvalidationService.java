package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import java.util.HashMap;
import p217q2.C6151f;
import p217q2.C6154g;

public class MultiInstanceInvalidationService extends Service {

    /* renamed from: b */
    public int f4702b = 0;

    /* renamed from: c */
    public final HashMap<Integer, String> f4703c = new HashMap<>();

    /* renamed from: d */
    public final C1250a f4704d = new C1250a();

    /* renamed from: e */
    public final C1251b f4705e = new C1251b();

    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    public class C1250a extends RemoteCallbackList<C6151f> {
        public C1250a() {
        }

        public final void onCallbackDied(IInterface iInterface, Object obj) {
            C6151f fVar = (C6151f) iInterface;
            MultiInstanceInvalidationService.this.f4703c.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    public class C1251b extends C6154g {
        public C1251b() {
        }

        /* renamed from: G */
        public final void mo5183G(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f4704d) {
                String str = MultiInstanceInvalidationService.this.f4703c.get(Integer.valueOf(i));
                if (str != null) {
                    int beginBroadcast = MultiInstanceInvalidationService.this.f4704d.beginBroadcast();
                    int i2 = 0;
                    while (i2 < beginBroadcast) {
                        try {
                            int intValue = ((Integer) MultiInstanceInvalidationService.this.f4704d.getBroadcastCookie(i2)).intValue();
                            String str2 = MultiInstanceInvalidationService.this.f4703c.get(Integer.valueOf(intValue));
                            if (i != intValue && str.equals(str2)) {
                                try {
                                    ((C6151f) MultiInstanceInvalidationService.this.f4704d.getBroadcastItem(i2)).mo22126c(strArr);
                                } catch (RemoteException unused) {
                                }
                            }
                            i2++;
                        } catch (Throwable th) {
                            MultiInstanceInvalidationService.this.f4704d.finishBroadcast();
                            throw th;
                        }
                    }
                    MultiInstanceInvalidationService.this.f4704d.finishBroadcast();
                }
            }
        }

        /* renamed from: H */
        public final int mo5184H(C6151f fVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f4704d) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f4702b + 1;
                multiInstanceInvalidationService.f4702b = i;
                if (multiInstanceInvalidationService.f4704d.register(fVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f4703c.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f4702b--;
                return 0;
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        return this.f4705e;
    }
}
