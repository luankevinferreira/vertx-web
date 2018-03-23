/*
 * Copyright 2014 Red Hat, Inc.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *
 *  The Eclipse Public License is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  The Apache License v2.0 is available at
 *  http://www.opensource.org/licenses/apache2.0.php
 *
 *  You may elect to redistribute this code under either of these licenses.
 */

package io.vertx.ext.web.templ;

/**
 * A template engine that uses the Thymeleaf library.
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
 * @deprecated please use {@link io.vertx.ext.web.templ.thymeleaf.ThymeleafTemplateEngine} instead.
 */
@Deprecated
public interface ThymeleafTemplateEngine extends io.vertx.ext.web.templ.thymeleaf.ThymeleafTemplateEngine {

  /**
   * Create a template engine using defaults
   *
   * @return the engine
   */
  static io.vertx.ext.web.templ.thymeleaf.ThymeleafTemplateEngine create() {
    return io.vertx.ext.web.templ.thymeleaf.ThymeleafTemplateEngine.create();
  }
}
