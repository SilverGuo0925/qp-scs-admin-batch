package qp.scs.model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

import qp.scs.constant.*;

@Entity
public class Status {
    @Id
	@Pattern(regexp = Codes.Validation.IS_ALPHANUMERIC_NOSPACE_UNDERSCORE, message = "Code should not contain special characters.")
	protected String code; // for user-added types, code are system-generated and follows the format of <categoryCode>_<nextSerialNoForThatCategory>

	@NotNull(message = "Label should not be empty or null")
	@Pattern(regexp = Codes.Validation.ALLOWED_CHAR_REGEX_WITH_ENTER, message = "Label should not contain special characters.")
	protected String label;

	protected Boolean isActive;

	protected Boolean isEditable;

	@Positive(message = "Ordinal should be positive.")
	protected Integer ordinal;

	protected String category;
	
}
