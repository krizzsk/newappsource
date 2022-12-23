package com.usebutton.sdk.internal.api.models;

import com.usebutton.sdk.internal.api.models.BodyDTO;
import org.json.JSONException;
import org.json.JSONObject;

public class AppActionDTO extends BaseDTO {
    private static final String KEY_APP = "app";
    private static final String KEY_BODY = "body";
    private static final String KEY_BROWSER = "browser";
    private static final String KEY_CARD = "card";
    private static final String KEY_FOOTER = "footer";
    private static final String KEY_HEADER = "header";
    private static final String KEY_LINKS = "links";
    private static final String KEY_META = "meta";
    private static final String KEY_PREVIEW = "preview";
    private static final String KEY_TYPE = "type";
    public final AppDTO mApp;
    public BrowserDTO mBrowser;
    public final FooterDTO mFooter;
    public final HeaderDTO mHeader;
    public final LinkDTO mLinks;
    public final BodyDTO.ListDTO mList;
    public final MetaDTO mMeta;
    public final PreviewDTO mPreview;
    public final String mType;

    public AppActionDTO(MetaDTO metaDTO, AppDTO appDTO, PreviewDTO previewDTO, HeaderDTO headerDTO, BodyDTO bodyDTO, FooterDTO footerDTO, BrowserDTO browserDTO, String str, LinkDTO linkDTO) {
        this.mMeta = metaDTO;
        this.mApp = appDTO;
        this.mPreview = previewDTO;
        this.mHeader = headerDTO;
        this.mType = str;
        if (bodyDTO instanceof BodyDTO.ListDTO) {
            this.mList = (BodyDTO.ListDTO) bodyDTO;
        } else {
            this.mList = null;
        }
        this.mFooter = footerDTO;
        this.mBrowser = browserDTO;
        this.mLinks = linkDTO;
    }

    public static AppActionDTO fromJson(JSONObject jSONObject) throws JSONException {
        String str;
        FooterDTO footerDTO;
        BodyDTO bodyDTO;
        HeaderDTO headerDTO;
        if (jSONObject == null || !jSONObject.has("meta")) {
            return null;
        }
        MetaDTO fromJson = MetaDTO.fromJson(jSONObject.getJSONObject("meta"));
        AppDTO fromJson2 = AppDTO.fromJson(jSONObject.optJSONObject("app"));
        PreviewDTO fromJson3 = PreviewDTO.fromJson(jSONObject.optJSONObject(KEY_PREVIEW));
        BrowserDTO fromJson4 = BrowserDTO.fromJson(jSONObject.optJSONObject("browser"));
        JSONObject optJSONObject = jSONObject.optJSONObject("card");
        LinkDTO fromJson5 = LinkDTO.fromJson(jSONObject.optJSONObject(KEY_LINKS));
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("type");
            HeaderDTO fromJson6 = HeaderDTO.fromJson(optJSONObject.optJSONObject("header"));
            bodyDTO = BodyDTO.fromJson(optJSONObject.getString("type"), optJSONObject.optJSONObject("body"));
            str = optString;
            footerDTO = FooterDTO.fromJson(optJSONObject.optJSONObject("footer"));
            headerDTO = fromJson6;
        } else {
            headerDTO = null;
            bodyDTO = null;
            footerDTO = null;
            str = null;
        }
        return new AppActionDTO(fromJson, fromJson2, fromJson3, headerDTO, bodyDTO, footerDTO, fromJson4, str, fromJson5);
    }
}
