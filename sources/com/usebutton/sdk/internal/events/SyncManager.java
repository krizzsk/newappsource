package com.usebutton.sdk.internal.events;

import android.os.Handler;
import com.usebutton.sdk.internal.ButtonPrivate;
import com.usebutton.sdk.internal.api.ButtonApi;
import com.usebutton.sdk.internal.commands.PostEventsCommand;
import com.usebutton.sdk.internal.commands.SendGuaranteedRequestsCommand;
import com.usebutton.sdk.internal.core.CommandExecutor;
import com.usebutton.sdk.internal.core.Storage;
import com.usebutton.sdk.internal.util.ButtonLog;

public class SyncManager {
    private static final String TAG = "SyncManager";
    private final ButtonApi api;
    private final CommandExecutor executor;
    private final Handler handler;
    private final Storage storage;
    private final Runnable syncEventsRunnable = new Runnable() {
        public void run() {
            synchronized (SyncManager.this) {
                boolean unused = SyncManager.this.syncScheduled = false;
            }
            SyncManager.this.syncEventsNow();
        }
    };
    /* access modifiers changed from: private */
    public boolean syncScheduled = false;
    private final EventTracker tracker;

    public SyncManager(ButtonApi buttonApi, Storage storage2, EventTracker eventTracker, CommandExecutor commandExecutor, Handler handler2) {
        this.api = buttonApi;
        this.storage = storage2;
        this.tracker = eventTracker;
        this.executor = commandExecutor;
        this.handler = handler2;
    }

    /* access modifiers changed from: private */
    public void syncEventsNow() {
        this.executor.dispatch(new PostEventsCommand(this.api, this.storage, this.tracker));
        this.executor.dispatch(new SendGuaranteedRequestsCommand(this.api));
    }

    public void removeCallbacks() {
        this.handler.removeCallbacks(this.syncEventsRunnable);
    }

    public synchronized void syncEventsSoon() {
        if (!this.syncScheduled) {
            ButtonLog.info(TAG, "syncEventsSoon: scheduling sync");
            this.handler.postDelayed(this.syncEventsRunnable, (long) (ButtonPrivate.getButton().getConfiguration().getParameters().getEventFlushSeconds() * 1000));
            this.syncScheduled = true;
        }
    }
}
