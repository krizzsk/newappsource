package p776rp;

import com.masabi.ticket.schema.GenericField;
import java.util.HashMap;

/* renamed from: rp.c */
public final class C19310c {

    /* renamed from: a */
    public static final HashMap f49154a;

    static {
        HashMap hashMap = new HashMap();
        for (GenericField genericField : GenericField.values()) {
            hashMap.put(Integer.valueOf(genericField.getFieldId()), genericField.getDefaultFieldType());
        }
        f49154a = hashMap;
        GenericField.UNRECOGNIZED.getFieldId();
        GenericField.ISSUER.getFieldId();
        GenericField.E_TICKET_NUMBER.getFieldId();
        GenericField.PRODUCT_ID_STRING.getFieldId();
        GenericField.FROM_STATION_STRING.getFieldId();
        GenericField.TO_STATION_STRING.getFieldId();
        GenericField.FROM_TO_STATION_STRING.getFieldId();
        GenericField.LINE.getFieldId();
        GenericField.ZONE.getFieldId();
        GenericField.USES_PERMITTED.getFieldId();
        GenericField.DEPART_TIME.getFieldId();
        GenericField.VALIDITY_START_PACKED_DATE_TIME.getFieldId();
        GenericField.VALIDITY_DURATION_DAYS.getFieldId();
        GenericField.PURCHASE_PACKED_DATE_TIME.getFieldId();
        GenericField.PRICE.getFieldId();
        GenericField.DISCOUNT_CODE_NUMBER.getFieldId();
        GenericField.CARD_LAST_FOUR_DIGITS.getFieldId();
        GenericField.CARDHOLDER_NAME.getFieldId();
        GenericField.NUM_OF_PEOPLE.getFieldId();
        GenericField.RSA_IMPL.getFieldId();
        GenericField.AGE_TYPE.getFieldId();
        GenericField.RAILCARD_NAME.getFieldId();
        GenericField.TRAVEL_CLASS_TYPE.getFieldId();
        GenericField.TRAVEL_DIRECTION.getFieldId();
        GenericField.PURCHASE_UTC_DATE_TIME.getFieldId();
        GenericField.PURCHASE_REFERENCE.getFieldId();
        GenericField.PASSENGER_ID.getFieldId();
        GenericField.ROUTE_CODE_NUMBER.getFieldId();
        GenericField.FARE_RESTRICTIONS.getFieldId();
        GenericField.NUM_RIDERS_CLIENT_ENCODED.getFieldId();
        GenericField.ACTIVATION_START_UTC_DATE_TIME.getFieldId();
        GenericField.DEVICE_UTC_DATE_TIME.getFieldId();
        GenericField.GEO_LATITUDE.getFieldId();
        GenericField.GEO_LONGITUDE.getFieldId();
        GenericField.USES_LEFT.getFieldId();
        GenericField.VALIDITY_EXPIRY_PACKED_DATE_TIME.getFieldId();
        GenericField.ACTIVATION_DURATION_MINS.getFieldId();
        GenericField.ACTIVATION_EXPIRY_UTC_DATE_TIME.getFieldId();
        GenericField.SEAT_NUMBER_STRING.getFieldId();
        GenericField.VALIDITY_PERIOD_PACKED_DATE_TIMES.getFieldId();
        GenericField.CONFIG_USERNAME.getFieldId();
        GenericField.CONFIG_PASSWORD.getFieldId();
        GenericField.CONFIG_BARCODE.getFieldId();
        GenericField.CONFIG_BRAND.getFieldId();
        GenericField.CONFIG_TVD_URL.getFieldId();
        GenericField.CONFIG_AUTH_URL.getFieldId();
        GenericField.CONFIG_METADATA_URL.getFieldId();
        GenericField.CONFIG_LOCATION.getFieldId();
        GenericField.CONFIG_DIRECTION.getFieldId();
        GenericField.CONFIG_VEHICLE_CODE.getFieldId();
        GenericField.VALIDITY_DURATION_MINS.getFieldId();
        GenericField.USE_PERIOD_SPECIFICATION_BYTE_ARRAY.getFieldId();
        GenericField.FROM_STATION_NUMBER.getFieldId();
        GenericField.VIA_STATION_NUMBER.getFieldId();
        GenericField.TO_STATION_NUMBER.getFieldId();
        GenericField.EMAIL_ADDRESS.getFieldId();
        GenericField.USES_COUNT.getFieldId();
        GenericField.NUM_RIDERS_SERVER_ENCODED.getFieldId();
        GenericField.NUM_TICKETS_IN_PURCHASED_PRODUCT.getFieldId();
        GenericField.PARENT_PRODUCT_ID_STRING.getFieldId();
        GenericField.PRODUCT_ID_NUMBER.getFieldId();
        GenericField.MODE_OF_TRANSPORT.getFieldId();
        GenericField.IDENTITY_INFORMATION.getFieldId();
        GenericField.USE_PERIOD_EXPIRY_UTC_DATE_TIME.getFieldId();
        GenericField.UNIQUE_USER_ID_STRING.getFieldId();
        GenericField.VALIDITY_START_UTC_DATE_TIME.getFieldId();
        GenericField.VALIDITY_EXPIRY_UTC_DATE_TIME.getFieldId();
        GenericField.VALIDITY_PERIOD_UTC_DATE_TIMES.getFieldId();
        GenericField.SERVICE_NUMBER_STRING.getFieldId();
        GenericField.COUPON_TYPE_NUMBER.getFieldId();
        GenericField.CUSTOMER_PRODUCT_REFERENCE_STRING.getFieldId();
        GenericField.FROM_STATION_EXTERNAL_STRING.getFieldId();
        GenericField.TO_STATION_EXTERNAL_STRING.getFieldId();
        GenericField.CONFIG_NETWORK_INTERFACE_NAME.getFieldId();
        GenericField.CONFIG_NETWORK_INTERFACE_ENABLED.getFieldId();
        GenericField.CONFIG_DHCP.getFieldId();
        GenericField.CONFIG_IP_ADDRESS.getFieldId();
        GenericField.CONFIG_NETMASK.getFieldId();
        GenericField.CONFIG_NETWORK_BRIDGED.getFieldId();
        GenericField.CONFIG_NETWORK_ROUTE_PRIORITY.getFieldId();
        GenericField.CONFIG_ACCESS_POINT_NAME.getFieldId();
        GenericField.CONFIG_ACCESS_POINT_USERNAME.getFieldId();
        GenericField.CONFIG_ACCESS_POINT_PASSWORD.getFieldId();
        GenericField.CONFIG_SSID.getFieldId();
        GenericField.CONFIG_WIFI_PASSWORD.getFieldId();
        GenericField.CONFIG_WIFI_HOTSPOT.getFieldId();
        GenericField.CONFIG_SSID_HIDDEN.getFieldId();
        GenericField.CONFIG_DEFAULT_GATEWAY.getFieldId();
        GenericField.CONFIG_DNS_SERVER_1.getFieldId();
        GenericField.CONFIG_DNS_SERVER_2.getFieldId();
        GenericField.CONFIG_SEARCH_DOMAIN.getFieldId();
        GenericField.CONFIG_RESET_CREDENTIALS.getFieldId();
        GenericField.CONFIG_DEVICE_TYPE.getFieldId();
        GenericField.CONFIG_OPERATING_MODE.getFieldId();
        GenericField.CONFIG_USE_MTA_INTEGRATION_BOARD.getFieldId();
        GenericField.CONFIG_AVL_ENDPOINT.getFieldId();
        GenericField.FREE_USE_STRING.getFieldId();
        GenericField.EXTRA_FIELD_SCHEMA_VERSION.getFieldId();
        GenericField.RAILCARD_CODE.getFieldId();
        GenericField.RAILCARD_NUMBER.getFieldId();
        GenericField.SELLING_MACHINE_TYPE.getFieldId();
        GenericField.SELLING_STATION_STRING.getFieldId();
        GenericField.SELLING_MACHINE_NUMBER.getFieldId();
        GenericField.SELLING_TRANSACTION_NUMBER.getFieldId();
        GenericField.ISSUE_VERSION_NUMBER.getFieldId();
        GenericField.MEDIA_CHANNEL.getFieldId();
        GenericField.USE_PERIOD_START_UTC_DATE_TIME.getFieldId();
        GenericField.OPERATOR.getFieldId();
        GenericField.INTEROP.getFieldId();
        GenericField.BIN_IN_ACCEPTED_RANGE.getFieldId();
        GenericField.CONFIG_SCREEN_ROTATION.getFieldId();
        GenericField.SCHEMA_VERSION.getFieldId();
        GenericField.EMV_TRANSACTION_SUCCESS.getFieldId();
    }
}
