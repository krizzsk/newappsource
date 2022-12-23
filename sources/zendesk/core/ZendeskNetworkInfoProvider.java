package zendesk.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.zendesk.logger.Logger;
import ge0.C23408a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

class ZendeskNetworkInfoProvider implements NetworkInfoProvider, NetworkAware {
    private final BroadcastReceiver broadcastReceiver = new NetworkAvailabilityBroadcastReceiver();
    private final ConnectivityManager connectivityManager;
    private CurrentState currentState = null;
    private final Map<Integer, WeakReference<NetworkAware>> listeners = new HashMap();
    private final Map<Integer, WeakReference<RetryAction>> retryActions = new HashMap();

    public enum CurrentState {
        CONNECTED,
        DISCONNECTED
    }

    public class NetworkAvailabilityBroadcastReceiver extends BroadcastReceiver {
        public NetworkAvailabilityBroadcastReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                Logger.m57306e("onReceive: intent was null or getAction() was mismatched", new Object[0]);
            } else if (intent.getBooleanExtra("noConnectivity", false)) {
                ZendeskNetworkInfoProvider.this.onNetworkUnavailable();
            } else {
                ZendeskNetworkInfoProvider.this.onNetworkAvailable();
            }
        }
    }

    public ZendeskNetworkInfoProvider(Context context, ConnectivityManager connectivityManager2) {
        this.connectivityManager = connectivityManager2;
    }

    private static boolean isConnectedOrConnecting(ConnectivityManager connectivityManager2) {
        NetworkInfo activeNetworkInfo = connectivityManager2.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return false;
        }
        return true;
    }

    public void onNetworkAvailable() {
        CurrentState currentState2 = CurrentState.CONNECTED;
        if (currentState2 != this.currentState && isConnectedOrConnecting(this.connectivityManager)) {
            this.currentState = currentState2;
            HashMap b = C23408a.m57527b(this.listeners);
            HashMap b2 = C23408a.m57527b(this.retryActions);
            for (WeakReference weakReference : b.values()) {
                if (weakReference.get() != null) {
                    ((NetworkAware) weakReference.get()).onNetworkAvailable();
                }
            }
            for (WeakReference weakReference2 : b2.values()) {
                if (weakReference2.get() != null) {
                    ((RetryAction) weakReference2.get()).onRetry();
                }
            }
            this.retryActions.clear();
        }
    }

    public void onNetworkUnavailable() {
        CurrentState currentState2 = CurrentState.DISCONNECTED;
        if (currentState2 != this.currentState && !isConnectedOrConnecting(this.connectivityManager)) {
            this.currentState = currentState2;
            for (WeakReference weakReference : C23408a.m57527b(this.listeners).values()) {
                if (weakReference.get() != null) {
                    ((NetworkAware) weakReference.get()).onNetworkUnavailable();
                }
            }
        }
    }
}
