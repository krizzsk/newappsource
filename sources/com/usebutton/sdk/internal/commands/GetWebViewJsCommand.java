package com.usebutton.sdk.internal.commands;

import com.usebutton.sdk.internal.api.ButtonApi;
import com.usebutton.sdk.internal.core.Command;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.core.FileManager;
import com.usebutton.sdk.internal.core.Storage;
import com.usebutton.sdk.internal.util.ButtonUtil;

public class GetWebViewJsCommand extends Command<String> {
    public static final String JS_FILE_NAME = "btnsdk.js";
    private final ButtonApi buttonApi;
    private final FileManager fileManager;
    private final Storage storage;
    private final String url;

    public GetWebViewJsCommand(String str, ButtonApi buttonApi2, Storage storage2, FileManager fileManager2, FailableReceiver<String> failableReceiver) {
        super(failableReceiver);
        this.url = str;
        this.buttonApi = buttonApi2;
        this.storage = storage2;
        this.fileManager = fileManager2;
    }

    public String key() {
        return "GetWebViewJsCommand";
    }

    public String execute() throws Exception {
        String readFile;
        String webViewJsVersion = this.storage.getWebViewJsVersion();
        String parseSemanticVersion = ButtonUtil.parseSemanticVersion(this.url);
        if (webViewJsVersion != null && webViewJsVersion.equals(parseSemanticVersion) && (readFile = this.fileManager.readFile(JS_FILE_NAME)) != null) {
            return readFile;
        }
        String str = new String(this.buttonApi.getWebViewJavascript(this.url));
        this.fileManager.writeFile(JS_FILE_NAME, str);
        this.storage.setWebViewJsVersion(parseSemanticVersion);
        return str;
    }
}
