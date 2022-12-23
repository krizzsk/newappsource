package p253t;

import android.os.IBinder;
import androidx.browser.customtabs.CustomTabsService;
import java.util.NoSuchElementException;
import p000a.C0000a;

/* renamed from: t.i */
public final /* synthetic */ class C6519i implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final /* synthetic */ CustomTabsService.C0490a f20321a;

    /* renamed from: b */
    public final /* synthetic */ C6523l f20322b;

    public /* synthetic */ C6519i(CustomTabsService.C0490a aVar, C6523l lVar) {
        this.f20321a = aVar;
        this.f20322b = lVar;
    }

    public final void binderDied() {
        IBinder iBinder;
        CustomTabsService.C0490a aVar = this.f20321a;
        C6523l lVar = this.f20322b;
        CustomTabsService customTabsService = CustomTabsService.this;
        customTabsService.getClass();
        try {
            synchronized (customTabsService.f1677b) {
                C0000a aVar2 = lVar.f20327a;
                if (aVar2 == null) {
                    iBinder = null;
                } else {
                    iBinder = aVar2.asBinder();
                }
                if (iBinder != null) {
                    iBinder.unlinkToDeath(customTabsService.f1677b.getOrDefault(iBinder, null), 0);
                    customTabsService.f1677b.remove(iBinder);
                }
            }
        } catch (NoSuchElementException unused) {
        }
    }
}
