package com.example.hugo.snowtam_app.model;
import org.json.JSONArray;
import org.json.JSONException;


public class DummyRequester{

        public static String getRawRequest() {
            return rawRequest;
        }

        public static JSONArray getJsonArray() throws JSONException {
            JSONArray jsonArr = new JSONArray(rawRequest);
            return jsonArr;
        }

        private static String rawRequest = "[\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6ac\",\n" +
                "    \"id\": \"A4479/18\",\n" +
                "    \"entity\": \"OL\",\n" +
                "    \"status\": \"AS\",\n" +
                "    \"Qcode\": \"OLAS\",\n" +
                "    \"Area\": \"Other Information\",\n" +
                "    \"SubArea\": \"Other Information\",\n" +
                "    \"Condition\": \"Availability\",\n" +
                "    \"Subject\": \"Obstacle lights on\",\n" +
                "    \"Modifier\": \"Unserviceable\",\n" +
                "    \"message\": \"OBST LIGHTS ON BODOE TERMINAL RADAR PSN 671551N 0142115E U/S\\nCREATED: 01 Dec 2018 12:32:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-12-01T12:32:00.000Z\",\n" +
                "    \"enddate\": \"2018-12-07T12:00:00.000Z\",\n" +
                "    \"all\": \"A4479/18 NOTAMR A4173/18\\nQ) ENOR/QOLAS/IV/M  /A /000/999/6716N01422E001\\nA) ENBO B) 1812011232 C) 1812071200 EST\\nE) OBST LIGHTS ON BODOE TERMINAL RADAR PSN 671551N 0142115E U/S\\nCREATED: 01 Dec 2018 12:32:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-12-01T12:32:00.000Z\",\n" +
                "    \"key\": \"A4479/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6ad\",\n" +
                "    \"id\": \"A4305/18\",\n" +
                "    \"entity\": \"PI\",\n" +
                "    \"status\": \"XX\",\n" +
                "    \"Qcode\": \"PIXX\",\n" +
                "    \"Area\": \"ATM\",\n" +
                "    \"SubArea\": \"Air traffic procedures\",\n" +
                "    \"Condition\": \"Other\",\n" +
                "    \"Subject\": \"Instrument approach procedure\",\n" +
                "    \"Modifier\": \"Plain language\",\n" +
                "    \"message\": \"CHANGE PROFILE VPA TO 3.5 DEG (6.1 PCT) REF AD 2 ENBO 5-11, ILS OR \\nLOC RWY 25, DATED 06 DEC 2018\\nCREATED: 13 Nov 2018 13:15:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-12-06T00:00:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"A4305/18 NOTAMN\\nQ) ENOR/QPIXX/I /NBO/A /000/999/6716N01422E005\\nA) ENBO B) 1812060000 C) PERM\\nE) \\nCHANGE PROFILE VPA TO 3.5 DEG (6.1 PCT) REF AD 2 ENBO 5-11, ILS OR \\nLOC RWY 25, DATED 06 DEC 2018\\nCREATED: 13 Nov 2018 13:15:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-11-13T13:15:00.000Z\",\n" +
                "    \"key\": \"A4305/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6ae\",\n" +
                "    \"id\": \"A4235/18\",\n" +
                "    \"entity\": \"PI\",\n" +
                "    \"status\": \"XX\",\n" +
                "    \"Qcode\": \"PIXX\",\n" +
                "    \"Area\": \"ATM\",\n" +
                "    \"SubArea\": \"Air traffic procedures\",\n" +
                "    \"Condition\": \"Other\",\n" +
                "    \"Subject\": \"Instrument approach procedure\",\n" +
                "    \"Modifier\": \"Plain language\",\n" +
                "    \"message\": \"CHANGE SBAS CH NR TO 92394. REF AD 2 ENBO 5-3, RNAV (GNSS) X RWY 07, \\nDATED 06 DEC 2018\\nCREATED: 06 Nov 2018 14:59:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-12-06T00:00:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"A4235/18 NOTAMN\\nQ) ENOR/QPIXX/I /NBO/A /000/999/6716N01422E005\\nA) ENBO B) 1812060000 C) PERM\\nE) \\nCHANGE SBAS CH NR TO 92394. REF AD 2 ENBO 5-3, RNAV (GNSS) X RWY 07, \\nDATED 06 DEC 2018\\nCREATED: 06 Nov 2018 14:59:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-11-06T14:59:00.000Z\",\n" +
                "    \"key\": \"A4235/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6af\",\n" +
                "    \"id\": \"A4170/18\",\n" +
                "    \"entity\": \"PI\",\n" +
                "    \"status\": \"CH\",\n" +
                "    \"Qcode\": \"PICH\",\n" +
                "    \"Area\": \"ATM\",\n" +
                "    \"SubArea\": \"Air traffic procedures\",\n" +
                "    \"Condition\": \"Changes\",\n" +
                "    \"Subject\": \"Instrument approach procedure\",\n" +
                "    \"Modifier\": \"Changed\",\n" +
                "    \"message\": \"CHANGE FINAL TR ANNOTATION OM MAP FM DME 9.0 BO TO DME 0.9 BO. REF \\nAD 2 ENBO 5-1, ILS Z OR LOC Z RWY 07, DATED 06 DEC 2018\\nCREATED: 01 Nov 2018 10:26:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-12-06T00:00:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"A4170/18 NOTAMN\\nQ) ENOR/QPICH/I /NBO/A /000/999/6716N01422E005\\nA) ENBO B) 1812060000 C) PERM\\nE) \\nCHANGE FINAL TR ANNOTATION OM MAP FM DME 9.0 BO TO DME 0.9 BO. REF \\nAD 2 ENBO 5-1, ILS Z OR LOC Z RWY 07, DATED 06 DEC 2018\\nCREATED: 01 Nov 2018 10:26:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-11-01T10:26:00.000Z\",\n" +
                "    \"key\": \"A4170/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6b0\",\n" +
                "    \"id\": \"A4169/18\",\n" +
                "    \"entity\": \"PI\",\n" +
                "    \"status\": \"CH\",\n" +
                "    \"Qcode\": \"PICH\",\n" +
                "    \"Area\": \"ATM\",\n" +
                "    \"SubArea\": \"Air traffic procedures\",\n" +
                "    \"Condition\": \"Changes\",\n" +
                "    \"Subject\": \"Instrument approach procedure\",\n" +
                "    \"Modifier\": \"Changed\",\n" +
                "    \"message\": \"CHANGE BASETURN ANNOTATION FM DME 8.5 BDO TO DME 8.6 BDO. REF AD 2 \\nENBO 5-1, ILS Z OR LOC Z RWY 07, DATED 06 DEC 2018\\nCREATED: 01 Nov 2018 10:18:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-12-06T00:00:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"A4169/18 NOTAMN\\nQ) ENOR/QPICH/I /NBO/A /000/999/6716N01422E005\\nA) ENBO B) 1812060000 C) PERM\\nE) \\nCHANGE BASETURN ANNOTATION FM DME 8.5 BDO TO DME 8.6 BDO. REF AD 2 \\nENBO 5-1, ILS Z OR LOC Z RWY 07, DATED 06 DEC 2018\\nCREATED: 01 Nov 2018 10:18:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-11-01T10:18:00.000Z\",\n" +
                "    \"key\": \"A4169/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6b1\",\n" +
                "    \"id\": \"A4168/18\",\n" +
                "    \"entity\": \"PI\",\n" +
                "    \"status\": \"CH\",\n" +
                "    \"Qcode\": \"PICH\",\n" +
                "    \"Area\": \"ATM\",\n" +
                "    \"SubArea\": \"Air traffic procedures\",\n" +
                "    \"Condition\": \"Changes\",\n" +
                "    \"Subject\": \"Instrument approach procedure\",\n" +
                "    \"Modifier\": \"Changed\",\n" +
                "    \"message\": \"CHANGE BDO STN DECL TO 5 DEG EAST. REF AD 2 ENBO 5-1, ILS Z OR LOC Z \\nRWY 07, DATED 06 DEC 2018\\nCREATED: 01 Nov 2018 10:08:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-12-06T00:00:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"A4168/18 NOTAMN\\nQ) ENOR/QPICH/I /NBO/A /000/999/6716N01422E005\\nA) ENBO B) 1812060000 C) PERM\\nE) \\nCHANGE BDO STN DECL TO 5 DEG EAST. REF AD 2 ENBO 5-1, ILS Z OR LOC Z \\nRWY 07, DATED 06 DEC 2018\\nCREATED: 01 Nov 2018 10:08:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-11-01T10:08:00.000Z\",\n" +
                "    \"key\": \"A4168/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6b2\",\n" +
                "    \"id\": \"A4167/18\",\n" +
                "    \"entity\": \"PU\",\n" +
                "    \"status\": \"CH\",\n" +
                "    \"Qcode\": \"PUCH\",\n" +
                "    \"Area\": \"ATM\",\n" +
                "    \"SubArea\": \"Air traffic procedures\",\n" +
                "    \"Condition\": \"Changes\",\n" +
                "    \"Subject\": \"Missed approach procedure\",\n" +
                "    \"Modifier\": \"Changed\",\n" +
                "    \"message\": \"CHANGE 088 DEG TO R-088 BDO ON MISSED APCH TR. REF AD 2 ENBO 5-1, \\nILS Z OR LOC Z RWY 07, DATED 06 DEC 2018\\nCREATED: 01 Nov 2018 09:59:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-12-06T00:00:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"A4167/18 NOTAMN\\nQ) ENOR/QPUCH/I /BO /A /000/999/6716N01422E005\\nA) ENBO B) 1812060000 C) PERM\\nE) CHANGE 088 DEG TO R-088 BDO ON MISSED APCH TR. REF AD 2 ENBO 5-1, \\nILS Z OR LOC Z RWY 07, DATED 06 DEC 2018\\nCREATED: 01 Nov 2018 09:59:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-11-01T09:59:00.000Z\",\n" +
                "    \"key\": \"A4167/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6b3\",\n" +
                "    \"id\": \"A4166/18\",\n" +
                "    \"entity\": \"AX\",\n" +
                "    \"status\": \"CH\",\n" +
                "    \"Qcode\": \"AXCH\",\n" +
                "    \"Area\": \"ATM\",\n" +
                "    \"SubArea\": \"Airspace organization\",\n" +
                "    \"Condition\": \"Changes\",\n" +
                "    \"Subject\": \"Significant point\",\n" +
                "    \"Modifier\": \"Changed\",\n" +
                "    \"message\": \"WAYPOINT NAME CHANGED FROM BO535 TO RIPDO. REF AD2 ENBO 5-1, ILS Z \\nOR LOC Z RWY07, DATED 06 DEC 2018. REF AD2 ENBO 5-4, RNAV (GNSS) X \\nRWY 07, DATED 06 DEC 2018. REF AD2 ENBO 5-6, RNAV (GNSS) Z RWY 07, \\nDATED 06 DEC 2018\\nCREATED: 01 Nov 2018 09:39:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-12-06T00:00:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"A4166/18 NOTAMN\\nQ) ENOR/QAXCH/IV/BO /A /000/999/6716N01422E005\\nA) ENBO B) 1812060000 C) PERM\\nE) \\nWAYPOINT NAME CHANGED FROM BO535 TO RIPDO. REF AD2 ENBO 5-1, ILS Z \\nOR LOC Z RWY07, DATED 06 DEC 2018. REF AD2 ENBO 5-4, RNAV (GNSS) X \\nRWY 07, DATED 06 DEC 2018. REF AD2 ENBO 5-6, RNAV (GNSS) Z RWY 07, \\nDATED 06 DEC 2018\\nCREATED: 01 Nov 2018 09:39:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-11-01T09:39:00.000Z\",\n" +
                "    \"key\": \"A4166/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6b4\",\n" +
                "    \"id\": \"A4119/18\",\n" +
                "    \"entity\": \"PI\",\n" +
                "    \"status\": \"XX\",\n" +
                "    \"Qcode\": \"PIXX\",\n" +
                "    \"Area\": \"ATM\",\n" +
                "    \"SubArea\": \"Air traffic procedures\",\n" +
                "    \"Condition\": \"Other\",\n" +
                "    \"Subject\": \"Instrument approach procedure\",\n" +
                "    \"Modifier\": \"Plain language\",\n" +
                "    \"message\": \"CHANGE RANUM HLDG ALT TO 8000FT. \\nREF AD2 ENBO 4-11, STAR RWY 07, DATED 06 DEC 2018\\nCREATED: 29 Oct 2018 10:05:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-12-06T00:00:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"A4119/18 NOTAMN\\nQ) ENOR/QPIXX/I /NBO/A /000/999/6716N01422E005\\nA) ENBO B) 1812060000 C) PERM\\nE) CHANGE RANUM HLDG ALT TO 8000FT. \\nREF AD2 ENBO 4-11, STAR RWY 07, DATED 06 DEC 2018\\nCREATED: 29 Oct 2018 10:05:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-10-29T10:05:00.000Z\",\n" +
                "    \"key\": \"A4119/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6b5\",\n" +
                "    \"id\": \"A4076/18\",\n" +
                "    \"entity\": \"FA\",\n" +
                "    \"status\": \"XX\",\n" +
                "    \"Qcode\": \"FAXX\",\n" +
                "    \"Area\": \"AGA\",\n" +
                "    \"SubArea\": \"Facilities and services\",\n" +
                "    \"Condition\": \"Other\",\n" +
                "    \"Subject\": \"Aerodrome\",\n" +
                "    \"Modifier\": \"Plain language\",\n" +
                "    \"message\": \"NEW TEL DE-ICE WIDEROE GROUND HANDLING +47 41706818. REF AIP AD 2 \\nENBO AD 2.3, ITEM 11, EFF 13 SEP 2018\\nCREATED: 26 Oct 2018 09:00:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-10-26T09:00:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"A4076/18 NOTAMN\\nQ) ENOR/QFAXX/IV/M  /A /000/999/6716N01422E005\\nA) ENBO B) 1810260900 C) PERM\\nE) NEW TEL DE-ICE WIDEROE GROUND HANDLING +47 41706818. REF AIP AD 2 \\nENBO AD 2.3, ITEM 11, EFF 13 SEP 2018\\nCREATED: 26 Oct 2018 09:00:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-10-26T09:00:00.000Z\",\n" +
                "    \"key\": \"A4076/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6b6\",\n" +
                "    \"id\": \"A4075/18\",\n" +
                "    \"entity\": \"FA\",\n" +
                "    \"status\": \"XX\",\n" +
                "    \"Qcode\": \"FAXX\",\n" +
                "    \"Area\": \"AGA\",\n" +
                "    \"SubArea\": \"Facilities and services\",\n" +
                "    \"Condition\": \"Other\",\n" +
                "    \"Subject\": \"Aerodrome\",\n" +
                "    \"Modifier\": \"Plain language\",\n" +
                "    \"message\": \"NEW TEL HANDLING WIDEROE GROUND HANDLING +47 41706802. REF AIP AD 2 \\nENBO AD 2.3, ITEM 9, EFF 13 SEP 2018\\nCREATED: 26 Oct 2018 08:59:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-10-26T08:58:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"A4075/18 NOTAMN\\nQ) ENOR/QFAXX/IV/M  /A /000/999/6716N01422E005\\nA) ENBO B) 1810260858 C) PERM\\nE) \\nNEW TEL HANDLING WIDEROE GROUND HANDLING +47 41706802. REF AIP AD 2 \\nENBO AD 2.3, ITEM 9, EFF 13 SEP 2018\\nCREATED: 26 Oct 2018 08:59:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-10-26T08:59:00.000Z\",\n" +
                "    \"key\": \"A4075/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6b7\",\n" +
                "    \"id\": \"A4054/18\",\n" +
                "    \"entity\": \"FA\",\n" +
                "    \"status\": \"TT\",\n" +
                "    \"Qcode\": \"FATT\",\n" +
                "    \"Area\": \"AGA\",\n" +
                "    \"SubArea\": \"Facilities and services\",\n" +
                "    \"Condition\": \"Other\",\n" +
                "    \"Subject\": \"Aerodrome\",\n" +
                "    \"Modifier\": \"AIRAC AIP Amendments\",\n" +
                "    \"message\": \"TRIGGER NOTAM - AIP AIRAC AMDT 07/18 EFF 06 DEC 2018:\\nNAV AID RESURVEYED. 2015 MAG VAR. ADC AND PDC REVISED. \\nOMNI-DIRECTIONAL DEP, SID, STAR AND IAC REVISED. RNAV (GNSS) RWY \\n07/25 PROCEDURES ESTABLISHED. VOR-A/B/C WITHDRAWN. VAC REVISED\\nCREATED: 25 Oct 2018 08:08:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-12-06T00:00:00.000Z\",\n" +
                "    \"enddate\": \"2018-12-19T23:59:00.000Z\",\n" +
                "    \"all\": \"A4054/18 NOTAMN\\nQ) ENOR/QFATT/IV/BO /A /000/999/6716N01422E005\\nA) ENBO B) 1812060000 C) 1812192359\\nE) TRIGGER NOTAM - AIP AIRAC AMDT 07/18 EFF 06 DEC 2018:\\nNAV AID RESURVEYED. 2015 MAG VAR. ADC AND PDC REVISED. \\nOMNI-DIRECTIONAL DEP, SID, STAR AND IAC REVISED. RNAV (GNSS) RWY \\n07/25 PROCEDURES ESTABLISHED. VOR-A/B/C WITHDRAWN. VAC REVISED\\nCREATED: 25 Oct 2018 08:08:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-10-25T08:08:00.000Z\",\n" +
                "    \"key\": \"A4054/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6b8\",\n" +
                "    \"id\": \"A4038/18\",\n" +
                "    \"entity\": \"FF\",\n" +
                "    \"status\": \"AR\",\n" +
                "    \"Qcode\": \"FFAR\",\n" +
                "    \"Area\": \"AGA\",\n" +
                "    \"SubArea\": \"Facilities and services\",\n" +
                "    \"Condition\": \"Availability\",\n" +
                "    \"Subject\": \"Firefighting and rescue\",\n" +
                "    \"Modifier\": \"Available on request\",\n" +
                "    \"message\": \"FIRE AND RESCUE CAT 9 AVBL ON REQUEST.\\nREF AIP NORWAY AD 2 ENBO 1-2\\nCREATED: 25 Oct 2018 05:37:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-10-25T06:00:00.000Z\",\n" +
                "    \"enddate\": \"2019-04-25T23:59:00.000Z\",\n" +
                "    \"all\": \"A4038/18 NOTAMN\\nQ) ENOR/QFFAR/IV/NBO/A /000/999/6716N01422E005\\nA) ENBO B) 1810250600 C) 1904252359 EST\\nE) FIRE AND RESCUE CAT 9 AVBL ON REQUEST.\\nREF AIP NORWAY AD 2 ENBO 1-2\\nCREATED: 25 Oct 2018 05:37:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-10-25T05:37:00.000Z\",\n" +
                "    \"key\": \"A4038/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6b9\",\n" +
                "    \"id\": \"A4003/18\",\n" +
                "    \"entity\": \"PI\",\n" +
                "    \"status\": \"AU\",\n" +
                "    \"Qcode\": \"PIAU\",\n" +
                "    \"Area\": \"ATM\",\n" +
                "    \"SubArea\": \"Air traffic procedures\",\n" +
                "    \"Condition\": \"Availability\",\n" +
                "    \"Subject\": \"Instrument approach procedure\",\n" +
                "    \"Modifier\": \"Not available\",\n" +
                "    \"message\": \"APPROACH PROCEDURE VOR B SUSPENDED DUE POSSIBLE UNRELIABLE SIGNALS \\nIN APPROACH SECTOR. REF AIP AD ENBO 5-5\\nCREATED: 22 Oct 2018 17:16:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-10-22T17:15:00.000Z\",\n" +
                "    \"enddate\": \"2018-12-05T23:59:00.000Z\",\n" +
                "    \"all\": \"A4003/18 NOTAMR A3977/18\\nQ) ENOR/QPIAU/I /NBO/A /000/999/6716N01422E005\\nA) ENBO B) 1810221715 C) 1812052359 EST\\nE) \\nAPPROACH PROCEDURE VOR B SUSPENDED DUE POSSIBLE UNRELIABLE SIGNALS \\nIN APPROACH SECTOR. REF AIP AD ENBO 5-5\\nCREATED: 22 Oct 2018 17:16:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-10-22T17:16:00.000Z\",\n" +
                "    \"key\": \"A4003/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6ba\",\n" +
                "    \"id\": \"A4002/18\",\n" +
                "    \"entity\": \"PI\",\n" +
                "    \"status\": \"AU\",\n" +
                "    \"Qcode\": \"PIAU\",\n" +
                "    \"Area\": \"ATM\",\n" +
                "    \"SubArea\": \"Air traffic procedures\",\n" +
                "    \"Condition\": \"Availability\",\n" +
                "    \"Subject\": \"Instrument approach procedure\",\n" +
                "    \"Modifier\": \"Not available\",\n" +
                "    \"message\": \"APCH PROCEDURE VOR A SUSPENDED DUE POSSIBLE UNRELIABLE VOR SIGNALS \\nIN APPROACH SECTOR. REF AD 2 ENBO 5-4\\nCREATED: 22 Oct 2018 17:14:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-10-22T17:14:00.000Z\",\n" +
                "    \"enddate\": \"2018-12-05T23:59:00.000Z\",\n" +
                "    \"all\": \"A4002/18 NOTAMR A3978/18\\nQ) ENOR/QPIAU/I /NBO/A /000/999/6716N01422E005\\nA) ENBO B) 1810221714 C) 1812052359 EST\\nE) \\nAPCH PROCEDURE VOR A SUSPENDED DUE POSSIBLE UNRELIABLE VOR SIGNALS \\nIN APPROACH SECTOR. REF AD 2 ENBO 5-4\\nCREATED: 22 Oct 2018 17:14:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-10-22T17:14:00.000Z\",\n" +
                "    \"key\": \"A4002/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6bb\",\n" +
                "    \"id\": \"A3828/18\",\n" +
                "    \"entity\": \"MY\",\n" +
                "    \"status\": \"LL\",\n" +
                "    \"Qcode\": \"MYLL\",\n" +
                "    \"Area\": \"AGA\",\n" +
                "    \"SubArea\": \"Movement and landing area\",\n" +
                "    \"Condition\": \"Limitations\",\n" +
                "    \"Subject\": \"Rapid exit taxiway\",\n" +
                "    \"Modifier\": \"Usable for length and width\",\n" +
                "    \"message\": \"CORRECT USEABLE WIDTH TWY G SHALL READ 15 M. REF AIP ENBO 2.8 TEXT \\nPAGE\\nCREATED: 10 Oct 2018 11:12:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-10-10T11:11:00.000Z\",\n" +
                "    \"enddate\": \"2019-04-10T23:59:00.000Z\",\n" +
                "    \"all\": \"A3828/18 NOTAMN\\nQ) ENOR/QMYLL/IV/NBO/A /000/999/6716N01422E005\\nA) ENBO B) 1810101111 C) 1904102359 EST\\nE) \\nCORRECT USEABLE WIDTH TWY G SHALL READ 15 M. REF AIP ENBO 2.8 TEXT \\nPAGE\\nCREATED: 10 Oct 2018 11:12:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-10-10T11:12:00.000Z\",\n" +
                "    \"key\": \"A3828/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6bc\",\n" +
                "    \"id\": \"A3755/18\",\n" +
                "    \"entity\": \"OB\",\n" +
                "    \"status\": \"CE\",\n" +
                "    \"Qcode\": \"OBCE\",\n" +
                "    \"Area\": \"Other Information\",\n" +
                "    \"SubArea\": \"Other Information\",\n" +
                "    \"Condition\": \"Changes\",\n" +
                "    \"Subject\": \"Obstacle\",\n" +
                "    \"Modifier\": \"Erected\",\n" +
                "    \"message\": \"CONSTRUCTION CRANE AT PSN 671701N 0142258E, 1760M NORTH OF ARP. MAX \\nHGT 210 FT AMSL.\\nCREATED: 01 Oct 2018 11:59:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-10-01T11:58:00.000Z\",\n" +
                "    \"enddate\": \"2018-12-20T12:00:00.000Z\",\n" +
                "    \"all\": \"A3755/18 NOTAMR A3740/18\\nQ) ENOR/QOBCE/IV/M  /A /000/999/6716N01422E005\\nA) ENBO B) 1810011158 C) 1812201200 EST\\nE) \\nCONSTRUCTION CRANE AT PSN 671701N 0142258E, 1760M NORTH OF ARP. MAX \\nHGT 210 FT AMSL.\\nCREATED: 01 Oct 2018 11:59:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-10-01T11:59:00.000Z\",\n" +
                "    \"key\": \"A3755/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6bd\",\n" +
                "    \"id\": \"A3567/18\",\n" +
                "    \"entity\": \"PA\",\n" +
                "    \"status\": \"XX\",\n" +
                "    \"Qcode\": \"PAXX\",\n" +
                "    \"Area\": \"ATM\",\n" +
                "    \"SubArea\": \"Air traffic procedures\",\n" +
                "    \"Condition\": \"Other\",\n" +
                "    \"Subject\": \"Standard instrument arrival\",\n" +
                "    \"Modifier\": \"Plain language\",\n" +
                "    \"message\": \"CHG MISSED APCH TO READ: CLIMB ON R-083 BDO TO BDO. TURN RIGHT TO\\nINTERCEPT AND PROCEED ON R-269 BDO. WHEN PASSING 4000FT, TURN RIGHT\\nDCT BDO. ENTER BDO HLDG AT 4400FT. REF AIP NORWAY A2 2 ENBO VOR-C EFF\\n08 MAR 2012\\nCREATED: 25 Sep 2018 16:32:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-09-25T16:31:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"A3567/18 NOTAMR A0106/18\\nQ) ENOR/QPAXX/I /NBO/A /000/999/6716N01422E005\\nA) ENBO B) 1809251631 C) PERM\\nE) CHG MISSED APCH TO READ: CLIMB ON R-083 BDO TO BDO. TURN RIGHT TO\\nINTERCEPT AND PROCEED ON R-269 BDO. WHEN PASSING 4000FT, TURN RIGHT\\nDCT BDO. ENTER BDO HLDG AT 4400FT. REF AIP NORWAY A2 2 ENBO VOR-C EFF\\n08 MAR 2012\\nCREATED: 25 Sep 2018 16:32:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-09-25T16:32:00.000Z\",\n" +
                "    \"key\": \"A3567/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6be\",\n" +
                "    \"id\": \"A3566/18\",\n" +
                "    \"entity\": \"PA\",\n" +
                "    \"status\": \"XX\",\n" +
                "    \"Qcode\": \"PAXX\",\n" +
                "    \"Area\": \"ATM\",\n" +
                "    \"SubArea\": \"Air traffic procedures\",\n" +
                "    \"Condition\": \"Other\",\n" +
                "    \"Subject\": \"Standard instrument arrival\",\n" +
                "    \"Modifier\": \"Plain language\",\n" +
                "    \"message\": \"CHG MISSED APCH TO READ: CLIMB STRAIGHT AHEAD TO BDO. TURN RIGHT\\nTO INTERCEPT AND PROCEED ON R-241 BDO. WHEN PASSING 4000FT TURN RIGHT\\nDCT BDO. ENTER BDO HLDG AT 4400FT. REF AIP NORWAY AD 2 ENBO VOR-B EFF\\n08 MAR 2012\\nCREATED: 25 Sep 2018 16:30:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-09-25T16:30:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"A3566/18 NOTAMR A0105/18\\nQ) ENOR/QPAXX/I /NBO/A /000/999/6716N01422E005\\nA) ENBO B) 1809251630 C) PERM\\nE) CHG MISSED APCH TO READ: CLIMB STRAIGHT AHEAD TO BDO. TURN RIGHT\\nTO INTERCEPT AND PROCEED ON R-241 BDO. WHEN PASSING 4000FT TURN RIGHT\\nDCT BDO. ENTER BDO HLDG AT 4400FT. REF AIP NORWAY AD 2 ENBO VOR-B EFF\\n08 MAR 2012\\nCREATED: 25 Sep 2018 16:30:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-09-25T16:30:00.000Z\",\n" +
                "    \"key\": \"A3566/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6bf\",\n" +
                "    \"id\": \"A3565/18\",\n" +
                "    \"entity\": \"PA\",\n" +
                "    \"status\": \"XX\",\n" +
                "    \"Qcode\": \"PAXX\",\n" +
                "    \"Area\": \"ATM\",\n" +
                "    \"SubArea\": \"Air traffic procedures\",\n" +
                "    \"Condition\": \"Other\",\n" +
                "    \"Subject\": \"Standard instrument arrival\",\n" +
                "    \"Modifier\": \"Plain language\",\n" +
                "    \"message\": \"CHG MISSED APCH PROC TO READ: CLIMB STRAIGHT AHEAD TO BDO. TURN\\nLEFT TO INTERCEPT AND PROCEED ON R-288 BDO. WHEN PASSING 4000FT\\nPROCEED DCT BDO. ENTER BDO HLDG AT 4400FT. REF AIP NORWAY AD 2 ENBO\\nVOR-A EFF 08 MAR 2012\\nCREATED: 25 Sep 2018 16:29:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-09-25T16:28:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"A3565/18 NOTAMR A0104/18\\nQ) ENOR/QPAXX/I /NBO/A /000/999/6716N01422E005\\nA) ENBO B) 1809251628 C) PERM\\nE) CHG MISSED APCH PROC TO READ: CLIMB STRAIGHT AHEAD TO BDO. TURN\\nLEFT TO INTERCEPT AND PROCEED ON R-288 BDO. WHEN PASSING 4000FT\\nPROCEED DCT BDO. ENTER BDO HLDG AT 4400FT. REF AIP NORWAY AD 2 ENBO\\nVOR-A EFF 08 MAR 2012\\nCREATED: 25 Sep 2018 16:29:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-09-25T16:29:00.000Z\",\n" +
                "    \"key\": \"A3565/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6c0\",\n" +
                "    \"id\": \"A3564/18\",\n" +
                "    \"entity\": \"PA\",\n" +
                "    \"status\": \"XX\",\n" +
                "    \"Qcode\": \"PAXX\",\n" +
                "    \"Area\": \"ATM\",\n" +
                "    \"SubArea\": \"Air traffic procedures\",\n" +
                "    \"Condition\": \"Other\",\n" +
                "    \"Subject\": \"Standard instrument arrival\",\n" +
                "    \"Modifier\": \"Plain language\",\n" +
                "    \"message\": \"REVISE BDO HLDG ALTITUDE TO READ 4400FT. REF AIP NORWAY ENBO 5-1\\nEFF 31 MAY 2012, 5-2 EFF 08 MAR 2012, 5-3 EFF 12 DEC 2013, 5-4 EFF 08\\nMAR 2012, 5-5 EFF 08 MAR 2012 AND 5-6 EFF 08 MAR 2012\\nCREATED: 25 Sep 2018 16:28:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-09-25T16:27:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"A3564/18 NOTAMR A0103/18\\nQ) ENOR/QPAXX/I /NBO/A /000/999/6716N01422E005\\nA) ENBO B) 1809251627 C) PERM\\nE) REVISE BDO HLDG ALTITUDE TO READ 4400FT. REF AIP NORWAY ENBO 5-1\\nEFF 31 MAY 2012, 5-2 EFF 08 MAR 2012, 5-3 EFF 12 DEC 2013, 5-4 EFF 08\\nMAR 2012, 5-5 EFF 08 MAR 2012 AND 5-6 EFF 08 MAR 2012\\nCREATED: 25 Sep 2018 16:28:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-09-25T16:28:00.000Z\",\n" +
                "    \"key\": \"A3564/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6c1\",\n" +
                "    \"id\": \"A3549/18\",\n" +
                "    \"entity\": \"PI\",\n" +
                "    \"status\": \"XX\",\n" +
                "    \"Qcode\": \"PIXX\",\n" +
                "    \"Area\": \"ATM\",\n" +
                "    \"SubArea\": \"Air traffic procedures\",\n" +
                "    \"Condition\": \"Other\",\n" +
                "    \"Subject\": \"Instrument approach procedure\",\n" +
                "    \"Modifier\": \"Plain language\",\n" +
                "    \"message\": \"DIST FM OSLIP TO XAMUT: 6.0NM\\nREF AIP NORWAY AD 2 ENBO 5-1, ILS Z OR LOC Z RWY 07, DATED 31 MAY\\n2012\\nCREATED: 25 Sep 2018 15:58:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-09-25T15:58:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"A3549/18 NOTAMR A0453/14\\nQ) ENOR/QPIXX/I /NBO/A /000/999/6716N01422E005\\nA) ENBO B) 1809251558 C) PERM\\nE) DIST FM OSLIP TO XAMUT: 6.0NM\\nREF AIP NORWAY AD 2 ENBO 5-1, ILS Z OR LOC Z RWY 07, DATED 31 MAY\\n2012\\nCREATED: 25 Sep 2018 15:58:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-09-25T15:58:00.000Z\",\n" +
                "    \"key\": \"A3549/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6c2\",\n" +
                "    \"id\": \"A3548/18\",\n" +
                "    \"entity\": \"IC\",\n" +
                "    \"status\": \"XX\",\n" +
                "    \"Qcode\": \"ICXX\",\n" +
                "    \"Area\": \"CNS\",\n" +
                "    \"SubArea\": \"Instrument and microwave landing systems\",\n" +
                "    \"Condition\": \"Other\",\n" +
                "    \"Subject\": \"Instrument landing system\",\n" +
                "    \"Modifier\": \"Plain language\",\n" +
                "    \"message\": \"WHEN CLEARED FOR ILS RWY07, ENSURE THAT APCH TRANSITION FM\\nNUMSI/OSLIP IS SELECTED AND THAT XAMUT IS PART OF THE FMS ROUTING,\\nREF AD2 ENBO 5-1 ILS 'Z' OR LOC 'Z' RWY07, DATED 31 MAY 2012\\nCREATED: 25 Sep 2018 15:57:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-09-25T15:56:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"A3548/18 NOTAMR A2118/12\\nQ) ENOR/QICXX/I /NBO/A /000/999/6716N01422E005\\nA) ENBO B) 1809251556 C) PERM\\nE) WHEN CLEARED FOR ILS RWY07, ENSURE THAT APCH TRANSITION FM\\nNUMSI/OSLIP IS SELECTED AND THAT XAMUT IS PART OF THE FMS ROUTING,\\nREF AD2 ENBO 5-1 ILS 'Z' OR LOC 'Z' RWY07, DATED 31 MAY 2012\\nCREATED: 25 Sep 2018 15:57:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-09-25T15:57:00.000Z\",\n" +
                "    \"key\": \"A3548/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6c3\",\n" +
                "    \"id\": \"A3441/18\",\n" +
                "    \"entity\": \"OB\",\n" +
                "    \"status\": \"CE\",\n" +
                "    \"Qcode\": \"OBCE\",\n" +
                "    \"Area\": \"Other Information\",\n" +
                "    \"SubArea\": \"Other Information\",\n" +
                "    \"Condition\": \"Changes\",\n" +
                "    \"Subject\": \"Obstacle\",\n" +
                "    \"Modifier\": \"Erected\",\n" +
                "    \"message\": \"CONSTR CRANE AT PSN 671709N 0142309E 2030M NE OF AD REFERENCE\\nPOINT, HGT 200FT AMSL\\nCREATED: 25 Sep 2018 08:43:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-09-25T08:42:00.000Z\",\n" +
                "    \"enddate\": \"2019-03-31T15:00:00.000Z\",\n" +
                "    \"all\": \"A3441/18 NOTAMR A0994/18\\nQ) ENOR/QOBCE/IV/M  /A /000/999/6716N01422E005\\nA) ENBO B) 1809250842 C) 1903311500 EST\\nE) CONSTR CRANE AT PSN 671709N 0142309E 2030M NE OF AD REFERENCE\\nPOINT, HGT 200FT AMSL\\nCREATED: 25 Sep 2018 08:43:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-09-25T08:43:00.000Z\",\n" +
                "    \"key\": \"A3441/18-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6c4\",\n" +
                "    \"id\": \"SWEN0411\",\n" +
                "    \"entity\": \"\",\n" +
                "    \"status\": \"\",\n" +
                "    \"Qcode\": \"\",\n" +
                "    \"Area\": \"\",\n" +
                "    \"SubArea\": \"\",\n" +
                "    \"Condition\": \"\",\n" +
                "    \"Subject\": \"\",\n" +
                "    \"Modifier\": \"\",\n" +
                "    \"message\": \"\",\n" +
                "    \"startdate\": \"2012-04-07T03:00:00.000Z\",\n" +
                "    \"enddate\": \"2006-11-30T00:00:00.000Z\",\n" +
                "    \"all\": \"SWEN0411 ENBO 12040703 \\n(SNOWTAM 0411\\nA) ENBO\\nB) 12040703 C) 07\\nF) 2/2/2 G) XX/XX/XX H) 5/5/5\\nN) ALPHA BRAVO CHARLIE DELTA ECHO FOXTROT GOLF HOTEL\\nINDIA JULIET MIKE WHISKEY YANKEE/2\\nR) APRON EAST APRON WEST RWY EXTENSION WEST/2\\nT) CONTAMINATION/100/100/100/PERCENT.)\\nCREATED: 04 Dec 2018 07:06:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBO\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"\",\n" +
                "    \"key\": \"SWEN0411-ENBO\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6e0\",\n" +
                "    \"id\": \"A4451/18\",\n" +
                "    \"entity\": \"NM\",\n" +
                "    \"status\": \"AS\",\n" +
                "    \"Qcode\": \"NMAS\",\n" +
                "    \"Area\": \"CNS\",\n" +
                "    \"SubArea\": \"Terminal and en-route navigation facilities\",\n" +
                "    \"Condition\": \"Availability\",\n" +
                "    \"Subject\": \"VOR/DME\",\n" +
                "    \"Modifier\": \"Unserviceable\",\n" +
                "    \"message\": \"SOLA DVOR/DME ZOL FREQ 116.85 MHZ CH115Y OUT OF SERVICE DUE WIP\\nCREATED: 28 Nov 2018 14:10:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-12-03T07:00:00.000Z\",\n" +
                "    \"enddate\": \"2018-12-07T14:00:00.000Z\",\n" +
                "    \"all\": \"A4451/18 NOTAMN\\nQ) ENOR/QNMAS/IV/BO /AE/000/999/5853N00538E025\\nA) ENZV B) 1812030700 C) 1812071400 EST\\nE) SOLA DVOR/DME ZOL FREQ 116.85 MHZ CH115Y OUT OF SERVICE DUE WIP\\nCREATED: 28 Nov 2018 14:10:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENZV\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-11-28T14:10:00.000Z\",\n" +
                "    \"key\": \"A4451/18-ENZV\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6e1\",\n" +
                "    \"id\": \"A4074/18\",\n" +
                "    \"entity\": \"MX\",\n" +
                "    \"status\": \"LC\",\n" +
                "    \"Qcode\": \"MXLC\",\n" +
                "    \"Area\": \"AGA\",\n" +
                "    \"SubArea\": \"Movement and landing area\",\n" +
                "    \"Condition\": \"Limitations\",\n" +
                "    \"Subject\": \"Taxiway(s)\",\n" +
                "    \"Modifier\": \"Closed\",\n" +
                "    \"message\": \"TWY F2 CLOSED. REF AIP NORWAY AD 2 ENZV AD 2.8 EFF 26 APR 2018 AND \\nADC LIGHTNING AND MARKING AIDS EFF 08 DEC 2016\\nCREATED: 26 Oct 2018 08:18:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-10-26T08:17:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"A4074/18 NOTAMN\\nQ) ENOR/QMXLC/IV/M  /A /000/999/5853N00538E005\\nA) ENZV B) 1810260817 C) PERM\\nE) \\nTWY F2 CLOSED. REF AIP NORWAY AD 2 ENZV AD 2.8 EFF 26 APR 2018 AND \\nADC LIGHTNING AND MARKING AIDS EFF 08 DEC 2016\\nCREATED: 26 Oct 2018 08:18:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENZV\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-10-26T08:18:00.000Z\",\n" +
                "    \"key\": \"A4074/18-ENZV\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6e2\",\n" +
                "    \"id\": \"A4043/18\",\n" +
                "    \"entity\": \"FA\",\n" +
                "    \"status\": \"TT\",\n" +
                "    \"Qcode\": \"FATT\",\n" +
                "    \"Area\": \"AGA\",\n" +
                "    \"SubArea\": \"Facilities and services\",\n" +
                "    \"Condition\": \"Other\",\n" +
                "    \"Subject\": \"Aerodrome\",\n" +
                "    \"Modifier\": \"AIRAC AIP Amendments\",\n" +
                "    \"message\": \"TRIGGER NOTAM - AIP AIRAC AMDT 07/18 EFF 06 DEC 2018:\\nADC REVISED\\nCREATED: 25 Oct 2018 07:01:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-12-06T00:00:00.000Z\",\n" +
                "    \"enddate\": \"2018-12-19T23:59:00.000Z\",\n" +
                "    \"all\": \"A4043/18 NOTAMN\\nQ) ENOR/QFATT/IV/BO /A /000/999/5853N00538E005\\nA) ENZV B) 1812060000 C) 1812192359\\nE) TRIGGER NOTAM - AIP AIRAC AMDT 07/18 EFF 06 DEC 2018:\\nADC REVISED\\nCREATED: 25 Oct 2018 07:01:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENZV\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-10-25T07:01:00.000Z\",\n" +
                "    \"key\": \"A4043/18-ENZV\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6e3\",\n" +
                "    \"id\": \"A3493/18\",\n" +
                "    \"entity\": \"PD\",\n" +
                "    \"status\": \"XX\",\n" +
                "    \"Qcode\": \"PDXX\",\n" +
                "    \"Area\": \"ATM\",\n" +
                "    \"SubArea\": \"Air traffic procedures\",\n" +
                "    \"Condition\": \"Other\",\n" +
                "    \"Subject\": \"Standard instrument departure\",\n" +
                "    \"Modifier\": \"Plain language\",\n" +
                "    \"message\": \"PROP SID WITH DESIGNATOR X, Y AND Z SUSPENDED\\nCREATED: 25 Sep 2018 11:24:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-09-25T11:23:00.000Z\",\n" +
                "    \"enddate\": \"2019-01-02T23:59:00.000Z\",\n" +
                "    \"all\": \"A3493/18 NOTAMR A2736/18\\nQ) ENOR/QPDXX/I /NBO/A /000/999/5853N00538E005\\nA) ENZV B) 1809251123 C) 1901022359 EST\\nE) PROP SID WITH DESIGNATOR X, Y AND Z SUSPENDED\\nCREATED: 25 Sep 2018 11:24:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENZV\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-09-25T11:24:00.000Z\",\n" +
                "    \"key\": \"A3493/18-ENZV\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6e4\",\n" +
                "    \"id\": \"A3492/18\",\n" +
                "    \"entity\": \"PD\",\n" +
                "    \"status\": \"AU\",\n" +
                "    \"Qcode\": \"PDAU\",\n" +
                "    \"Area\": \"ATM\",\n" +
                "    \"SubArea\": \"Air traffic procedures\",\n" +
                "    \"Condition\": \"Availability\",\n" +
                "    \"Subject\": \"Standard instrument departure\",\n" +
                "    \"Modifier\": \"Not available\",\n" +
                "    \"message\": \"HELICOPTER SID INLUP1F AND ETROM1F SUSPENDED DUE NOISE ABATEMENT\\nREF AIP NORWAY AD 2 ENZV 4-29/30\\nCREATED: 25 Sep 2018 11:22:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-09-25T11:22:00.000Z\",\n" +
                "    \"enddate\": \"2019-01-02T23:59:00.000Z\",\n" +
                "    \"all\": \"A3492/18 NOTAMR A2452/18\\nQ) ENOR/QPDAU/I /NBO/A /000/999/5853N00538E005\\nA) ENZV B) 1809251122 C) 1901022359 EST\\nE) HELICOPTER SID INLUP1F AND ETROM1F SUSPENDED DUE NOISE ABATEMENT\\nREF AIP NORWAY AD 2 ENZV 4-29/30\\nCREATED: 25 Sep 2018 11:22:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENZV\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-09-25T11:22:00.000Z\",\n" +
                "    \"key\": \"A3492/18-ENZV\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b086ab233e8499ecb6e5\",\n" +
                "    \"id\": \"A3491/18\",\n" +
                "    \"entity\": \"FA\",\n" +
                "    \"status\": \"AP\",\n" +
                "    \"Qcode\": \"FAAP\",\n" +
                "    \"Area\": \"AGA\",\n" +
                "    \"SubArea\": \"Facilities and services\",\n" +
                "    \"Condition\": \"Availability\",\n" +
                "    \"Subject\": \"Aerodrome\",\n" +
                "    \"Modifier\": \"Available, prior permission required\",\n" +
                "    \"message\": \"PPR FOR ALL VFR TFC UNLESS FPL IS FILED. PPR MUST BE REQUESTED AT\\nLATEST 1800 TO TEL +47 51658143. HOSP/SAR/MIL EXEMPTED\\nCREATED: 25 Sep 2018 11:21:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-09-25T11:20:00.000Z\",\n" +
                "    \"enddate\": \"2019-01-02T05:00:00.000Z\",\n" +
                "    \"all\": \"A3491/18 NOTAMR A2443/18\\nQ) ENOR/QFAAP/IV/NBO/A /000/999/5853N00538E005\\nA) ENZV B) 1809251120 C) 1901020500 EST\\nD) DAILY 1930-0500\\nE) PPR FOR ALL VFR TFC UNLESS FPL IS FILED. PPR MUST BE REQUESTED AT\\nLATEST 1800 TO TEL +47 51658143. HOSP/SAR/MIL EXEMPTED\\nCREATED: 25 Sep 2018 11:21:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENZV\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-09-25T11:21:00.000Z\",\n" +
                "    \"key\": \"A3491/18-ENZV\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b088ab233e8499ecdc28\",\n" +
                "    \"id\": \"A4490/18\",\n" +
                "    \"entity\": \"NM\",\n" +
                "    \"status\": \"AS\",\n" +
                "    \"Qcode\": \"NMAS\",\n" +
                "    \"Area\": \"CNS\",\n" +
                "    \"SubArea\": \"Terminal and en-route navigation facilities\",\n" +
                "    \"Condition\": \"Availability\",\n" +
                "    \"Subject\": \"VOR/DME\",\n" +
                "    \"Modifier\": \"Unserviceable\",\n" +
                "    \"message\": \"GARDERMOEN DVOR/DME GRM FREQ 115.95 MHZ CH106Y OUT OF SERVICE\\nCREATED: 03 Dec 2018 13:50:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-12-05T07:00:00.000Z\",\n" +
                "    \"enddate\": \"2018-12-05T13:00:00.000Z\",\n" +
                "    \"all\": \"A4490/18 NOTAMN\\nQ) ENOR/QNMAS/IV/BO /A /000/999/6012N01104E005\\nA) ENGM B) 1812050700 C) 1812051300\\nE) GARDERMOEN DVOR/DME GRM FREQ 115.95 MHZ CH106Y OUT OF SERVICE\\nCREATED: 03 Dec 2018 13:50:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENGM\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-12-03T13:50:00.000Z\",\n" +
                "    \"key\": \"A4490/18-ENGM\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b088ab233e8499ecdc29\",\n" +
                "    \"id\": \"A4047/18\",\n" +
                "    \"entity\": \"FA\",\n" +
                "    \"status\": \"TT\",\n" +
                "    \"Qcode\": \"FATT\",\n" +
                "    \"Area\": \"AGA\",\n" +
                "    \"SubArea\": \"Facilities and services\",\n" +
                "    \"Condition\": \"Other\",\n" +
                "    \"Subject\": \"Aerodrome\",\n" +
                "    \"Modifier\": \"AIRAC AIP Amendments\",\n" +
                "    \"message\": \"TRIGGER NOTAM - AIP AIRAC AMDT 07/18 EFF 06 DEC 2018:\\nGRM VOR REVISED. PDC-CIVIL TERMINAL REVISED. SID (RNAV) RWY 01R \\nREVISED\\nCREATED: 25 Oct 2018 07:43:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-12-06T00:00:00.000Z\",\n" +
                "    \"enddate\": \"2018-12-19T23:59:00.000Z\",\n" +
                "    \"all\": \"A4047/18 NOTAMN\\nQ) ENOR/QFATT/IV/BO /A /000/999/6012N01105E005\\nA) ENGM B) 1812060000 C) 1812192359\\nE) TRIGGER NOTAM - AIP AIRAC AMDT 07/18 EFF 06 DEC 2018:\\nGRM VOR REVISED. PDC-CIVIL TERMINAL REVISED. SID (RNAV) RWY 01R \\nREVISED\\nCREATED: 25 Oct 2018 07:43:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENGM\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-10-25T07:43:00.000Z\",\n" +
                "    \"key\": \"A4047/18-ENGM\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b088ab233e8499ecdc2a\",\n" +
                "    \"id\": \"A3929/18\",\n" +
                "    \"entity\": \"MR\",\n" +
                "    \"status\": \"XX\",\n" +
                "    \"Qcode\": \"MRXX\",\n" +
                "    \"Area\": \"AGA\",\n" +
                "    \"SubArea\": \"Movement and landing area\",\n" +
                "    \"Condition\": \"Other\",\n" +
                "    \"Subject\": \"Runway\",\n" +
                "    \"Modifier\": \"Plain language\",\n" +
                "    \"message\": \"RWY 01R/19L REPORTED SLIPPERY WHEN WET\\nCREATED: 18 Oct 2018 10:07:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-10-18T10:07:00.000Z\",\n" +
                "    \"enddate\": \"2019-08-10T23:59:00.000Z\",\n" +
                "    \"all\": \"A3929/18 NOTAMR A3876/18\\nQ) ENOR/QMRXX/IV/NBO/A /000/999/6012N01105E005\\nA) ENGM B) 1810181007 C) 1908102359\\nE) RWY 01R/19L REPORTED SLIPPERY WHEN WET\\nCREATED: 18 Oct 2018 10:07:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENGM\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-10-18T10:07:00.000Z\",\n" +
                "    \"key\": \"A3929/18-ENGM\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b088ab233e8499ecdc2b\",\n" +
                "    \"id\": \"SWEN0995\",\n" +
                "    \"entity\": \"\",\n" +
                "    \"status\": \"\",\n" +
                "    \"Qcode\": \"\",\n" +
                "    \"Area\": \"\",\n" +
                "    \"SubArea\": \"\",\n" +
                "    \"Condition\": \"\",\n" +
                "    \"Subject\": \"\",\n" +
                "    \"Modifier\": \"\",\n" +
                "    \"message\": \"\",\n" +
                "    \"startdate\": \"2012-04-16T13:00:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"SWEN0995 ENGM 12041613 \\n(SNOWTAM 0995\\nA) ENGM\\nB) 12041613 C) 01L\\nF) 1/1/1 G) XX/XX/XX H) 5/5/5\\nB) 12041610 C) 01R\\nF) 1/1/1 G) XX/XX/XX H) 5/5/5\\nN) ALL REPORTED TWYS/1\\nR) ALL REPORTED APRONS/1\\nT) RWY 01L\\nCONTAMINATION/100/100/100/PERCENT.\\nRWY 01R\\nOBSERVATION TIME RWY 01R 201812041610\\nCONTAMINATION/100/100/100/PERCENT.)\\nCREATED: 04 Dec 2018 16:15:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENGM\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"\",\n" +
                "    \"key\": \"SWEN0995-ENGM\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b088ab233e8499ecdc2c\",\n" +
                "    \"id\": \"SWEN0994\",\n" +
                "    \"entity\": \"\",\n" +
                "    \"status\": \"\",\n" +
                "    \"Qcode\": \"\",\n" +
                "    \"Area\": \"\",\n" +
                "    \"SubArea\": \"\",\n" +
                "    \"Condition\": \"\",\n" +
                "    \"Subject\": \"\",\n" +
                "    \"Modifier\": \"\",\n" +
                "    \"message\": \"\",\n" +
                "    \"startdate\": \"2012-04-12T14:00:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"SWEN0994 ENGM 12041138 \\n(SNOWTAM 0994\\nA) ENGM\\nB) 12041138 C) 01L\\nF) 2/2/2 G) XX/XX/XX H) 5/5/5\\nB) 12041107 C) 01R\\nF) 2/2/2 G) XX/XX/XX H) 5/5/5\\nN) ALL REPORTED TWYS/2\\nR) ALL REPORTED APRONS/2\\nT) RWY 01L\\nCONTAMINATION/100/100/100/PERCENT.\\nCHEMICALS APPLIED.\\nCHEMICALS ON OPEN EXITS. CHEMICALS ON DEICING\\nALPHA SOUTH.\\nRWY 01R\\nOBSERVATION TIME RWY 01R 201812041107\\nCONTAMINATION/100/100/100/PERCENT.\\nCHEMICALS APPLIED.\\nCHEMICALS ON OPEN EXITS.)\\nCREATED: 04 Dec 2018 11:40:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENGM\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"\",\n" +
                "    \"key\": \"SWEN0994-ENGM\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b088ab233e8499ecdc2d\",\n" +
                "    \"id\": \"A4359/18\",\n" +
                "    \"entity\": \"PI\",\n" +
                "    \"status\": \"AU\",\n" +
                "    \"Qcode\": \"PIAU\",\n" +
                "    \"Area\": \"ATM\",\n" +
                "    \"SubArea\": \"Air traffic procedures\",\n" +
                "    \"Condition\": \"Availability\",\n" +
                "    \"Subject\": \"Instrument approach procedure\",\n" +
                "    \"Modifier\": \"Not available\",\n" +
                "    \"message\": \"CENOR FLIP HI-TACAN RWY 17 NOT TO BE USED\\nCREATED: 19 Nov 2018 06:15:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-11-19T06:14:00.000Z\",\n" +
                "    \"enddate\": \"2019-01-03T23:59:00.000Z\",\n" +
                "    \"all\": \"A4359/18 NOTAMR A3999/18\\nQ) ENOR/QPIAU/I /NBO/A /000/999/6018N00513E005\\nA) ENBR B) 1811190614 C) 1901032359 EST\\nE) CENOR FLIP HI-TACAN RWY 17 NOT TO BE USED\\nCREATED: 19 Nov 2018 06:15:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBR\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-11-19T06:15:00.000Z\",\n" +
                "    \"key\": \"A4359/18-ENBR\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b088ab233e8499ecdc2e\",\n" +
                "    \"id\": \"A4321/18\",\n" +
                "    \"entity\": \"RT\",\n" +
                "    \"status\": \"CA\",\n" +
                "    \"Qcode\": \"RTCA\",\n" +
                "    \"Area\": \"Navigation Warnings\",\n" +
                "    \"SubArea\": \"Airspace restrictions\",\n" +
                "    \"Condition\": \"Changes\",\n" +
                "    \"Subject\": \"Temporary restricted area\",\n" +
                "    \"Modifier\": \"Activated\",\n" +
                "    \"message\": \"TEMPO RESTRICTED AREA - NO FLY ZONE ACTIVATED AT STURETERMINALEN PSN \\n6038N 00450E, RADIUS 2NM. HOSP/SAR/MIL EXEMPTED TEL 55504600\",\n" +
                "    \"startdate\": \"2018-11-14T12:16:00.000Z\",\n" +
                "    \"enddate\": \"2018-12-31T23:59:00.000Z\",\n" +
                "    \"all\": \"A4321/18 NOTAMR A4304/18\\nQ) ENOR/QRTCA/IV/BO /AW/000/020/6038N00450E002\\nA) ENBR B) 1811141216 C) 1812312359 EST\\nE) \\nTEMPO RESTRICTED AREA - NO FLY ZONE ACTIVATED AT STURETERMINALEN PSN \\n6038N 00450E, RADIUS 2NM. HOSP/SAR/MIL EXEMPTED TEL 55504600\\nF) GND G) 2000FT AMSL\\nCREATED: 14 Nov 2018 12:17:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBR\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"\",\n" +
                "    \"key\": \"A4321/18-ENBR\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b088ab233e8499ecdc2f\",\n" +
                "    \"id\": \"A4297/18\",\n" +
                "    \"entity\": \"IG\",\n" +
                "    \"status\": \"XX\",\n" +
                "    \"Qcode\": \"IGXX\",\n" +
                "    \"Area\": \"CNS\",\n" +
                "    \"SubArea\": \"Instrument and microwave landing systems\",\n" +
                "    \"Condition\": \"Other\",\n" +
                "    \"Subject\": \"Glide path (ILS)\",\n" +
                "    \"Modifier\": \"Plain language\",\n" +
                "    \"message\": \"CHANGE GP RWY 17 RDH VALUE TO READ 52FT. REF AIP NORWAY AD2 ENBR AD \\n2.19. EFF 08 NOV 2018\\nCREATED: 13 Nov 2018 07:57:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-11-13T09:00:00.000Z\",\n" +
                "    \"enddate\": \"2018-12-20T23:59:00.000Z\",\n" +
                "    \"all\": \"A4297/18 NOTAMN\\nQ) ENOR/QIGXX/I /NBO/A /000/999/6018N00513E005\\nA) ENBR B) 1811130900 C) 1812202359\\nE) \\nCHANGE GP RWY 17 RDH VALUE TO READ 52FT. REF AIP NORWAY AD2 ENBR AD \\n2.19. EFF 08 NOV 2018\\nCREATED: 13 Nov 2018 07:57:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBR\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-11-13T07:57:00.000Z\",\n" +
                "    \"key\": \"A4297/18-ENBR\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b088ab233e8499ecdc30\",\n" +
                "    \"id\": \"A4296/18\",\n" +
                "    \"entity\": \"ND\",\n" +
                "    \"status\": \"CH\",\n" +
                "    \"Qcode\": \"NDCH\",\n" +
                "    \"Area\": \"CNS\",\n" +
                "    \"SubArea\": \"Terminal and en-route navigation facilities\",\n" +
                "    \"Condition\": \"Changes\",\n" +
                "    \"Subject\": \"Distance measuring equipment\",\n" +
                "    \"Modifier\": \"Changed\",\n" +
                "    \"message\": \"NEW POSITION FOR DME 'BR' RWY 17 TO READ 601801.93N 0051248.89E, \\nELEV 185FT. REF AIP NORWAY AD 2 ENBR AD 2.19 EFF 08 NOV 2018\\nCREATED: 13 Nov 2018 07:47:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-11-13T09:00:00.000Z\",\n" +
                "    \"enddate\": \"2018-12-20T23:59:00.000Z\",\n" +
                "    \"all\": \"A4296/18 NOTAMN\\nQ) ENOR/QNDCH/IV/BO /A /000/999/6018N00513E005\\nA) ENBR B) 1811130900 C) 1812202359\\nE) NEW POSITION FOR DME 'BR' RWY 17 TO READ 601801.93N 0051248.89E, \\nELEV 185FT. REF AIP NORWAY AD 2 ENBR AD 2.19 EFF 08 NOV 2018\\nCREATED: 13 Nov 2018 07:47:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBR\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-11-13T07:47:00.000Z\",\n" +
                "    \"key\": \"A4296/18-ENBR\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b088ab233e8499ecdc31\",\n" +
                "    \"id\": \"A4254/18\",\n" +
                "    \"entity\": \"LP\",\n" +
                "    \"status\": \"AS\",\n" +
                "    \"Qcode\": \"LPAS\",\n" +
                "    \"Area\": \"AGA\",\n" +
                "    \"SubArea\": \"Lighting facilities\",\n" +
                "    \"Condition\": \"Availability\",\n" +
                "    \"Subject\": \"Precision approach path indicator\",\n" +
                "    \"Modifier\": \"Unserviceable\",\n" +
                "    \"message\": \"PAPI RWY 17 LEFT SIDE U/S\\nCREATED: 08 Nov 2018 00:38:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-11-08T00:37:00.000Z\",\n" +
                "    \"enddate\": \"2018-12-31T05:00:00.000Z\",\n" +
                "    \"all\": \"A4254/18 NOTAMR A3444/18\\nQ) ENOR/QLPAS/IV/BO /A /000/999/6018N00513E005\\nA) ENBR B) 1811080037 C) 1812310500 EST\\nE) PAPI RWY 17 LEFT SIDE U/S\\nCREATED: 08 Nov 2018 00:38:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBR\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-11-08T00:38:00.000Z\",\n" +
                "    \"key\": \"A4254/18-ENBR\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b088ab233e8499ecdc32\",\n" +
                "    \"id\": \"A4051/18\",\n" +
                "    \"entity\": \"FA\",\n" +
                "    \"status\": \"TT\",\n" +
                "    \"Qcode\": \"FATT\",\n" +
                "    \"Area\": \"AGA\",\n" +
                "    \"SubArea\": \"Facilities and services\",\n" +
                "    \"Condition\": \"Other\",\n" +
                "    \"Subject\": \"Aerodrome\",\n" +
                "    \"Modifier\": \"AIRAC AIP Amendments\",\n" +
                "    \"message\": \"TRIGGER NOTAM - AIP AIRAC AMDT 07/18 EFF 06 DEC 2018:\\nGP AND DME RWY 17 REVISED\\nCREATED: 25 Oct 2018 07:54:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-12-06T00:00:00.000Z\",\n" +
                "    \"enddate\": \"2018-12-19T23:59:00.000Z\",\n" +
                "    \"all\": \"A4051/18 NOTAMN\\nQ) ENOR/QFATT/IV/BO /A /000/999/6018N00513E005\\nA) ENBR B) 1812060000 C) 1812192359\\nE) TRIGGER NOTAM - AIP AIRAC AMDT 07/18 EFF 06 DEC 2018:\\nGP AND DME RWY 17 REVISED\\nCREATED: 25 Oct 2018 07:54:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBR\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-10-25T07:54:00.000Z\",\n" +
                "    \"key\": \"A4051/18-ENBR\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b088ab233e8499ecdc33\",\n" +
                "    \"id\": \"A3786/18\",\n" +
                "    \"entity\": \"LP\",\n" +
                "    \"status\": \"XX\",\n" +
                "    \"Qcode\": \"LPXX\",\n" +
                "    \"Area\": \"AGA\",\n" +
                "    \"SubArea\": \"Lighting facilities\",\n" +
                "    \"Condition\": \"Other\",\n" +
                "    \"Subject\": \"Precision approach path indicator\",\n" +
                "    \"Modifier\": \"Plain language\",\n" +
                "    \"message\": \"CHANGE MEHT RWY 17 TO READ 49 FT. REF AIP AD 2 ENBR ADC, LIGHTNING\\nAND MARKINGS EFF 08 NOV 2018\\nCREATED: 04 Oct 2018 11:25:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-10-04T13:00:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"A3786/18 NOTAMN\\nQ) ENOR/QLPXX/IV/BO /A /000/999/6018N00513E005\\nA) ENBR B) 1810041300 C) PERM\\nE) CHANGE MEHT RWY 17 TO READ 49 FT. REF AIP AD 2 ENBR ADC, LIGHTNING\\nAND MARKINGS EFF 08 NOV 2018\\nCREATED: 04 Oct 2018 11:25:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBR\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-10-04T11:25:00.000Z\",\n" +
                "    \"key\": \"A3786/18-ENBR\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b088ab233e8499ecdc34\",\n" +
                "    \"id\": \"A3587/18\",\n" +
                "    \"entity\": \"PH\",\n" +
                "    \"status\": \"CH\",\n" +
                "    \"Qcode\": \"PHCH\",\n" +
                "    \"Area\": \"ATM\",\n" +
                "    \"SubArea\": \"Air traffic procedures\",\n" +
                "    \"Condition\": \"Changes\",\n" +
                "    \"Subject\": \"Holding procedure\",\n" +
                "    \"Modifier\": \"Changed\",\n" +
                "    \"message\": \"HOLDING OVERHEAD LUNUR: 1 MINUTE LEGS. REF AIP NORWAY AD 2 ENBR\\n4-23 EFF 21 JUN 2018 AND AD 2 ENBR 4-27 EFF 09 NOV 2017\\nCREATED: 25 Sep 2018 17:26:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-09-25T17:25:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"A3587/18 NOTAMR A1925/18\\nQ) ENOR/QPHCH/IV/BO /A /000/999/6018N00513E005\\nA) ENBR B) 1809251725 C) PERM\\nE) HOLDING OVERHEAD LUNUR: 1 MINUTE LEGS. REF AIP NORWAY AD 2 ENBR\\n4-23 EFF 21 JUN 2018 AND AD 2 ENBR 4-27 EFF 09 NOV 2017\\nCREATED: 25 Sep 2018 17:26:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBR\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-09-25T17:26:00.000Z\",\n" +
                "    \"key\": \"A3587/18-ENBR\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b088ab233e8499ecdc35\",\n" +
                "    \"id\": \"A3586/18\",\n" +
                "    \"entity\": \"PH\",\n" +
                "    \"status\": \"CH\",\n" +
                "    \"Qcode\": \"PHCH\",\n" +
                "    \"Area\": \"ATM\",\n" +
                "    \"SubArea\": \"Air traffic procedures\",\n" +
                "    \"Condition\": \"Changes\",\n" +
                "    \"Subject\": \"Holding procedure\",\n" +
                "    \"Modifier\": \"Changed\",\n" +
                "    \"message\": \"HOLDING OVERHEAD PESUR: 1 MINUTE LEGS. REF AIP NORWAY AD 2  ENBR\\n4-23 EFF 21 JUN 2018 AND AD 2 ENBR 4-27 EFF 09 NOV 2017\\nCREATED: 25 Sep 2018 17:25:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-09-25T17:23:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"A3586/18 NOTAMR A1923/18\\nQ) ENOR/QPHCH/IV/BO /A /000/999/6018N00513E005\\nA) ENBR B) 1809251723 C) PERM\\nE) HOLDING OVERHEAD PESUR: 1 MINUTE LEGS. REF AIP NORWAY AD 2  ENBR\\n4-23 EFF 21 JUN 2018 AND AD 2 ENBR 4-27 EFF 09 NOV 2017\\nCREATED: 25 Sep 2018 17:25:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBR\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-09-25T17:25:00.000Z\",\n" +
                "    \"key\": \"A3586/18-ENBR\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b088ab233e8499ecdc36\",\n" +
                "    \"id\": \"A3578/18\",\n" +
                "    \"entity\": \"CA\",\n" +
                "    \"status\": \"CI\",\n" +
                "    \"Qcode\": \"CACI\",\n" +
                "    \"Area\": \"CNS\",\n" +
                "    \"SubArea\": \"Communications and surveillance facilities\",\n" +
                "    \"Condition\": \"Changes\",\n" +
                "    \"Subject\": \"Air/ground facility\",\n" +
                "    \"Modifier\": \"Identification or radio call sign changed to\",\n" +
                "    \"message\": \"APP FREQ 121.100MHZ TO READ 121.000MHZ. REF AIP NORWAY ENBR 4-3,\\n4-7, 4-17, 4-24. ALL EFF 09 NOV 2017 AND 4-23 EFF 29 MAR 2018\\nCREATED: 25 Sep 2018 17:05:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-09-25T17:04:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"A3578/18 NOTAMR A1583/18\\nQ) ENOR/QCACI/IV/B  /A /000/999/6018N00513E005\\nA) ENBR B) 1809251704 C) PERM\\nE) APP FREQ 121.100MHZ TO READ 121.000MHZ. REF AIP NORWAY ENBR 4-3,\\n4-7, 4-17, 4-24. ALL EFF 09 NOV 2017 AND 4-23 EFF 29 MAR 2018\\nCREATED: 25 Sep 2018 17:05:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBR\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-09-25T17:05:00.000Z\",\n" +
                "    \"key\": \"A3578/18-ENBR\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b088ab233e8499ecdc37\",\n" +
                "    \"id\": \"A3571/18\",\n" +
                "    \"entity\": \"PA\",\n" +
                "    \"status\": \"XX\",\n" +
                "    \"Qcode\": \"PAXX\",\n" +
                "    \"Area\": \"ATM\",\n" +
                "    \"SubArea\": \"Air traffic procedures\",\n" +
                "    \"Condition\": \"Other\",\n" +
                "    \"Subject\": \"Standard instrument arrival\",\n" +
                "    \"Modifier\": \"Plain language\",\n" +
                "    \"message\": \"VISUAL APCH TEXT BOX TO READ: ON BADAB 2N, EXPECT CLEARANCE FROM\\nLEGTA TO SUNOS. ON PESUR 3N, EXPECT CLEARANCE DCT TOBAX. SEE AD 2\\nENBR 6-3 FOR DETAILS.\\nREF AIP NORWAY AD 2 ENBR STAR 17, EFF 29 MAR 2018\\nCREATED: 25 Sep 2018 16:52:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"startdate\": \"2018-09-25T16:51:00.000Z\",\n" +
                "    \"enddate\": \"2100-02-01T00:00:00.000Z\",\n" +
                "    \"all\": \"A3571/18 NOTAMR A1226/18\\nQ) ENOR/QPAXX/I /NBO/A /000/999/6018N00513E005\\nA) ENBR B) 1809251651 C) PERM\\nE) VISUAL APCH TEXT BOX TO READ: ON BADAB 2N, EXPECT CLEARANCE FROM\\nLEGTA TO SUNOS. ON PESUR 3N, EXPECT CLEARANCE DCT TOBAX. SEE AD 2\\nENBR 6-3 FOR DETAILS.\\nREF AIP NORWAY AD 2 ENBR STAR 17, EFF 29 MAR 2018\\nCREATED: 25 Sep 2018 16:52:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBR\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"2018-09-25T16:52:00.000Z\",\n" +
                "    \"key\": \"A3571/18-ENBR\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"_id\": \"5c06b088ab233e8499ecdc38\",\n" +
                "    \"id\": \"SWEN0358\",\n" +
                "    \"entity\": \"\",\n" +
                "    \"status\": \"\",\n" +
                "    \"Qcode\": \"\",\n" +
                "    \"Area\": \"\",\n" +
                "    \"SubArea\": \"\",\n" +
                "    \"Condition\": \"\",\n" +
                "    \"Subject\": \"\",\n" +
                "    \"Modifier\": \"\",\n" +
                "    \"message\": \"\",\n" +
                "    \"startdate\": \"2012-04-16T16:00:00.000Z\",\n" +
                "    \"enddate\": \"2016-11-30T00:00:00.000Z\",\n" +
                "    \"all\": \"SWEN0358 ENBR 12041540 \\n(SNOWTAM 0358\\nA) ENBR\\nB) 12041540 C) 17\\nF) 6/6/2 G) 3/3/XX H) 5/5/5\\nN) A1 A2 A3 A4 A5 A6 B C D E F G J U W Y/6  ALL\\nREMAINING TWYS/2\\nR) APRON N GA AREA HELI APRON TECHNICAL APRON\\nTERMINAL APRON/6  ALL REMAINING APRONS/2\\nT) CONTAMINATION/100/100/100/PERCENT.\\nSLIPPERY PORTIONS ON TAXIWAYS. SLIPPERY PORTIONS\\nON APRONS. SLIPPERY RUNWAY EXITS.)\\nCREATED: 04 Dec 2018 15:49:00 \\nSOURCE: EUECYIYN\",\n" +
                "    \"location\": \"ENBR\",\n" +
                "    \"isICAO\": true,\n" +
                "    \"Created\": \"\",\n" +
                "    \"key\": \"SWEN0358-ENBR\",\n" +
                "    \"type\": \"airport\",\n" +
                "    \"StateCode\": \"NOR\",\n" +
                "    \"StateName\": \"Norway\"\n" +
                "  }\n" +
                "]";


    }


