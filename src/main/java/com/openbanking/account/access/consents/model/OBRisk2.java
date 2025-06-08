package com.openbanking.account.access.consents.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk
 * scoring for Account Info.
 */

@Schema(
		description = "The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Account Info.")
@Getter
@Setter
public class OBRisk2 implements Serializable {
	private static final long serialVersionUID = 1L;

}
