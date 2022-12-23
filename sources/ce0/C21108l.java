package ce0;

import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: ce0.l */
public final class C21108l extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final /* synthetic */ C21110n f52954a;

    public C21108l(C21110n nVar) {
        this.f52954a = nVar;
    }

    public final void onAvailable(Network network) {
        super.onAvailable(network);
        this.f52954a.mo53310a();
    }

    public final void onLost(Network network) {
        super.onLost(network);
        this.f52954a.mo53310a();
    }
}
