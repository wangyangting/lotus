package cn.metsea.lotus.common.utils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Date Utils
 */
public class DateUtils {

    /**
     * date format of yyyy-MM-dd HH:mm:ss
     */
    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    /**
     * convert time to yyyy-MM-dd HH:mm:ss format
     *
     * @param date date
     * @return date string
     */
    public static String dateToString(Date date) {
        return format(date, YYYY_MM_DD_HH_MM_SS);
    }

    /**
     * get the formatted date string
     *
     * @param date   date
     * @param format e.g. yyyy-MM-dd HH:mm:ss
     * @return date string
     */
    public static String format(Date date, String format) {
        return format(date2LocalDateTime(date), format);
    }

    /**
     * get the formatted date string
     *
     * @param localDateTime local data time
     * @param format        yyyy-MM-dd HH:mm:ss
     * @return date string
     */
    public static String format(LocalDateTime localDateTime, String format) {
        return localDateTime.format(DateTimeFormatter.ofPattern(format));
    }

    /**
     * date to local datetime
     *
     * @param date date
     * @return local datetime
     */
    private static LocalDateTime date2LocalDateTime(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }

}
