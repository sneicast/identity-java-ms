package dev.scastillo.identity.shared.utils;

import java.time.OffsetDateTime;
import java.time.ZoneId;

public class DateTimeUtils {
    private static final ZoneId COLOMBIA_ZONE = ZoneId.of("America/Bogota");

    public static OffsetDateTime nowInColombia() {
        return OffsetDateTime.now(COLOMBIA_ZONE);
    }
}
