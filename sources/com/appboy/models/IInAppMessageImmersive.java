package com.appboy.models;

import androidx.annotation.Keep;
import com.appboy.enums.inappmessage.ImageStyle;
import com.appboy.enums.inappmessage.TextAlign;
import java.util.List;

@Keep
public interface IInAppMessageImmersive extends IInAppMessage {
    int getCloseButtonColor();

    Integer getFrameColor();

    String getHeader();

    TextAlign getHeaderTextAlign();

    int getHeaderTextColor();

    ImageStyle getImageStyle();

    List<MessageButton> getMessageButtons();

    boolean logButtonClick(MessageButton messageButton);

    void setCloseButtonColor(int i);

    void setFrameColor(Integer num);

    void setHeader(String str);

    void setHeaderTextAlign(TextAlign textAlign);

    void setHeaderTextColor(int i);

    void setImageStyle(ImageStyle imageStyle);

    void setMessageButtons(List<MessageButton> list);
}
