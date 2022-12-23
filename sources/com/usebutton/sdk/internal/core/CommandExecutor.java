package com.usebutton.sdk.internal.core;

import android.os.Handler;
import android.os.Looper;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.ButtonThreadFactory;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class CommandExecutor implements Runnable {
    public static final Command KILL_PILL = new Command((FailableReceiver) null) {
        public Object execute() throws Exception {
            return null;
        }

        public String key() {
            return "kill-pill";
        }
    };
    private static final String TAG = "CommandExecutor";
    private final List<ExceptionHandler> mExceptionHandlers;
    private ExecutorService mExecutorService;
    private final Messenger mMessenger;
    private LinkedBlockingDeque<Command> mPendingCommands = new LinkedBlockingDeque<>();

    public static class HandlerMessenger implements Messenger {
        private final Handler mHandler;

        public HandlerMessenger(Handler handler) {
            this.mHandler = handler;
        }

        public void post(Runnable runnable) {
            this.mHandler.post(runnable);
        }
    }

    public interface Messenger {
        void post(Runnable runnable);
    }

    public CommandExecutor(Messenger messenger, List<ExceptionHandler> list) {
        this.mMessenger = messenger;
        this.mExceptionHandlers = list;
    }

    public static CommandExecutor defaultExecutor() {
        return new CommandExecutor(new HandlerMessenger(new Handler(Looper.getMainLooper())), Arrays.asList(new ExceptionHandler[]{new InvalidSessionHandler(), new LoggingHandler()}));
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0006 A[LOOP:0: B:1:0x0006->B:4:0x0016, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void handleException(java.lang.Throwable r3) {
        /*
            r2 = this;
            java.util.List<com.usebutton.sdk.internal.core.ExceptionHandler> r0 = r2.mExceptionHandlers
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0018
            java.lang.Object r1 = r0.next()
            com.usebutton.sdk.internal.core.ExceptionHandler r1 = (com.usebutton.sdk.internal.core.ExceptionHandler) r1
            boolean r1 = r1.handle(r3)
            if (r1 == 0) goto L_0x0006
        L_0x0018:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usebutton.sdk.internal.core.CommandExecutor.handleException(java.lang.Throwable):void");
    }

    private synchronized boolean isRunning() {
        return this.mExecutorService != null;
    }

    public void blockingLoop() {
        while (true) {
            try {
                final Command takeFirst = this.mPendingCommands.takeFirst();
                if (takeFirst == KILL_PILL) {
                    System.err.println("Swallowed the wrong pill, shutting down CommandExecutor.");
                    return;
                } else if (!takeFirst.isCancelled()) {
                    try {
                        final Object execute = takeFirst.execute();
                        this.mMessenger.post(new Runnable() {
                            public void run() {
                                if (!takeFirst.isCancelled()) {
                                    takeFirst.deliverSuccess(execute);
                                }
                            }
                        });
                    } catch (Throwable th) {
                        handleException(th);
                        this.mMessenger.post(new Runnable() {
                            public void run() {
                                if (!takeFirst.isCancelled()) {
                                    takeFirst.deliverFailure();
                                }
                            }
                        });
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                ButtonLog.warn(TAG, "Command executor got interrupted.");
                return;
            }
        }
    }

    public void dispatch(Command command) {
        if (!isRunning()) {
            ButtonLog.warnFormat(TAG, "Ignoring command submitted while stopped: %s", command);
            return;
        }
        Iterator<Command> it = this.mPendingCommands.iterator();
        while (it.hasNext()) {
            Command next = it.next();
            if (!next.isCancelled() && next.key().equals(command.key())) {
                ButtonLog.infoFormat(TAG, "Joined command %s with pending command %s (%s)", command.key(), next.key());
                next.join(command);
                return;
            }
        }
        this.mPendingCommands.addLast(command);
    }

    public void dispatchFirst(Command command) {
        Iterator<Command> it = this.mPendingCommands.iterator();
        while (it.hasNext()) {
            Command next = it.next();
            if (!next.isCancelled() && next.key().equals(command.key())) {
                ButtonLog.infoFormat(TAG, "Joined command %s with pending command %s (%s)", command.key(), next.key());
                next.join(command);
                return;
            }
        }
        this.mPendingCommands.addFirst(command);
    }

    public void run() {
        blockingLoop();
    }

    public synchronized void start() {
        if (isRunning()) {
            ButtonLog.warn(TAG, "start() called while already running");
            return;
        }
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ButtonThreadFactory(TAG));
        this.mExecutorService = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(this);
    }

    public synchronized void stop() {
        if (!isRunning()) {
            ButtonLog.warn(TAG, "stop() called while already running");
            return;
        }
        dispatch(KILL_PILL);
        this.mExecutorService.shutdown();
        this.mExecutorService = null;
    }

    public CommandExecutor(Messenger messenger) {
        this.mMessenger = messenger;
        this.mExceptionHandlers = Collections.emptyList();
    }
}
