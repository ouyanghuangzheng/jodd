// Copyright (c) 2003-2014, Jodd Team (jodd.org). All Rights Reserved.

package jodd;

import org.junit.Test;

import static jodd.Jodd.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JoddHttpTest {

	@Test
	public void testLoadedModules() {
		assertFalse(Jodd.isModuleLoaded(BEAN));
		assertTrue(Jodd.isModuleLoaded(HTTP));
		assertFalse(Jodd.isModuleLoaded(MADVOC));
		assertFalse(Jodd.isModuleLoaded(MAIL));
		assertFalse(Jodd.isModuleLoaded(PETITE));
		assertFalse(Jodd.isModuleLoaded(PROPS));
		assertFalse(Jodd.isModuleLoaded(PROXETTA));
		assertFalse(Jodd.isModuleLoaded(SERVLET));
		assertTrue(Jodd.isModuleLoaded(UPLOAD));
		assertFalse(Jodd.isModuleLoaded(VTOR));
	}
}