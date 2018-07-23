package com.imadcn.framework.idworker.spring.schema.handler;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

import com.imadcn.framework.idworker.spring.schema.parser.GeneratorBeanDefinitionParser;
import com.imadcn.framework.idworker.spring.schema.parser.RegistryBeanDefinitionParser;

/**
 * IdworkerNamespaceHandler
 * @author yangchao
 * @since 1.0.0
 */
public class GeneratorNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("registry", new RegistryBeanDefinitionParser());
		registerBeanDefinitionParser("generator", new GeneratorBeanDefinitionParser());
	}

}
