package org.sample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class FailedAll implements IAnnotationTransformer {

	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		IRetryAnalyzer r = annotation.getRetryAnalyzer();
		
		
		
		if (r==null) {
			
			annotation.setRetryAnalyzer(Failed.class);
			
		}
		
		
		
	}
}
