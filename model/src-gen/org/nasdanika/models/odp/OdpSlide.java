/**
 */
package org.nasdanika.models.odp;

import org.nasdanika.models.presentation.Slide;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slide</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  draw:page
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.odp.OdpSlide#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.nasdanika.models.odp.OdpSlide#getPageLayoutName <em>Page Layout Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.odp.OdpPackage#getOdpSlide()
 * @model
 * @generated
 */
public interface OdpSlide extends Slide {
	/**
	 * Returns the value of the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  draw:style-name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style Name</em>' attribute.
	 * @see #setStyleName(String)
	 * @see org.nasdanika.models.odp.OdpPackage#getOdpSlide_StyleName()
	 * @model unique="false"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.odp.OdpSlide#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Page Layout Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  presentation:presentation-page-layout-name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Page Layout Name</em>' attribute.
	 * @see #setPageLayoutName(String)
	 * @see org.nasdanika.models.odp.OdpPackage#getOdpSlide_PageLayoutName()
	 * @model unique="false"
	 * @generated
	 */
	String getPageLayoutName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.odp.OdpSlide#getPageLayoutName <em>Page Layout Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Layout Name</em>' attribute.
	 * @see #getPageLayoutName()
	 * @generated
	 */
	void setPageLayoutName(String value);

} // OdpSlide
