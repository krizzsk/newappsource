package com.usebutton.sdk.internal;

import android.content.Context;
import android.net.Uri;
import com.usebutton.sdk.internal.api.ButtonApi;
import com.usebutton.sdk.internal.boost.BoostResponsePrivate;
import com.usebutton.sdk.internal.boost.PostBoostViewCommand;
import com.usebutton.sdk.internal.browser.BrowserSession;
import com.usebutton.sdk.internal.commands.AutofillMappingsCommand;
import com.usebutton.sdk.internal.commands.GetBrowserSessionContextCommand;
import com.usebutton.sdk.internal.commands.GetConfigurationCommand;
import com.usebutton.sdk.internal.commands.GetWebViewJsCommand;
import com.usebutton.sdk.internal.commands.ImageDownloadCommand;
import com.usebutton.sdk.internal.commands.PostPageViewCommand;
import com.usebutton.sdk.internal.commands.PostTapCommand;
import com.usebutton.sdk.internal.core.CommandExecutor;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.core.FileManager;
import com.usebutton.sdk.internal.core.NoOpReceiver;
import com.usebutton.sdk.internal.core.Storage;
import com.usebutton.sdk.internal.models.BrowserCardType;
import com.usebutton.sdk.internal.models.Configuration;
import com.usebutton.sdk.internal.models.MetaInfo;
import com.usebutton.sdk.internal.user.UserModule;
import java.util.List;
import org.json.JSONObject;

public class ButtonRepository {
    private BrowserSession browserSession;
    private final ButtonApi buttonApi;
    private final CommandExecutor commandExecutor;
    private final FileManager fileManager;
    private MetaInfo metaInfo;
    private final Storage storage;
    private final UserModule userModule;

    public ButtonRepository(ButtonApi buttonApi2, Storage storage2, FileManager fileManager2, CommandExecutor commandExecutor2, UserModule userModule2) {
        this.buttonApi = buttonApi2;
        this.storage = storage2;
        this.fileManager = fileManager2;
        this.commandExecutor = commandExecutor2;
        this.userModule = userModule2;
    }

    public void clear() {
        this.storage.clear();
        this.userModule.clear();
    }

    public void fetchConfiguration(ConfigurationUpdatePolicy configurationUpdatePolicy) {
        fetchConfiguration(configurationUpdatePolicy, new NoOpReceiver());
    }

    public void getAutofillMappings(JSONObject jSONObject, FailableReceiver<JSONObject> failableReceiver) {
        this.commandExecutor.dispatch(new AutofillMappingsCommand(this.buttonApi, this.storage, jSONObject, failableReceiver));
    }

    public BrowserSession getBrowserSession() {
        if (this.browserSession == null) {
            this.browserSession = new BrowserSession();
        }
        return this.browserSession;
    }

    public void getBrowserSessionContext(FailableReceiver<JSONObject> failableReceiver) {
        this.commandExecutor.dispatchFirst(new GetBrowserSessionContextCommand(getBrowserSession(), this.metaInfo, this.buttonApi, this.storage, failableReceiver));
    }

    public Configuration getConfiguration() {
        Configuration configuration = this.storage.getConfiguration();
        if (configuration == null) {
            return Configuration.emptyConfiguration();
        }
        return configuration;
    }

    public void getImage(Context context, String str, Uri uri, int i, FailableReceiver<ImageDownloadCommand.RemoteImage> failableReceiver) {
        this.commandExecutor.dispatch(new ImageDownloadCommand(context, str, uri, i, failableReceiver));
    }

    public int getInternalRewardCardDisplayCount(BrowserCardType browserCardType) {
        return this.storage.getInternalRewardCardDisplayCount(browserCardType);
    }

    public Storage getStorage() {
        return this.storage;
    }

    public UserModule getUserModule() {
        return this.userModule;
    }

    public void getWebViewJs(FailableReceiver<String> failableReceiver) {
        String webViewJsBridgeUrl = getConfiguration().getParameters().getWebViewJsBridgeUrl();
        if (webViewJsBridgeUrl == null) {
            failableReceiver.onError();
        } else {
            this.commandExecutor.dispatchFirst(new GetWebViewJsCommand(webViewJsBridgeUrl, this.buttonApi, this.storage, this.fileManager, failableReceiver));
        }
    }

    public void postBoostView(String str, FailableReceiver<BoostResponsePrivate> failableReceiver) {
        this.commandExecutor.dispatch(new PostBoostViewCommand(this.buttonApi, this.storage, str, failableReceiver));
    }

    public void postPageView(String str, String str2, String str3, List<String> list, FailableReceiver<JSONObject> failableReceiver) {
        this.commandExecutor.dispatch(new PostPageViewCommand(this.buttonApi, this.storage, str, str2, str3, list, failableReceiver));
    }

    public void postTap(String str, String str2, FailableReceiver<JSONObject> failableReceiver) {
        this.commandExecutor.dispatch(new PostTapCommand(this.buttonApi, this.storage, str, str2, failableReceiver));
    }

    public void setConfiguration(Configuration configuration, ConfigurationUpdatePolicy configurationUpdatePolicy) {
        this.storage.setConfiguration(configuration);
        configurationUpdatePolicy.setState();
    }

    public void setInternalRewardCardDisplayCount(BrowserCardType browserCardType, int i) {
        this.storage.setInternalRewardCardDisplayCount(browserCardType, i);
    }

    public void setMetaInfo(MetaInfo metaInfo2) {
        this.metaInfo = metaInfo2;
    }

    public void fetchConfiguration(ConfigurationUpdatePolicy configurationUpdatePolicy, FailableReceiver<Configuration> failableReceiver) {
        this.commandExecutor.dispatch(new GetConfigurationCommand(this.buttonApi, this.storage, configurationUpdatePolicy, failableReceiver));
    }
}
