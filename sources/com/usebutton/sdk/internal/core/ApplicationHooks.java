package com.usebutton.sdk.internal.core;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.usebutton.sdk.internal.events.EventTracker;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.internal.functional.Observable;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.Publisher;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

public class ApplicationHooks {
    private static final long ON_BACKGROUND_REPORT_DELAY_MILLIS = 500;
    private static final String TAG = "ApplicationHooks";
    private final Runnable backgroundRunnable;
    private final Application mApplication;
    public final Application.ActivityLifecycleCallbacks mCallbacks;
    /* access modifiers changed from: private */
    public final EventTracker mEventTracker;
    private final AtomicBoolean mFirstLaunch;
    private final Handler mHandler;
    /* access modifiers changed from: private */
    public boolean mIsInForeground;
    /* access modifiers changed from: private */
    public WeakReference<Activity> mLastTopActivity;
    private Publisher<OnApplicationEvent> mPublisher;

    public interface OnApplicationEvent {
        void onForegrounded();

        void onIntent(Intent intent);
    }

    public ApplicationHooks(Application application, EventTracker eventTracker) {
        this(application, eventTracker, new Handler(Looper.getMainLooper()));
    }

    /* access modifiers changed from: private */
    public void handleIntent(final Intent intent) {
        if (intent != null) {
            this.mPublisher.perform(new Publisher.Action<OnApplicationEvent>() {
                public void perform(OnApplicationEvent onApplicationEvent) {
                    onApplicationEvent.onIntent(intent);
                }
            });
        }
    }

    public Activity getLastForegroundedActivity() {
        WeakReference<Activity> weakReference = this.mLastTopActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public Observable<OnApplicationEvent> getObservable() {
        return this.mPublisher;
    }

    public synchronized void handleBackground() {
        ButtonLog.info(TAG, "Activity backgrounded.");
        if (this.mIsInForeground) {
            this.mHandler.removeCallbacks(this.backgroundRunnable);
            this.mHandler.postDelayed(this.backgroundRunnable, ON_BACKGROUND_REPORT_DELAY_MILLIS);
        }
    }

    public synchronized void handleForeground() {
        ButtonLog.info(TAG, "Activity foregrounded.");
        this.mHandler.removeCallbacks(this.backgroundRunnable);
        if (!this.mIsInForeground) {
            this.mIsInForeground = true;
            this.mPublisher.perform(new Publisher.Action<OnApplicationEvent>() {
                public void perform(OnApplicationEvent onApplicationEvent) {
                    onApplicationEvent.onForegrounded();
                }
            });
            if (this.mFirstLaunch.getAndSet(false)) {
                this.mEventTracker.trackEvent(Events.APP_LAUNCH);
            } else {
                this.mEventTracker.trackEvent(Events.APP_FOREGROUND);
            }
        }
    }

    public synchronized void start() {
        this.mFirstLaunch.set(true);
        this.mApplication.registerActivityLifecycleCallbacks(this.mCallbacks);
    }

    public synchronized void stop() {
        this.mApplication.unregisterActivityLifecycleCallbacks(this.mCallbacks);
    }

    public ApplicationHooks(Application application, EventTracker eventTracker, Handler handler) {
        this.mFirstLaunch = new AtomicBoolean(true);
        this.mIsInForeground = false;
        this.mPublisher = new Publisher<>();
        this.backgroundRunnable = new Runnable() {
            public void run() {
                synchronized (ApplicationHooks.this) {
                    if (ApplicationHooks.this.mIsInForeground) {
                        boolean unused = ApplicationHooks.this.mIsInForeground = false;
                        ApplicationHooks.this.mEventTracker.trackEvent(Events.APP_BACKGROUND);
                    }
                }
            }
        };
        this.mCallbacks = new Application.ActivityLifecycleCallbacks() {
            public Intent mLastIntent;

            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            public void onActivityDestroyed(Activity activity) {
                try {
                    if (ApplicationHooks.this.mLastTopActivity != null && ApplicationHooks.this.mLastTopActivity.get() == activity) {
                        WeakReference unused = ApplicationHooks.this.mLastTopActivity = null;
                    }
                } catch (Throwable th) {
                    ButtonLog.warn(ApplicationHooks.TAG, "Exception while handling onActivityDestroyed.", th);
                }
            }

            public void onActivityPaused(Activity activity) {
                try {
                    ApplicationHooks.this.handleBackground();
                } catch (Throwable th) {
                    ButtonLog.warn(ApplicationHooks.TAG, "Exception while handling onActivityPaused.", th);
                }
            }

            public void onActivityResumed(Activity activity) {
                try {
                    ApplicationHooks.this.handleForeground();
                    WeakReference unused = ApplicationHooks.this.mLastTopActivity = new WeakReference(activity);
                } catch (Throwable th) {
                    ButtonLog.warn(ApplicationHooks.TAG, "Exception while handling onActivityResumed.", th);
                }
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public void onActivityStarted(Activity activity) {
                try {
                    Intent intent = activity.getIntent();
                    if (intent != this.mLastIntent) {
                        ApplicationHooks.this.handleIntent(intent);
                    }
                    this.mLastIntent = intent;
                } catch (Throwable th) {
                    ButtonLog.warn(ApplicationHooks.TAG, "Exception while handling onActivityStarted.", th);
                }
            }

            public void onActivityStopped(Activity activity) {
            }
        };
        this.mApplication = application;
        this.mEventTracker = eventTracker;
        this.mHandler = handler;
    }
}
