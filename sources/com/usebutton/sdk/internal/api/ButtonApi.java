package com.usebutton.sdk.internal.api;

import com.usebutton.sdk.action.ActionQuery;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.usebutton.sdk.internal.api.Request;
import com.usebutton.sdk.internal.api.models.AppActionDTO;
import com.usebutton.sdk.internal.api.models.ClientEventDTO;
import com.usebutton.sdk.internal.commands.GetBrowserSessionContextCommand;
import com.usebutton.sdk.internal.core.Response;
import com.usebutton.sdk.internal.core.Storage;
import com.usebutton.sdk.internal.models.Configuration;
import com.usebutton.sdk.internal.recipients.RecipientRegistry;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.ButtonUtil;
import com.usebutton.sdk.internal.util.IdentifierForAdvertiserProvider;
import com.usebutton.sdk.internal.util.JsonBuilder;
import java.net.URL;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ButtonApi {
    private static final String TAG = "ButtonApi";
    private final String mApplicationId;
    private final String mBaseUrl;
    private final Http mHttp;
    private final IdentifierForAdvertiserProvider mIdentifierForAdvertiserProvider;
    private JSONObject mPermanentCapabilities;
    private SessionRateLimiter mRateLimiter;
    private String mSessionId;
    private final RequestShepherd mShepherd;
    private String mUserIdentifier;

    public ButtonApi(HostInformation hostInformation, IdentifierForAdvertiserProvider identifierForAdvertiserProvider, RequestShepherd requestShepherd) {
        this(hostInformation, identifierForAdvertiserProvider, new Http(hostInformation.getUserAgent()), requestShepherd);
    }

    private void addDeviceIdentifiers(JSONObject jSONObject) throws JSONException {
        String ifa = getIfa();
        if (ifa == null) {
            ifa = "";
        }
        jSONObject.put(GetBrowserSessionContextCommand.KEY_IFA, ifa);
        jSONObject.put("ifa_limited", this.mIdentifierForAdvertiserProvider.isTrackingLimited());
    }

    private void addThirdPartyIdentifier(JSONObject jSONObject) throws JSONException {
        String str = this.mUserIdentifier;
        if (str == null || !str.isEmpty()) {
            putSafely(jSONObject, "thirdparty_id", this.mUserIdentifier);
        }
    }

    private static void append(JSONObject jSONObject, String str, Object obj) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
            jSONObject.put(str, optJSONArray);
        }
        optJSONArray.put(obj);
    }

    private JSONObject buildCapabilities(HostInformation hostInformation) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("screen_scale", (double) hostInformation.getScreenDensity());
            jSONObject.put("supported_display_types", JsonBuilder.toArray("standard_button_v1", "inventory_button_v1"));
            jSONObject.put("target_types", JsonBuilder.toArray("app_v1", "webview_v1", "browser_v1"));
            jSONObject.put("supported_enhancements", JsonBuilder.toArray(RecipientRegistry.getEnhancements()));
        } catch (JSONException e) {
            ButtonLog.warn(TAG, "Couldn't form capabilities object.", e);
        }
        return jSONObject;
    }

    private JSONObject buildContext(ActionQuery actionQuery) throws JSONException {
        JSONObject jSONObject;
        Locale locale = Locale.getDefault();
        if (actionQuery != null) {
            jSONObject = actionQuery.getData();
        } else {
            jSONObject = new JSONObject();
        }
        putSafely(jSONObject, "locale", locale.getLanguage() + "-" + locale.getCountry());
        putSafely(jSONObject, AppActionRequest.KEY_USER_LOCAL_TIME, ButtonUtil.isoFormat(new Date()));
        return jSONObject;
    }

    private JSONObject executeSessionRequest(Request.Get get) throws ButtonNetworkException {
        get.withParameterIfNotNull(GetBrowserSessionContextCommand.KEY_SESSION_ID, this.mSessionId);
        get.withParameterIfNotNull(GetBrowserSessionContextCommand.KEY_IFA, getIfa());
        get.withParameter("ifa_limited", this.mIdentifierForAdvertiserProvider.isTrackingLimited());
        String str = this.mUserIdentifier;
        if (str != null && !str.isEmpty()) {
            get.withParameter("thirdparty_id", this.mUserIdentifier);
        }
        return this.mHttp.executeRequest(get).body();
    }

    private JSONObject getBaseSessionPayload() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(GetBrowserSessionContextCommand.KEY_SESSION_ID, this.mSessionId);
        addDeviceIdentifiers(jSONObject);
        addThirdPartyIdentifier(jSONObject);
        return jSONObject;
    }

    private void putSafely(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (!jSONObject.has(str)) {
            jSONObject.put(str, str2);
        }
    }

    private void setSessionId(String str) {
        String str2 = this.mSessionId;
        if (str != str2) {
            if (str == null || !str.equals(str2)) {
                ButtonLog.info(TAG, String.format("Changed session id from '%s' to '%s'", new Object[]{this.mSessionId, str}));
                this.mSessionId = str;
            }
        }
    }

    private String urlFor(String str) {
        return String.format(this.mBaseUrl, new Object[]{getApplicationId()}) + "/" + str.replaceAll("^/", "");
    }

    private Object valueOrNull(Object obj) {
        return obj != null ? obj : JSONObject.NULL;
    }

    public String createSession() throws ButtonNetworkException {
        HttpResponse executeRequest;
        if (!this.mRateLimiter.isRateLimited()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("application_id", this.mApplicationId);
                addDeviceIdentifiers(jSONObject);
                addThirdPartyIdentifier(jSONObject);
                try {
                    executeRequest = this.mHttp.executeRequest(new Request.Post(urlFor("/v1/session")).withBody(jSONObject));
                    String string = executeRequest.body().getJSONObject("object").getString("id");
                    setSessionId(string);
                    return string;
                } catch (JSONException e) {
                    throw new ButtonNetworkException("Error while extracting session id from " + executeRequest, e);
                } catch (ButtonHttpStatusException e2) {
                    if (e2.wasUnauthorized()) {
                        ButtonLog.visible("Session creation failed (Invalid App ID)");
                    } else {
                        ButtonLog.visibleFormat("Session creation failed (Request ID: %s)", e2.getRequestId());
                    }
                    this.mRateLimiter.parseException(e2);
                    throw e2;
                }
            } catch (JSONException e3) {
                throw new IllegalArgumentException(e3);
            }
        } else {
            throw new ButtonNetworkException("Session requests have been rate limited.");
        }
    }

    public String getApplicationId() {
        return this.mApplicationId;
    }

    public JSONObject getAutofillMappings(JSONObject jSONObject) throws ButtonNetworkException {
        JSONObject jSONObject2;
        try {
            jSONObject2 = getBaseSessionPayload();
            try {
                jSONObject2.put("autofill", jSONObject);
                return this.mHttp.executeRequest(new Request.Post(urlFor("/v1/session/autofill-mappings")).withBody(jSONObject2)).body();
            } catch (JSONException e) {
                e = e;
                throw new ButtonNetworkException("Couldn't form requestJson parameter, " + jSONObject2, e);
            }
        } catch (JSONException e2) {
            e = e2;
            jSONObject2 = null;
            throw new ButtonNetworkException("Couldn't form requestJson parameter, " + jSONObject2, e);
        }
    }

    public AppActionDTO getButton(String str, String str2, ActionQuery actionQuery) throws ButtonNetworkException {
        JSONObject jSONObject;
        try {
            JSONObject json = new AppActionRequest.Builder(getBaseSessionPayload()).capabilities(new JSONObject(this.mPermanentCapabilities.toString())).context(buildContext(actionQuery)).placementId(str).pubRef(str2).userLocalTime(ButtonUtil.isoFormat(new Date())).build().toJson();
            putSafely(json, "thirdparty_id", this.mUserIdentifier);
            jSONObject = this.mHttp.executeRequest(new Request.Post(urlFor("/v1/session/get-button")).withBody(json)).body();
            try {
                return AppActionDTO.fromJson(jSONObject.getJSONObject("object"));
            } catch (JSONException e) {
                e = e;
                ButtonLog.warn(TAG, "Malformed promotions response: " + jSONObject, e);
                return null;
            }
        } catch (JSONException e2) {
            e = e2;
            jSONObject = null;
            ButtonLog.warn(TAG, "Malformed promotions response: " + jSONObject, e);
            return null;
        }
    }

    public Configuration getConfiguration() throws ButtonNetworkException {
        JSONObject executeSessionRequest = executeSessionRequest(new Request.Get(urlFor("/v1/session/configuration")));
        try {
            return new Configuration(executeSessionRequest.getJSONObject("object").getJSONObject("configuration"));
        } catch (JSONException e) {
            throw new ButtonNetworkException("Could not find configuration object in response" + executeSessionRequest, e);
        }
    }

    public Http getHttp() {
        return this.mHttp;
    }

    public String getIfa() {
        return this.mIdentifierForAdvertiserProvider.getPrimaryIdentifier();
    }

    public Response<AppActionDTO> getLinks(String str, String str2, JSONObject jSONObject) throws ButtonNetworkException {
        try {
            return getLinks(new AppActionRequest.Builder(getBaseSessionPayload()).merchantId(str).pubRef(str2).bvpt(jSONObject).build().toJson());
        } catch (JSONException e) {
            throw new ButtonNetworkException("Couldn't form request", e);
        }
    }

    public RequestShepherd getShepherd() {
        return this.mShepherd;
    }

    public byte[] getWebViewJavascript(String str) throws ButtonNetworkException {
        return this.mHttp.requestJs(new Request.Get(str));
    }

    public JSONObject postBoostView(String str) throws ButtonNetworkException {
        JSONObject jSONObject;
        try {
            jSONObject = getBaseSessionPayload();
            try {
                jSONObject.put("boostview_id", str);
                return this.mHttp.executeRequest(new Request.Post(urlFor("/v1/session/boostview")).withBody(jSONObject)).body();
            } catch (JSONException e) {
                e = e;
                throw new ButtonNetworkException("Couldn't form requestJson parameter, " + jSONObject, e);
            }
        } catch (JSONException e2) {
            e = e2;
            jSONObject = null;
            throw new ButtonNetworkException("Couldn't form requestJson parameter, " + jSONObject, e);
        }
    }

    public JSONObject postEvents(Collection<ClientEventDTO> collection) throws ButtonNetworkException {
        JSONObject jSONObject;
        try {
            jSONObject = getBaseSessionPayload();
            try {
                jSONObject.put("current_time", ButtonUtil.isoDateFormat(System.currentTimeMillis()));
                for (ClientEventDTO next : collection) {
                    if (next != null) {
                        append(jSONObject, "events", next.toJsonObject());
                    }
                }
                return this.mHttp.executeRequest(new Request.Post(urlFor("/v1/session/events")).withBody(jSONObject)).body();
            } catch (JSONException e) {
                e = e;
                throw new ButtonNetworkException("Couldn't form requestJson parameter, " + jSONObject, e);
            }
        } catch (JSONException e2) {
            e = e2;
            jSONObject = null;
            throw new ButtonNetworkException("Couldn't form requestJson parameter, " + jSONObject, e);
        }
    }

    public JSONObject postPageView(String str, String str2, String str3, List<String> list) throws ButtonNetworkException {
        JSONObject jSONObject;
        try {
            jSONObject = getBaseSessionPayload();
            try {
                jSONObject.put("url", str);
                jSONObject.put("btn_ref", str2);
                jSONObject.put(GetBrowserSessionContextCommand.KEY_CAMPAIGN_ID, str3);
                jSONObject.put(AppActionRequest.KEY_USER_LOCAL_TIME, ButtonUtil.isoFormat(new Date()));
                jSONObject.put("flags", new JSONArray(list));
                return this.mHttp.executeRequest(new Request.Post(urlFor("/v1/session/pageview")).withBody(jSONObject)).body();
            } catch (JSONException e) {
                e = e;
                throw new ButtonNetworkException("Couldn't form requestJson parameter, " + jSONObject, e);
            }
        } catch (JSONException e2) {
            e = e2;
            jSONObject = null;
            throw new ButtonNetworkException("Couldn't form requestJson parameter, " + jSONObject, e);
        }
    }

    public JSONObject postTap(String str, String str2) throws ButtonNetworkException {
        JSONObject jSONObject;
        try {
            jSONObject = getBaseSessionPayload();
            try {
                jSONObject.put("btn_ref", str);
                jSONObject.put(GetBrowserSessionContextCommand.KEY_CAMPAIGN_ID, str2);
                return this.mHttp.executeRequest(new Request.Post(urlFor("/v1/session/tap")).withBody(jSONObject)).body();
            } catch (JSONException e) {
                e = e;
                throw new ButtonNetworkException("Couldn't form requestJson parameter, " + jSONObject, e);
            }
        } catch (JSONException e2) {
            e = e2;
            jSONObject = null;
            throw new ButtonNetworkException("Couldn't form requestJson parameter, " + jSONObject, e);
        }
    }

    public void setSessionInfo(Storage storage) {
        setSessionId(storage.getSessionId());
        this.mUserIdentifier = storage.getUserIdentifier();
    }

    public void setUserIdentifier(String str) throws ButtonNetworkException {
        this.mUserIdentifier = str;
        try {
            JSONObject baseSessionPayload = getBaseSessionPayload();
            baseSessionPayload.putOpt("thirdparty_id", valueOrNull(str));
            Request.Put put = new Request.Put(urlFor("/v1/session/customer"));
            put.withBody(baseSessionPayload);
            this.mHttp.executeRequest(put);
        } catch (JSONException e) {
            throw new ButtonNetworkException("Couldn't create update customer request.", e);
        }
    }

    public ButtonApi(HostInformation hostInformation, IdentifierForAdvertiserProvider identifierForAdvertiserProvider, Http http, RequestShepherd requestShepherd) {
        this(hostInformation, identifierForAdvertiserProvider, http, requestShepherd, new SessionRateLimiter());
    }

    public ButtonApi(HostInformation hostInformation, IdentifierForAdvertiserProvider identifierForAdvertiserProvider, Http http, RequestShepherd requestShepherd, SessionRateLimiter sessionRateLimiter) {
        this.mApplicationId = hostInformation.getApplicationId();
        this.mBaseUrl = hostInformation.getConfiguration().getBaseUrl().replaceAll("/$", "");
        this.mIdentifierForAdvertiserProvider = identifierForAdvertiserProvider;
        this.mHttp = http;
        this.mPermanentCapabilities = buildCapabilities(hostInformation);
        this.mShepherd = requestShepherd;
        this.mRateLimiter = sessionRateLimiter;
    }

    public Response<AppActionDTO> getLinks(URL url, String str, String str2, JSONObject jSONObject) throws ButtonNetworkException {
        try {
            return getLinks(new AppActionRequest.Builder(getBaseSessionPayload()).pubRef(str).placementId(str2).url(url).bvpt(jSONObject).build().toJson());
        } catch (JSONException e) {
            throw new ButtonNetworkException("Couldn't form request", e);
        }
    }

    private Response<AppActionDTO> getLinks(JSONObject jSONObject) throws ButtonNetworkException {
        try {
            Request.Post post = new Request.Post(urlFor("/v1/session/get-links"));
            post.withBody(new AppActionRequest.Builder(jSONObject).capabilities(new JSONObject(this.mPermanentCapabilities.toString())).thirdPartyId(this.mUserIdentifier).userLocalTime(ButtonUtil.isoFormat(new Date())).build().toJson());
            HttpResponse executeRequest = this.mHttp.executeRequest(post);
            return Response.success(AppActionDTO.fromJson(executeRequest.body().getJSONObject("object")), executeRequest);
        } catch (JSONException e) {
            throw new ButtonNetworkException("Couldn't form request", e);
        }
    }
}
