package com.appboy.models;

import android.net.Uri;
import androidx.annotation.Keep;
import com.appboy.enums.inappmessage.ClickAction;
import com.appboy.enums.inappmessage.CropType;
import com.appboy.enums.inappmessage.DismissType;
import com.appboy.enums.inappmessage.InAppMessageFailureType;
import com.appboy.enums.inappmessage.MessageType;
import com.appboy.enums.inappmessage.Orientation;
import com.appboy.enums.inappmessage.TextAlign;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@Keep
public interface IInAppMessage extends IPutIntoJson<JSONObject> {
    boolean getAnimateIn();

    boolean getAnimateOut();

    int getBackgroundColor();

    ClickAction getClickAction();

    CropType getCropType();

    DismissType getDismissType();

    int getDurationInMilliseconds();

    long getExpirationTimestamp();

    Map<String, String> getExtras();

    String getIcon();

    int getIconBackgroundColor();

    int getIconColor();

    Map<String, String> getLocalPrefetchedAssetPaths();

    String getMessage();

    TextAlign getMessageTextAlign();

    int getMessageTextColor();

    MessageType getMessageType();

    boolean getOpenUriInWebView();

    Orientation getOrientation();

    List<String> getRemoteAssetPathsForPrefetch();

    Uri getUri();

    boolean isControl();

    boolean logClick();

    boolean logDisplayFailure(InAppMessageFailureType inAppMessageFailureType);

    boolean logImpression();

    void onAfterClosed();

    void setAnimateIn(boolean z);

    void setAnimateOut(boolean z);

    void setBackgroundColor(int i);

    boolean setClickAction(ClickAction clickAction);

    boolean setClickAction(ClickAction clickAction, Uri uri);

    void setCropType(CropType cropType);

    void setDismissType(DismissType dismissType);

    void setDurationInMilliseconds(int i);

    void setExpirationTimestamp(long j);

    void setExtras(Map<String, String> map);

    void setIcon(String str);

    void setIconBackgroundColor(int i);

    void setIconColor(int i);

    void setLocalPrefetchedAssetPaths(Map<String, String> map);

    void setMessage(String str);

    void setMessageTextAlign(TextAlign textAlign);

    void setMessageTextColor(int i);

    void setOpenUriInWebView(boolean z);

    void setOrientation(Orientation orientation);
}
