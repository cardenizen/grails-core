/* Copyright 2011 the original author or authors.
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
package org.codehaus.groovy.grails.resolve.dsl

import org.codehaus.groovy.grails.resolve.IvyDependencyManager

abstract class AbstractEvaluator {
    
    final IvyDependencyManager dependencyManager
    String currentPluginBeingConfigured
    final boolean inherited

    AbstractEvaluator(IvyDependencyManager dependencyManager, String currentPluginBeingConfigured = null, boolean inherited) {
        this.dependencyManager = dependencyManager
        this.currentPluginBeingConfigured = currentPluginBeingConfigured
        this.inherited = inherited
    }
    
}