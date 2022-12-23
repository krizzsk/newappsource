package com.usebutton.sdk;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import com.usebutton.sdk.action.ButtonActionsInterface;
import com.usebutton.sdk.boost.Boost;
import com.usebutton.sdk.configuration.Configuration;
import com.usebutton.sdk.debug.DebugInterface;
import com.usebutton.sdk.internal.ButtonPrivate;
import com.usebutton.sdk.internal.ButtonRepository;
import com.usebutton.sdk.internal.ImageLoader;
import com.usebutton.sdk.internal.NoOpButtonActions;
import com.usebutton.sdk.internal.NoOpPurchasePath;
import com.usebutton.sdk.internal.api.ActionCache;
import com.usebutton.sdk.internal.api.ButtonApi;
import com.usebutton.sdk.internal.api.HostInformation;
import com.usebutton.sdk.internal.api.RequestShepherd;
import com.usebutton.sdk.internal.boost.BoostModule;
import com.usebutton.sdk.internal.boost.NoOpBoostModule;
import com.usebutton.sdk.internal.configuration.ConfigurationModule;
import com.usebutton.sdk.internal.core.ApplicationHooks;
import com.usebutton.sdk.internal.core.CommandExecutor;
import com.usebutton.sdk.internal.core.FileManager;
import com.usebutton.sdk.internal.core.Storage;
import com.usebutton.sdk.internal.events.EventTracker;
import com.usebutton.sdk.internal.functional.Getter;
import com.usebutton.sdk.internal.models.UrlMatcher;
import com.usebutton.sdk.internal.notifications.NotificationDispatcher;
import com.usebutton.sdk.internal.secure.SecureStore;
import com.usebutton.sdk.internal.user.UserModule;
import com.usebutton.sdk.internal.util.ButtonUtil;
import com.usebutton.sdk.internal.util.DebugProxy;
import com.usebutton.sdk.internal.util.IdentifierForAdvertiserProvider;
import com.usebutton.sdk.internal.util.PackageObserver;
import com.usebutton.sdk.purchasepath.PurchasePathInterface;
import com.usebutton.sdk.user.User;

public final class Button {

    public static class InvalidAppIdException extends IllegalStateException {
        public InvalidAppIdException(String str) {
            super(str);
        }
    }

    public interface OnConfigureListener {
        void onComplete(Throwable th);
    }

    public static ButtonActionsInterface actions() {
        ButtonPrivate button = button();
        if (button != null) {
            return button;
        }
        return new NoOpButtonActions();
    }

    public static Boost boost() {
        ButtonPrivate button = button();
        if (button != null) {
            return BoostModule.getInstance(button.getButtonRepository());
        }
        return new NoOpBoostModule();
    }

    private static synchronized ButtonPrivate button() {
        ButtonPrivate button;
        synchronized (Button.class) {
            button = ButtonPrivate.getButton();
        }
        return button;
    }

    public static void clearAllData() {
        button().clearAllData();
    }

    public static Configuration configuration() {
        return ConfigurationModule.getInstance();
    }

    public static void configure(Context context, String str) {
        configure(context, str, (OnConfigureListener) null);
    }

    public static DebugInterface debug() {
        return DebugProxy.getInstance();
    }

    private static void initializeCore(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        ConfigurationModule instance = ConfigurationModule.getInstance();
        HostInformation hostInformation = new HostInformation(context2, str2);
        final Storage storage = new Storage(context2, str2);
        ButtonApi buttonApi = new ButtonApi(hostInformation, new IdentifierForAdvertiserProvider(context2), new RequestShepherd(context2));
        PackageObserver packageObserver = new PackageObserver(context2);
        ActionCache actionCache = new ActionCache();
        C122351 r14 = new Getter<com.usebutton.sdk.internal.models.Configuration>() {
            public com.usebutton.sdk.internal.models.Configuration get() {
                com.usebutton.sdk.internal.models.Configuration configuration = storage.getConfiguration();
                return configuration != null ? configuration : com.usebutton.sdk.internal.models.Configuration.emptyConfiguration();
            }
        };
        ImageLoader imageLoader = new ImageLoader(context2, r14, buttonApi.getHttp());
        UrlMatcher urlMatcher = new UrlMatcher(r14);
        CommandExecutor defaultExecutor = CommandExecutor.defaultExecutor();
        SecureStore secureStore = new SecureStore(context2);
        UserModule instance2 = UserModule.getInstance(secureStore, instance);
        CommandExecutor commandExecutor = defaultExecutor;
        ButtonRepository buttonRepository = new ButtonRepository(buttonApi, storage, new FileManager(context2), commandExecutor, instance2);
        EventTracker eventTracker = new EventTracker(context2, storage, instance2, instance);
        ApplicationHooks applicationHooks = new ApplicationHooks((Application) context.getApplicationContext(), eventTracker);
        SecureStore secureStore2 = secureStore;
        NotificationDispatcher notificationDispatcher = new NotificationDispatcher(context2, NotificationManagerCompat.from(context), (NotificationManager) context2.getSystemService("notification"), eventTracker, r14, buttonRepository);
        ApplicationHooks applicationHooks2 = applicationHooks;
        ButtonPrivate.setButton(new ButtonPrivate(buttonApi, storage, eventTracker, commandExecutor, packageObserver, applicationHooks2, actionCache, imageLoader, urlMatcher, secureStore2, buttonRepository, notificationDispatcher));
    }

    public static void onLocaleChanged(Context context) {
        button().doOnLocaleChanged(context);
    }

    public static PurchasePathInterface purchasePath() {
        ButtonPrivate button = button();
        if (button != null) {
            return button;
        }
        return new NoOpPurchasePath();
    }

    public static User user() {
        SecureStore secureStore;
        ButtonPrivate button = ButtonPrivate.getButton();
        if (button != null) {
            secureStore = button.getSecureStore();
        } else {
            secureStore = null;
        }
        return UserModule.getInstance(secureStore, ConfigurationModule.getInstance());
    }

    public static void configure(Context context, String str, OnConfigureListener onConfigureListener) {
        if (button() != null) {
            if (onConfigureListener != null) {
                onConfigureListener.onComplete((Throwable) null);
            }
        } else if (!ButtonUtil.isApplicationIdValid(str)) {
            String format = String.format("Button App ID '%s' is not valid. You can find your App ID in the dashboard by logging in at https://app.usebutton.com/", new Object[]{str});
            if (onConfigureListener != null) {
                onConfigureListener.onComplete(new InvalidAppIdException(format));
            }
        } else {
            initializeCore(context.getApplicationContext(), str);
            button().setContext(context.getApplicationContext());
            button().configure(onConfigureListener);
        }
    }
}
