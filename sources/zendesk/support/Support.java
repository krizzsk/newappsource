package zendesk.support;

import android.content.Context;
import com.zendesk.logger.Logger;
import java.util.Locale;
import java.util.Map;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.AuthenticationProvider;
import zendesk.core.CoreModule;
import zendesk.core.Zendesk;
import zendesk.support.ApplicationScope;

public enum Support {
    INSTANCE;
    
    private static final String LOG_TAG = "ZendeskConfiguration";
    public ActionHandlerRegistry actionHandlerRegistry;
    private ApplicationScope applicationScope;
    public AuthenticationProvider authenticationProvider;
    public SupportBlipsProvider blipsProvider;
    private Locale helpCenterLocaleOverride;
    private boolean initialised;
    public ProviderStore providerStore;
    public RequestMigrator requestMigrator;
    public RequestProvider requestProvider;
    public SupportModule supportModule;

    private void initApplicationScope(CoreModule coreModule, ApplicationScope applicationScope2) {
        this.applicationScope = applicationScope2;
        DaggerSupportSdkProvidersComponent.builder().coreModule(coreModule).providerModule(new ProviderModule()).storageModule(new StorageModule()).supportApplicationModule(new SupportApplicationModule(applicationScope2)).build().inject(this);
    }

    public Locale getHelpCenterLocaleOverride() {
        return this.helpCenterLocaleOverride;
    }

    public SupportModule getSupportModule() {
        return this.supportModule;
    }

    public void init(Zendesk zendesk2) {
        if (zendesk2.isInitialized()) {
            initApplicationScope(zendesk2.coreModule(), new ApplicationScope.Builder().zendeskTracker(new AnswersTracker()).build());
            this.initialised = true;
            return;
        }
        Logger.m57303b("Cannot use SupportSDK without initializing Zendesk. Call Zendesk.INSTANCE.init(...)", new Object[0]);
    }

    public void installTracker(ZendeskTracker zendeskTracker) {
        initApplicationScope(Zendesk.INSTANCE.coreModule(), this.applicationScope.newBuilder().zendeskTracker(zendeskTracker).build());
    }

    public boolean isAuthenticated() {
        AuthenticationProvider authenticationProvider2 = this.authenticationProvider;
        return (authenticationProvider2 == null || authenticationProvider2.getIdentity() == null) ? false : true;
    }

    public boolean isInitialized() {
        return this.initialised;
    }

    public ProviderStore provider() {
        if (!isInitialized()) {
            Logger.m57303b("Cannot get ProviderStore before SDK has been initialized. init() must be called before provider().", new Object[0]);
            return null;
        } else if (isAuthenticated()) {
            return this.providerStore;
        } else {
            Logger.m57303b("Cannot get ProviderStore before an identity has been set. Zendesk.INSTANCE.setIdentity() must be called before provider().", new Object[0]);
            return null;
        }
    }

    public boolean refreshRequest(String str, Context context) {
        if (!isInitialized()) {
            Logger.m57303b("Cannot use Support SDK without initializing Zendesk. Call Zendesk.INSTANCE.init(...) and Support.INSTANCE.init(Zendesk)", new Object[0]);
            return false;
        } else if (!isAuthenticated()) {
            Logger.m57303b("Cannot use Support SDK without setting an identity. Zendesk.INSTANCE.setIdentity(...) must be called before refreshRequest(...).", new Object[0]);
            return false;
        } else {
            ActionHandlerRegistry actionHandlerRegistry2 = this.actionHandlerRegistry;
            ActionHandler handlerByAction = actionHandlerRegistry2.handlerByAction(Constants.ACTION_REFRESH_REQUEST_CONVERSATION + str);
            if (handlerByAction != null) {
                handlerByAction.handle((Map<String, Object>) null, context);
                return true;
            }
            ActionHandler handlerByAction2 = this.actionHandlerRegistry.handlerByAction(Constants.ACTION_REFRESH_REQUEST_LIST);
            if (handlerByAction2 != null) {
                handlerByAction2.handle((Map<String, Object>) null, context);
            } else {
                this.requestProvider.markRequestAsUnread(str);
            }
            return false;
        }
    }

    public void setHelpCenterLocaleOverride(Locale locale) {
        this.helpCenterLocaleOverride = locale;
    }
}
