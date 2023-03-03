package qp.scs.constant;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Codes {

	public static interface Functions {
		public static final String USER_CURRENT = "USER_CURRENT";
		public static final String DASHBOARD_VIEW = "DASHBOARD_VIEW";
		public static final String TEMPLATE_EDIT = "TEMPLATE_EDIT";
		public static final String FAQ_EDIT = "FAQ_EDIT";
		public static final String BIDDING_GUIDE_EDIT = "BIDDING_GUIDE_EDIT";
	}

	public static interface JwtClaims {
		public static final String LOGIN_ID = "LOGIN_ID";
		public static final String UEN = "UEN";
		public static final String NAME = "NAME";
		public static final String ROLE_CODE = "ROLE_CODE";
		public static final String LAST_LOGIN_DATE = "LAST_LOGIN_DATE";
		public static final String ITO = "ITO";
		public static final String AUTHORITIES = "AUTHORITIES";
		public static final String SESSION_ID = "SESSION_ID";
	}

	public static interface AuthenticationResponse {
		public static final String AUTHENTICATED = "AUTHENTICATED";
		public static final String INTERFACE_ERROR = "INTERFACE_ERROR";
		public static final String CONFIG_ERROR = "CONFIG_ERROR";
		public static final String USER_NO_ACCESS = "USER_NO_ACCESS";
		public static final String USER_NOT_FOUND = "USER_NOT_FOUND";
	}

	public static interface Headers {
		public static final String X_AUTH_TOKEN = "X-Auth-Token";
		public static final String AUTH_TOKEN = "App-Authorization";
		public static final String APEX_AUTH = "Authorization";
	}

	public static interface Environments {
		public static final String DEV = "DEV";
		public static final String SIT = "SIT";
		public static final String UAT = "UAT";
		public static final String PROD = "PROD";
	}

	public static interface AwsEndpoint {
		public static final String UAT = "vpce-03ba478ce6961b4c4-a20qxjy9.secretsmanager.ap-southeast-1.vpce.amazonaws.com";
		public static final String PROD = "vpce-02381b8be5d017332-8o3wx4ud.secretsmanager.ap-southeast-1.vpce.amazonaws.com";
	}

	public static interface SmManager {
		public static final String REGION = "ap-southeast-1";
		public static final String VERSION = "AWSCURRENT";
		public static final String UAT_ENETS = "uat/common/enets";
		public static final String UAT_SPCP = "uat/public/webservice/iamspcp";
		public static final String UAT_TENDERSUB = "uat/common/tender-submission";
		public static final String UAT_SLIFT = "uat/admin/batch/slift";
		public static final String UAT_MYINFO = "uat/public/webservice/myinfo";
		public static final String UAT_EDH = "uat/common/edh";

		public static final String PROD_ENETS = "prod/common/enets";
		public static final String PROD_SPCP = "prod/public/webservice/iamspcp";
		public static final String PROD_TENDERSUB = "prod/common/tender-submission";
		public static final String PROD_SLIFT = "prod/admin/batch/slift";
		public static final String PROD_MYINFO = "prod/public/webservice/myinfo";
		public static final String PROD_EDH = "prod/common/edh";
	}

	public static interface IssiStatus {
		public static final String APPROVE = "APPROVED";
		public static final String REJECT = "REJECTED";
	}

	public static interface Edh {
		public static final String API_ENTITY = "/entity";
		public static final String APPOINTMENT_INVALID = " - Withdrawn/Invalid/Disqualified/Death";
	}

	public static interface SmTypes {
		public static final String ENETS = "enets";
		public static final String SPCP = "spcp";
		public static final String TENDER_SUBMISSION = "tender-submission";
		public static final String SLIFT = "slift";
		public static final String EDH = "edh";
		public static final String MYINFO = "myinfo";
	}

	public static interface Apex {
		public static final String INTERNET_L2 = "Apex_L2_Eg";
	}

	public static interface Flags {
		public static final String YES = "Y";
		public static final String NO = "N";
		public static final String REINSTATED = "R";
		public static final String TRUE = "true";
		public static final String FALSE = "false";
	}

	public static interface Placeholders {
		public static final String CURRENT_DATE = "${current_date}";
		public static final String PUBLIC_PORTAL = "${public_portal_url}";
		public static final String ADMIN_PORTAL = "${admin_portal_url}";
		public static final String PENDING_TASK = "${pending_task}";
		public static final String REJECT_MESSAGE = "${reject_message}";

		public static final String TENDER_UNIT_ADDRESS = "${tender_unit_address}";
		public static final String TENDER_UNIT_BID_CLOSING_DATE = "${tender_unit_bid_closing_date}";
		public static final String TENDER_UNIT_BID_OPENING_DATE = "${tender_unit_bid_opening_date}";
		public static final String TENDER_UNIT_TOWN = "${tender_unit_town}";
		public static final String TENDER_UNIT_USAGE = "${tender_unit_usage}";
		public static final String TENDER_UNIT_TRADES = "${tender_unit_trades}";
		public static final String TENDERER_NAME = "${tenderer_name}";
		public static final String USER_ALERT_NAME = "${user_alert_name}";
		public static final String USER_NAME = "${user_name}";
		public static final String UNIT_ADDRESS = "${unit_address}";
		public static final String BIll_REF = "${bill_ref}";
		public static final String SUBMISSION_DATE = "${submission_date}";
		public static final String DEPOSIT_PAID = "${deposit_paid}";
		public static final String TOTAL_DEPOSIT_PAID = "${total_deposit_paid}";
		public static final String BID_AMOUNT = "${bid_amount}";
		public static final String NRIC = "${nric}";
		public static final String COMPANY_NAME = "${company_name}";
		public static final String BLOCK = "${block}";
		public static final String STREET = "${street}";
		public static final String POSTAL_CODE = "${postal_code}";
		public static final String BUILDING_NAME = "${building_name}";
		public static final String LEVEL_NO = "${level_no}";
		public static final String UNIT_NO = "${unit_no}";
		public static final String TEL_NO = "${tel_no}";
		public static final String MOBILE_NO = "${mobile_no}";
		public static final String EMAIL = "${email}";
		public static final String PROPOSED_TRADE = "${proposed_trade}";
		public static final String PROPOSAL_DESC = "${proposal_desc}";
		public static final String BIDDER_NO = "${bidder_no}";
		public static final String HIGHEST_BID_AMOUNT = "${highest_bid_amount}";
		public static final String TENDER_UNIT_URL = "${tender_unit_url}";
		public static final String CONTACT_NAME = "${contact_name}";
		public static final String TRADE = "${trade}";
		public static final String LOCATION = "${location}";
		public static final String FLOOR_AREA = "${floor_area}";
		public static final String MIN_FLOOR_AREA = "${min_floor_area}";
		public static final String MAX_FLOOR_AREA = "${max_floor_area}";
		public static final String USAGE = "${usage}";
		public static final String SECURITY_REVIEW_TYPE = "${security_review_type}";
		public static final String SECURITY_REVIEW_PERIOD = "${security_review_period}";
		public static final String PAYMENT_AMOUNT = "${payment_amount}";
		public static final String PAYMENT_DEADLINE = "${payment_deadline}";
		public static final String TECH_SUPPORT = "${tech_support}";
		public static final String EXERCISE_NUMBER = "${exercise_number}";
		public static final String TRANSACTION_REFERENCE_NUMBER = "${transaction_reference_number}";
		public static final String AC28_PAYLOAD = "${ac28_payload}";
		public static final String REFUND_OFFICER = "${refund_officer}";
		public static final String AMOUNT = "${amount}";
		public static final String HIGHEST_TENDERER_TRANSACTION_REFERENCE_NUMBER = "${highest_tenderer_transaction_reference_number}";
		public static final String LOWER_TENDERER_TRANSACTION_REFERENCE_NUMBER = "${lower_tenderer_transaction_reference_number}";
		public static final String ENETS_CAPTURE = "${enets_capture}";
		public static final String ENETS_RAUTH = "${enets_rauth}";
	}

	public static interface EMAIL_TEMPLATES {
		public static final String NOTIFY_SUBSCRIBER_TENDER_OPEN = "NOTIFY_SUBSCRIBER_TENDER_OPEN";
		public static final String NOTIFY_SUBSCRIBER_TENDER_CLOSED = "NOTIFY_SUBSCRIBER_TENDER_CLOSED";
		public static final String NOTIFY_TENDERER_FINAL_RESULT = "NOTIFY_TENDERER_FINAL_RESULT";
		public static final String NOTIFY_TENDERER_PROVISION_RESULT = "NOTIFY_TENDERER_PROVISION_RESULT";
		public static final String NOTIFY_OFFICER_IEMS_UNIT_UPDATE = "NOTIFY_OFFICER_IEMS_UNIT_UPDATE";
		public static final String NOTIFY_OFFICER_ON_FINAL_RESULT_FIRST_REMINDER = "NOTIFY_OFFICER_ON_FINAL_RESULT_FIRST_REMINDER";
		public static final String NOTIFY_OFFICER_ON_FINAL_RESULT_SECOND_REMINDER = "NOTIFY_OFFICER_ON_FINAL_RESULT_SECOND_REMINDER";
		public static final String NOTIFY_OFFICER_ON_SECURITY_REVIEW_GENERATION = "NOTIFY_OFFICER_ON_SECURITY_REVIEW_GENERATION";
		public static final String NOTIFY_TENDERER_ON_WITHDRAWAL = "NOTIFY_TENDERER_ON_WITHDRAWAL";
		public static final String NOTIFY_TENDERER_ON_CREATE_CLARIFICATION = "NOTIFY_TENDERER_ON_CREATE_CLARIFICATION";
		public static final String NOTIFY_TENDERER_ON_EDIT_CLARIFICATION = "NOTIFY_TENDERER_ON_EDIT_CLARIFICATION";
		public static final String NOTIFY_TENDERER_ON_DELETE_CLARIFICATION = "NOTIFY_TENDERER_ON_DELETE_CLARIFICATION";
		public static final String NOTIFY_TENDERER_ON_FORFEIT_DEPOSIT = "NOTIFY_TENDERER_ON_FORFEIT_DEPOSIT";
		public static final String NOTIFY_TENDERER_ON_FORFEITURE_DETAILS_UPDATE = "NOTIFY_TENDERER_ON_FORFEITURE_DETAILS_UPDATE";
		public static final String NOTIFY_TENDERER_ON_BID_SUBMITTED = "NOTIFY_TENDERER_ON_BID_SUBMITTED";
		public static final String NOTIFY_TENDERER_ON_OUT_BID = "NOTIFY_TENDERER_ON_OUT_BID";
		public static final String NOTIFY_TEC_FOR_SCORING = "NOTIFY_TEC_FOR_SCORING";
		public static final String NOTIFY_TENDERER_ON_PQM_TENDER_SUBMITTED = "NOTIFY_TENDERER_ON_PQM_TENDER_SUBMITTED";
		public static final String NOTIFY_TENDERER_ON_REQUEST_FOR_PAYMENT = "NOTIFY_TENDERER_ON_REQUEST_FOR_PAYMENT";
		public static final String NOTIFY_TENDERER_ON_CORRIGENDUM = "NOTIFY_TENDERER_ON_CORRIGENDUM";
		public static final String NOTIFY_WATCHLIST_ON_CORRIGENDUM = "NOTIFY_WATCHLIST_ON_CORRIGENDUM";
		public static final String NOTIFY_TENDERER_ON_TENDER_APPROVED = "NOTIFY_TENDERER_ON_TENDER_APPROVED";
		public static final String NOTIFY_CONTACT_ON_ALERT_SUBSCRIPTION = "NOTIFY_CONTACT_ON_ALERT_SUBSCRIPTION";
		public static final String NOTIFY_ACCOUNT_HOLDER_ON_ALERT_DELETION = "NOTIFY_ACCOUNT_HOLDER_ON_ALERT_DELETION";
		public static final String NOTIFY_OFFICER_ON_PENDING_TASKS = "NOTIFY_OFFICER_ON_PENDING_TASKS";
		public static final String NOTIFY_OFFICER_ON_NEW_ASSIGN_TASK = "NOTIFY_OFFICER_ON_NEW_ASSIGN_TASK";
		public static final String NOTIFY_TENDERER_ON_CLARIFICATION_REQUEST_FIRST_REMINDER = "NOTIFY_OFFICER_ON_CLARIFICATION_REQUEST_FIRST_REMINDER";
		public static final String NOTIFY_TENDERER_ON_CLARIFICATION_REQUEST_SECOND_REMINDER = "NOTIFY_OFFICER_ON_CLARIFICATION_REQUEST_SECOND_REMINDER";
		public static final String NOTIFY_TENDERER_ON_CLARIFICATION_REQUEST_FINAL_REMINDER = "NOTIFY_OFFICER_ON_CLARIFICATION_REQUEST_FINAL_REMINDER";
		public static final String NOTIFY_ADMIN_EXECUTIVE_ON_REJECT_MESSAGE = "NOTIFY_ADMIN_EXECUTIVE_ON_REJECT_MESSAGE";
		public static final String NOTIFY_TENDERER_ON_ACCOUNT_UPDATE = "NOTIFY_TENDERER_ON_ACCOUNT_UPDATE";
		public static final String NOTIFY_OFFICER_ON_TEC_SCORING_COMPLETION = "NOTIFY_OFFICER_ON_TEC_SCORING_COMPLETION";
		public static final String NOTIFY_SUPPORT_ON_eNETS_ERROR = "NOTIFY_SUPPORT_ON_eNETS_ERROR";
		public static final String NOTIFY_REFUND_OFFICER_ON_DUPLICATE_TRANSACTION = "NOTIFY_REFUND_OFFICER_ON_DUPLICATE_TRANSACTIONS";
		public static final String NOTIFY_REFUND_OFFICER_ON_DUPLICATE_AND_LATE_TRANSACTION = "NOTIFY_REFUND_OFFICER_ON_DUPLICATE_AND_LATE_TRANSACTIONS";
		public static final String NOTIFY_TENDERER_ON_DUPLICATE_TRANSACTION = "NOTIFY_TENDERER_ON_DUPLICATE_TRANSACTIONS";
		public static final String NOTIFY_TENDERER_ON_DUPLICATE_AND_LATE_TRANSACTION = "NOTIFY_TENDERER_ON_DUPLICATE_AND_LATE_TRANSACTIONS";
		public static final String NOTIFY_TENDERER_ON_LATE_TRANSACTION = "NOTIFY_TENDERER_ON_LATE_TRANSACTIONS";
		public static final String NOTIFY_REFUND_OFFICER_ON_LATE_TRANSACTION = "NOTIFY_REFUND_OFFICER_ON_LATE_TRANSACTIONS";

		public static final String NOTIFY_OFFICER_ON_UNIT_CORRIGENDUM = "NOTIFY_OFFICER_ON_UNIT_CORRIGENDUM";
		public static final String TNC_NOTIFICATION_ON_OUTBID = "TNC_NOTIFICATION_ON_OUTBID";
		public static final String NOTIFY_OFFICER_ON_CLARIFICATION_REPLY = "NOTIFY_OFFICER_ON_CLARIFICATION_REPLY";

		public static final String NOTIFY_OFFICER_IEMS_PREUNIT_UPDATE = "NOTIFY_OFFICER_IEMS_PREUNIT_UPDATE";
		public static final String NOTIFY_OFFICER_IEMS_BIDDING_UNIT_UPDATE = "NOTIFY_OFFICER_IEMS_BIDDING_UNIT_UPDATE";

		public static final String NOTIFY_TENDERER_PROVISION_RESULT_WINNER = "NOTIFY_TENDERER_PROVISION_RESULT_WINNER";

		public static final String NOTIFY_TENDERER_OFFLINE_PAYMENT_REMINDER = "NOTIFY_TENDERER_OFFLINE_PAYMENT_REMINDER";

	}

	public static interface SMS_TEMPLATES {
		public static final String NOTIFY_SUBSCRIBER_TENDER_OPEN = "NOTIFY_SUBSCRIBER_TENDER_OPEN";
		public static final String NOTIFY_SUBSCRIBER_TENDER_CLOSED = "NOTIFY_SUBSCRIBER_TENDER_CLOSED";
		public static final String NOTIFY_TENDERER_PROVISION_RESULT = "NOTIFY_TENDERER_PROVISION_RESULT";
		public static final String NOTIFY_TENDERER_ON_OUT_BID = "NOTIFY_TENDERER_ON_OUT_BID";
		public static final String NOTIFY_TENDERER_ON_TENDER_APPROVED = "NOTIFY_TENDERER_ON_TENDER_APPROVED";
		public static final String NOTIFY_TENDERER_ON_CLARIFICATION_REQUEST_FIRST_REMINDER = "NOTIFY_OFFICER_ON_CLARIFICATION_REQUEST_FIRST_REMINDER";
		public static final String NOTIFY_TENDERER_ON_CLARIFICATION_REQUEST_SECOND_REMINDER = "NOTIFY_OFFICER_ON_CLARIFICATION_REQUEST_SECOND_REMINDER";
		public static final String NOTIFY_TENDERER_ON_CLARIFICATION_REQUEST_FINAL_REMINDER = "NOTIFY_OFFICER_ON_CLARIFICATION_REQUEST_FINAL_REMINDER";

		public static final String NOTIFY_SUBSCRIBER_ON_ALERT_ME_SUBSCRIPTION = "NOTIFY_SUBSCRIBER_ON_ALERT_ME_SUBSCRIPTION";
		public static final String NOTIFY_TENDERER_ON_UNIT_CORRIGENDUM = "NOTIFY_TENDERER_ON_UNIT_CORRIGENDUM";

		public static final String NOTIFY_TENDERER_ON_SUCCESSFUL_RESULT = "NOTIFY_TENDERER_ON_SUCCESSFUL_RESULT"; // 7
		public static final String NOTIFY_TENDERER_ON_FINAL_RESULT = "NOTIFY_TENDERER_ON_FINAL_RESULT"; // 8
		public static final String NOTIFY_TENDERER_ON_UNIT_WITHDRAWAL_SUSPENSION = "NOTIFY_TENDERER_ON_UNIT_WITHDRAWAL_SUSPENSION"; // 9

	}

	public static interface SystemParameters {
		public static final String TO_CLEAR_CACHE_DATE = "TO_CLEAR_CACHE_DATE";
		public static final String MAX_FILE_SIZE = "MAX_FILE_SIZE";
		public static final String VALID_FILE_EXTS_INTERNAL = "VALID_FILE_EXTS_INTERNAL";
		public static final String VALID_MEDIA_FILE_EXTS = "VALID_MEDIA_FILE_EXTS";
		public static final String QUICK_BID_EXTEND = "QUICK_BID_EXTENSION_DAY";
		public static final String GGG_EXTEND = "GGG_EXTEND_MINS";
		public static final String FINAL_RESULT_VIEWABLE_PERIOD = "FINAL_RESULT_VIEWABLE_MONTHS";
		public static final String ISSI_CASE_RUNNING_NO = "ISSI_CASE_RUNNING_NO";
		public static final String TENDER_UNIT_VIEWABLE_AFTER_FINAL_RESULT_DAYS = "TENDER_UNIT_VIEWABLE_AFTER_FINAL_RESULT_DAYS";
		public static final String MY_TENDER_LIST_VIEWABLE_MONTHS = "MY_TENDER_LIST_VIEWABLE_MONTHS";
		public static final String CLARIFICATION_REQUEST_FIRST_REMINDER = "CLARIFICATION_REQUEST_FIRST_REMINDER";
		public static final String CLARIFICATION_REQUEST_SECOND_REMINDER = "CLARIFICATION_REQUEST_SECOND_REMINDER";
		public static final String SECURITY_LOG_JOB_MONTHS = "SECURITY_LOG_JOB_MONTHS";
		public static final String WORKFLOW_LOG_JOB_YEARS = "WORKFLOW_LOG_JOB_YEARS";
		public static final String RECOMMENDATION_ROUTE_THRESHOLD = "RECOMMENDATION_ROUTE_THRESHOLD";
		public static final String VALID_FILE_EXTS_PUBLIC = "VALID_FILE_EXTS_PUBLIC";
		public static final String SUPPORT_EMAIL = "SUPPORT_EMAIL";
		public static final String PLG_OFFICER_RECEIPENT_EMAIL = "PLG_OFFICER_RECEIPENT_EMAIL";
		public static final String AC28_OFFICER_RECEIPENT_EMAIL = "AC28_OFFICER_RECEIPENT_EMAIL";
		public static final String ACTIVE_IEMS = "ACTIVE_IEMS";
		public static final String PQM_ALLOW_OFFLINE_PAYMENT = "PQM_ALLOW_OFFLINE_PAYMENT";
		public static final String PQM_OFFLINE_PAYMENT_REMINDERS = "PQM_OFFLINE_PAYMENT_REMINDERS";

	}

	public static interface Trades {
		public static final String OPEN = "OPEN";
		public static final String OPEN_GROUP = "Open Trade";
		public static final String SPECIFIC_GROUP = "Specific Trade";
		public static final String P2L_PREFIX = "P2L_TRADE_";
	}

	public static interface MediaTypes {
		public static final String TEMP = "MEDIA_TEMP";
		public static final String MEDIA_360 = "MEDIA_360";
		public static final String FLOOR_PLAN = "MEDIA_FLOOR_PLAN";
		public static final String IMAGE = "MEDIA_IMAGE";
		public static final String VIDEO = "MEDIA_VIDEO";
		public static final String OTHER = "MEDIA_O";
	}

	public static interface ColourCodes {
		public static final String DANGER = "danger";
		public static final String SECONDARY = "secondary";
		public static final String SUCCESS = "success";
		public static final String INFO = "info";
	}

	public static interface User {
		public static final String TEST = "TEST";
		public static final String SYSTEM = "SYSTEM";
		public static final String MIGRATION = "MIGRATION";
		public static final String ANONYMOUS = "ANONYMOUS";
	}

	public static interface StatusCategories {
		public static final String EMAIL_STATUS = "STAT_EMAIL";
		public static final String JOB_STATUS = "STAT_JOB";
		public static final String PAYMENT_BILL_STATUS = "STAT_BILL";
		public static final String PAYMENT_TXN_STATUS = "STAT_TXN";
		public static final String SMS_STATUS = "STAT_SMS";
		public static final String REFUND_STATUS = "STAT_RFND";
		public static final String RECOMMENDATION_STATUS = "STAT_REC";
		public static final String TENDER_STAGE = "STAT_TNDR";
		public static final String BIDDING_STATUS = "STAT_BID";
		public static final String EVALUATION_STATUS = "STAT_EVAL";
		public static final String PQM_SCORING_STATUS = "STAT_PQM";
		public static final String IEMS_STATUS = "STAT_IEMS";
		public static final String USER_STATUS = "STAT_USER";
		public static final String WORKFLOW_STATUS = "STAT_WKFW";
		public static final String LOGIN_STATUS = "STAT_LOGIN";
	}

	public static interface TypeCategories {
		public static final String STATUS_CATEGORIES = "STAT";
		public static final String SCORE_PUBLISHING_TYPES = "PUB_SCORE";
		public static final String RESULT_PUBLISHING_TYPES = "PUB_RESULT";
		public static final String RENT_PUBLISHING_TYPES = "PUB_RENT";
		public static final String TENDER_TYPES = "TNDR";
		public static final String POWER_PHASES = "ELEC";
		public static final String USAGE_TYPES = "USG";
		public static final String PROPERTY_TYPES = "PTY";
		public static final String PAYMENT_BILL_TYPES = "BILL";
		public static final String PAYMENT_MODES = "PAY";
		public static final String PQM_SCORING_TYPE = "PQM";
		public static final String TERMS_OF_USE_TYPES = "TOU";
		public static final String DATA_TYPES = "DATA";
		public static final String RENTAL_SCHEMES = "RENT";
		public static final String DEPOSIT_CALCULATION_TYPES = "DPST";
		public static final String WITHDRAWAL_TYPES = "WTHD";
		public static final String USER_TYPES = "USER";
		public static final String REPORT_TYPES = "RPT";
		public static final String REPORT_TYPES_TO_REVIEW = "RPT_REVIEW";
		public static final String WORKFLOW_ACTION_TYPES = "WKFW";
		public static final String ANNOUNCEMENT_TYPES = "ANNC";
		public static final String HDB_TOWNS = "TOWN";
		public static final String MEDIA = "MEDIA";
		public static final String SWIFT_CODES = "SWIFT_CODES";
		public static final String LOGIN = "LOGIN";
		public static final String MARITAL_STATUS = "MARITAL_STATUS";
		public static final String GENDER = "GENDER";
		public static final String STAT_IEMS = "STAT_IEMS";
		public static final String EVALUATION_DOC_TYPE = "EVALUATION_DOC_TYPE";
		public static final String GEBIZ_DEBARMENT_OPTIONS = "GEBIZ_DEBARMENT_OPTIONS";
	}

	public static interface UserStatuses {
		public static final String ACTIVE = "USER_ACTIVE";
		public static final String INACTIVE = "USER_INACTIVE";
		public static final String LOCKED = "USER_LOCKED";
		public static final String SUSPENDED = "USER_SUSPENDED";
	}

	public static interface UserTypes {
		public static final String HDB = "USER_HDB";
		public static final String CORPPASS = "USER_CP";
		public static final String SINGPASS = "USER_SP";
	}

	public static interface LoginStatuses {
		public static final String FAILED = "LOGIN_FAILED";
		public static final String SUCCESSFUL = "LOGIN_SUCCESSFUL";
	}

	public static interface LoginTypes {
		public static final String SP = "LOGIN_SP";
		public static final String CP = "LOGIN_CP";
		public static final String AD = "LOGIN_AD";
		public static final String TEST = "LOGIN_TEST";
		public static final String SWITCH_ROLE = "LOGIN_SWITCH_ROLE";
	}

	public static interface SmsStatuses {
		public static final String SENT = "SMS_SENT";
		public static final String FAILED = "SMS_FAILED";
	}

	public static interface EmailStatuses {
		public static final String EMAIL_PENDING = "EMAIL_PENDING";
		public static final String EMAIL_SENT = "EMAIL_SENT";
		public static final String EMAIL_RECEIVED = "EMAIL_RECEIVED";
		public static final String EMAIL_BOUNCED = "EMAIL_BOUNCED";
		public static final String EMAIL_FAILED = "EMAIL_FAILED";
	}

	public static interface JobStatuses {
		public static final String JOB_PROCESSING = "JOB_PROCESSING";
		public static final String JOB_ERROR = "JOB_ERROR";
		public static final String JOB_SUCCESS = "JOB_SUCCESSFUL";
		public static final String JOB_WARNING = "JOB_WARNING";
		public static final String JOB_FAILED = "JOB_FAILED";
	}

	public static interface BiddingStatuses {
		public static final String BID_NOT_OPENED = "BID_NOT_OPENED";
		public static final String BID_OPENED = "BID_OPENED";
		public static final String BID_CLOSED = "BID_CLOSED";
		public static final String BID_SUSPENDED = "BID_SUSPENDED";
		public static final String BID_WITHDRAWN = "BID_WITHDRAWN";
	}

	public static interface BillStatuses {
		public static final String NOT_PAID = "BILL_NOT_PAID";
		public static final String PAID = "BILL_PAID";
		public static final String VOIDED = "BILL_VOIDED";
	}

	public static interface IemsStatuses {
		public static final String LETTABLE = "IEMS_LETTABLE";
		/**
		 * TODO Check IEMS status on lettable, tender in progress, awarded
		 **/
		/**
		 * Check CPS status on IEMS status - To change mode of allocation
		 */
		public static final String LETTABLE_IEMS = "Unit suitable for let out";
		public static final String TENDER_IN_PROGRESS = "IEMS_TENDER_IN_PROGRESS";
		public static final String TENDER_IN_PROGRESS_IEMS = "In Progress";
		public static final String TENDER_AWARDED = "IEMS_TENDER_AWARDED";
		public static final String TENDER_AWARDED_IEMS = "Award";
		public static final String CHANGE_ALLOCATION_IEMS = "To change mode of allocation";
		public static final String RELEASE_UNIT_IEMS = "Return";
		public static final String RESPONSE_SUCCESS = "S";
		public static final String RESPONSE_FAILURE = "E";
	}

	public static interface StageStatuses {
		public static final String PENDING_POSTING = "TNDR_PENDING_POSTING";
		public static final String PENDING_BID_OPENING = "TNDR_PENDING_BID_OPENING";
		public static final String PENDING_BID_CLOSING = "TNDR_PENDING_BID_CLOSING";
		public static final String PENDING_WITHDRAWAL = "TNDR_PENDING_WITHDRAWAL";
		public static final String PENDING_CORRIGENDUM = "TNDR_PENDING_CORRIGENDUM";
		public static final String PENDING_EVALUATION = "TNDR_PENDING_EVALUATION";
		public static final String PENDING_PQM_SCORING = "TNDR_PENDING_PQM_SCORING";
		public static final String PENDING_RECOMMENDATION = "TNDR_PENDING_RECOMMENDATION";
		public static final String PENDING_PUBLISH = "TNDR_PENDING_PUBLISH";
		public static final String PENDING_REFUND = "TNDR_PENDING_REFUND";
		public static final String CLOSED = "TNDR_CLOSED";
	}

	public static interface EvaluationStatuses {
		public static final String EVAL_COMPLETED = "EVAL_COMPLETED";
		public static final String EVAL_NOT_COMPLETED = "EVAL_NOT_COMPLETED";
	}

	public static interface RecommendationStatuses {
		public static final String REC_AWARD = "REC_AWARD";
		public static final String REC_REJECT = "REC_REJECT";
		public static final String REC_REJECT_FORFEIT = "REC_REJECT_FORFEIT";
		public static final String REC_DISQUALIFIED = "REC_DISQUALIFIED";
	}

	public static interface RefundStatuses {
		public static final String RFND_PENDING_ETLSVS_VOUCHER_CREATION = "RFND_PENDING_ETLSVS_VOUCHER_CREATION";
		public static final String RFND_PENDING_ETLSVS_CONFIRMATION = "RFND_PENDING_ETLSVS_CONFIRMATION";
		public static final String RFND_REFUNDED = "RFND_REFUNDED";
		public static final String RFND_REFUND_REJECTED = "RFND_REFUND_REJECTED";
	}

	public static interface PqmScoringStatuses {
		public static final String PQM_COMPLETED = "PQM_COMPLETED";
		public static final String PQM_TEC_NOT_COMPLETED = "PQM_TEC_NOT_COMPLETED";
		public static final String PQM_TO_NOT_COMPLETED = "PQM_TO_NOT_COMPLETED";
	}

	public static interface TxnStatuses {
		public static final String PENDING = "TXN_PENDING";
		public static final String SUCCESSFUL = "TXN_SUCCESSFUL";
		public static final String FAILED = "TXN_FAILED";
		public static final String TIMED_OUT = "TXN_TIMED_OUT";
		public static final String CANCELLED = "TXN_CANCELLED";
	}

	public static interface WorkflowTypes {
		public static final String EXERCISE_NEW = "EXERCISE_NEW";
		public static final String EXERCISE_AMENDMENT = "EXERCISE_AMENDMENT";
		public static final String POST_NEW = "POST_NEW";
		public static final String POST_AMENDMENT = "POST_AMENDMENT";
		public static final String WITHDRAWAL = "WITHDRAWAL";
		public static final String CORRIGENDUM = "CORRIGENDUM";
		public static final String RECOMMENDATION_A1 = "RECOMMENDATION_A1";
		public static final String RECOMMENDATION_A2 = "RECOMMENDATION_A2";
		public static final String REFUND = "REFUND";
		public static final String SECURITY_REVIEW = "SECURITY_REVIEW";
	}

	public static interface WorkflowActionTypes {
		public static final String ROUTE_NEXT = "WKFW_ROUTE";
		public static final String RETURN_BACK = "WKFW_RETURN";
		public static final String REJECT = "WKFW_REJECT";
		public static final String APPROVE = "WKFW_APPROVE";
		public static final String SAVE_DRAFT = "WKFW_DRAFT";
	}

	public static interface PositionTypes {
		public static final String DIRECTOR = "POSITION_DIRECTOR";
		public static final String OWNER = "POSITION_OWNER";
		public static final String SHAREHOLDER = "POSITION_SHAREHOLDER";
		public static final String DIRECTOR_SHAREHOLDER = "POSITION_DIRECTOR_SHAREHOLDER";
	}

	public static interface WorkflowStatuses {
		public static final String DRAFT = "WKFW_DRAFT";
		public static final String APPROVED = "WKFW_APPROVED";
		public static final String PENDING_AE = "WKFW_PENDING_AE";
		public static final String PENDING_TO = "WKFW_PENDING_TO";
		public static final String PENDING_DD = "WKFW_PENDING_DD";
		public static final String PENDING_DIR = "WKFW_PENDING_DIR";
		public static final String PENDING_GD = "WKFW_PENDING_GD";
		public static final String PENDING_TB1 = "WKFW_PENDING_TB1";
		public static final String PENDING_TB2 = "WKFW_PENDING_TB2";
		public static final String PENDING_TB3 = "WKFW_PENDING_TB3";
		public static final String PENDING_SA = "WKFW_PENDING_SA";
		public static final String PENDING_SA_SUP = "WKFW_PENDING_SA_SUP";
		public static final String PENDING_TA = "WKFW_PENDING_TA";
		public static final String PENDING_ISSI = "WKFW_PENDING_ISSI";
		public static final String REJECTED = "WKFW_REJECTED";
	}

	public static interface Roles {
		public static final String ADMIN_EXECUTIVE = "AE";
		public static final String TENDER_OFFICER = "TO";
		public static final String DEPUTY_DIRECTOR = "DD";
		public static final String DIRECTOR = "DIR";
		public static final String GROUP_DIRECTOR = "GD";
		public static final String TENDER_BOARD_1 = "TB1";
		public static final String TENDER_BOARD_2 = "TB2";
		public static final String TENDER_BOARD_3 = "TB3";
		public static final String SYSTEM_ADMIN = "SA";
		public static final String SYSTEM_ADMIN_SUPERVISOR = "SA_SUP";
		public static final String TENDER_ADMIN = "TA";
		public static final String TEC = "TEC";
		public static final String SINGPASS = "SP";
		public static final String CORPPASS = "CP";
	}

	public static interface LastTenderResultStatuses {
		public static final String AWARDED = "AWARDED";
		public static final String NOT_AWARDED = "NOT_AWARDED";
	}

	public static interface DocumentTypes {
		public static final String PUBLIC_GUIDE = "DOC_PUBLIC_GUIDE";
		public static final String TEMPLATE = "DOC_TEMPLATE";
		public static final String EXERCISE_PLAN = "DOC_EXERCISE_PLAN";
		public static final String EXERCISE_TENDER_DOC = "DOC_EXERCISE_TENDER_DOC";
		public static final String WORKFLOW_ACTION = "DOC_WORKFLOW_ACTION";
		public static final String PUBLIC_FAQ = "DOC_PUBLIC_FAQ";
		public static final String TENDERER_FORFEITURE_LETTER = "DOC_TENDERER_FORFEITURE_LETTER";
		public static final String TENDERER_FORFEITURE = "DOC_TENDERER_FORFEITURE";
		public static final String TENDERER_BID_MANDATORY = "DOC_TENDERER_BID_MANDATORY";
		public static final String TENDERER_BID_OTHER = "DOC_TENDERER_BID_OTHER";
		public static final String TENDERER_BID_SUBMISSION = "DOC_TENDERER_BID_SUBMISSION";
		public static final String TENDERER_CLARIFICATION_QN = "DOC_TENDERER_CLARIFICATION_QN";
		public static final String TENDERER_CO_GEBIZ = "DOC_TENDERER_CO_GEBIZ";
		public static final String TENDERER_CO_SHAREHOLDER_GEBIZ = "DOC_TENDERER_CO_SHAREHOLDER_GEBIZ";
		public static final String TENDER_UNIT_POST_MEDIA = "DOC_TENDER_UNIT_POST_MEDIA";
		public static final String TENDER_UNIT_POST = "DOC_TENDER_UNIT_POST";
		public static final String TENDER_UNIT_POST_CORRI_INTERNAL = "DOC_TENDER_UNIT_POST_CORRI_INTERNAL";
		public static final String TENDER_UNIT_POST_CORRI_PUBLIC = "DOC_TENDER_UNIT_POST_CORRI_PUBLIC";
		public static final String ANNOUNCEMENT_ATTACHMENT = "DOC_ANNOUNCEMENT_ATTACHMENT";
		public static final String ANNOUNCEMENT_BANNER_IMG = "DOC_ANNOUNCEMENT_BANNER";
		public static final String RPT_REVIEW_SECURITY = "DOC_RPT_REVIEW_SECURITY";
		public static final String RPT_REVIEW_WORKFLOW = "DOC_RPT_REVIEW_WORKFLOW";
		public static final String EVALUATION_TEMP = "DOC_EVALUATION_TEMP";
		public static final String DOC_TEMP = "DOC_TEMP";
		public static final String MEDIA_TEMP = "MEDIA_TEMP";
		public static final String MEDIA_VIDEO = "MEDIA_VIDEO";

		// public zone to only allow file upload of these document types, vice versa for admin zone
		public static final List<String> PUBLIC_TYPES = Arrays.asList(DocumentTypes.PUBLIC_GUIDE, DocumentTypes.TEMPLATE, DocumentTypes.EXERCISE_PLAN, DocumentTypes.EXERCISE_TENDER_DOC,
				DocumentTypes.PUBLIC_FAQ, DocumentTypes.TENDERER_FORFEITURE_LETTER, DocumentTypes.TENDERER_FORFEITURE, DocumentTypes.TENDERER_BID_MANDATORY, DocumentTypes.TENDERER_BID_OTHER,
				DocumentTypes.TENDERER_BID_SUBMISSION, DocumentTypes.TENDERER_CLARIFICATION_QN, DocumentTypes.TENDERER_CO_GEBIZ, DocumentTypes.TENDERER_CO_SHAREHOLDER_GEBIZ,
				DocumentTypes.TENDER_UNIT_POST_MEDIA, DocumentTypes.TENDER_UNIT_POST, DocumentTypes.TENDER_UNIT_POST_CORRI_INTERNAL, DocumentTypes.TENDER_UNIT_POST_CORRI_PUBLIC,
				DocumentTypes.ANNOUNCEMENT_ATTACHMENT, DocumentTypes.ANNOUNCEMENT_BANNER_IMG, DocumentTypes.RPT_REVIEW_SECURITY, DocumentTypes.RPT_REVIEW_WORKFLOW, DocumentTypes.EVALUATION_TEMP,
				DocumentTypes.DOC_TEMP, DocumentTypes.MEDIA_TEMP, DocumentTypes.MEDIA_VIDEO, DocumentTypes.WORKFLOW_ACTION);

		// file upload of these document types are standalone and don't need to tie to any parent to work
		public static final List<String> PARENTLESS_TYPES = Arrays.asList(DocumentTypes.TEMPLATE, DocumentTypes.PUBLIC_GUIDE, DocumentTypes.PUBLIC_FAQ);

		// file upload of these document types will have their file physically created in both public and admin zones
		public static final List<String> CROSS_ZONE_TYPES = Arrays.asList(DocumentTypes.PUBLIC_GUIDE, DocumentTypes.EXERCISE_TENDER_DOC, DocumentTypes.PUBLIC_FAQ, DocumentTypes.TENDERER_BID_MANDATORY,
				DocumentTypes.TENDERER_BID_OTHER, DocumentTypes.TENDERER_BID_SUBMISSION, DocumentTypes.TENDERER_CLARIFICATION_QN, DocumentTypes.TENDER_UNIT_POST_MEDIA, DocumentTypes.TENDER_UNIT_POST,
				DocumentTypes.TENDER_UNIT_POST_CORRI_INTERNAL, DocumentTypes.TENDER_UNIT_POST_CORRI_PUBLIC, DocumentTypes.ANNOUNCEMENT_ATTACHMENT, MediaTypes.OTHER,
				DocumentTypes.TENDERER_CLARIFICATION_QN, DocumentTypes.DOC_TEMP);

		// file upload of these document types will be hosted in AWS S3 so that public website can embed/display their media content
		public static final List<String> PUBLIC_S3_TYPES = Arrays.asList(DocumentTypes.ANNOUNCEMENT_BANNER_IMG, MediaTypes.MEDIA_360, MediaTypes.IMAGE, MediaTypes.VIDEO, MediaTypes.FLOOR_PLAN);
	}

	public static interface BillTypes {
		public static final String DEPOSIT = "BILL_DEPOSIT";
		public static final String DEPOSIT_TOPUP = "BILL_DEPOSIT_TOPUP";
	}

	public static interface DepositTypes {
		public static final String BY_FLOOR_AREA = "DPST_BY_FLOOR_AREA";
		public static final String BY_FLAT_RATE = "DPST_BY_FLAT_RATE";
		public static final String BY_PERCENT_OF_RENT = "DPST_BY_PERCENT_OF_RENT";
		public static final String BY_NOMINAL_RENT = "DPST_BY_NOMINAL_RENT";
	}

	public static interface PqmScoringTypes {
		public static final String PQM_ECDA = "PQM_ECDA";
		public static final String PQM_STANDARD = "PQM_STANDARD";
	}

	public static interface RentalSchemeTypes {
		public static final String FIXED = "RENT_FIXED";
		public static final String GTO = "RENT_GTO";
		public static final String ALT_PROPOSAL = "altProposal";
	}

	public static interface ScorePublishingTypes {
		public static final String P = "PUB_SCORE_P";
		public static final String Q = "PUB_SCORE_Q";
		public static final String OVERALL = "PUB_SCORE_OVERALL";
	}

	public static interface ResultPublishingTypes {
		public static final String SUCCESS_ONLY = "PUB_RESULT_SUCCESS_ONLY";
		public static final String ALL = "PUB_RESULT_ALL";
	}

	public static interface RentPublishingTypes {
		public static final String ALL = "PUB_RENT_ALL";
		public static final String AWARDED = "PUB_RENT_AWARDED";
		public static final String DO_NOT_PUBLISH = "PUB_RENT_DO_NOT_PUBLISH";
	}

	public static interface TenderTypes {
		public static final String O_EBD = "TNDR_O_EBD";
		public static final String O_PRC = "TNDR_O_PRC";
		public static final String O_PQM = "TNDR_O_PQM";
		public static final String S_EBD = "TNDR_S_EBD";
		public static final String S_PRC = "TNDR_S_PRC";
		public static final String S_PQM = "TNDR_S_PQM";
		public static final Object[] OPEN_TENDER_TYPES = { TenderTypes.O_EBD, TenderTypes.O_PRC, TenderTypes.O_PQM };
		public static final Object[] EBID = { TenderTypes.O_EBD, TenderTypes.S_EBD };
	}

	public static interface WithdrawalTypes {
		public static final String PERM = "WTHD_PERM";
		public static final String TEMP = "WTHD_TEMP";

	}

	public static interface DashboardTypes {
		public static final String PENDING_ME = "mine";
		public static final String PENDING_MY_ROLE = "my-role";
		public static final String ALL = "all";
		public static final String TEC = "tec";
	}

	public static interface ReportTypes {
		public static final String RPT_TENDER_UNIT = "RPT_TENDER_UNIT";
		public static final String RPT_TENDERER = "RPT_TENDERER";
		public static final String RPT_WITHDRAWAL = "RPT_WITHDRAWAL";
		public static final String RPT_ALERT_ME = "RPT_ALERT_ME";
		public static final String RPT_PAYMENT = "RPT_PAYMENT";
		public static final String RPT_EMAIL = "RPT_EMAIL";
		public static final String RPT_SMS = "RPT_SMS";
		public static final String RPT_ACCESS = "RPT_ACCESS";
		public static final String RPT_AUDIT = "RPT_AUDIT";
		public static final String RPT_TENDERER_ALL = "RPT_TENDERER_ALL";
		public static final String RPT_TENDERER_LATEST = "RPT_TENDERER_LATEST";
	}

	public static interface AnnouncementType {
		public static final String BULLETIN = "ANNC_BULLETIN";
		public static final String TOP_BANNER = "ANNC_TOP_BANNER";
	}

	public static interface ApiConnect {
		public static final String CPS_SYSTEM_ID = "AA19";
		public static final String CPS_SYSTEM_APP_NAME = "ApiConnectHelper.java";
		public static final String COLLECTION_GW_STATUS_UP = "Up";
		public static final String COLLECTION_GW_MODE_PAYNOW = "PN";
		public static final String COLLECTION_GW_MODE_CREDIT = "CR";
		public static final String COLLECTION_GW_MODE_DEBIT = "DB";
		public static final String RDB_STATISTICS_TYPE_HOUSEHOLD_SIZE = "HOUSEHOLDSIZE";
		public static final String RDB_STATISTICS_TYPE_AGE_GROUP = "AGERANGE01";
		public static final String STARS_GEO_TYPE_POINT = "point";
		public static final String STARS_COORD_SYSTEM_XY = "WGS84";
		public static final String STARS_COORD_SYSTEM_SVY = "SVY21";
	}

	public static interface PaymentTypes {
		public static final String PAY_NOW = "PN";
		public static final String CREDIT_CARD = "CR";
		public static final String DIRECT_DEBIT = "DB";
		public static final String CREDIT_CARD_BY_ENETS = "CR_ENETS";
		public static final List<String> COLLECTION_GW = Arrays.asList(PaymentTypes.PAY_NOW, PaymentTypes.CREDIT_CARD, PaymentTypes.DIRECT_DEBIT);
		public static final String OFFLINE = "OFFLINE";
		public static final String ONLINE = "ONLINE";
		public static final String NOT_PAID = "NOT_PAID";
		public static final String NO_PAYMENT_REQUIRED = "NO_PAYMENT_REQUIRED";
	}

	public static interface TxnTypes {
		public static final String SALE = "SALE";
		public static final String AUTH_HOLD = "AUTH";
		public static final String RAUTH = "RAUTH";
		public static final String CAPT = "CAPT";
	}

	public static interface ENetsTxnStatuses {
		public static final String SUCCESSFUL = "0";
		public static final String FAILED = "1";
		public static final String TO_REDIRECT_TO_ACS_URL = "5";
		public static final String CANCELLED_BY_PAYER = "9";
	}

	public static interface SecurityReviewReportTypes {
		public static final String SECURITY = "RPT_REVIEW_SECURITY";
		public static final String WORKFLOW = "RPT_REVIEW_WORKFLOW";
	}

	@SuppressWarnings("serial")
	public static final Map<String, String> FileExtContentType = Collections.unmodifiableMap(new HashMap<String, String>() {
		{
			put("doc", "application/msword");
			put("docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
			put("xls", "application/vnd.ms-excel");
			put("xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
			put("msg", "application/vnd.ms-outlook");
		}
	});

	public static interface PublicContent {
		public static final String TOU_PRIVACY_STATEMENT = "TOU_PRIVACY_STATEMENT";
		public static final String TICKER_TAPE = "CON_TICKER_TAPES";
		public static final String CONTACT_US = "CON_CONTACT_US";
	};

	public static interface TouTypes {
		public static final String TOU_USER_AGREEMENT = "TOU_USER";
		public static final String TOU_BIDDING_TC = "TOU_BIDDING";
	};

	public static interface IemsResponseStatus {
		public static final String SUCCESS = "S";
		public static final String ERROR = "E";
	};

	public static interface IemsCodeLabels {
		public static final String CUST_INDIVIDUAL = "Individual";
		public static final String INDIVUDUAL_LOCAL = "Local";
		public static final String INDIVUDUAL_FOREIGNER = "Foreigner";
		public static final String CUST_CORPORATE = "Corporate";
		public static final String CUST_SOLE_PROPRIETORSHIP = "Sole Proprietorship";
		public static final String CUST_PARTNER = "Partner";
		public static final String CUST_OTHERS = "Others";

		/**
		 * Update and add new IEMS codes for customer type Individual = "I"; Miscellaneous = "M"; PrivateCompany = "PR"; PublicCompany = "PU"; SoleProprietorship = "SO"; Partnership = "PT";
		 * StatutoryBoard = "GV"; Non_profitOrganisation = "NP"; Trusts = "TS"; RepresentativeOffice = "RO"; LimitedLiabilityPartnership = "LP"; LimitedPartnership = "LM"; Others = "OT"; Unknown =
		 * "UN";
		 */
		public static final String CUST_TYPE_INDIVIDUAL = "I";
		public static final String CUST_TYPE_MISCELLANEOUS = "M";
		public static final String CUST_TYPE_PRIVATECOY = "PR";
		public static final String CUST_TYPE_PUBLICCOY = "PU";
		public static final String CUST_TYPE_SOLE_PROP = "SO";
		public static final String CUST_TYPE_PARTNERSHIP = "PT";
		public static final String CUST_TYPE_STATBOARD = "GV";
		public static final String CUST_TYPE_NON_PROFIT_ORGANISATION = "NP";
		public static final String CUST_TYPE_TRUSTS = "TS";
		public static final String CUST_TYPE_REP_OFFICE = "RO";
		public static final String CUST_TYPE_LIMITED_LIABILITY_PARTNERSHIP = "LP";
		public static final String CUST_TYPE_LIMITED_PARTNERSHIP = "LM";
		public static final String CUST_TYPE_OTHERS = "OT";
		public static final String CUST_TYPE_UNKNOWN = "UN";
	};

	public static interface Validation {
		public static final String AllOWED_CHAR_REGEX = "^[\\w\\s,\\.\\-_/:]*$";
		public static final String ALLOWED_CHAR_REGEX_WITH_ENTER = "^*[\\w\\s,\\.\\-_/:;#$?&!'>\\(\\)@%]*$";
		public static final String MOBILE_REGEX = "^(9|8)\\d{7}";
		public static final String TEL_REGEX = "^(9|8|6)\\d{7}";
		public static final String TEL_REGEX_OPTIONAL = "^$|^(9|8|6)\\d{7}";
		public static final String MOBILE_REGEX_OPTIONAL = "^$|^(9|8)\\d{7}";
		// public static final String EMAIL_REGEX = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$";
		// public static final String EMAIL_REGEX2 = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		public static final String EMAIL_OWASP_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		public static final String ALLOWED_NAME_REGEX = "^[\\w\\s,\\.\\-_/'@&\\(\\)#:~;%\\$!?]*$";
		public static final String ALLOWED_PINYIN_REGEX = "[a-zA-Z0-9,.?@ ]*";
		public static final String ALLOWED_ADDRESS_REGEX = "^[\\w\\s,\\.\\-_/\\'@#\\(\\)]*$";
		public static final String POSTAL_CODE_REGEX = "^\\d{6}$";
		public static final String IS_NUM_REGEX = "[\\d]+$";
		public static final String IS_ALPHANUMERIC_NOSPACE = "[0-9a-zA-Z]*"; // [:alnum:]
		public static final String ALLOWED_BANK_NAME = "^[\\w\\s,\\.\\-_/\\(\\)&]*$";
		public static final String ALLOWED_BANK_ACC_NO = "[0-9a-zA-Z//-]*";
		public static final String ALLOWED_SINGLE_WORD_NOSPACE = "[a-z_A-Z]*";
		public static final String IS_ALPHANUMERIC_NOSPACE_UNDERSCORE = "[0-9a-z_A-Z]*";
		public static final String TRADE_DESCRIPTIONS = "^[\\w\\s,\\.\\-_/\\(\\)&\\']*$";
		public static final String EMAIL_SUBJECT = "^(<p>)*[\\w\\s,\\.\\-_/\\(\\)&\\'\\:\\[\\]\\{\\}\\$?/&gt;:\\)]*(<\\/p>)*$";
		public static final String IS_ALPHANUMERIC_NOSPACE_HYPHEN = "[0-9a-zA-Z\\-]*";
		public static final String UNIT_NUMBER = "[#0-9a-zA-Z\\-]*";
		public static final String DESCRIPTIONS = "(<p>)*[\\w\\s,\\.\\-_/\\(\\)&\\']*(</p>)*$";
		public static final String ONLY_LETTERS = "^[a-zA-Z]*$";
		public static final String ONLY_ONE_LETTERS = "^[a-zA-Z]$";
		public static final String ONLY_INTEGER = "^[0-9]*$";
		public static final String ONLY_ONE_INTEGER = "^[0-9]$";
		public static final String LOGIN_ID = "[0-9a-zA-Z\\.]*";
		public static final String UPDATE_ACTION = "[UID]";
		public static final String UPPER_CASE_LETTERS_WITH_DASH = "^[A-Z-]*$";
		public static final String SMS_BODY = "^[>\\w\\s,\\.\\-_/\\(\\)&\\'\\:\\[\\]\\{\\}\\$?)]*$";
		public static final String VALID_NRIC = "^[STFGM]\\d{7}[A-Z]$";
		public static final String VALID_UEN = "^\\d{8,9}[A-Z]$";
		public static final String ONE_DECIMAL_PLACE = "^([1-9]\\d*|0)(\\.\\d)?$";
		public static final String EBID_AMOUNT = "^[0-9]*.[0]{0,2}$";
	}

	public static interface EnetsStageRespCode {
		public static final String SUCCESS = "3099-00000";
	}

	public static interface EnetsActionCode {
		public static final String NO_ACTION_REQUIRED = "0";
	}

	public static interface EnetsAmountLimit {
		public static final BigDecimal MAX_AMOUNT = BigDecimal.valueOf(20000.00).setScale(2, RoundingMode.HALF_EVEN);
		public static final BigDecimal MIN_AMOUNT = BigDecimal.valueOf(0.10).setScale(2, RoundingMode.HALF_EVEN);
	}

	public static interface CollectionGWAmountLimit {
		public static final BigDecimal MAX_AMOUNT = BigDecimal.valueOf(99999999.99).setScale(2, RoundingMode.HALF_EVEN);
		public static final BigDecimal MIN_AMOUNT = BigDecimal.valueOf(0.01).setScale(2, RoundingMode.HALF_EVEN);
	}

	public static interface HttpCode {
		public static final String HTTP_200 = "200";
		public static final String HTTP_400 = "400";
		public static final String HTTP_500 = "500";
	}

	public static interface EmailTemplateRoles {
		public static final String TECH_SUPPORT = "Technical Support";
		public static final String REFUND_OFFICER = "Refund Officer";
	}

	public static interface Ac28TxnStatus {
		public static final String TXN_SUCCESSFUL = "TXN_SUCCESSFUL";
		public static final String TXN_DUPLICATE = "TXN_DUPLICATE";
		public static final String TXN_LATE = "TXN_LATE";
		public static final String TXN_DUPLICATE_AND_LATE = "TXN_DUPLICATE_AND_LATE";
	}

	public static interface UinUen {
		public static final String ENTITY_CODE = "(LP|LL|FC|PF|RF|MQ|MM|NB|CC|CS|MB|FM|GS|GA|GB|DP|CP|NR|CM|CD|MD|HS|VH|CH|MH|CL|XL|CX|HC|RP|TU|TC|FB|FN|PA|PB|SS|MC|SM)";
		public static final String NRIC_ST = "JZIHGFEDCBA";
		public static final String NRIC_FG = "XWUTRQPNMLK";
		public static final String NRIC_M = "XWUTROPNJLK";
	}

	public static interface adfs {
		public static final String ADFS_IN_RESPONSE_TO_ERROR_MESSAGE = "The response contained an InResponseTo attribute";
	}

	public static interface EnetsHttpHeaders {
		public static final String CONTENT_TYPE = "Content-Type";
		public static final String JSON_UTF_8 = "application/json; utf-8";
		public static final String HMAC = "hmac";
		public static final String KEY_ID = "keyId";
		public static final String ACCEPT = "Accept";
		public static final String JSON = "application/json";
	}

	public static interface AlertMeFloorArea {
		public static final int SMALLEST_FLOOR_AREA = 0;
		public static final int LARGEST_FLOOR_AREA = 999999;
		public static final String NO_MIN_FLOOR_AREA = "0";
		public static final String NO_MAX_FLOOR_AREA = "999,999";
	}

	public static interface WorkFlow {
		public static final int WORKFLOW_COMMENTS_LENGTH = 4000;
	}
}