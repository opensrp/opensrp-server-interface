package org.opensrp.dto.form;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.opensrp.dto.utils.PojoTestUtils;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

import java.util.Date;

/**
 * Created by real on 13/07/17.
 */
public class MultimediaDTOTest {
	
	@Test
	public void testAccesors_shouldAccessProperField() {
		PojoTestUtils.validateAccessors(MultimediaDTO.class);
	}
	
	@Test
	public void testEqualsAndHashCode() {
		EqualsVerifier.forClass(MultimediaDTO.class).suppress(Warning.NONFINAL_FIELDS).verify();
	}
	
	@Test
	public void testWithFilePath_Constructor_toString() {
		MultimediaDTO multimediaDTO = new MultimediaDTO("786", "", "", "", "");
		multimediaDTO.withFilePath("desktop");
		assertEquals("desktop", multimediaDTO.getFilePath());
		assertNotSame("home", multimediaDTO.getFilePath());
		
		assertTrue(multimediaDTO.toString().contains("caseId=786"));
		assertFalse(multimediaDTO.toString().contains("providerId=222"));
	}

	@Test
	public void testWithMethods(){
		MultimediaDTO multimediaDTO = new MultimediaDTO("786", "", "", "", "");
		Date uploadDate = new Date();

		String summary = "20 rows";
		String originalFileName = "originalFileName";

		multimediaDTO.withDateUploaded(uploadDate)
				.withSummary(summary)
				.withOriginalFileName(originalFileName);


		assertEquals(multimediaDTO.getSummary(), summary);
		assertEquals(multimediaDTO.getOriginalFileName(), originalFileName);
		assertEquals(multimediaDTO.getDateUploaded(), uploadDate);
	}
}
