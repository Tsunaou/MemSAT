/******************************************************************************
 * Copyright (c) 2009 - 2015 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *****************************************************************************/
/**
 * 
 */
package test.causality;

import java.util.Set;

import org.junit.Ignore;

import com.ibm.wala.memsat.concurrent.MemoryModel;
import com.ibm.wala.memsat.concurrent.memory.simple.CausalConsistency;
import com.ibm.wala.types.MethodReference;

/**
 * Executes causality tests using the {@linkplain CausalConsistency} memory model.
 * @author etorlak
 */
@Ignore
public class CausalConsistencyCausalityTests extends CausalityTests {

	/**
	 * {@inheritDoc}
	 * @see test.ConcurrentTests#memoryModel(int, java.util.Set)
	 */
	@Override
	protected MemoryModel memoryModel(int maxSpeculations,
			Set<MethodReference> special) {
		return new CausalConsistency();
	}

}
