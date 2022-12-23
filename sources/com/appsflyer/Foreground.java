package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Foreground {
    public static long CHECK_DELAY = 500;
    public static Listener listener;

    public interface Listener {
        void onBecameBackground(Context context);

        void onBecameForeground(Activity activity);
    }

    public static void valueOf(Context context, final Listener listener2) {
        listener = listener2;
        C20463 r0 = new Application.ActivityLifecycleCallbacks() {
            public boolean $$b = true;
            private Executor AFDateFormat = Executors.newSingleThreadExecutor();
            public boolean valueOf;

            public final void onActivityCreated(final Activity activity, Bundle bundle) {
                this.AFDateFormat.execute(new Runnable() {
                    public final void run() {
                        AFDeepLinkManager.getInstance().collectIntentsFromActivities(activity.getIntent());
                    }
                });
            }

            public final void onActivityDestroyed(Activity activity) {
            }

            public final void onActivityPaused(final Activity activity) {
                this.AFDateFormat.execute(new Runnable() {
                    public final void run() {
                        C20463.this.$$b = true;
                        final Context applicationContext = activity.getApplicationContext();
                        try {
                            new Timer().schedule(new TimerTask() {
                                public final void run() {
                                    C20463 r0 = C20463.this;
                                    if (r0.valueOf && r0.$$b) {
                                        r0.valueOf = false;
                                        try {
                                            listener2.onBecameBackground(applicationContext);
                                        } catch (Exception e) {
                                            AFLogger.afErrorLog("Listener threw exception! ", e);
                                        }
                                    }
                                }
                            }, Foreground.CHECK_DELAY);
                        } catch (Throwable th) {
                            AFLogger.afErrorLog("Background task failed with a throwable: ", th);
                        }
                    }
                });
            }

            public final void onActivityResumed(final Activity activity) {
                this.AFDateFormat.execute(new Runnable() {
                    public final void run() {
                        C20463 r0 = C20463.this;
                        if (!r0.valueOf) {
                            try {
                                listener2.onBecameForeground(activity);
                            } catch (Exception e) {
                                AFLogger.afErrorLog("Listener thrown an exception: ", e, true);
                            }
                        }
                        C20463 r02 = C20463.this;
                        r02.$$b = false;
                        r02.valueOf = true;
                    }
                });
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityStarted(Activity activity) {
            }

            public final void onActivityStopped(Activity activity) {
            }
        };
        if (context instanceof Activity) {
            r0.onActivityResumed((Activity) context);
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(r0);
    }
}
