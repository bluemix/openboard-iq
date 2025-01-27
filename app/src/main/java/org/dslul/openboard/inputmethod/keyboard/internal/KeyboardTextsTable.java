/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dslul.openboard.inputmethod.keyboard.internal;

import java.util.HashMap;
import java.util.Locale;

/**
 * !!!!! DO NOT EDIT THIS FILE !!!!!
 *
 * This file is generated by tools/make-keyboard-text. The base template file is
 *   tools/make-keyboard-text/src/main/resources/org/dslul/openboard/inputmethod/keyboard/
 *   internal/KeyboardTextsTable.tmpl
 *
 * This file must be updated when any text resources in keyboard layout files have been changed.
 * These text resources are referred as "!text/<resource_name>" in keyboard XML definitions,
 * and should be defined in
 *   tools/make-keyboard-text/src/main/resources/values-<locale>/donottranslate-more-keys.xml
 *
 * To update this file, please run the following commands.
 *   $ gradle :tools:make-keyboard-text:makeText
 *
 * The updated source file will be generated to the following path (this file).
 *   app/src/main/java/org/dslul/openboard/inputmethod/keyboard/internal/KeyboardTextsTable.java
 *
 */
public final class KeyboardTextsTable {
    // Name to index map.
    private static final HashMap<String, Integer> sNameToIndexesMap = new HashMap<>();
    // Locale to texts table map.
    private static final HashMap<String, String[]> sLocaleToTextsTableMap = new HashMap<>();
    // TODO: Remove this variable after debugging.
    // Texts table to locale maps.
    private static final HashMap<String[], String> sTextsTableToLocaleMap = new HashMap<>();

    public static String getText(final String name, final String[] textsTable) {
        final Integer indexObj = sNameToIndexesMap.get(name);
        if (indexObj == null) {
            throw new RuntimeException("Unknown text name=" + name + " locale="
                    + sTextsTableToLocaleMap.get(textsTable));
        }
        final int index = indexObj;
        final String text = (index < textsTable.length) ? textsTable[index] : null;
        if (text != null) {
            return text;
        }
        // Validity check.
        if (index >= 0 && index < TEXTS_DEFAULT.length) {
            return TEXTS_DEFAULT[index];
        }
        // Throw exception for debugging purpose.
        throw new RuntimeException("Illegal index=" + index + " for name=" + name
                + " locale=" + sTextsTableToLocaleMap.get(textsTable));
    }

    public static String[] getTextsTable(final Locale locale) {
        final String localeKey = locale.toString();
        if (sLocaleToTextsTableMap.containsKey(localeKey)) {
            return sLocaleToTextsTableMap.get(localeKey);
        }
        final String languageKey = locale.getLanguage();
        if (sLocaleToTextsTableMap.containsKey(languageKey)) {
            return sLocaleToTextsTableMap.get(languageKey);
        }
        return TEXTS_DEFAULT;
    }

    private static final String[] NAMES = {
    //  /* index:histogram */ "name",
        /*   0: 1 */ "morekeys_a",
        /*   1: 1 */ "morekeys_e",
        /*   2: 1 */ "morekeys_i",
        /*   3: 1 */ "morekeys_o",
        /*   4: 1 */ "morekeys_u",
        /*   5: 1 */ "morekeys_s",
        /*   6: 1 */ "morekeys_n",
        /*   7: 1 */ "morekeys_c",
        /*   8: 1 */ "keylabel_to_alpha",
        /*   9: 1 */ "morekeys_star",
        /*  10: 1 */ "morekeys_bullet",
        /*  11: 1 */ "morekeys_left_parenthesis",
        /*  12: 1 */ "morekeys_right_parenthesis",
        /*  13: 1 */ "morekeys_arabic_diacritics",
        /*  14: 1 */ "keyspec_symbols_1",
        /*  15: 1 */ "keyspec_symbols_2",
        /*  16: 1 */ "keyspec_symbols_3",
        /*  17: 1 */ "keyspec_symbols_4",
        /*  18: 1 */ "keyspec_symbols_5",
        /*  19: 1 */ "keyspec_symbols_6",
        /*  20: 1 */ "keyspec_symbols_7",
        /*  21: 1 */ "keyspec_symbols_8",
        /*  22: 1 */ "keyspec_symbols_9",
        /*  23: 1 */ "keyspec_symbols_0",
        /*  24: 1 */ "keylabel_to_symbol",
        /*  25: 1 */ "additional_morekeys_symbols_1",
        /*  26: 1 */ "additional_morekeys_symbols_2",
        /*  27: 1 */ "additional_morekeys_symbols_3",
        /*  28: 1 */ "additional_morekeys_symbols_4",
        /*  29: 1 */ "additional_morekeys_symbols_5",
        /*  30: 1 */ "additional_morekeys_symbols_6",
        /*  31: 1 */ "additional_morekeys_symbols_7",
        /*  32: 1 */ "additional_morekeys_symbols_8",
        /*  33: 1 */ "additional_morekeys_symbols_9",
        /*  34: 1 */ "additional_morekeys_symbols_0",
        /*  35: 1 */ "keyspec_left_parenthesis",
        /*  36: 1 */ "keyspec_right_parenthesis",
        /*  37: 1 */ "keyspec_left_square_bracket",
        /*  38: 1 */ "keyspec_right_square_bracket",
        /*  39: 1 */ "keyspec_left_curly_bracket",
        /*  40: 1 */ "keyspec_right_curly_bracket",
        /*  41: 1 */ "keyspec_less_than",
        /*  42: 1 */ "keyspec_greater_than",
        /*  43: 1 */ "keyspec_less_than_equal",
        /*  44: 1 */ "keyspec_greater_than_equal",
        /*  45: 1 */ "keyspec_left_double_angle_quote",
        /*  46: 1 */ "keyspec_right_double_angle_quote",
        /*  47: 1 */ "keyspec_left_single_angle_quote",
        /*  48: 1 */ "keyspec_right_single_angle_quote",
        /*  49: 1 */ "keyspec_comma",
        /*  50: 1 */ "keyspec_tablet_comma",
        /*  51: 1 */ "keyhintlabel_tablet_comma",
        /*  52: 1 */ "morekeys_tablet_comma",
        /*  53: 1 */ "keyhintlabel_period",
        /*  54: 1 */ "morekeys_period",
        /*  55: 1 */ "keyhintlabel_tablet_period",
        /*  56: 1 */ "morekeys_tablet_period",
        /*  57: 1 */ "keyspec_symbols_question",
        /*  58: 1 */ "keyspec_symbols_semicolon",
        /*  59: 1 */ "keyspec_symbols_percent",
        /*  60: 1 */ "morekeys_question",
        /*  61: 1 */ "morekeys_symbols_semicolon",
        /*  62: 1 */ "morekeys_symbols_percent",
        /*  63: 0 */ "morekeys_y",
        /*  64: 0 */ "morekeys_d",
        /*  65: 0 */ "morekeys_r",
        /*  66: 0 */ "morekeys_t",
        /*  67: 0 */ "morekeys_z",
        /*  68: 0 */ "morekeys_k",
        /*  69: 0 */ "morekeys_l",
        /*  70: 0 */ "morekeys_g",
        /*  71: 0 */ "morekeys_v",
        /*  72: 0 */ "morekeys_h",
        /*  73: 0 */ "morekeys_j",
        /*  74: 0 */ "morekeys_w",
        /*  75: 0 */ "morekeys_q",
        /*  76: 0 */ "morekeys_x",
        /*  77: 0 */ "keyspec_q",
        /*  78: 0 */ "keyspec_w",
        /*  79: 0 */ "keyspec_y",
        /*  80: 0 */ "keyspec_x",
        /*  81: 0 */ "keyspec_nordic_row1_11",
        /*  82: 0 */ "keyspec_nordic_row2_10",
        /*  83: 0 */ "keyspec_nordic_row2_11",
        /*  84: 0 */ "morekeys_nordic_row2_10",
        /*  85: 0 */ "morekeys_nordic_row2_11",
        /*  86: 0 */ "keyspec_east_slavic_row1_9",
        /*  87: 0 */ "keyspec_east_slavic_row2_2",
        /*  88: 0 */ "keyspec_east_slavic_row2_11",
        /*  89: 0 */ "keyspec_east_slavic_row3_5",
        /*  90: 0 */ "morekeys_east_slavic_row2_2",
        /*  91: 0 */ "morekeys_east_slavic_row2_11",
        /*  92: 0 */ "morekeys_cyrillic_u",
        /*  93: 0 */ "morekeys_cyrillic_ka",
        /*  94: 0 */ "morekeys_cyrillic_en",
        /*  95: 0 */ "morekeys_cyrillic_ghe",
        /*  96: 0 */ "morekeys_cyrillic_a",
        /*  97: 0 */ "morekeys_cyrillic_o",
        /*  98: 0 */ "morekeys_cyrillic_i",
        /*  99: 0 */ "morekeys_cyrillic_ie",
        /* 100: 0 */ "morekeys_cyrillic_soft_sign",
        /* 101: 0 */ "keyspec_south_slavic_row1_6",
        /* 102: 0 */ "keyspec_south_slavic_row2_11",
        /* 103: 0 */ "keyspec_south_slavic_row3_1",
        /* 104: 0 */ "keyspec_south_slavic_row3_8",
        /* 105: 0 */ "keyspec_swiss_row1_11",
        /* 106: 0 */ "keyspec_swiss_row2_10",
        /* 107: 0 */ "keyspec_swiss_row2_11",
        /* 108: 0 */ "morekeys_swiss_row1_11",
        /* 109: 0 */ "morekeys_swiss_row2_10",
        /* 110: 0 */ "morekeys_swiss_row2_11",
        /* 111: 0 */ "single_quotes",
        /* 112: 0 */ "double_quotes",
        /* 113: 0 */ "single_angle_quotes",
        /* 114: 0 */ "double_angle_quotes",
        /* 115: 0 */ "morekeys_currency_dollar",
        /* 116: 0 */ "keyspec_currency",
        /* 117: 0 */ "morekeys_currency_generic",
        /* 118: 0 */ "morekeys_punctuation",
        /* 119: 0 */ "morekeys_tablet_punctuation",
        /* 120: 0 */ "keyspec_spanish_row2_10",
        /* 121: 0 */ "morekeys_plus",
        /* 122: 0 */ "morekeys_less_than",
        /* 123: 0 */ "morekeys_greater_than",
        /* 124: 0 */ "morekeys_symbols_1",
        /* 125: 0 */ "morekeys_symbols_2",
        /* 126: 0 */ "morekeys_symbols_3",
        /* 127: 0 */ "morekeys_symbols_4",
        /* 128: 0 */ "morekeys_symbols_5",
        /* 129: 0 */ "morekeys_symbols_6",
        /* 130: 0 */ "morekeys_symbols_7",
        /* 131: 0 */ "morekeys_symbols_8",
        /* 132: 0 */ "morekeys_symbols_9",
        /* 133: 0 */ "morekeys_symbols_0",
        /* 134: 0 */ "keyspec_period",
        /* 135: 0 */ "keyspec_tablet_period",
        /* 136: 0 */ "morekeys_exclamation",
        /* 137: 0 */ "morekeys_am_pm",
        /* 138: 0 */ "keyspec_settings",
        /* 139: 0 */ "keyspec_shortcut",
        /* 140: 0 */ "keyspec_action_next",
        /* 141: 0 */ "keyspec_action_previous",
        /* 142: 0 */ "keylabel_to_more_symbol",
        /* 143: 0 */ "keylabel_tablet_to_more_symbol",
        /* 144: 0 */ "keylabel_to_phone_numeric",
        /* 145: 0 */ "keylabel_to_phone_symbols",
        /* 146: 0 */ "keylabel_time_am",
        /* 147: 0 */ "keylabel_time_pm",
        /* 148: 0 */ "keyspec_popular_domain",
        /* 149: 0 */ "morekeys_popular_domain",
        /* 150: 0 */ "keyspecs_left_parenthesis_more_keys",
        /* 151: 0 */ "keyspecs_right_parenthesis_more_keys",
        /* 152: 0 */ "single_laqm_raqm",
        /* 153: 0 */ "single_raqm_laqm",
        /* 154: 0 */ "double_laqm_raqm",
        /* 155: 0 */ "double_raqm_laqm",
        /* 156: 0 */ "single_lqm_rqm",
        /* 157: 0 */ "single_9qm_lqm",
        /* 158: 0 */ "single_9qm_rqm",
        /* 159: 0 */ "single_rqm_9qm",
        /* 160: 0 */ "double_lqm_rqm",
        /* 161: 0 */ "double_9qm_lqm",
        /* 162: 0 */ "double_9qm_rqm",
        /* 163: 0 */ "double_rqm_9qm",
        /* 164: 0 */ "morekeys_single_quote",
        /* 165: 0 */ "morekeys_double_quote",
        /* 166: 0 */ "morekeys_tablet_double_quote",
        /* 167: 0 */ "keyspec_emoji_action_key",
        /* 168: 0 */ "keyspec_emoji_normal_key",
        /* 169: 0 */ "keyspec_clipboard_action_key",
        /* 170: 0 */ "keyspec_clipboard_normal_key",
        /* 171: 0 */ "keyspec_start_onehanded_mode",
        /* 172: 0 */ "keyspec_language_switch",
        /* 173: 0 */ "label_go_key",
        /* 174: 0 */ "label_send_key",
        /* 175: 0 */ "label_next_key",
        /* 176: 0 */ "label_done_key",
        /* 177: 0 */ "label_search_key",
        /* 178: 0 */ "label_previous_key",
        /* 179: 0 */ "label_pause_key",
        /* 180: 0 */ "label_wait_key",
    };

    private static final String EMPTY = "";

    /* Default texts */
    private static final String[] TEXTS_DEFAULT = {
        /* morekeys_a ~ */
        EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY,
        /* ~ morekeys_c */
        // Label for "switch to alphabetic" key.
        /* keylabel_to_alpha */ "ABC",
        // U+2020: "†" DAGGER
        // U+2021: "‡" DOUBLE DAGGER
        // U+2605: "★" BLACK STAR
        /* morekeys_star */ "\u2020,\u2021,\u2605",
        // U+266A: "♪" EIGHTH NOTE
        // U+2665: "♥" BLACK HEART SUIT
        // U+2660: "♠" BLACK SPADE SUIT
        // U+2666: "♦" BLACK DIAMOND SUIT
        // U+2663: "♣" BLACK CLUB SUIT
        /* morekeys_bullet */ "\u266A,\u2665,\u2660,\u2666,\u2663",
        /* morekeys_left_parenthesis */ "!fixedColumnOrder!3,!text/keyspecs_left_parenthesis_more_keys",
        /* morekeys_right_parenthesis */ "!fixedColumnOrder!3,!text/keyspecs_right_parenthesis_more_keys",
        /* morekeys_arabic_diacritics */ EMPTY,
        /* keyspec_symbols_1 */ "1",
        /* keyspec_symbols_2 */ "2",
        /* keyspec_symbols_3 */ "3",
        /* keyspec_symbols_4 */ "4",
        /* keyspec_symbols_5 */ "5",
        /* keyspec_symbols_6 */ "6",
        /* keyspec_symbols_7 */ "7",
        /* keyspec_symbols_8 */ "8",
        /* keyspec_symbols_9 */ "9",
        /* keyspec_symbols_0 */ "0",
        // Label for "switch to symbols" key.
        /* keylabel_to_symbol */ "?123",
        /* additional_morekeys_symbols_1 ~ */
        EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY,
        /* ~ additional_morekeys_symbols_0 */
        // The all letters need to be mirrored are found at
        // http://www.unicode.org/Public/6.1.0/ucd/BidiMirroring.txt
        // U+2039: "‹" SINGLE LEFT-POINTING ANGLE QUOTATION MARK
        // U+203A: "›" SINGLE RIGHT-POINTING ANGLE QUOTATION MARK
        // U+2264: "≤" LESS-THAN OR EQUAL TO
        // U+2265: "≥" GREATER-THAN EQUAL TO
        // U+00AB: "«" LEFT-POINTING DOUBLE ANGLE QUOTATION MARK
        // U+00BB: "»" RIGHT-POINTING DOUBLE ANGLE QUOTATION MARK
        /* keyspec_left_parenthesis */ "(",
        /* keyspec_right_parenthesis */ ")",
        /* keyspec_left_square_bracket */ "[",
        /* keyspec_right_square_bracket */ "]",
        /* keyspec_left_curly_bracket */ "{",
        /* keyspec_right_curly_bracket */ "}",
        /* keyspec_less_than */ "<",
        /* keyspec_greater_than */ ">",
        /* keyspec_less_than_equal */ "\u2264",
        /* keyspec_greater_than_equal */ "\u2265",
        /* keyspec_left_double_angle_quote */ "\u00AB",
        /* keyspec_right_double_angle_quote */ "\u00BB",
        /* keyspec_left_single_angle_quote */ "\u2039",
        /* keyspec_right_single_angle_quote */ "\u203A",
        // Comma key
        /* keyspec_comma */ ",",
        /* keyspec_tablet_comma */ ",",
        /* keyhintlabel_tablet_comma ~ */
        EMPTY, EMPTY, EMPTY,
        /* ~ keyhintlabel_period */
        /* morekeys_period */ "!text/morekeys_punctuation",
        /* keyhintlabel_tablet_period */ EMPTY,
        /* morekeys_tablet_period */ "!text/morekeys_tablet_punctuation",
        /* keyspec_symbols_question */ "?",
        /* keyspec_symbols_semicolon */ ";",
        /* keyspec_symbols_percent */ "%",
        // U+00BF: "¿" INVERTED QUESTION MARK
        /* morekeys_question */ "\u00BF",
        /* morekeys_symbols_semicolon */ EMPTY,
        // U+2030: "‰" PER MILLE SIGN
        /* morekeys_symbols_percent */ "\u2030",
        /* morekeys_y ~ */
        EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY,
        EMPTY,
        /* ~ morekeys_x */
        /* keyspec_q */ "q",
        /* keyspec_w */ "w",
        /* keyspec_y */ "y",
        /* keyspec_x */ "x",
        /* keyspec_nordic_row1_11 ~ */
        EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY,
        EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY,
        EMPTY, EMPTY, EMPTY, EMPTY,
        /* ~ morekeys_swiss_row2_11 */
        /* single_quotes */ "!text/single_lqm_rqm",
        /* double_quotes */ "!text/double_lqm_rqm",
        /* single_angle_quotes */ "!text/single_laqm_raqm",
        /* double_angle_quotes */ "!text/double_laqm_raqm",
        // U+00A2: "¢" CENT SIGN
        // U+00A3: "£" POUND SIGN
        // U+20AC: "€" EURO SIGN
        // U+00A5: "¥" YEN SIGN
        // U+20B1: "₱" PESO SIGN
        /* morekeys_currency_dollar */ "\u00A2,\u00A3,\u20AC,\u00A5,\u20B1",
        /* keyspec_currency */ "$",
        /* morekeys_currency_generic */ "$,\u00A2,\u20AC,\u00A3,\u00A5,\u20B1",
        /* morekeys_punctuation */ "!autoColumnOrder!8,\\,,?,!,#,!text/keyspec_right_parenthesis,!text/keyspec_left_parenthesis,/,;,',@,:,-,\",+,\\%,&",
        /* morekeys_tablet_punctuation */ "!autoColumnOrder!7,\\,,',#,!text/keyspec_right_parenthesis,!text/keyspec_left_parenthesis,/,;,@,:,-,\",+,\\%,&",
        // U+00F1: "ñ" LATIN SMALL LETTER N WITH TILDE
        /* keyspec_spanish_row2_10 */ "\u00F1",
        // U+00B1: "±" PLUS-MINUS SIGN
        /* morekeys_plus */ "\u00B1",
        /* morekeys_less_than */ "!fixedColumnOrder!3,!text/keyspec_left_single_angle_quote,!text/keyspec_less_than_equal,!text/keyspec_left_double_angle_quote",
        /* morekeys_greater_than */ "!fixedColumnOrder!3,!text/keyspec_right_single_angle_quote,!text/keyspec_greater_than_equal,!text/keyspec_right_double_angle_quote",
        // U+00B9: "¹" SUPERSCRIPT ONE
        // U+00BD: "½" VULGAR FRACTION ONE HALF
        // U+2153: "⅓" VULGAR FRACTION ONE THIRD
        // U+00BC: "¼" VULGAR FRACTION ONE QUARTER
        // U+215B: "⅛" VULGAR FRACTION ONE EIGHTH
        /* morekeys_symbols_1 */ "\u00B9,\u00BD,\u2153,\u00BC,\u215B",
        // U+00B2: "²" SUPERSCRIPT TWO
        // U+2154: "⅔" VULGAR FRACTION TWO THIRDS
        /* morekeys_symbols_2 */ "\u00B2,\u2154",
        // U+00B3: "³" SUPERSCRIPT THREE
        // U+00BE: "¾" VULGAR FRACTION THREE QUARTERS
        // U+215C: "⅜" VULGAR FRACTION THREE EIGHTHS
        /* morekeys_symbols_3 */ "\u00B3,\u00BE,\u215C",
        // U+2074: "⁴" SUPERSCRIPT FOUR
        /* morekeys_symbols_4 */ "\u2074",
        // U+215D: "⅝" VULGAR FRACTION FIVE EIGHTHS
        /* morekeys_symbols_5 */ "\u215D",
        /* morekeys_symbols_6 */ EMPTY,
        // U+215E: "⅞" VULGAR FRACTION SEVEN EIGHTHS
        /* morekeys_symbols_7 */ "\u215E",
        /* morekeys_symbols_8 */ EMPTY,
        /* morekeys_symbols_9 */ EMPTY,
        // U+207F: "ⁿ" SUPERSCRIPT LATIN SMALL LETTER N
        // U+2205: "∅" EMPTY SET
        /* morekeys_symbols_0 */ "\u207F,\u2205",
        // Period key
        /* keyspec_period */ ".",
        /* keyspec_tablet_period */ ".",
        // U+00A1: "¡" INVERTED EXCLAMATION MARK
        /* morekeys_exclamation */ "\u00A1",
        /* morekeys_am_pm */ "!fixedColumnOrder!2,!hasLabels!,!text/keylabel_time_am,!text/keylabel_time_pm",
        /* keyspec_settings */ "!icon/settings_key|!code/key_settings",
        /* keyspec_shortcut */ "!icon/shortcut_key|!code/key_shortcut",
        /* keyspec_action_next */ "!hasLabels!,!text/label_next_key|!code/key_action_next",
        /* keyspec_action_previous */ "!hasLabels!,!text/label_previous_key|!code/key_action_previous",
        // Label for "switch to more symbol" modifier key ("= \ <"). Must be short to fit on key!
        /* keylabel_to_more_symbol */ "= \\\\ <",
        // Label for "switch to more symbol" modifier key on tablets.  Must be short to fit on key!
        /* keylabel_tablet_to_more_symbol */ "~ [ <",
        // Label for "switch to phone numeric" key.  Must be short to fit on key!
        /* keylabel_to_phone_numeric */ "123",
        // Label for "switch to phone symbols" key.  Must be short to fit on key!
        // U+FF0A: "＊" FULLWIDTH ASTERISK
        // U+FF03: "＃" FULLWIDTH NUMBER SIGN
        /* keylabel_to_phone_symbols */ "\uFF0A\uFF03",
        // Key label for "ante meridiem"
        /* keylabel_time_am */ "AM",
        // Key label for "post meridiem"
        /* keylabel_time_pm */ "PM",
        /* keyspec_popular_domain */ ".com",
        // popular web domains for the locale - most popular, displayed on the keyboard
        /* morekeys_popular_domain */ "!hasLabels!,.net,.org,.gov,.edu",
        /* keyspecs_left_parenthesis_more_keys */ "!text/keyspec_less_than,!text/keyspec_left_curly_bracket,!text/keyspec_left_square_bracket",
        /* keyspecs_right_parenthesis_more_keys */ "!text/keyspec_greater_than,!text/keyspec_right_curly_bracket,!text/keyspec_right_square_bracket",
        // The following characters don't need BIDI mirroring.
        // U+2018: "‘" LEFT SINGLE QUOTATION MARK
        // U+2019: "’" RIGHT SINGLE QUOTATION MARK
        // U+201A: "‚" SINGLE LOW-9 QUOTATION MARK
        // U+201C: "“" LEFT DOUBLE QUOTATION MARK
        // U+201D: "”" RIGHT DOUBLE QUOTATION MARK
        // U+201E: "„" DOUBLE LOW-9 QUOTATION MARK
        // Abbreviations are:
        // laqm: LEFT-POINTING ANGLE QUOTATION MARK
        // raqm: RIGHT-POINTING ANGLE QUOTATION MARK
        // lqm: LEFT QUOTATION MARK
        // rqm: RIGHT QUOTATION MARK
        // 9qm: LOW-9 QUOTATION MARK
        // The following each quotation mark pair consist of
        // <opening quotation mark>, <closing quotation mark>
        // and is named after (single|double)_<opening quotation mark>_<closing quotation mark>.
        /* single_laqm_raqm */ "!text/keyspec_left_single_angle_quote,!text/keyspec_right_single_angle_quote",
        /* single_raqm_laqm */ "!text/keyspec_right_single_angle_quote,!text/keyspec_left_single_angle_quote",
        /* double_laqm_raqm */ "!text/keyspec_left_double_angle_quote,!text/keyspec_right_double_angle_quote",
        /* double_raqm_laqm */ "!text/keyspec_right_double_angle_quote,!text/keyspec_left_double_angle_quote",
        // The following each quotation mark triplet consists of
        // <another quotation mark>, <opening quotation mark>, <closing quotation mark>
        // and is named after (single|double)_<opening quotation mark>_<closing quotation mark>.
        /* single_lqm_rqm */ "\u201A,\u2018,\u2019",
        /* single_9qm_lqm */ "\u2019,\u201A,\u2018",
        /* single_9qm_rqm */ "\u2018,\u201A,\u2019",
        /* single_rqm_9qm */ "\u2018,\u2019,\u201A",
        /* double_lqm_rqm */ "\u201E,\u201C,\u201D",
        /* double_9qm_lqm */ "\u201D,\u201E,\u201C",
        /* double_9qm_rqm */ "\u201C,\u201E,\u201D",
        /* double_rqm_9qm */ "\u201C,\u201D,\u201E",
        /* morekeys_single_quote */ "!fixedColumnOrder!5,!text/single_quotes,!text/single_angle_quotes",
        /* morekeys_double_quote */ "!fixedColumnOrder!5,!text/double_quotes,!text/double_angle_quotes",
        /* morekeys_tablet_double_quote */ "!fixedColumnOrder!6,!text/double_quotes,!text/single_quotes,!text/double_angle_quotes,!text/single_angle_quotes",
        /* keyspec_emoji_action_key */ "!icon/emoji_action_key|!code/key_emoji",
        /* keyspec_emoji_normal_key */ "!icon/emoji_normal_key|!code/key_emoji",
        /* keyspec_clipboard_action_key */ "!icon/clipboard_action_key|!code/key_clipboard",
        /* keyspec_clipboard_normal_key */ "!icon/clipboard_normal_key|!code/key_clipboard",
        /* keyspec_start_onehanded_mode */ "!icon/start_onehanded_mode_key|!code/key_start_onehanded",
        /* keyspec_language_switch */ "!icon/language_switch_key|!code/key_language_switch",
        /* label_go_key */ "!string/label_go_key",
        /* label_send_key */ "!string/label_send_key",
        /* label_next_key */ "!string/label_next_key",
        /* label_done_key */ "!string/label_done_key",
        /* label_search_key */ "!string/label_search_key",
        /* label_previous_key */ "!string/label_previous_key",
        /* label_pause_key */ "!string/label_pause_key",
        /* label_wait_key */ "!string/label_wait_key",
    };

    /* Locale ar: Arabic */
    private static final String[] TEXTS_ar = {
        /* morekeys_a ~ */
        null, null, null, null, null, null, null, null,
        /* ~ morekeys_c */
        // Label for "switch to alphabetic" key.
        // U+0623: "أ" ARABIC LETTER ALEF WITH HAMZA ABOVE
        // U+200C: ZERO WIDTH NON-JOINER
        // U+0628: "ب" ARABIC LETTER BEH
        // U+062C: "ج" ARABIC LETTER JEEM
        /* keylabel_to_alpha */ "\u0623\u200C\u0628\u200C\u062C",
        // U+2605: "★" BLACK STAR
        // U+066D: "٭" ARABIC FIVE POINTED STAR
        /* morekeys_star */ "\u2605,\u066D",
        // U+266A: "♪" EIGHTH NOTE
        /* morekeys_bullet */ "\u266A",
        // The all letters need to be mirrored are found at
        // http://www.unicode.org/Public/6.1.0/ucd/BidiMirroring.txt
        // U+FD3E: "﴾" ORNATE LEFT PARENTHESIS
        // U+FD3F: "﴿" ORNATE RIGHT PARENTHESIS
        /* morekeys_left_parenthesis */ "!fixedColumnOrder!4,\uFD3E|\uFD3F,!text/keyspecs_left_parenthesis_more_keys",
        /* morekeys_right_parenthesis */ "!fixedColumnOrder!4,\uFD3F|\uFD3E,!text/keyspecs_right_parenthesis_more_keys",
        // U+0655: "ٕ" ARABIC HAMZA BELOW
        // U+0654: "ٔ" ARABIC HAMZA ABOVE
        // U+0652: "ْ" ARABIC SUKUN
        // U+064D: "ٍ" ARABIC KASRATAN
        // U+064C: "ٌ" ARABIC DAMMATAN
        // U+064B: "ً" ARABIC FATHATAN
        // U+0651: "ّ" ARABIC SHADDA
        // U+0656: "ٖ" ARABIC SUBSCRIPT ALEF
        // U+0670: "ٰ" ARABIC LETTER SUPERSCRIPT ALEF
        // U+0653: "ٓ" ARABIC MADDAH ABOVE
        // U+0650: "ِ" ARABIC KASRA
        // U+064F: "ُ" ARABIC DAMMA
        // U+064E: "َ" ARABIC FATHA
        // U+0640: "ـ" ARABIC TATWEEL
        // In order to make Tatweel easily distinguishable from other punctuations, we use consecutive Tatweels only for its displayed label.
        // Note: The space character is needed as a preceding letter to draw Arabic diacritics characters correctly.
        /* morekeys_arabic_diacritics */ "!fixedColumnOrder!7, \u0655|\u0655, \u0654|\u0654, \u0652|\u0652, \u064D|\u064D, \u064C|\u064C, \u064B|\u064B, \u0651|\u0651, \u0656|\u0656, \u0670|\u0670, \u0653|\u0653, \u0650|\u0650, \u064F|\u064F, \u064E|\u064E,\u0640\u0640\u0640|\u0640",
        // U+0661: "١" ARABIC-INDIC DIGIT ONE
        /* keyspec_symbols_1 */ "1",
        // U+0662: "٢" ARABIC-INDIC DIGIT TWO
        /* keyspec_symbols_2 */ "2",
        // U+0663: "٣" ARABIC-INDIC DIGIT THREE
        /* keyspec_symbols_3 */ "3",
        // U+0664: "٤" ARABIC-INDIC DIGIT FOUR
        /* keyspec_symbols_4 */ "4",
        // U+0665: "٥" ARABIC-INDIC DIGIT FIVE
        /* keyspec_symbols_5 */ "5",
        // U+0666: "٦" ARABIC-INDIC DIGIT SIX
        /* keyspec_symbols_6 */ "6",
        // U+0667: "٧" ARABIC-INDIC DIGIT SEVEN
        /* keyspec_symbols_7 */ "7",
        // U+0668: "٨" ARABIC-INDIC DIGIT EIGHT
        /* keyspec_symbols_8 */ "8",
        // U+0669: "٩" ARABIC-INDIC DIGIT NINE
        /* keyspec_symbols_9 */ "9",
        // U+0660: "٠" ARABIC-INDIC DIGIT ZERO
        /* keyspec_symbols_0 */ "0",
        // Label for "switch to symbols" key.
        // U+061F: "؟" ARABIC QUESTION MARK
        /* keylabel_to_symbol */ "321\u061F",
        /* additional_morekeys_symbols_1 */ "1",
        /* additional_morekeys_symbols_2 */ "2",
        /* additional_morekeys_symbols_3 */ "3",
        /* additional_morekeys_symbols_4 */ "4",
        /* additional_morekeys_symbols_5 */ "5",
        /* additional_morekeys_symbols_6 */ "6",
        /* additional_morekeys_symbols_7 */ "7",
        /* additional_morekeys_symbols_8 */ "8",
        /* additional_morekeys_symbols_9 */ "9",
        // U+066B: "٫" ARABIC DECIMAL SEPARATOR
        // U+066C: "٬" ARABIC THOUSANDS SEPARATOR
        /* additional_morekeys_symbols_0 */ "0,\u066B,\u066C",
        // U+2264: "≤" LESS-THAN OR EQUAL TO
        // U+2265: "≥" GREATER-THAN EQUAL TO
        // U+00AB: "«" LEFT-POINTING DOUBLE ANGLE QUOTATION MARK
        // U+00BB: "»" RIGHT-POINTING DOUBLE ANGLE QUOTATION MARK
        // U+2039: "‹" SINGLE LEFT-POINTING ANGLE QUOTATION MARK
        // U+203A: "›" SINGLE RIGHT-POINTING ANGLE QUOTATION MARK
        /* keyspec_left_parenthesis */ "(|)",
        /* keyspec_right_parenthesis */ ")|(",
        /* keyspec_left_square_bracket */ "[|]",
        /* keyspec_right_square_bracket */ "]|[",
        /* keyspec_left_curly_bracket */ "{|}",
        /* keyspec_right_curly_bracket */ "}|{",
        /* keyspec_less_than */ "<|>",
        /* keyspec_greater_than */ ">|<",
        /* keyspec_less_than_equal */ "\u2264|\u2265",
        /* keyspec_greater_than_equal */ "\u2265|\u2264",
        /* keyspec_left_double_angle_quote */ "\u00AB|\u00BB",
        /* keyspec_right_double_angle_quote */ "\u00BB|\u00AB",
        /* keyspec_left_single_angle_quote */ "\u2039|\u203A",
        /* keyspec_right_single_angle_quote */ "\u203A|\u2039",
        // U+060C: "،" ARABIC COMMA
        /* keyspec_comma */ "\u060C",
        // U+061F: "؟" ARABIC QUESTION MARK
        // U+060C: "،" ARABIC COMMA
        // U+061B: "؛" ARABIC SEMICOLON
        /* keyspec_tablet_comma */ "\u060C",
        /* keyhintlabel_tablet_comma */ "\u061F",
        /* morekeys_tablet_comma */ "!fixedColumnOrder!4,:,!,\u061F,\u061B,-,\",\'",
        // U+0651: "ّ" ARABIC SHADDA
        /* keyhintlabel_period */ "\u0651",
        /* morekeys_period */ "!text/morekeys_arabic_diacritics",
        /* keyhintlabel_tablet_period */ "\u0651",
        /* morekeys_tablet_period */ "!text/morekeys_arabic_diacritics",
        /* keyspec_symbols_question */ "\u061F",
        /* keyspec_symbols_semicolon */ "\u061B",
        // U+066A: "٪" ARABIC PERCENT SIGN
        /* keyspec_symbols_percent */ "\u066A",
        // U+00BF: "¿" INVERTED QUESTION MARK
        /* morekeys_question */ "?,\u00BF",
        /* morekeys_symbols_semicolon */ ";",
        // U+2030: "‰" PER MILLE SIGN
        /* morekeys_symbols_percent */ "\\%,\u2030",
    };

    /* Locale en: English */
    private static final String[] TEXTS_en = {
        // U+00E0: "à" LATIN SMALL LETTER A WITH GRAVE
        // U+00E1: "á" LATIN SMALL LETTER A WITH ACUTE
        // U+00E2: "â" LATIN SMALL LETTER A WITH CIRCUMFLEX
        // U+00E4: "ä" LATIN SMALL LETTER A WITH DIAERESIS
        // U+00E6: "æ" LATIN SMALL LETTER AE
        // U+00E3: "ã" LATIN SMALL LETTER A WITH TILDE
        // U+00E5: "å" LATIN SMALL LETTER A WITH RING ABOVE
        // U+0101: "ā" LATIN SMALL LETTER A WITH MACRON
        /* morekeys_a */ "\u00E0,\u00E1,\u00E2,\u00E4,\u00E6,\u00E3,\u00E5,\u0101",
        // U+00E9: "é" LATIN SMALL LETTER E WITH ACUTE
        // U+00E8: "è" LATIN SMALL LETTER E WITH GRAVE
        // U+00EA: "ê" LATIN SMALL LETTER E WITH CIRCUMFLEX
        // U+00EB: "ë" LATIN SMALL LETTER E WITH DIAERESIS
        // U+0113: "ē" LATIN SMALL LETTER E WITH MACRON
        /* morekeys_e */ "\u00E9,\u00E8,\u00EA,\u00EB,\u0113",
        // U+00ED: "í" LATIN SMALL LETTER I WITH ACUTE
        // U+00EE: "î" LATIN SMALL LETTER I WITH CIRCUMFLEX
        // U+00EF: "ï" LATIN SMALL LETTER I WITH DIAERESIS
        // U+012B: "ī" LATIN SMALL LETTER I WITH MACRON
        // U+00EC: "ì" LATIN SMALL LETTER I WITH GRAVE
        /* morekeys_i */ "\u00ED,\u00EE,\u00EF,\u012B,\u00EC",
        // U+00F3: "ó" LATIN SMALL LETTER O WITH ACUTE
        // U+00F4: "ô" LATIN SMALL LETTER O WITH CIRCUMFLEX
        // U+00F6: "ö" LATIN SMALL LETTER O WITH DIAERESIS
        // U+00F2: "ò" LATIN SMALL LETTER O WITH GRAVE
        // U+0153: "œ" LATIN SMALL LIGATURE OE
        // U+00F8: "ø" LATIN SMALL LETTER O WITH STROKE
        // U+014D: "ō" LATIN SMALL LETTER O WITH MACRON
        // U+00F5: "õ" LATIN SMALL LETTER O WITH TILDE
        /* morekeys_o */ "\u00F3,\u00F4,\u00F6,\u00F2,\u0153,\u00F8,\u014D,\u00F5",
        // U+00FA: "ú" LATIN SMALL LETTER U WITH ACUTE
        // U+00FB: "û" LATIN SMALL LETTER U WITH CIRCUMFLEX
        // U+00FC: "ü" LATIN SMALL LETTER U WITH DIAERESIS
        // U+00F9: "ù" LATIN SMALL LETTER U WITH GRAVE
        // U+016B: "ū" LATIN SMALL LETTER U WITH MACRON
        /* morekeys_u */ "\u00FA,\u00FB,\u00FC,\u00F9,\u016B",
        // U+00DF: "ß" LATIN SMALL LETTER SHARP S
        /* morekeys_s */ "\u00DF",
        // U+00F1: "ñ" LATIN SMALL LETTER N WITH TILDE
        /* morekeys_n */ "\u00F1",
        // U+00E7: "ç" LATIN SMALL LETTER C WITH CEDILLA
        /* morekeys_c */ "\u00E7",
    };

    private static final Object[] LOCALES_AND_TEXTS = {
    // "locale", TEXT_ARRAY,  /* numberOfNonNullText/lengthOf_TEXT_ARRAY localeName */
        "DEFAULT", TEXTS_DEFAULT, /* 181/181 DEFAULT */
        "ar"     , TEXTS_ar,    /*  55/ 63 Arabic */
        "en"     , TEXTS_en,    /*   8/  8 English */
    };

    static {
        for (int index = 0; index < NAMES.length; index++) {
            sNameToIndexesMap.put(NAMES[index], index);
        }

        for (int i = 0; i < LOCALES_AND_TEXTS.length; i += 2) {
            final String locale = (String)LOCALES_AND_TEXTS[i];
            final String[] textsTable = (String[])LOCALES_AND_TEXTS[i + 1];
            sLocaleToTextsTableMap.put(locale, textsTable);
            sTextsTableToLocaleMap.put(textsTable, locale);
        }
    }
}
