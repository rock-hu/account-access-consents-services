package com.openbanking.account.access.consents.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serial;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Links relevant to the payload
 */

@Schema(description = "Links relevant to the payload")
@Getter
@Setter
public class Links implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;

}
