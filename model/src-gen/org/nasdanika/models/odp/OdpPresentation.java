/**
 */
package org.nasdanika.models.odp;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.presentation.Presentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.odp.OdpPresentation#getStyles <em>Styles</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.odp.OdpPackage#getOdpPresentation()
 * @model
 * @generated
 */
public interface OdpPresentation extends Presentation {
	/**
	 * Returns the value of the '<em><b>Styles</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.odp.Style}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' containment reference list.
	 * @see org.nasdanika.models.odp.OdpPackage#getOdpPresentation_Styles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Style> getStyles();

} // OdpPresentation
