package com.openbanking.account.access.consents.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * OBReadConsentResponse1Data
 */
@Getter
@Setter
public class OBReadConsentResponse1Data implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Specifies the status of consent resource in code form.
	 */
	public enum StatusEnum {
		AUTHORISED("Authorised"),

		AWAITINGAUTHORISATION("AwaitingAuthorisation"),

		REJECTED("Rejected"),

		REVOKED("Revoked");

		private String value;

		StatusEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static StatusEnum fromValue(String text) {
			for (StatusEnum b : StatusEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	/**
	 * Specifies the Open Banking account access data types. This is a list of the data clusters being consented by the PSU,
	 * and requested for authorisation with the ASPSP.
	 */
	public enum PermissionsEnum {
		READACCOUNTSBASIC("ReadAccountsBasic"),

		READACCOUNTSDETAIL("ReadAccountsDetail"),

		READBALANCES("ReadBalances"),

		READBENEFICIARIESBASIC("ReadBeneficiariesBasic"),

		READBENEFICIARIESDETAIL("ReadBeneficiariesDetail"),

		READDIRECTDEBITS("ReadDirectDebits"),

		READOFFERS("ReadOffers"),

		READPAN("ReadPAN"),

		READPARTY("ReadParty"),

		READPARTYPSU("ReadPartyPSU"),

		READPRODUCTS("ReadProducts"),

		READSCHEDULEDPAYMENTSBASIC("ReadScheduledPaymentsBasic"),

		READSCHEDULEDPAYMENTSDETAIL("ReadScheduledPaymentsDetail"),

		READSTANDINGORDERSBASIC("ReadStandingOrdersBasic"),

		READSTANDINGORDERSDETAIL("ReadStandingOrdersDetail"),

		READSTATEMENTSBASIC("ReadStatementsBasic"),

		READSTATEMENTSDETAIL("ReadStatementsDetail"),

		READTRANSACTIONSBASIC("ReadTransactionsBasic"),

		READTRANSACTIONSCREDITS("ReadTransactionsCredits"),

		READTRANSACTIONSDEBITS("ReadTransactionsDebits"),

		READTRANSACTIONSDETAIL("ReadTransactionsDetail");

		private String value;

		PermissionsEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static PermissionsEnum fromValue(String text) {
			for (PermissionsEnum b : PermissionsEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

}
