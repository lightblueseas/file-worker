/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.file.search;

import static org.testng.Assert.assertNotNull;
import static org.testng.AssertJUnit.assertEquals;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.testng.annotations.Test;

import de.alpharogroup.evaluate.object.EqualsHashCodeAndToStringEvaluator;

/**
 * The unit test class for the class {@link SearchFileAttributesBean}
 */
public class SearchFileAttributesBeanTest
{

	/**
	 * Test method for {@link SearchFileAttributesBean} constructors and builders
	 */
	@Test
	public final void testConstructors()
	{
		SearchFileAttributesBean model = new SearchFileAttributesBean(false,false,false,false,false);
		assertNotNull(model);
		model = SearchFileAttributesBean.builder().build();
		assertNotNull(model);
	}

	/**
	 * Test method for {@link SearchFileAttributesBean#equals(Object)} , {@link SearchFileAttributesBean#hashCode()}
	 * and {@link SearchFileAttributesBean#toString()}
	 *
	 * @throws NoSuchMethodException
	 *             if an accessor method for this property cannot be found
	 * @throws IllegalAccessException
	 *             if the caller does not have access to the property accessor method
	 * @throws InvocationTargetException
	 *             if the property accessor method throws an exception
	 * @throws InstantiationException
	 *             if a new instance of the bean's class cannot be instantiated
	 * @throws IOException
	 *             Signals that an I/O exception has occurred
	 */
	@Test
	public void testEqualsHashcodeAndToStringWithClass() throws NoSuchMethodException,
		IllegalAccessException, InvocationTargetException, InstantiationException, IOException
	{
		boolean expected;
		boolean actual;
		actual = EqualsHashCodeAndToStringEvaluator
			.evaluateEqualsHashcodeAndToString(SearchFileAttributesBean.class);
		expected = true;
		assertEquals(expected, actual);
	}

}