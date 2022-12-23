package com.masabi.ticket.schema;

import p800sp.C19501a;
import p800sp.C19502b;
import p800sp.C19503c;
import p800sp.C19504d;
import p800sp.C19505e;
import p800sp.C19506f;
import p800sp.C19507g;
import p800sp.C19508h;
import p800sp.C19509i;
import p800sp.C19510j;
import p800sp.C19511k;

public enum GenericField {
    UNRECOGNIZED(new C19511k()),
    ISSUER(new C19510j()),
    E_TICKET_NUMBER(new C19510j()),
    PRODUCT_ID_STRING(new C19510j()),
    FROM_STATION_STRING(new C19510j()),
    TO_STATION_STRING(new C19510j()),
    FROM_TO_STATION_STRING(new C19510j()),
    LINE(new C19510j()),
    ZONE(new C19502b()),
    USES_PERMITTED(new C19509i()),
    DEPART_TIME(new C19509i()),
    VALIDITY_START_PACKED_DATE_TIME(new C19503c()),
    VALIDITY_DURATION_DAYS(new C19509i()),
    PURCHASE_PACKED_DATE_TIME(new C19503c()),
    PRICE(new C19509i()),
    DISCOUNT_CODE_NUMBER(new C19509i()),
    CARD_LAST_FOUR_DIGITS(new C19509i()),
    CARDHOLDER_NAME(new C19510j()),
    NUM_OF_PEOPLE(new C19509i()),
    RSA_IMPL(new C19510j()),
    AGE_TYPE(new C19509i()),
    RAILCARD_NAME(new C19510j()),
    TRAVEL_CLASS_TYPE(new C19509i()),
    TRAVEL_DIRECTION(new C19510j()),
    PURCHASE_UTC_DATE_TIME(new C19504d()),
    PURCHASE_REFERENCE(new C19510j()),
    PASSENGER_ID(new C19510j()),
    ROUTE_CODE_NUMBER(new C19509i()),
    FARE_RESTRICTIONS(new C19510j()),
    NUM_RIDERS_CLIENT_ENCODED(new C19509i()),
    ACTIVATION_START_UTC_DATE_TIME(new C19504d()),
    DEVICE_UTC_DATE_TIME(new C19504d()),
    GEO_LATITUDE(new C19509i()),
    GEO_LONGITUDE(new C19509i()),
    USES_LEFT(new C19509i()),
    VALIDITY_EXPIRY_PACKED_DATE_TIME(new C19503c()),
    ACTIVATION_DURATION_MINS(new C19509i()),
    ACTIVATION_EXPIRY_UTC_DATE_TIME(new C19504d()),
    SEAT_NUMBER_STRING(new C19510j()),
    VALIDITY_PERIOD_PACKED_DATE_TIMES(new C19507g()),
    CONFIG_RESERVED_FOR_FUTURE_USE(new C19511k()),
    CONFIG_USERNAME(new C19510j()),
    CONFIG_PASSWORD(new C19510j()),
    CONFIG_BARCODE(new C19510j()),
    CONFIG_BRAND(new C19510j()),
    CONFIG_TVD_URL(new C19510j()),
    CONFIG_AUTH_URL(new C19510j()),
    CONFIG_METADATA_URL(new C19510j()),
    CONFIG_LOCATION(new C19510j()),
    CONFIG_DIRECTION(new C19510j()),
    CONFIG_VEHICLE_CODE(new C19510j()),
    VALIDITY_DURATION_MINS(new C19509i()),
    USE_PERIOD_SPECIFICATION_BYTE_ARRAY(new C19502b()),
    RESERVED_FOR_FUTURE_USE_1(new C19511k()),
    FROM_STATION_NUMBER(new C19509i()),
    VIA_STATION_NUMBER(new C19509i()),
    TO_STATION_NUMBER(new C19509i()),
    EMAIL_ADDRESS(new C19510j()),
    USES_COUNT(new C19509i()),
    NUM_RIDERS_SERVER_ENCODED(new C19509i()),
    NUM_TICKETS_IN_PURCHASED_PRODUCT(new C19509i()),
    PARENT_PRODUCT_ID_STRING(new C19510j()),
    PRODUCT_ID_NUMBER(new C19509i()),
    MODE_OF_TRANSPORT(new C19509i()),
    RESERVED_FOR_FUTURE_USE_2(new C19511k()),
    IDENTITY_INFORMATION(new C19510j()),
    USE_PERIOD_EXPIRY_UTC_DATE_TIME(new C19504d()),
    UNIQUE_USER_ID_STRING(new C19510j()),
    VALIDITY_START_UTC_DATE_TIME(new C19504d()),
    VALIDITY_EXPIRY_UTC_DATE_TIME(new C19504d()),
    VALIDITY_PERIOD_UTC_DATE_TIMES(new C19508h()),
    SERVICE_NUMBER_STRING(new C19510j()),
    COUPON_TYPE_NUMBER(new C19509i()),
    CUSTOMER_PRODUCT_REFERENCE_STRING(new C19510j()),
    FROM_STATION_EXTERNAL_STRING(new C19510j()),
    TO_STATION_EXTERNAL_STRING(new C19510j()),
    CONFIG_NETWORK_INTERFACE_NAME(new C19510j()),
    CONFIG_NETWORK_INTERFACE_ENABLED(new C19501a()),
    CONFIG_DHCP(new C19501a()),
    CONFIG_IP_ADDRESS(new C19510j()),
    CONFIG_NETMASK(new C19510j()),
    CONFIG_NETWORK_BRIDGED(new C19501a()),
    CONFIG_NETWORK_ROUTE_PRIORITY(new C19509i()),
    CONFIG_ACCESS_POINT_NAME(new C19510j()),
    CONFIG_ACCESS_POINT_USERNAME(new C19510j()),
    CONFIG_ACCESS_POINT_PASSWORD(new C19510j()),
    CONFIG_SSID(new C19510j()),
    CONFIG_WIFI_PASSWORD(new C19510j()),
    CONFIG_WIFI_HOTSPOT(new C19510j()),
    CONFIG_SSID_HIDDEN(new C19501a()),
    CONFIG_DEFAULT_GATEWAY(new C19510j()),
    CONFIG_DNS_SERVER_1(new C19510j()),
    CONFIG_DNS_SERVER_2(new C19510j()),
    CONFIG_SEARCH_DOMAIN(new C19510j()),
    CONFIG_RESET_CREDENTIALS(new C19501a()),
    CONFIG_DEVICE_TYPE(new C19510j()),
    CONFIG_OPERATING_MODE(new C19505e(OperatingModeConstants.class)),
    CONFIG_USE_MTA_INTEGRATION_BOARD(new C19501a()),
    CONFIG_AVL_ENDPOINT(new C19510j()),
    FREE_USE_STRING(new C19510j()),
    EXTRA_FIELD_SCHEMA_VERSION(new C19509i()),
    RAILCARD_CODE(new C19510j()),
    RAILCARD_NUMBER(new C19510j()),
    SELLING_MACHINE_TYPE(new C19509i()),
    SELLING_STATION_STRING(new C19510j()),
    SELLING_MACHINE_NUMBER(new C19509i()),
    SELLING_TRANSACTION_NUMBER(new C19509i()),
    ISSUE_VERSION_NUMBER(new C19509i()),
    MEDIA_CHANNEL(new C19505e(MediaChannelConstants.class)),
    USE_PERIOD_START_UTC_DATE_TIME(new C19504d()),
    OPERATOR(new C19510j()),
    INTEROP(new C19509i()),
    BIN_IN_ACCEPTED_RANGE(new C19501a()),
    CONFIG_SCREEN_ROTATION(new C19505e(ScreenRotation.class)),
    SCHEMA_VERSION(new C19509i()),
    EMV_TRANSACTION_SUCCESS(new C19501a()),
    VALIDITY_CODE(new C19510j()),
    NON_REVENUE_UNLOAD_COUPON(new C19501a()),
    VIA_LONDON_FLAG(new C19501a()),
    CARNET_COUNT(new C19509i()),
    SELECTED_FOR_VALIDATION(new C19501a());
    
    private final C19506f defaultFieldType;

    private GenericField(C19506f fVar) {
        this.defaultFieldType = fVar;
    }

    /* renamed from: id */
    public static GenericField m36855id(int i) {
        GenericField id = m36856id(i, (GenericField) null);
        if (id != null) {
            return id;
        }
        throw new IllegalArgumentException(C16759e.m42349e("No generic field exists for the given id ", i));
    }

    public C19506f getDefaultFieldType() {
        return this.defaultFieldType;
    }

    public int getFieldId() {
        return ordinal();
    }

    /* renamed from: id */
    public static GenericField m36856id(int i, GenericField genericField) {
        GenericField[] values = values();
        return (i < 0 || i >= values.length) ? genericField : values[i];
    }
}
