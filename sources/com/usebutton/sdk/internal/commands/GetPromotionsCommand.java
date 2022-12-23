package com.usebutton.sdk.internal.commands;

import com.usebutton.sdk.action.ActionQuery;
import com.usebutton.sdk.internal.ImageLoader;
import com.usebutton.sdk.internal.api.ActionCache;
import com.usebutton.sdk.internal.api.ButtonApi;
import com.usebutton.sdk.internal.api.ButtonNetworkException;
import com.usebutton.sdk.internal.api.models.AppActionDTO;
import com.usebutton.sdk.internal.api.models.BodyDTO;
import com.usebutton.sdk.internal.api.models.BrowserDTO;
import com.usebutton.sdk.internal.api.models.MetaDTO;
import com.usebutton.sdk.internal.api.models.PreviewDTO;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.core.Storage;
import com.usebutton.sdk.internal.models.AppAction;
import com.usebutton.sdk.internal.models.AssetCollection;
import com.usebutton.sdk.internal.models.Browser;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.StopWatch;

public class GetPromotionsCommand extends AuthenticatedCommand {
    private static final String TAG = "GetPromotionsCommand";
    private final ActionCache mCache;
    private final ActionQuery mContext;
    private final ImageLoader mImageLoader;
    private final String mKey;
    private final String mPlacementId;
    private final String mPubRef;

    public GetPromotionsCommand(ButtonApi buttonApi, Storage storage, ActionCache actionCache, ImageLoader imageLoader, String str, String str2, ActionQuery actionQuery, FailableReceiver<AppAction> failableReceiver) {
        super(buttonApi, storage, failableReceiver);
        this.mImageLoader = imageLoader;
        this.mPlacementId = str;
        this.mPubRef = str2;
        this.mContext = actionQuery;
        this.mCache = actionCache;
        this.mKey = String.format("%s,%s,%s", new Object[]{str, str2, contextKey(actionQuery)});
    }

    private String contextKey(ActionQuery actionQuery) {
        return actionQuery == null ? "" : actionQuery.key();
    }

    private AppActionDTO getButton() throws ButtonNetworkException {
        AppActionDTO validateButton = validateButton(this.mApi.getButton(this.mPlacementId, this.mPubRef, this.mContext));
        if (validateButton != null) {
            ButtonLog.visibleFormat("Button action fetched (Button ID: %s, Action ID: %s)", this.mPlacementId, validateButton.mMeta.f30925id);
        } else {
            ButtonLog.visibleFormat("Button has no action available (Button ID: %s)", this.mPlacementId);
        }
        return validateButton;
    }

    private AppAction reportResult(AppAction appAction) {
        return appAction;
    }

    private AppActionDTO validateButton(AppActionDTO appActionDTO) {
        if (appActionDTO == null) {
            return null;
        }
        MetaDTO metaDTO = appActionDTO.mMeta;
        if (metaDTO.f30925id == null) {
            ButtonLog.visible("Button rejected (No ID).");
            return null;
        } else if (metaDTO.sourceToken == null) {
            ButtonLog.visible("Button rejected (No source token).");
            return null;
        } else {
            PreviewDTO previewDTO = appActionDTO.mPreview;
            if (previewDTO == null) {
                ButtonLog.visible("Button rejected (No preview).");
                return null;
            } else if (previewDTO.mLabel == null) {
                ButtonLog.visible("Button rejected (No preview label).");
                return null;
            } else if (!Browser.TARGET_WEBVIEW.equals(metaDTO.target) || appActionDTO.mBrowser != null) {
                BrowserDTO browserDTO = appActionDTO.mBrowser;
                if (browserDTO == null || browserDTO.titleText != null) {
                    if (appActionDTO.mPreview.mDeepLink == null) {
                        BodyDTO.ListDTO listDTO = appActionDTO.mList;
                        if (listDTO == null) {
                            ButtonLog.visible("Button rejected, no valid body.");
                            return null;
                        } else if (listDTO.groups.isEmpty()) {
                            ButtonLog.visible("Button rejected (No inventory group).");
                            return null;
                        } else if (appActionDTO.mList.groups.get(0).mItems.isEmpty()) {
                            ButtonLog.visible("Button rejected (No inventory items).");
                            return null;
                        }
                    }
                    return appActionDTO;
                }
                ButtonLog.visible("Button rejected, no valid title field for browser.");
                return null;
            } else {
                ButtonLog.visible("Button rejected, no valid browser while target=webview.");
                return null;
            }
        }
    }

    public String key() {
        return this.mKey;
    }

    public AppAction execute() throws Exception {
        AppAction appAction;
        super.execute();
        if (isCancelled()) {
            return null;
        }
        StopWatch stopWatch = new StopWatch();
        if (this.mCache.contains(this.mPlacementId, this.mPubRef, this.mContext)) {
            appAction = this.mCache.get(this.mPlacementId, this.mPubRef, this.mContext);
            if (appAction != null) {
                ButtonLog.visibleFormat("Button action retrieved from local cache (Button ID: %s, Action ID: %s)", this.mPlacementId, appAction.getMeta().getId());
            }
        } else {
            appAction = null;
        }
        if (appAction == null) {
            AppActionDTO button = getButton();
            stopWatch.lap("- /get-button");
            appAction = AppAction.fromDTO(button);
            stopWatch.lap(" - converted to model");
            this.mCache.put(this.mPlacementId, this.mPubRef, this.mContext, appAction);
        }
        if (appAction == null) {
            return reportResult((AppAction) null);
        }
        new AssetCollection(appAction).downloadToAsset(this.mImageLoader);
        stopWatch.lap(" - downloaded assets");
        if (isCancelled()) {
            return null;
        }
        stopWatch.stop("GetPromotionsCommand finished");
        return reportResult(appAction);
    }
}
