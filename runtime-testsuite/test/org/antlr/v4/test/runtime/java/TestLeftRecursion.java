package org.antlr.v4.test.runtime.java;

import org.antlr.v4.test.runtime.BaseRuntimeTest;
import org.antlr.v4.test.runtime.RuntimeTestDescriptor;
import org.antlr.v4.test.runtime.descriptors.LeftRecursionDescriptors;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestLeftRecursion extends BaseRuntimeTest {
	public TestLeftRecursion(RuntimeTestDescriptor descriptor) {
		super(descriptor,new BaseJavaTest());
	}

	@Parameterized.Parameters(name="{0}")
	public static RuntimeTestDescriptor[] getAllTestDescriptors() {
		return BaseRuntimeTest.getRuntimeTestDescriptors(LeftRecursionDescriptors.class, "Java");
	}
}
