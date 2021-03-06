/**
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2019 the original author or authors.
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package me.akinmail.test.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import me.akinmail.Bip44Constants;

/**
 * Unit tests for {@link Bip44Constants}.
 * <p>
 * This is just a placeholder test for the unit tests suite.
 *
 * @author Akindele Akinyemi
 *
 */
@RunWith(JUnitPlatform.class)
public final class TestBip44Constants {

    /**
     * Default constructor.
     */
    public TestBip44Constants() {
        super();
    }

    /**
     * Tests that the {@code Greeter} returns a greeting.
     */
    @Test
    public final void testConvertSlipHexToDecimal() {
        Assertions.assertEquals(1, new Bip44Constants().convertSlipHexToDecimal("0x80000001"));
        Assertions.assertEquals(2894, new Bip44Constants().convertSlipHexToDecimal("0x80000b4e"));
        Assertions.assertEquals(99999999, new Bip44Constants().convertSlipHexToDecimal("0x85f5e0ff"));
    }

}
