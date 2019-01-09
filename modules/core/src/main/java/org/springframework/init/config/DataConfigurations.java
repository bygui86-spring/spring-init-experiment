/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.init.config;

import org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration;
import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.init.SelectedAutoConfiguration;

/**
 * @author Dave Syer
 *
 */
@SelectedAutoConfiguration(root = ConfigurationPropertiesAutoConfiguration.class, values = {
		PropertyPlaceholderAutoConfiguration.class })
@SelectedAutoConfiguration(root = JdbcTemplateAutoConfiguration.class, values = {
		DataSourceAutoConfiguration.class,
		ConfigurationPropertiesAutoConfiguration.class })
public class DataConfigurations {

}
