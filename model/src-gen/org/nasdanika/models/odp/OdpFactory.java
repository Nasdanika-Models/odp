/**
 */
package org.nasdanika.models.odp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.odp.OdpPackage
 * @generated
 */
public interface OdpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OdpFactory eINSTANCE = org.nasdanika.models.odp.impl.OdpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Presentation</em>'.
	 * @generated
	 */
	OdpPresentation createOdpPresentation();

	/**
	 * Returns a new object of class '<em>Slide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slide</em>'.
	 * @generated
	 */
	OdpSlide createOdpSlide();

	/**
	 * Returns a new object of class '<em>Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style</em>'.
	 * @generated
	 */
	Style createStyle();

	/**
	 * Returns a new object of class '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shape</em>'.
	 * @generated
	 */
	OdpShape createOdpShape();

	/**
	 * Returns a new object of class '<em>Opaque Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opaque Element</em>'.
	 * @generated
	 */
	OpaqueElement createOpaqueElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OdpPackage getOdpPackage();

} //OdpFactory
