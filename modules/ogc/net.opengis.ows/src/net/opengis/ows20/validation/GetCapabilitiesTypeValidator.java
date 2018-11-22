/**
 *
 * $Id$
 */
package net.opengis.ows20.validation;

import net.opengis.ows20.AcceptFormatsType;
import net.opengis.ows20.AcceptLanguagesType;
import net.opengis.ows20.AcceptVersionsType;
import net.opengis.ows20.SectionsType;

/**
 * A sample validator interface for {@link net.opengis.ows20.GetCapabilitiesType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GetCapabilitiesTypeValidator {
  boolean validate();

  boolean validateAcceptVersions(AcceptVersionsType value);
  boolean validateSections(SectionsType value);
  boolean validateAcceptFormats(AcceptFormatsType value);
  boolean validateAcceptLanguages(AcceptLanguagesType value);
  boolean validateUpdateSequence(String value);
  boolean validateBaseUrl(String value);
}