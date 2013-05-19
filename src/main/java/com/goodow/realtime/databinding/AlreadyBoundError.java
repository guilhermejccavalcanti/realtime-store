/*
 * Copyright 2012 Goodow.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.goodow.realtime.databinding;

import com.goodow.realtime.util.ModelFactory;

import org.timepedia.exporter.client.Export;
import org.timepedia.exporter.client.ExportPackage;
import org.timepedia.exporter.client.Exportable;

/**
 * An error that is thrown when attempting to bind a DOM element which has already been bound to a
 * collaborative value.
 */
@ExportPackage(ModelFactory.PACKAGE_PREFIX_DATABINDING)
@Export
public class AlreadyBoundError extends Error implements Exportable {
  private final Object domElement;
  private String name;

  /**
   * @param domElement The DOM element that was already bound.
   */
  public AlreadyBoundError(Object domElement) {
    this.domElement = domElement;
  }

  /**
   * @return The DOM element that was already bound.
   */
  public Object getDomElement() {
    return domElement;
  }

  /**
   * @return The name of this error.
   */
  public String getName() {
    return name;
  }
}
