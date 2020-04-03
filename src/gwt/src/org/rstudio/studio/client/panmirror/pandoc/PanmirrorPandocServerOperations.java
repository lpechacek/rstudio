/*
 * PanmirrorPandocServerOperations.java
 *
 * Copyright (C) 2009-20 by RStudio, PBC
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */

package org.rstudio.studio.client.panmirror.pandoc;

import org.rstudio.studio.client.server.ServerRequestCallback;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public interface PanmirrorPandocServerOperations 
{
   void pandocMarkdownToAst(String markdown, String format, JsArrayString options, ServerRequestCallback<JavaScriptObject> callback);
   void pandocAstToMarkdown(JavaScriptObject ast, String format, JsArrayString options, ServerRequestCallback<String> callback);
   void pandocListExtensions(String format, ServerRequestCallback<String> callback);
}
