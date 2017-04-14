/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class TimeUtil.
 */
public class TimeUtil {

	/** The Constant DATE_PATTERN. */
	private static final String DATE_PATTERN = "dd/MM/yyyy";

	/** The Constant DATETIME_PATTERN. */
	private static final String DATETIME_PATTERN = "dd/MM/yyyy hh:mm:ss";

	/**
	 * Init stuff.
	 */
	public static void init() {
	}

	/**
	 * Convert string to date.
	 *
	 * @param str
	 *            the str
	 * @return the date
	 */
	public static Date convertStringToDate(String str) {
		DateFormat formater = new SimpleDateFormat(DATE_PATTERN);
		try {
			return (Date) formater.parse(str);
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * Convert string to date time.
	 *
	 * @param str
	 *            the str
	 * @return the date
	 */
	public static Date convertStringToDateTime(String str) {
		DateFormat formater = new SimpleDateFormat(DATETIME_PATTERN);
		try {
			return (Date) formater.parse(str);
		} catch (ParseException e) {
			return null;
		}
	}
}
