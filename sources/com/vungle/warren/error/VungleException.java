package com.vungle.warren.error;

public class VungleException extends Exception {
    private String exceptionBody;
    private final int exceptionCode;

    public VungleException(int i) {
        this.exceptionCode = i;
        this.exceptionBody = "";
    }

    /* renamed from: b */
    public static int m57171b(Throwable th) {
        if (th instanceof VungleException) {
            return ((VungleException) th).exceptionCode;
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo58207a() {
        return this.exceptionCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.exceptionCode == ((VungleException) obj).exceptionCode) {
            return true;
        }
        return false;
    }

    public final String getLocalizedMessage() {
        switch (this.exceptionCode) {
            case 1:
                return "No advertisements are available for your current bid. Please try again later.";
            case 2:
                return "Unknown Error Occurred.";
            case 3:
                return "Configuration Error Occurred. Please check your appID and placementIDs, and try again when network connectivity is available.";
            case 4:
                return "The advertisement in the cache has expired and can no longer be played. Please load another ad";
            case 5:
                return "Placement not configured properly, check Vungle's dashboard or contact support for help with configuration";
            case 6:
                return "Please ensure all parameter for init marked as NonNull are provided, as they are essential for functioning of our SDK";
            case 7:
                return "Please provide Application context so our SDK can continue to support our API beyond Activity lifecycle";
            case 8:
                return "There is already an ongoing operation for the action you requested. Please wait until the operation finished before starting another.";
            case 9:
                return "Vungle is not initialized/no longer initialized. Please call Vungle.init() to reinitialize.";
            case 10:
                return "Unable to play advertisement";
            case 11:
                return "Advertisement failed to download";
            case 12:
                return "No auto-cached Placement on config";
            case 13:
                return "Placement is not valid";
            case 14:
                return "Remote Server responded with http Retry-After, SDK will retry this request.";
            case 15:
                return "Vungle is already playing different ad.";
            case 16:
                return "There is not enough file system size on a device to initialize VungleSDK";
            case 17:
                return "There is not enough file system size on a device to request an ad.";
            case 18:
                return "There is not enough file system size on a device to request an ad for auto cache.";
            case 19:
                return "There is not enough file system size on a device to download assets for an ad.";
            case 20:
                return "Network error. Try again later";
            case 21:
                return "Server error";
            case 22:
                return "Server temporary unavailable. Try again later";
            case 23:
                return "Assets download failed. Try again later";
            case 24:
                return "Assets download failed.";
            case 25:
                return "Operation was canceled";
            case 26:
                return "Database error";
            case 27:
                return "Render error";
            case 28:
                return "Ad size is invalid";
            case 29:
                return "Cannot request or play Banner Ads from Vungle API, please use Banners.loadBanner() or Banners.getBanner()";
            case 30:
                return "Cannot request or play MREC or FullScreen Ads from Banner API, please use Vungle.loadAd(), Vungle.playAd()";
            case 31:
                return "Android web view has crashed";
            case 32:
                return "Android web view render became unresponsive, please clean-up your Webview process if any";
            case 33:
                return "Network error. Please check if network is available and permission for network access is granted.";
            case 34:
                return "Network permissions not granted. Please check manifest for android.permission.INTERNET and android.permission.ACCESS_NETWORK_STATE";
            case 35:
                return "The SDK minimum version should not be overridden. Will not work as expected.";
            case 36:
                return "No Event id passed for HBP";
            case 37:
                return "The cached Ad is no longer available due to expired timestamp";
            case 38:
                return "Ad rendering failed due to network connectivity issue";
            case 39:
                return "Out of memory";
            case 40:
                StringBuilder k = C13555b.m33972k("Creative error: ");
                k.append(this.exceptionBody);
                return k.toString();
            case 41:
                return "Cannot request or play Native Ads from Vungle API, please use NativeAd API instead.";
            default:
                return "Unknown Exception Code";
        }
    }

    public final int hashCode() {
        return this.exceptionCode;
    }

    public VungleException(String str) {
        this.exceptionCode = 40;
        this.exceptionBody = str;
    }
}
