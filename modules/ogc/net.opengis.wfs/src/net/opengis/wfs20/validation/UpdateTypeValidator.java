/**
 *
 * $Id$
 */
package net.opengis.wfs20.validation;

import javax.xml.namespace.QName;

import net.opengis.wfs20.PropertyType;

import org.eclipse.emf.common.util.EList;

import org.opengis.filter.Filter;

/**
 * A sample validator interface for {@link net.opengis.wfs20.UpdateType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface UpdateTypeValidator {
  boolean validate();

  boolean validateProperty(EList<PropertyType> value);
  boolean validateFilter(Filter value);
  boolean validateInputFormat(String value);
  boolean validateSrsName(String value);
  boolean validateTypeName(QName value);
}