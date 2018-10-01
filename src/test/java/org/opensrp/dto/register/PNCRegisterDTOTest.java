package org.opensrp.dto.register;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.opensrp.dto.utils.PojoTestUtils;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class PNCRegisterDTOTest {
	
	@Test
	public void testAccesors_shouldAccessProperField() {
		PojoTestUtils.validateAccessors(PNCRegisterDTO.class);
	}
	
	@Test
	public void testEqualsAndHashCode() {
		EqualsVerifier.forClass(PNCRegisterDTO.class).suppress(Warning.NONFINAL_FIELDS).verify();
	}
	
	@Test
	public void testToString() {
		List<PNCRegisterEntryDTO> pncRegisterEntriesList = new ArrayList<>();
		String address = "mPower";
		PNCRegisterEntryDTO pncRegisterEntryDTO = new PNCRegisterEntryDTO().withAddress(address);
		pncRegisterEntriesList.add(pncRegisterEntryDTO);
		PNCRegisterDTO pncRegisterDTO = new PNCRegisterDTO(pncRegisterEntriesList);
		
		assertTrue(pncRegisterDTO.toString().contains(address));
		assertFalse(pncRegisterDTO.toString().contains("wifeName=Sadna"));
	}
}
