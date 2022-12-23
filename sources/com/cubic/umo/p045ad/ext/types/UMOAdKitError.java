package com.cubic.umo.p045ad.ext.types;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\bQ\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bR¨\u0006S"}, mo59060d2 = {"Lcom/cubic/umo/ad/ext/types/UMOAdKitError;", "", "", "desc", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "NONE", "AD_KIT_NOT_INITIALIZED", "AD_KIT_ALREADY_INITIALIZED", "AD_KIT_INITIALIZATION_ALREADY_IN_PROGRESS", "INVALID_CONFIG_BASE_PATH", "EXTERNAL_CONFIG_FETCH_FAILED", "INVALID_EXTERNAL_CONFIG_PARAMS", "EXTERNAL_CONFIG_MISSING_BANNER_AND_ROLL_PARAMS", "INVALID_EXTERNAL_CONFIG_BANNER_PLAYLIST", "INVALID_EXTERNAL_CONFIG_BANNER_SERVER_URL", "INVALID_EXTERNAL_CONFIG_ROLL_PLAYLIST", "INVALID_EXTERNAL_CONFIG_ROLL_SERVER_URL", "EXTERNAL_CONFIG_FETCH_TIMED_OUT", "REMOTE_AD_TEMPLATES_FETCH_FAILED", "REMOTE_AD_TEMPLATES_INVALID", "REMOTE_AD_TEMPLATES_FETCH_TIMED_OUT", "AD_RENDERING_TEMPLATES_NOT_READY", "AD_KIT_ROLL_SLOT_PARAMS_NOT_SET", "AD_KIT_ROLL_SLOT_PARAMS_ALREADY_SET", "INVALID_SPOT_ID", "INVALID_SPOTS_INFO", "INVALID_URL", "INVALID_PUBLISHER_ID", "INVALID_AD_SLOT", "INVALID_AD_DATA", "AD_REQUEST_FAILED", "AD_RESPONSE_PROCESSING_ERROR", "AD_TEMPLATE_MISSING", "AD_REQUEST_TIMED_OUT", "AD_PLAY_FAILED", "AD_PLAY_TIMED_OUT", "NETWORK_ERROR", "PREVIOUS_AD_REQUEST_IN_PROGRESS", "PREVIOUS_AD_PREFETCH_REQUEST_IN_PROGRESS", "INVALID_BANNER_OPERATION", "ROLLAD_OPERATION_NOT_ALLOWED_NOW", "BANNER_OPERATION_NOT_ALLOWED_NOW", "BANNER_REFRESH_ON_ORIENTATION_NOT_ALLOWED", "BANNER_FETCH_FAILED", "BANNER_SHOW_FAILED", "BANNER_REFRESH_FAILED", "BANNER_REMOVAL_FAILED", "BANNER_AUTO_REFRESH_FAILED", "INVALID_BANNER_PARAMS", "INVALID_INLINE_BANNER_TYPE", "INVALID_INTERSTITIAL_BANNER_TYPE", "INVALID_BANNER_WIDTH", "INVALID_BANNER_HEIGHT", "EMPTY_AD_CONTENT", "UNSUPPORTED_BANNER_TYPE", "NO_AD_AVAILABLE_FOR_SPOT", "AD_PREFETCH_NOT_ENABLED_IN_HOSTED_CONFIG", "AD_PREFETCH_NOT_ENABLED", "PREFETCHED_AD_ALREADY_EXISTS", "EMPTY_RICH_MEDIA_AD_CONTENT", "MISSING_MRAID_JS_IN_MRAID", "API_NOT_ALLOWED_FOR_MULTISPOT_USECASE", "INTERSTITIAL_NOT_ALLOWED_FOR_MULTISPOT_USECASE", "API_NOT_ALLOWED_FOR_SINGLE_BANNER_USECASE", "API_NOT_ALLOWED_FOR_INTERSTITIAL_USECASE", "API_NOT_ALLOWED_FOR_VIDEO_SPOT", "PREVIOUS_AD_PLAY_IN_PROGRESS", "NO_AD_PLAY_IN_PROGRESS", "NO_AD_AVAILABLE_FOR_SLOT", "INTERSTITIAL_VIDEO_NOT_SUPPORTED_IN_BANNER_SLOT", "AD_TYPE_UNSUPPORTED", "BAD_INPUTS", "INVALID_CONTEXT", "INVALID_AD_VIEW", "INVALID_ROLL_PARAMS", "INVALID_HANDLE", "UNKNOWN", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.ext.types.UMOAdKitError */
public enum UMOAdKitError {
    NONE("None"),
    AD_KIT_NOT_INITIALIZED("UMOAdKit: Not yet Initialized"),
    AD_KIT_ALREADY_INITIALIZED("UMOAdKit: Already Initialized"),
    AD_KIT_INITIALIZATION_ALREADY_IN_PROGRESS("UMOAdKit: Initialization already in Progress"),
    INVALID_CONFIG_BASE_PATH("UMOAdKit: Invalid Config File Base Path"),
    EXTERNAL_CONFIG_FETCH_FAILED("UMOAdKit: Fetching external configuration json failed"),
    INVALID_EXTERNAL_CONFIG_PARAMS("UMOAdKit: External configuration json fetched but Invalid"),
    EXTERNAL_CONFIG_MISSING_BANNER_AND_ROLL_PARAMS("UMOAdKit: External configuration json is missing both Banner and Roll Params"),
    INVALID_EXTERNAL_CONFIG_BANNER_PLAYLIST("UMOAdKit: Invalid Banner Ad Playlist in external configuration json"),
    INVALID_EXTERNAL_CONFIG_BANNER_SERVER_URL("UMOAdKit: Invalid Banner Ad Server Url in external configuration json"),
    INVALID_EXTERNAL_CONFIG_ROLL_PLAYLIST("UMOAdKit: Invalid Roll Ad Playlist in external configuration json"),
    INVALID_EXTERNAL_CONFIG_ROLL_SERVER_URL("UMOAdKit: Invalid Roll Ad Server Url in external configuration json"),
    EXTERNAL_CONFIG_FETCH_TIMED_OUT("UMOAdKit: Fetching external configuration Timed Out"),
    REMOTE_AD_TEMPLATES_FETCH_FAILED("UMOAdKit: Fetching Remote Ad Templates Json failed"),
    REMOTE_AD_TEMPLATES_INVALID("UMOAdKit: Remote Ad Templates json fetched but Invalid"),
    REMOTE_AD_TEMPLATES_FETCH_TIMED_OUT("UMOAdKit: Fetching Remote Ad Templates Json Timed Out"),
    AD_RENDERING_TEMPLATES_NOT_READY("UMOAdKit: Ad Rendering Templates are not yet Ready"),
    AD_KIT_ROLL_SLOT_PARAMS_NOT_SET("UMOAdKit: Roll Slot Params not yet set"),
    AD_KIT_ROLL_SLOT_PARAMS_ALREADY_SET("UMOAdKit: Roll Slot Params already set"),
    INVALID_SPOT_ID("UMOAdKit: Invalid Spot Id"),
    INVALID_SPOTS_INFO("UMOAdKit: Invalid Ad Spot(s) Info"),
    INVALID_URL("UMOAdKit: Invalid Url"),
    INVALID_PUBLISHER_ID("UMOAdKit: Invalid Publisher Id"),
    INVALID_AD_SLOT("UMOAdKit: Invalid Ad Slot"),
    INVALID_AD_DATA("UMOAdKit: Invalid Ad Data"),
    AD_REQUEST_FAILED("UMOAdKit: Ad Request failed"),
    AD_RESPONSE_PROCESSING_ERROR("UMOAdKit: Ad Response Processing failed"),
    AD_TEMPLATE_MISSING("UMOAdKit: Ad Template missing"),
    AD_REQUEST_TIMED_OUT("UMOAdKit: Ad Request Timed Out"),
    AD_PLAY_FAILED("UMOAdKit: Ad Play failed"),
    AD_PLAY_TIMED_OUT("UMOAdKit: Ad Play Timed Out"),
    NETWORK_ERROR("UMOAdKit: No Network Connectivity"),
    PREVIOUS_AD_REQUEST_IN_PROGRESS("UMOAdKit: Previous Ad Request in Progress"),
    PREVIOUS_AD_PREFETCH_REQUEST_IN_PROGRESS("UMOAdKit: Previous Ad Prefetch in Progress"),
    INVALID_BANNER_OPERATION("UMOAdKit: Invalid Banner Operation"),
    ROLLAD_OPERATION_NOT_ALLOWED_NOW("UMOAdKit: Roll Ad Operation not allowed now"),
    BANNER_OPERATION_NOT_ALLOWED_NOW("UMOAdKit: Banner Operation not allowed now"),
    BANNER_REFRESH_ON_ORIENTATION_NOT_ALLOWED("UMOAdKit: Banner Refresh on Orientation Change not allowed for the provided Banner Type."),
    BANNER_FETCH_FAILED("UMOAdKit: Banner Fetch failed"),
    BANNER_SHOW_FAILED("UMOAdKit: Banner Show not failed"),
    BANNER_REFRESH_FAILED("UMOAdKit: Banner Refresh failed"),
    BANNER_REMOVAL_FAILED("UMOAdKit: Banner Removal failed"),
    BANNER_AUTO_REFRESH_FAILED("UMOAdKit: Banner Auto-Refresh failed"),
    INVALID_BANNER_PARAMS("UMOAdKit: Invalid Banner Params"),
    INVALID_INLINE_BANNER_TYPE("UMOAdKit: Invalid Inline Banner Type"),
    INVALID_INTERSTITIAL_BANNER_TYPE("UMOAdKit: Invalid Interstitial Banner Type"),
    INVALID_BANNER_WIDTH("UMOAdKit: Invalid Banner Width"),
    INVALID_BANNER_HEIGHT("UMOAdKit: Invalid Banner Height"),
    EMPTY_AD_CONTENT("UMOAdKit: Empty Ad Content"),
    UNSUPPORTED_BANNER_TYPE("UMOAdKit: Unsupported Banner Type"),
    NO_AD_AVAILABLE_FOR_SPOT("UMOAdKit: No Ad available for Spot"),
    AD_PREFETCH_NOT_ENABLED_IN_HOSTED_CONFIG("UMOAdKit: Ad Prefetch not enabled in Hosted Configuration"),
    AD_PREFETCH_NOT_ENABLED("UMOAdKit: Ad Prefetch not enabled"),
    PREFETCHED_AD_ALREADY_EXISTS("UMOAdKit: A Prefetched ad already exists"),
    EMPTY_RICH_MEDIA_AD_CONTENT("UMOAdKit: Empty Rich Media Ad Content"),
    MISSING_MRAID_JS_IN_MRAID("MRAID Ad received but mraid.js seems to be missing"),
    API_NOT_ALLOWED_FOR_MULTISPOT_USECASE("UMOAdKit: Wrong API called. Please use the equivalent Multispot API"),
    INTERSTITIAL_NOT_ALLOWED_FOR_MULTISPOT_USECASE("UMOAdKit: Interstitial Placement Type not allowed for Multispot Usecase"),
    API_NOT_ALLOWED_FOR_SINGLE_BANNER_USECASE("UMOAdKit: Wrong API called. Please use the equivalent Single Banner API"),
    API_NOT_ALLOWED_FOR_INTERSTITIAL_USECASE("UMOAdKit: API not allowed for Interstitial Usecase"),
    API_NOT_ALLOWED_FOR_VIDEO_SPOT("UMOAdKit: API not allowed for Video Spots"),
    PREVIOUS_AD_PLAY_IN_PROGRESS("UMOAdKit: Previous Ad Play in Progress"),
    NO_AD_PLAY_IN_PROGRESS("UMOAdKit: No Ad Play in Progress"),
    NO_AD_AVAILABLE_FOR_SLOT("UMOAdKit: No Ad available for the specified slot"),
    INTERSTITIAL_VIDEO_NOT_SUPPORTED_IN_BANNER_SLOT("UMOAdKit: Interstitial Video not supported in Banner Slot. Please use Roll Slot, instead"),
    AD_TYPE_UNSUPPORTED("UMOAdKit: Unsupported Ad Type received"),
    BAD_INPUTS("UMOAdKit: Bad API Inputs"),
    INVALID_CONTEXT("UMOAdKit: Invalid Application / Activity Context"),
    INVALID_AD_VIEW("UMOAdKit: Invalid Ad View"),
    INVALID_ROLL_PARAMS("UMOAdKit: Invalid Roll Slot Params"),
    INVALID_HANDLE("UMOAdKit: Invalid Handle"),
    UNKNOWN("UMOAdKit: Unknown Error");
    
    public static final C2223a Companion = null;
    /* access modifiers changed from: private */
    public static final Map<String, UMOAdKitError> map = null;
    private final String desc;

    /* renamed from: com.cubic.umo.ad.ext.types.UMOAdKitError$a */
    public static final class C2223a {
    }

    /* access modifiers changed from: public */
    static {
        int i;
        Companion = new C2223a();
        map = new HashMap();
        UMOAdKitError[] values = values();
        int length = values.length;
        while (i < length) {
            UMOAdKitError uMOAdKitError = values[i];
            i++;
            map.put(uMOAdKitError.desc, uMOAdKitError);
        }
    }

    private UMOAdKitError(String str) {
        this.desc = str;
    }

    public final String getDesc() {
        return this.desc;
    }
}
