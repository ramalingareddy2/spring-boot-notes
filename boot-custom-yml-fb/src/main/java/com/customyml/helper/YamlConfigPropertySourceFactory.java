package com.customyml.helper;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;

public class YamlConfigPropertySourceFactory implements PropertySourceFactory {
	@Override
	public PropertySource<?> createPropertySource(String name, EncodedResource resource) throws IOException {
		PropertiesPropertySource propertiesPropertySource = null;
		YamlPropertiesFactoryBean yamlPropertiesFactoryBean = null;
		Properties properties = null;

		yamlPropertiesFactoryBean = new YamlPropertiesFactoryBean();
		yamlPropertiesFactoryBean.setResources(resource.getResource());

		properties = yamlPropertiesFactoryBean.getObject();
		propertiesPropertySource = new PropertiesPropertySource(name, properties);

		return propertiesPropertySource;
	}

}
