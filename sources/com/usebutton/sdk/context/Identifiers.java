package com.usebutton.sdk.context;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Identifiers {
    public static final String IDENTIFIER_AMAZON = "amazon";
    public static final String IDENTIFIER_CUSTOM = "custom";
    public static final String IDENTIFIER_DELIVERY_HERO = "deliveryhero";
    public static final String IDENTIFIER_FACEBOOK = "facebook";
    public static final String IDENTIFIER_FACTUAL = "factual";
    public static final String IDENTIFIER_FOURSQUARE = "foursquare";
    public static final String IDENTIFIER_GOOGLE = "google";
    public static final String IDENTIFIER_GOOGLE_MAPS = "googlemaps";
    public static final String IDENTIFIER_OPENTABLE = "opentable";
    public static final String IDENTIFIER_OPEN_STREET_MAP = "openstreetmap";
    public static final String IDENTIFIER_SELF_PROVIDED = "btn:self";
    public static final String IDENTIFIER_TICKETMASTER = "ticketmaster";
    public static final String IDENTIFIER_WALMART = "walmart";
    public static final String IDENTIFIER_YELP = "yelp";

    @Retention(RetentionPolicy.SOURCE)
    public @interface IdentifierName {
    }

    private Identifiers() {
    }
}
