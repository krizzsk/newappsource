package androidx.ads.identifier;

public class AdvertisingIdNotAvailableException extends Exception {
    public AdvertisingIdNotAvailableException(String str) {
        super(str);
    }

    public AdvertisingIdNotAvailableException(RuntimeException runtimeException) {
        super("Advertising ID Provider throws a exception.", runtimeException);
    }
}
