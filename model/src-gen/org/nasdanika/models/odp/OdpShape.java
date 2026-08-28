/**
 */
package org.nasdanika.models.odp;

import org.nasdanika.models.presentation.Shape;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Shape with an ODF style reference.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.odp.OdpShape#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.nasdanika.models.odp.OdpShape#getPresentationClass <em>Presentation Class</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.odp.OdpPackage#getOdpShape()
 * @model
 * @generated
 */
public interface OdpShape extends Shape {
	/**
	 * Returns the value of the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Name</em>' attribute.
	 * @see #setStyleName(String)
	 * @see org.nasdanika.models.odp.OdpPackage#getOdpShape_StyleName()
	 * @model unique="false"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.odp.OdpShape#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Presentation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  presentation:class for placeholder frames: title | outline | subtitle | notes | ...
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Presentation Class</em>' attribute.
	 * @see #setPresentationClass(String)
	 * @see org.nasdanika.models.odp.OdpPackage#getOdpShape_PresentationClass()
	 * @model unique="false"
	 * @generated
	 */
	String getPresentationClass();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.odp.OdpShape#getPresentationClass <em>Presentation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Class</em>' attribute.
	 * @see #getPresentationClass()
	 * @generated
	 */
	void setPresentationClass(String value);

} // OdpShape
